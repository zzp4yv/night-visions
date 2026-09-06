package cm.aptoide.p092pt.search.view;

import android.content.DialogInterface;
import android.view.MenuItem;
import cm.aptoide.aptoideviews.filters.Filter;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.download.view.DownloadClick;
import cm.aptoide.p092pt.search.model.SearchAppResult;
import cm.aptoide.p092pt.search.model.SearchAppResultWrapper;
import cm.aptoide.p092pt.search.model.SearchQueryModel;
import cm.aptoide.p092pt.search.model.SearchResultError;
import cm.aptoide.p092pt.search.suggestions.SearchQueryEvent;
import java.util.List;
import p024c.p052i.p059j.C0955e;
import p241e.p294g.p295a.p297b.p302c.p303a.C8940g;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface SearchResultView extends SearchSuggestionsView {

    public interface Model {
        List<Filter> getFilters();

        SearchQueryModel getSearchQueryModel();

        String getStoreName();

        String getStoreTheme();

        boolean hasLoadedAds();

        boolean hasLoadedResults();
    }

    void addAllStoresResult(String str, List<SearchAppResult> list, boolean z, boolean z2, boolean z3, SearchResultError searchResultError);

    C11186e<DialogInterface> adultContentDialogNegativeClick();

    C11186e<DialogInterface> adultContentDialogPositiveClick();

    C11186e<DialogInterface> adultContentPinDialogNegativeClick();

    C11186e<CharSequence> adultContentWithPinDialogPositiveClick();

    void clearUnsubmittedQuery();

    C11186e<Boolean> clickAdultContentSwitch();

    void disableAdultContent();

    void disableUpNavigation();

    void enableAdultContent();

    C11186e<List<Filter>> filtersChangeEvents();

    C11186e<DownloadClick> getDownloadClickEvents();

    C11186e<ScreenShotClickEvent> getScreenshotClickEvent();

    Model getViewModel();

    boolean hasResults();

    void hideLoading();

    void hideSuggestionsViews();

    boolean isSearchViewExpanded();

    C11186e<C0955e<String, SearchQueryEvent>> listenToSuggestionClick();

    C11186e<SearchAppResultWrapper> onViewItemClicked();

    C11186e<C8940g> queryChanged();

    void queryEvent(C8940g c8940g);

    C11186e<Void> retryClicked();

    void scrollToTop();

    C11186e<MenuItem> searchMenuItemClick();

    C11186e<Void> searchResultsReachedBottom();

    C11186e<Void> searchSetup();

    void setAdultContentSwitch(Boolean bool);

    void setUnsubmittedQuery(String str);

    void setVisibilityOnRestore();

    boolean shouldFocusInSearchBar();

    boolean shouldHideUpNavigation();

    boolean shouldShowSuggestions();

    void showAdultContentConfirmationDialog();

    void showAdultContentConfirmationDialogWithPin();

    void showBannerAd();

    void showGenericErrorView();

    void showLoading();

    void showMoreLoading();

    void showNativeAds();

    void showNoNetworkView();

    void showNoResultsView();

    void showResultsLoading();

    void showResultsView();

    void showWrongPinErrorMessage();

    void toggleSuggestionsView();

    void toggleTrendingView();

    C11186e<Void> toolbarClick();

    C11186e<Void> viewHasNoResults();
}
