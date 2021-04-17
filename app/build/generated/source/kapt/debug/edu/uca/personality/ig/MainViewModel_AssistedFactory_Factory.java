package edu.uca.personality.ig;

import dagger.internal.Factory;
import edu.uca.personality.repository.PersonalitiesRepository;
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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<PersonalitiesRepository> personalitiesRepositoryProvider;

  public MainViewModel_AssistedFactory_Factory(
      Provider<PersonalitiesRepository> personalitiesRepositoryProvider) {
    this.personalitiesRepositoryProvider = personalitiesRepositoryProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(personalitiesRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<PersonalitiesRepository> personalitiesRepositoryProvider) {
    return new MainViewModel_AssistedFactory_Factory(personalitiesRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(
      Provider<PersonalitiesRepository> personalitiesRepository) {
    return new MainViewModel_AssistedFactory(personalitiesRepository);
  }
}
