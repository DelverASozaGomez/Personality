package edu.uca.personality.ig;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import edu.uca.personality.repository.PersonalitiesRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<PersonalitiesRepository> personalitiesRepository;

  @Inject
  MainViewModel_AssistedFactory(Provider<PersonalitiesRepository> personalitiesRepository) {
    this.personalitiesRepository = personalitiesRepository;
  }

  @Override
  @NonNull
  public MainViewModel create(@NonNull SavedStateHandle arg0) {
    return new MainViewModel(personalitiesRepository.get(), arg0);
  }
}
