package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.EmptyResultSetException;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public final class ExperimentDAO_Impl implements ExperimentDAO {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomExperiment> __insertionAdapterOfRoomExperiment;

    public ExperimentDAO_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomExperiment = new AbstractC0644c<RoomExperiment>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.ExperimentDAO_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `experiment` (`experimentName`,`requestTime`,`assignment`,`payload`,`partOfExperiment`,`experimentOver`) VALUES (?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomExperiment roomExperiment) {
                if (roomExperiment.getExperimentName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomExperiment.getExperimentName());
                }
                interfaceC1012f.mo4652h0(2, roomExperiment.getRequestTime());
                if (roomExperiment.getAssignment() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomExperiment.getAssignment());
                }
                if (roomExperiment.getPayload() == null) {
                    interfaceC1012f.mo4646I0(4);
                } else {
                    interfaceC1012f.mo4654w(4, roomExperiment.getPayload());
                }
                interfaceC1012f.mo4652h0(5, roomExperiment.isPartOfExperiment() ? 1L : 0L);
                interfaceC1012f.mo4652h0(6, roomExperiment.isExperimentOver() ? 1L : 0L);
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.ExperimentDAO
    public AbstractC9049s<RoomExperiment> get(String str) {
        final C0654m m4644c = C0654m.m4644c("SELECT * FROM experiment WHERE experimentName = ?", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        return C0655n.m4657c(new Callable<RoomExperiment>() { // from class: cm.aptoide.pt.database.room.ExperimentDAO_Impl.2
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomExperiment call() throws Exception {
                RoomExperiment roomExperiment = null;
                Cursor m4675b = C0663c.m4675b(ExperimentDAO_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "experimentName");
                    int m4673b2 = C0662b.m4673b(m4675b, "requestTime");
                    int m4673b3 = C0662b.m4673b(m4675b, "assignment");
                    int m4673b4 = C0662b.m4673b(m4675b, "payload");
                    int m4673b5 = C0662b.m4673b(m4675b, "partOfExperiment");
                    int m4673b6 = C0662b.m4673b(m4675b, "experimentOver");
                    if (m4675b.moveToFirst()) {
                        roomExperiment = new RoomExperiment(m4675b.getString(m4673b), m4675b.getLong(m4673b2), m4675b.getString(m4673b3), m4675b.getString(m4673b4), m4675b.getInt(m4673b5) != 0, m4675b.getInt(m4673b6) != 0);
                    }
                    if (roomExperiment != null) {
                        return roomExperiment;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + m4644c.mo4648a());
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.ExperimentDAO
    public void save(RoomExperiment roomExperiment) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomExperiment.insert((AbstractC0644c<RoomExperiment>) roomExperiment);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
