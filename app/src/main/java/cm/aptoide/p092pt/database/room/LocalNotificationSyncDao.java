package cm.aptoide.p092pt.database.room;

import p323h.p324a.AbstractC9043m;

/* loaded from: classes.dex */
public interface LocalNotificationSyncDao {
    void delete(String str);

    AbstractC9043m<RoomLocalNotificationSync> get(String str);

    void save(RoomLocalNotificationSync roomLocalNotificationSync);
}
