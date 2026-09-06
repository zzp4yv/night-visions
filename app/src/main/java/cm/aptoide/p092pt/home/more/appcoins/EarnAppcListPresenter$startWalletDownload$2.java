package cm.aptoide.p092pt.home.more.appcoins;

import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;
import p456rx.schedulers.Schedulers;

/* compiled from: EarnAppcListPresenter.kt */
@Metadata(m32266d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, m32267d2 = {"<anonymous>", "Lrx/Observable;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "it", HttpUrl.FRAGMENT_ENCODE_SET, "call"}, m32268k = 3, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
final class EarnAppcListPresenter$startWalletDownload$2<T, R> implements InterfaceC11208e {
    final /* synthetic */ C11183b $actionCompletable;
    final /* synthetic */ EarnAppcListPresenter this$0;

    EarnAppcListPresenter$startWalletDownload$2(EarnAppcListPresenter earnAppcListPresenter, C11183b c11183b) {
        this.this$0 = earnAppcListPresenter;
        this.$actionCompletable = c11183b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: call$lambda-0, reason: not valid java name */
    public static final C11186e m40909call$lambda0(EarnAppcListPresenter earnAppcListPresenter, Void r1) {
        PermissionManager permissionManager;
        PermissionService permissionService;
        C9768m.m32346f(earnAppcListPresenter, "this$0");
        permissionManager = earnAppcListPresenter.permissionManager;
        permissionService = earnAppcListPresenter.permissionService;
        return permissionManager.requestExternalStoragePermission(permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: call$lambda-1, reason: not valid java name */
    public static final C11183b m40910call$lambda1(C11183b c11183b, Void r1) {
        C9768m.m32346f(c11183b, "$actionCompletable");
        return c11183b;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    public final C11186e<? extends Void> call(Void r3) {
        PermissionManager permissionManager;
        PermissionService permissionService;
        permissionManager = this.this$0.permissionManager;
        permissionService = this.this$0.permissionService;
        C11186e<Void> requestDownloadAllowingMobileData = permissionManager.requestDownloadAllowingMobileData(permissionService);
        final EarnAppcListPresenter earnAppcListPresenter = this.this$0;
        C11186e<R> m40095j0 = requestDownloadAllowingMobileData.m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.more.appcoins.y0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m40909call$lambda0;
                m40909call$lambda0 = EarnAppcListPresenter$startWalletDownload$2.m40909call$lambda0(EarnAppcListPresenter.this, (Void) obj);
                return m40909call$lambda0;
            }
        }).m40095j0(Schedulers.m40658io());
        final C11183b c11183b = this.$actionCompletable;
        return m40095j0.m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.more.appcoins.x0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m40910call$lambda1;
                m40910call$lambda1 = EarnAppcListPresenter$startWalletDownload$2.m40910call$lambda1(C11183b.this, (Void) obj);
                return m40910call$lambda1;
            }
        });
    }
}
