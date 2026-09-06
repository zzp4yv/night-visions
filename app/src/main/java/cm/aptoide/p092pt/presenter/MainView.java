package cm.aptoide.p092pt.presenter;

import android.content.Intent;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface MainView extends View {
    void dismissAutoUpdateDialog();

    void dismissInstallationError();

    C11186e<Void> getInstallErrorsDismiss();

    Intent getIntentAfterCreate();

    void hideLoadingView();

    C11186e<String> onAuthenticationIntent();

    void showGenericErrorMessage();

    void showInstallationError(int i2);

    void showInstallationSuccessMessage();

    void showLoadingView();

    void showUnknownErrorMessage();

    void showUpdatesBadge(int i2);
}
