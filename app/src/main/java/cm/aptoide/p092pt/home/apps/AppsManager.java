package cm.aptoide.p092pt.home.apps;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsManager;
import cm.aptoide.p092pt.aab.DynamicSplitsModel;
import cm.aptoide.p092pt.ads.MoPubAdsManager;
import cm.aptoide.p092pt.app.aptoideinstall.AptoideInstallManager;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignManager;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignUrl;
import cm.aptoide.p092pt.database.room.RoomCampaignUrl;
import cm.aptoide.p092pt.database.room.RoomDownload;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.download.DownloadAnalytics;
import cm.aptoide.p092pt.download.DownloadFactory;
import cm.aptoide.p092pt.download.InstallType;
import cm.aptoide.p092pt.download.Origin;
import cm.aptoide.p092pt.download.SplitAnalyticsMapper;
import cm.aptoide.p092pt.home.apps.model.DownloadApp;
import cm.aptoide.p092pt.home.apps.model.InstalledApp;
import cm.aptoide.p092pt.home.apps.model.StateApp;
import cm.aptoide.p092pt.home.apps.model.UpdateApp;
import cm.aptoide.p092pt.install.Install;
import cm.aptoide.p092pt.install.InstallAnalytics;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.notification.UpdatesNotificationManager;
import cm.aptoide.p092pt.preferences.secure.SecurePreferences;
import cm.aptoide.p092pt.updates.UpdatesAnalytics;
import cm.aptoide.p092pt.utils.AptoideUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import p319g.p320a.p321a.p322a.C9026d;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;

/* loaded from: classes.dex */
public class AppsManager {
    private final AppMapper appMapper;
    private final AptoideInstallManager aptoideInstallManager;
    private final CampaignManager campaignManager;
    private final Context context;
    private final DownloadAnalytics downloadAnalytics;
    private final DownloadFactory downloadFactory;
    private final DynamicSplitsManager dynamicSplitsManager;
    private final InstallAnalytics installAnalytics;
    private final InstallManager installManager;
    private final MoPubAdsManager moPubAdsManager;
    private final PackageManager packageManager;
    private final SharedPreferences secureSharedPreferences;
    private final SplitAnalyticsMapper splitAnalyticsMapper;
    private final UpdatesAnalytics updatesAnalytics;
    private final UpdatesManager updatesManager;
    private final UpdatesNotificationManager updatesNotificationManager;

    public AppsManager(UpdatesManager updatesManager, InstallManager installManager, AppMapper appMapper, DownloadAnalytics downloadAnalytics, InstallAnalytics installAnalytics, UpdatesAnalytics updatesAnalytics, PackageManager packageManager, Context context, DownloadFactory downloadFactory, MoPubAdsManager moPubAdsManager, AptoideInstallManager aptoideInstallManager, UpdatesNotificationManager updatesNotificationManager, SharedPreferences sharedPreferences, DynamicSplitsManager dynamicSplitsManager, SplitAnalyticsMapper splitAnalyticsMapper, CampaignManager campaignManager) {
        this.updatesManager = updatesManager;
        this.installManager = installManager;
        this.appMapper = appMapper;
        this.downloadAnalytics = downloadAnalytics;
        this.installAnalytics = installAnalytics;
        this.updatesAnalytics = updatesAnalytics;
        this.packageManager = packageManager;
        this.context = context;
        this.downloadFactory = downloadFactory;
        this.moPubAdsManager = moPubAdsManager;
        this.aptoideInstallManager = aptoideInstallManager;
        this.updatesNotificationManager = updatesNotificationManager;
        this.secureSharedPreferences = sharedPreferences;
        this.dynamicSplitsManager = dynamicSplitsManager;
        this.splitAnalyticsMapper = splitAnalyticsMapper;
        this.campaignManager = campaignManager;
    }

    private C11186e<List<UpdateApp>> getAllUpdatesList() {
        return this.updatesManager.getUpdatesList().m40111t().m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.l0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7956d((List) obj);
            }
        });
    }

    private Origin getOrigin(int i2) {
        return i2 != 1 ? i2 != 2 ? Origin.INSTALL : Origin.DOWNGRADE : Origin.UPDATE;
    }

    private C11186e<List<UpdateApp>> getUpdateDownloadsList() {
        return this.installManager.getInstallations().m40111t().m40077R0(200L, TimeUnit.MILLISECONDS).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.s
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7960h((List) obj);
            }
        });
    }

    private void handleNotEnoughSpaceError(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAllUpdatesList$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ UpdateApp m7954b(RoomUpdate roomUpdate, Boolean bool) {
        return this.appMapper.mapUpdateToUpdateApp(roomUpdate, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAllUpdatesList$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7955c(final RoomUpdate roomUpdate) {
        return this.aptoideInstallManager.isInstalledWithAptoide(roomUpdate.getPackageName()).m39923n(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.p
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7954b(roomUpdate, (Boolean) obj);
            }
        });
    }

    static /* synthetic */ Integer lambda$getAllUpdatesList$2(UpdateApp updateApp, UpdateApp updateApp2) {
        if (!updateApp.isInstalledWithAptoide() || updateApp2.isInstalledWithAptoide()) {
            return (updateApp.isInstalledWithAptoide() || !updateApp2.isInstalledWithAptoide()) ? 0 : 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAllUpdatesList$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m7956d(List list) {
        return C11186e.m40020N(list).m40072M(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.g0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7955c((RoomUpdate) obj);
            }
        }, false, 1).m40087a1(new InterfaceC11209f() { // from class: cm.aptoide.pt.home.apps.j0
            @Override // p456rx.p460m.InterfaceC11209f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                return AppsManager.lambda$getAllUpdatesList$2((UpdateApp) obj, (UpdateApp) obj2);
            }
        });
    }

    static /* synthetic */ Iterable lambda$getDownloadApps$11(List list) {
        return list;
    }

    static /* synthetic */ Boolean lambda$getDownloadApps$12(Install install) {
        Install.InstallationType type = install.getType();
        Install.InstallationType installationType = Install.InstallationType.UPDATE;
        return Boolean.valueOf(type != installationType || (install.getType() == installationType && install.getState() == Install.InstallationStatus.UNINSTALLED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getDownloadApps$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m7957e(List list) {
        if (list == null || list.isEmpty()) {
            return C11186e.m40025S(Collections.emptyList());
        }
        C11186e m40055D = C11186e.m40025S(list).m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.d0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                List list2 = (List) obj;
                AppsManager.lambda$getDownloadApps$11(list2);
                return list2;
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.b0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.lambda$getDownloadApps$12((Install) obj);
            }
        });
        final InstallManager installManager = this.installManager;
        installManager.getClass();
        C11186e m40119x = m40055D.m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.x3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return InstallManager.this.filterInstalled((Install) obj);
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.s0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0 != null);
                return valueOf;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.home.apps.m0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                Logger.getInstance().m8273d("Apps", "filtered installed - is not installed -> " + r1.getPackageName() + " " + r1.getMd5() + " " + ((Install) obj).getVersionName());
            }
        }).m40084Y0().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.home.apps.r
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                Logger.getInstance().m8273d("Apps", "emit list of installs from getDownloadApps - after toList");
            }
        });
        final AppMapper appMapper = this.appMapper;
        appMapper.getClass();
        return m40119x.m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.q3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppMapper.this.getDownloadApps((List) obj);
            }
        });
    }

    static /* synthetic */ Iterable lambda$getInstalledApps$9(List list) {
        return list;
    }

    static /* synthetic */ Iterable lambda$getUpdateDownloadsList$4(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getUpdateDownloadsList$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ UpdateApp m7958f(Install install, Boolean bool) {
        return this.appMapper.mapInstallToUpdateApp(install, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getUpdateDownloadsList$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7959g(final Install install) {
        return this.aptoideInstallManager.isInstalledWithAptoide(install.getPackageName()).m39923n(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.r0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7958f(install, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getUpdateDownloadsList$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m7960h(List list) {
        return (list == null || list.isEmpty()) ? C11186e.m40025S(new ArrayList()) : C11186e.m40025S(list).m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.v
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                List list2 = (List) obj;
                AppsManager.lambda$getUpdateDownloadsList$4(list2);
                return list2;
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.z
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getType() == Install.InstallationType.UPDATE);
                return valueOf;
            }
        }).m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.i0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7959g((Install) obj);
            }
        }).m40084Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleDownloadAbort$31, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7961i(String str, RoomUpdate roomUpdate) {
        this.downloadAnalytics.sendDownloadAbortEvent(str, roomUpdate.getUpdateVersionCode(), InstallType.UPDATE, false, roomUpdate.hasSplits(), roomUpdate.hasAppc(), roomUpdate.getTrustedBadge(), roomUpdate.getStoreName(), false, (roomUpdate.getMainObbMd5() == null || roomUpdate.getMainObbMd5().isEmpty()) ? false : true, roomUpdate.getStoreName().equals("catappult"), HttpUrl.FRAGMENT_ENCODE_SET, roomUpdate.getSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$installApp$17, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m7962j(App app, Install install) {
        if (install.getState() != Install.InstallationStatus.INSTALLED) {
            return resumeDownload(app, install.getType().toString());
        }
        AptoideUtils.SystemU.openApp(((DownloadApp) app).getPackageName(), this.packageManager, this.context);
        return C11183b.m39957y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$observeOutOfSpaceApps$30, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7963k(List list) {
        handleNotEnoughSpaceError((String) list.get(list.size() - 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAll$24, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7965m(List list) {
        this.updatesAnalytics.sendUpdateAllClickEvent();
    }

    static /* synthetic */ Iterable lambda$updateAll$25(List list) {
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAll$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7966n(RoomUpdate roomUpdate, RoomDownload roomDownload) {
        this.updatesAnalytics.sendUpdateClickedEvent(roomUpdate.getPackageName(), roomUpdate.hasSplits(), roomUpdate.hasAppc(), false, roomUpdate.getTrustedBadge(), null, roomUpdate.getStoreName(), "update_all", (roomUpdate.getMainObbMd5() == null || roomUpdate.getMainObbMd5().isEmpty()) ? false : true, roomUpdate.getSize());
        setupUpdateEvents(roomDownload, Origin.UPDATE_ALL, null, roomUpdate.getTrustedBadge(), roomUpdate.getStoreName(), "update_all");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAll$27, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m7967o(final RoomUpdate roomUpdate, DynamicSplitsModel dynamicSplitsModel) {
        return C11186e.m40025S(this.downloadFactory.create(roomUpdate, false, dynamicSplitsModel.getDynamicSplitsList())).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.home.apps.n0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppsManager.this.m7966n(roomUpdate, (RoomDownload) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateAll$28, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m7968p(final RoomUpdate roomUpdate) {
        return C9026d.m29126d(this.dynamicSplitsManager.getAppSplitsByMd5(roomUpdate.getMd5())).m39922k(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.p0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7967o(roomUpdate, (DynamicSplitsModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateApp$19, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7969q(RoomUpdate roomUpdate) {
        return C9026d.m29123a(this.campaignManager.convertCampaign(recreateCampaign(roomUpdate), "Apps")).m39975c(Single.m39913m(roomUpdate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateApp$20, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7970r(RoomUpdate roomUpdate, String str, DynamicSplitsModel dynamicSplitsModel) {
        RoomDownload create = this.downloadFactory.create(roomUpdate, false, dynamicSplitsModel.getDynamicSplitsList());
        this.updatesAnalytics.sendUpdateClickedEvent(str, roomUpdate.hasSplits(), roomUpdate.hasAppc(), false, roomUpdate.getTrustedBadge(), null, roomUpdate.getStoreName(), "update", (roomUpdate.getMainObbMd5() == null || roomUpdate.getMainObbMd5().isEmpty()) ? false : true, roomUpdate.getSize());
        setupUpdateEvents(create, Origin.UPDATE, roomUpdate.getTrustedBadge(), null, roomUpdate.getStoreName(), "update");
        return Single.m39913m(create);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateApp$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7971s(final String str, final RoomUpdate roomUpdate) {
        return C9026d.m29126d(this.dynamicSplitsManager.getAppSplitsByMd5(roomUpdate.getMd5())).m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.m
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7970r(roomUpdate, str, (DynamicSplitsModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateApp$22, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11183b m7972t(RoomDownload roomDownload) {
        return this.installManager.m8236x(roomDownload);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$updateFirstLoadUpdatesSettings$29, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7973u() {
        SecurePreferences.setUpdatesFirstLoad(false, this.secureSharedPreferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<UpdateApp> mergeUpdates(List<UpdateApp> list, List<UpdateApp> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            UpdateApp updateApp = list.get(i2);
            Iterator<UpdateApp> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    UpdateApp next = it.next();
                    if (updateApp.getMd5().equals(next.getMd5())) {
                        arrayList.set(i2, next);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    private C11186e<List<UpdateApp>> observeAllUpdates() {
        return C11186e.m40041e(getAllUpdatesList(), getUpdateDownloadsList(), new InterfaceC11209f() { // from class: cm.aptoide.pt.home.apps.e0
            @Override // p456rx.p460m.InterfaceC11209f
            /* renamed from: a */
            public final Object mo6865a(Object obj, Object obj2) {
                List mergeUpdates;
                mergeUpdates = AppsManager.this.mergeUpdates((List) obj, (List) obj2);
                return mergeUpdates;
            }
        });
    }

    private Campaign recreateCampaign(RoomUpdate roomUpdate) {
        ArrayList arrayList = new ArrayList();
        for (RoomCampaignUrl roomCampaignUrl : roomUpdate.getDownloadCampaigns()) {
            arrayList.add(new CampaignUrl(roomCampaignUrl.getName(), roomCampaignUrl.getUrl()));
        }
        return new Campaign(Collections.emptyList(), Collections.emptyList(), arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setupDownloadEvents, reason: merged with bridge method [inline-methods] */
    public void m7964l(RoomDownload roomDownload, String str) {
        DownloadAnalytics downloadAnalytics = this.downloadAnalytics;
        String md5 = roomDownload.getMd5();
        String packageName = roomDownload.getPackageName();
        int versionCode = roomDownload.getVersionCode();
        AnalyticsManager.Action action = AnalyticsManager.Action.INSTALL;
        downloadAnalytics.installClicked(md5, packageName, versionCode, action, false, roomDownload.hasAppc(), roomDownload.hasSplits(), roomDownload.getTrustedBadge(), (String) null, roomDownload.getStoreName(), str, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), roomDownload.getStoreName().equals("catappult"), HttpUrl.FRAGMENT_ENCODE_SET, roomDownload.getSize());
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), action, DownloadAnalytics.AppContext.APPS_FRAGMENT, getOrigin(roomDownload.getAction()), false, roomDownload.hasAppc(), roomDownload.hasSplits(), roomDownload.getTrustedBadge(), roomDownload.getStoreName(), roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), roomDownload.getStoreName().equals("catappult"), HttpUrl.FRAGMENT_ENCODE_SET, roomDownload.getSize());
    }

    private void setupUpdateEvents(RoomDownload roomDownload, Origin origin, String str, String str2, String str3, String str4) {
        DownloadAnalytics downloadAnalytics = this.downloadAnalytics;
        String md5 = roomDownload.getMd5();
        String packageName = roomDownload.getPackageName();
        int versionCode = roomDownload.getVersionCode();
        AnalyticsManager.Action action = AnalyticsManager.Action.INSTALL;
        downloadAnalytics.installClicked(md5, packageName, versionCode, action, false, roomDownload.hasAppc(), roomDownload.hasSplits(), str, str2, str3, str4, roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), roomDownload.getStoreName().equals("catappult"), HttpUrl.FRAGMENT_ENCODE_SET, roomDownload.getSize());
        this.installAnalytics.installStarted(roomDownload.getPackageName(), roomDownload.getVersionCode(), action, DownloadAnalytics.AppContext.APPS_FRAGMENT, origin, false, roomDownload.hasAppc(), roomDownload.hasSplits(), roomDownload.getTrustedBadge(), roomDownload.getStoreName(), roomDownload.hasObbs(), this.splitAnalyticsMapper.getSplitTypesAsString(roomDownload.getSplits()), roomDownload.getStoreName().equals("catappult"), HttpUrl.FRAGMENT_ENCODE_SET, roomDownload.getSize());
    }

    private C11183b startUpdatesNotification() {
        return this.updatesNotificationManager.setUpNotification();
    }

    private C11183b updateFirstLoadUpdatesSettings() {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.home.apps.o0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                AppsManager.this.m7973u();
            }
        });
    }

    public C11183b cancelDownload(App app) {
        StateApp stateApp = (StateApp) app;
        return this.installManager.cancelInstall(stateApp.getMd5(), stateApp.getPackageName(), stateApp.getVersionCode());
    }

    public C11183b excludeUpdate(App app) {
        return this.updatesManager.excludeUpdate(((UpdateApp) app).getPackageName());
    }

    public C11186e<List<DownloadApp>> getDownloadApps() {
        return this.installManager.getInstallations().m40077R0(200L, TimeUnit.MILLISECONDS).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.y
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7957e((List) obj);
            }
        });
    }

    public C11186e<List<InstalledApp>> getInstalledApps() {
        C11186e<R> m40066J = this.installManager.fetchInstalled().m40111t().m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.t
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                List list = (List) obj;
                AppsManager.lambda$getInstalledApps$9(list);
                return list;
            }
        });
        final UpdatesManager updatesManager = this.updatesManager;
        updatesManager.getClass();
        C11186e m40084Y0 = m40066J.m40070L(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.z3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdatesManager.this.filterUpdates((RoomInstalled) obj);
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.c0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0 != null);
                return valueOf;
            }
        }).m40084Y0();
        final AppMapper appMapper = this.appMapper;
        appMapper.getClass();
        return m40084Y0.m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.c
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppMapper.this.mapInstalledToInstalledApps((List) obj);
            }
        });
    }

    public C11186e<List<UpdateApp>> getUpdatesList() {
        return SecurePreferences.isUpdatesFirstLoad(this.secureSharedPreferences) ? this.updatesManager.refreshUpdates().m39963G(updateFirstLoadUpdatesSettings()).m39973a(startUpdatesNotification()).m39974b(observeAllUpdates()) : observeAllUpdates();
    }

    public C11183b handleDownloadAbort(final String str) {
        return this.updatesManager.getUpdate(str).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.home.apps.f0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppsManager.this.m7961i(str, (RoomUpdate) obj);
            }
        }).m39934z().m39958A();
    }

    public C11183b installApp(final App app) {
        DownloadApp downloadApp = (DownloadApp) app;
        return this.installManager.getInstall(downloadApp.getMd5(), downloadApp.getPackageName(), downloadApp.getVersionCode()).m40057E().m40062H(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.u
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7962j(app, (Install) obj);
            }
        }).m40083X0();
    }

    public C11186e<List<String>> observeOutOfSpaceApps() {
        return this.installManager.getDownloadOutOfSpaceMd5List().m40111t().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.home.apps.a0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppsManager.this.m7963k((List) obj);
            }
        });
    }

    public C11183b pauseDownload(App app) {
        return this.installManager.pauseInstall(((StateApp) app).getMd5());
    }

    public C11183b refreshAllUpdates() {
        return this.updatesManager.refreshUpdates();
    }

    public C11183b resumeDownload(App app, final String str) {
        Single<RoomDownload> m39919g = this.installManager.getDownload(((StateApp) app).getMd5()).m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.home.apps.o
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppsManager.this.m7964l(str, (RoomDownload) obj);
            }
        });
        final InstallManager installManager = this.installManager;
        installManager.getClass();
        return m39919g.m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.a
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return InstallManager.this.m8236x((RoomDownload) obj);
            }
        });
    }

    public void setAppViewAnalyticsEvent() {
        this.updatesAnalytics.updates(UpdatesAnalytics.OPEN_APP_VIEW);
    }

    public boolean showWarning() {
        return this.installManager.showWarning();
    }

    public void storeRootAnswer(boolean z) {
        this.installManager.rootInstallAllowed(z);
    }

    public C11183b updateAll() {
        C11186e m40084Y0 = this.updatesManager.getUpdatesList().m40057E().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.x
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                List list = (List) obj;
                valueOf = Boolean.valueOf(!list.isEmpty());
                return valueOf;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.home.apps.k0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AppsManager.this.m7965m((List) obj);
            }
        }).m40066J(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.w
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                List list = (List) obj;
                AppsManager.lambda$updateAll$25(list);
                return list;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.q
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7968p((RoomUpdate) obj);
            }
        }).m40084Y0();
        final InstallManager installManager = this.installManager;
        installManager.getClass();
        return m40084Y0.m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.r3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return InstallManager.this.startInstalls((List) obj);
            }
        }).m40083X0();
    }

    public C11183b updateApp(App app) {
        final String packageName = ((UpdateApp) app).getPackageName();
        return this.updatesManager.getUpdate(packageName).m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.q0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7969q((RoomUpdate) obj);
            }
        }).m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.h0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7971s(packageName, (RoomUpdate) obj);
            }
        }).m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.n
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return AppsManager.this.m7972t((RoomDownload) obj);
            }
        }).m39958A();
    }
}
