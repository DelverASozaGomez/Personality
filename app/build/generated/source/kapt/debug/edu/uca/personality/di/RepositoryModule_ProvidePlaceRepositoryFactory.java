package edu.uca.personality.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import edu.uca.personality.repository.PersonalitiesRepository;
import edu.uca.personality.retrofit.NetworkMapper;
import edu.uca.personality.retrofit.PersonalitiesRetrofit;
import edu.uca.personality.room.CacheMapper;
import edu.uca.personality.room.PersonalitiesDao;
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
public final class RepositoryModule_ProvidePlaceRepositoryFactory implements Factory<PersonalitiesRepository> {
  private final Provider<PersonalitiesDao> personalitiesDaoProvider;

  private final Provider<PersonalitiesRetrofit> personalitiesRetrofitProvider;

  private final Provider<CacheMapper> cacheMapperProvider;

  private final Provider<NetworkMapper> networkMapperProvider;

  public RepositoryModule_ProvidePlaceRepositoryFactory(
      Provider<PersonalitiesDao> personalitiesDaoProvider,
      Provider<PersonalitiesRetrofit> personalitiesRetrofitProvider,
      Provider<CacheMapper> cacheMapperProvider, Provider<NetworkMapper> networkMapperProvider) {
    this.personalitiesDaoProvider = personalitiesDaoProvider;
    this.personalitiesRetrofitProvider = personalitiesRetrofitProvider;
    this.cacheMapperProvider = cacheMapperProvider;
    this.networkMapperProvider = networkMapperProvider;
  }

  @Override
  public PersonalitiesRepository get() {
    return providePlaceRepository(personalitiesDaoProvider.get(), personalitiesRetrofitProvider.get(), cacheMapperProvider.get(), networkMapperProvider.get());
  }

  public static RepositoryModule_ProvidePlaceRepositoryFactory create(
      Provider<PersonalitiesDao> personalitiesDaoProvider,
      Provider<PersonalitiesRetrofit> personalitiesRetrofitProvider,
      Provider<CacheMapper> cacheMapperProvider, Provider<NetworkMapper> networkMapperProvider) {
    return new RepositoryModule_ProvidePlaceRepositoryFactory(personalitiesDaoProvider, personalitiesRetrofitProvider, cacheMapperProvider, networkMapperProvider);
  }

  public static PersonalitiesRepository providePlaceRepository(PersonalitiesDao personalitiesDao,
      PersonalitiesRetrofit personalitiesRetrofit, CacheMapper cacheMapper,
      NetworkMapper networkMapper) {
    return Preconditions.checkNotNull(RepositoryModule.INSTANCE.providePlaceRepository(personalitiesDao, personalitiesRetrofit, cacheMapper, networkMapper), "Cannot return null from a non-@Nullable @Provides method");
  }
}
