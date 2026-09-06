package cm.aptoide.p092pt.reactions.network;

import p456rx.p460m.InterfaceC11208e;
import retrofit2.Response;

/* compiled from: lambda */
/* renamed from: cm.aptoide.pt.reactions.network.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C4099a implements InterfaceC11208e {

    /* renamed from: f */
    public final /* synthetic */ ReactionsRemoteService f10949f;

    public /* synthetic */ C4099a(ReactionsRemoteService reactionsRemoteService) {
        this.f10949f = reactionsRemoteService;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    public final Object call(Object obj) {
        ReactionsResponse mapResponse;
        mapResponse = this.f10949f.mapResponse((Response) obj);
        return mapResponse;
    }
}
