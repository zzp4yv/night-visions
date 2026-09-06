package cm.aptoide.p092pt.database.room;

import p323h.p324a.AbstractC9043m;

/* loaded from: classes.dex */
public interface MigratedAppDAO {
    AbstractC9043m<Integer> isAppMigrated(String str);

    void save(RoomMigratedApp roomMigratedApp);
}
