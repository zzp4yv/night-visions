package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9031b;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public interface InstalledDao {
    AbstractC9043m<RoomInstalled> get(String str, int i2);

    AbstractC9043m<List<RoomInstalled>> getAll();

    AbstractC9043m<List<RoomInstalled>> getAllFilteringSystemApps();

    AbstractC9043m<List<RoomInstalled>> getAllSortedAsc();

    AbstractC9043m<List<RoomInstalled>> getAsList(String str, int i2);

    AbstractC9043m<List<RoomInstalled>> getAsListByPackageName(String str);

    void insert(RoomInstalled roomInstalled);

    void insertAll(List<RoomInstalled> list);

    AbstractC9049s<RoomInstalled> isInstalledByVersion(String str, int i2);

    AbstractC9031b remove(String str);

    AbstractC9031b remove(String str, int i2);

    void removeAll();
}
