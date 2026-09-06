package cm.aptoide.p092pt.editorial;

import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.editorial.EditorialViewModel;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.reactions.ReactionEvent;
import cm.aptoide.p092pt.reactions.data.TopReaction;
import java.util.List;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface EditorialView extends View {
    C11186e<EditorialEvent> actionButtonClicked();

    void addBottomCardAnimation();

    C11186e<EditorialEvent> appCardClicked(EditorialViewModel editorialViewModel);

    C11186e<EditorialDownloadEvent> cancelDownload(EditorialViewModel editorialViewModel);

    String getAction();

    C11186e<Boolean> handleMovingCollapse();

    void hideLoading();

    C11186e<EditorialDownloadEvent> installButtonClick(EditorialViewModel editorialViewModel);

    C11186e<Void> isViewReady();

    void manageMediaListDescriptionAnimationVisibility(EditorialEvent editorialEvent);

    void managePlaceHolderVisibity();

    C11186e<EditorialEvent> mediaContentClicked();

    C11186e<EditorialEvent> mediaListDescriptionChanged();

    void openApp(String str);

    C11186e<EditorialDownloadEvent> pauseDownload(EditorialViewModel editorialViewModel);

    C11186e<ScrollEvent> placeHolderVisibilityChange();

    void populateView(EditorialViewModel editorialViewModel);

    C11186e<ReactionEvent> reactionClicked();

    C11186e<Void> reactionsButtonClicked();

    C11186e<Void> reactionsButtonLongPressed();

    void removeBottomCardAnimation();

    C11186e<EditorialDownloadEvent> resumeDownload(EditorialViewModel editorialViewModel);

    C11186e<Void> retryClicked();

    void setMediaListDescriptionsVisible(EditorialEvent editorialEvent);

    void setUserReaction(String str);

    C11186e<Boolean> showDowngradeMessage();

    void showDowngradingMessage();

    void showDownloadError(EditorialDownloadModel editorialDownloadModel);

    void showDownloadModel(EditorialDownloadModel editorialDownloadModel);

    void showError(EditorialViewModel.Error error);

    void showGenericErrorToast();

    void showLoading();

    void showLoginDialog();

    void showNetworkErrorToast();

    void showReactionsPopup(String str, String str2);

    C11186e<Boolean> showRootInstallWarningPopup();

    void showTopReactions(String str, List<TopReaction> list, int i2);

    C11186e<Void> snackLoginClick();

    C11186e<SocialMediaView.SocialMediaType> socialMediaClick();
}
