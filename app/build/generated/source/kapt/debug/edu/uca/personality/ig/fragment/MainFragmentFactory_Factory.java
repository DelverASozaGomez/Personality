package edu.uca.personality.ig.fragment;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainFragmentFactory_Factory implements Factory<MainFragmentFactory> {
  @Override
  public MainFragmentFactory get() {
    return newInstance();
  }

  public static MainFragmentFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static MainFragmentFactory newInstance() {
    return new MainFragmentFactory();
  }

  private static final class InstanceHolder {
    private static final MainFragmentFactory_Factory INSTANCE = new MainFragmentFactory_Factory();
  }
}
