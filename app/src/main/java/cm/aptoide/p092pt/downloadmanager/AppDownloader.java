package cm.aptoide.p092pt.downloadmanager;

import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface AppDownloader {
    C11186e<AppDownloadStatus> observeDownloadProgress();

    C11183b pauseAppDownload();

    C11183b removeAppDownload();

    void startAppDownload();

    void stop();
}
