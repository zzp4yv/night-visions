package cm.aptoide.p092pt.account.view.user;

import cm.aptoide.p092pt.account.view.ImagePickerView;
import cm.aptoide.p092pt.account.view.user.ManageUserFragment;
import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface ManageUserView extends ImagePickerView {
    C11186e<Void> cancelButtonClick();

    void hideProgressDialog();

    void loadImageStateless(String str);

    C11186e<ManageUserFragment.ViewModel> saveUserDataButtonClick();

    void setUserName(String str);

    C11183b showErrorMessage(String str);

    void showProgressDialog();
}
