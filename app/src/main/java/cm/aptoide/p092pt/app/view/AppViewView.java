package cm.aptoide.p092pt.app.view;

import android.util.Pair;
import android.view.MenuItem;
import cm.aptoide.p092pt.app.AppModel;
import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.ReviewsViewModel;
import cm.aptoide.p092pt.app.view.screenshots.ScreenShotClickEvent;
import cm.aptoide.p092pt.app.view.similar.SimilarAppClickEvent;
import cm.aptoide.p092pt.app.view.similar.SimilarAppsBundle;
import cm.aptoide.p092pt.appview.InstallAppView;
import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.promotions.Promotion;
import cm.aptoide.p092pt.promotions.WalletApp;
import cm.aptoide.p092pt.search.model.SearchAdResult;
import cm.aptoide.p092pt.utils.GenericDialogs;
import cm.aptoide.p092pt.view.app.DetailedAppRequestResult;
import cm.aptoide.p092pt.view.app.FlagsVote;
import java.util.List;
import p241e.p294g.p295a.p304c.C8947f;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface AppViewView extends InstallAppView {
    C11186e<String> apkfyDialogPositiveClick();

    C11186e<WalletApp> cancelPromotionDownload();

    C11186e<Promotion> claimAppClick();

    C11186e<Void> clickBonusAppcFlair();

    C11186e<Void> clickCatappultCard();

    C11186e<Void> clickDeveloperEmail();

    C11186e<Void> clickDeveloperPermissions();

    C11186e<Void> clickDeveloperPrivacy();

    C11186e<Void> clickDeveloperWebsite();

    C11186e<Void> clickErrorRetry();

    C11186e<FlagsVote.VoteType> clickFakeFlag();

    C11186e<Void> clickFollowStore();

    C11186e<Void> clickGetAppcInfo();

    C11186e<FlagsVote.VoteType> clickLicenseFlag();

    C11186e<Void> clickLoginSnack();

    C11186e<Void> clickOtherVersions();

    C11186e<Void> clickRateApp();

    C11186e<Void> clickRateAppLarge();

    C11186e<Void> clickRateAppLayout();

    C11186e<Void> clickReadAllReviews();

    C11186e<Void> clickReviewsLayout();

    C11186e<SimilarAppClickEvent> clickSimilarApp();

    C11186e<Void> clickStoreLayout();

    C11186e<MenuItem> clickToolbar();

    C11186e<Void> clickTrustedBadge();

    C11186e<FlagsVote.VoteType> clickVirusFlag();

    C11186e<FlagsVote.VoteType> clickWorkingFlag();

    C11186e<ReadMoreClickEvent> clickedReadMore();

    void defaultShare(String str, String str2);

    void disableFlags();

    C11186e<Promotion> dismissWalletPromotionClick();

    void dismissWalletPromotionView();

    void displayNotLoggedInSnack();

    void displayStoreFollowedSnack(String str);

    void enableFlags();

    void extractReferrer(SearchAdResult searchAdResult);

    String getLanguageFilter();

    C11186e<ScreenShotClickEvent> getScreenshotClickEvent();

    void handleError(DetailedAppRequestResult.Error error);

    void hideReviews();

    void hideSimilarApps();

    C11186e<Void> iabInfoClick();

    void incrementFlags(FlagsVote.VoteType voteType);

    C11186e<Pair<Promotion, WalletApp>> installWalletButtonClick();

    boolean isSimilarAppsVisible();

    void navigateToDeveloperEmail(AppModel appModel);

    void navigateToDeveloperPermissions(AppModel appModel);

    void navigateToDeveloperPrivacy(AppModel appModel);

    void navigateToDeveloperWebsite(AppModel appModel);

    C11186e<WalletApp> pausePromotionDownload();

    void populateReviews(ReviewsViewModel reviewsViewModel, AppModel appModel);

    void populateSimilar(List<SimilarAppsBundle> list);

    void recoverScrollViewState();

    C11186e<WalletApp> resumePromotionDownload();

    void scrollReviews(Integer num);

    C11186e<Integer> scrollReviewsResponse();

    C11186e<C8947f> scrollVisibleSimilarApps();

    void setFollowButton(boolean z);

    void setInstallButton(AppCoinsViewModel appCoinsViewModel);

    void setupAppcAppView(boolean z, BonusAppcModel bonusAppcModel);

    void showApkfyElement(String str);

    void showAppView(AppModel appModel);

    void showAppcWalletPromotionView(Promotion promotion, WalletApp walletApp, Promotion.ClaimAction claimAction, DownloadModel downloadModel);

    void showDownloadError(DownloadModel downloadModel);

    void showDownloadingSimilarApps(boolean z);

    void showFlagVoteSubmittedMessage();

    void showLoading();

    C11186e<Void> showOpenAndInstallApkFyDialog(String str, String str2, double d2, float f2, String str3, int i2);

    C11186e<Void> showOpenAndInstallDialog(String str, String str2);

    C11186e<GenericDialogs.EResponse> showRateDialog(String str, String str2, String str3);

    void showShareOnTvDialog(long j2);

    void showTrustedDialog(AppModel appModel);

    C11186e<Boolean> similarAppsVisibilityFromInstallClick();
}
