package cm.aptoide.p092pt.install;

import cm.aptoide.p092pt.packageinstaller.InstallStatus;
import p456rx.C11186e;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public class AppInstallerStatusReceiver {
    private C11370b<InstallStatus> installStatusPublishSubject;

    public AppInstallerStatusReceiver(C11370b<InstallStatus> c11370b) {
        this.installStatusPublishSubject = c11370b;
    }

    public C11186e<InstallStatus> getInstallerInstallStatus() {
        return this.installStatusPublishSubject;
    }

    public void onStatusReceived(InstallStatus installStatus) {
        this.installStatusPublishSubject.onNext(installStatus);
    }
}
