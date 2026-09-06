package cm.aptoide.p092pt.updates;

import cm.aptoide.p092pt.database.room.RoomUpdate;
import java.util.List;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface UpdatePersistence {
    Single<Boolean> contains(String str, boolean z);

    Single<RoomUpdate> get(String str);

    Single<List<RoomUpdate>> getAll(boolean z);

    C11186e<List<RoomUpdate>> getAllSorted(boolean z);

    Single<Boolean> isExcluded(String str);

    C11183b remove(String str);

    C11183b removeAll(List<RoomUpdate> list);

    C11183b save(RoomUpdate roomUpdate);

    C11183b saveAll(List<RoomUpdate> list);
}
