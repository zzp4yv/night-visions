package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import androidx.room.AbstractC0643b;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.p010t.C0663c;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9043m;

/* loaded from: classes.dex */
public final class AppComingSoonRegistrationDAO_Impl implements AppComingSoonRegistrationDAO {
    private final AbstractC0651j __db;
    private final AbstractC0643b<RoomAppComingSoonRegistration> __deletionAdapterOfRoomAppComingSoonRegistration;
    private final AbstractC0644c<RoomAppComingSoonRegistration> __insertionAdapterOfRoomAppComingSoonRegistration;

    public AppComingSoonRegistrationDAO_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomAppComingSoonRegistration = new AbstractC0644c<RoomAppComingSoonRegistration>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `appComingSoonRegistration` (`packageName`) VALUES (?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
                if (roomAppComingSoonRegistration.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomAppComingSoonRegistration.getPackageName());
                }
            }
        };
        this.__deletionAdapterOfRoomAppComingSoonRegistration = new AbstractC0643b<RoomAppComingSoonRegistration>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO_Impl.2
            @Override // androidx.room.AbstractC0643b, androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM `appComingSoonRegistration` WHERE `packageName` = ?";
            }

            @Override // androidx.room.AbstractC0643b
            public void bind(InterfaceC1012f interfaceC1012f, RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
                if (roomAppComingSoonRegistration.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomAppComingSoonRegistration.getPackageName());
                }
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.AppComingSoonRegistrationDAO
    public AbstractC9043m<Integer> isRegisteredForApp(String str) {
        final C0654m m4644c = C0654m.m4644c("SELECT COUNT(*) from appComingSoonRegistration where packageName like ?", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        return C0655n.m4655a(this.__db, false, new String[]{"appComingSoonRegistration"}, new Callable<Integer>() { // from class: cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO_Impl.3
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                Integer num = null;
                Cursor m4675b = C0663c.m4675b(AppComingSoonRegistrationDAO_Impl.this.__db, m4644c, false, null);
                try {
                    if (m4675b.moveToFirst() && !m4675b.isNull(0)) {
                        num = Integer.valueOf(m4675b.getInt(0));
                    }
                    return num;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.AppComingSoonRegistrationDAO
    public void remove(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomAppComingSoonRegistration.handle(roomAppComingSoonRegistration);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.AppComingSoonRegistrationDAO
    public void save(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomAppComingSoonRegistration.insert((AbstractC0644c<RoomAppComingSoonRegistration>) roomAppComingSoonRegistration);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
