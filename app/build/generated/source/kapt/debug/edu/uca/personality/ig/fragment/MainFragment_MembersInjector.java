package edu.uca.personality.ig.fragment;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MainFragment_MembersInjector implements MembersInjector<MainFragment> {
  private final Provider<AdapterPersonalities> adapterPersonalitiesProvider;

  public MainFragment_MembersInjector(Provider<AdapterPersonalities> adapterPersonalitiesProvider) {
    this.adapterPersonalitiesProvider = adapterPersonalitiesProvider;
  }

  public static MembersInjector<MainFragment> create(
      Provider<AdapterPersonalities> adapterPersonalitiesProvider) {
    return new MainFragment_MembersInjector(adapterPersonalitiesProvider);
  }

  @Override
  public void injectMembers(MainFragment instance) {
    injectAdapterPersonalities(instance, adapterPersonalitiesProvider.get());
  }

  @InjectedFieldSignature("edu.uca.personality.ig.fragment.MainFragment.adapterPersonalities")
  public static void injectAdapterPersonalities(MainFragment instance,
      AdapterPersonalities adapterPersonalities) {
    instance.adapterPersonalities = adapterPersonalities;
  }
}
