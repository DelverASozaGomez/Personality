package edu.uca.personality.di;

import android.app.Application;
import edu.uca.personality.utils.AdapterPersonalities;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Ledu/uca/personality/di/AdapterModule;", "", "()V", "provideAdapterGenres", "Ledu/uca/personality/utils/AdapterPersonalities;", "application", "Landroid/app/Application;", "app_debug"})
@dagger.Module()
public final class AdapterModule {
    public static final edu.uca.personality.di.AdapterModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final edu.uca.personality.utils.AdapterPersonalities provideAdapterGenres(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    private AdapterModule() {
        super();
    }
}