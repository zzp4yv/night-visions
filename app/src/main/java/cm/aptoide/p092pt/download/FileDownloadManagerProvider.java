package cm.aptoide.p092pt.download;

import cm.aptoide.p092pt.downloadmanager.FileDownloadCallback;
import cm.aptoide.p092pt.downloadmanager.FileDownloader;
import cm.aptoide.p092pt.downloadmanager.FileDownloaderProvider;
import p241e.p307h.p308a.C9009q;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public class FileDownloadManagerProvider implements FileDownloaderProvider {
    private final String downloadsPath;
    private final C9009q fileDownloader;
    private final Md5Comparator md5Comparator;

    public FileDownloadManagerProvider(String str, C9009q c9009q, Md5Comparator md5Comparator) {
        this.downloadsPath = str;
        this.fileDownloader = c9009q;
        this.md5Comparator = md5Comparator;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloaderProvider
    public FileDownloader createFileDownloader(String str, String str2, int i2, String str3, int i3, String str4, C11370b<FileDownloadCallback> c11370b, String str5) {
        return new FileDownloadManager(this.fileDownloader, new FileDownloadTask(c11370b, str, this.md5Comparator, str4, str5, !str3.equals("com.igg.android.lordsmobile"), i2), this.downloadsPath, str2, i2, str3, i3, str4);
    }
}
