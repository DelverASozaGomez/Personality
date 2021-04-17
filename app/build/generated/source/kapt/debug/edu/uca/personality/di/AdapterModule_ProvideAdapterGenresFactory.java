package edu.uca.personality.di;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import edu.uca.personality.utils.AdapterPersonalities;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AdapterModule_ProvideAdapterGenresFactory implements Factory<AdapterPersonalities> {
  private final Provider<Application> applicationProvider;

  public AdapterModule_ProvideAdapterGenresFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AdapterPersonalities get() {
    return provideAdapterGenres(applicationProvider.get());
  }

  public static AdapterModule_ProvideAdapterGenresFactory create(
      Provider<Application> applicationProvider) {
    return new AdapterModule_ProvideAdapterGenresFactory(applicationProvider);
  }

  public static AdapterPersonalities provideAdapterGenres(Application application) {
    return Preconditions.checkNotNull(AdapterModule.INSTANCE.provideAdapterGenres(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
