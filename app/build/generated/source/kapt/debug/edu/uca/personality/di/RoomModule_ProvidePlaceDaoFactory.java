package edu.uca.personality.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import edu.uca.personality.room.PersonalitiesDao;
import edu.uca.personality.room.PersonalityDatabase;
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
public final class RoomModule_ProvidePlaceDaoFactory implements Factory<PersonalitiesDao> {
  private final Provider<PersonalityDatabase> personalityDatabaseProvider;

  public RoomModule_ProvidePlaceDaoFactory(
      Provider<PersonalityDatabase> personalityDatabaseProvider) {
    this.personalityDatabaseProvider = personalityDatabaseProvider;
  }

  @Override
  public PersonalitiesDao get() {
    return providePlaceDao(personalityDatabaseProvider.get());
  }

  public static RoomModule_ProvidePlaceDaoFactory create(
      Provider<PersonalityDatabase> personalityDatabaseProvider) {
    return new RoomModule_ProvidePlaceDaoFactory(personalityDatabaseProvider);
  }

  public static PersonalitiesDao providePlaceDao(PersonalityDatabase personalityDatabase) {
    return Preconditions.checkNotNull(RoomModule.INSTANCE.providePlaceDao(personalityDatabase), "Cannot return null from a non-@Nullable @Provides method");
  }
}
