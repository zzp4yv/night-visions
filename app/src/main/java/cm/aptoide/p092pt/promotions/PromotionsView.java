package cm.aptoide.p092pt.promotions;

import cm.aptoide.p092pt.presenter.View;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface PromotionsView extends View {
    C11186e<PromotionAppClick> appCardClick();

    C11186e<PromotionViewApp> cancelDownload();

    C11186e<PromotionViewApp> claimAppClick();

    C11186e<PromotionViewApp> installButtonClick();

    void lockPromotionApps(boolean z);

    C11186e<PromotionViewApp> pauseDownload();

    C11186e<Void> promotionOverDialogClick();

    C11186e<PromotionViewApp> resumeDownload();

    C11186e<Void> retryClicked();

    void setPromotionMessage(String str);

    void showDownloadError(PromotionViewApp promotionViewApp);

    void showErrorView();

    void showLoading();

    void showPromotionApp(PromotionViewApp promotionViewApp, boolean z);

    void showPromotionFeatureGraphic(String str);

    void showPromotionOverDialog();

    void showPromotionTitle(String str);

    C11186e<Boolean> showRootInstallWarningPopup();

    void updateClaimStatus(String str);
}
