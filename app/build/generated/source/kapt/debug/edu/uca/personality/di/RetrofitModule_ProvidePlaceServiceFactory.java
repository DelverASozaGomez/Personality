package edu.uca.personality.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import edu.uca.personality.retrofit.PersonalitiesRetrofit;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvidePlaceServiceFactory implements Factory<PersonalitiesRetrofit> {
  private final Provider<Retrofit.Builder> retrofitProvider;

  public RetrofitModule_ProvidePlaceServiceFactory(Provider<Retrofit.Builder> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public PersonalitiesRetrofit get() {
    return providePlaceService(retrofitProvider.get());
  }

  public static RetrofitModule_ProvidePlaceServiceFactory create(
      Provider<Retrofit.Builder> retrofitProvider) {
    return new RetrofitModule_ProvidePlaceServiceFactory(retrofitProvider);
  }

  public static PersonalitiesRetrofit providePlaceService(Retrofit.Builder retrofit) {
    return Preconditions.checkNotNull(RetrofitModule.INSTANCE.providePlaceService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
