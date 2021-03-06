package edu.uca.personality.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import edu.uca.personality.room.PersonalitiesDao
import edu.uca.personality.room.PersonalityDatabase
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun providePlaceDb(@ApplicationContext context: Context): PersonalityDatabase{
        return Room.databaseBuilder(context, PersonalityDatabase::class.java, PersonalityDatabase.DATABASE_NAME).fallbackToDestructiveMigration().build()
    }

    @Singleton
    @Provides
    fun providePlaceDao(personalityDatabase: PersonalityDatabase): PersonalitiesDao {
        return personalityDatabase.personalityDao()
    }
}