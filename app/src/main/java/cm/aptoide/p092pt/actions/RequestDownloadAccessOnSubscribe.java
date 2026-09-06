package cm.aptoide.p092pt.actions;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;

/* loaded from: classes.dex */
public class RequestDownloadAccessOnSubscribe implements C11186e.a<Void> {
    private final boolean allowDownloadOnMobileData;
    private final boolean canBypassWifi;
    private final PermissionService permissionRequest;
    private final long size;

    public RequestDownloadAccessOnSubscribe(PermissionService permissionService, boolean z, boolean z2, long j2) {
        this.permissionRequest = permissionService;
        this.allowDownloadOnMobileData = z;
        this.canBypassWifi = z2;
        this.size = j2;
    }

    static /* synthetic */ void lambda$call$0(AbstractC11197j abstractC11197j) {
        if (abstractC11197j.isUnsubscribed()) {
            return;
        }
        abstractC11197j.onNext(null);
        abstractC11197j.onCompleted();
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(final AbstractC11197j<? super Void> abstractC11197j) {
        this.permissionRequest.requestDownloadAccess(new InterfaceC11204a() { // from class: cm.aptoide.pt.actions.f
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RequestDownloadAccessOnSubscribe.lambda$call$0(AbstractC11197j.this);
            }
        }, new InterfaceC11204a() { // from class: cm.aptoide.pt.actions.e
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                AbstractC11197j.this.onError(new SecurityException("Permission denied to download file"));
            }
        }, this.allowDownloadOnMobileData, this.canBypassWifi, this.size);
    }
}
