package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.RoomStoredMinimalAd;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface StoredMinimalAdPersistence {
    C11186e<RoomStoredMinimalAd> get(String str);

    void insert(RoomStoredMinimalAd roomStoredMinimalAd);

    void remove(RoomStoredMinimalAd roomStoredMinimalAd);
}
