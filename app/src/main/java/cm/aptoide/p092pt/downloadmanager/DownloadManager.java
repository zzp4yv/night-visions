package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomDownload;
import java.util.List;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface DownloadManager {
    C11183b cancelDownload(String str);

    C11186e<List<RoomDownload>> getCurrentActiveDownloads();

    C11186e<RoomDownload> getCurrentInProgressDownload();

    C11186e<RoomDownload> getDownloadAsObservable(String str);

    Single<RoomDownload> getDownloadAsSingle(String str);

    C11186e<RoomDownload> getDownloadsByMd5(String str);

    C11186e<List<RoomDownload>> getDownloadsList();

    C11183b invalidateDatabase();

    C11183b pauseAllDownloads();

    C11183b pauseDownload(String str);

    void start();

    C11183b startDownload(RoomDownload roomDownload);

    void stop();
}
