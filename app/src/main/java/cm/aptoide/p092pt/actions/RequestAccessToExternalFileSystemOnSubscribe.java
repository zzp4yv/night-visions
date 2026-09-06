package cm.aptoide.p092pt.actions;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;

/* loaded from: classes.dex */
public class RequestAccessToExternalFileSystemOnSubscribe implements C11186e.a<Void> {
    private final PermissionService permissionService;

    public RequestAccessToExternalFileSystemOnSubscribe(PermissionService permissionService) {
        this.permissionService = permissionService;
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
        this.permissionService.requestAccessToExternalFileSystem(new InterfaceC11204a() { // from class: cm.aptoide.pt.actions.c
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RequestAccessToExternalFileSystemOnSubscribe.lambda$call$0(AbstractC11197j.this);
            }
        }, new InterfaceC11204a() { // from class: cm.aptoide.pt.actions.d
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                AbstractC11197j.this.onError(new SecurityException("Permission denied to access to external storage."));
            }
        });
    }
}
