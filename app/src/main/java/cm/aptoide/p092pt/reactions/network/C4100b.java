package cm.aptoide.p092pt.reactions.network;

import p456rx.p460m.InterfaceC11208e;

/* compiled from: lambda */
/* renamed from: cm.aptoide.pt.reactions.network.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C4100b implements InterfaceC11208e {

    /* renamed from: f */
    public final /* synthetic */ ReactionsRemoteService f10950f;

    public /* synthetic */ C4100b(ReactionsRemoteService reactionsRemoteService) {
        this.f10950f = reactionsRemoteService;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    public final Object call(Object obj) {
        ReactionsResponse mapErrorResponse;
        mapErrorResponse = this.f10950f.mapErrorResponse((Throwable) obj);
        return mapErrorResponse;
    }
}
