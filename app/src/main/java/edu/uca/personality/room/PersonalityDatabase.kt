package edu.uca.personality.room

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [PersonalitiesCacheEntitiy::class], version = 1)
abstract class PersonalityDatabase : RoomDatabase() {
    companion object{
        val DATABASE_NAME = "PersonalityDB"
    }
    abstract fun personalityDao() : PersonalitiesDao
}