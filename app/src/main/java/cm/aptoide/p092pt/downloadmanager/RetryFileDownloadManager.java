package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.downloadmanager.AppDownloadStatus;
import cm.aptoide.p092pt.logger.Logger;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.InterfaceC11198k;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
public class RetryFileDownloadManager implements RetryFileDownloader {
    private static final String TAG = "RetryFileDownloadManage";
    private String alternativeDownloadPath;
    private final String attributionId;
    private FileDownloader fileDownloader;
    private FileDownloaderProvider fileDownloaderProvider;
    private final String fileName;
    private final int fileType;
    private final String mainDownloadPath;
    private String md5;
    private final String packageName;
    private boolean retried;
    private C11370b<FileDownloadCallback> retryFileDownloadSubject = C11370b.m40637g1();
    private InterfaceC11198k startDownloadSubscription;
    private final int versionCode;

    public RetryFileDownloadManager(String str, int i2, String str2, int i3, String str3, String str4, FileDownloaderProvider fileDownloaderProvider, String str5, String str6) {
        this.mainDownloadPath = str;
        this.fileType = i2;
        this.packageName = str2;
        this.versionCode = i3;
        this.fileName = str3;
        this.md5 = str4;
        this.fileDownloaderProvider = fileDownloaderProvider;
        this.alternativeDownloadPath = str5;
        this.attributionId = str6;
    }

    private C11186e<FileDownloadCallback> handleFileDownloadProgress(FileDownloader fileDownloader) {
        return fileDownloader.observeFileDownloadProgress().m40076Q0(new InterfaceC11208e() { // from class: cm.aptoide.pt.downloadmanager.t1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getDownloadState() == AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND);
                return valueOf;
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.downloadmanager.s1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RetryFileDownloadManager.this.m7616a((FileDownloadCallback) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.downloadmanager.r1
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                RetryFileDownloadManager.this.m7617b((FileDownloadCallback) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFileDownloadProgress$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m7616a(FileDownloadCallback fileDownloadCallback) {
        if (fileDownloadCallback.getDownloadState() != AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND || this.retried) {
            return C11186e.m40025S(fileDownloadCallback);
        }
        Logger.getInstance().m8273d(TAG, "File not found error, restarting the download with the alternative link");
        FileDownloader createFileDownloader = this.fileDownloaderProvider.createFileDownloader(this.md5, this.alternativeDownloadPath, this.fileType, this.packageName, this.versionCode, this.fileName, C11370b.m40637g1(), this.attributionId);
        this.retried = true;
        this.fileDownloader = createFileDownloader;
        return createFileDownloader.startFileDownload().m39974b(handleFileDownloadProgress(createFileDownloader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$handleFileDownloadProgress$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7617b(FileDownloadCallback fileDownloadCallback) {
        this.retryFileDownloadSubject.onNext(fileDownloadCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$startFileDownload$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m7618c(FileDownloader fileDownloader) {
        return fileDownloader.startFileDownload().m39974b(handleFileDownloadProgress(fileDownloader));
    }

    private FileDownloader setupFileDownloader() {
        FileDownloader createFileDownloader = this.fileDownloaderProvider.createFileDownloader(this.md5, this.mainDownloadPath, this.fileType, this.packageName, this.versionCode, this.fileName, C11370b.m40637g1(), this.attributionId);
        this.fileDownloader = createFileDownloader;
        return createFileDownloader;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public C11186e<FileDownloadCallback> observeFileDownloadProgress() {
        return this.retryFileDownloadSubject;
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public C11183b pauseDownload() {
        return this.fileDownloader.pauseDownload();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public C11183b removeDownloadFile() {
        return this.fileDownloader.removeDownloadFile();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public void startFileDownload() {
        this.startDownloadSubscription = C11186e.m40025S(setupFileDownloader()).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.downloadmanager.q1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RetryFileDownloadManager.this.m7618c((FileDownloader) obj);
            }
        }).m40056D0();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public void stop() {
        InterfaceC11198k interfaceC11198k = this.startDownloadSubscription;
        if (interfaceC11198k == null || interfaceC11198k.isUnsubscribed()) {
            return;
        }
        this.startDownloadSubscription.unsubscribe();
    }

    @Override // cm.aptoide.p092pt.downloadmanager.RetryFileDownloader
    public void stopFailedDownload() {
        this.fileDownloader.stopFailedDownload();
    }
}
