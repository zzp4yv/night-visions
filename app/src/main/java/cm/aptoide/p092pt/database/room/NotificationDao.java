package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public interface NotificationDao {
    void deleteAllByType(int i2);

    void deleteAllExcluding(List<String> list);

    void deleteByKey(List<String> list);

    AbstractC9043m<List<RoomNotification>> getAll();

    AbstractC9043m<List<RoomNotification>> getAllSortedDesc();

    AbstractC9049s<List<RoomNotification>> getAllSortedDescByType(Integer[] numArr);

    AbstractC9049s<List<RoomNotification>> getDismissed(Integer[] numArr, long j2, long j3);

    void insert(RoomNotification roomNotification);

    void insertAll(List<RoomNotification> list);
}
