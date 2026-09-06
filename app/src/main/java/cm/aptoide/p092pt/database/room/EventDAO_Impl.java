package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import androidx.room.AbstractC0643b;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9043m;

/* loaded from: classes.dex */
public final class EventDAO_Impl implements EventDAO {
    private final AbstractC0651j __db;
    private final AbstractC0643b<RoomEvent> __deletionAdapterOfRoomEvent;
    private final AbstractC0644c<RoomEvent> __insertionAdapterOfRoomEvent;

    public EventDAO_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomEvent = new AbstractC0644c<RoomEvent>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.EventDAO_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `event` (`timestamp`,`eventName`,`action`,`context`,`data`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomEvent roomEvent) {
                interfaceC1012f.mo4652h0(1, roomEvent.getTimestamp());
                if (roomEvent.getEventName() == null) {
                    interfaceC1012f.mo4646I0(2);
                } else {
                    interfaceC1012f.mo4654w(2, roomEvent.getEventName());
                }
                interfaceC1012f.mo4652h0(3, roomEvent.getAction());
                if (roomEvent.getContext() == null) {
                    interfaceC1012f.mo4646I0(4);
                } else {
                    interfaceC1012f.mo4654w(4, roomEvent.getContext());
                }
                if (roomEvent.getData() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomEvent.getData());
                }
            }
        };
        this.__deletionAdapterOfRoomEvent = new AbstractC0643b<RoomEvent>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.EventDAO_Impl.2
            @Override // androidx.room.AbstractC0643b, androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM `event` WHERE `timestamp` = ?";
            }

            @Override // androidx.room.AbstractC0643b
            public void bind(InterfaceC1012f interfaceC1012f, RoomEvent roomEvent) {
                interfaceC1012f.mo4652h0(1, roomEvent.getTimestamp());
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.EventDAO
    public void delete(RoomEvent roomEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomEvent.handle(roomEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.EventDAO
    public AbstractC9043m<List<RoomEvent>> getAll() {
        final C0654m m4644c = C0654m.m4644c("SELECT * FROM event", 0);
        return C0655n.m4655a(this.__db, false, new String[]{"event"}, new Callable<List<RoomEvent>>() { // from class: cm.aptoide.pt.database.room.EventDAO_Impl.3
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomEvent> call() throws Exception {
                Cursor m4675b = C0663c.m4675b(EventDAO_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "timestamp");
                    int m4673b2 = C0662b.m4673b(m4675b, "eventName");
                    int m4673b3 = C0662b.m4673b(m4675b, "action");
                    int m4673b4 = C0662b.m4673b(m4675b, "context");
                    int m4673b5 = C0662b.m4673b(m4675b, "data");
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        arrayList.add(new RoomEvent(m4675b.getLong(m4673b), m4675b.getString(m4673b2), m4675b.getInt(m4673b3), m4675b.getString(m4673b4), m4675b.getString(m4673b5)));
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.EventDAO
    public void insert(RoomEvent roomEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomEvent.insert((AbstractC0644c<RoomEvent>) roomEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
