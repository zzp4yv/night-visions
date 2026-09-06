package cm.aptoide.p092pt.notification.view;

import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.notification.AptoideNotification;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.notification.NotificationCenter;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import java.util.List;
import p456rx.AbstractC11195h;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class InboxPresenter implements Presenter {
    private final int NUMBER_OF_NOTIFICATIONS = 50;
    private final NotificationAnalytics analytics;
    private final CrashReport crashReport;
    private final NavigationTracker navigationTracker;
    private final NotificationCenter notificationCenter;
    private final InboxView view;
    private final AbstractC11195h viewScheduler;

    public InboxPresenter(InboxView inboxView, NotificationCenter notificationCenter, CrashReport crashReport, NavigationTracker navigationTracker, NotificationAnalytics notificationAnalytics, AbstractC11195h abstractC11195h) {
        this.view = inboxView;
        this.notificationCenter = notificationCenter;
        this.crashReport = crashReport;
        this.navigationTracker = navigationTracker;
        this.analytics = notificationAnalytics;
        this.viewScheduler = abstractC11195h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8380a(View.LifecycleEvent lifecycleEvent) {
        return this.notificationCenter.getInboxNotifications(50);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m8381b(View.LifecycleEvent lifecycleEvent) {
        return this.notificationCenter.setAllNotificationsRead();
    }

    static /* synthetic */ void lambda$present$12(View.LifecycleEvent lifecycleEvent) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$13, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8382c(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8383d(List list) {
        if (list.isEmpty()) {
            this.view.showEmptyState();
        } else {
            this.view.showNotifications(list);
        }
    }

    static /* synthetic */ void lambda$present$3(List list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8384e(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8385f(View.LifecycleEvent lifecycleEvent) {
        return this.view.notificationSelection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8386g(AptoideNotification aptoideNotification) {
        this.analytics.sendNotificationTouchEvent(aptoideNotification.getNotificationCenterUrlTrack());
        this.navigationTracker.registerScreen(ScreenTagHistory.Builder.build(getClass().getSimpleName()));
    }

    static /* synthetic */ void lambda$present$8(AptoideNotification aptoideNotification) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$present$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8387h(Throwable th) {
        this.crashReport.log(th);
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        C11186e m40119x = this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.view.b
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.view.d
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return InboxPresenter.this.m8380a((View.LifecycleEvent) obj);
            }
        }).m40095j0(this.viewScheduler).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.view.f
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InboxPresenter.this.m8383d((List) obj);
            }
        });
        InboxView inboxView = this.view;
        View.LifecycleEvent lifecycleEvent = View.LifecycleEvent.DESTROY;
        m40119x.m40091f(inboxView.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.view.g
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InboxPresenter.lambda$present$3((List) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.view.n
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InboxPresenter.this.m8384e((Throwable) obj);
            }
        });
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.view.e
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.view.m
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return InboxPresenter.this.m8385f((View.LifecycleEvent) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.view.l
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InboxPresenter.this.m8386g((AptoideNotification) obj);
            }
        }).m40091f(this.view.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.view.c
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InboxPresenter.lambda$present$8((AptoideNotification) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.view.j
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InboxPresenter.this.m8387h((Throwable) obj);
            }
        });
        this.view.getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.view.k
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((View.LifecycleEvent) obj).equals(View.LifecycleEvent.CREATE));
                return valueOf;
            }
        }).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.notification.view.a
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return InboxPresenter.this.m8381b((View.LifecycleEvent) obj);
            }
        }).m40091f(this.view.bindUntilEvent(lifecycleEvent)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.view.h
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InboxPresenter.lambda$present$12((View.LifecycleEvent) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.notification.view.i
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InboxPresenter.this.m8382c((Throwable) obj);
            }
        });
    }
}
