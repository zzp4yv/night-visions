package cm.aptoide.p092pt.install;

import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.install.Install;
import java.util.ArrayList;
import java.util.List;
import p241e.p294g.p306b.C8955c;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class InstallCompletedNotifier {
    private final List<App> appToCheck = new ArrayList();
    private final CrashReport crashReport;
    private final InstallManager installManager;
    private final C8955c<Void> watcher;

    /* JADX INFO: Access modifiers changed from: private */
    class App {
        private String md5;
        private String packageName;
        private int versionCode;

        public App(String str, int i2, String str2) {
            this.packageName = str;
            this.versionCode = i2;
            this.md5 = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            App app = (App) obj;
            if (this.versionCode == app.versionCode && this.packageName.equals(app.packageName)) {
                return this.md5.equals(app.md5);
            }
            return false;
        }

        public int hashCode() {
            return (((this.packageName.hashCode() * 31) + this.versionCode) * 31) + this.md5.hashCode();
        }
    }

    public InstallCompletedNotifier(C8955c<Void> c8955c, InstallManager installManager, CrashReport crashReport) {
        this.crashReport = crashReport;
        this.watcher = c8955c;
        this.installManager = installManager;
    }

    private void installFinished(App app) {
        this.appToCheck.remove(app);
        if (this.appToCheck.isEmpty()) {
            this.watcher.call(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$add$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8211a(App app, Install install) {
        installFinished(app);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$add$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8212b(Throwable th) {
        this.crashReport.log(th);
    }

    public void add(String str, int i2, String str2) {
        final App app = new App(str, i2, str2);
        if (this.appToCheck.contains(app)) {
            return;
        }
        this.appToCheck.add(app);
        this.installManager.getInstall(str2, str, i2).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.install.b0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((Install) obj).getState().equals(Install.InstallationStatus.INSTALLED));
                return valueOf;
            }
        }).m40057E().m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.install.a0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InstallCompletedNotifier.this.m8211a(app, (Install) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.install.z
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                InstallCompletedNotifier.this.m8212b((Throwable) obj);
            }
        });
    }

    public C8955c<Void> getWatcher() {
        return this.watcher;
    }
}
