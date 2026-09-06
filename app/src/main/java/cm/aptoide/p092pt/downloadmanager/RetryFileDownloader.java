package cm.aptoide.p092pt.downloadmanager;

import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface RetryFileDownloader {
    C11186e<FileDownloadCallback> observeFileDownloadProgress();

    C11183b pauseDownload();

    C11183b removeDownloadFile();

    void startFileDownload();

    void stop();

    void stopFailedDownload();
}
