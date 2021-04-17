package edu.uca.personality.di

import edu.uca.personality.repository.PersonalitiesRepository
import edu.uca.personality.retrofit.NetworkMapper
import edu.uca.personality.retrofit.PersonalitiesRetrofit
import edu.uca.personality.room.CacheMapper
import edu.uca.personality.room.PersonalitiesDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent :: class)
object RepositoryModule {

    @Singleton
    @Provides
    fun providePlaceRepository(
        personalitiesDao: PersonalitiesDao,
        personalitiesRetrofit: PersonalitiesRetrofit,
        cacheMapper: CacheMapper,
        networkMapper: NetworkMapper


    ): PersonalitiesRepository {
        return PersonalitiesRepository(personalitiesDao, personalitiesRetrofit, cacheMapper, networkMapper)
    }
}