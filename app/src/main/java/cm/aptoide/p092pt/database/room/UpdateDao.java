package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public interface UpdateDao {
    void deleteAll(List<RoomUpdate> list);

    void deleteByPackageName(String str);

    AbstractC9049s<RoomUpdate> get(String str);

    AbstractC9049s<List<RoomUpdate>> getAllByExcluded(boolean z);

    AbstractC9043m<List<RoomUpdate>> getAllByExcludedSorted(boolean z);

    AbstractC9049s<RoomUpdate> getByPackageAndExcluded(String str, boolean z);

    void insert(RoomUpdate roomUpdate);

    void insertAll(List<RoomUpdate> list);
}
