package cm.aptoide.p092pt.home.bundles;

import p456rx.p460m.InterfaceC11208e;

/* compiled from: lambda */
/* renamed from: cm.aptoide.pt.home.bundles.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C2982d implements InterfaceC11208e {

    /* renamed from: f */
    public final /* synthetic */ BundlesRepository f9550f;

    public /* synthetic */ C2982d(BundlesRepository bundlesRepository) {
        this.f9550f = bundlesRepository;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    public final Object call(Object obj) {
        HomeBundlesModel cloneList;
        cloneList = this.f9550f.cloneList((HomeBundlesModel) obj);
        return cloneList;
    }
}
