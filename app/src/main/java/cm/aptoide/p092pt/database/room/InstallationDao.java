package cm.aptoide.p092pt.database.room;

import java.util.List;
import p323h.p324a.AbstractC9043m;

/* loaded from: classes.dex */
public interface InstallationDao {
    AbstractC9043m<List<RoomInstallation>> getAll();

    void insert(RoomInstallation roomInstallation);

    void insertAll(List<RoomInstallation> list);
}
