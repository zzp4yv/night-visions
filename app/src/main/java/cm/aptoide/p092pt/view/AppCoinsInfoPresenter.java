package cm.aptoide.p092pt.view;

import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.AppCoinsManager;
import cm.aptoide.p092pt.app.view.AppCoinsInfoView;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.editorial.ScrollEvent;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.socialmedia.SocialMediaAnalytics;
import p319g.p320a.p321a.p322a.C9026d;
import p456rx.AbstractC11195h;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class AppCoinsInfoPresenter implements Presenter {
    private final AppCoinsInfoNavigator appCoinsInfoNavigator;
    private final AppCoinsManager appCoinsManager;
    private final String appcWalletPackageName;
    private final CrashReport crashReport;
    private final InstallManager installManager;
    private final SocialMediaAnalytics socialMediaAnalytics;
    private final AppCoinsInfoView view;
    private final AbstractC11195h viewScheduler;

    public AppCoinsInfoPresenter(AppCoinsInfoView appCoinsInfoView, AppCoinsInfoNavigator appCoinsInfoNavigator, InstallManager installManager, CrashReport crashReport, String str, AbstractC11195h abstractC11195h, SocialMediaAnalytics socialMediaAnalytics, AppCoinsManager appCoinsManager) {
        this.view = appCoinsInfoView;
        this.appCoinsInfoNavigator = appCoinsInfoNavigator;
        this.installManager = installManager;
        this.crashReport = crashReport;
        this.appcWalletPackageName = str;
        this.viewScheduler = abstractC11195h;
        this.socialMediaAnalytics = socialMediaAnalytics;
        this.appCoinsManager = appCoinsManager;
    }

    private void handleBonusPercentage() {
        C11186e m40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.f
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.a0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppCoinsInfoPresenter.this.m8884a((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.d
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.this.m8885b((BonusAppcModel) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4813p c4813p = new InterfaceC11205b() { // from class: cm.aptoide.pt.view.p
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.lambda$handleBonusPercentage$3((BonusAppcModel) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        m40091f.m40063H0(c4813p, new C4660a(crashReport));
    }

    private void handleClickOnCatappultDevButton() {
        C11186e m40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.v
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.b0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppCoinsInfoPresenter.this.m8889f((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.o
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.this.m8890g((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4817r c4817r = new InterfaceC11205b() { // from class: cm.aptoide.pt.view.r
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.lambda$handleClickOnCatappultDevButton$16((Void) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        m40091f.m40063H0(c4817r, new C4660a(crashReport));
    }

    private void handleSocialMediaPromotionClick() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.c0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.f0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppCoinsInfoPresenter.this.m8896m((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.w
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.this.m8897n((SocialMediaView.SocialMediaType) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.s
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.lambda$handleSocialMediaPromotionClick$7((SocialMediaView.SocialMediaType) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.view.e0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.this.m8898o((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBonusPercentage$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8884a(View.LifecycleEvent lifecycleEvent) {
        return C9026d.m29126d(this.appCoinsManager.getBonusAppc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleBonusPercentage$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8885b(BonusAppcModel bonusAppcModel) {
        if (bonusAppcModel.getHasBonusAppc()) {
            this.view.setBonusAppc(bonusAppcModel.getBonusPercentage());
        } else {
            this.view.setNoBonusAppcView();
        }
    }

    static /* synthetic */ void lambda$handleBonusPercentage$3(BonusAppcModel bonusAppcModel) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleButtonText$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8886c(View.LifecycleEvent lifecycleEvent) {
        return this.installManager.isInstalled(this.appcWalletPackageName);
    }

    static /* synthetic */ void lambda$handleButtonText$28(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcWalletLink$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8887d(View.LifecycleEvent lifecycleEvent) {
        return this.view.appCoinsWalletLinkClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnAppcWalletLink$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8888e(Void r1) {
        this.appCoinsInfoNavigator.navigateToAppCoinsWallet();
    }

    static /* synthetic */ void lambda$handleClickOnAppcWalletLink$25(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnCatappultDevButton$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8889f(View.LifecycleEvent lifecycleEvent) {
        return this.view.catappultButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnCatappultDevButton$15, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8890g(Void r1) {
        this.appCoinsInfoNavigator.navigateToCatappultWebsite();
    }

    static /* synthetic */ void lambda$handleClickOnCatappultDevButton$16(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnInstallButton$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8891h(View.LifecycleEvent lifecycleEvent) {
        return C11186e.m40033a0(this.view.installButtonClick(), this.view.cardViewClick());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnInstallButton$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8892i(Void r2) {
        return this.installManager.isInstalled(this.appcWalletPackageName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleClickOnInstallButton$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8893j(Boolean bool) {
        if (bool.booleanValue()) {
            this.view.openApp(this.appcWalletPackageName);
        } else {
            this.appCoinsInfoNavigator.navigateToAppCoinsWallet();
        }
    }

    static /* synthetic */ void lambda$handleClickOnInstallButton$21(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibilityChange$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8894k(View.LifecycleEvent lifecycleEvent) {
        return this.view.appItemVisibilityChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handlePlaceHolderVisibilityChange$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8895l(ScrollEvent scrollEvent) {
        if (scrollEvent.getItemShown().booleanValue()) {
            this.view.removeBottomCardAnimation();
        } else {
            if (scrollEvent.getItemShown().booleanValue()) {
                return;
            }
            this.view.addBottomCardAnimation();
        }
    }

    static /* synthetic */ void lambda$handlePlaceHolderVisibilityChange$12(ScrollEvent scrollEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8896m(View.LifecycleEvent lifecycleEvent) {
        return this.view.socialMediaClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8897n(SocialMediaView.SocialMediaType socialMediaType) {
        this.appCoinsInfoNavigator.navigateToSocialMedia(socialMediaType);
        this.socialMediaAnalytics.sendPromoteSocialMediaClickEvent(socialMediaType);
    }

    static /* synthetic */ void lambda$handleSocialMediaPromotionClick$7(SocialMediaView.SocialMediaType socialMediaType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleSocialMediaPromotionClick$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8898o(Throwable th) {
        this.crashReport.log(th);
    }

    public void handleButtonText() {
        C11186e<R> m40060G = this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.d0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.l
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppCoinsInfoPresenter.this.m8886c((View.LifecycleEvent) obj);
            }
        });
        final AppCoinsInfoView appCoinsInfoView = this.view;
        appCoinsInfoView.getClass();
        C11186e m40091f = m40060G.m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.b
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoView.this.setButtonText(((Boolean) obj).booleanValue());
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C5032x c5032x = new InterfaceC11205b() { // from class: cm.aptoide.pt.view.x
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.lambda$handleButtonText$28((Boolean) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        m40091f.m40063H0(c5032x, new C4660a(crashReport));
    }

    public void handleClickOnAppcWalletLink() {
        C11186e m40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.e
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.n
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppCoinsInfoPresenter.this.m8887d((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.u
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.this.m8888e((Void) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4795g c4795g = new InterfaceC11205b() { // from class: cm.aptoide.pt.view.g
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.lambda$handleClickOnAppcWalletLink$25((Void) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        m40091f.m40063H0(c4795g, new C4660a(crashReport));
    }

    public void handleClickOnInstallButton() {
        C11186e m40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.q
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.y
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppCoinsInfoPresenter.this.m8891h((View.LifecycleEvent) obj);
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.h
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppCoinsInfoPresenter.this.m8892i((Void) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.k
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.this.m8893j((Boolean) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C5012t c5012t = new InterfaceC11205b() { // from class: cm.aptoide.pt.view.t
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.lambda$handleClickOnInstallButton$21((Boolean) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        m40091f.m40063H0(c5012t, new C4660a(crashReport));
    }

    public void handlePlaceHolderVisibilityChange() {
        C11186e m40091f = this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.m
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.z
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppCoinsInfoPresenter.this.m8894k((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.j
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.this.m8895l((ScrollEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY));
        C4799i c4799i = new InterfaceC11205b() { // from class: cm.aptoide.pt.view.i
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppCoinsInfoPresenter.lambda$handlePlaceHolderVisibilityChange$12((ScrollEvent) obj);
            }
        };
        CrashReport crashReport = this.crashReport;
        crashReport.getClass();
        m40091f.m40063H0(c4799i, new C4660a(crashReport));
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleClickOnAppcWalletLink();
        handleClickOnCatappultDevButton();
        handleClickOnInstallButton();
        handleButtonText();
        handlePlaceHolderVisibilityChange();
        handleSocialMediaPromotionClick();
        handleBonusPercentage();
    }
}
