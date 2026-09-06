package cm.aptoide.p092pt.install;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import java.util.List;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;

/* loaded from: classes.dex */
public interface InstalledPersistence {
    C11186e<RoomInstalled> get(String str, int i2);

    C11186e<List<RoomInstalled>> getAll();

    C11186e<List<RoomInstalled>> getAllAsList(String str);

    C11186e<List<RoomInstalled>> getAllInstalled();

    C11186e<List<RoomInstalled>> getAllInstalledSorted();

    C11186e<List<RoomInstalled>> getAllInstalling();

    C11186e<List<RoomInstalled>> getAsList(String str, int i2);

    C11186e<RoomInstalled> getInstalled(String str);

    C11186e<List<RoomInstalled>> getInstalledFilteringSystemApps();

    C11183b insert(RoomInstalled roomInstalled);

    Single<Boolean> isInstalled(String str, int i2);

    C11186e<Boolean> isInstalled(String str);

    C11183b remove(String str, int i2);

    C11183b replaceAllBy(List<RoomInstalled> list);
}
