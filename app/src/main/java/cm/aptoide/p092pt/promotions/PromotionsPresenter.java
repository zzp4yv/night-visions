package cm.aptoide.p092pt.promotions;

import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.ads.WalletAdsOfferManager;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.download.view.outofspace.OutOfSpaceNavigatorWrapper;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import java.util.List;
import okhttp3.HttpUrl;
import p456rx.AbstractC11195h;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceCallableC11207d;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class PromotionsPresenter implements Presenter {
    private final MoPubAdsManager moPubAdsManager;
    private final PermissionManager permissionManager;
    private final PermissionService permissionService;
    private String promotionId;
    private final String promotionType;
    private final PromotionsAnalytics promotionsAnalytics;
    private final PromotionsManager promotionsManager;
    private final PromotionsNavigator promotionsNavigator;
    private final PromotionsView view;
    private final AbstractC11195h viewScheduler;

    public PromotionsPresenter(PromotionsView promotionsView, PromotionsManager promotionsManager, PermissionManager permissionManager, PermissionService permissionService, AbstractC11195h abstractC11195h, PromotionsAnalytics promotionsAnalytics, PromotionsNavigator promotionsNavigator, String str, MoPubAdsManager moPubAdsManager) {
        this.view = promotionsView;
        this.promotionsManager = promotionsManager;
        this.permissionManager = permissionManager;
        this.permissionService = permissionService;
        this.viewScheduler = abstractC11195h;
        this.promotionsAnalytics = promotionsAnalytics;
        this.promotionsNavigator = promotionsNavigator;
        this.promotionType = str;
        this.moPubAdsManager = moPubAdsManager;
    }

    private void cancelDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.g5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.p6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8559c((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.x4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$cancelDownload$27((PromotionViewApp) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.b3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$cancelDownload$28((Throwable) obj);
            }
        });
    }

    private void claimApp() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.j3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.n5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8561e((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.o6
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$claimApp$12((String) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.x3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$claimApp$13((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: downloadApp, reason: merged with bridge method [inline-methods] */
    public C11183b m8546P(final PromotionViewApp promotionViewApp) {
        return C11186e.m40049p(new InterfaceCallableC11207d() { // from class: cm.aptoide.pt.promotions.g3
            @Override // p456rx.p460m.InterfaceCallableC11207d, java.util.concurrent.Callable
            public final Object call() {
                return PromotionsPresenter.this.m8563g();
            }
        }).m40095j0(this.viewScheduler).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.d4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8564h((Boolean) obj);
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.f6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8566j(promotionViewApp, (Void) obj);
            }
        }).m40095j0(Schedulers.m40658io()).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.z4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8567k(promotionViewApp, (Void) obj);
            }
        }).m40083X0();
    }

    private void getPromotionApps() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.f5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.r4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8568m((View.LifecycleEvent) obj);
            }
        }).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.o3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8569n((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.z5
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8570o((PromotionsModel) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.w3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8571p((PromotionsModel) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new C4026r5(this)).m40117w(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.g6
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8572q((Throwable) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.h4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$getPromotionApps$65((PromotionsModel) obj);
            }
        }, C4075x6.f10915f);
    }

    private void handleClickOnAppCard() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.u5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.i4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8573r((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.n3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8574s((PromotionAppClick) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.t5
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handleClickOnAppCard$46((PromotionAppClick) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.d3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handleClickOnAppCard$47((Throwable) obj);
                throw null;
            }
        });
    }

    private C11186e<PromotionsModel> handleDownloadErrors(final PromotionsModel promotionsModel) {
        return C11186e.m40033a0(this.view.installButtonClick(), this.view.resumeDownload()).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.o4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8577v(promotionsModel, (PromotionViewApp) obj);
            }
        }).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.r6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                PromotionsModel promotionsModel2 = PromotionsModel.this;
                PromotionsPresenter.lambda$handleDownloadErrors$95(promotionsModel2, (PromotionViewApp) obj);
                return promotionsModel2;
            }
        });
    }

    private void handleOutOfSpaceDialog() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.v3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.d6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8578w((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.h6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((OutOfSpaceNavigatorWrapper) obj).getClearedSuccessfully());
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.c5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8580y((OutOfSpaceNavigatorWrapper) obj);
            }
        }).m40110s0().m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.s5
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handleOutOfSpaceDialog$7((PromotionApp) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.s4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    private C11186e<PromotionsModel> handlePromotionApps(final PromotionsModel promotionsModel) {
        return C11186e.m40025S(promotionsModel).m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.n6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Iterable appsList;
                appsList = PromotionsModel.this.getAppsList();
                return appsList;
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.b5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionApp) obj).getPackageName().equals(AptoideApplication.APPCOINS_WALLET_PACKAGE_NAME));
                return valueOf;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.z2
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8581z(promotionsModel, (PromotionApp) obj);
            }
        }).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.p5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                PromotionsModel promotionsModel2 = PromotionsModel.this;
                PromotionsPresenter.lambda$handlePromotionApps$81(promotionsModel2, (PromotionApp) obj);
                return promotionsModel2;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.c6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8535E(promotionsModel, (PromotionsModel) obj);
            }
        });
    }

    private void handlePromotionClaimResult() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.l3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.v4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8536F((View.LifecycleEvent) obj);
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.z0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return Boolean.valueOf(((ClaimDialogResultWrapper) obj).isOk());
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.e6
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8537G((ClaimDialogResultWrapper) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.a4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handlePromotionClaimResult$69((ClaimDialogResultWrapper) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.m6
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handlePromotionClaimResult$70((Throwable) obj);
                throw null;
            }
        });
    }

    private void handlePromotionOverDialogClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.e5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.x2
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8538H((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.y3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8539I((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.i6
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handlePromotionOverDialogClick$51((Void) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.a3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handlePromotionOverDialogClick$52((Throwable) obj);
            }
        });
    }

    private void handleRetryClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.l5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.h5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8544N((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.v2
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$handleRetryClick$77((PromotionsModel) obj);
            }
        }, C4075x6.f10915f);
    }

    private void installButtonClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.q6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.e4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8547Q((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.k4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$installButtonClick$41((PromotionViewApp) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.l6
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$installButtonClick$42((Throwable) obj);
                throw null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8557b(PromotionViewApp promotionViewApp) {
        return this.promotionsManager.cancelDownload(promotionViewApp.getMd5(), promotionViewApp.getPackageName(), promotionViewApp.getVersionCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cancelDownload$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8559c(View.LifecycleEvent lifecycleEvent) {
        return this.view.cancelDownload().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.z3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8557b((PromotionViewApp) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$cancelDownload$27(PromotionViewApp promotionViewApp) {
    }

    static /* synthetic */ void lambda$cancelDownload$28(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimApp$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8560d(PromotionViewApp promotionViewApp) {
        this.promotionsAnalytics.sendPromotionsAppInteractClaimEvent(promotionViewApp.getPackageName(), promotionViewApp.getAppcValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$claimApp$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8561e(View.LifecycleEvent lifecycleEvent) {
        return this.view.claimAppClick().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.q3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8560d((PromotionViewApp) obj);
            }
        }).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.k6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Single showClaimView;
                showClaimView = PromotionsPresenter.this.showClaimView((PromotionViewApp) obj);
                return showClaimView;
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$claimApp$12(String str) {
    }

    static /* synthetic */ void lambda$claimApp$13(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$53, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8562f(Boolean bool) {
        this.promotionsManager.allowRootInstall(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$54, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8563g() {
        return this.promotionsManager.shouldShowRootInstallWarningPopup() ? this.view.showRootInstallWarningPopup().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.a5
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8562f((Boolean) obj);
            }
        }) : C11186e.m40025S(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$55, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8564h(Boolean bool) {
        return this.permissionManager.requestDownloadAccess(this.permissionService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$56, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8565i(PromotionViewApp promotionViewApp, Throwable th) {
        this.promotionsAnalytics.sendDownloadAbortEvent(promotionViewApp.getPackageName(), promotionViewApp.getVersionCode(), promotionViewApp.getDownloadModel().getAction(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.MIGRATE), promotionViewApp.hasSplits(), promotionViewApp.hasAppc(), promotionViewApp.getRank(), promotionViewApp.getStoreName(), false, promotionViewApp.getObb() != null, promotionViewApp.getBdsFlags().contains("STORE_BDS"), HttpUrl.FRAGMENT_ENCODE_SET, promotionViewApp.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$57, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8566j(final PromotionViewApp promotionViewApp, Void r3) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).m40117w(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.f4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8565i(promotionViewApp, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$downloadApp$58, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8567k(PromotionViewApp promotionViewApp, Void r2) {
        return this.promotionsManager.downloadApp(promotionViewApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPromotionApps$60, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8568m(View.LifecycleEvent lifecycleEvent) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPromotionApps$61, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8569n(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsManager.getPromotionsModel(this.promotionType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPromotionApps$62, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8570o(PromotionsModel promotionsModel) {
        this.promotionId = promotionsModel.getPromotionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPromotionApps$63, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8571p(PromotionsModel promotionsModel) {
        this.promotionsAnalytics.sendOpenPromotionsFragmentEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getPromotionApps$64, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8572q(Throwable th) {
        this.view.showErrorView();
    }

    static /* synthetic */ void lambda$getPromotionApps$65(PromotionsModel promotionsModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppCard$44, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8573r(View.LifecycleEvent lifecycleEvent) {
        return this.view.appCardClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppCard$45, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8574s(PromotionAppClick promotionAppClick) {
        this.promotionsNavigator.navigateToAppView(promotionAppClick.getApp().getAppId(), promotionAppClick.getApp().getPackageName());
    }

    static /* synthetic */ void lambda$handleClickOnAppCard$46(PromotionAppClick promotionAppClick) {
    }

    static /* synthetic */ void lambda$handleClickOnAppCard$47(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadErrors$92, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8575t(PromotionViewApp promotionViewApp) {
        if (promotionViewApp.getDownloadModel().getDownloadState().equals(DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR)) {
            this.promotionsNavigator.navigateToOutOfSpaceDialog(promotionViewApp.getSize(), promotionViewApp.getPackageName());
        } else {
            this.view.showDownloadError(promotionViewApp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadErrors$93, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8576u(PromotionApp promotionApp) {
        return this.promotionsManager.getDownload(promotionApp).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.j5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionViewApp) obj).getDownloadModel().hasError());
                return valueOf;
            }
        }).m40057E().m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.u4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8575t((PromotionViewApp) obj);
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.s3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e verifyNotEnoughSpaceError;
                verifyNotEnoughSpaceError = PromotionsPresenter.this.verifyNotEnoughSpaceError((PromotionViewApp) obj);
                return verifyNotEnoughSpaceError;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadErrors$94, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8577v(PromotionsModel promotionsModel, PromotionViewApp promotionViewApp) {
        return C11186e.m40020N(promotionsModel.getAppsList()).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.d5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8576u((PromotionApp) obj);
            }
        });
    }

    static /* synthetic */ PromotionsModel lambda$handleDownloadErrors$95(PromotionsModel promotionsModel, PromotionViewApp promotionViewApp) {
        return promotionsModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialog$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8578w(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsNavigator.outOfSpaceDialogResult();
    }

    static /* synthetic */ Iterable lambda$handleOutOfSpaceDialog$3(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialog$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8579x(PromotionApp promotionApp) {
        return this.promotionsManager.resumeDownload(promotionApp.getMd5(), promotionApp.getPackageName(), promotionApp.getAppId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOutOfSpaceDialog$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8580y(final OutOfSpaceNavigatorWrapper outOfSpaceNavigatorWrapper) {
        return this.promotionsManager.getPromotionApps(this.promotionId).m39915A().m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.e3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                List list = (List) obj;
                PromotionsPresenter.lambda$handleOutOfSpaceDialog$3(list);
                return list;
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.q5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionApp) obj).getPackageName().equals(OutOfSpaceNavigatorWrapper.this.getPackageName()));
                return valueOf;
            }
        }).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.f3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8579x((PromotionApp) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleOutOfSpaceDialog$7(PromotionApp promotionApp) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionApps$80, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8581z(PromotionsModel promotionsModel, PromotionApp promotionApp) {
        this.view.lockPromotionApps(promotionsModel.isWalletInstalled() && promotionApp.isClaimed());
    }

    static /* synthetic */ PromotionsModel lambda$handlePromotionApps$81(PromotionsModel promotionsModel, PromotionApp promotionApp) {
        return promotionsModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionApps$83, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8531A(PromotionApp promotionApp) {
        return this.promotionsManager.getDownload(promotionApp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionApps$84, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8532B(PromotionViewApp promotionViewApp) {
        this.view.showPromotionApp(promotionViewApp, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionApps$87, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8533C(PromotionViewApp promotionViewApp, Boolean bool) {
        this.promotionsAnalytics.sendValentineMigratorEvent(promotionViewApp.getPackageName(), bool);
    }

    static /* synthetic */ PromotionsModel lambda$handlePromotionApps$88(PromotionsModel promotionsModel, Boolean bool) {
        return promotionsModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionApps$89, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8534D(final PromotionsModel promotionsModel, final PromotionViewApp promotionViewApp) {
        return this.promotionsManager.getPackageSignature(promotionViewApp.getPackageName()).m40095j0(this.viewScheduler).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.j6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(PromotionViewApp.this.getSignature().equals((String) obj));
                return valueOf;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.v5
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8533C(promotionViewApp, (Boolean) obj);
            }
        }).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.m4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                PromotionsModel promotionsModel2 = PromotionsModel.this;
                PromotionsPresenter.lambda$handlePromotionApps$88(promotionsModel2, (Boolean) obj);
                return promotionsModel2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionApps$90, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8535E(final PromotionsModel promotionsModel, PromotionsModel promotionsModel2) {
        return C11186e.m40025S(promotionsModel).m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.i3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Iterable appsList;
                appsList = PromotionsModel.this.getAppsList();
                return appsList;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.b4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8531A((PromotionApp) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.g4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8532B((PromotionViewApp) obj);
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.x5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionViewApp) obj).getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.y5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8534D(promotionsModel, (PromotionViewApp) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionClaimResult$67, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8536F(View.LifecycleEvent lifecycleEvent) {
        return this.promotionsNavigator.claimDialogResults();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionClaimResult$68, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8537G(ClaimDialogResultWrapper claimDialogResultWrapper) {
        this.view.updateClaimStatus(claimDialogResultWrapper.getPackageName());
    }

    static /* synthetic */ void lambda$handlePromotionClaimResult$69(ClaimDialogResultWrapper claimDialogResultWrapper) {
    }

    static /* synthetic */ void lambda$handlePromotionClaimResult$70(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionOverDialogClick$49, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8538H(View.LifecycleEvent lifecycleEvent) {
        return this.view.promotionOverDialogClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePromotionOverDialogClick$50, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8539I(Void r1) {
        this.promotionsNavigator.navigateToHome();
    }

    static /* synthetic */ void lambda$handlePromotionOverDialogClick$51(Void r0) {
    }

    static /* synthetic */ void lambda$handlePromotionOverDialogClick$52(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$72, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8540J(Void r1) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$73, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8541K(Void r2) {
        return this.promotionsManager.getPromotionsModel(this.promotionType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$74, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8542L(PromotionsModel promotionsModel) {
        this.promotionId = promotionsModel.getPromotionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$75, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8543M(Throwable th) {
        this.view.showErrorView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleRetryClick$76, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8544N(View.LifecycleEvent lifecycleEvent) {
        return this.view.retryClicked().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.y2
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8540J((Void) obj);
            }
        }).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.w2
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8541K((Void) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.p4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8542L((PromotionsModel) obj);
            }
        }).m40095j0(this.viewScheduler).m40060G(new C4026r5(this)).m40117w(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.m3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8543M((Throwable) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$handleRetryClick$77(PromotionsModel promotionsModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$installButtonClick$37, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8545O(PromotionViewApp promotionViewApp) {
        this.promotionsAnalytics.sendPromotionsAppInteractInstallEvent(promotionViewApp.getPackageName(), promotionViewApp.getAppcValue(), promotionViewApp.getDownloadModel().getAction(), promotionViewApp.hasSplits(), promotionViewApp.hasAppc(), promotionViewApp.getRank(), null, promotionViewApp.getStoreName(), promotionViewApp.getObb() != null, promotionViewApp.getBdsFlags(), promotionViewApp.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$installButtonClick$40, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8547Q(View.LifecycleEvent lifecycleEvent) {
        return this.view.installButtonClick().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.y4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((PromotionViewApp) obj).getDownloadModel().isDownloadable());
                return valueOf;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.k5
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8545O((PromotionViewApp) obj);
            }
        }).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.i5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8546P((PromotionViewApp) obj);
            }
        }).m40095j0(this.viewScheduler).m40117w(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.a6
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$installButtonClick$41(PromotionViewApp promotionViewApp) {
    }

    static /* synthetic */ void lambda$installButtonClick$42(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8548S(PromotionViewApp promotionViewApp) {
        return this.promotionsManager.pauseDownload(promotionViewApp.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8549T(View.LifecycleEvent lifecycleEvent) {
        return this.view.pauseDownload().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.o5
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8548S((PromotionViewApp) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$pauseDownload$33(PromotionViewApp promotionViewApp) {
    }

    static /* synthetic */ void lambda$pauseDownload$34(Throwable th) {
        throw new IllegalStateException(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8550U(PromotionViewApp promotionViewApp, Throwable th) {
        this.promotionsAnalytics.sendDownloadAbortEvent(promotionViewApp.getPackageName(), promotionViewApp.getVersionCode(), promotionViewApp.getDownloadModel().getAction(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.MIGRATE), promotionViewApp.hasSplits(), promotionViewApp.hasAppc(), promotionViewApp.getRank(), promotionViewApp.getStoreName(), false, promotionViewApp.getObb() != null, promotionViewApp.getBdsFlags().contains("STORE_BDS"), HttpUrl.FRAGMENT_ENCODE_SET, promotionViewApp.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8551V(final PromotionViewApp promotionViewApp, Void r3) {
        return this.permissionManager.requestExternalStoragePermission(this.permissionService).m40117w(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.p3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8550U(promotionViewApp, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8552W(PromotionViewApp promotionViewApp, Void r6) {
        return this.promotionsManager.resumeDownload(promotionViewApp.getMd5(), promotionViewApp.getPackageName(), promotionViewApp.getAppId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8553X(final PromotionViewApp promotionViewApp) {
        return this.permissionManager.requestDownloadAccess(this.permissionService).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.l4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8551V(promotionViewApp, (Void) obj);
            }
        }).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.n4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8552W(promotionViewApp, (Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$resumeDownload$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8554Y(View.LifecycleEvent lifecycleEvent) {
        return this.view.resumeDownload().m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.t4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8553X((PromotionViewApp) obj);
            }
        });
    }

    static /* synthetic */ void lambda$resumeDownload$22(Void r0) {
    }

    static /* synthetic */ void lambda$resumeDownload$23(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showClaimView$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8555Z(PromotionViewApp promotionViewApp, String str) {
        this.promotionsNavigator.navigateToClaimDialog(promotionViewApp.getPackageName(), this.promotionId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showClaimView$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8556a0(PromotionViewApp promotionViewApp, String str) {
        this.promotionsNavigator.navigateToClaimDialog(promotionViewApp.getPackageName(), this.promotionId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$verifyNotEnoughSpaceError$96, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8558b0(PromotionViewApp promotionViewApp, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        this.promotionsAnalytics.sendNotEnoughSpaceErrorEvent(promotionViewApp.getMd5());
    }

    static /* synthetic */ PromotionViewApp lambda$verifyNotEnoughSpaceError$97(PromotionViewApp promotionViewApp, WalletAdsOfferManager.OfferResponseStatus offerResponseStatus) {
        return promotionViewApp;
    }

    private void pauseDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.q4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.w4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8549T((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40117w(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.w5
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40110s0().m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.h3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$pauseDownload$33((PromotionViewApp) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.t3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$pauseDownload$34((Throwable) obj);
                throw null;
            }
        });
    }

    private void resumeDownload() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.c3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.CREATE);
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.k3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return PromotionsPresenter.this.m8554Y((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.b6
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$resumeDownload$22((Void) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.u3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.lambda$resumeDownload$23((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Single<? extends String> showClaimView(final PromotionViewApp promotionViewApp) {
        String str = this.promotionId;
        return str != null ? Single.m39913m(str).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.r3
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8555Z(promotionViewApp, (String) obj);
            }
        }) : this.promotionsManager.getPromotionsModel(this.promotionType).m39923n(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.z6
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ((PromotionsModel) obj).getPromotionId();
            }
        }).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.m5
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8556a0(promotionViewApp, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C11186e<? extends PromotionsModel> showPromotions(PromotionsModel promotionsModel) {
        if (promotionsModel.getAppsList().isEmpty()) {
            this.view.showPromotionOverDialog();
            return C11186e.m40016B();
        }
        this.view.setPromotionMessage(promotionsModel.getDescription());
        this.view.showPromotionTitle(promotionsModel.getTitle());
        this.view.showPromotionFeatureGraphic(promotionsModel.getFeatureGraphic());
        return C11186e.m40043f0(handlePromotionApps(promotionsModel), handleDownloadErrors(promotionsModel));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C11186e<PromotionViewApp> verifyNotEnoughSpaceError(final PromotionViewApp promotionViewApp) {
        return promotionViewApp.getDownloadModel().getDownloadState() == DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR ? this.moPubAdsManager.getAdsVisibilityStatus().m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.promotions.j4
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                PromotionsPresenter.this.m8558b0(promotionViewApp, (WalletAdsOfferManager.OfferResponseStatus) obj);
            }
        }).m39915A().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.promotions.c4
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                PromotionViewApp promotionViewApp2 = PromotionViewApp.this;
                PromotionsPresenter.lambda$verifyNotEnoughSpaceError$97(promotionViewApp2, (WalletAdsOfferManager.OfferResponseStatus) obj);
                return promotionViewApp2;
            }
        }) : C11186e.m40025S(promotionViewApp);
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        getPromotionApps();
        installButtonClick();
        handleClickOnAppCard();
        pauseDownload();
        cancelDownload();
        resumeDownload();
        claimApp();
        handlePromotionClaimResult();
        handleRetryClick();
        handlePromotionOverDialogClick();
        handleOutOfSpaceDialog();
    }
}
