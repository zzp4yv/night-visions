package cm.aptoide.p092pt;

import android.app.NotificationManager;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.notification.NotificationIdsMapper;
import cm.aptoide.p092pt.notification.NotificationInfo;
import cm.aptoide.p092pt.notification.SystemNotificationShower;
import cm.aptoide.p092pt.presenter.NotificationView;
import cm.aptoide.p092pt.presenter.Presenter;
import cm.aptoide.p092pt.presenter.View;
import com.trello.rxlifecycle.C8724c;
import com.trello.rxlifecycle.InterfaceC8723b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p473s.C11369a;
import p456rx.p474t.C11378b;

/* loaded from: classes.dex */
public class NotificationApplicationView extends AptoideApplication implements NotificationView {
    private C11369a<View.LifecycleEvent> lifecycleEventBehaviorSubject;
    private SystemNotificationShower systemNotificationShower;

    @Override // cm.aptoide.p092pt.presenter.View
    public void attachPresenter(Presenter presenter) {
        presenter.present();
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public <T> InterfaceC8723b<T> bindUntilEvent(View.LifecycleEvent lifecycleEvent) {
        return C8724c.m27898b(getLifecycleEvent(), lifecycleEvent);
    }

    @Override // cm.aptoide.p092pt.presenter.NotificationView
    public C11186e<NotificationInfo> getActionBootCompleted() {
        return getNotificationsPublishRelay().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.n0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((NotificationInfo) obj).getAction().equals("android.intent.action.BOOT_COMPLETED"));
                return valueOf;
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.View
    public C11186e<View.LifecycleEvent> getLifecycleEvent() {
        return this.lifecycleEventBehaviorSubject;
    }

    @Override // cm.aptoide.p092pt.presenter.NotificationView
    public C11186e<NotificationInfo> getNotificationClick() {
        return getNotificationsPublishRelay().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.m0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((NotificationInfo) obj).getAction().equals(SystemNotificationShower.NOTIFICATION_PRESSED_ACTION));
                return valueOf;
            }
        });
    }

    @Override // cm.aptoide.p092pt.presenter.NotificationView
    public C11186e<NotificationInfo> getNotificationDismissed() {
        return getNotificationsPublishRelay().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.o0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((NotificationInfo) obj).getAction().equals(SystemNotificationShower.NOTIFICATION_DISMISSED_ACTION));
                return valueOf;
            }
        });
    }

    @Override // cm.aptoide.p092pt.AptoideApplication
    protected SystemNotificationShower getSystemNotificationShower() {
        if (this.systemNotificationShower == null) {
            this.systemNotificationShower = new SystemNotificationShower(this, (NotificationManager) getSystemService("notification"), new NotificationIdsMapper(), getNotificationCenter(), getNotificationAnalytics(), CrashReport.getInstance(), getNotificationProvider(), this, new C11378b(), getNavigationTracker(), getNewFeatureManager(), getThemeAnalytics(), getReadyToInstallNotificationManager());
        }
        return this.systemNotificationShower;
    }

    @Override // cm.aptoide.p092pt.AptoideApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        C11369a<View.LifecycleEvent> m40634g1 = C11369a.m40634g1();
        this.lifecycleEventBehaviorSubject = m40634g1;
        m40634g1.onNext(View.LifecycleEvent.CREATE);
        attachPresenter(getSystemNotificationShower());
    }
}
