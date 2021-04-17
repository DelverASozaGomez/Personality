package edu.uca.personality.repository

import edu.uca.personality.retrofit.NetworkMapper
import edu.uca.personality.retrofit.PersonalitiesRetrofit
import edu.uca.personality.room.CacheMapper
import edu.uca.personality.room.PersonalitiesDao
import edu.uca.personality.utils.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception

class PersonalitiesRepository constructor(
    private val personalitiesDao : PersonalitiesDao,
    private val personalitiesRetrofit: PersonalitiesRetrofit,
    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
){
    suspend fun getPlaces(): Flow<DataState> = flow{
        emit(DataState.Loading)
        delay(2000)
        try {
            val placeData = personalitiesRetrofit.get()
            val placeMap = networkMapper.mapFromEntityList(placeData)
            for (tempPlace in placeMap){
                personalitiesDao.insert(cacheMapper.mapToEntity(tempPlace))
            }
            val cachePla = personalitiesDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cachePla)))
        }catch (e: Exception){
            emit(DataState.Error(e))
        }
    }
}