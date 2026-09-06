package cm.aptoide.p092pt.store.view;

import androidx.fragment.app.Fragment;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStore;
import cm.aptoide.p092pt.view.recycler.displayable.Displayable;
import java.util.List;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class GetStoreFragment extends StoreTabWidgetsGridRecyclerFragment {
    private C11186e<GetStore> getStoreObservable(boolean z, String str, boolean z2) {
        return this.name == Event.Name.getUser ? this.requestFactoryCdnPool.newGetUser(str).observe(z, z2) : this.requestFactoryCdnPool.newStore(str).observe(z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$buildDisplayables$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8788g(GetStore getStore) {
        return parseDisplayables(getStore.getNodes().getWidgets());
    }

    public static Fragment newInstance() {
        return new GetStoreFragment();
    }

    @Override // cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment
    protected C11186e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2) {
        return getStoreObservable(z, str, z2).m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.store.view.c0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return GetStoreFragment.this.m8788g((GetStore) obj);
            }
        });
    }
}
