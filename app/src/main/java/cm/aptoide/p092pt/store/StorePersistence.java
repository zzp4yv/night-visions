package cm.aptoide.p092pt.store;

import cm.aptoide.p092pt.database.room.RoomStore;
import java.util.List;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface StorePersistence {
    Single<RoomStore> get(long j2);

    Single<RoomStore> get(String str);

    C11186e<List<RoomStore>> getAll();

    C11186e<Boolean> isSubscribed(long j2);

    C11183b remove(String str);

    C11183b save(RoomStore roomStore);

    C11183b saveAll(List<RoomStore> list);
}
