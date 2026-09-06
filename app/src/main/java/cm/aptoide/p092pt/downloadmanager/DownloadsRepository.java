package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomDownload;
import java.util.List;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class DownloadsRepository {
    private final DownloadPersistence downloadPersistence;

    public DownloadsRepository(DownloadPersistence downloadPersistence) {
        this.downloadPersistence = downloadPersistence;
    }

    public C11186e<List<RoomDownload>> getAllDownloads() {
        return this.downloadPersistence.getAll();
    }

    public C11186e<List<RoomDownload>> getCurrentActiveDownloads() {
        return this.downloadPersistence.getRunningDownloads();
    }

    public C11186e<RoomDownload> getDownloadAsObservable(String str) {
        return this.downloadPersistence.getAsObservable(str);
    }

    public Single<RoomDownload> getDownloadAsSingle(String str) {
        return this.downloadPersistence.getAsSingle(str);
    }

    public C11186e<List<RoomDownload>> getDownloadListByMd5(String str) {
        return this.downloadPersistence.getAsList(str);
    }

    public C11186e<List<RoomDownload>> getDownloadsInProgress() {
        return this.downloadPersistence.getRunningDownloads();
    }

    public C11186e<List<RoomDownload>> getInProgressDownloadsList() {
        return this.downloadPersistence.getRunningDownloads().m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.downloadmanager.p1
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                C11186e m40084Y0;
                m40084Y0 = C11186e.m40020N((List) obj).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.downloadmanager.o1
                    @Override // p456rx.p460m.InterfaceC11208e
                    public final Object call(Object obj2) {
                        Boolean valueOf;
                        valueOf = Boolean.valueOf(r2.getOverallDownloadStatus() == 5 || r2.getOverallDownloadStatus() == 4);
                        return valueOf;
                    }
                }).m40084Y0();
                return m40084Y0;
            }
        });
    }

    public C11186e<List<RoomDownload>> getInQueueDownloads() {
        return this.downloadPersistence.getInQueueSortedDownloads();
    }

    public C11186e<List<RoomDownload>> getOutOfSpaceDownloads() {
        return this.downloadPersistence.getOutOfSpaceDownloads();
    }

    public C11183b remove(String str) {
        return this.downloadPersistence.delete(str);
    }

    public C11183b save(RoomDownload roomDownload) {
        return this.downloadPersistence.save(roomDownload);
    }

    public C11183b remove(String str, int i2) {
        return this.downloadPersistence.delete(str, i2);
    }
}
