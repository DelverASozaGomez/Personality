package edu.uca.personality.di;

import edu.uca.personality.repository.PersonalitiesRepository;
import edu.uca.personality.retrofit.NetworkMapper;
import edu.uca.personality.retrofit.PersonalitiesRetrofit;
import edu.uca.personality.room.CacheMapper;
import edu.uca.personality.room.PersonalitiesDao;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Ledu/uca/personality/di/RepositoryModule;", "", "()V", "providePlaceRepository", "Ledu/uca/personality/repository/PersonalitiesRepository;", "personalitiesDao", "Ledu/uca/personality/room/PersonalitiesDao;", "personalitiesRetrofit", "Ledu/uca/personality/retrofit/PersonalitiesRetrofit;", "cacheMapper", "Ledu/uca/personality/room/CacheMapper;", "networkMapper", "Ledu/uca/personality/retrofit/NetworkMapper;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    public static final edu.uca.personality.di.RepositoryModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final edu.uca.personality.repository.PersonalitiesRepository providePlaceRepository(@org.jetbrains.annotations.NotNull()
    edu.uca.personality.room.PersonalitiesDao personalitiesDao, @org.jetbrains.annotations.NotNull()
    edu.uca.personality.retrofit.PersonalitiesRetrofit personalitiesRetrofit, @org.jetbrains.annotations.NotNull()
    edu.uca.personality.room.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    edu.uca.personality.retrofit.NetworkMapper networkMapper) {
        return null;
    }
    
    private RepositoryModule() {
        super();
    }
}