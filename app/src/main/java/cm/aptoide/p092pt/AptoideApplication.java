package cm.aptoide.p092pt;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.work.AbstractC0818y;
import androidx.work.C0703b;
import cm.aptoide.accountmanager.Account;
import cm.aptoide.accountmanager.AdultContent;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.p092pt.account.AdultContentAnalytics;
import cm.aptoide.p092pt.account.MatureBodyInterceptorV7;
import cm.aptoide.p092pt.ads.AdsRepository;
import cm.aptoide.p092pt.analytics.FirstLaunchAnalytics;
import cm.aptoide.p092pt.crashreports.ConsoleLogger;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.database.RoomNotificationPersistence;
import cm.aptoide.p092pt.database.room.AptoideDatabase;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.cache.L2Cache;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p099v2.aptwords.AdsApplicationVersionCodeProvider;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.download.OemidProvider;
import cm.aptoide.p092pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.p092pt.file.CacheHelper;
import cm.aptoide.p092pt.file.FileManager;
import cm.aptoide.p092pt.install.AptoideInstalledAppsRepository;
import cm.aptoide.p092pt.install.InstallManager;
import cm.aptoide.p092pt.install.InstalledBroadcastReceiver;
import cm.aptoide.p092pt.install.PackageRepository;
import cm.aptoide.p092pt.install.installer.RootInstallationRetryHandler;
import cm.aptoide.p092pt.leak.LeakTool;
import cm.aptoide.p092pt.link.AptoideInstallParser;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.networking.AuthenticationPersistence;
import cm.aptoide.p092pt.networking.IdsRepository;
import cm.aptoide.p092pt.networking.Pnp1AuthorizationInterceptor;
import cm.aptoide.p092pt.notification.AptoideWorkerFactory;
import cm.aptoide.p092pt.notification.NotificationAnalytics;
import cm.aptoide.p092pt.notification.NotificationCenter;
import cm.aptoide.p092pt.notification.NotificationInfo;
import cm.aptoide.p092pt.notification.NotificationPolicyFactory;
import cm.aptoide.p092pt.notification.NotificationProvider;
import cm.aptoide.p092pt.notification.NotificationService;
import cm.aptoide.p092pt.notification.NotificationSyncScheduler;
import cm.aptoide.p092pt.notification.NotificationsCleaner;
import cm.aptoide.p092pt.notification.ReadyToInstallNotificationManager;
import cm.aptoide.p092pt.notification.SystemNotificationShower;
import cm.aptoide.p092pt.notification.sync.LocalNotificationSyncManager;
import cm.aptoide.p092pt.notification.sync.NotificationSyncFactory;
import cm.aptoide.p092pt.notification.sync.NotificationSyncManager;
import cm.aptoide.p092pt.preferences.AptoideMd5Manager;
import cm.aptoide.p092pt.preferences.PRNGFixes;
import cm.aptoide.p092pt.preferences.Preferences;
import cm.aptoide.p092pt.preferences.SecurePreferences;
import cm.aptoide.p092pt.preferences.managed.ManagedKeys;
import cm.aptoide.p092pt.preferences.secure.SecurePreferencesImplementation;
import cm.aptoide.p092pt.preferences.toolbox.ToolboxManager;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.root.RootAvailabilityManager;
import cm.aptoide.p092pt.search.suggestions.SearchSuggestionManager;
import cm.aptoide.p092pt.search.suggestions.TrendingManager;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreUtilsProxy;
import cm.aptoide.p092pt.sync.SyncScheduler;
import cm.aptoide.p092pt.sync.alarm.SyncStorage;
import cm.aptoide.p092pt.themes.NewFeature;
import cm.aptoide.p092pt.themes.NewFeatureManager;
import cm.aptoide.p092pt.themes.ThemeAnalytics;
import cm.aptoide.p092pt.updates.UpdateRepository;
import cm.aptoide.p092pt.utils.AptoideUtils;
import cm.aptoide.p092pt.utils.p106q.QManager;
import cm.aptoide.p092pt.view.ActivityModule;
import cm.aptoide.p092pt.view.ActivityProvider;
import cm.aptoide.p092pt.view.BaseActivity;
import cm.aptoide.p092pt.view.BaseFragment;
import cm.aptoide.p092pt.view.FragmentModule;
import cm.aptoide.p092pt.view.FragmentProvider;
import cm.aptoide.p092pt.view.configuration.implementation.VanillaActivityProvider;
import cm.aptoide.p092pt.view.configuration.implementation.VanillaFragmentProvider;
import cm.aptoide.p092pt.view.recycler.DisplayableWidgetMapping;
import com.facebook.C5608a0;
import com.facebook.p157o0.C5780a0;
import com.google.firebase.C8372j;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.rakam.api.C9197f;
import io.rakam.api.C9198g;
import io.sentry.C9214a4;
import io.sentry.C9647x4;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p024c.p078r.C0998a;
import p241e.p252d.p253a.C8743b;
import p241e.p252d.p253a.C8747f;
import p241e.p291f.p292a.p293a.C8923a;
import p241e.p294g.p306b.C8953a;
import p241e.p294g.p306b.C8955c;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p457l.p459c.C11202a;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public abstract class AptoideApplication extends Application {
    public static final String APPCOINS_WALLET_PACKAGE_NAME = "com.appcoins.wallet";
    public static final String APTOIDE_GAMES_PACKAGE_NAME = "com.aptoide.android.aptoidegames";
    static final String CACHE_FILE_NAME = "aptoide.wscache";
    public static final String GAMES_HUB_PACKAGE_NAME = "com.dti.folderlauncher";
    private static final String TAG = AptoideApplication.class.getName();
    private static ActivityProvider activityProvider;
    private static DisplayableWidgetMapping displayableWidgetMapping;
    private static FragmentProvider fragmentProvider;

    @Inject
    AptoideAccountManager accountManager;

    @Inject
    @Named
    BodyInterceptor<BaseBody> accountSettingsBodyInterceptorPoolV7;
    private BodyInterceptor<BaseBody> accountSettingsBodyInterceptorWebV7;

    @Inject
    AdsRepository adsRepository;

    @Inject
    AdultContent adultContent;

    @Inject
    AdultContentAnalytics adultContentAnalytics;

    @Inject
    SyncScheduler alarmSyncScheduler;

    @Inject
    AnalyticsManager analyticsManager;

    @Inject
    AppCoinsManager appCoinsManager;

    @Inject
    AppInBackgroundTracker appInBackgroundTracker;
    private ApplicationComponent applicationComponent;

    @Inject
    AdsApplicationVersionCodeProvider applicationVersionCodeProvider;
    private AptoideApplicationAnalytics aptoideApplicationAnalytics;

    @Inject
    AptoideDatabase aptoideDatabase;

    @Inject
    AptoideDownloadManager aptoideDownloadManager;

    @Inject
    AptoideInstalledAppsRepository aptoideInstalledAppsRepository;

    @Inject
    AptoideMd5Manager aptoideMd5Manager;

    @Inject
    AptoideWorkerFactory aptoideWorkerFactory;

    @Inject
    AuthenticationPersistence authenticationPersistence;

    @Inject
    @Named
    BodyInterceptor<BaseBody> bodyInterceptorPoolV7;

    @Inject
    @Named
    BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> bodyInterceptorV3;

    @Inject
    @Named
    BodyInterceptor<BaseBody> bodyInterceptorWebV7;

    @Inject
    CacheHelper cacheHelper;

    @Inject
    @Named
    OkHttpClient defaultClient;

    @Inject
    @Named
    List<String> defaultFollowedStores;

    @Inject
    FileManager fileManager;

    @Inject
    FirebaseAnalytics firebaseAnalytics;

    @Inject
    FirstLaunchAnalytics firstLaunchAnalytics;
    private Map<Integer, Result> fragmentResultMap;
    private C8953a<Map<Integer, Result>> fragmentResultRelay;

    @Inject
    L2Cache httpClientCache;

    @Inject
    IdsRepository idsRepository;

    @Inject
    InstallManager installManager;

    @Inject
    InvalidRefreshTokenLogoutManager invalidRefreshTokenLogoutManager;

    @Inject
    LaunchManager launchManager;
    private LeakTool leakTool;

    @Inject
    NavigationTracker navigationTracker;

    @Inject
    NewFeature newFeature;

    @Inject
    NewFeatureManager newFeatureManager;

    @Inject
    NotificationAnalytics notificationAnalytics;
    private NotificationCenter notificationCenter;

    @Inject
    RoomNotificationPersistence notificationPersistence;
    private NotificationProvider notificationProvider;
    private NotificationSyncScheduler notificationSyncScheduler;
    private NotificationsCleaner notificationsCleaner;
    private C8955c<NotificationInfo> notificationsPublishRelay;

    @Inject
    OemidProvider oemidProvider;
    private InstalledBroadcastReceiver packageChangeReceiver;

    @Inject
    PackageRepository packageRepository;

    @Inject
    Preferences preferences;

    @Inject
    QManager qManager;

    @Inject
    @Named
    String rakamBaseHost;

    @Inject
    ReadyToInstallNotificationManager readyToInstallNotificationManager;

    @Inject
    RootAvailabilityManager rootAvailabilityManager;

    @Inject
    RootInstallationRetryHandler rootInstallationRetryHandler;

    @Inject
    SearchSuggestionManager searchSuggestionManager;

    @Inject
    @Named
    SecurePreferences securePreferences;

    @Inject
    SettingsManager settingsManager;

    @Inject
    AptoideShortcutManager shortcutManager;

    @Inject
    StoreCredentialsProvider storeCredentials;

    @Inject
    StoreUtilsProxy storeUtilsProxy;

    @Inject
    SyncStorage syncStorage;

    @Inject
    ThemeAnalytics themeAnalytics;

    @Inject
    TokenInvalidator tokenInvalidator;

    @Inject
    TrendingManager trendingManager;

    @Inject
    UpdateRepository updateRepository;

    private void clearFileCache() {
        this.fileManager.purgeCache().m39929u(new InterfaceC11205b() { // from class: cm.aptoide.pt.y
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                Logger.getInstance().m8273d(AptoideApplication.TAG, "cleaned size: " + AptoideUtils.StringU.formatBytes(((Long) obj).longValue(), false));
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.e
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
    }

    private C11183b generateAptoideUuid() {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.q
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                AptoideApplication.this.m6811b();
            }
        });
    }

    public static ActivityProvider getActivityProvider() {
        return activityProvider;
    }

    public static DisplayableWidgetMapping getDisplayableWidgetMapping() {
        return displayableWidgetMapping;
    }

    public static FragmentProvider getFragmentProvider() {
        return fragmentProvider;
    }

    private Map<String, Object> getIndicativeProperties() {
        HashMap hashMap = new HashMap();
        hashMap.put("android_api_level", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("aptoide_version_code", Integer.valueOf(BuildConfig.VERSION_CODE));
        hashMap.put("android_brand", Build.MANUFACTURER);
        hashMap.put("android_model", Build.MODEL);
        return hashMap;
    }

    private NotificationsCleaner getNotificationCleaner() {
        if (this.notificationsCleaner == null) {
            this.notificationsCleaner = new NotificationsCleaner(this.notificationPersistence, Calendar.getInstance(TimeZone.getTimeZone("UTC")), this.accountManager, getNotificationProvider(), CrashReport.getInstance());
        }
        return this.notificationsCleaner;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAptoideAppsInstallationUserProperties() {
        C11186e<Boolean> m40119x = this.aptoideInstalledAppsRepository.isInstalled(APPCOINS_WALLET_PACKAGE_NAME).m40095j0(Schedulers.m40658io()).m40111t().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.p
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.this.m6812c((Boolean) obj);
            }
        });
        C3579m c3579m = new InterfaceC11205b() { // from class: cm.aptoide.pt.m
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.lambda$handleAptoideAppsInstallationUserProperties$13((Boolean) obj);
            }
        };
        C3729p0 c3729p0 = new InterfaceC11205b() { // from class: cm.aptoide.pt.p0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        };
        m40119x.m40063H0(c3579m, c3729p0);
        this.aptoideInstalledAppsRepository.isInstalled(GAMES_HUB_PACKAGE_NAME).m40095j0(Schedulers.m40658io()).m40111t().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.n
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.this.m6813d((Boolean) obj);
            }
        }).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.o
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.lambda$handleAptoideAppsInstallationUserProperties$15((Boolean) obj);
            }
        }, c3729p0);
        this.aptoideInstalledAppsRepository.isInstalled(APTOIDE_GAMES_PACKAGE_NAME).m40095j0(Schedulers.m40658io()).m40111t().m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.d
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.this.m6814e((Boolean) obj);
            }
        }).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.g
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.lambda$handleAptoideAppsInstallationUserProperties$17((Boolean) obj);
            }
        }, c3729p0);
    }

    private void initializeFlurry(Context context, String str) {
        new C8743b.a().m27936d(false).m27934b(true).m27935c(true).m27937e(C8747f.f33392d).m27933a(context, str);
    }

    private C11183b initializeIndicative() {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.b0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                AptoideApplication.this.m6815f();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initializeRakam, reason: merged with bridge method [inline-methods] */
    public void m6816g() {
        C9198g m29891a = C9197f.m29891a();
        try {
            m29891a.m29963z(this, new URL(this.rakamBaseHost), BuildConfig.RAKAM_API_KEY);
        } catch (MalformedURLException e2) {
            Logger.getInstance().m8278e(TAG, "error: ", e2);
        }
        m29891a.m29943U(this.idsRepository.getAndroidId());
        m29891a.m29954h0(true);
        m29891a.m29948Z(2);
        m29891a.m29944V(1);
    }

    private C11183b initializeRakamSdk() {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.i
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                AptoideApplication.this.m6816g();
            }
        }).m39967K(Schedulers.newThread());
    }

    private C11183b initializeSentry() {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.c0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                C9214a4.m30042l(new C9214a4.a() { // from class: cm.aptoide.pt.j
                    @Override // io.sentry.C9214a4.a
                    /* renamed from: a */
                    public final void mo8271a(C9647x4 c9647x4) {
                        AptoideApplication.lambda$initializeSentry$19(c9647x4);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$generateAptoideUuid$26, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6811b() {
        this.idsRepository.getUniqueIdentifier();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideAppsInstallationUserProperties$12, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6812c(Boolean bool) {
        C8923a.m28533f("is_wallet_app_installed", bool.booleanValue());
        this.firebaseAnalytics.m24949b("is_wallet_app_installed", String.valueOf(bool));
    }

    static /* synthetic */ void lambda$handleAptoideAppsInstallationUserProperties$13(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideAppsInstallationUserProperties$14, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6813d(Boolean bool) {
        C8923a.m28533f("is_gh_installed", bool.booleanValue());
        this.firebaseAnalytics.m24949b("is_gh_installed", String.valueOf(bool));
    }

    static /* synthetic */ void lambda$handleAptoideAppsInstallationUserProperties$15(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleAptoideAppsInstallationUserProperties$16, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6814e(Boolean bool) {
        C8923a.m28533f("is_ag_installed", bool.booleanValue());
        this.firebaseAnalytics.m24949b("is_ag_installed", String.valueOf(bool));
    }

    static /* synthetic */ void lambda$handleAptoideAppsInstallationUserProperties$17(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initializeIndicative$18, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6815f() {
        C8923a.m28540m(getApplicationContext(), BuildConfig.INDICATIVE_KEY);
        C8923a.m28547v(this.idsRepository.getAndroidId());
        C8923a.m28530c(getIndicativeProperties());
    }

    static /* synthetic */ void lambda$initializeSentry$19(C9647x4 c9647x4) {
        c9647x4.setDsn(BuildConfig.SENTRY_DSN_KEY);
        c9647x4.setRelease(BuildConfig.VERSION_NAME);
        c9647x4.setEnableAutoSessionTracking(true);
        c9647x4.setSessionTrackingIntervalMillis(LocalNotificationSyncManager.FIVE_MINUTES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreate$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Void m6817h() throws Exception {
        return this.aptoideMd5Manager.calculateMd5Sum();
    }

    static /* synthetic */ void lambda$onCreate$1(Void r0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreate$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6818i(Boolean bool) {
        this.aptoideApplicationAnalytics.updateDimension(bool.booleanValue());
    }

    static /* synthetic */ void lambda$onCreate$5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onCreate$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6819j(Boolean bool) {
        if (bool.booleanValue()) {
            this.rootInstallationRetryHandler.start();
        }
    }

    static /* synthetic */ void lambda$onCreate$8(Boolean bool) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$sendAptoideApplicationStartAnalytics$25, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6820k(boolean z) {
        this.aptoideApplicationAnalytics.setPackageDimension(getPackageName());
        this.aptoideApplicationAnalytics.setVersionCodeDimension(getVersionCode());
        this.aptoideApplicationAnalytics.sendIsTvEvent(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startNotificationCenter$21, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6821l(Boolean bool) {
        getNotificationSyncScheduler().setEnabled(bool.booleanValue());
    }

    private C11183b sendAppStartToAnalytics() {
        return this.firstLaunchAnalytics.sendAppStart(this, SecurePreferencesImplementation.getInstance(getApplicationContext(), getDefaultSharedPreferences()), this.idsRepository);
    }

    private C11183b sendAptoideApplicationStartAnalytics(final boolean z) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.x
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                AptoideApplication.this.m6820k(z);
            }
        });
    }

    private C11183b setUpFirstRunAnalytics() {
        return sendAppStartToAnalytics();
    }

    private void startNotificationCenter() {
        getPreferences().getBoolean(ManagedKeys.CAMPAIGN_SOCIAL_NOTIFICATIONS_PREFERENCE_VIEW_KEY, true).m40057E().m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.d0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.this.m6821l((Boolean) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.u
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
        getNotificationCenter().setup();
    }

    private void startNotificationCleaner() {
        getNotificationCleaner().setup();
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C0998a.m6356k(this);
    }

    public ActivityProvider createActivityProvider() {
        return new VanillaActivityProvider();
    }

    protected DisplayableWidgetMapping createDisplayableWidgetMapping() {
        return DisplayableWidgetMapping.getInstance();
    }

    public FragmentProvider createFragmentProvider() {
        return new VanillaFragmentProvider();
    }

    public AptoideAccountManager getAccountManager() {
        return this.accountManager;
    }

    public BodyInterceptor<BaseBody> getAccountSettingsBodyInterceptorPoolV7() {
        return this.accountSettingsBodyInterceptorPoolV7;
    }

    public BodyInterceptor<BaseBody> getAccountSettingsBodyInterceptorWebV7() {
        if (this.accountSettingsBodyInterceptorWebV7 == null) {
            this.accountSettingsBodyInterceptorWebV7 = new MatureBodyInterceptorV7(this.bodyInterceptorWebV7, this.adultContent);
        }
        return this.accountSettingsBodyInterceptorWebV7;
    }

    public String getAccountType() {
        return "cm.aptoide.pt";
    }

    public ActivityModule getActivityModule(BaseActivity baseActivity, Intent intent, NotificationSyncScheduler notificationSyncScheduler, View view, boolean z, String str) {
        return new ActivityModule(baseActivity, intent, notificationSyncScheduler, view, z, str);
    }

    public AdsRepository getAdsRepository() {
        return this.adsRepository;
    }

    public AdultContentAnalytics getAdultContentAnalytics() {
        return this.adultContentAnalytics;
    }

    public SyncScheduler getAlarmSyncScheduler() {
        return this.alarmSyncScheduler;
    }

    public AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public AppCoinsManager getAppCoinsManager() {
        return this.appCoinsManager;
    }

    public ApplicationComponent getApplicationComponent() {
        if (this.applicationComponent == null) {
            this.applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).flavourApplicationModule(new FlavourApplicationModule(this)).build();
        }
        return this.applicationComponent;
    }

    protected String getAptoidePackage() {
        return "cm.aptoide.pt";
    }

    public AuthenticationPersistence getAuthenticationPersistence() {
        return this.authenticationPersistence;
    }

    public BodyInterceptor<BaseBody> getBodyInterceptorPoolV7() {
        return this.bodyInterceptorPoolV7;
    }

    public BodyInterceptor<cm.aptoide.p092pt.dataprovider.p097ws.p100v3.BaseBody> getBodyInterceptorV3() {
        return this.bodyInterceptorV3;
    }

    public OkHttpClient getDefaultClient() {
        return this.defaultClient;
    }

    public SharedPreferences getDefaultSharedPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(this);
    }

    public AptoideDownloadManager getDownloadManager() {
        return this.aptoideDownloadManager;
    }

    public String getExtraId() {
        return null;
    }

    public String getFeedbackEmail() {
        return "support@aptoide.com";
    }

    public FragmentModule getFragmentModule(BaseFragment baseFragment, Bundle bundle, Bundle bundle2, boolean z, String str) {
        return new FragmentModule(baseFragment, bundle, bundle2, z, str);
    }

    @SuppressLint({"UseSparseArrays"})
    public Map<Integer, Result> getFragmentResultMap() {
        if (this.fragmentResultMap == null) {
            this.fragmentResultMap = new HashMap();
        }
        return this.fragmentResultMap;
    }

    public C8953a<Map<Integer, Result>> getFragmentResultRelay() {
        if (this.fragmentResultRelay == null) {
            this.fragmentResultRelay = C8953a.m28588f1();
        }
        return this.fragmentResultRelay;
    }

    public IdsRepository getIdsRepository() {
        return this.idsRepository;
    }

    public InstallManager getInstallManager() {
        return this.installManager;
    }

    public LeakTool getLeakTool() {
        if (this.leakTool == null) {
            this.leakTool = new LeakTool();
        }
        return this.leakTool;
    }

    public NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public NewFeature getNewFeature() {
        return this.newFeature;
    }

    public NewFeatureManager getNewFeatureManager() {
        return this.newFeatureManager;
    }

    public NotificationAnalytics getNotificationAnalytics() {
        return this.notificationAnalytics;
    }

    public NotificationCenter getNotificationCenter() {
        if (this.notificationCenter == null) {
            NotificationProvider notificationProvider = getNotificationProvider();
            this.notificationCenter = new NotificationCenter(notificationProvider, getNotificationSyncScheduler(), new NotificationPolicyFactory(notificationProvider, this.aptoideInstalledAppsRepository), new NotificationAnalytics(new AptoideInstallParser(), this.analyticsManager, this.navigationTracker));
        }
        return this.notificationCenter;
    }

    public NotificationProvider getNotificationProvider() {
        if (this.notificationProvider == null) {
            this.notificationProvider = new NotificationProvider(new RoomNotificationPersistence(this.aptoideDatabase.notificationDao()), Schedulers.m40658io());
        }
        return this.notificationProvider;
    }

    public NotificationSyncScheduler getNotificationSyncScheduler() {
        if (this.notificationSyncScheduler == null) {
            SyncScheduler alarmSyncScheduler = getAlarmSyncScheduler();
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.notificationSyncScheduler = new NotificationSyncManager(alarmSyncScheduler, true, new NotificationSyncFactory(new NotificationService("cm.aptoide.pt", builder.readTimeout(45L, timeUnit).writeTimeout(45L, timeUnit).addInterceptor(new Pnp1AuthorizationInterceptor(getAuthenticationPersistence(), getTokenInvalidator())).build(), WebService.getDefaultConverter(), getIdsRepository(), BuildConfig.VERSION_NAME, getExtraId(), getDefaultSharedPreferences(), getResources(), getAccountManager()), getNotificationProvider()));
        }
        return this.notificationSyncScheduler;
    }

    public C8955c<NotificationInfo> getNotificationsPublishRelay() {
        if (this.notificationsPublishRelay == null) {
            this.notificationsPublishRelay = C8955c.m28593f1();
        }
        return this.notificationsPublishRelay;
    }

    public PackageRepository getPackageRepository() {
        return this.packageRepository;
    }

    public String getPartnerId() {
        return this.oemidProvider.getOemid();
    }

    public Preferences getPreferences() {
        return this.preferences;
    }

    public QManager getQManager() {
        return this.qManager;
    }

    public ReadyToInstallNotificationManager getReadyToInstallNotificationManager() {
        return this.readyToInstallNotificationManager;
    }

    public RootAvailabilityManager getRootAvailabilityManager() {
        return this.rootAvailabilityManager;
    }

    public SearchSuggestionManager getSearchSuggestionManager() {
        return this.searchSuggestionManager;
    }

    public SettingsManager getSettingsManager() {
        return this.settingsManager;
    }

    public StoreCredentialsProvider getStoreCredentials() {
        return this.storeCredentials;
    }

    public SyncStorage getSyncStorage() {
        return this.syncStorage;
    }

    protected abstract SystemNotificationShower getSystemNotificationShower();

    public ThemeAnalytics getThemeAnalytics() {
        return this.themeAnalytics;
    }

    public TokenInvalidator getTokenInvalidator() {
        return this.tokenInvalidator;
    }

    public TrendingManager getTrendingManager() {
        return this.trendingManager;
    }

    public String getVersionCode() {
        try {
            return String.valueOf(getPackageManager().getPackageInfo(getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            return "NaN";
        }
    }

    public AdsApplicationVersionCodeProvider getVersionCodeProvider() {
        return this.applicationVersionCodeProvider;
    }

    public boolean isCreateStoreUserPrivacyEnabled() {
        return true;
    }

    @Override // android.app.Application
    public void onCreate() {
        getApplicationComponent().inject(this);
        if (Build.VERSION.SDK_INT < 26) {
            InstalledBroadcastReceiver installedBroadcastReceiver = new InstalledBroadcastReceiver();
            this.packageChangeReceiver = installedBroadcastReceiver;
            installedBroadcastReceiver.register(this);
        }
        this.appInBackgroundTracker.initialize();
        CrashReport.getInstance().addLogger(new ConsoleLogger());
        Logger.setDBG(ToolboxManager.isDebug(getDefaultSharedPreferences()));
        Single.m39912l(new Callable() { // from class: cm.aptoide.pt.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return AptoideApplication.this.m6817h();
            }
        }).m39930v(Schedulers.m40658io()).m39924p(C11202a.m40156b()).m39929u(new InterfaceC11205b() { // from class: cm.aptoide.pt.k
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.lambda$onCreate$1((Void) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.e0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
        try {
            PRNGFixes.apply();
        } catch (Exception e2) {
            CrashReport.getInstance().log(e2);
        }
        C8372j.m26394o(this);
        super.onCreate();
        long currentTimeMillis = System.currentTimeMillis();
        getLeakTool().setup(this);
        fragmentProvider = createFragmentProvider();
        activityProvider = createActivityProvider();
        displayableWidgetMapping = createDisplayableWidgetMapping();
        this.analyticsManager.setup();
        UiModeManager uiModeManager = (UiModeManager) getSystemService("uimode");
        this.aptoideApplicationAnalytics = new AptoideApplicationAnalytics(this.analyticsManager, this.firebaseAnalytics);
        AbstractC0818y.m5239i(this, new C0703b.b().m4797c(this.aptoideWorkerFactory).m4796b(3).m4795a());
        C5608a0.m11273M(this);
        C5780a0.m12161a(this);
        C5780a0.m12162e(this);
        initializeFlurry(this, BuildConfig.FLURRY_KEY);
        C11183b m39958A = generateAptoideUuid().m39973a(C11183b.m39956x(initializeRakamSdk(), initializeSentry(), initializeIndicative())).m39973a(this.aptoideInstalledAppsRepository.syncWithDevice(APPCOINS_WALLET_PACKAGE_NAME)).m39973a(C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.b
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                AptoideApplication.this.handleAptoideAppsInstallationUserProperties();
            }
        })).m39981n(new InterfaceC11205b() { // from class: cm.aptoide.pt.v
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }).m39958A();
        C11183b[] c11183bArr = new C11183b[2];
        c11183bArr[0] = sendAptoideApplicationStartAnalytics(uiModeManager.getCurrentModeType() == 4);
        c11183bArr[1] = this.aptoideInstalledAppsRepository.syncWithDevice().m39967K(Schedulers.computation());
        m39958A.m39973a(C11183b.m39956x(c11183bArr)).m39981n(new InterfaceC11205b() { // from class: cm.aptoide.pt.w
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        }).m39958A().m39973a(setUpFirstRunAnalytics()).m39973a(this.launchManager.launch().m39967K(Schedulers.computation())).m39965I(new InterfaceC11204a() { // from class: cm.aptoide.pt.f
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                AptoideApplication.lambda$onCreate$5();
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.a0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                CrashReport.getInstance().log((Throwable) obj);
            }
        });
        clearFileCache();
        startNotificationCenter();
        startNotificationCleaner();
        this.rootAvailabilityManager.isRootAvailable().m39919g(new InterfaceC11205b() { // from class: cm.aptoide.pt.l
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.this.m6819j((Boolean) obj);
            }
        }).m39929u(new InterfaceC11205b() { // from class: cm.aptoide.pt.h
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.lambda$onCreate$8((Boolean) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.z
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
        this.accountManager.accountStatus().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.t
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(((Account) obj).isLoggedIn());
                return valueOf;
            }
        }).m40111t().m40061G0(new InterfaceC11205b() { // from class: cm.aptoide.pt.s
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                AptoideApplication.this.m6818i((Boolean) obj);
            }
        });
        Logger.getInstance().m8283v(TAG, String.format("onCreate took %d millis.", Long.valueOf(System.currentTimeMillis() - currentTimeMillis)));
        this.invalidRefreshTokenLogoutManager.start();
        this.installManager.start();
    }
}
