package cm.aptoide.p092pt.autoupdate;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.actions.PermissionManager;
import cm.aptoide.p092pt.actions.PermissionService;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: AutoUpdateManager.kt */
@Metadata(m32266d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017H\u0002J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00172\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0015J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0!J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00180!H\u0002J\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017J\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0017J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u0018H\u0002J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010'\u001a\u00020\u001cR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, m32267d2 = {"Lcm/aptoide/pt/autoupdate/AutoUpdateManager;", HttpUrl.FRAGMENT_ENCODE_SET, "downloadFactory", "Lcm/aptoide/pt/download/DownloadFactory;", "permissionManager", "Lcm/aptoide/pt/actions/PermissionManager;", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "downloadAnalytics", "Lcm/aptoide/pt/download/DownloadAnalytics;", "localVersionCode", HttpUrl.FRAGMENT_ENCODE_SET, "autoUpdateRepository", "Lcm/aptoide/pt/autoupdate/AutoUpdateRepository;", "localVersionSdk", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Lcm/aptoide/pt/download/DownloadFactory;Lcm/aptoide/pt/actions/PermissionManager;Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/download/DownloadAnalytics;ILcm/aptoide/pt/autoupdate/AutoUpdateRepository;ILandroid/content/SharedPreferences;)V", "AUTO_UPDATE_SHOW", HttpUrl.FRAGMENT_ENCODE_SET, "clearAutoUpdateShow", HttpUrl.FRAGMENT_ENCODE_SET, "getAutoUpdateModel", "Lrx/Observable;", "Lcm/aptoide/pt/autoupdate/AutoUpdateModel;", "getInstall", "Lcm/aptoide/pt/install/Install;", "hasDownloadPermissions", HttpUrl.FRAGMENT_ENCODE_SET, "permissionService", "Lcm/aptoide/pt/actions/PermissionService;", "incrementAutoUpdateShow", "isDownloadComplete", "Lrx/Single;", "loadAutoUpdateModel", "shouldShowAutoUpdateDialog", "shouldUpdate", "autoUpdateModel", "startUpdate", "shouldInstall", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public class AutoUpdateManager {
    private final String AUTO_UPDATE_SHOW;
    private final AutoUpdateRepository autoUpdateRepository;
    private final DownloadAnalytics downloadAnalytics;
    private final DownloadFactory downloadFactory;
    private final InstallManager installManager;
    private final int localVersionCode;
    private final int localVersionSdk;
    private final PermissionManager permissionManager;
    private final SharedPreferences sharedPreferences;

    public AutoUpdateManager(DownloadFactory downloadFactory, PermissionManager permissionManager, InstallManager installManager, DownloadAnalytics downloadAnalytics, int i2, AutoUpdateRepository autoUpdateRepository, int i3, SharedPreferences sharedPreferences) {
        C9768m.m32346f(downloadFactory, "downloadFactory");
        C9768m.m32346f(permissionManager, "permissionManager");
        C9768m.m32346f(installManager, "installManager");
        C9768m.m32346f(downloadAnalytics, "downloadAnalytics");
        C9768m.m32346f(autoUpdateRepository, "autoUpdateRepository");
        C9768m.m32346f(sharedPreferences, "sharedPreferences");
        this.downloadFactory = downloadFactory;
        this.permissionManager = permissionManager;
        this.installManager = installManager;
        this.downloadAnalytics = downloadAnalytics;
        this.localVersionCode = i2;
        this.autoUpdateRepository = autoUpdateRepository;
        this.localVersionSdk = i3;
        this.sharedPreferences = sharedPreferences;
        this.AUTO_UPDATE_SHOW = "showAutoUpdate";
    }

    private final C11186e<AutoUpdateModel> getAutoUpdateModel() {
        C11186e<AutoUpdateModel> m39915A = this.autoUpdateRepository.loadAutoUpdateModel().m39915A();
        C9768m.m32345e(m39915A, "autoUpdateRepository.loa…ateModel().toObservable()");
        return m39915A;
    }

    private final C11186e<Install> getInstall() {
        C11186e m40060G = getAutoUpdateModel().m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.autoupdate.r
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m40738getInstall$lambda7;
                m40738getInstall$lambda7 = AutoUpdateManager.m40738getInstall$lambda7(AutoUpdateManager.this, (AutoUpdateModel) obj);
                return m40738getInstall$lambda7;
            }
        });
        C9768m.m32345e(m40060G, "getAutoUpdateModel().fla…DownloadStarted() }\n    }");
        return m40060G;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getInstall$lambda-7, reason: not valid java name */
    public static final C11186e m40738getInstall$lambda7(AutoUpdateManager autoUpdateManager, AutoUpdateModel autoUpdateModel) {
        C9768m.m32346f(autoUpdateManager, "this$0");
        return autoUpdateManager.installManager.getInstall(autoUpdateModel.getMd5(), autoUpdateModel.getPackageName(), autoUpdateModel.getVersionCode()).m40059F(new InterfaceC11208e() { // from class: cm.aptoide.pt.autoupdate.l
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean m40739getInstall$lambda7$lambda6;
                m40739getInstall$lambda7$lambda6 = AutoUpdateManager.m40739getInstall$lambda7$lambda6((Install) obj);
                return m40739getInstall$lambda7$lambda6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getInstall$lambda-7$lambda-6, reason: not valid java name */
    public static final Boolean m40739getInstall$lambda7$lambda6(Install install) {
        return Boolean.valueOf(install.hasDownloadStarted());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDownloadComplete$lambda-3, reason: not valid java name */
    public static final Single m40740isDownloadComplete$lambda3(AutoUpdateManager autoUpdateManager, AutoUpdateModel autoUpdateModel) {
        C9768m.m32346f(autoUpdateManager, "this$0");
        return autoUpdateManager.installManager.getDownload(autoUpdateModel.getMd5());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isDownloadComplete$lambda-4, reason: not valid java name */
    public static final Boolean m40741isDownloadComplete$lambda4(RoomDownload roomDownload) {
        return Boolean.valueOf(roomDownload != null && roomDownload.getOverallDownloadStatus() == 1);
    }

    private final Single<AutoUpdateModel> loadAutoUpdateModel() {
        Single m39920i = this.autoUpdateRepository.loadFreshAutoUpdateModel().m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.autoupdate.n
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Single m40742loadAutoUpdateModel$lambda5;
                m40742loadAutoUpdateModel$lambda5 = AutoUpdateManager.m40742loadAutoUpdateModel$lambda5(AutoUpdateManager.this, (AutoUpdateModel) obj);
                return m40742loadAutoUpdateModel$lambda5;
            }
        });
        C9768m.m32345e(m39920i, "autoUpdateRepository.loa…utoUpdateModel)\n        }");
        return m39920i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadAutoUpdateModel$lambda-5, reason: not valid java name */
    public static final Single m40742loadAutoUpdateModel$lambda5(AutoUpdateManager autoUpdateManager, AutoUpdateModel autoUpdateModel) {
        C9768m.m32346f(autoUpdateManager, "this$0");
        if (!autoUpdateModel.wasSuccess()) {
            Single.m39911h(new Throwable(autoUpdateModel.getStatus().toString()));
        }
        C9768m.m32345e(autoUpdateModel, "it");
        if (autoUpdateManager.shouldUpdate(autoUpdateModel)) {
            autoUpdateModel = autoUpdateModel.copy((r18 & 1) != 0 ? autoUpdateModel.versionCode : 0, (r18 & 2) != 0 ? autoUpdateModel.uri : null, (r18 & 4) != 0 ? autoUpdateModel.md5 : null, (r18 & 8) != 0 ? autoUpdateModel.minSdk : null, (r18 & 16) != 0 ? autoUpdateModel.packageName : null, (r18 & 32) != 0 ? autoUpdateModel.shouldUpdate : true, (r18 & 64) != 0 ? autoUpdateModel.status : null, (r18 & 128) != 0 ? autoUpdateModel.loading : false);
        }
        return Single.m39913m(autoUpdateModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shouldUpdate$lambda-0, reason: not valid java name */
    public static final Boolean m40743shouldUpdate$lambda0(AutoUpdateModel autoUpdateModel) {
        return Boolean.valueOf(autoUpdateModel.getShouldUpdate());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startUpdate$lambda-2, reason: not valid java name */
    public static final C11186e m40744startUpdate$lambda2(final AutoUpdateManager autoUpdateManager, final boolean z, AutoUpdateModel autoUpdateModel) {
        C9768m.m32346f(autoUpdateManager, "this$0");
        return C11186e.m40025S(autoUpdateManager.downloadFactory.create(autoUpdateModel.getMd5(), autoUpdateModel.getVersionCode(), autoUpdateModel.getPackageName(), autoUpdateModel.getUri(), false)).m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.autoupdate.s
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m40745startUpdate$lambda2$lambda1;
                m40745startUpdate$lambda2$lambda1 = AutoUpdateManager.m40745startUpdate$lambda2$lambda1(AutoUpdateManager.this, z, (RoomDownload) obj);
                return m40745startUpdate$lambda2$lambda1;
            }
        }).m40083X0().m39974b(autoUpdateManager.getInstall());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: startUpdate$lambda-2$lambda-1, reason: not valid java name */
    public static final C11183b m40745startUpdate$lambda2$lambda1(AutoUpdateManager autoUpdateManager, boolean z, RoomDownload roomDownload) {
        C9768m.m32346f(autoUpdateManager, "this$0");
        return autoUpdateManager.installManager.install(roomDownload, z);
    }

    public final void clearAutoUpdateShow() {
        this.sharedPreferences.edit().putInt(this.AUTO_UPDATE_SHOW, 0).apply();
    }

    public final C11186e<Boolean> hasDownloadPermissions(PermissionService permissionService) {
        C9768m.m32346f(permissionService, "permissionService");
        C11186e<Boolean> hasDownloadAccess = this.permissionManager.hasDownloadAccess(permissionService);
        C9768m.m32345e(hasDownloadAccess, "permissionManager.hasDow…Access(permissionService)");
        return hasDownloadAccess;
    }

    public final void incrementAutoUpdateShow() {
        this.sharedPreferences.edit().putInt(this.AUTO_UPDATE_SHOW, this.sharedPreferences.getInt(this.AUTO_UPDATE_SHOW, 0) + 1).apply();
    }

    public final Single<Boolean> isDownloadComplete() {
        Single<Boolean> m40085Z0 = loadAutoUpdateModel().m39915A().m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.autoupdate.q
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Single m40740isDownloadComplete$lambda3;
                m40740isDownloadComplete$lambda3 = AutoUpdateManager.m40740isDownloadComplete$lambda3(AutoUpdateManager.this, (AutoUpdateModel) obj);
                return m40740isDownloadComplete$lambda3;
            }
        }).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.autoupdate.p
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean m40741isDownloadComplete$lambda4;
                m40741isDownloadComplete$lambda4 = AutoUpdateManager.m40741isDownloadComplete$lambda4((RoomDownload) obj);
                return m40741isDownloadComplete$lambda4;
            }
        }).m40085Z0();
        C9768m.m32345e(m40085Z0, "loadAutoUpdateModel().to…TED }\n        .toSingle()");
        return m40085Z0;
    }

    public final C11186e<Boolean> shouldShowAutoUpdateDialog() {
        int i2 = this.sharedPreferences.getInt(this.AUTO_UPDATE_SHOW, 0);
        C11186e<Boolean> m40025S = C11186e.m40025S(Boolean.valueOf(i2 % 5 == 0 || i2 == 1));
        C9768m.m32345e(m40025S, "just(result % 5 == 0 || result == 1)");
        return m40025S;
    }

    public final C11186e<Boolean> shouldUpdate() {
        C11186e m40082X = loadAutoUpdateModel().m39915A().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.autoupdate.m
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean m40743shouldUpdate$lambda0;
                m40743shouldUpdate$lambda0 = AutoUpdateManager.m40743shouldUpdate$lambda0((AutoUpdateModel) obj);
                return m40743shouldUpdate$lambda0;
            }
        });
        C9768m.m32345e(m40082X, "loadAutoUpdateModel().to…).map { it.shouldUpdate }");
        return m40082X;
    }

    public final C11186e<Install> startUpdate(final boolean z) {
        C11186e m40060G = getAutoUpdateModel().m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.autoupdate.o
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m40744startUpdate$lambda2;
                m40744startUpdate$lambda2 = AutoUpdateManager.m40744startUpdate$lambda2(AutoUpdateManager.this, z, (AutoUpdateModel) obj);
                return m40744startUpdate$lambda2;
            }
        });
        C9768m.m32345e(m40060G, "getAutoUpdateModel().fla…dThen(getInstall())\n    }");
        return m40060G;
    }

    private final boolean shouldUpdate(AutoUpdateModel autoUpdateModel) {
        return autoUpdateModel.getVersionCode() > this.localVersionCode && this.localVersionSdk >= Integer.parseInt(autoUpdateModel.getMinSdk());
    }
}
