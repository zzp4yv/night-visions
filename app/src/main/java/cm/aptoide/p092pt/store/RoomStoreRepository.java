package cm.aptoide.p092pt.store;

import cm.aptoide.p092pt.database.room.RoomStore;
import java.util.List;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;

/* loaded from: classes.dex */
public class RoomStoreRepository {
    private final StorePersistence storePersistence;

    public RoomStoreRepository(StorePersistence storePersistence) {
        this.storePersistence = storePersistence;
    }

    public Single<RoomStore> get(Long l) {
        return this.storePersistence.get(l.longValue());
    }

    public C11186e<List<RoomStore>> getAll() {
        return this.storePersistence.getAll();
    }

    public C11186e<Boolean> isSubscribed(long j2) {
        return this.storePersistence.isSubscribed(j2);
    }

    public C11183b remove(String str) {
        return this.storePersistence.remove(str);
    }

    public C11183b save(RoomStore roomStore) {
        return this.storePersistence.save(roomStore);
    }

    public C11183b saveAll(List<RoomStore> list) {
        return this.storePersistence.saveAll(list);
    }

    public Single<RoomStore> get(String str) {
        return this.storePersistence.get(str);
    }
}
