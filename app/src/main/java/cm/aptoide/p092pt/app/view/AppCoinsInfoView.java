package cm.aptoide.p092pt.app.view;

import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.editorial.ScrollEvent;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface AppCoinsInfoView extends View {
    void addBottomCardAnimation();

    C11186e<Void> appCoinsWalletLinkClick();

    C11186e<ScrollEvent> appItemVisibilityChanged();

    C11186e<Void> cardViewClick();

    C11186e<Void> catappultButtonClick();

    C11186e<Void> installButtonClick();

    void openApp(String str);

    void removeBottomCardAnimation();

    void setBonusAppc(int i2);

    void setButtonText(boolean z);

    void setNoBonusAppcView();

    C11186e<SocialMediaView.SocialMediaType> socialMediaClick();
}
