package edu.uca.personality.di;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RetrofitModule_ProvidesGsonBuilderFactory implements Factory<Gson> {
  @Override
  public Gson get() {
    return providesGsonBuilder();
  }

  public static RetrofitModule_ProvidesGsonBuilderFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Gson providesGsonBuilder() {
    return Preconditions.checkNotNull(RetrofitModule.INSTANCE.providesGsonBuilder(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final RetrofitModule_ProvidesGsonBuilderFactory INSTANCE = new RetrofitModule_ProvidesGsonBuilderFactory();
  }
}
