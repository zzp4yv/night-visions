package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.database.room.InstalledDao;
import cm.aptoide.p092pt.database.room.RoomInstallation;
import cm.aptoide.p092pt.database.room.RoomInstalled;
import cm.aptoide.p092pt.install.InstallationPersistence;
import cm.aptoide.p092pt.install.InstalledPersistence;
import java.util.ArrayList;
import java.util.List;
import p319g.p320a.p321a.p322a.C9026d;
import p323h.p324a.EnumC9029a;
import p456rx.C11183b;
import p456rx.C11186e;
import p456rx.Single;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomInstalledPersistence implements InstalledPersistence {
    private final RoomInstallationMapper installationMapper;
    private final InstalledDao installedDao;
    private final InstallationPersistence roomInstallationPersistence;

    public RoomInstalledPersistence(InstalledDao installedDao, RoomInstallationPersistence roomInstallationPersistence, RoomInstallationMapper roomInstallationMapper) {
        this.installedDao = installedDao;
        this.roomInstallationPersistence = roomInstallationPersistence;
        this.installationMapper = roomInstallationMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: filterCompleted, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C11186e<List<RoomInstalled>> m7405e(List<RoomInstalled> list) {
        return C11186e.m40020N(list).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.h0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getStatus() == 4);
                return valueOf;
            }
        }).m40084Y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: filterInstalling, reason: merged with bridge method [inline-methods] */
    public C11186e<List<RoomInstalled>> m7403c(List<RoomInstalled> list) {
        return C11186e.m40020N(list).m40055D(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.j0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1.getStatus() == 3);
                return valueOf;
            }
        }).m40084Y0();
    }

    private C11186e<List<RoomInstalled>> getInstalledAsList(String str) {
        return C9026d.m29124b(this.installedDao.getAsListByPackageName(str), EnumC9029a.BUFFER).m40105p0(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.c0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.lambda$getInstalledAsList$13((Throwable) obj);
            }
        }).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.k0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.this.m7404d((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    static /* synthetic */ List lambda$getAsList$4(Throwable th) {
        return new ArrayList();
    }

    static /* synthetic */ RoomInstalled lambda$getInstalled$3(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return (RoomInstalled) list.get(0);
    }

    static /* synthetic */ List lambda$getInstalledAsList$13(Throwable th) {
        return new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$insert$5, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7406f(RoomInstalled roomInstalled) {
        this.installedDao.insert(roomInstalled);
    }

    static /* synthetic */ RoomInstalled lambda$isInstalled$8(Throwable th) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$replaceAllBy$6, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7407g(List list) {
        this.installedDao.removeAll();
        this.installedDao.insertAll(list);
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<RoomInstalled> get(String str, int i2) {
        return C9026d.m29124b(this.installedDao.get(str, i2), EnumC9029a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<List<RoomInstalled>> getAll() {
        return C9026d.m29124b(this.installedDao.getAll(), EnumC9029a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<List<RoomInstalled>> getAllAsList(String str) {
        return C9026d.m29124b(this.installedDao.getAsListByPackageName(str), EnumC9029a.BUFFER).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<List<RoomInstalled>> getAllInstalled() {
        return C9026d.m29124b(this.installedDao.getAll(), EnumC9029a.BUFFER).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.l0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.this.m7401a((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<List<RoomInstalled>> getAllInstalledSorted() {
        return C9026d.m29124b(this.installedDao.getAllSortedAsc(), EnumC9029a.BUFFER).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.n0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.this.m7402b((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<List<RoomInstalled>> getAllInstalling() {
        return C9026d.m29124b(this.installedDao.getAll(), EnumC9029a.BUFFER).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.m0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.this.m7403c((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<List<RoomInstalled>> getAsList(String str, int i2) {
        return C9026d.m29124b(this.installedDao.getAsList(str, i2), EnumC9029a.BUFFER).m40105p0(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.p0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.lambda$getAsList$4((Throwable) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    public C11186e<List<RoomInstallation>> getInstallationsHistory() {
        return this.roomInstallationPersistence.getInstallationsHistory();
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<RoomInstalled> getInstalled(String str) {
        return getInstalledAsList(str).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.d0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.lambda$getInstalled$3((List) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<List<RoomInstalled>> getInstalledFilteringSystemApps() {
        return C9026d.m29124b(this.installedDao.getAllFilteringSystemApps(), EnumC9029a.BUFFER).m40060G(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.g0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                return RoomInstalledPersistence.this.m7405e((List) obj);
            }
        }).m40065I0(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11183b insert(final RoomInstalled roomInstalled) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.f0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomInstalledPersistence.this.m7406f(roomInstalled);
            }
        }).m39973a(this.roomInstallationPersistence.insert(this.installationMapper.map(roomInstalled))).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11186e<Boolean> isInstalled(String str) {
        return getInstalled(str).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.q0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 != null && r1.getStatus() == 4);
                return valueOf;
            }
        });
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11183b remove(String str, int i2) {
        return C9026d.m29123a(this.installedDao.remove(str, i2)).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public C11183b replaceAllBy(final List<RoomInstalled> list) {
        return C11183b.m39952t(new InterfaceC11204a() { // from class: cm.aptoide.pt.database.i0
            @Override // p456rx.p460m.InterfaceC11204a
            public final void call() {
                RoomInstalledPersistence.this.m7407g(list);
            }
        }).m39973a(this.roomInstallationPersistence.insertAll(this.installationMapper.map(list))).m39967K(Schedulers.m40658io());
    }

    @Override // cm.aptoide.p092pt.install.InstalledPersistence
    public Single<Boolean> isInstalled(String str, int i2) {
        return C9026d.m29126d(this.installedDao.isInstalledByVersion(str, i2)).m39926r(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.e0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                RoomInstalledPersistence.lambda$isInstalled$8((Throwable) obj);
                return null;
            }
        }).m39923n(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.o0
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r1 != null && r1.getStatus() == 4);
                return valueOf;
            }
        }).m39930v(Schedulers.m40658io());
    }

    public C11183b remove(String str) {
        return C9026d.m29123a(this.installedDao.remove(str)).m39967K(Schedulers.m40658io());
    }
}
