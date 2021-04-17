package edu.uca.personality.di;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class RoomModule_ProvidePlaceDbFactory implements Factory<PersonalityDatabase> {
  private final Provider<Context> contextProvider;

  public RoomModule_ProvidePlaceDbFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public PersonalityDatabase get() {
    return providePlaceDb(contextProvider.get());
  }

  public static RoomModule_ProvidePlaceDbFactory create(Provider<Context> contextProvider) {
    return new RoomModule_ProvidePlaceDbFactory(contextProvider);
  }

  public static PersonalityDatabase providePlaceDb(Context context) {
    return Preconditions.checkNotNull(RoomModule.INSTANCE.providePlaceDb(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
