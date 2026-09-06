package cm.aptoide.p092pt.account.view.user;

import cm.aptoide.p092pt.presenter.View;
import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
interface ProfileStepTwoView extends View {
    C11186e<Boolean> continueButtonClick();

    void dismissWaitDialog();

    C11186e<Boolean> makePrivateProfileButtonClick();

    C11183b showGenericErrorMessage();

    void showWaitDialog();
}
