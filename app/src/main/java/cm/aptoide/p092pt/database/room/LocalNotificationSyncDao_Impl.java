package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9043m;

/* loaded from: classes.dex */
public final class LocalNotificationSyncDao_Impl implements LocalNotificationSyncDao {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomLocalNotificationSync> __insertionAdapterOfRoomLocalNotificationSync;
    private final AbstractC0658q __preparedStmtOfDelete;

    public LocalNotificationSyncDao_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomLocalNotificationSync = new AbstractC0644c<RoomLocalNotificationSync>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.LocalNotificationSyncDao_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `localNotificationSync` (`notificationId`,`title`,`body`,`image`,`navigationUrl`,`trigger`,`id`,`actionStringRes`,`type`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomLocalNotificationSync roomLocalNotificationSync) {
                if (roomLocalNotificationSync.getNotificationId() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomLocalNotificationSync.getNotificationId());
                }
                if (roomLocalNotificationSync.getTitle() == null) {
                    interfaceC1012f.mo4646I0(2);
                } else {
                    interfaceC1012f.mo4654w(2, roomLocalNotificationSync.getTitle());
                }
                if (roomLocalNotificationSync.getBody() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomLocalNotificationSync.getBody());
                }
                if (roomLocalNotificationSync.getImage() == null) {
                    interfaceC1012f.mo4646I0(4);
                } else {
                    interfaceC1012f.mo4654w(4, roomLocalNotificationSync.getImage());
                }
                if (roomLocalNotificationSync.getNavigationUrl() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomLocalNotificationSync.getNavigationUrl());
                }
                interfaceC1012f.mo4652h0(6, roomLocalNotificationSync.getTrigger());
                if (roomLocalNotificationSync.getId() == null) {
                    interfaceC1012f.mo4646I0(7);
                } else {
                    interfaceC1012f.mo4654w(7, roomLocalNotificationSync.getId());
                }
                interfaceC1012f.mo4652h0(8, roomLocalNotificationSync.getActionStringRes());
                interfaceC1012f.mo4652h0(9, roomLocalNotificationSync.getType());
            }
        };
        this.__preparedStmtOfDelete = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.LocalNotificationSyncDao_Impl.2
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM localNotificationSync WHERE notificationId = ?";
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.LocalNotificationSyncDao
    public void delete(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.__preparedStmtOfDelete.acquire();
        if (str == null) {
            acquire.mo4646I0(1);
        } else {
            acquire.mo4654w(1, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // cm.aptoide.p092pt.database.room.LocalNotificationSyncDao
    public AbstractC9043m<RoomLocalNotificationSync> get(String str) {
        final C0654m m4644c = C0654m.m4644c("SELECT * FROM localNotificationSync WHERE notificationId = ?", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        return C0655n.m4655a(this.__db, false, new String[]{"localNotificationSync"}, new Callable<RoomLocalNotificationSync>() { // from class: cm.aptoide.pt.database.room.LocalNotificationSyncDao_Impl.3
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomLocalNotificationSync call() throws Exception {
                RoomLocalNotificationSync roomLocalNotificationSync = null;
                Cursor m4675b = C0663c.m4675b(LocalNotificationSyncDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "notificationId");
                    int m4673b2 = C0662b.m4673b(m4675b, "title");
                    int m4673b3 = C0662b.m4673b(m4675b, "body");
                    int m4673b4 = C0662b.m4673b(m4675b, "image");
                    int m4673b5 = C0662b.m4673b(m4675b, "navigationUrl");
                    int m4673b6 = C0662b.m4673b(m4675b, "trigger");
                    int m4673b7 = C0662b.m4673b(m4675b, DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
                    int m4673b8 = C0662b.m4673b(m4675b, "actionStringRes");
                    int m4673b9 = C0662b.m4673b(m4675b, "type");
                    if (m4675b.moveToFirst()) {
                        roomLocalNotificationSync = new RoomLocalNotificationSync(m4675b.getString(m4673b), m4675b.getString(m4673b2), m4675b.getString(m4673b3), m4675b.getString(m4673b4), m4675b.getInt(m4673b8), m4675b.getString(m4673b5), m4675b.getLong(m4673b6), m4675b.getString(m4673b7), m4675b.getInt(m4673b9));
                    }
                    return roomLocalNotificationSync;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.LocalNotificationSyncDao
    public void save(RoomLocalNotificationSync roomLocalNotificationSync) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomLocalNotificationSync.insert((AbstractC0644c<RoomLocalNotificationSync>) roomLocalNotificationSync);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
