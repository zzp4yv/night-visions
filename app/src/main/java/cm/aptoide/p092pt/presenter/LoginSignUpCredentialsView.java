package cm.aptoide.p092pt.presenter;

import android.content.Context;
import cm.aptoide.p092pt.account.view.GooglePlayServicesView;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface LoginSignUpCredentialsView extends GooglePlayServicesView {
    void dismiss();

    Context getApplicationContext();

    C11186e<Boolean> googleSignUpEvent();

    void hideGoogleLogin();

    void hideKeyboard();

    void hideLoading();

    void lockScreenRotation();

    C11186e<Void> privacyPolicyClickEvent();

    void setCobrandText();

    void showAptoideLoginArea();

    C11186e<Boolean> showAptoideLoginAreaClick();

    void showError(String str);

    void showGoogleLogin();

    void showLoading();

    void showMagicLinkError(String str);

    void showTCandPP();

    void showTermsConditionError();

    C11186e<Void> termsAndConditionsClickEvent();

    boolean tryCloseLoginBottomSheet(boolean z);

    void unlockScreenRotation();
}
