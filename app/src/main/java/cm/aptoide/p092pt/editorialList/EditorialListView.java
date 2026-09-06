package cm.aptoide.p092pt.editorialList;

import cm.aptoide.p092pt.bonus.BonusAppcModel;
import cm.aptoide.p092pt.home.bundles.editorial.EditorialHomeEvent;
import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.reactions.ReactionsHomeEvent;
import java.util.List;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface EditorialListView extends View {
    C11186e<EditorialHomeEvent> editorialCardClicked();

    void hideLoadMore();

    void hideLoading();

    void hideRefresh();

    C11186e<Void> imageClick();

    C11186e<EditorialHomeEvent> onPopupDismiss();

    void populateView(List<CurationCard> list, BonusAppcModel bonusAppcModel);

    C11186e<Object> reachesBottom();

    C11186e<EditorialHomeEvent> reactionButtonLongPress();

    C11186e<ReactionsHomeEvent> reactionClicked();

    C11186e<EditorialHomeEvent> reactionsButtonClicked();

    C11186e<Void> refreshes();

    C11186e<Void> retryClicked();

    void setDefaultUserImage();

    void setScrollEnabled(Boolean bool);

    void setUserImage(String str);

    void showAvatar();

    void showGenericError();

    void showGenericErrorToast();

    void showLoadMore();

    void showLoading();

    void showLogInDialog();

    void showNetworkError();

    void showNetworkErrorToast();

    void showReactionsPopup(String str, String str2, int i2);

    C11186e<Void> snackLogInClick();

    void update(List<CurationCard> list);

    void updateEditorialCard(CurationCard curationCard);

    C11186e<EditorialListEvent> visibleCards();
}
