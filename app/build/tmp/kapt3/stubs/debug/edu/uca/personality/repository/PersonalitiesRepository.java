package edu.uca.personality.repository;

import edu.uca.personality.retrofit.NetworkMapper;
import edu.uca.personality.retrofit.PersonalitiesRetrofit;
import edu.uca.personality.room.CacheMapper;
import edu.uca.personality.room.PersonalitiesDao;
import edu.uca.personality.utils.DataState;
import kotlinx.coroutines.flow.Flow;
import java.lang.Exception;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Ledu/uca/personality/repository/PersonalitiesRepository;", "", "personalitiesDao", "Ledu/uca/personality/room/PersonalitiesDao;", "personalitiesRetrofit", "Ledu/uca/personality/retrofit/PersonalitiesRetrofit;", "cacheMapper", "Ledu/uca/personality/room/CacheMapper;", "networkMapper", "Ledu/uca/personality/retrofit/NetworkMapper;", "(Ledu/uca/personality/room/PersonalitiesDao;Ledu/uca/personality/retrofit/PersonalitiesRetrofit;Ledu/uca/personality/room/CacheMapper;Ledu/uca/personality/retrofit/NetworkMapper;)V", "getPlaces", "Lkotlinx/coroutines/flow/Flow;", "Ledu/uca/personality/utils/DataState;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PersonalitiesRepository {
    private final edu.uca.personality.room.PersonalitiesDao personalitiesDao = null;
    private final edu.uca.personality.retrofit.PersonalitiesRetrofit personalitiesRetrofit = null;
    private final edu.uca.personality.room.CacheMapper cacheMapper = null;
    private final edu.uca.personality.retrofit.NetworkMapper networkMapper = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPlaces(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends edu.uca.personality.utils.DataState>> p0) {
        return null;
    }
    
    public PersonalitiesRepository(@org.jetbrains.annotations.NotNull()
    edu.uca.personality.room.PersonalitiesDao personalitiesDao, @org.jetbrains.annotations.NotNull()
    edu.uca.personality.retrofit.PersonalitiesRetrofit personalitiesRetrofit, @org.jetbrains.annotations.NotNull()
    edu.uca.personality.room.CacheMapper cacheMapper, @org.jetbrains.annotations.NotNull()
    edu.uca.personality.retrofit.NetworkMapper networkMapper) {
        super();
    }
}