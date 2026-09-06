package cm.aptoide.p092pt.install;

import android.os.Build;
import cm.aptoide.p092pt.AppInBackgroundTracker;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.notification.AptoideNotification;
import cm.aptoide.p092pt.notification.NotificationProvider;
import cm.aptoide.p092pt.notification.ReadyToInstallNotificationManager;
import cm.aptoide.p092pt.presenter.Presenter;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p474t.C11378b;

/* loaded from: classes.dex */
public class DownloadsNotificationsPresenter implements Presenter {
    private static final String TAG = "DownloadsNotificationsPresenter";
    private AppInBackgroundTracker appInBackgroundTracker;
    private InstallManager installManager;
    private NotificationProvider notificationProvider;
    private DownloadsNotification service;
    private C11378b subscriptions = new C11378b();

    public DownloadsNotificationsPresenter(DownloadsNotification downloadsNotification, InstallManager installManager, AppInBackgroundTracker appInBackgroundTracker, NotificationProvider notificationProvider) {
        this.service = downloadsNotification;
        this.installManager = installManager;
        this.appInBackgroundTracker = appInBackgroundTracker;
        this.notificationProvider = notificationProvider;
    }

    private void handleCurrentInstallation() {
        this.subscriptions.m40667a(this.installManager.getCurrentInstallation().m40117w(new InterfaceC11205b() { // from class: cm.aptoide.pt.install.r
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                DownloadsNotificationsPresenter.lambda$handleCurrentInstallation$0((Throwable) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.install.x
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                DownloadsNotificationsPresenter.this.m8205a((Install) obj);
            }
        }).m40113u(new InterfaceC11208e() { // from class: cm.aptoide.pt.install.a
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return ((Install) obj).getState();
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.install.t
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return DownloadsNotificationsPresenter.this.m8206b((Install) obj);
            }
        }).m40113u(new InterfaceC11208e() { // from class: cm.aptoide.pt.install.k3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return Integer.valueOf(((RoomDownload) obj).getOverallDownloadStatus());
            }
        }).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.install.s
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return DownloadsNotificationsPresenter.this.m8209e((RoomDownload) obj);
            }
        }).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.install.w
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                DownloadsNotificationsPresenter.lambda$handleCurrentInstallation$6((Boolean) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.install.y
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                DownloadsNotificationsPresenter.this.m8210f((Throwable) obj);
            }
        }));
    }

    private Single<Boolean> hasNextDownload() {
        return this.installManager.hasNextDownload();
    }

    static /* synthetic */ void lambda$handleCurrentInstallation$0(Throwable th) {
        th.printStackTrace();
        Logger.getInstance().m8273d(TAG, "error on getCurrentInstallation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCurrentInstallation$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8205a(Install install) {
        if (install.isIndeterminate()) {
            return;
        }
        this.service.setupProgressNotification(install.getMd5(), install.getAppName(), install.getProgress(), install.isIndeterminate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCurrentInstallation$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m8206b(Install install) {
        return this.installManager.getDownload(install.getMd5()).m39915A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCurrentInstallation$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8207c(RoomDownload roomDownload, Boolean bool) {
        return saveReadyToInstallNotification(roomDownload.getOverallDownloadStatus(), roomDownload.getIcon(), roomDownload.getAppName(), roomDownload.getPackageName(), roomDownload.getStoreName()).m39975c(Single.m39913m(bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCurrentInstallation$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8208d(Boolean bool) {
        Logger.getInstance().m8273d(TAG, "Has next downloads: " + bool);
        if (bool.booleanValue()) {
            return;
        }
        this.service.removeProgressNotificationAndStop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCurrentInstallation$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m8209e(final RoomDownload roomDownload) {
        Install.InstallationStatus m8221i = this.installManager.m8221i(roomDownload);
        Logger.getInstance().m8273d(TAG, "Received the state " + m8221i);
        return (m8221i == Install.InstallationStatus.DOWNLOADING || roomDownload.getOverallDownloadStatus() == 15) ? Single.m39913m(null) : hasNextDownload().m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.install.v
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return DownloadsNotificationsPresenter.this.m8207c(roomDownload, (Boolean) obj);
            }
        }).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.install.u
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                DownloadsNotificationsPresenter.this.m8208d((Boolean) obj);
            }
        });
    }

    static /* synthetic */ void lambda$handleCurrentInstallation$6(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleCurrentInstallation$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8210f(Throwable th) {
        this.service.removeProgressNotificationAndStop();
        th.printStackTrace();
    }

    private C11183b saveReadyToInstallNotification(int i2, String str, String str2, String str3, String str4) {
        if (Build.VERSION.SDK_INT < 29 || !this.appInBackgroundTracker.getIsAppInBackground() || i2 != 1) {
            return C11183b.m39946e();
        }
        return this.notificationProvider.save(new AptoideNotification(str, str2, "aptoideinstall://package=" + str3 + "&store=" + str4 + "&open_type=open_and_install&origin=" + ReadyToInstallNotificationManager.ORIGIN, str, 9));
    }

    public void onDestroy() {
        this.subscriptions.unsubscribe();
    }

    @Override // cm.aptoide.p092pt.presenter.Presenter
    public void present() {
        handleCurrentInstallation();
    }
}
