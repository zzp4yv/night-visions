package cm.aptoide.p092pt.promotions;

import android.text.Editable;
import cm.aptoide.p092pt.navigator.Result;
import cm.aptoide.p092pt.presenter.View;
import p241e.p294g.p295a.p305d.C8949b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface ClaimPromotionDialogView extends View {
    C11186e<ClaimPromotionsClickWrapper> continueWalletClick();

    void dismissDialog();

    C11186e<Void> dismissGenericErrorClick();

    C11186e<ClaimDialogResultWrapper> dismissGenericMessage();

    C11186e<C8949b> editTextChanges();

    void fetchWalletAddressByClipboard();

    void fetchWalletAddressByIntent();

    C11186e<Result> getActivityResults();

    C11186e<String> getWalletClick();

    void handleEmptyEditText(Editable editable);

    C11186e<Void> onCancelWalletUpdate();

    C11186e<Void> onUpdateWalletClick();

    void sendWalletIntent();

    void showCanceledVerificationError();

    void showClaimSuccess();

    void showGenericError();

    void showInvalidWalletAddress();

    void showLoading();

    void showPromotionAlreadyClaimed();

    void showUpdateWalletDialog();

    void updateWalletText(String str);

    void verifyWallet();

    C11186e<String> walletCancelClick();
}
