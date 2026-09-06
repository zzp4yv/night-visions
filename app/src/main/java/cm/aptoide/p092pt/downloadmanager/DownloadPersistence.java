package cm.aptoide.p092pt.downloadmanager;

import cm.aptoide.p092pt.database.room.RoomDownload;
import java.util.List;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface DownloadPersistence {
    C11183b delete(String str);

    C11183b delete(String str, int i2);

    C11186e<List<RoomDownload>> getAll();

    C11186e<List<RoomDownload>> getAsList(String str);

    C11186e<RoomDownload> getAsObservable(String str);

    Single<RoomDownload> getAsSingle(String str);

    C11186e<List<RoomDownload>> getInQueueSortedDownloads();

    C11186e<List<RoomDownload>> getOutOfSpaceDownloads();

    C11186e<List<RoomDownload>> getRunningDownloads();

    C11183b save(RoomDownload roomDownload);
}
