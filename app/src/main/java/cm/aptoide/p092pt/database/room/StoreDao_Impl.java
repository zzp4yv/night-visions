package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.EmptyResultSetException;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import cm.aptoide.p092pt.account.AccountAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public final class StoreDao_Impl implements StoreDao {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomStore> __insertionAdapterOfRoomStore;
    private final AbstractC0658q __preparedStmtOfRemoveByStoreName;

    public StoreDao_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomStore = new AbstractC0644c<RoomStore>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `store` (`storeId`,`iconPath`,`theme`,`downloads`,`storeName`,`username`,`passwordSha1`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomStore roomStore) {
                interfaceC1012f.mo4652h0(1, roomStore.getStoreId());
                if (roomStore.getIconPath() == null) {
                    interfaceC1012f.mo4646I0(2);
                } else {
                    interfaceC1012f.mo4654w(2, roomStore.getIconPath());
                }
                if (roomStore.getTheme() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomStore.getTheme());
                }
                interfaceC1012f.mo4652h0(4, roomStore.getDownloads());
                if (roomStore.getStoreName() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomStore.getStoreName());
                }
                if (roomStore.getUsername() == null) {
                    interfaceC1012f.mo4646I0(6);
                } else {
                    interfaceC1012f.mo4654w(6, roomStore.getUsername());
                }
                if (roomStore.getPasswordSha1() == null) {
                    interfaceC1012f.mo4646I0(7);
                } else {
                    interfaceC1012f.mo4654w(7, roomStore.getPasswordSha1());
                }
            }
        };
        this.__preparedStmtOfRemoveByStoreName = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.2
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM store where storeName = ?";
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public AbstractC9043m<List<RoomStore>> getAll() {
        final C0654m m4644c = C0654m.m4644c("SELECT * from store", 0);
        return C0655n.m4655a(this.__db, false, new String[]{AccountAnalytics.STORE}, new Callable<List<RoomStore>>() { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.3
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomStore> call() throws Exception {
                Cursor m4675b = C0663c.m4675b(StoreDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, RoomStore.STORE_ID);
                    int m4673b2 = C0662b.m4673b(m4675b, RoomStore.ICON_PATH);
                    int m4673b3 = C0662b.m4673b(m4675b, RoomStore.THEME);
                    int m4673b4 = C0662b.m4673b(m4675b, RoomStore.DOWNLOADS);
                    int m4673b5 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b6 = C0662b.m4673b(m4675b, "username");
                    int m4673b7 = C0662b.m4673b(m4675b, RoomStore.PASSWORD_SHA1);
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        RoomStore roomStore = new RoomStore();
                        roomStore.setStoreId(m4675b.getLong(m4673b));
                        roomStore.setIconPath(m4675b.getString(m4673b2));
                        roomStore.setTheme(m4675b.getString(m4673b3));
                        roomStore.setDownloads(m4675b.getLong(m4673b4));
                        roomStore.setStoreName(m4675b.getString(m4673b5));
                        roomStore.setUsername(m4675b.getString(m4673b6));
                        roomStore.setPasswordSha1(m4675b.getString(m4673b7));
                        arrayList.add(roomStore);
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public AbstractC9049s<RoomStore> getByStoreId(long j2) {
        final C0654m m4644c = C0654m.m4644c("SELECT * from store where storeId = ?", 1);
        m4644c.mo4652h0(1, j2);
        return C0655n.m4657c(new Callable<RoomStore>() { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.5
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomStore call() throws Exception {
                RoomStore roomStore = null;
                Cursor m4675b = C0663c.m4675b(StoreDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, RoomStore.STORE_ID);
                    int m4673b2 = C0662b.m4673b(m4675b, RoomStore.ICON_PATH);
                    int m4673b3 = C0662b.m4673b(m4675b, RoomStore.THEME);
                    int m4673b4 = C0662b.m4673b(m4675b, RoomStore.DOWNLOADS);
                    int m4673b5 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b6 = C0662b.m4673b(m4675b, "username");
                    int m4673b7 = C0662b.m4673b(m4675b, RoomStore.PASSWORD_SHA1);
                    if (m4675b.moveToFirst()) {
                        roomStore = new RoomStore();
                        roomStore.setStoreId(m4675b.getLong(m4673b));
                        roomStore.setIconPath(m4675b.getString(m4673b2));
                        roomStore.setTheme(m4675b.getString(m4673b3));
                        roomStore.setDownloads(m4675b.getLong(m4673b4));
                        roomStore.setStoreName(m4675b.getString(m4673b5));
                        roomStore.setUsername(m4675b.getString(m4673b6));
                        roomStore.setPasswordSha1(m4675b.getString(m4673b7));
                    }
                    if (roomStore != null) {
                        return roomStore;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + m4644c.mo4648a());
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public AbstractC9049s<RoomStore> getByStoreName(String str) {
        final C0654m m4644c = C0654m.m4644c("SELECT * from store where storeName = ?", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        return C0655n.m4657c(new Callable<RoomStore>() { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.4
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomStore call() throws Exception {
                RoomStore roomStore = null;
                Cursor m4675b = C0663c.m4675b(StoreDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, RoomStore.STORE_ID);
                    int m4673b2 = C0662b.m4673b(m4675b, RoomStore.ICON_PATH);
                    int m4673b3 = C0662b.m4673b(m4675b, RoomStore.THEME);
                    int m4673b4 = C0662b.m4673b(m4675b, RoomStore.DOWNLOADS);
                    int m4673b5 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b6 = C0662b.m4673b(m4675b, "username");
                    int m4673b7 = C0662b.m4673b(m4675b, RoomStore.PASSWORD_SHA1);
                    if (m4675b.moveToFirst()) {
                        roomStore = new RoomStore();
                        roomStore.setStoreId(m4675b.getLong(m4673b));
                        roomStore.setIconPath(m4675b.getString(m4673b2));
                        roomStore.setTheme(m4675b.getString(m4673b3));
                        roomStore.setDownloads(m4675b.getLong(m4673b4));
                        roomStore.setStoreName(m4675b.getString(m4673b5));
                        roomStore.setUsername(m4675b.getString(m4673b6));
                        roomStore.setPasswordSha1(m4675b.getString(m4673b7));
                    }
                    if (roomStore != null) {
                        return roomStore;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + m4644c.mo4648a());
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public void insert(RoomStore roomStore) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomStore.insert((AbstractC0644c<RoomStore>) roomStore);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public AbstractC9043m<Integer> isSubscribed(long j2) {
        final C0654m m4644c = C0654m.m4644c("SELECT COUNT(*) from store where storeId = ?", 1);
        m4644c.mo4652h0(1, j2);
        return C0655n.m4655a(this.__db, false, new String[]{AccountAnalytics.STORE}, new Callable<Integer>() { // from class: cm.aptoide.pt.database.room.StoreDao_Impl.6
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                Integer num = null;
                Cursor m4675b = C0663c.m4675b(StoreDao_Impl.this.__db, m4644c, false, null);
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

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public void removeByStoreName(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.__preparedStmtOfRemoveByStoreName.acquire();
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
            this.__preparedStmtOfRemoveByStoreName.release(acquire);
        }
    }

    @Override // cm.aptoide.p092pt.database.room.StoreDao
    public void saveAll(List<RoomStore> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomStore.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
