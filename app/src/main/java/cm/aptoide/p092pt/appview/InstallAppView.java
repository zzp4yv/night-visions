package cm.aptoide.p092pt.appview;

import cm.aptoide.p092pt.app.DownloadModel;
import cm.aptoide.p092pt.app.view.AppCoinsViewModel;
import cm.aptoide.p092pt.presenter.View;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface InstallAppView extends View {
    C11186e<Void> cancelDownload();

    C11186e<DownloadModel.Action> installAppClick();

    void openApp(String str);

    C11186e<Void> pauseDownload();

    C11186e<DownloadModel.Action> resumeDownload();

    C11186e<Boolean> showDowngradeMessage();

    void showDowngradingMessage();

    void showDownloadAppModel(DownloadModel downloadModel, AppCoinsViewModel appCoinsViewModel, boolean z);

    void showGenericErrorDialog();

    void showInvalidAppInfoErrorDialog();

    C11186e<Boolean> showRootInstallWarningPopup();
}
