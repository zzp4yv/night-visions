package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public interface DownloadDAO {
    AbstractC9043m<List<RoomDownload>> getAll();

    AbstractC9043m<List<RoomDownload>> getAsList(String str);

    AbstractC9043m<RoomDownload> getAsObservable(String str);

    AbstractC9049s<RoomDownload> getAsSingle(String str);

    AbstractC9043m<List<RoomDownload>> getInQueueSortedDownloads();

    AbstractC9043m<List<RoomDownload>> getOutOfSpaceDownloads();

    AbstractC9043m<List<RoomDownload>> getRunningDownloads();

    void insert(RoomDownload roomDownload);

    void insertAll(List<RoomDownload> list);

    void remove(String str);

    void remove(String str, int i2);
}
