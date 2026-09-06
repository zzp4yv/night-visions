package cm.aptoide.p092pt.search.model;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;

/* compiled from: SearchResult.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\bBu\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0015J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010*\u001a\u00020\u000fHÆ\u0003J\t\u0010+\u001a\u00020\u000fHÆ\u0003J\t\u0010,\u001a\u00020\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0013HÆ\u0003J\t\u0010.\u001a\u00020\u0013HÆ\u0003Jy\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u00100\u001a\u00020\u00132\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u00102\u001a\u00020\u0013J\u0006\u00103\u001a\u00020\u0013J\t\u00104\u001a\u00020\u000fHÖ\u0001J\t\u00105\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001cR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010 R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017¨\u00066"}, m32267d2 = {"Lcm/aptoide/pt/search/model/SearchResult;", HttpUrl.FRAGMENT_ENCODE_SET, "query", HttpUrl.FRAGMENT_ENCODE_SET, "error", "Lcm/aptoide/pt/search/model/SearchResultError;", "(Ljava/lang/String;Lcm/aptoide/pt/search/model/SearchResultError;)V", "specificStore", "(Ljava/lang/String;Ljava/lang/String;Lcm/aptoide/pt/search/model/SearchResultError;)V", "searchResultsList", HttpUrl.FRAGMENT_ENCODE_SET, "Lcm/aptoide/pt/search/model/SearchAppResult;", "filters", "Lcm/aptoide/pt/search/model/SearchFilters;", "currentOffset", HttpUrl.FRAGMENT_ENCODE_SET, "nextOffset", "total", "loading", HttpUrl.FRAGMENT_ENCODE_SET, "isFreshResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcm/aptoide/pt/search/model/SearchFilters;IIIZZLcm/aptoide/pt/search/model/SearchResultError;)V", "getCurrentOffset", "()I", "getError", "()Lcm/aptoide/pt/search/model/SearchResultError;", "getFilters", "()Lcm/aptoide/pt/search/model/SearchFilters;", "()Z", "getLoading", "getNextOffset", "getQuery", "()Ljava/lang/String;", "getSearchResultsList", "()Ljava/util/List;", "getSpecificStore", "getTotal", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hasError", "hasMore", "hashCode", "toString", "app_vanillaProdRelease"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SearchResult {
    private final int currentOffset;
    private final SearchResultError error;
    private final SearchFilters filters;
    private final boolean isFreshResult;
    private final boolean loading;
    private final int nextOffset;
    private final String query;
    private final List<SearchAppResult> searchResultsList;
    private final String specificStore;
    private final int total;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str) {
        this(str, null, null, null, 0, 0, 0, false, false, null, 1022, null);
        C9768m.m32346f(str, "query");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2) {
        this(str, str2, null, null, 0, 0, 0, false, false, null, 1020, null);
        C9768m.m32346f(str, "query");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list) {
        this(str, str2, list, null, 0, 0, 0, false, false, null, 1016, null);
        C9768m.m32346f(str, "query");
        C9768m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters) {
        this(str, str2, list, searchFilters, 0, 0, 0, false, false, null, 1008, null);
        C9768m.m32346f(str, "query");
        C9768m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2) {
        this(str, str2, list, searchFilters, i2, 0, 0, false, false, null, 992, null);
        C9768m.m32346f(str, "query");
        C9768m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3) {
        this(str, str2, list, searchFilters, i2, i3, 0, false, false, null, 960, null);
        C9768m.m32346f(str, "query");
        C9768m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3, int i4) {
        this(str, str2, list, searchFilters, i2, i3, i4, false, false, null, 896, null);
        C9768m.m32346f(str, "query");
        C9768m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3, int i4, boolean z) {
        this(str, str2, list, searchFilters, i2, i3, i4, z, false, null, 768, null);
        C9768m.m32346f(str, "query");
        C9768m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3, int i4, boolean z, boolean z2) {
        this(str, str2, list, searchFilters, i2, i3, i4, z, z2, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
        C9768m.m32346f(str, "query");
        C9768m.m32346f(list, "searchResultsList");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchResult(String str, String str2, List<? extends SearchAppResult> list, SearchFilters searchFilters, int i2, int i3, int i4, boolean z, boolean z2, SearchResultError searchResultError) {
        C9768m.m32346f(str, "query");
        C9768m.m32346f(list, "searchResultsList");
        this.query = str;
        this.specificStore = str2;
        this.searchResultsList = list;
        this.filters = searchFilters;
        this.currentOffset = i2;
        this.nextOffset = i3;
        this.total = i4;
        this.loading = z;
        this.isFreshResult = z2;
        this.error = searchResultError;
    }

    /* renamed from: component1, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    /* renamed from: component10, reason: from getter */
    public final SearchResultError getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSpecificStore() {
        return this.specificStore;
    }

    public final List<SearchAppResult> component3() {
        return this.searchResultsList;
    }

    /* renamed from: component4, reason: from getter */
    public final SearchFilters getFilters() {
        return this.filters;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCurrentOffset() {
        return this.currentOffset;
    }

    /* renamed from: component6, reason: from getter */
    public final int getNextOffset() {
        return this.nextOffset;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsFreshResult() {
        return this.isFreshResult;
    }

    public final SearchResult copy(String query, String specificStore, List<? extends SearchAppResult> searchResultsList, SearchFilters filters, int currentOffset, int nextOffset, int total, boolean loading, boolean isFreshResult, SearchResultError error) {
        C9768m.m32346f(query, "query");
        C9768m.m32346f(searchResultsList, "searchResultsList");
        return new SearchResult(query, specificStore, searchResultsList, filters, currentOffset, nextOffset, total, loading, isFreshResult, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) other;
        return C9768m.m32341a(this.query, searchResult.query) && C9768m.m32341a(this.specificStore, searchResult.specificStore) && C9768m.m32341a(this.searchResultsList, searchResult.searchResultsList) && C9768m.m32341a(this.filters, searchResult.filters) && this.currentOffset == searchResult.currentOffset && this.nextOffset == searchResult.nextOffset && this.total == searchResult.total && this.loading == searchResult.loading && this.isFreshResult == searchResult.isFreshResult && this.error == searchResult.error;
    }

    public final int getCurrentOffset() {
        return this.currentOffset;
    }

    public final SearchResultError getError() {
        return this.error;
    }

    public final SearchFilters getFilters() {
        return this.filters;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final int getNextOffset() {
        return this.nextOffset;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<SearchAppResult> getSearchResultsList() {
        return this.searchResultsList;
    }

    public final String getSpecificStore() {
        return this.specificStore;
    }

    public final int getTotal() {
        return this.total;
    }

    public final boolean hasError() {
        return this.error != null;
    }

    public final boolean hasMore() {
        return (this.nextOffset >= this.total || this.loading || hasError()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.query.hashCode() * 31;
        String str = this.specificStore;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.searchResultsList.hashCode()) * 31;
        SearchFilters searchFilters = this.filters;
        int hashCode3 = (((((((hashCode2 + (searchFilters == null ? 0 : searchFilters.hashCode())) * 31) + this.currentOffset) * 31) + this.nextOffset) * 31) + this.total) * 31;
        boolean z = this.loading;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z2 = this.isFreshResult;
        int i4 = (i3 + (z2 ? 1 : z2 ? 1 : 0)) * 31;
        SearchResultError searchResultError = this.error;
        return i4 + (searchResultError != null ? searchResultError.hashCode() : 0);
    }

    public final boolean isFreshResult() {
        return this.isFreshResult;
    }

    public String toString() {
        return "SearchResult(query=" + this.query + ", specificStore=" + this.specificStore + ", searchResultsList=" + this.searchResultsList + ", filters=" + this.filters + ", currentOffset=" + this.currentOffset + ", nextOffset=" + this.nextOffset + ", total=" + this.total + ", loading=" + this.loading + ", isFreshResult=" + this.isFreshResult + ", error=" + this.error + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SearchResult(java.lang.String r12, java.lang.String r13, java.util.List r14, cm.aptoide.p092pt.search.model.SearchFilters r15, int r16, int r17, int r18, boolean r19, boolean r20, cm.aptoide.p092pt.search.model.SearchResultError r21, int r22, kotlin.jvm.internal.C9756g r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r13
        La:
            r3 = r0 & 4
            if (r3 == 0) goto L18
            java.util.List r3 = java.util.Collections.emptyList()
            java.lang.String r4 = "emptyList()"
            kotlin.jvm.internal.C9768m.m32345e(r3, r4)
            goto L19
        L18:
            r3 = r14
        L19:
            r4 = r0 & 8
            if (r4 == 0) goto L1f
            r4 = r2
            goto L20
        L1f:
            r4 = r15
        L20:
            r5 = r0 & 16
            r6 = -1
            if (r5 == 0) goto L27
            r5 = -1
            goto L29
        L27:
            r5 = r16
        L29:
            r7 = r0 & 32
            if (r7 == 0) goto L2f
            r7 = -1
            goto L31
        L2f:
            r7 = r17
        L31:
            r8 = r0 & 64
            if (r8 == 0) goto L36
            goto L38
        L36:
            r6 = r18
        L38:
            r8 = r0 & 128(0x80, float:1.794E-43)
            r9 = 0
            if (r8 == 0) goto L3f
            r8 = 0
            goto L41
        L3f:
            r8 = r19
        L41:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L46
            goto L48
        L46:
            r9 = r20
        L48:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L4d
            goto L4f
        L4d:
            r2 = r21
        L4f:
            r13 = r11
            r14 = r12
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r7
            r20 = r6
            r21 = r8
            r22 = r9
            r23 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.search.model.SearchResult.<init>(java.lang.String, java.lang.String, java.util.List, cm.aptoide.pt.search.model.SearchFilters, int, int, int, boolean, boolean, cm.aptoide.pt.search.model.SearchResultError, int, kotlin.a0.d.g):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SearchResult(String str, SearchResultError searchResultError) {
        this(str, (String) null, searchResultError);
        C9768m.m32346f(str, "query");
        C9768m.m32346f(searchResultError, "error");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SearchResult(java.lang.String r13, java.lang.String r14, cm.aptoide.p092pt.search.model.SearchResultError r15) {
        /*
            r12 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.C9768m.m32346f(r13, r0)
            java.lang.String r0 = "error"
            kotlin.jvm.internal.C9768m.m32346f(r15, r0)
            java.util.List r4 = java.util.Collections.emptyList()
            java.lang.String r0 = "emptyList()"
            kotlin.jvm.internal.C9768m.m32345e(r4, r0)
            r5 = 0
            r6 = -1
            r7 = -1
            r8 = -1
            r9 = 0
            r10 = 0
            r1 = r12
            r2 = r13
            r3 = r14
            r11 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.search.model.SearchResult.<init>(java.lang.String, java.lang.String, cm.aptoide.pt.search.model.SearchResultError):void");
    }
}
