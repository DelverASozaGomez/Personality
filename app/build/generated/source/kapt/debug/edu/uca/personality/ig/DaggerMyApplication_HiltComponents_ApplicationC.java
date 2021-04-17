package edu.uca.personality.ig;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.google.gson.Gson;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import edu.uca.personality.di.AdapterModule;
import edu.uca.personality.di.AdapterModule_ProvideAdapterGenresFactory;
import edu.uca.personality.di.RepositoryModule;
import edu.uca.personality.di.RepositoryModule_ProvidePlaceRepositoryFactory;
import edu.uca.personality.di.RetrofitModule;
import edu.uca.personality.di.RetrofitModule_ProvidePlaceServiceFactory;
import edu.uca.personality.di.RetrofitModule_ProvideRetrofitFactory;
import edu.uca.personality.di.RetrofitModule_ProvidesGsonBuilderFactory;
import edu.uca.personality.di.RoomModule;
import edu.uca.personality.di.RoomModule_ProvidePlaceDaoFactory;
import edu.uca.personality.di.RoomModule_ProvidePlaceDbFactory;
import edu.uca.personality.ig.fragment.MainFragment;
import edu.uca.personality.ig.fragment.MainFragmentFactory;
import edu.uca.personality.ig.fragment.MainFragment_MembersInjector;
import edu.uca.personality.ig.fragment.MainNavigationHostFragment;
import edu.uca.personality.ig.fragment.MainNavigationHostFragment_MembersInjector;
import edu.uca.personality.repository.PersonalitiesRepository;
import edu.uca.personality.retrofit.NetworkMapper;
import edu.uca.personality.retrofit.PersonalitiesRetrofit;
import edu.uca.personality.room.CacheMapper;
import edu.uca.personality.room.PersonalitiesDao;
import edu.uca.personality.room.PersonalityDatabase;
import edu.uca.personality.utils.AdapterPersonalities;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerMyApplication_HiltComponents_ApplicationC extends MyApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object personalityDatabase = new MemoizedSentinel();

  private volatile Object personalitiesDao = new MemoizedSentinel();

  private volatile Object gson = new MemoizedSentinel();

  private volatile Object retrofitBuilder = new MemoizedSentinel();

  private volatile Object personalitiesRetrofit = new MemoizedSentinel();

  private volatile Object personalitiesRepository = new MemoizedSentinel();

  private volatile Provider<PersonalitiesRepository> providePlaceRepositoryProvider;

  private volatile Object adapterPersonalities = new MemoizedSentinel();

  private DaggerMyApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private PersonalityDatabase getPersonalityDatabase() {
    Object local = personalityDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = personalityDatabase;
        if (local instanceof MemoizedSentinel) {
          local = RoomModule_ProvidePlaceDbFactory.providePlaceDb(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          personalityDatabase = DoubleCheck.reentrantCheck(personalityDatabase, local);
        }
      }
    }
    return (PersonalityDatabase) local;
  }

  private PersonalitiesDao getPersonalitiesDao() {
    Object local = personalitiesDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = personalitiesDao;
        if (local instanceof MemoizedSentinel) {
          local = RoomModule_ProvidePlaceDaoFactory.providePlaceDao(getPersonalityDatabase());
          personalitiesDao = DoubleCheck.reentrantCheck(personalitiesDao, local);
        }
      }
    }
    return (PersonalitiesDao) local;
  }

  private Gson getGson() {
    Object local = gson;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gson;
        if (local instanceof MemoizedSentinel) {
          local = RetrofitModule_ProvidesGsonBuilderFactory.providesGsonBuilder();
          gson = DoubleCheck.reentrantCheck(gson, local);
        }
      }
    }
    return (Gson) local;
  }

  private Retrofit.Builder getRetrofitBuilder() {
    Object local = retrofitBuilder;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofitBuilder;
        if (local instanceof MemoizedSentinel) {
          local = RetrofitModule_ProvideRetrofitFactory.provideRetrofit(getGson());
          retrofitBuilder = DoubleCheck.reentrantCheck(retrofitBuilder, local);
        }
      }
    }
    return (Retrofit.Builder) local;
  }

  private PersonalitiesRetrofit getPersonalitiesRetrofit() {
    Object local = personalitiesRetrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = personalitiesRetrofit;
        if (local instanceof MemoizedSentinel) {
          local = RetrofitModule_ProvidePlaceServiceFactory.providePlaceService(getRetrofitBuilder());
          personalitiesRetrofit = DoubleCheck.reentrantCheck(personalitiesRetrofit, local);
        }
      }
    }
    return (PersonalitiesRetrofit) local;
  }

  private PersonalitiesRepository getPersonalitiesRepository() {
    Object local = personalitiesRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = personalitiesRepository;
        if (local instanceof MemoizedSentinel) {
          local = RepositoryModule_ProvidePlaceRepositoryFactory.providePlaceRepository(getPersonalitiesDao(), getPersonalitiesRetrofit(), new CacheMapper(), new NetworkMapper());
          personalitiesRepository = DoubleCheck.reentrantCheck(personalitiesRepository, local);
        }
      }
    }
    return (PersonalitiesRepository) local;
  }

  private Provider<PersonalitiesRepository> getPersonalitiesRepositoryProvider() {
    Object local = providePlaceRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      providePlaceRepositoryProvider = (Provider<PersonalitiesRepository>) local;
    }
    return (Provider<PersonalitiesRepository>) local;
  }

  private AdapterPersonalities getAdapterPersonalities() {
    Object local = adapterPersonalities;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = adapterPersonalities;
        if (local instanceof MemoizedSentinel) {
          local = AdapterModule_ProvideAdapterGenresFactory.provideAdapterGenres(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          adapterPersonalities = DoubleCheck.reentrantCheck(adapterPersonalities, local);
        }
      }
    }
    return (AdapterPersonalities) local;
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  @Override
  public void injectMyApplication(MyApplication myApplication) {
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder adapterModule(AdapterModule adapterModule) {
      Preconditions.checkNotNull(adapterModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repositoryModule(RepositoryModule repositoryModule) {
      Preconditions.checkNotNull(repositoryModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder retrofitModule(RetrofitModule retrofitModule) {
      Preconditions.checkNotNull(retrofitModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder roomModule(RoomModule roomModule) {
      Preconditions.checkNotNull(roomModule);
      return this;
    }

    public MyApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMyApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MyApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MyApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MyApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MyApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MyApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MyApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return new MainViewModel_AssistedFactory(DaggerMyApplication_HiltComponents_ApplicationC.this.getPersonalitiesRepositoryProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("edu.uca.personality.ig.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      private final class FragmentCBuilder implements MyApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MyApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMyApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        @Override
        public void injectMainFragment(MainFragment mainFragment) {
          injectMainFragment2(mainFragment);
        }

        @Override
        public void injectMainNavigationHostFragment(
            MainNavigationHostFragment mainNavigationHostFragment) {
          injectMainNavigationHostFragment2(mainNavigationHostFragment);
        }

        private MainFragment injectMainFragment2(MainFragment instance) {
          MainFragment_MembersInjector.injectAdapterPersonalities(instance, DaggerMyApplication_HiltComponents_ApplicationC.this.getAdapterPersonalities());
          return instance;
        }

        private MainNavigationHostFragment injectMainNavigationHostFragment2(
            MainNavigationHostFragment instance) {
          MainNavigationHostFragment_MembersInjector.injectFragmentFactory(instance, new MainFragmentFactory());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements MyApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MyApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MyApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MyApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MyApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MyApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // edu.uca.personality.ig.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MyApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MyApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MyApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // edu.uca.personality.repository.PersonalitiesRepository 
        return (T) DaggerMyApplication_HiltComponents_ApplicationC.this.getPersonalitiesRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
