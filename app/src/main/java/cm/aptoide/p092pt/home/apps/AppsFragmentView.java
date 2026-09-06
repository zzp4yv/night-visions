package cm.aptoide.p092pt.home.apps;

import cm.aptoide.p092pt.presenter.View;
import cm.aptoide.p092pt.view.p107rx.RxAlertDialog;
import p456rx.C11186e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface AppsFragmentView extends View {
    C11186e<App> cancelDownload();

    C11186e<App> cardClick();

    void hidePullToRefresh();

    C11186e<Void> imageClick();

    C11186e<App> installApp();

    C11186e<App> pauseDownload();

    C11186e<Void> refreshApps();

    C11186e<App> resumeDownload();

    void scrollToTop();

    void setDefaultUserImage();

    void setUserImage(String str);

    void showAvatar();

    Single<RxAlertDialog.Result> showIgnoreUpdateDialog();

    void showModel(AppsModel appsModel);

    C11186e<Boolean> showRootWarning();

    void showUnknownErrorMessage();

    C11186e<App> startDownload();

    C11186e<Void> updateAll();

    C11186e<App> updateLongClick();
}
