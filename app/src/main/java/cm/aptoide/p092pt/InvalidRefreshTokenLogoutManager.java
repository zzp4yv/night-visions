package cm.aptoide.p092pt;

import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.p092pt.networking.RefreshTokenInvalidator;
import p456rx.C11183b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class InvalidRefreshTokenLogoutManager {
    private AptoideAccountManager aptoideAccountManager;
    private RefreshTokenInvalidator refreshTokenInvalidator;

    public InvalidRefreshTokenLogoutManager(AptoideAccountManager aptoideAccountManager, RefreshTokenInvalidator refreshTokenInvalidator) {
        this.aptoideAccountManager = aptoideAccountManager;
        this.refreshTokenInvalidator = refreshTokenInvalidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$start$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m6827a(Void r1) {
        return this.aptoideAccountManager.logout();
    }

    public void start() {
        this.refreshTokenInvalidator.getLogoutSubject().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.k0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return InvalidRefreshTokenLogoutManager.this.m6827a((Void) obj);
            }
        }).m40056D0();
    }
}
