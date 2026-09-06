package cm.aptoide.p092pt.file;

import cm.aptoide.p092pt.dataprovider.cache.L2Cache;
import cm.aptoide.p092pt.downloadmanager.AptoideDownloadManager;
import cm.aptoide.p092pt.utils.FileUtils;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class FileManager {
    private final String[] cacheFolders;
    private final CacheHelper cacheHelper;
    private final AptoideDownloadManager downloadManager;
    private final FileUtils fileUtils;
    private final L2Cache httpClientCache;

    public FileManager(CacheHelper cacheHelper, FileUtils fileUtils, String[] strArr, AptoideDownloadManager aptoideDownloadManager, L2Cache l2Cache) {
        this.cacheHelper = cacheHelper;
        this.fileUtils = fileUtils;
        this.cacheFolders = strArr;
        this.downloadManager = aptoideDownloadManager;
        this.httpClientCache = l2Cache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deleteCache$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11186e m7813a(boolean z, Long l) {
        return (l.longValue() <= 0 || !z) ? C11186e.m40025S(l) : this.downloadManager.invalidateDatabase().m39974b(C11186e.m40025S(l));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$deleteCache$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7814b(Long l) {
        this.httpClientCache.clean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$purgeCache$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Single m7815c(Long l) {
        return this.downloadManager.invalidateDatabase().m39975c(Single.m39913m(l));
    }

    public C11186e<Long> deleteCache(final boolean z) {
        return this.fileUtils.deleteFolder(this.cacheFolders).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.file.f
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return FileManager.this.m7813a(z, (Long) obj);
            }
        }).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.file.h
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                FileManager.this.m7814b((Long) obj);
            }
        });
    }

    public Single<Long> purgeCache() {
        return this.cacheHelper.cleanCache().m40085Z0().m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.file.g
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return FileManager.this.m7815c((Long) obj);
            }
        });
    }
}
