package cm.aptoide.p092pt.home.more.appcoins;

import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.wallet.WalletAppProvider;
import cm.aptoide.p092pt.wallet.WalletInstallManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: EarnAppcListManager.kt */
@Metadata(m32266d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0011J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0011J\u0006\u0010\u0016\u001a\u00020\u000eJ\u0006\u0010\u0017\u001a\u00020\u000eJ\u0006\u0010\u0018\u001a\u00020\fR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m32267d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListManager;", HttpUrl.FRAGMENT_ENCODE_SET, "walletAppProvider", "Lcm/aptoide/pt/wallet/WalletAppProvider;", "walletInstallManager", "Lcm/aptoide/pt/wallet/WalletInstallManager;", "(Lcm/aptoide/pt/wallet/WalletAppProvider;Lcm/aptoide/pt/wallet/WalletInstallManager;)V", "cachedWalletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "allowRootInstall", HttpUrl.FRAGMENT_ENCODE_SET, "answer", HttpUrl.FRAGMENT_ENCODE_SET, "cancelWalletDownload", "Lrx/Completable;", "downloadApp", "getWalletApp", "Lrx/Observable;", "loadWalletDownloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "observeWalletApp", "onWalletInstalled", "pauseWalletDownload", "resumeWalletDownload", "shouldShowRootInstallWarningPopup", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class EarnAppcListManager {
    private WalletApp cachedWalletApp;
    private final WalletAppProvider walletAppProvider;
    private final WalletInstallManager walletInstallManager;

    public EarnAppcListManager(WalletAppProvider walletAppProvider, WalletInstallManager walletInstallManager) {
        C9768m.m32346f(walletAppProvider, "walletAppProvider");
        C9768m.m32346f(walletInstallManager, "walletInstallManager");
        this.walletAppProvider = walletAppProvider;
        this.walletInstallManager = walletInstallManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelWalletDownload$lambda-4, reason: not valid java name */
    public static final C11183b m40859cancelWalletDownload$lambda4(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        C9768m.m32346f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        C9768m.m32345e(walletApp, "app");
        return walletInstallManager.cancelDownload(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp$lambda-1, reason: not valid java name */
    public static final C11183b m40860downloadApp$lambda1(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        C9768m.m32346f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        C9768m.m32345e(walletApp, "app");
        return walletInstallManager.downloadApp(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getWalletApp$lambda-0, reason: not valid java name */
    public static final void m40861getWalletApp$lambda0(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        C9768m.m32346f(earnAppcListManager, "this$0");
        earnAppcListManager.cachedWalletApp = walletApp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletDownloadModel$lambda-2, reason: not valid java name */
    public static final C11186e m40862loadWalletDownloadModel$lambda2(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        C9768m.m32346f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        C9768m.m32345e(walletApp, "app");
        return walletInstallManager.loadDownloadModel(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pauseWalletDownload$lambda-3, reason: not valid java name */
    public static final C11183b m40863pauseWalletDownload$lambda3(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        C9768m.m32346f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        C9768m.m32345e(walletApp, "app");
        return walletInstallManager.pauseDownload(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: resumeWalletDownload$lambda-5, reason: not valid java name */
    public static final C11183b m40864resumeWalletDownload$lambda5(EarnAppcListManager earnAppcListManager, WalletApp walletApp) {
        C9768m.m32346f(earnAppcListManager, "this$0");
        WalletInstallManager walletInstallManager = earnAppcListManager.walletInstallManager;
        C9768m.m32345e(walletApp, "app");
        return walletInstallManager.resumeDownload(walletApp);
    }

    public final void allowRootInstall(boolean answer) {
        this.walletInstallManager.allowRootInstall(answer);
    }

    public final C11183b cancelWalletDownload() {
        C11183b m40083X0 = getWalletApp().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.more.appcoins.e
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m40859cancelWalletDownload$lambda4;
                m40859cancelWalletDownload$lambda4 = EarnAppcListManager.m40859cancelWalletDownload$lambda4(EarnAppcListManager.this, (WalletApp) obj);
                return m40859cancelWalletDownload$lambda4;
            }
        }).m40083X0();
        C9768m.m32345e(m40083X0, "getWalletApp()\n        .…\n        .toCompletable()");
        return m40083X0;
    }

    public final C11183b downloadApp() {
        C11183b m40083X0 = getWalletApp().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.more.appcoins.h
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m40860downloadApp$lambda1;
                m40860downloadApp$lambda1 = EarnAppcListManager.m40860downloadApp$lambda1(EarnAppcListManager.this, (WalletApp) obj);
                return m40860downloadApp$lambda1;
            }
        }).m40083X0();
        C9768m.m32345e(m40083X0, "getWalletApp()\n        .…\n        .toCompletable()");
        return m40083X0;
    }

    public final C11186e<WalletApp> getWalletApp() {
        WalletApp walletApp = this.cachedWalletApp;
        if (walletApp != null) {
            C11186e<WalletApp> m40025S = C11186e.m40025S(walletApp);
            C9768m.m32345e(m40025S, "just(cachedWalletApp)");
            return m40025S;
        }
        C11186e<WalletApp> m40119x = this.walletAppProvider.getWalletApp().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.home.more.appcoins.g
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                EarnAppcListManager.m40861getWalletApp$lambda0(EarnAppcListManager.this, (WalletApp) obj);
            }
        });
        C9768m.m32345e(m40119x, "walletAppProvider.getWal…edWalletApp = walletApp }");
        return m40119x;
    }

    public final C11186e<DownloadModel> loadWalletDownloadModel() {
        C11186e m40060G = getWalletApp().m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.more.appcoins.f
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m40862loadWalletDownloadModel$lambda2;
                m40862loadWalletDownloadModel$lambda2 = EarnAppcListManager.m40862loadWalletDownloadModel$lambda2(EarnAppcListManager.this, (WalletApp) obj);
                return m40862loadWalletDownloadModel$lambda2;
            }
        });
        C9768m.m32345e(m40060G, "getWalletApp()\n        .….loadDownloadModel(app) }");
        return m40060G;
    }

    public final C11186e<WalletApp> observeWalletApp() {
        return this.walletAppProvider.getWalletApp();
    }

    public final C11186e<Boolean> onWalletInstalled() {
        return this.walletInstallManager.onWalletInstalled();
    }

    public final C11183b pauseWalletDownload() {
        C11183b m40083X0 = getWalletApp().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.more.appcoins.d
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m40863pauseWalletDownload$lambda3;
                m40863pauseWalletDownload$lambda3 = EarnAppcListManager.m40863pauseWalletDownload$lambda3(EarnAppcListManager.this, (WalletApp) obj);
                return m40863pauseWalletDownload$lambda3;
            }
        }).m40083X0();
        C9768m.m32345e(m40083X0, "getWalletApp()\n        .…\n        .toCompletable()");
        return m40083X0;
    }

    public final C11183b resumeWalletDownload() {
        C11183b m40083X0 = getWalletApp().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.more.appcoins.i
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m40864resumeWalletDownload$lambda5;
                m40864resumeWalletDownload$lambda5 = EarnAppcListManager.m40864resumeWalletDownload$lambda5(EarnAppcListManager.this, (WalletApp) obj);
                return m40864resumeWalletDownload$lambda5;
            }
        }).m40083X0();
        C9768m.m32345e(m40083X0, "getWalletApp()\n        .…\n        .toCompletable()");
        return m40083X0;
    }

    public final boolean shouldShowRootInstallWarningPopup() {
        return this.walletInstallManager.shouldShowRootInstallWarningPopup();
    }
}
