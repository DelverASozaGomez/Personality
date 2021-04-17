package edu.uca.personality.di

import android.app.Application
import edu.uca.personality.utils.AdapterPersonalities
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AdapterModule {

    @Singleton
    @Provides
    fun provideAdapterGenres(application: Application): AdapterPersonalities{
        return AdapterPersonalities()
    }
}