package edu.uca.personality.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@androidx.room.Database(entities = {edu.uca.personality.room.PersonalitiesCacheEntitiy.class}, version = 1)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Ledu/uca/personality/room/PersonalityDatabase;", "Landroidx/room/RoomDatabase;", "()V", "personalityDao", "Ledu/uca/personality/room/PersonalitiesDao;", "Companion", "app_debug"})
public abstract class PersonalityDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "PersonalityDB";
    public static final edu.uca.personality.room.PersonalityDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract edu.uca.personality.room.PersonalitiesDao personalityDao();
    
    public PersonalityDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Ledu/uca/personality/room/PersonalityDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "getDATABASE_NAME", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATABASE_NAME() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}