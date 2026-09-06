package cm.aptoide.p092pt.store.view.recommended;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.ListStores;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2213V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.store.view.GetStoreEndlessFragment;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import com.trello.rxlifecycle.p234g.EnumC8729b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class RecommendedStoresFragment extends GetStoreEndlessFragment<ListStores> {
    private AptoideAccountManager accountManager;

    @Inject
    StoreCredentialsProvider storeCredentialsProvider;

    @Inject
    RoomStoreRepository storeRepository;

    @Inject
    StoreUtilsProxy storeUtilsProxy;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$buildAction$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ RecommendedStoreDisplayable m8853h(Store store) {
        return new RecommendedStoreDisplayable(store, this.storeRepository, this.accountManager, this.storeUtilsProxy, this.storeCredentialsProvider, "Recommended Stores More");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$buildAction$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8854i(List list) {
        addDisplayables((List<? extends Displayable>) new ArrayList(list), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$buildAction$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8855j(ListStores listStores) {
        C11186e.m40025S(listStores).m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.store.view.recommended.j
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Iterable list;
                list = ((ListStores) obj).getDataList().getList();
                return list;
            }
        }).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.store.view.recommended.i
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RecommendedStoresFragment.this.m8853h((Store) obj);
            }
        }).m40084Y0().m40091f(bindUntilEvent(EnumC8729b.DESTROY_VIEW)).m40061G0(new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.recommended.h
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                RecommendedStoresFragment.this.m8854i((List) obj);
            }
        });
    }

    public static Fragment newInstance() {
        return new RecommendedStoresFragment();
    }

    @Override // cm.aptoide.p092pt.store.view.GetStoreEndlessFragment
    protected InterfaceC11205b<ListStores> buildAction() {
        return new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.recommended.k
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                RecommendedStoresFragment.this.m8855j((ListStores) obj);
            }
        };
    }

    @Override // cm.aptoide.p092pt.store.view.GetStoreEndlessFragment
    protected AbstractC2213V7<ListStores, ? extends Endless> buildRequest(boolean z, String str) {
        return this.requestFactoryCdnPool.newGetRecommendedStores(str);
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabWidgetsGridRecyclerFragment, cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment, cm.aptoide.p092pt.view.fragment.AptoideBaseFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
    }
}
