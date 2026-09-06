package cm.aptoide.p092pt.actions;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;

/* loaded from: classes.dex */
public class HasDownloadAccessOnSubscribe implements C11186e.a<Boolean> {
    private final PermissionService permissionService;

    public HasDownloadAccessOnSubscribe(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    static /* synthetic */ void lambda$call$0(AbstractC11197j abstractC11197j) {
        if (abstractC11197j.isUnsubscribed()) {
            return;
        }
        abstractC11197j.onNext(Boolean.TRUE);
        abstractC11197j.onCompleted();
    }

    static /* synthetic */ void lambda$call$1(AbstractC11197j abstractC11197j) {
        if (abstractC11197j.isUnsubscribed()) {
            return;
        }
        abstractC11197j.onNext(Boolean.FALSE);
        abstractC11197j.onCompleted();
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(final AbstractC11197j<? super Boolean> abstractC11197j) {
        this.permissionService.hasDownloadAccess(new InterfaceC11204a() { // from class: cm.aptoide.pt.actions.b
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                HasDownloadAccessOnSubscribe.lambda$call$0(AbstractC11197j.this);
            }
        }, new InterfaceC11204a() { // from class: cm.aptoide.pt.actions.a
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                HasDownloadAccessOnSubscribe.lambda$call$1(AbstractC11197j.this);
            }
        });
    }
}
