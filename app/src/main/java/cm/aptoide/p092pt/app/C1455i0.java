package cm.aptoide.p092pt.app;

import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import p456rx.Single;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: lambda */
/* renamed from: cm.aptoide.pt.app.i0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1455i0 implements InterfaceC11208e {

    /* renamed from: f */
    public final /* synthetic */ AppViewModelManager f7607f;

    public /* synthetic */ C1455i0(AppViewModelManager appViewModelManager) {
        this.f7607f = appViewModelManager;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    public final Object call(Object obj) {
        Single lambda$loadAppModel$5;
        lambda$loadAppModel$5 = this.f7607f.lambda$loadAppModel$5((DetailedAppRequestResult) obj);
        return lambda$loadAppModel$5;
    }
}
