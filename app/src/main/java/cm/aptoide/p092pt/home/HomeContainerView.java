package cm.aptoide.p092pt.home;

import cm.aptoide.p092pt.home.HomeContainerFragment;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface HomeContainerView extends View {
    C11186e<Boolean> appsChipClicked();

    void dismissPromotionsDialog();

    void expandChips();

    C11186e<Boolean> gamesChipClicked();

    C11186e<String> gdprDialogClicked();

    void hidePromotionsIcon();

    C11186e<HomeContainerFragment.ChipsEvents> isChipChecked();

    C11186e<String> promotionsHomeDialogClicked();

    void setDefaultUserImage();

    void setUserImage(String str);

    void showAvatar();

    void showPromotionsHomeDialog(HomePromotionsWrapper homePromotionsWrapper);

    void showPromotionsHomeIcon(HomePromotionsWrapper homePromotionsWrapper);

    void showTermsAndConditionsDialog();

    C11186e<Void> toolbarPromotionsClick();

    C11186e<Void> toolbarUserClick();

    void uncheckChips();
}
