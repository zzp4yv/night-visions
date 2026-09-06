package cm.aptoide.p092pt.view.settings;

import cm.aptoide.accountmanager.Account;
import cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.GetStore;
import cm.aptoide.p092pt.dataprovider.model.p096v7.store.Store;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface MyAccountView extends View {
    C11186e<Void> aptoideBackupCardViewClick();

    C11186e<Void> aptoideTvCardViewClick();

    C11186e<Void> aptoideUploaderCardViewClick();

    C11186e<Void> createStoreClick();

    C11186e<Void> editStoreClick();

    C11186e<Void> editUserProfileClick();

    C11186e<GetStore> getStore();

    C11186e<Void> loginClick();

    void refreshUI(Store store);

    C11186e<Void> settingsClicked();

    void showAccount(Account account);

    void showLoginAccountDisplayable();

    C11186e<Void> signOutClick();

    C11186e<SocialMediaView.SocialMediaType> socialMediaClick();

    void startAptoideTvWebView();

    C11186e<Void> storeClick();

    C11186e<Void> userClick();
}
