package cm.aptoide.p092pt.view.app;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.app.AppsList;
import p456rx.AbstractC11195h;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class ListStoreAppsPresenter implements Presenter {
    private final AppCenter appCenter;
    private final CrashReport crashReport;
    private final int limit;
    private final ListStoreAppsNavigator navigator;
    private final long storeId;
    private final ListStoreAppsView view;
    private final AbstractC11195h viewScheduler;

    /* renamed from: cm.aptoide.pt.view.app.ListStoreAppsPresenter$1 */
    static /* synthetic */ class C46651 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$view$app$AppsList$Error;

        static {
            int[] iArr = new int[AppsList.Error.values().length];
            $SwitchMap$cm$aptoide$pt$view$app$AppsList$Error = iArr;
            try {
                iArr[AppsList.Error.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$view$app$AppsList$Error[AppsList.Error.GENERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ListStoreAppsPresenter(ListStoreAppsView listStoreAppsView, long j2, AbstractC11195h abstractC11195h, AppCenter appCenter, CrashReport crashReport, ListStoreAppsNavigator listStoreAppsNavigator, int i2) {
        this.view = listStoreAppsView;
        this.storeId = j2;
        this.viewScheduler = abstractC11195h;
        this.appCenter = appCenter;
        this.crashReport = crashReport;
        this.navigator = listStoreAppsNavigator;
        this.limit = i2;
    }

    private Single<AppsList> getApps() {
        return this.appCenter.getApps(this.storeId, this.limit).m39924p(this.viewScheduler).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.x1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8956a((AppsList) obj);
            }
        });
    }

    private void handleError(AppsList.Error error) {
        int i2 = C46651.$SwitchMap$cm$aptoide$pt$view$app$AppsList$Error[error.ordinal()];
        if (i2 == 1) {
            this.view.showNetworkError();
        } else {
            if (i2 != 2) {
                return;
            }
            this.view.showGenericError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getApps$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8956a(AppsList appsList) {
        if (appsList.hasErrors()) {
            handleError(appsList.getError());
        } else {
            if (appsList.isLoading()) {
                return;
            }
            this.view.setApps(appsList.getList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadFreshApps$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8957b(AppsList appsList) {
        this.view.hideRefreshLoading();
        if (appsList.hasErrors()) {
            handleError(appsList.getError());
        } else {
            if (appsList.isLoading()) {
                return;
            }
            this.view.setApps(appsList.getList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadShowNextApps$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8958c(AppsList appsList) {
        this.view.hideLoading();
        if (appsList.hasErrors()) {
            handleError(appsList.getError());
        } else {
            if (appsList.isLoading()) {
                return;
            }
            this.view.addApps(appsList.getList());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleAppClicks$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8959d(Application application) {
        this.navigator.navigateToAppView(application.getAppId(), application.getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleAppClicks$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8960e(View.LifecycleEvent lifecycleEvent) {
        return this.view.getAppClick().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.q1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8959d((Application) obj);
            }
        });
    }

    static /* synthetic */ void lambda$onCreateHandleAppClicks$27(Application application) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleAppClicks$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8961f(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleBottomReached$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8962g(Object obj) {
        this.view.showLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleBottomReached$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8963h(Object obj) {
        return loadShowNextApps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleBottomReached$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8964i(View.LifecycleEvent lifecycleEvent) {
        return this.view.reachesBottom().m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.e2
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8962g(obj);
            }
        }).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.u1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ListStoreAppsPresenter.this.m8963h(obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$onCreateHandleBottomReached$22(AppsList appsList) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleBottomReached$23, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8965j(Throwable th) {
        this.crashReport.log(th);
    }

    static /* synthetic */ void lambda$onCreateHandleRefresh$10(AppsList appsList) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleRefresh$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8966k(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleRefresh$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8967l(Void r1) {
        return loadFreshApps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleRefresh$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8968m(View.LifecycleEvent lifecycleEvent) {
        return this.view.getRefreshEvent().m40095j0(this.viewScheduler).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.v1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ListStoreAppsPresenter.this.m8967l((Void) obj);
            }
        }).m40110s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleRetry$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8969n(Void r1) {
        this.view.showStartingLoading();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleRetry$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8970o(Void r1) {
        return loadShowNextApps();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleRetry$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8971p(View.LifecycleEvent lifecycleEvent) {
        return this.view.getRetryEvent().m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.s1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8969n((Void) obj);
            }
        }).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.o1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ListStoreAppsPresenter.this.m8970o((Void) obj);
            }
        }).m40110s0();
    }

    static /* synthetic */ void lambda$onCreateHandleRetry$4(AppsList appsList) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateHandleRetry$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8972q(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadApps$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8973r(View.LifecycleEvent lifecycleEvent) {
        return getApps();
    }

    static /* synthetic */ void lambda$onCreateLoadApps$15(AppsList appsList) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreateLoadApps$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8974s(Throwable th) {
        this.crashReport.log(th);
    }

    private Single<AppsList> loadFreshApps() {
        return this.appCenter.loadFreshApps(this.storeId, this.limit).m39924p(this.viewScheduler).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.c2
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8957b((AppsList) obj);
            }
        });
    }

    private Single<AppsList> loadShowNextApps() {
        return this.appCenter.loadNextApps(this.storeId, this.limit).m39924p(this.viewScheduler).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.m1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8958c((AppsList) obj);
            }
        });
    }

    private void onCreateHandleAppClicks() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.r1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.d2
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ListStoreAppsPresenter.this.m8960e((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.n1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.lambda$onCreateHandleAppClicks$27((Application) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.a2
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8961f((Throwable) obj);
            }
        });
    }

    private void onCreateHandleBottomReached() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.g1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.i1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ListStoreAppsPresenter.this.m8964i((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.f1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.lambda$onCreateHandleBottomReached$22((AppsList) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.t1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8965j((Throwable) obj);
            }
        });
    }

    private void onCreateHandleRefresh() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.w1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.l1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ListStoreAppsPresenter.this.m8968m((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.z1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.lambda$onCreateHandleRefresh$10((AppsList) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.j1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8966k((Throwable) obj);
            }
        });
    }

    private void onCreateHandleRetry() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.c1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.d1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ListStoreAppsPresenter.this.m8971p((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.h1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.lambda$onCreateHandleRetry$4((AppsList) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.p1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8972q((Throwable) obj);
            }
        });
    }

    private void onCreateLoadApps() {
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.y1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.view.app.k1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ListStoreAppsPresenter.this.m8973r((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(View.LifecycleEvent.DESTROY)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.e1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.lambda$onCreateLoadApps$15((AppsList) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.view.app.b2
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ListStoreAppsPresenter.this.m8974s((Throwable) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        onCreateLoadApps();
        onCreateHandleAppClicks();
        onCreateHandleBottomReached();
        onCreateHandleRefresh();
        onCreateHandleRetry();
    }
}
