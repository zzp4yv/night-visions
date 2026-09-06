package cm.aptoide.p092pt.store.view;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;
import androidx.viewpager.widget.AbstractC0694a;
import androidx.viewpager.widget.ViewPager;
import cm.aptoide.accountmanager.AptoideAccountManager;
import cm.aptoide.analytics.AnalyticsManager;
import cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import cm.aptoide.p092pt.AptoideApplication;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.app.AppNavigator;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationActivity;
import cm.aptoide.p092pt.bottomNavigation.BottomNavigationItem;
import cm.aptoide.p092pt.crashreports.CrashReport;
import cm.aptoide.p092pt.dataprovider.WebService;
import cm.aptoide.p092pt.dataprovider.exception.AptoideWsV7Exception;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Event;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetHome;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStore;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStoreTabs;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.StoreUserAbstraction;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetHomeRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.GetStoreRequest;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.store.StoreContext;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.search.SearchNavigator;
import cm.aptoide.p092pt.search.SuggestionCursorAdapter;
import cm.aptoide.p092pt.search.analytics.SearchAnalytics;
import cm.aptoide.p092pt.search.suggestions.TrendingManager;
import cm.aptoide.p092pt.search.view.AppSearchSuggestionsView;
import cm.aptoide.p092pt.search.view.SearchSuggestionsPresenter;
import cm.aptoide.p092pt.share.ShareStoreHelper;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreAnalytics;
import cm.aptoide.p092pt.store.StoreCredentialsProvider;
import cm.aptoide.p092pt.store.StoreError;
import cm.aptoide.p092pt.store.StoreUtils;
import cm.aptoide.p092pt.themes.ThemeManager;
import cm.aptoide.p092pt.util.MarketResourceFormatter;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.custom.AptoideViewPager;
import cm.aptoide.p092pt.view.fragment.BasePagerToolbarFragment;
import com.astuetz.PagerSlidingTabStrip;
import com.trello.rxlifecycle.p234g.EnumC8729b;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p241e.p294g.p295a.p297b.p302c.p303a.C8938e;
import p241e.p294g.p295a.p304c.C8942a;
import p456rx.C11186e;
import p456rx.p457l.p459c.C11202a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p473s.C11370b;
import retrofit2.Converter;

/* loaded from: classes.dex */
public class StoreFragment extends BasePagerToolbarFragment {
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.STORES;
    private AptoideAccountManager accountManager;

    @Inject
    AnalyticsManager analyticsManager;

    @Inject
    AppNavigator appNavigator;
    private AppSearchSuggestionsView appSearchSuggestionsView;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private BottomNavigationActivity bottomNavigationActivity;
    private Converter.Factory converterFactory;
    private CrashReport crashReport;
    private Event.Name defaultTab;
    private OkHttpClient httpClient;
    private String iconPath;

    @Inject
    @Named
    String marketName;

    @Inject
    MarketResourceFormatter marketResourceFormatter;

    @Inject
    NavigationTracker navigationTracker;
    private OpenType openType;
    protected PagerSlidingTabStrip pagerSlidingTabStrip;
    private Runnable registerViewpagerCurrentItem;
    private SearchAnalytics searchAnalytics;
    private SearchNavigator searchNavigator;
    private ShareStoreHelper shareStoreHelper;
    private SharedPreferences sharedPreferences;
    private StoreAnalytics storeAnalytics;
    private StoreContext storeContext;

    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private Long storeId;
    private String storeName;

    @Inject
    RoomStoreRepository storeRepository;
    private String storeTheme;
    private String storeUrl;
    private List<GetStoreTabs.Tab> tabs;

    @Inject
    ThemeManager themeManager;
    private String title;
    private TokenInvalidator tokenInvalidator;
    private TrendingManager trendingManager;
    private Long userId;
    private final int PRIVATE_STORE_REQUEST_CODE = 20;
    ViewPager.C0692m pageChangeListener = new ViewPager.C0692m() { // from class: cm.aptoide.pt.store.view.StoreFragment.1
        @Override // androidx.viewpager.widget.ViewPager.C0692m, androidx.viewpager.widget.ViewPager.InterfaceC0689j
        public void onPageSelected(int i2) {
            if (i2 == 0) {
                StoreFragment.this.navigationTracker.registerScreen(ScreenTagHistory.Builder.build(getClass().getSimpleName(), "home", StoreFragment.this.storeContext.name()));
            }
        }
    };

    /* renamed from: cm.aptoide.pt.store.view.StoreFragment$3 */
    static /* synthetic */ class C44273 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$store$StoreError;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$store$view$StoreFragment$OpenType;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse;

        static {
            int[] iArr = new int[GenericDialogs.EResponse.values().length];
            $SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse = iArr;
            try {
                iArr[GenericDialogs.EResponse.NO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse[GenericDialogs.EResponse.YES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse[GenericDialogs.EResponse.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[StoreError.values().length];
            $SwitchMap$cm$aptoide$pt$store$StoreError = iArr2;
            try {
                iArr2[StoreError.PRIVATE_STORE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$store$StoreError[StoreError.PRIVATE_STORE_WRONG_CREDENTIALS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$store$StoreError[StoreError.STORE_SUSPENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[OpenType.values().length];
            $SwitchMap$cm$aptoide$pt$store$view$StoreFragment$OpenType = iArr3;
            try {
                iArr3[OpenType.GetHome.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$cm$aptoide$pt$store$view$StoreFragment$OpenType[OpenType.GetStore.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private enum BundleKeys {
        STORE_NAME,
        STORE_CONTEXT,
        STORE_THEME,
        DEFAULT_TAB_TO_OPEN,
        USER_ID,
        OPEN_TYPE
    }

    public enum OpenType {
        GetHome,
        GetStore
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleError, reason: merged with bridge method [inline-methods] */
    public void m8816h(Throwable th) {
        if (!(th instanceof AptoideWsV7Exception)) {
            finishLoading(th);
            return;
        }
        int i2 = C44273.$SwitchMap$cm$aptoide$pt$store$StoreError[StoreUtils.getErrorType(((AptoideWsV7Exception) th).getBaseResponse().getError().getCode()).ordinal()];
        if (i2 == 1 || i2 == 2) {
            if (((DialogInterfaceOnCancelListenerC0466c) getFragmentManager().m3488j0(PrivateStoreDialog.TAG)) == null) {
                PrivateStoreDialog.newInstance(this, 20, this.storeName, true).show(getFragmentManager(), PrivateStoreDialog.TAG);
            }
        } else {
            if (i2 == 3) {
                showStoreSuspendedPopup(this.storeName);
            }
            finishLoading(th);
        }
    }

    private void handleOptionsItemSelected(final C11186e<MenuItem> c11186e) {
        getLifecycleEvent().m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.store.view.j1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 == View.LifecycleEvent.RESUME);
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.store.view.f1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e c11186e2 = C11186e.this;
                StoreFragment.lambda$handleOptionsItemSelected$2(c11186e2, (View.LifecycleEvent) obj);
                return c11186e2;
            }
        }).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.store.view.i1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 != null && r1.getItemId() == C1138R.id.menu_item_share);
                return valueOf;
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.m1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                StoreFragment.this.m8813e((MenuItem) obj);
            }
        }).m40091f(bindUntilEvent(View.LifecycleEvent.PAUSE)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.k1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                StoreFragment.lambda$handleOptionsItemSelected$5((MenuItem) obj);
            }
        }, new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.g1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                StoreFragment.this.m8814f((Throwable) obj);
            }
        });
    }

    static /* synthetic */ C11186e lambda$handleOptionsItemSelected$2(C11186e c11186e, View.LifecycleEvent lifecycleEvent) {
        return c11186e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOptionsItemSelected$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8813e(MenuItem menuItem) {
        this.shareStoreHelper.shareStore(this.storeUrl);
    }

    static /* synthetic */ void lambda$handleOptionsItemSelected$5(MenuItem menuItem) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleOptionsItemSelected$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8814f(Throwable th) {
        this.crashReport.log(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$load$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8815g(String str) {
        this.title = str;
        if (this.storeContext != StoreContext.home) {
            setupToolbarDetails(getToolbar());
        }
        setupViewPager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadData$10, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m8817i(GetStore getStore) {
        setupVariables(parseTabs(getStore), Long.valueOf(getStore.getNodes().getMeta().getData().getId()), getStore.getNodes().getMeta().getData().getName(), getStore.getNodes().getMeta().getData().getUrls().getMobile(), getStore.getNodes().getMeta().getData().getAvatar());
        return getStore.getNodes().getMeta().getData().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$loadData$9, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ String m8818j(GetHome getHome) {
        Store store = getHome.getNodes().getMeta().getData().getStore();
        String name = store != null ? store.getName() : null;
        setupVariables(parseTabs(getHome), store != null ? Long.valueOf(store.getId()) : null, name, this.storeUrl, store != null ? store.getAvatar() : null);
        return TextUtils.isEmpty(name) ? getHome.getNodes().getMeta().getData().getUser().getName() : name;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$setupViewPager$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8819k() {
        this.pageChangeListener.onPageSelected(this.viewPager.getCurrentItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$showStoreSuspendedPopup$11, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m8820l(String str, GenericDialogs.EResponse eResponse) {
        int i2 = C44273.$SwitchMap$cm$aptoide$pt$utils$GenericDialogs$EResponse[eResponse.ordinal()];
        if (i2 == 1) {
            StoreUtils.unSubscribeStore(str, this.accountManager, this.storeCredentialsProvider, this.storeRepository);
        } else if (i2 != 2 && i2 != 3) {
            return;
        }
        getActivity().onBackPressed();
    }

    private C11186e<String> loadData(boolean z, OpenType openType) {
        return C44273.$SwitchMap$cm$aptoide$pt$store$view$StoreFragment$OpenType[openType.ordinal()] != 1 ? GetStoreRequest.m7491of(StoreUtils.getStoreCredentials(this.storeName, this.storeCredentialsProvider), this.storeContext, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, getContext().getResources(), (WindowManager) getContext().getSystemService("window")).observe(z).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.store.view.e1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return StoreFragment.this.m8817i((GetStore) obj);
            }
        }) : GetHomeRequest.m7486of(StoreUtils.getStoreCredentials(this.storeName, this.storeCredentialsProvider), this.userId, this.storeContext, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, getContext().getResources(), (WindowManager) getContext().getSystemService("window")).observe(z).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.store.view.n1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return StoreFragment.this.m8818j((GetHome) obj);
            }
        });
    }

    public static StoreFragment newInstance(long j2, String str, OpenType openType) {
        return newInstance(j2, str, (Event.Name) null, openType);
    }

    private List<GetStoreTabs.Tab> parseTabs(StoreUserAbstraction<?> storeUserAbstraction) {
        GetStoreTabs.Tab tab = storeUserAbstraction.getNodes().getTabs().getList().get(0);
        if (tab.getEvent().getAction().contains("/getStore/")) {
            tab.getEvent().setName(Event.Name.getStoreWidgets);
            tab.getEvent().setAction(tab.getEvent().getAction().replace("/getStore/", "/getStoreWidgets/"));
        }
        return storeUserAbstraction.getNodes().getTabs().getList();
    }

    private void setupVariables(List<GetStoreTabs.Tab> list, Long l, String str, String str2, String str3) {
        this.tabs = list;
        this.storeId = l;
        this.storeName = str;
        this.storeUrl = str2;
        this.iconPath = str3;
    }

    private void showStoreSuspendedPopup(final String str) {
        GenericDialogs.createGenericOkCancelMessage(getContext(), HttpUrl.FRAGMENT_ENCODE_SET, C1138R.string.store_suspended_message, R.string.ok, C1138R.string.unfollow, this.themeManager.getAttributeForTheme(C1138R.attr.dialogsTheme).resourceId).m40061G0(new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.l1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                StoreFragment.this.m8820l(str, (GenericDialogs.EResponse) obj);
            }
        });
    }

    protected void changeToTab(Event.Name name) {
        if (name != null) {
            if ((this.viewPager.getAdapter() instanceof StorePagerAdapter ? (StorePagerAdapter) this.viewPager.getAdapter() : null) != null) {
                AptoideViewPager aptoideViewPager = this.viewPager;
                aptoideViewPager.setCurrentItem(((StorePagerAdapter) aptoideViewPager.getAdapter()).getEventNamePosition(name));
            }
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BasePagerToolbarFragment
    protected AbstractC0694a createPagerAdapter() {
        return new StorePagerAdapter(getChildFragmentManager(), this.tabs, this.storeContext, this.storeId, this.storeTheme, getContext().getApplicationContext(), this.marketName);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    protected boolean displayHomeUpAsEnabled() {
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.UiComponent
    public int getContentViewId() {
        return C1138R.layout.store_activity;
    }

    @Override // cm.aptoide.p092pt.view.fragment.NavigationTrackFragment
    public ScreenTagHistory getHistoryTracker() {
        String simpleName = getClass().getSimpleName();
        StoreContext storeContext = this.storeContext;
        return ScreenTagHistory.Builder.build(simpleName, HttpUrl.FRAGMENT_ENCODE_SET, storeContext != null ? storeContext.name() : null);
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment
    protected int getViewToShowAfterLoadingId() {
        return -1;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment
    protected int[] getViewsToShowAfterLoadingId() {
        return new int[]{C1138R.id.pager, C1138R.id.tabs};
    }

    protected boolean hasSearchFromStoreFragment() {
        return true;
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.LoadInterface
    public void load(boolean z, boolean z2, Bundle bundle) {
        if (z || this.tabs == null) {
            loadData(z2, this.openType).m40095j0(C11202a.m40156b()).m40091f(bindUntilEvent(EnumC8729b.DESTROY_VIEW)).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.p1
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    StoreFragment.this.m8815g((String) obj);
                }
            }, new InterfaceC11205b() { // from class: cm.aptoide.pt.store.view.o1
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    StoreFragment.this.m8816h((Throwable) obj);
                }
            });
        } else {
            setupViewPager();
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.storeName = bundle.getString(BundleKeys.STORE_NAME.name());
        this.storeContext = (StoreContext) bundle.get(BundleKeys.STORE_CONTEXT.name());
        BundleKeys bundleKeys = BundleKeys.OPEN_TYPE;
        this.openType = bundle.containsKey(bundleKeys.name()) ? (OpenType) bundle.get(bundleKeys.name()) : OpenType.GetStore;
        this.storeTheme = bundle.getString(BundleKeys.STORE_THEME.name());
        this.defaultTab = (Event.Name) bundle.get(BundleKeys.DEFAULT_TAB_TO_OPEN.name());
        BundleKeys bundleKeys2 = BundleKeys.USER_ID;
        if (bundle.containsKey(bundleKeys2.name())) {
            this.userId = Long.valueOf(bundle.getLong(bundleKeys2.name()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 20 && i3 == -1) {
            load(true, true, null);
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.fragment.FragmentView, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.tokenInvalidator = aptoideApplication.getTokenInvalidator();
        this.accountManager = aptoideApplication.getAccountManager();
        this.bodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.sharedPreferences = aptoideApplication.getDefaultSharedPreferences();
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
        this.shareStoreHelper = new ShareStoreHelper(getActivity(), this.marketResourceFormatter);
        if (hasSearchFromStoreFragment()) {
            this.searchAnalytics = new SearchAnalytics(this.analyticsManager, this.navigationTracker);
            this.searchNavigator = new SearchNavigator(getFragmentNavigator(), this.storeName, this.storeTheme, this.appNavigator);
            this.trendingManager = aptoideApplication.getTrendingManager();
            this.crashReport = CrashReport.getInstance();
        }
        setHasOptionsMenu(true);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        if (hasSearchFromStoreFragment()) {
            menuInflater.inflate(C1138R.menu.fragment_store, menu);
            MenuItem findItem = menu.findItem(C1138R.id.menu_item_search);
            AppSearchSuggestionsView appSearchSuggestionsView = this.appSearchSuggestionsView;
            if (appSearchSuggestionsView != null && findItem != null) {
                appSearchSuggestionsView.initialize(findItem);
            } else if (findItem != null) {
                findItem.setVisible(false);
            } else {
                menu.removeItem(C1138R.id.menu_item_search);
            }
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str = this.storeTheme;
        if (str != null) {
            this.themeManager.setTheme(str);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // cm.aptoide.p092pt.view.fragment.FragmentView, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BasePagerToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.themeManager.resetToBaseTheme();
        PagerSlidingTabStrip pagerSlidingTabStrip = this.pagerSlidingTabStrip;
        if (pagerSlidingTabStrip != null) {
            pagerSlidingTabStrip.setOnTabReselectedListener(null);
            this.pagerSlidingTabStrip = null;
        }
        this.viewPager.removeCallbacks(this.registerViewpagerCurrentItem);
        this.viewPager.removeOnPageChangeListener(this.pageChangeListener);
        super.onDestroyView();
    }

    @Override // cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.NavigationTrackFragment, cm.aptoide.p092pt.view.BaseFragment, com.trello.rxlifecycle.p235h.p236a.AbstractC8734d, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity = this.bottomNavigationActivity;
        if (bottomNavigationActivity != null) {
            bottomNavigationActivity.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        SuggestionCursorAdapter suggestionCursorAdapter = new SuggestionCursorAdapter(getContext());
        if (hasSearchFromStoreFragment()) {
            Toolbar toolbar = getToolbar();
            C11186e<MenuItem> m40552f1 = C8938e.m28567a(toolbar).m40107q0().m40552f1();
            this.appSearchSuggestionsView = new AppSearchSuggestionsView(this, C8942a.m28573a(toolbar), this.crashReport, suggestionCursorAdapter, C11370b.m40637g1(), m40552f1, this.searchAnalytics);
            attachPresenter(new SearchSuggestionsPresenter(this.appSearchSuggestionsView, ((AptoideApplication) getContext().getApplicationContext()).getSearchSuggestionManager(), C11202a.m40156b(), suggestionCursorAdapter, this.crashReport, this.trendingManager, this.searchNavigator, false, this.searchAnalytics));
            handleOptionsItemSelected(m40552f1);
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment, cm.aptoide.p092pt.view.fragment.UIComponentFragment, cm.aptoide.p092pt.view.fragment.UiComponent
    public void setupToolbar() {
        super.setupToolbar();
    }

    @Override // cm.aptoide.p092pt.view.fragment.BaseLoaderToolbarFragment
    protected void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle(this.title);
        toolbar.setBackgroundResource(this.themeManager.getAttributeForTheme(this.storeTheme, C1138R.attr.toolbarBackground).resourceId);
        if (this.userId != null) {
            toolbar.setLogo(C1138R.drawable.ic_user_shape_white);
        } else {
            toolbar.setLogo(C1138R.drawable.ic_store_white);
        }
    }

    @Override // cm.aptoide.p092pt.view.fragment.BasePagerToolbarFragment
    protected void setupViewPager() {
        super.setupViewPager();
        PagerSlidingTabStrip pagerSlidingTabStrip = (PagerSlidingTabStrip) getView().findViewById(C1138R.id.tabs);
        this.pagerSlidingTabStrip = pagerSlidingTabStrip;
        pagerSlidingTabStrip.setBackgroundResource(this.themeManager.getAttributeForTheme(this.storeTheme, C1138R.attr.toolbarBackground).resourceId);
        PagerSlidingTabStrip pagerSlidingTabStrip2 = this.pagerSlidingTabStrip;
        if (pagerSlidingTabStrip2 != null) {
            pagerSlidingTabStrip2.setViewPager(this.viewPager);
        }
        this.viewPager.addOnPageChangeListener(new ViewPager.C0692m() { // from class: cm.aptoide.pt.store.view.StoreFragment.2
            @Override // androidx.viewpager.widget.ViewPager.C0692m, androidx.viewpager.widget.ViewPager.InterfaceC0689j
            public void onPageSelected(int i2) {
                StorePagerAdapter storePagerAdapter = (StorePagerAdapter) ((BasePagerToolbarFragment) StoreFragment.this).viewPager.getAdapter();
                if (StoreFragment.this.storeContext.equals(StoreContext.meta)) {
                    StoreFragment.this.storeAnalytics.sendStoreInteractEvent("Open Tab", storePagerAdapter.getPageTitle(i2).toString(), StoreFragment.this.storeName);
                }
            }
        });
        this.viewPager.addOnPageChangeListener(this.pageChangeListener);
        Runnable runnable = new Runnable() { // from class: cm.aptoide.pt.store.view.h1
            @Override // java.lang.Runnable
            public final void run() {
                StoreFragment.this.m8819k();
            }
        };
        this.registerViewpagerCurrentItem = runnable;
        this.viewPager.post(runnable);
        changeToTab(this.defaultTab);
        finishLoading();
    }

    public static StoreFragment newInstance(long j2, String str, Event.Name name, OpenType openType) {
        Bundle bundle = new Bundle();
        bundle.putLong(BundleKeys.USER_ID.name(), j2);
        bundle.putSerializable(BundleKeys.STORE_CONTEXT.name(), StoreContext.meta);
        bundle.putSerializable(BundleKeys.OPEN_TYPE.name(), openType);
        bundle.putString(BundleKeys.STORE_THEME.name(), str);
        bundle.putSerializable(BundleKeys.DEFAULT_TAB_TO_OPEN.name(), name);
        StoreFragment storeFragment = new StoreFragment();
        storeFragment.setArguments(bundle);
        return storeFragment;
    }

    public static StoreFragment newInstance(String str, String str2, Event.Name name, OpenType openType) {
        StoreFragment newInstance = newInstance(str, str2, openType);
        newInstance.getArguments().putSerializable(BundleKeys.DEFAULT_TAB_TO_OPEN.name(), name);
        return newInstance;
    }

    public static StoreFragment newInstance(String str, String str2, OpenType openType) {
        Bundle bundle = new Bundle();
        bundle.putString(BundleKeys.STORE_NAME.name(), str);
        bundle.putSerializable(BundleKeys.OPEN_TYPE.name(), openType);
        bundle.putSerializable(BundleKeys.STORE_CONTEXT.name(), StoreContext.meta);
        bundle.putString(BundleKeys.STORE_THEME.name(), str2);
        StoreFragment storeFragment = new StoreFragment();
        storeFragment.setArguments(bundle);
        return storeFragment;
    }

    public static StoreFragment newInstance(String str, String str2) {
        return newInstance(str, str2, OpenType.GetStore);
    }
}
