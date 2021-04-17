package edu.uca.personality.intent;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Ledu/uca/personality/intent/Intent;", "", "()V", "GetPlaceEvent", "None", "Ledu/uca/personality/intent/Intent$GetPlaceEvent;", "Ledu/uca/personality/intent/Intent$None;", "app_debug"})
public abstract class Intent {
    
    private Intent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/uca/personality/intent/Intent$GetPlaceEvent;", "Ledu/uca/personality/intent/Intent;", "()V", "app_debug"})
    public static final class GetPlaceEvent extends edu.uca.personality.intent.Intent {
        public static final edu.uca.personality.intent.Intent.GetPlaceEvent INSTANCE = null;
        
        private GetPlaceEvent() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Ledu/uca/personality/intent/Intent$None;", "Ledu/uca/personality/intent/Intent;", "()V", "app_debug"})
    public static final class None extends edu.uca.personality.intent.Intent {
        public static final edu.uca.personality.intent.Intent.None INSTANCE = null;
        
        private None() {
            super();
        }
    }
}