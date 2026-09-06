package cm.aptoide.p092pt.home.apps;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.database.room.RoomUpdate;
import cm.aptoide.p092pt.updates.UpdateRepository;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11208e;

/* loaded from: classes.dex */
public class UpdatesManager {
    private UpdateRepository updateRepository;

    public UpdatesManager(UpdateRepository updateRepository) {
        this.updateRepository = updateRepository;
    }

    static /* synthetic */ Single lambda$filterUpdates$0(RoomInstalled roomInstalled, Boolean bool) {
        return bool.booleanValue() ? Single.m39913m(null) : Single.m39913m(roomInstalled);
    }

    public C11183b excludeUpdate(String str) {
        return this.updateRepository.setExcluded(str);
    }

    public Single<RoomInstalled> filterUpdates(final RoomInstalled roomInstalled) {
        return this.updateRepository.contains(roomInstalled.getPackageName(), false).m39920i(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.u3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return UpdatesManager.lambda$filterUpdates$0(RoomInstalled.this, (Boolean) obj);
            }
        });
    }

    public Single<RoomUpdate> getUpdate(String str) {
        return this.updateRepository.get(str);
    }

    public C11186e<List<RoomUpdate>> getUpdatesList() {
        return this.updateRepository.getAll(false).m40114u0(750L, TimeUnit.MILLISECONDS);
    }

    public C11186e<Integer> getUpdatesNumber() {
        return getUpdatesList().m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.home.apps.t3
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Integer valueOf;
                valueOf = Integer.valueOf(((List) obj).size());
                return valueOf;
            }
        });
    }

    public C11183b refreshUpdates() {
        return this.updateRepository.sync(true, false, true);
    }
}
