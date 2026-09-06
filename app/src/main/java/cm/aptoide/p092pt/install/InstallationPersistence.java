package cm.aptoide.p092pt.install;

import cm.aptoide.p092pt.database.room.RoomInstallation;
import java.util.List;
import p456rx.C11183b;
import p456rx.C11186e;

/* loaded from: classes.dex */
public interface InstallationPersistence {
    C11186e<List<RoomInstallation>> getInstallationsHistory();

    C11183b insert(RoomInstallation roomInstallation);

    C11183b insertAll(List<RoomInstallation> list);
}
