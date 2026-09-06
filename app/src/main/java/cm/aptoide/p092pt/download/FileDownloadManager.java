package cm.aptoide.p092pt.download;

import cm.aptoide.p092pt.downloadmanager.Constants;
import cm.aptoide.p092pt.downloadmanager.FileDownloadCallback;
import cm.aptoide.p092pt.downloadmanager.FileDownloader;
import p241e.p307h.p308a.C9009q;
import p241e.p307h.p308a.InterfaceC8958a;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11204a;

/* loaded from: classes.dex */
public class FileDownloadManager implements FileDownloader {
    private static final int APTOIDE_DOWNLOAD_TASK_TAG_KEY = 888;
    public static final int PROGRESS_MAX_VALUE = 100;
    public static final int RETRY_TIMES = 3;
    private int downloadId;
    private String downloadsPath;
    private FileDownloadTask fileDownloadTask;
    private C9009q fileDownloader;
    private final String fileName;
    private final int fileType;
    private final String mainDownloadPath;
    private final String packageName;
    private final int versionCode;

    public FileDownloadManager(C9009q c9009q, FileDownloadTask fileDownloadTask, String str, String str2, int i2, String str3, int i3, String str4) {
        this.fileDownloader = c9009q;
        this.fileDownloadTask = fileDownloadTask;
        this.downloadsPath = str;
        this.mainDownloadPath = str2;
        this.fileType = i2;
        this.packageName = str3;
        this.versionCode = i3;
        this.fileName = str4;
    }

    private void createBaseDownloadTask(String str, int i2, String str2, int i3, String str3) {
        InterfaceC8958a m29057d = this.fileDownloader.m29057d(str);
        m29057d.mo28614O(3);
        m29057d.mo28623f(Constants.VERSION_CODE, String.valueOf(i2));
        m29057d.mo28623f(Constants.PACKAGE, str2);
        m29057d.mo28623f(Constants.FILE_TYPE, String.valueOf(i3));
        m29057d.mo28627j(APTOIDE_DOWNLOAD_TASK_TAG_KEY, this.fileDownloadTask);
        m29057d.mo28619W(this.fileDownloadTask);
        m29057d.mo28616R(100);
        m29057d.mo28628k(this.downloadsPath + str3);
        this.downloadId = m29057d.mo28630m().mo28654a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$pauseDownload$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7503a() {
        this.fileDownloader.m29062k(this.fileDownloadTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$removeDownloadFile$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7504b() {
        this.fileDownloader.m29056c(this.downloadId, this.mainDownloadPath);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startFileDownload$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7505c() {
        String str = this.mainDownloadPath;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("The url for the download can not be empty");
        }
        createBaseDownloadTask(this.mainDownloadPath, this.versionCode, this.packageName, this.fileType, this.fileName);
        this.fileDownloader.m29064m(this.fileDownloadTask, true);
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloader
    public C11186e<FileDownloadCallback> observeFileDownloadProgress() {
        return this.fileDownloadTask.onDownloadStateChanged();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloader
    public C11183b pauseDownload() {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.download.g
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                FileDownloadManager.this.m7503a();
            }
        });
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloader
    public C11183b removeDownloadFile() {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.download.f
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                FileDownloadManager.this.m7504b();
            }
        });
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloader
    public C11183b startFileDownload() {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.download.h
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                FileDownloadManager.this.m7505c();
            }
        });
    }

    @Override // cm.aptoide.p092pt.downloadmanager.FileDownloader
    public void stopFailedDownload() {
        int m29063l = this.fileDownloader.m29063l(this.downloadId, null);
        if (m29063l != 0) {
            this.fileDownloader.m29061j(m29063l);
        }
    }
}
