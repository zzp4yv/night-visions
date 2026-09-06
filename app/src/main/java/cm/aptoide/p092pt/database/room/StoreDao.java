package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public interface StoreDao {
    AbstractC9043m<List<RoomStore>> getAll();

    AbstractC9049s<RoomStore> getByStoreId(long j2);

    AbstractC9049s<RoomStore> getByStoreName(String str);

    void insert(RoomStore roomStore);

    AbstractC9043m<Integer> isSubscribed(long j2);

    void removeByStoreName(String str);

    void saveAll(List<RoomStore> list);
}
