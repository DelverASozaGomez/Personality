package edu.uca.personality.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PersonalitiesDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(catEntitiy: PersonalitiesCacheEntitiy): Long
    @Query("select * from personalities")
    suspend fun get(): List<PersonalitiesCacheEntitiy>
}