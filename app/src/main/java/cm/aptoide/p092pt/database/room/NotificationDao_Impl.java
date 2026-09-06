package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import androidx.room.p010t.C0666f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public final class NotificationDao_Impl implements NotificationDao {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomNotification> __insertionAdapterOfRoomNotification;
    private final AbstractC0658q __preparedStmtOfDeleteAllByType;

    public NotificationDao_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomNotification = new AbstractC0644c<RoomNotification>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `notification` (`expire`,`abTestingGroup`,`body`,`campaignId`,`img`,`lang`,`title`,`url`,`urlTrack`,`notificationCenterUrlTrack`,`type`,`timeStamp`,`appName`,`graphic`,`ownerId`,`processed`,`actionStringRes`,`whitelistedPackages`,`key`,`dismissed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomNotification roomNotification) {
                if (roomNotification.getExpire() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4652h0(1, roomNotification.getExpire().longValue());
                }
                if (roomNotification.getAbTestingGroup() == null) {
                    interfaceC1012f.mo4646I0(2);
                } else {
                    interfaceC1012f.mo4654w(2, roomNotification.getAbTestingGroup());
                }
                if (roomNotification.getBody() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomNotification.getBody());
                }
                interfaceC1012f.mo4652h0(4, roomNotification.getCampaignId());
                if (roomNotification.getImg() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomNotification.getImg());
                }
                if (roomNotification.getLang() == null) {
                    interfaceC1012f.mo4646I0(6);
                } else {
                    interfaceC1012f.mo4654w(6, roomNotification.getLang());
                }
                if (roomNotification.getTitle() == null) {
                    interfaceC1012f.mo4646I0(7);
                } else {
                    interfaceC1012f.mo4654w(7, roomNotification.getTitle());
                }
                if (roomNotification.getUrl() == null) {
                    interfaceC1012f.mo4646I0(8);
                } else {
                    interfaceC1012f.mo4654w(8, roomNotification.getUrl());
                }
                if (roomNotification.getUrlTrack() == null) {
                    interfaceC1012f.mo4646I0(9);
                } else {
                    interfaceC1012f.mo4654w(9, roomNotification.getUrlTrack());
                }
                if (roomNotification.getNotificationCenterUrlTrack() == null) {
                    interfaceC1012f.mo4646I0(10);
                } else {
                    interfaceC1012f.mo4654w(10, roomNotification.getNotificationCenterUrlTrack());
                }
                interfaceC1012f.mo4652h0(11, roomNotification.getType());
                interfaceC1012f.mo4652h0(12, roomNotification.getTimeStamp());
                if (roomNotification.getAppName() == null) {
                    interfaceC1012f.mo4646I0(13);
                } else {
                    interfaceC1012f.mo4654w(13, roomNotification.getAppName());
                }
                if (roomNotification.getGraphic() == null) {
                    interfaceC1012f.mo4646I0(14);
                } else {
                    interfaceC1012f.mo4654w(14, roomNotification.getGraphic());
                }
                if (roomNotification.getOwnerId() == null) {
                    interfaceC1012f.mo4646I0(15);
                } else {
                    interfaceC1012f.mo4654w(15, roomNotification.getOwnerId());
                }
                interfaceC1012f.mo4652h0(16, roomNotification.isProcessed() ? 1L : 0L);
                interfaceC1012f.mo4652h0(17, roomNotification.getActionStringRes());
                String saveList = StringTypeConverter.saveList(roomNotification.getWhitelistedPackages());
                if (saveList == null) {
                    interfaceC1012f.mo4646I0(18);
                } else {
                    interfaceC1012f.mo4654w(18, saveList);
                }
                if (roomNotification.getKey() == null) {
                    interfaceC1012f.mo4646I0(19);
                } else {
                    interfaceC1012f.mo4654w(19, roomNotification.getKey());
                }
                interfaceC1012f.mo4652h0(20, roomNotification.getDismissed());
            }
        };
        this.__preparedStmtOfDeleteAllByType = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.2
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM notification where type = ?";
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void deleteAllByType(int i2) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.__preparedStmtOfDeleteAllByType.acquire();
        acquire.mo4652h0(1, i2);
        this.__db.beginTransaction();
        try {
            acquire.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllByType.release(acquire);
        }
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void deleteAllExcluding(List<String> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder m4681b = C0666f.m4681b();
        m4681b.append("DELETE FROM notification where ownerId NOT IN (");
        C0666f.m4680a(m4681b, list.size());
        m4681b.append(") ");
        InterfaceC1012f compileStatement = this.__db.compileStatement(m4681b.toString());
        int i2 = 1;
        for (String str : list) {
            if (str == null) {
                compileStatement.mo4646I0(i2);
            } else {
                compileStatement.mo4654w(i2, str);
            }
            i2++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void deleteByKey(List<String> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder m4681b = C0666f.m4681b();
        m4681b.append("DELETE FROM notification where `key` IN (");
        C0666f.m4680a(m4681b, list.size());
        m4681b.append(") ");
        InterfaceC1012f compileStatement = this.__db.compileStatement(m4681b.toString());
        int i2 = 1;
        for (String str : list) {
            if (str == null) {
                compileStatement.mo4646I0(i2);
            } else {
                compileStatement.mo4654w(i2, str);
            }
            i2++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public AbstractC9043m<List<RoomNotification>> getAll() {
        final C0654m m4644c = C0654m.m4644c("SELECT * FROM notification", 0);
        return C0655n.m4655a(this.__db, false, new String[]{"notification"}, new Callable<List<RoomNotification>>() { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.6
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomNotification> call() throws Exception {
                int i2;
                boolean z;
                Cursor m4675b = C0663c.m4675b(NotificationDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "expire");
                    int m4673b2 = C0662b.m4673b(m4675b, "abTestingGroup");
                    int m4673b3 = C0662b.m4673b(m4675b, "body");
                    int m4673b4 = C0662b.m4673b(m4675b, "campaignId");
                    int m4673b5 = C0662b.m4673b(m4675b, "img");
                    int m4673b6 = C0662b.m4673b(m4675b, "lang");
                    int m4673b7 = C0662b.m4673b(m4675b, "title");
                    int m4673b8 = C0662b.m4673b(m4675b, "url");
                    int m4673b9 = C0662b.m4673b(m4675b, "urlTrack");
                    int m4673b10 = C0662b.m4673b(m4675b, "notificationCenterUrlTrack");
                    int m4673b11 = C0662b.m4673b(m4675b, "type");
                    int m4673b12 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b13 = C0662b.m4673b(m4675b, "appName");
                    int m4673b14 = C0662b.m4673b(m4675b, "graphic");
                    int m4673b15 = C0662b.m4673b(m4675b, "ownerId");
                    int m4673b16 = C0662b.m4673b(m4675b, "processed");
                    int m4673b17 = C0662b.m4673b(m4675b, "actionStringRes");
                    int m4673b18 = C0662b.m4673b(m4675b, "whitelistedPackages");
                    int m4673b19 = C0662b.m4673b(m4675b, RoomNotification.KEY);
                    int m4673b20 = C0662b.m4673b(m4675b, "dismissed");
                    int i3 = m4673b14;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        Long valueOf = m4675b.isNull(m4673b) ? null : Long.valueOf(m4675b.getLong(m4673b));
                        String string = m4675b.getString(m4673b2);
                        String string2 = m4675b.getString(m4673b3);
                        int i4 = m4675b.getInt(m4673b4);
                        String string3 = m4675b.getString(m4673b5);
                        String string4 = m4675b.getString(m4673b6);
                        String string5 = m4675b.getString(m4673b7);
                        String string6 = m4675b.getString(m4673b8);
                        String string7 = m4675b.getString(m4673b9);
                        String string8 = m4675b.getString(m4673b10);
                        int i5 = m4675b.getInt(m4673b11);
                        long j2 = m4675b.getLong(m4673b12);
                        String string9 = m4675b.getString(m4673b13);
                        int i6 = i3;
                        String string10 = m4675b.getString(i6);
                        int i7 = m4673b;
                        int i8 = m4673b15;
                        String string11 = m4675b.getString(i8);
                        m4673b15 = i8;
                        int i9 = m4673b16;
                        if (m4675b.getInt(i9) != 0) {
                            m4673b16 = i9;
                            i2 = m4673b17;
                            z = true;
                        } else {
                            m4673b16 = i9;
                            i2 = m4673b17;
                            z = false;
                        }
                        int i10 = m4675b.getInt(i2);
                        m4673b17 = i2;
                        int i11 = m4673b18;
                        List<String> restoreList = StringTypeConverter.restoreList(m4675b.getString(i11));
                        m4673b18 = i11;
                        int i12 = m4673b20;
                        m4673b20 = i12;
                        RoomNotification roomNotification = new RoomNotification(valueOf, string, string2, i4, string3, string4, string5, string6, string7, string8, j2, i5, m4675b.getLong(i12), string9, string10, string11, z, i10, restoreList);
                        int i13 = m4673b13;
                        int i14 = m4673b19;
                        roomNotification.setKey(m4675b.getString(i14));
                        arrayList.add(roomNotification);
                        m4673b = i7;
                        i3 = i6;
                        m4673b19 = i14;
                        m4673b13 = i13;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public AbstractC9043m<List<RoomNotification>> getAllSortedDesc() {
        final C0654m m4644c = C0654m.m4644c("SELECT * from notification ORDER BY timeStamp DESC", 0);
        return C0655n.m4655a(this.__db, false, new String[]{"notification"}, new Callable<List<RoomNotification>>() { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.5
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomNotification> call() throws Exception {
                int i2;
                boolean z;
                Cursor m4675b = C0663c.m4675b(NotificationDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "expire");
                    int m4673b2 = C0662b.m4673b(m4675b, "abTestingGroup");
                    int m4673b3 = C0662b.m4673b(m4675b, "body");
                    int m4673b4 = C0662b.m4673b(m4675b, "campaignId");
                    int m4673b5 = C0662b.m4673b(m4675b, "img");
                    int m4673b6 = C0662b.m4673b(m4675b, "lang");
                    int m4673b7 = C0662b.m4673b(m4675b, "title");
                    int m4673b8 = C0662b.m4673b(m4675b, "url");
                    int m4673b9 = C0662b.m4673b(m4675b, "urlTrack");
                    int m4673b10 = C0662b.m4673b(m4675b, "notificationCenterUrlTrack");
                    int m4673b11 = C0662b.m4673b(m4675b, "type");
                    int m4673b12 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b13 = C0662b.m4673b(m4675b, "appName");
                    int m4673b14 = C0662b.m4673b(m4675b, "graphic");
                    int m4673b15 = C0662b.m4673b(m4675b, "ownerId");
                    int m4673b16 = C0662b.m4673b(m4675b, "processed");
                    int m4673b17 = C0662b.m4673b(m4675b, "actionStringRes");
                    int m4673b18 = C0662b.m4673b(m4675b, "whitelistedPackages");
                    int m4673b19 = C0662b.m4673b(m4675b, RoomNotification.KEY);
                    int m4673b20 = C0662b.m4673b(m4675b, "dismissed");
                    int i3 = m4673b14;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        Long valueOf = m4675b.isNull(m4673b) ? null : Long.valueOf(m4675b.getLong(m4673b));
                        String string = m4675b.getString(m4673b2);
                        String string2 = m4675b.getString(m4673b3);
                        int i4 = m4675b.getInt(m4673b4);
                        String string3 = m4675b.getString(m4673b5);
                        String string4 = m4675b.getString(m4673b6);
                        String string5 = m4675b.getString(m4673b7);
                        String string6 = m4675b.getString(m4673b8);
                        String string7 = m4675b.getString(m4673b9);
                        String string8 = m4675b.getString(m4673b10);
                        int i5 = m4675b.getInt(m4673b11);
                        long j2 = m4675b.getLong(m4673b12);
                        String string9 = m4675b.getString(m4673b13);
                        int i6 = i3;
                        String string10 = m4675b.getString(i6);
                        int i7 = m4673b;
                        int i8 = m4673b15;
                        String string11 = m4675b.getString(i8);
                        m4673b15 = i8;
                        int i9 = m4673b16;
                        if (m4675b.getInt(i9) != 0) {
                            m4673b16 = i9;
                            i2 = m4673b17;
                            z = true;
                        } else {
                            m4673b16 = i9;
                            i2 = m4673b17;
                            z = false;
                        }
                        int i10 = m4675b.getInt(i2);
                        m4673b17 = i2;
                        int i11 = m4673b18;
                        List<String> restoreList = StringTypeConverter.restoreList(m4675b.getString(i11));
                        m4673b18 = i11;
                        int i12 = m4673b20;
                        m4673b20 = i12;
                        RoomNotification roomNotification = new RoomNotification(valueOf, string, string2, i4, string3, string4, string5, string6, string7, string8, j2, i5, m4675b.getLong(i12), string9, string10, string11, z, i10, restoreList);
                        int i13 = m4673b13;
                        int i14 = m4673b19;
                        roomNotification.setKey(m4675b.getString(i14));
                        arrayList.add(roomNotification);
                        m4673b = i7;
                        i3 = i6;
                        m4673b19 = i14;
                        m4673b13 = i13;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public AbstractC9049s<List<RoomNotification>> getAllSortedDescByType(Integer[] numArr) {
        StringBuilder m4681b = C0666f.m4681b();
        m4681b.append("SELECT ");
        m4681b.append("*");
        m4681b.append(" from notification where type IN (");
        int length = numArr.length;
        C0666f.m4680a(m4681b, length);
        m4681b.append(") ORDER BY timeStamp DESC");
        final C0654m m4644c = C0654m.m4644c(m4681b.toString(), length + 0);
        int i2 = 1;
        for (Integer num : numArr) {
            if (num == null) {
                m4644c.mo4646I0(i2);
            } else {
                m4644c.mo4652h0(i2, r4.intValue());
            }
            i2++;
        }
        return C0655n.m4657c(new Callable<List<RoomNotification>>() { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.4
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomNotification> call() throws Exception {
                int i3;
                boolean z;
                Cursor m4675b = C0663c.m4675b(NotificationDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "expire");
                    int m4673b2 = C0662b.m4673b(m4675b, "abTestingGroup");
                    int m4673b3 = C0662b.m4673b(m4675b, "body");
                    int m4673b4 = C0662b.m4673b(m4675b, "campaignId");
                    int m4673b5 = C0662b.m4673b(m4675b, "img");
                    int m4673b6 = C0662b.m4673b(m4675b, "lang");
                    int m4673b7 = C0662b.m4673b(m4675b, "title");
                    int m4673b8 = C0662b.m4673b(m4675b, "url");
                    int m4673b9 = C0662b.m4673b(m4675b, "urlTrack");
                    int m4673b10 = C0662b.m4673b(m4675b, "notificationCenterUrlTrack");
                    int m4673b11 = C0662b.m4673b(m4675b, "type");
                    int m4673b12 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b13 = C0662b.m4673b(m4675b, "appName");
                    int m4673b14 = C0662b.m4673b(m4675b, "graphic");
                    int m4673b15 = C0662b.m4673b(m4675b, "ownerId");
                    int m4673b16 = C0662b.m4673b(m4675b, "processed");
                    int m4673b17 = C0662b.m4673b(m4675b, "actionStringRes");
                    int m4673b18 = C0662b.m4673b(m4675b, "whitelistedPackages");
                    int m4673b19 = C0662b.m4673b(m4675b, RoomNotification.KEY);
                    int m4673b20 = C0662b.m4673b(m4675b, "dismissed");
                    int i4 = m4673b14;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        Long valueOf = m4675b.isNull(m4673b) ? null : Long.valueOf(m4675b.getLong(m4673b));
                        String string = m4675b.getString(m4673b2);
                        String string2 = m4675b.getString(m4673b3);
                        int i5 = m4675b.getInt(m4673b4);
                        String string3 = m4675b.getString(m4673b5);
                        String string4 = m4675b.getString(m4673b6);
                        String string5 = m4675b.getString(m4673b7);
                        String string6 = m4675b.getString(m4673b8);
                        String string7 = m4675b.getString(m4673b9);
                        String string8 = m4675b.getString(m4673b10);
                        int i6 = m4675b.getInt(m4673b11);
                        long j2 = m4675b.getLong(m4673b12);
                        String string9 = m4675b.getString(m4673b13);
                        int i7 = i4;
                        String string10 = m4675b.getString(i7);
                        int i8 = m4673b;
                        int i9 = m4673b15;
                        String string11 = m4675b.getString(i9);
                        m4673b15 = i9;
                        int i10 = m4673b16;
                        if (m4675b.getInt(i10) != 0) {
                            m4673b16 = i10;
                            i3 = m4673b17;
                            z = true;
                        } else {
                            m4673b16 = i10;
                            i3 = m4673b17;
                            z = false;
                        }
                        int i11 = m4675b.getInt(i3);
                        m4673b17 = i3;
                        int i12 = m4673b18;
                        List<String> restoreList = StringTypeConverter.restoreList(m4675b.getString(i12));
                        m4673b18 = i12;
                        int i13 = m4673b20;
                        m4673b20 = i13;
                        RoomNotification roomNotification = new RoomNotification(valueOf, string, string2, i5, string3, string4, string5, string6, string7, string8, j2, i6, m4675b.getLong(i13), string9, string10, string11, z, i11, restoreList);
                        int i14 = m4673b13;
                        int i15 = m4673b19;
                        roomNotification.setKey(m4675b.getString(i15));
                        arrayList.add(roomNotification);
                        m4673b = i8;
                        i4 = i7;
                        m4673b19 = i15;
                        m4673b13 = i14;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public AbstractC9049s<List<RoomNotification>> getDismissed(Integer[] numArr, long j2, long j3) {
        StringBuilder m4681b = C0666f.m4681b();
        m4681b.append("SELECT ");
        m4681b.append("*");
        m4681b.append(" from notification where type IN (");
        int length = numArr.length;
        C0666f.m4680a(m4681b, length);
        m4681b.append(") AND dismissed BETWEEN ");
        m4681b.append("?");
        m4681b.append(" AND ");
        m4681b.append("?");
        m4681b.append(" ");
        int i2 = length + 2;
        final C0654m m4644c = C0654m.m4644c(m4681b.toString(), i2);
        int i3 = 1;
        for (Integer num : numArr) {
            if (num == null) {
                m4644c.mo4646I0(i3);
            } else {
                m4644c.mo4652h0(i3, r7.intValue());
            }
            i3++;
        }
        m4644c.mo4652h0(length + 1, j2);
        m4644c.mo4652h0(i2, j3);
        return C0655n.m4657c(new Callable<List<RoomNotification>>() { // from class: cm.aptoide.pt.database.room.NotificationDao_Impl.3
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomNotification> call() throws Exception {
                int i4;
                boolean z;
                Cursor m4675b = C0663c.m4675b(NotificationDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "expire");
                    int m4673b2 = C0662b.m4673b(m4675b, "abTestingGroup");
                    int m4673b3 = C0662b.m4673b(m4675b, "body");
                    int m4673b4 = C0662b.m4673b(m4675b, "campaignId");
                    int m4673b5 = C0662b.m4673b(m4675b, "img");
                    int m4673b6 = C0662b.m4673b(m4675b, "lang");
                    int m4673b7 = C0662b.m4673b(m4675b, "title");
                    int m4673b8 = C0662b.m4673b(m4675b, "url");
                    int m4673b9 = C0662b.m4673b(m4675b, "urlTrack");
                    int m4673b10 = C0662b.m4673b(m4675b, "notificationCenterUrlTrack");
                    int m4673b11 = C0662b.m4673b(m4675b, "type");
                    int m4673b12 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b13 = C0662b.m4673b(m4675b, "appName");
                    int m4673b14 = C0662b.m4673b(m4675b, "graphic");
                    int m4673b15 = C0662b.m4673b(m4675b, "ownerId");
                    int m4673b16 = C0662b.m4673b(m4675b, "processed");
                    int m4673b17 = C0662b.m4673b(m4675b, "actionStringRes");
                    int m4673b18 = C0662b.m4673b(m4675b, "whitelistedPackages");
                    int m4673b19 = C0662b.m4673b(m4675b, RoomNotification.KEY);
                    int m4673b20 = C0662b.m4673b(m4675b, "dismissed");
                    int i5 = m4673b14;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        Long valueOf = m4675b.isNull(m4673b) ? null : Long.valueOf(m4675b.getLong(m4673b));
                        String string = m4675b.getString(m4673b2);
                        String string2 = m4675b.getString(m4673b3);
                        int i6 = m4675b.getInt(m4673b4);
                        String string3 = m4675b.getString(m4673b5);
                        String string4 = m4675b.getString(m4673b6);
                        String string5 = m4675b.getString(m4673b7);
                        String string6 = m4675b.getString(m4673b8);
                        String string7 = m4675b.getString(m4673b9);
                        String string8 = m4675b.getString(m4673b10);
                        int i7 = m4675b.getInt(m4673b11);
                        long j4 = m4675b.getLong(m4673b12);
                        String string9 = m4675b.getString(m4673b13);
                        int i8 = i5;
                        String string10 = m4675b.getString(i8);
                        int i9 = m4673b;
                        int i10 = m4673b15;
                        String string11 = m4675b.getString(i10);
                        m4673b15 = i10;
                        int i11 = m4673b16;
                        if (m4675b.getInt(i11) != 0) {
                            m4673b16 = i11;
                            i4 = m4673b17;
                            z = true;
                        } else {
                            m4673b16 = i11;
                            i4 = m4673b17;
                            z = false;
                        }
                        int i12 = m4675b.getInt(i4);
                        m4673b17 = i4;
                        int i13 = m4673b18;
                        List<String> restoreList = StringTypeConverter.restoreList(m4675b.getString(i13));
                        m4673b18 = i13;
                        int i14 = m4673b20;
                        m4673b20 = i14;
                        RoomNotification roomNotification = new RoomNotification(valueOf, string, string2, i6, string3, string4, string5, string6, string7, string8, j4, i7, m4675b.getLong(i14), string9, string10, string11, z, i12, restoreList);
                        int i15 = m4673b13;
                        int i16 = m4673b19;
                        roomNotification.setKey(m4675b.getString(i16));
                        arrayList.add(roomNotification);
                        m4673b = i9;
                        i5 = i8;
                        m4673b19 = i16;
                        m4673b13 = i15;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void insert(RoomNotification roomNotification) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomNotification.insert((AbstractC0644c<RoomNotification>) roomNotification);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.NotificationDao
    public void insertAll(List<RoomNotification> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomNotification.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
