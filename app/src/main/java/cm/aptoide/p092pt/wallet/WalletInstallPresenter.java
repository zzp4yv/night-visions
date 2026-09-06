package cm.aptoide.p092pt.wallet;

import android.os.Build;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.promotions.WalletApp;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;
import p456rx.AbstractC11195h;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;
import p456rx.p460m.InterfaceCallableC11207d;
import p456rx.schedulers.Schedulers;

/* compiled from: WalletInstallPresenter.kt */
@Metadata(m32266d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014¢\u0006\u0002\u0010\u0015J\b\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020*H\u0002J\b\u0010,\u001a\u00020*H\u0002J\u000e\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J\b\u00101\u001a\u00020/H\u0002J\b\u00102\u001a\u00020*H\u0002J\u0016\u00103\u001a\b\u0012\u0004\u0012\u0002040.2\u0006\u00105\u001a\u000204H\u0002J\b\u00106\u001a\u00020*H\u0016J\u001e\u00107\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u000109\u0012\u0004\u0012\u00020408\u0018\u00010.H\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u00105\u001a\u000204H\u0002J\u001e\u0010<\u001a\b\u0012\u0004\u0012\u00020=0.2\u0006\u0010>\u001a\u00020=2\u0006\u00105\u001a\u000204H\u0002R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006?"}, m32267d2 = {"Lcm/aptoide/pt/wallet/WalletInstallPresenter;", "Lcm/aptoide/pt/presenter/Presenter;", "view", "Lcm/aptoide/pt/wallet/WalletInstallView;", "walletInstallManager", "Lcm/aptoide/pt/wallet/WalletInstallManager;", "navigator", "Lcm/aptoide/pt/wallet/WalletInstallNavigator;", "permissionManager", "Lcm/aptoide/pt/actions/PermissionManager;", "permissionService", "Lcm/aptoide/pt/actions/PermissionService;", "viewScheduler", "Lrx/Scheduler;", "io", "configuration", "Lcm/aptoide/pt/wallet/WalletInstallConfiguration;", "walletInstallAnalytics", "Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "moPubAdsManager", "Lcm/aptoide/pt/ads/MoPubAdsManager;", "(Lcm/aptoide/pt/wallet/WalletInstallView;Lcm/aptoide/pt/wallet/WalletInstallManager;Lcm/aptoide/pt/wallet/WalletInstallNavigator;Lcm/aptoide/pt/actions/PermissionManager;Lcm/aptoide/pt/actions/PermissionService;Lrx/Scheduler;Lrx/Scheduler;Lcm/aptoide/pt/wallet/WalletInstallConfiguration;Lcm/aptoide/pt/wallet/WalletInstallAnalytics;Lcm/aptoide/pt/ads/MoPubAdsManager;)V", "getConfiguration", "()Lcm/aptoide/pt/wallet/WalletInstallConfiguration;", "getIo", "()Lrx/Scheduler;", "getMoPubAdsManager", "()Lcm/aptoide/pt/ads/MoPubAdsManager;", "getNavigator", "()Lcm/aptoide/pt/wallet/WalletInstallNavigator;", "getPermissionManager", "()Lcm/aptoide/pt/actions/PermissionManager;", "getPermissionService", "()Lcm/aptoide/pt/actions/PermissionService;", "getView", "()Lcm/aptoide/pt/wallet/WalletInstallView;", "getViewScheduler", "getWalletInstallAnalytics", "()Lcm/aptoide/pt/wallet/WalletInstallAnalytics;", "getWalletInstallManager", "()Lcm/aptoide/pt/wallet/WalletInstallManager;", "handleAnalyticsContextSetup", HttpUrl.FRAGMENT_ENCODE_SET, "handleCancelDownloadButton", "handleCloseButtonClick", "handleInstallDialogCancelButtonPress", "Lrx/Observable;", HttpUrl.FRAGMENT_ENCODE_SET, "handleWalletInstallation", "hasMinimumSdk", "loadWalletInstall", "observeDownloadProgress", "Lcm/aptoide/pt/promotions/WalletApp;", "walletApp", "present", "showWalletInitialState", "Lkotlin/Pair;", HttpUrl.FRAGMENT_ENCODE_SET, "startWalletDownload", "Lrx/Completable;", "verifyNotEnoughSpaceError", "Lcm/aptoide/pt/app/DownloadModel;", "downloadModel", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class WalletInstallPresenter implements Presenter {
    private final WalletInstallConfiguration configuration;

    /* renamed from: io */
    private final AbstractC11195h f12109io;
    private final MoPubAdsManager moPubAdsManager;
    private final WalletInstallNavigator navigator;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private final WalletInstallView view;
    private final AbstractC11195h viewScheduler;
    private final WalletInstallAnalytics walletInstallAnalytics;
    private final WalletInstallManager walletInstallManager;

    public WalletInstallPresenter(WalletInstallView walletInstallView, WalletInstallManager walletInstallManager, WalletInstallNavigator walletInstallNavigator, PermissionManager permissionManager, PermissionService permissionService, AbstractC11195h abstractC11195h, AbstractC11195h abstractC11195h2, WalletInstallConfiguration walletInstallConfiguration, WalletInstallAnalytics walletInstallAnalytics, MoPubAdsManager moPubAdsManager) {
        C9768m.m32346f(walletInstallView, "view");
        C9768m.m32346f(walletInstallManager, "walletInstallManager");
        C9768m.m32346f(walletInstallNavigator, "navigator");
        C9768m.m32346f(permissionManager, "permissionManager");
        C9768m.m32346f(permissionService, "permissionService");
        C9768m.m32346f(abstractC11195h, "viewScheduler");
        C9768m.m32346f(abstractC11195h2, "io");
        C9768m.m32346f(walletInstallConfiguration, "configuration");
        C9768m.m32346f(walletInstallAnalytics, "walletInstallAnalytics");
        C9768m.m32346f(moPubAdsManager, "moPubAdsManager");
        this.view = walletInstallView;
        this.walletInstallManager = walletInstallManager;
        this.navigator = walletInstallNavigator;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.viewScheduler = abstractC11195h;
        this.f12109io = abstractC11195h2;
        this.configuration = walletInstallConfiguration;
        this.walletInstallAnalytics = walletInstallAnalytics;
        this.moPubAdsManager = moPubAdsManager;
    }

    private final void handleAnalyticsContextSetup() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.p0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean m41005handleAnalyticsContextSetup$lambda0;
                m41005handleAnalyticsContextSetup$lambda0 = WalletInstallPresenter.m41005handleAnalyticsContextSetup$lambda0((View.LifecycleEvent) obj);
                return m41005handleAnalyticsContextSetup$lambda0;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.w
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41006handleAnalyticsContextSetup$lambda1(WalletInstallPresenter.this, (View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.z0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41007handleAnalyticsContextSetup$lambda2((View.LifecycleEvent) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.m0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41008handleAnalyticsContextSetup$lambda3(WalletInstallPresenter.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAnalyticsContextSetup$lambda-0, reason: not valid java name */
    public static final Boolean m41005handleAnalyticsContextSetup$lambda0(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(View.LifecycleEvent.CREATE == lifecycleEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAnalyticsContextSetup$lambda-1, reason: not valid java name */
    public static final void m41006handleAnalyticsContextSetup$lambda1(WalletInstallPresenter walletInstallPresenter, View.LifecycleEvent lifecycleEvent) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        walletInstallPresenter.walletInstallManager.setupAnalyticsHistoryTracker();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAnalyticsContextSetup$lambda-2, reason: not valid java name */
    public static final void m41007handleAnalyticsContextSetup$lambda2(View.LifecycleEvent lifecycleEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleAnalyticsContextSetup$lambda-3, reason: not valid java name */
    public static final void m41008handleAnalyticsContextSetup$lambda3(WalletInstallPresenter walletInstallPresenter, Throwable th) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        th.printStackTrace();
        walletInstallPresenter.view.dismissDialog();
    }

    private final void handleCancelDownloadButton() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.z
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean m41010handleCancelDownloadButton$lambda4;
                m41010handleCancelDownloadButton$lambda4 = WalletInstallPresenter.m41010handleCancelDownloadButton$lambda4((View.LifecycleEvent) obj);
                return m41010handleCancelDownloadButton$lambda4;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.o0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m41011handleCancelDownloadButton$lambda5;
                m41011handleCancelDownloadButton$lambda5 = WalletInstallPresenter.m41011handleCancelDownloadButton$lambda5(WalletInstallPresenter.this, (View.LifecycleEvent) obj);
                return m41011handleCancelDownloadButton$lambda5;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.j0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m41012handleCancelDownloadButton$lambda6;
                m41012handleCancelDownloadButton$lambda6 = WalletInstallPresenter.m41012handleCancelDownloadButton$lambda6(WalletInstallPresenter.this, (Void) obj);
                return m41012handleCancelDownloadButton$lambda6;
            }
        }).m40057E().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.t0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41013handleCancelDownloadButton$lambda7(WalletInstallPresenter.this, (WalletApp) obj);
            }
        }).m40095j0(this.viewScheduler).m40115v(new InterfaceC11204a() { // from class: cm.aptoide.pt.wallet.e0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                WalletInstallPresenter.m41014handleCancelDownloadButton$lambda8(WalletInstallPresenter.this);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.s
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41015handleCancelDownloadButton$lambda9((WalletApp) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.y0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41009handleCancelDownloadButton$lambda10(WalletInstallPresenter.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownloadButton$lambda-10, reason: not valid java name */
    public static final void m41009handleCancelDownloadButton$lambda10(WalletInstallPresenter walletInstallPresenter, Throwable th) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        th.printStackTrace();
        walletInstallPresenter.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownloadButton$lambda-4, reason: not valid java name */
    public static final Boolean m41010handleCancelDownloadButton$lambda4(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(View.LifecycleEvent.CREATE == lifecycleEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownloadButton$lambda-5, reason: not valid java name */
    public static final C11186e m41011handleCancelDownloadButton$lambda5(WalletInstallPresenter walletInstallPresenter, View.LifecycleEvent lifecycleEvent) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        return walletInstallPresenter.view.cancelDownloadButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownloadButton$lambda-6, reason: not valid java name */
    public static final C11186e m41012handleCancelDownloadButton$lambda6(WalletInstallPresenter walletInstallPresenter, Void r1) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        return walletInstallPresenter.walletInstallManager.getWallet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownloadButton$lambda-7, reason: not valid java name */
    public static final void m41013handleCancelDownloadButton$lambda7(WalletInstallPresenter walletInstallPresenter, WalletApp walletApp) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        WalletInstallManager walletInstallManager = walletInstallPresenter.walletInstallManager;
        C9768m.m32345e(walletApp, "walletApp");
        walletInstallManager.removeDownload(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownloadButton$lambda-8, reason: not valid java name */
    public static final void m41014handleCancelDownloadButton$lambda8(WalletInstallPresenter walletInstallPresenter) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        walletInstallPresenter.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCancelDownloadButton$lambda-9, reason: not valid java name */
    public static final void m41015handleCancelDownloadButton$lambda9(WalletApp walletApp) {
    }

    private final void handleCloseButtonClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.g0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean m41016handleCloseButtonClick$lambda31;
                m41016handleCloseButtonClick$lambda31 = WalletInstallPresenter.m41016handleCloseButtonClick$lambda31((View.LifecycleEvent) obj);
                return m41016handleCloseButtonClick$lambda31;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.q
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m41017handleCloseButtonClick$lambda32;
                m41017handleCloseButtonClick$lambda32 = WalletInstallPresenter.m41017handleCloseButtonClick$lambda32(WalletInstallPresenter.this, (View.LifecycleEvent) obj);
                return m41017handleCloseButtonClick$lambda32;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.k0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41018handleCloseButtonClick$lambda33(WalletInstallPresenter.this, (Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.n0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41019handleCloseButtonClick$lambda34((Void) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.i0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41020handleCloseButtonClick$lambda35(WalletInstallPresenter.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCloseButtonClick$lambda-31, reason: not valid java name */
    public static final Boolean m41016handleCloseButtonClick$lambda31(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(View.LifecycleEvent.CREATE == lifecycleEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCloseButtonClick$lambda-32, reason: not valid java name */
    public static final C11186e m41017handleCloseButtonClick$lambda32(WalletInstallPresenter walletInstallPresenter, View.LifecycleEvent lifecycleEvent) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        return walletInstallPresenter.view.closeButtonClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCloseButtonClick$lambda-33, reason: not valid java name */
    public static final void m41018handleCloseButtonClick$lambda33(WalletInstallPresenter walletInstallPresenter, Void r1) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        walletInstallPresenter.view.dismissDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCloseButtonClick$lambda-34, reason: not valid java name */
    public static final void m41019handleCloseButtonClick$lambda34(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleCloseButtonClick$lambda-35, reason: not valid java name */
    public static final void m41020handleCloseButtonClick$lambda35(WalletInstallPresenter walletInstallPresenter, Throwable th) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        th.printStackTrace();
        walletInstallPresenter.view.dismissDialog();
    }

    private final C11186e<Boolean> handleInstallDialogCancelButtonPress() {
        C11186e<Boolean> m40119x = this.walletInstallManager.onWalletInstallationCanceled().m40057E().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.b0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41021handleInstallDialogCancelButtonPress$lambda36(WalletInstallPresenter.this, (Boolean) obj);
            }
        });
        C9768m.m32345e(m40119x, "walletInstallManager.onW… { view.dismissDialog() }");
        return m40119x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleInstallDialogCancelButtonPress$lambda-36, reason: not valid java name */
    public static final void m41021handleInstallDialogCancelButtonPress$lambda36(WalletInstallPresenter walletInstallPresenter, Boolean bool) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        walletInstallPresenter.view.dismissDialog();
    }

    private final C11186e<Boolean> handleWalletInstallation() {
        C11186e<Boolean> m40119x = this.walletInstallManager.onWalletInstalled().m40057E().m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.a1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41022handleWalletInstallation$lambda11(WalletInstallPresenter.this, (Boolean) obj);
            }
        });
        C9768m.m32345e(m40119x, "walletInstallManager.onW…stallationSuccessView() }");
        return m40119x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleWalletInstallation$lambda-11, reason: not valid java name */
    public static final void m41022handleWalletInstallation$lambda11(WalletInstallPresenter walletInstallPresenter, Boolean bool) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        walletInstallPresenter.view.showInstallationSuccessView();
    }

    private final boolean hasMinimumSdk() {
        return Build.VERSION.SDK_INT >= 21;
    }

    private final void loadWalletInstall() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.s0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean m41023loadWalletInstall$lambda12;
                m41023loadWalletInstall$lambda12 = WalletInstallPresenter.m41023loadWalletInstall$lambda12((View.LifecycleEvent) obj);
                return m41023loadWalletInstall$lambda12;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.f0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41024loadWalletInstall$lambda13(WalletInstallPresenter.this, (View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.d0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean m41025loadWalletInstall$lambda14;
                m41025loadWalletInstall$lambda14 = WalletInstallPresenter.m41025loadWalletInstall$lambda14(WalletInstallPresenter.this, (View.LifecycleEvent) obj);
                return m41025loadWalletInstall$lambda14;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.x0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m41026loadWalletInstall$lambda15;
                m41026loadWalletInstall$lambda15 = WalletInstallPresenter.m41026loadWalletInstall$lambda15(WalletInstallPresenter.this, (View.LifecycleEvent) obj);
                return m41026loadWalletInstall$lambda15;
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.a0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean m41027loadWalletInstall$lambda16;
                m41027loadWalletInstall$lambda16 = WalletInstallPresenter.m41027loadWalletInstall$lambda16((Pair) obj);
                return m41027loadWalletInstall$lambda16;
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.c0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41028loadWalletInstall$lambda17(WalletInstallPresenter.this, (Pair) obj);
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.l0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m41029loadWalletInstall$lambda18;
                m41029loadWalletInstall$lambda18 = WalletInstallPresenter.m41029loadWalletInstall$lambda18(WalletInstallPresenter.this, (Pair) obj);
                return m41029loadWalletInstall$lambda18;
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.v
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41030loadWalletInstall$lambda19(obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.r0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41031loadWalletInstall$lambda20(WalletInstallPresenter.this, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletInstall$lambda-12, reason: not valid java name */
    public static final Boolean m41023loadWalletInstall$lambda12(View.LifecycleEvent lifecycleEvent) {
        return Boolean.valueOf(View.LifecycleEvent.CREATE == lifecycleEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletInstall$lambda-13, reason: not valid java name */
    public static final void m41024loadWalletInstall$lambda13(WalletInstallPresenter walletInstallPresenter, View.LifecycleEvent lifecycleEvent) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        if (walletInstallPresenter.hasMinimumSdk()) {
            walletInstallPresenter.view.showSdkErrorView();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletInstall$lambda-14, reason: not valid java name */
    public static final Boolean m41025loadWalletInstall$lambda14(WalletInstallPresenter walletInstallPresenter, View.LifecycleEvent lifecycleEvent) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        return Boolean.valueOf(!walletInstallPresenter.hasMinimumSdk());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletInstall$lambda-15, reason: not valid java name */
    public static final C11186e m41026loadWalletInstall$lambda15(WalletInstallPresenter walletInstallPresenter, View.LifecycleEvent lifecycleEvent) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        return walletInstallPresenter.showWalletInitialState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletInstall$lambda-16, reason: not valid java name */
    public static final Boolean m41027loadWalletInstall$lambda16(Pair pair) {
        return Boolean.valueOf(!((WalletApp) pair.m37649d()).isInstalled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletInstall$lambda-17, reason: not valid java name */
    public static final void m41028loadWalletInstall$lambda17(WalletInstallPresenter walletInstallPresenter, Pair pair) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        walletInstallPresenter.view.showIndeterminateDownload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletInstall$lambda-18, reason: not valid java name */
    public static final C11186e m41029loadWalletInstall$lambda18(WalletInstallPresenter walletInstallPresenter, Pair pair) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        return walletInstallPresenter.startWalletDownload((WalletApp) pair.m37649d()).m39974b(C11186e.m40034b0(walletInstallPresenter.handleWalletInstallation(), walletInstallPresenter.observeDownloadProgress((WalletApp) pair.m37649d()), walletInstallPresenter.handleInstallDialogCancelButtonPress()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletInstall$lambda-19, reason: not valid java name */
    public static final void m41030loadWalletInstall$lambda19(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadWalletInstall$lambda-20, reason: not valid java name */
    public static final void m41031loadWalletInstall$lambda20(WalletInstallPresenter walletInstallPresenter, Throwable th) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        th.printStackTrace();
        walletInstallPresenter.view.dismissDialog();
    }

    private final C11186e<WalletApp> observeDownloadProgress(final WalletApp walletApp) {
        C11186e<WalletApp> m40082X = this.walletInstallManager.loadDownloadModel(walletApp).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.v0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m41032observeDownloadProgress$lambda21;
                m41032observeDownloadProgress$lambda21 = WalletInstallPresenter.m41032observeDownloadProgress$lambda21(WalletInstallPresenter.this, walletApp, (DownloadModel) obj);
                return m41032observeDownloadProgress$lambda21;
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.u0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41033observeDownloadProgress$lambda22(WalletInstallPresenter.this, (DownloadModel) obj);
            }
        }).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.u
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                WalletApp m41034observeDownloadProgress$lambda23;
                m41034observeDownloadProgress$lambda23 = WalletInstallPresenter.m41034observeDownloadProgress$lambda23(WalletApp.this, (DownloadModel) obj);
                return m41034observeDownloadProgress$lambda23;
            }
        });
        C9768m.m32345e(m40082X, "walletInstallManager.loa…e(it) }.map { walletApp }");
        return m40082X;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeDownloadProgress$lambda-21, reason: not valid java name */
    public static final C11186e m41032observeDownloadProgress$lambda21(WalletInstallPresenter walletInstallPresenter, WalletApp walletApp, DownloadModel downloadModel) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        C9768m.m32346f(walletApp, "$walletApp");
        C9768m.m32345e(downloadModel, "downloadModel");
        return walletInstallPresenter.verifyNotEnoughSpaceError(downloadModel, walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeDownloadProgress$lambda-22, reason: not valid java name */
    public static final void m41033observeDownloadProgress$lambda22(WalletInstallPresenter walletInstallPresenter, DownloadModel downloadModel) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        WalletInstallView walletInstallView = walletInstallPresenter.view;
        C9768m.m32345e(downloadModel, "it");
        walletInstallView.showDownloadState(downloadModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: observeDownloadProgress$lambda-23, reason: not valid java name */
    public static final WalletApp m41034observeDownloadProgress$lambda23(WalletApp walletApp, DownloadModel downloadModel) {
        C9768m.m32346f(walletApp, "$walletApp");
        return walletApp;
    }

    private final C11186e<Pair<String, WalletApp>> showWalletInitialState() {
        return C11186e.m40040d1(this.walletInstallManager.getAppIcon(this.configuration.getAppPackageName()), this.walletInstallManager.getWallet(), new InterfaceC11209f() { // from class: cm.aptoide.pt.wallet.q0
            @Override // p456rx.p460m.InterfaceC11209f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                Pair m41035showWalletInitialState$lambda29;
                m41035showWalletInitialState$lambda29 = WalletInstallPresenter.m41035showWalletInitialState$lambda29((String) obj, (WalletApp) obj2);
                return m41035showWalletInitialState$lambda29;
            }
        }).m40057E().m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.x
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                WalletInstallPresenter.m41036showWalletInitialState$lambda30(WalletInstallPresenter.this, (Pair) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showWalletInitialState$lambda-29, reason: not valid java name */
    public static final Pair m41035showWalletInitialState$lambda29(String str, WalletApp walletApp) {
        C9768m.m32345e(walletApp, "walletApp");
        return new Pair(str, walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showWalletInitialState$lambda-30, reason: not valid java name */
    public static final void m41036showWalletInitialState$lambda30(WalletInstallPresenter walletInstallPresenter, Pair pair) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        if (((WalletApp) pair.m37649d()).isInstalled()) {
            walletInstallPresenter.view.showWalletInstalledAlreadyView();
        } else {
            walletInstallPresenter.view.showWalletInstallationView((String) pair.m37648c(), (WalletApp) pair.m37649d());
        }
    }

    private final C11183b startWalletDownload(final WalletApp walletApp) {
        C11183b m40083X0 = C11186e.m40049p(new InterfaceCallableC11207d() { // from class: cm.aptoide.pt.wallet.w0
            @Override // p456rx.p460m.InterfaceCallableC11207d, java.util.concurrent.Callable
            public final Object call() {
                C11186e m41037startWalletDownload$lambda26;
                m41037startWalletDownload$lambda26 = WalletInstallPresenter.m41037startWalletDownload$lambda26(WalletInstallPresenter.this, walletApp);
                return m41037startWalletDownload$lambda26;
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.r
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m41039startWalletDownload$lambda28;
                m41039startWalletDownload$lambda28 = WalletInstallPresenter.m41039startWalletDownload$lambda28(WalletInstallPresenter.this, walletApp, (WalletApp) obj);
                return m41039startWalletDownload$lambda28;
            }
        }).m40083X0();
        C9768m.m32345e(m40083X0, "defer {\n      if (wallet…}\n      }.toCompletable()");
        return m40083X0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startWalletDownload$lambda-26, reason: not valid java name */
    public static final C11186e m41037startWalletDownload$lambda26(final WalletInstallPresenter walletInstallPresenter, WalletApp walletApp) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        C9768m.m32346f(walletApp, "$walletApp");
        if (walletInstallPresenter.walletInstallManager.shouldShowRootInstallWarningPopup()) {
            walletInstallPresenter.view.showRootInstallWarningPopup().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.y
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    WalletInstallPresenter.m41038startWalletDownload$lambda26$lambda25(WalletInstallPresenter.this, (Boolean) obj);
                }
            });
        }
        return C11186e.m40025S(walletApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startWalletDownload$lambda-26$lambda-25, reason: not valid java name */
    public static final void m41038startWalletDownload$lambda26$lambda25(WalletInstallPresenter walletInstallPresenter, Boolean bool) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        WalletInstallManager walletInstallManager = walletInstallPresenter.walletInstallManager;
        C9768m.m32345e(bool, "answer");
        walletInstallManager.allowRootInstall(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startWalletDownload$lambda-28, reason: not valid java name */
    public static final C11186e m41039startWalletDownload$lambda28(final WalletInstallPresenter walletInstallPresenter, final WalletApp walletApp, WalletApp walletApp2) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        C9768m.m32346f(walletApp, "$walletApp");
        return walletInstallPresenter.permissionManager.requestDownloadAllowingMobileData(walletInstallPresenter.permissionService).m40095j0(Schedulers.m40658io()).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.wallet.h0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m41040startWalletDownload$lambda28$lambda27;
                m41040startWalletDownload$lambda28$lambda27 = WalletInstallPresenter.m41040startWalletDownload$lambda28$lambda27(WalletInstallPresenter.this, walletApp, (Void) obj);
                return m41040startWalletDownload$lambda28$lambda27;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startWalletDownload$lambda-28$lambda-27, reason: not valid java name */
    public static final C11183b m41040startWalletDownload$lambda28$lambda27(WalletInstallPresenter walletInstallPresenter, WalletApp walletApp, Void r2) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        C9768m.m32346f(walletApp, "$walletApp");
        return walletInstallPresenter.walletInstallManager.downloadApp(walletApp);
    }

    private final C11186e<DownloadModel> verifyNotEnoughSpaceError(DownloadModel downloadModel, final WalletApp walletApp) {
        if (downloadModel.getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR) {
            C11186e.m40025S(downloadModel).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.wallet.t
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    WalletInstallPresenter.m41041verifyNotEnoughSpaceError$lambda24(WalletInstallPresenter.this, walletApp, (DownloadModel) obj);
                }
            });
        }
        C11186e<DownloadModel> m40025S = C11186e.m40025S(downloadModel);
        C9768m.m32345e(m40025S, "just(downloadModel)");
        return m40025S;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: verifyNotEnoughSpaceError$lambda-24, reason: not valid java name */
    public static final void m41041verifyNotEnoughSpaceError$lambda24(WalletInstallPresenter walletInstallPresenter, WalletApp walletApp, DownloadModel downloadModel) {
        C9768m.m32346f(walletInstallPresenter, "this$0");
        C9768m.m32346f(walletApp, "$walletApp");
        walletInstallPresenter.walletInstallAnalytics.sendNotEnoughSpaceErrorEvent(walletApp.getMd5sum());
    }

    public final WalletInstallConfiguration getConfiguration() {
        return this.configuration;
    }

    /* renamed from: getIo, reason: from getter */
    public final AbstractC11195h getF12109io() {
        return this.f12109io;
    }

    public final MoPubAdsManager getMoPubAdsManager() {
        return this.moPubAdsManager;
    }

    public final WalletInstallNavigator getNavigator() {
        return this.navigator;
    }

    public final PermissionManager getPermissionManager() {
        return this.permissionManager;
    }

    public final PermissionService getPermissionService() {
        return this.permissionService;
    }

    public final WalletInstallView getView() {
        return this.view;
    }

    public final AbstractC11195h getViewScheduler() {
        return this.viewScheduler;
    }

    public final WalletInstallAnalytics getWalletInstallAnalytics() {
        return this.walletInstallAnalytics;
    }

    public final WalletInstallManager getWalletInstallManager() {
        return this.walletInstallManager;
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        loadWalletInstall();
        handleCloseButtonClick();
        handleCancelDownloadButton();
        handleAnalyticsContextSetup();
    }
}
