package edu.uca.personality.ig.fragment;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MainNavigationHostFragment_MembersInjector implements MembersInjector<MainNavigationHostFragment> {
  private final Provider<MainFragmentFactory> fragmentFactoryProvider;

  public MainNavigationHostFragment_MembersInjector(
      Provider<MainFragmentFactory> fragmentFactoryProvider) {
    this.fragmentFactoryProvider = fragmentFactoryProvider;
  }

  public static MembersInjector<MainNavigationHostFragment> create(
      Provider<MainFragmentFactory> fragmentFactoryProvider) {
    return new MainNavigationHostFragment_MembersInjector(fragmentFactoryProvider);
  }

  @Override
  public void injectMembers(MainNavigationHostFragment instance) {
    injectFragmentFactory(instance, fragmentFactoryProvider.get());
  }

  @InjectedFieldSignature("edu.uca.personality.ig.fragment.MainNavigationHostFragment.fragmentFactory")
  public static void injectFragmentFactory(MainNavigationHostFragment instance,
      MainFragmentFactory fragmentFactory) {
    instance.fragmentFactory = fragmentFactory;
  }
}
