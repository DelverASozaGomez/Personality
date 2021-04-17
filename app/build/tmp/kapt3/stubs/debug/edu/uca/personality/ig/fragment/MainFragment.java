package edu.uca.personality.ig.fragment;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.hilt.android.AndroidEntryPoint;
import edu.uca.personality.R;
import edu.uca.personality.ig.MainViewModel;
import edu.uca.personality.intent.Intent;
import edu.uca.personality.utils.AdapterPersonalities;
import edu.uca.personality.utils.DataState;
import kotlinx.android.synthetic.main.fragment_first.*;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import javax.inject.Inject;

@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001a\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Ledu/uca/personality/ig/fragment/MainFragment;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "adapterPersonalities", "Ledu/uca/personality/utils/AdapterPersonalities;", "getAdapterPersonalities", "()Ledu/uca/personality/utils/AdapterPersonalities;", "setAdapterPersonalities", "(Ledu/uca/personality/utils/AdapterPersonalities;)V", "viewModel", "Ledu/uca/personality/ig/MainViewModel;", "getViewModel", "()Ledu/uca/personality/ig/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "displayError", "", "message", "displayProgressBar", "isDisplayed", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "subscribeObservers", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainFragment extends androidx.fragment.app.Fragment {
    private final java.lang.String TAG = "AppDebug";
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public edu.uca.personality.utils.AdapterPersonalities adapterPersonalities;
    private java.util.HashMap _$_findViewCache;
    
    private final edu.uca.personality.ig.MainViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final edu.uca.personality.utils.AdapterPersonalities getAdapterPersonalities() {
        return null;
    }
    
    public final void setAdapterPersonalities(@org.jetbrains.annotations.NotNull()
    edu.uca.personality.utils.AdapterPersonalities p0) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeObservers() {
    }
    
    private final void displayError(java.lang.String message) {
    }
    
    private final void displayProgressBar(boolean isDisplayed) {
    }
    
    public MainFragment() {
        super();
    }
}