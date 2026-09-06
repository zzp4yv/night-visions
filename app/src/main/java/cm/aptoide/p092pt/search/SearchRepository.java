package cm.aptoide.p092pt.search;

import android.content.SharedPreferences;
import cm.aptoide.p092pt.aab.Split;
import cm.aptoide.p092pt.app.mmpcampaigns.Campaign;
import cm.aptoide.p092pt.app.mmpcampaigns.CampaignMapper;
import cm.aptoide.p092pt.dataprovider.exception.NoNetworkConnectionException;
import cm.aptoide.p092pt.dataprovider.interfaces.TokenInvalidator;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Aab;
import cm.aptoide.p092pt.dataprovider.model.p096v7.GetAppMeta;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Malware;
import cm.aptoide.p092pt.dataprovider.model.p096v7.Obb;
import cm.aptoide.p092pt.dataprovider.model.p096v7.search.ListSearchApps;
import cm.aptoide.p092pt.dataprovider.model.p096v7.search.SearchApp;
import cm.aptoide.p092pt.dataprovider.p097ws.BodyInterceptor;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.BaseBody;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.ListSearchAppsRequest;
import cm.aptoide.p092pt.dataprovider.util.HashMapNotNull;
import cm.aptoide.p092pt.download.OemidProvider;
import cm.aptoide.p092pt.search.model.SearchAppResult;
import cm.aptoide.p092pt.search.model.SearchFilters;
import cm.aptoide.p092pt.search.model.SearchResult;
import cm.aptoide.p092pt.search.model.SearchResultError;
import cm.aptoide.p092pt.store.RoomStoreRepository;
import cm.aptoide.p092pt.store.StoreUtils;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.InterfaceC11198k;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p473s.C11370b;
import p456rx.schedulers.Schedulers;
import retrofit2.Converter;

/* compiled from: SearchRepository.kt */
@Metadata(m32266d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J&\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\"J,\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u0001052\u0006\u0010.\u001a\u00020/2\b\u00106\u001a\u0004\u0018\u00010/2\u0006\u00107\u001a\u000208H\u0002J \u00109\u001a\u00020\"2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010.\u001a\u00020/H\u0002J\u0018\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020/2\u0006\u0010.\u001a\u00020/H\u0002J\u001e\u0010@\u001a\b\u0012\u0004\u0012\u00020B0A2\u000e\u0010C\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010AH\u0002J \u0010E\u001a\u00020F2\u0006\u0010<\u001a\u00020=2\u0006\u0010G\u001a\u00020/2\u0006\u0010H\u001a\u00020\"H\u0002J*\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0A0J2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020=0A2\u0006\u0010.\u001a\u00020/H\u0002J2\u0010L\u001a\b\u0012\u0004\u0012\u00020\u0017052\u0006\u0010.\u001a\u00020/2\b\u0010M\u001a\u0004\u0018\u00010N2\u0006\u00100\u001a\u0002012\b\u00106\u001a\u0004\u0018\u00010/H\u0002J\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00170JJ8\u0010P\u001a\b\u0012\u0004\u0012\u00020\u0017052\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u0010Q\u001a\u00020;2\u0006\u00102\u001a\u00020\"2\b\u00106\u001a\u0004\u0018\u00010/H\u0002J2\u0010R\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\b\u00106\u001a\u0004\u0018\u00010/2\u0006\u00103\u001a\u00020\"H\u0002J.\u0010S\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\"2\u0006\u0010T\u001a\u00020/2\u0006\u00103\u001a\u00020\"J\u0012\u0010U\u001a\u00020-2\b\u0010V\u001a\u0004\u0018\u00010\u0017H\u0002R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006W"}, m32267d2 = {"Lcm/aptoide/pt/search/SearchRepository;", HttpUrl.FRAGMENT_ENCODE_SET, "storeRepository", "Lcm/aptoide/pt/store/RoomStoreRepository;", "bodyInterceptor", "Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "Lcm/aptoide/pt/dataprovider/ws/v7/BaseBody;", "httpClient", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/Converter$Factory;", "tokenInvalidator", "Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "oemidProvider", "Lcm/aptoide/pt/download/OemidProvider;", "campaignMapper", "Lcm/aptoide/pt/app/mmpcampaigns/CampaignMapper;", "(Lcm/aptoide/pt/store/RoomStoreRepository;Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;Lokhttp3/OkHttpClient;Lretrofit2/Converter$Factory;Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;Landroid/content/SharedPreferences;Lcm/aptoide/pt/download/OemidProvider;Lcm/aptoide/pt/app/mmpcampaigns/CampaignMapper;)V", "getBodyInterceptor", "()Lcm/aptoide/pt/dataprovider/ws/BodyInterceptor;", "cachedSearchResults", "Lcm/aptoide/pt/search/model/SearchResult;", "getCampaignMapper", "()Lcm/aptoide/pt/app/mmpcampaigns/CampaignMapper;", "cancelationSubject", "Lrx/subjects/PublishSubject;", "Ljava/lang/Void;", "getConverterFactory", "()Lretrofit2/Converter$Factory;", "getHttpClient", "()Lokhttp3/OkHttpClient;", "loadingMore", HttpUrl.FRAGMENT_ENCODE_SET, "getOemidProvider", "()Lcm/aptoide/pt/download/OemidProvider;", "resultsSubject", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "getStoreRepository", "()Lcm/aptoide/pt/store/RoomStoreRepository;", "getTokenInvalidator", "()Lcm/aptoide/pt/dataprovider/interfaces/TokenInvalidator;", "generalSearch", "Lrx/Completable;", "query", HttpUrl.FRAGMENT_ENCODE_SET, "filters", "Lcm/aptoide/pt/search/model/SearchFilters;", "matureEnabled", "useCachedValues", "handleSearchError", "Lrx/Single;", "specificStore", "throwable", HttpUrl.FRAGMENT_ENCODE_SET, "isHighlightedResult", "i", HttpUrl.FRAGMENT_ENCODE_SET, "app", "Lcm/aptoide/pt/dataprovider/model/v7/search/SearchApp;", "isQuerySameAsAppName", "appName", "mapSplits", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/aab/Split;", "splits", "Lcm/aptoide/pt/dataprovider/model/v7/Split;", "mapToSearchAppResult", "Lcm/aptoide/pt/search/model/SearchAppResult;", "oemid", "isHighlighted", "mapToSearchAppResultList", "Lrx/Observable;", "searchAppList", "mapToSearchResult", "response", "Lcm/aptoide/pt/dataprovider/model/v7/search/ListSearchApps;", "observeSearchResults", "requestSearchResults", "nextOffset", "search", "searchInStore", "storeName", "updateMemCache", "results", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final class SearchRepository {
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private SearchResult cachedSearchResults;
    private final CampaignMapper campaignMapper;
    private final C11370b<Void> cancelationSubject;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private boolean loadingMore;
    private final OemidProvider oemidProvider;
    private final C11370b<SearchResult> resultsSubject;
    private final SharedPreferences sharedPreferences;
    private final RoomStoreRepository storeRepository;
    private final TokenInvalidator tokenInvalidator;

    public SearchRepository(RoomStoreRepository roomStoreRepository, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator, SharedPreferences sharedPreferences, OemidProvider oemidProvider, CampaignMapper campaignMapper) {
        C9768m.m32346f(roomStoreRepository, "storeRepository");
        C9768m.m32346f(bodyInterceptor, "bodyInterceptor");
        C9768m.m32346f(okHttpClient, "httpClient");
        C9768m.m32346f(factory, "converterFactory");
        C9768m.m32346f(tokenInvalidator, "tokenInvalidator");
        C9768m.m32346f(sharedPreferences, "sharedPreferences");
        C9768m.m32346f(oemidProvider, "oemidProvider");
        C9768m.m32346f(campaignMapper, "campaignMapper");
        this.storeRepository = roomStoreRepository;
        this.bodyInterceptor = bodyInterceptor;
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.tokenInvalidator = tokenInvalidator;
        this.sharedPreferences = sharedPreferences;
        this.oemidProvider = oemidProvider;
        this.campaignMapper = campaignMapper;
        C11370b<SearchResult> m40637g1 = C11370b.m40637g1();
        C9768m.m32345e(m40637g1, "create()");
        this.resultsSubject = m40637g1;
        C11370b<Void> m40637g12 = C11370b.m40637g1();
        C9768m.m32345e(m40637g12, "create()");
        this.cancelationSubject = m40637g12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: generalSearch$lambda-0, reason: not valid java name */
    public static final C11183b m40970generalSearch$lambda0(SearchRepository searchRepository, String str, SearchFilters searchFilters, boolean z, boolean z2, String str2) {
        C9768m.m32346f(searchRepository, "this$0");
        C9768m.m32346f(str, "$query");
        C9768m.m32346f(searchFilters, "$filters");
        return searchRepository.search(str, searchFilters, z, null, z2);
    }

    private final Single<SearchResult> handleSearchError(String query, String specificStore, Throwable throwable) {
        return ((throwable instanceof UnknownHostException) || (throwable instanceof NoNetworkConnectionException)) ? Single.m39913m(new SearchResult(query, specificStore, SearchResultError.NO_NETWORK)) : Single.m39913m(new SearchResult(query, specificStore, SearchResultError.GENERIC));
    }

    private final boolean isHighlightedResult(int i2, SearchApp app, String query) {
        if (i2 == 0) {
            String name = app.getName();
            C9768m.m32345e(name, "app.name");
            if (isQuerySameAsAppName(name, query) && app.getFile().getMalware().getRank() == Malware.Rank.TRUSTED && app.getStats().getPdownloads() >= 1000000) {
                return true;
            }
        }
        return false;
    }

    private final boolean isQuerySameAsAppName(String appName, String query) {
        String m37507A;
        String m37507A2;
        String m37507A3;
        String m37507A4;
        String lowerCase = appName.toLowerCase();
        C9768m.m32345e(lowerCase, "this as java.lang.String).toLowerCase()");
        m37507A = C10513u.m37507A(lowerCase, " ", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        m37507A2 = C10513u.m37507A(m37507A, "-", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        String lowerCase2 = query.toLowerCase();
        C9768m.m32345e(lowerCase2, "this as java.lang.String).toLowerCase()");
        m37507A3 = C10513u.m37507A(lowerCase2, " ", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        m37507A4 = C10513u.m37507A(m37507A3, "-", HttpUrl.FRAGMENT_ENCODE_SET, false, 4, null);
        return C9768m.m32341a(m37507A2, m37507A4);
    }

    private final List<Split> mapSplits(List<? extends cm.aptoide.p092pt.dataprovider.model.p096v7.Split> splits) {
        ArrayList arrayList = new ArrayList();
        if (splits == null) {
            return arrayList;
        }
        for (cm.aptoide.p092pt.dataprovider.model.p096v7.Split split : splits) {
            String name = split.getName();
            C9768m.m32345e(name, "split.name");
            String type = split.getType();
            C9768m.m32345e(type, "split.type");
            String path = split.getPath();
            C9768m.m32345e(path, "split.path");
            long filesize = split.getFilesize();
            String md5sum = split.getMd5sum();
            C9768m.m32345e(md5sum, "split.md5sum");
            arrayList.add(new Split(name, type, path, filesize, md5sum));
        }
        return arrayList;
    }

    private final SearchAppResult mapToSearchAppResult(SearchApp app, String oemid, boolean isHighlighted) {
        List<String> emptyList = Collections.emptyList();
        List<cm.aptoide.p092pt.dataprovider.model.p096v7.Split> emptyList2 = Collections.emptyList();
        Aab aab = app.getAab();
        if (aab != null) {
            emptyList = aab.getRequiredSplits();
            emptyList2 = aab.getSplits();
        }
        List<String> list = emptyList;
        int ordinal = app.getFile().getMalware().getRank().ordinal();
        String icon = app.getIcon();
        String name = app.getStore().getName();
        Long valueOf = Long.valueOf(app.getStore().getId());
        String theme = app.getStore().getAppearance().getTheme();
        long time = app.getModified().getTime();
        float avg = app.getStats().getRating().getAvg();
        long pdownloads = app.getStats().getPdownloads();
        String name2 = app.getName();
        String packageName = app.getPackageName();
        String md5sum = app.getFile().getMd5sum();
        long id = app.getId();
        int vercode = app.getFile().getVercode();
        String vername = app.getFile().getVername();
        String path = app.getFile().getPath();
        String pathAlt = app.getFile().getPathAlt();
        Malware malware = app.getFile().getMalware();
        long size = app.getSize();
        boolean hasVersions = app.hasVersions();
        boolean hasBilling = app.hasBilling();
        boolean hasAdvertising = app.hasAdvertising();
        Obb obb = app.getObb();
        List<Split> mapSplits = mapSplits(emptyList2);
        boolean equals = app.getStore().getName().equals("catappult");
        Campaign mapCampaign = this.campaignMapper.mapCampaign(app.getUrls());
        GetAppMeta.Developer developer = app.getDeveloper();
        String name3 = developer != null ? developer.getName() : null;
        if (name3 == null) {
            name3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return new SearchAppResult(ordinal, icon, name, valueOf, theme, time, avg, pdownloads, name2, packageName, md5sum, id, vercode, vername, path, pathAlt, malware, size, hasVersions, hasBilling, hasAdvertising, oemid, isHighlighted, obb, list, mapSplits, null, null, equals, HttpUrl.FRAGMENT_ENCODE_SET, mapCampaign, name3);
    }

    private final C11186e<List<SearchAppResult>> mapToSearchAppResultList(List<? extends SearchApp> list, String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (SearchApp searchApp : list) {
            String oemid = this.oemidProvider.getOemid();
            C9768m.m32345e(oemid, "oemidProvider.oemid");
            arrayList.add(mapToSearchAppResult(searchApp, oemid, isHighlightedResult(i2, searchApp, str)));
            i2++;
        }
        C11186e<List<SearchAppResult>> m40025S = C11186e.m40025S(arrayList);
        C9768m.m32345e(m40025S, "just(newList)");
        return m40025S;
    }

    private final Single<SearchResult> mapToSearchResult(final String query, final ListSearchApps response, final SearchFilters filters, final String specificStore) {
        if (response != null) {
            Single<SearchResult> m39925q = C11186e.m40025S(response.getDataList().getList()).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.s
                @Override // p456rx.p460m.InterfaceC11208e
                public final Object call(Object obj) {
                    C11186e m40971mapToSearchResult$lambda20$lambda17;
                    m40971mapToSearchResult$lambda20$lambda17 = SearchRepository.m40971mapToSearchResult$lambda20$lambda17(SearchRepository.this, query, (List) obj);
                    return m40971mapToSearchResult$lambda20$lambda17;
                }
            }).m40057E().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.n
                @Override // p456rx.p460m.InterfaceC11208e
                public final Object call(Object obj) {
                    SearchResult m40972mapToSearchResult$lambda20$lambda18;
                    m40972mapToSearchResult$lambda20$lambda18 = SearchRepository.m40972mapToSearchResult$lambda20$lambda18(query, specificStore, filters, response, (List) obj);
                    return m40972mapToSearchResult$lambda20$lambda18;
                }
            }).m40085Z0().m39925q(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.i
                @Override // p456rx.p460m.InterfaceC11208e
                public final Object call(Object obj) {
                    Single m40973mapToSearchResult$lambda20$lambda19;
                    m40973mapToSearchResult$lambda20$lambda19 = SearchRepository.m40973mapToSearchResult$lambda20$lambda19(SearchRepository.this, query, specificStore, (Throwable) obj);
                    return m40973mapToSearchResult$lambda20$lambda19;
                }
            });
            C9768m.m32345e(m39925q, "just(r.dataList.list)\n  …ore, throwable)\n        }");
            return m39925q;
        }
        Single<SearchResult> m39913m = Single.m39913m(new SearchResult(query, SearchResultError.GENERIC));
        C9768m.m32345e(m39913m, "just(SearchResult(query,…archResultError.GENERIC))");
        return m39913m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapToSearchResult$lambda-20$lambda-17, reason: not valid java name */
    public static final C11186e m40971mapToSearchResult$lambda20$lambda17(SearchRepository searchRepository, String str, List list) {
        C9768m.m32346f(searchRepository, "this$0");
        C9768m.m32346f(str, "$query");
        C9768m.m32345e(list, "list");
        return searchRepository.mapToSearchAppResultList(list, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapToSearchResult$lambda-20$lambda-18, reason: not valid java name */
    public static final SearchResult m40972mapToSearchResult$lambda20$lambda18(String str, String str2, SearchFilters searchFilters, ListSearchApps listSearchApps, List list) {
        C9768m.m32346f(str, "$query");
        C9768m.m32346f(searchFilters, "$filters");
        C9768m.m32346f(listSearchApps, "$r");
        C9768m.m32345e(list, "list");
        return new SearchResult(str, str2, list, searchFilters, listSearchApps.getDataList().getOffset(), listSearchApps.getDataList().getNext(), listSearchApps.getDataList().getTotal(), !listSearchApps.getDataList().isLoaded(), false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mapToSearchResult$lambda-20$lambda-19, reason: not valid java name */
    public static final Single m40973mapToSearchResult$lambda20$lambda19(SearchRepository searchRepository, String str, String str2, Throwable th) {
        C9768m.m32346f(searchRepository, "this$0");
        C9768m.m32346f(str, "$query");
        th.printStackTrace();
        C9768m.m32345e(th, "throwable");
        return searchRepository.handleSearchError(str, str2, th);
    }

    private final Single<SearchResult> requestSearchResults(final String query, final SearchFilters filters, int nextOffset, boolean matureEnabled, final String specificStore) {
        HashMapNotNull<String, List<String>> subscribedStoresAuthMap = StoreUtils.getSubscribedStoresAuthMap(this.storeRepository);
        ListSearchAppsRequest m7456of = ListSearchAppsRequest.m7456of(query, nextOffset, filters.getOnlyFollowedStores(), filters.getOnlyTrustedApps(), filters.getOnlyBetaApps(), filters.getOnlyAppcApps(), Boolean.valueOf(matureEnabled), StoreUtils.getSubscribedStoresIds(this.storeRepository), subscribedStoresAuthMap, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences);
        if (specificStore != null) {
            m7456of = ListSearchAppsRequest.m7455of(query, nextOffset, specificStore, filters.getOnlyTrustedApps(), filters.getOnlyBetaApps(), filters.getOnlyAppcApps(), Boolean.valueOf(matureEnabled), subscribedStoresAuthMap, this.bodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences);
        }
        Single<SearchResult> m39925q = m7456of.observe(false).m40085Z0().m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.g
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Single m40974requestSearchResults$lambda15;
                m40974requestSearchResults$lambda15 = SearchRepository.m40974requestSearchResults$lambda15(SearchRepository.this, query, filters, specificStore, (ListSearchApps) obj);
                return m40974requestSearchResults$lambda15;
            }
        }).m39925q(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.p
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Single m40975requestSearchResults$lambda16;
                m40975requestSearchResults$lambda16 = SearchRepository.m40975requestSearchResults$lambda16(SearchRepository.this, query, specificStore, (Throwable) obj);
                return m40975requestSearchResults$lambda16;
            }
        });
        C9768m.m32345e(m39925q, "request\n      .observe(f…Store, throwable)\n      }");
        return m39925q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestSearchResults$lambda-15, reason: not valid java name */
    public static final Single m40974requestSearchResults$lambda15(SearchRepository searchRepository, String str, SearchFilters searchFilters, String str2, ListSearchApps listSearchApps) {
        C9768m.m32346f(searchRepository, "this$0");
        C9768m.m32346f(str, "$query");
        C9768m.m32346f(searchFilters, "$filters");
        return searchRepository.mapToSearchResult(str, listSearchApps, searchFilters, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: requestSearchResults$lambda-16, reason: not valid java name */
    public static final Single m40975requestSearchResults$lambda16(SearchRepository searchRepository, String str, String str2, Throwable th) {
        C9768m.m32346f(searchRepository, "this$0");
        C9768m.m32346f(str, "$query");
        th.printStackTrace();
        C9768m.m32345e(th, "throwable");
        return searchRepository.handleSearchError(str, str2, th);
    }

    private final synchronized C11183b search(String str, SearchFilters searchFilters, boolean z, String str2, boolean z2) {
        if (z2) {
            C11183b m39952t = C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.search.u
                @Override // p456rx.p460m.InterfaceC11204a
                public final void call() {
                    SearchRepository.m40977search$lambda2(SearchRepository.this);
                }
            });
            C9768m.m32345e(m39952t, "fromAction {\n        res…hedSearchResults)\n      }");
            return m39952t;
        }
        final SearchResult searchResult = this.cachedSearchResults;
        if (searchResult == null || !C9768m.m32341a(searchResult.getQuery(), str) || !C9768m.m32341a(searchResult.getSpecificStore(), str2) || !C9768m.m32341a(searchFilters, searchResult.getFilters()) || searchResult.hasError()) {
            this.cachedSearchResults = null;
            this.cancelationSubject.onNext(null);
            C11183b m39921j = requestSearchResults(str, searchFilters, 0, z, str2).m39915A().m40075P0(this.cancelationSubject).m40103o(null).m40085Z0().m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.j
                @Override // p456rx.p460m.InterfaceC11208e
                public final Object call(Object obj) {
                    C11183b m40976search$lambda10;
                    m40976search$lambda10 = SearchRepository.m40976search$lambda10(SearchRepository.this, (SearchResult) obj);
                    return m40976search$lambda10;
                }
            });
            C9768m.m32345e(m39921j, "requestSearchResults(que…updateMemCache(results) }");
            return m39921j;
        }
        if (!searchResult.hasMore()) {
            C11183b m39952t2 = C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.search.q
                @Override // p456rx.p460m.InterfaceC11204a
                public final void call() {
                    SearchRepository.m40983search$lambda9$lambda8(SearchRepository.this, searchResult);
                }
            });
            C9768m.m32345e(m39952t2, "fromAction {\n           …ctiveResults)\n          }");
            return m39952t2;
        }
        if (this.loadingMore) {
            C11183b m39946e = C11183b.m39946e();
            C9768m.m32345e(m39946e, "complete()");
            return m39946e;
        }
        C11183b m39981n = requestSearchResults(str, searchFilters, searchResult.getNextOffset(), z, str2).m39915A().m40075P0(this.cancelationSubject).m40103o(null).m40085Z0().m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.h
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m40978search$lambda9$lambda3;
                m40978search$lambda9$lambda3 = SearchRepository.m40978search$lambda9$lambda3(SearchRepository.this, (SearchResult) obj);
                return m40978search$lambda9$lambda3;
            }
        }).m39983p(new InterfaceC11205b() { // from class: cm.aptoide.pt.search.o
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                SearchRepository.m40979search$lambda9$lambda4(SearchRepository.this, (InterfaceC11198k) obj);
            }
        }).m39985r(new InterfaceC11204a() { // from class: cm.aptoide.pt.search.k
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                SearchRepository.m40980search$lambda9$lambda5(SearchRepository.this);
            }
        }).m39984q(new InterfaceC11204a() { // from class: cm.aptoide.pt.search.r
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                SearchRepository.m40981search$lambda9$lambda6(SearchRepository.this);
            }
        }).m39981n(new InterfaceC11205b() { // from class: cm.aptoide.pt.search.t
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                SearchRepository.m40982search$lambda9$lambda7(SearchRepository.this, (Throwable) obj);
            }
        });
        C9768m.m32345e(m39981n, "requestSearchResults(\n  …r { loadingMore = false }");
        return m39981n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-10, reason: not valid java name */
    public static final C11183b m40976search$lambda10(SearchRepository searchRepository, SearchResult searchResult) {
        C9768m.m32346f(searchRepository, "this$0");
        return searchRepository.updateMemCache(searchResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-2, reason: not valid java name */
    public static final void m40977search$lambda2(SearchRepository searchRepository) {
        C9768m.m32346f(searchRepository, "this$0");
        searchRepository.resultsSubject.onNext(searchRepository.cachedSearchResults);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-3, reason: not valid java name */
    public static final C11183b m40978search$lambda9$lambda3(SearchRepository searchRepository, SearchResult searchResult) {
        C9768m.m32346f(searchRepository, "this$0");
        return searchRepository.updateMemCache(searchResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-4, reason: not valid java name */
    public static final void m40979search$lambda9$lambda4(SearchRepository searchRepository, InterfaceC11198k interfaceC11198k) {
        C9768m.m32346f(searchRepository, "this$0");
        searchRepository.loadingMore = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-5, reason: not valid java name */
    public static final void m40980search$lambda9$lambda5(SearchRepository searchRepository) {
        C9768m.m32346f(searchRepository, "this$0");
        searchRepository.loadingMore = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-6, reason: not valid java name */
    public static final void m40981search$lambda9$lambda6(SearchRepository searchRepository) {
        C9768m.m32346f(searchRepository, "this$0");
        searchRepository.loadingMore = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-7, reason: not valid java name */
    public static final void m40982search$lambda9$lambda7(SearchRepository searchRepository, Throwable th) {
        C9768m.m32346f(searchRepository, "this$0");
        searchRepository.loadingMore = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: search$lambda-9$lambda-8, reason: not valid java name */
    public static final void m40983search$lambda9$lambda8(SearchRepository searchRepository, SearchResult searchResult) {
        C9768m.m32346f(searchRepository, "this$0");
        C9768m.m32346f(searchResult, "$activeResults");
        searchRepository.resultsSubject.onNext(searchResult);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: searchInStore$lambda-1, reason: not valid java name */
    public static final C11183b m40984searchInStore$lambda1(SearchRepository searchRepository, String str, SearchFilters searchFilters, boolean z, String str2, boolean z2, String str3) {
        C9768m.m32346f(searchRepository, "this$0");
        C9768m.m32346f(str, "$query");
        C9768m.m32346f(searchFilters, "$filters");
        C9768m.m32346f(str2, "$storeName");
        return searchRepository.search(str, searchFilters, z, str2, z2);
    }

    private final synchronized C11183b updateMemCache(final SearchResult searchResult) {
        C11183b m39952t;
        m39952t = C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.search.m
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                SearchRepository.m40985updateMemCache$lambda13(SearchResult.this, this);
            }
        });
        C9768m.m32345e(m39952t, "fromAction {\n      resul…)\n        }\n      }\n    }");
        return m39952t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateMemCache$lambda-13, reason: not valid java name */
    public static final void m40985updateMemCache$lambda13(SearchResult searchResult, SearchRepository searchRepository) {
        C9768m.m32346f(searchRepository, "this$0");
        if (searchResult != null) {
            SearchResult searchResult2 = searchRepository.cachedSearchResults;
            ArrayList arrayList = new ArrayList(searchResult.getSearchResultsList());
            boolean z = true;
            if (searchResult2 != null && C9768m.m32341a(searchResult2.getQuery(), searchResult.getQuery()) && C9768m.m32341a(searchResult2.getFilters(), searchResult.getFilters()) && C9768m.m32341a(searchResult2.getSpecificStore(), searchResult.getSpecificStore())) {
                arrayList = new ArrayList(searchResult2.getSearchResultsList());
                arrayList.addAll(searchResult.getSearchResultsList());
                z = false;
            }
            ArrayList arrayList2 = arrayList;
            boolean z2 = z;
            searchRepository.resultsSubject.onNext(new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), arrayList2, searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), z2, searchResult.getError()));
            searchRepository.cachedSearchResults = new SearchResult(searchResult.getQuery(), searchResult.getSpecificStore(), arrayList2, searchResult.getFilters(), searchResult.getCurrentOffset(), searchResult.getNextOffset(), searchResult.getTotal(), searchResult.getLoading(), z2, searchResult.getError());
        }
    }

    public final C11183b generalSearch(final String str, final SearchFilters searchFilters, final boolean z, final boolean z2) {
        C9768m.m32346f(str, "query");
        C9768m.m32346f(searchFilters, "filters");
        C11183b m39967K = Single.m39913m(str).m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.l
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m40970generalSearch$lambda0;
                m40970generalSearch$lambda0 = SearchRepository.m40970generalSearch$lambda0(SearchRepository.this, str, searchFilters, z, z2, (String) obj);
                return m40970generalSearch$lambda0;
            }
        }).m39967K(Schedulers.m40658io());
        C9768m.m32345e(m39967K, "just(query)\n      .flatM…scribeOn(Schedulers.io())");
        return m39967K;
    }

    public final BodyInterceptor<BaseBody> getBodyInterceptor() {
        return this.bodyInterceptor;
    }

    public final CampaignMapper getCampaignMapper() {
        return this.campaignMapper;
    }

    public final Converter.Factory getConverterFactory() {
        return this.converterFactory;
    }

    public final OkHttpClient getHttpClient() {
        return this.httpClient;
    }

    public final OemidProvider getOemidProvider() {
        return this.oemidProvider;
    }

    public final SharedPreferences getSharedPreferences() {
        return this.sharedPreferences;
    }

    public final RoomStoreRepository getStoreRepository() {
        return this.storeRepository;
    }

    public final TokenInvalidator getTokenInvalidator() {
        return this.tokenInvalidator;
    }

    public final C11186e<SearchResult> observeSearchResults() {
        return this.resultsSubject;
    }

    public final C11183b searchInStore(final String str, final SearchFilters searchFilters, final boolean z, final String str2, final boolean z2) {
        C9768m.m32346f(str, "query");
        C9768m.m32346f(searchFilters, "filters");
        C9768m.m32346f(str2, "storeName");
        C11183b m39967K = Single.m39913m(str).m39921j(new InterfaceC11208e() { // from class: cm.aptoide.pt.search.v
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11183b m40984searchInStore$lambda1;
                m40984searchInStore$lambda1 = SearchRepository.m40984searchInStore$lambda1(SearchRepository.this, str, searchFilters, z, str2, z2, (String) obj);
                return m40984searchInStore$lambda1;
            }
        }).m39967K(Schedulers.m40658io());
        C9768m.m32345e(m39967K, "just(query)\n      .flatM…scribeOn(Schedulers.io())");
        return m39967K;
    }
}
