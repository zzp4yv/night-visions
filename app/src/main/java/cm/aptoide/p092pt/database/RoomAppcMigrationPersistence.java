package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.app.migration.AppcMigrationPersistence;
import cm.aptoide.p092pt.database.room.MigratedAppDAO;
import cm.aptoide.p092pt.database.room.RoomMigratedApp;
import p319g.p320a.p321a.p322a.C9026d;
import p323h.p324a.EnumC9029a;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class RoomAppcMigrationPersistence implements AppcMigrationPersistence {
    private MigratedAppDAO migratedAppDAO;

    public RoomAppcMigrationPersistence(MigratedAppDAO migratedAppDAO) {
        this.migratedAppDAO = migratedAppDAO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$insert$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7387a(String str) {
        this.migratedAppDAO.save(new RoomMigratedApp(str));
    }

    @Override // cm.aptoide.p092pt.app.migration.AppcMigrationPersistence
    public void insert(final String str) {
        new Thread(new Runnable() { // from class: cm.aptoide.pt.database.d
            @Override // java.lang.Runnable
            public final void run() {
                RoomAppcMigrationPersistence.this.m7387a(str);
            }
        }).start();
    }

    @Override // cm.aptoide.p092pt.app.migration.AppcMigrationPersistence
    public C11186e<Boolean> isAppMigrated(String str) {
        return C9026d.m29124b(this.migratedAppDAO.isAppMigrated(str), EnumC9029a.BUFFER).m40082X(new InterfaceC11208e() { // from class: cm.aptoide.pt.database.e
            @Override // p456rx.p460m.InterfaceC11208e
            public final Object call(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.intValue() > 0);
                return valueOf;
            }
        }).m40065I0(Schedulers.m40658io());
    }
}
