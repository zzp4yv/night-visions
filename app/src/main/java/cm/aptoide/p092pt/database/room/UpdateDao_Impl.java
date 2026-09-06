package cm.aptoide.p092pt.database.room;

import android.database.Cursor;
import androidx.room.AbstractC0643b;
import androidx.room.AbstractC0644c;
import androidx.room.AbstractC0651j;
import androidx.room.AbstractC0658q;
import androidx.room.C0654m;
import androidx.room.C0655n;
import androidx.room.EmptyResultSetException;
import androidx.room.p010t.C0662b;
import androidx.room.p010t.C0663c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public final class UpdateDao_Impl implements UpdateDao {
    private final AbstractC0651j __db;
    private final AbstractC0643b<RoomUpdate> __deletionAdapterOfRoomUpdate;
    private final AbstractC0644c<RoomUpdate> __insertionAdapterOfRoomUpdate;
    private final AbstractC0658q __preparedStmtOfDeleteByPackageName;

    public UpdateDao_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomUpdate = new AbstractC0644c<RoomUpdate>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.UpdateDao_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `update` (`packageName`,`appId`,`label`,`icon`,`md5`,`apkPath`,`size`,`updateVersionName`,`updateVersionCode`,`excluded`,`trustedBadge`,`alternativeApkPath`,`storeName`,`mainObbName`,`mainObbPath`,`mainObbMd5`,`patchObbName`,`patchObbPath`,`patchObbMd5`,`roomSplits`,`requiredSplits`,`hasAppc`,`downloadCampaigns`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomUpdate roomUpdate) {
                if (roomUpdate.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomUpdate.getPackageName());
                }
                interfaceC1012f.mo4652h0(2, roomUpdate.getAppId());
                if (roomUpdate.getLabel() == null) {
                    interfaceC1012f.mo4646I0(3);
                } else {
                    interfaceC1012f.mo4654w(3, roomUpdate.getLabel());
                }
                if (roomUpdate.getIcon() == null) {
                    interfaceC1012f.mo4646I0(4);
                } else {
                    interfaceC1012f.mo4654w(4, roomUpdate.getIcon());
                }
                if (roomUpdate.getMd5() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomUpdate.getMd5());
                }
                if (roomUpdate.getApkPath() == null) {
                    interfaceC1012f.mo4646I0(6);
                } else {
                    interfaceC1012f.mo4654w(6, roomUpdate.getApkPath());
                }
                interfaceC1012f.mo4652h0(7, roomUpdate.getSize());
                if (roomUpdate.getUpdateVersionName() == null) {
                    interfaceC1012f.mo4646I0(8);
                } else {
                    interfaceC1012f.mo4654w(8, roomUpdate.getUpdateVersionName());
                }
                interfaceC1012f.mo4652h0(9, roomUpdate.getUpdateVersionCode());
                interfaceC1012f.mo4652h0(10, roomUpdate.isExcluded() ? 1L : 0L);
                if (roomUpdate.getTrustedBadge() == null) {
                    interfaceC1012f.mo4646I0(11);
                } else {
                    interfaceC1012f.mo4654w(11, roomUpdate.getTrustedBadge());
                }
                if (roomUpdate.getAlternativeApkPath() == null) {
                    interfaceC1012f.mo4646I0(12);
                } else {
                    interfaceC1012f.mo4654w(12, roomUpdate.getAlternativeApkPath());
                }
                if (roomUpdate.getStoreName() == null) {
                    interfaceC1012f.mo4646I0(13);
                } else {
                    interfaceC1012f.mo4654w(13, roomUpdate.getStoreName());
                }
                if (roomUpdate.getMainObbName() == null) {
                    interfaceC1012f.mo4646I0(14);
                } else {
                    interfaceC1012f.mo4654w(14, roomUpdate.getMainObbName());
                }
                if (roomUpdate.getMainObbPath() == null) {
                    interfaceC1012f.mo4646I0(15);
                } else {
                    interfaceC1012f.mo4654w(15, roomUpdate.getMainObbPath());
                }
                if (roomUpdate.getMainObbMd5() == null) {
                    interfaceC1012f.mo4646I0(16);
                } else {
                    interfaceC1012f.mo4654w(16, roomUpdate.getMainObbMd5());
                }
                if (roomUpdate.getPatchObbName() == null) {
                    interfaceC1012f.mo4646I0(17);
                } else {
                    interfaceC1012f.mo4654w(17, roomUpdate.getPatchObbName());
                }
                if (roomUpdate.getPatchObbPath() == null) {
                    interfaceC1012f.mo4646I0(18);
                } else {
                    interfaceC1012f.mo4654w(18, roomUpdate.getPatchObbPath());
                }
                if (roomUpdate.getPatchObbMd5() == null) {
                    interfaceC1012f.mo4646I0(19);
                } else {
                    interfaceC1012f.mo4654w(19, roomUpdate.getPatchObbMd5());
                }
                String saveSplitList = SplitTypeConverter.saveSplitList(roomUpdate.getRoomSplits());
                if (saveSplitList == null) {
                    interfaceC1012f.mo4646I0(20);
                } else {
                    interfaceC1012f.mo4654w(20, saveSplitList);
                }
                String saveList = StringTypeConverter.saveList(roomUpdate.getRequiredSplits());
                if (saveList == null) {
                    interfaceC1012f.mo4646I0(21);
                } else {
                    interfaceC1012f.mo4654w(21, saveList);
                }
                interfaceC1012f.mo4652h0(22, roomUpdate.hasAppc() ? 1L : 0L);
                String saveCampaignUrlList = CampaignUrlTypeConverter.saveCampaignUrlList(roomUpdate.getDownloadCampaigns());
                if (saveCampaignUrlList == null) {
                    interfaceC1012f.mo4646I0(23);
                } else {
                    interfaceC1012f.mo4654w(23, saveCampaignUrlList);
                }
            }
        };
        this.__deletionAdapterOfRoomUpdate = new AbstractC0643b<RoomUpdate>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.UpdateDao_Impl.2
            @Override // androidx.room.AbstractC0643b, androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE FROM `update` WHERE `packageName` = ?";
            }

            @Override // androidx.room.AbstractC0643b
            public void bind(InterfaceC1012f interfaceC1012f, RoomUpdate roomUpdate) {
                if (roomUpdate.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, roomUpdate.getPackageName());
                }
            }
        };
        this.__preparedStmtOfDeleteByPackageName = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.UpdateDao_Impl.3
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE from `update` where packageName = ?";
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.UpdateDao
    public void deleteAll(List<RoomUpdate> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomUpdate.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.UpdateDao
    public void deleteByPackageName(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.__preparedStmtOfDeleteByPackageName.acquire();
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
            this.__preparedStmtOfDeleteByPackageName.release(acquire);
        }
    }

    @Override // cm.aptoide.p092pt.database.room.UpdateDao
    public AbstractC9049s<RoomUpdate> get(String str) {
        final C0654m m4644c = C0654m.m4644c("SELECT * from `update` where packageName = ?", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        return C0655n.m4657c(new Callable<RoomUpdate>() { // from class: cm.aptoide.pt.database.room.UpdateDao_Impl.4
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomUpdate call() throws Exception {
                RoomUpdate roomUpdate;
                Cursor m4675b = C0663c.m4675b(UpdateDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "packageName");
                    int m4673b2 = C0662b.m4673b(m4675b, "appId");
                    int m4673b3 = C0662b.m4673b(m4675b, "label");
                    int m4673b4 = C0662b.m4673b(m4675b, RoomInstalled.ICON);
                    int m4673b5 = C0662b.m4673b(m4675b, "md5");
                    int m4673b6 = C0662b.m4673b(m4675b, "apkPath");
                    int m4673b7 = C0662b.m4673b(m4675b, "size");
                    int m4673b8 = C0662b.m4673b(m4675b, "updateVersionName");
                    int m4673b9 = C0662b.m4673b(m4675b, "updateVersionCode");
                    int m4673b10 = C0662b.m4673b(m4675b, "excluded");
                    int m4673b11 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b12 = C0662b.m4673b(m4675b, "alternativeApkPath");
                    int m4673b13 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b14 = C0662b.m4673b(m4675b, "mainObbName");
                    try {
                        int m4673b15 = C0662b.m4673b(m4675b, "mainObbPath");
                        int m4673b16 = C0662b.m4673b(m4675b, "mainObbMd5");
                        int m4673b17 = C0662b.m4673b(m4675b, "patchObbName");
                        int m4673b18 = C0662b.m4673b(m4675b, "patchObbPath");
                        int m4673b19 = C0662b.m4673b(m4675b, "patchObbMd5");
                        int m4673b20 = C0662b.m4673b(m4675b, "roomSplits");
                        int m4673b21 = C0662b.m4673b(m4675b, "requiredSplits");
                        int m4673b22 = C0662b.m4673b(m4675b, "hasAppc");
                        int m4673b23 = C0662b.m4673b(m4675b, "downloadCampaigns");
                        if (m4675b.moveToFirst()) {
                            String string = m4675b.getString(m4673b);
                            long j2 = m4675b.getLong(m4673b2);
                            String string2 = m4675b.getString(m4673b3);
                            String string3 = m4675b.getString(m4673b4);
                            String string4 = m4675b.getString(m4673b5);
                            String string5 = m4675b.getString(m4673b6);
                            long j3 = m4675b.getLong(m4673b7);
                            String string6 = m4675b.getString(m4673b8);
                            int i2 = m4675b.getInt(m4673b9);
                            String string7 = m4675b.getString(m4673b11);
                            String string8 = m4675b.getString(m4673b12);
                            String string9 = m4675b.getString(m4673b13);
                            roomUpdate = new RoomUpdate(j2, string2, string3, string, string4, string5, j3, string6, string8, i2, string7, m4675b.getString(m4673b14), m4675b.getString(m4673b15), m4675b.getString(m4673b16), m4675b.getString(m4673b17), m4675b.getString(m4673b18), m4675b.getString(m4673b19), m4675b.getInt(m4673b22) != 0, SplitTypeConverter.restoreSplitList(m4675b.getString(m4673b20)), StringTypeConverter.restoreList(m4675b.getString(m4673b21)), string9, CampaignUrlTypeConverter.restoreCampaignUrlList(m4675b.getString(m4673b23)));
                            roomUpdate.setExcluded(m4675b.getInt(m4673b10) != 0);
                        } else {
                            roomUpdate = null;
                        }
                        if (roomUpdate != null) {
                            m4675b.close();
                            return roomUpdate;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Query returned empty result set: ");
                        try {
                            sb.append(m4644c.mo4648a());
                            throw new EmptyResultSetException(sb.toString());
                        } catch (Throwable th) {
                            th = th;
                            m4675b.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.UpdateDao
    public AbstractC9049s<List<RoomUpdate>> getAllByExcluded(boolean z) {
        final C0654m m4644c = C0654m.m4644c("SELECT * from `update` where excluded = ?", 1);
        m4644c.mo4652h0(1, z ? 1L : 0L);
        return C0655n.m4657c(new Callable<List<RoomUpdate>>() { // from class: cm.aptoide.pt.database.room.UpdateDao_Impl.5
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomUpdate> call() throws Exception {
                int i2;
                boolean z2;
                boolean z3;
                Cursor m4675b = C0663c.m4675b(UpdateDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "packageName");
                    int m4673b2 = C0662b.m4673b(m4675b, "appId");
                    int m4673b3 = C0662b.m4673b(m4675b, "label");
                    int m4673b4 = C0662b.m4673b(m4675b, RoomInstalled.ICON);
                    int m4673b5 = C0662b.m4673b(m4675b, "md5");
                    int m4673b6 = C0662b.m4673b(m4675b, "apkPath");
                    int m4673b7 = C0662b.m4673b(m4675b, "size");
                    int m4673b8 = C0662b.m4673b(m4675b, "updateVersionName");
                    int m4673b9 = C0662b.m4673b(m4675b, "updateVersionCode");
                    int m4673b10 = C0662b.m4673b(m4675b, "excluded");
                    int m4673b11 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b12 = C0662b.m4673b(m4675b, "alternativeApkPath");
                    int m4673b13 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b14 = C0662b.m4673b(m4675b, "mainObbName");
                    int m4673b15 = C0662b.m4673b(m4675b, "mainObbPath");
                    int i3 = m4673b10;
                    int m4673b16 = C0662b.m4673b(m4675b, "mainObbMd5");
                    int m4673b17 = C0662b.m4673b(m4675b, "patchObbName");
                    int m4673b18 = C0662b.m4673b(m4675b, "patchObbPath");
                    int m4673b19 = C0662b.m4673b(m4675b, "patchObbMd5");
                    int m4673b20 = C0662b.m4673b(m4675b, "roomSplits");
                    int m4673b21 = C0662b.m4673b(m4675b, "requiredSplits");
                    int m4673b22 = C0662b.m4673b(m4675b, "hasAppc");
                    int m4673b23 = C0662b.m4673b(m4675b, "downloadCampaigns");
                    int i4 = m4673b15;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        String string = m4675b.getString(m4673b);
                        long j2 = m4675b.getLong(m4673b2);
                        String string2 = m4675b.getString(m4673b3);
                        String string3 = m4675b.getString(m4673b4);
                        String string4 = m4675b.getString(m4673b5);
                        String string5 = m4675b.getString(m4673b6);
                        long j3 = m4675b.getLong(m4673b7);
                        String string6 = m4675b.getString(m4673b8);
                        int i5 = m4675b.getInt(m4673b9);
                        String string7 = m4675b.getString(m4673b11);
                        String string8 = m4675b.getString(m4673b12);
                        String string9 = m4675b.getString(m4673b13);
                        String string10 = m4675b.getString(m4673b14);
                        int i6 = i4;
                        String string11 = m4675b.getString(i6);
                        int i7 = m4673b;
                        int i8 = m4673b16;
                        String string12 = m4675b.getString(i8);
                        m4673b16 = i8;
                        int i9 = m4673b17;
                        String string13 = m4675b.getString(i9);
                        m4673b17 = i9;
                        int i10 = m4673b18;
                        String string14 = m4675b.getString(i10);
                        m4673b18 = i10;
                        int i11 = m4673b19;
                        String string15 = m4675b.getString(i11);
                        m4673b19 = i11;
                        int i12 = m4673b20;
                        List<RoomSplit> restoreSplitList = SplitTypeConverter.restoreSplitList(m4675b.getString(i12));
                        m4673b20 = i12;
                        int i13 = m4673b21;
                        List<String> restoreList = StringTypeConverter.restoreList(m4675b.getString(i13));
                        m4673b21 = i13;
                        int i14 = m4673b22;
                        if (m4675b.getInt(i14) != 0) {
                            m4673b22 = i14;
                            i2 = m4673b23;
                            z2 = true;
                        } else {
                            m4673b22 = i14;
                            i2 = m4673b23;
                            z2 = false;
                        }
                        m4673b23 = i2;
                        RoomUpdate roomUpdate = new RoomUpdate(j2, string2, string3, string, string4, string5, j3, string6, string8, i5, string7, string10, string11, string12, string13, string14, string15, z2, restoreSplitList, restoreList, string9, CampaignUrlTypeConverter.restoreCampaignUrlList(m4675b.getString(i2)));
                        int i15 = i3;
                        if (m4675b.getInt(i15) != 0) {
                            i3 = i15;
                            z3 = true;
                        } else {
                            i3 = i15;
                            z3 = false;
                        }
                        roomUpdate.setExcluded(z3);
                        arrayList.add(roomUpdate);
                        m4673b = i7;
                        i4 = i6;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.UpdateDao
    public AbstractC9043m<List<RoomUpdate>> getAllByExcludedSorted(boolean z) {
        final C0654m m4644c = C0654m.m4644c("SELECT * from `update` where excluded = ? ORDER BY label", 1);
        m4644c.mo4652h0(1, z ? 1L : 0L);
        return C0655n.m4655a(this.__db, false, new String[]{"update"}, new Callable<List<RoomUpdate>>() { // from class: cm.aptoide.pt.database.room.UpdateDao_Impl.6
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomUpdate> call() throws Exception {
                int i2;
                boolean z2;
                boolean z3;
                Cursor m4675b = C0663c.m4675b(UpdateDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "packageName");
                    int m4673b2 = C0662b.m4673b(m4675b, "appId");
                    int m4673b3 = C0662b.m4673b(m4675b, "label");
                    int m4673b4 = C0662b.m4673b(m4675b, RoomInstalled.ICON);
                    int m4673b5 = C0662b.m4673b(m4675b, "md5");
                    int m4673b6 = C0662b.m4673b(m4675b, "apkPath");
                    int m4673b7 = C0662b.m4673b(m4675b, "size");
                    int m4673b8 = C0662b.m4673b(m4675b, "updateVersionName");
                    int m4673b9 = C0662b.m4673b(m4675b, "updateVersionCode");
                    int m4673b10 = C0662b.m4673b(m4675b, "excluded");
                    int m4673b11 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b12 = C0662b.m4673b(m4675b, "alternativeApkPath");
                    int m4673b13 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b14 = C0662b.m4673b(m4675b, "mainObbName");
                    int m4673b15 = C0662b.m4673b(m4675b, "mainObbPath");
                    int i3 = m4673b10;
                    int m4673b16 = C0662b.m4673b(m4675b, "mainObbMd5");
                    int m4673b17 = C0662b.m4673b(m4675b, "patchObbName");
                    int m4673b18 = C0662b.m4673b(m4675b, "patchObbPath");
                    int m4673b19 = C0662b.m4673b(m4675b, "patchObbMd5");
                    int m4673b20 = C0662b.m4673b(m4675b, "roomSplits");
                    int m4673b21 = C0662b.m4673b(m4675b, "requiredSplits");
                    int m4673b22 = C0662b.m4673b(m4675b, "hasAppc");
                    int m4673b23 = C0662b.m4673b(m4675b, "downloadCampaigns");
                    int i4 = m4673b15;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        String string = m4675b.getString(m4673b);
                        long j2 = m4675b.getLong(m4673b2);
                        String string2 = m4675b.getString(m4673b3);
                        String string3 = m4675b.getString(m4673b4);
                        String string4 = m4675b.getString(m4673b5);
                        String string5 = m4675b.getString(m4673b6);
                        long j3 = m4675b.getLong(m4673b7);
                        String string6 = m4675b.getString(m4673b8);
                        int i5 = m4675b.getInt(m4673b9);
                        String string7 = m4675b.getString(m4673b11);
                        String string8 = m4675b.getString(m4673b12);
                        String string9 = m4675b.getString(m4673b13);
                        String string10 = m4675b.getString(m4673b14);
                        int i6 = i4;
                        String string11 = m4675b.getString(i6);
                        int i7 = m4673b;
                        int i8 = m4673b16;
                        String string12 = m4675b.getString(i8);
                        m4673b16 = i8;
                        int i9 = m4673b17;
                        String string13 = m4675b.getString(i9);
                        m4673b17 = i9;
                        int i10 = m4673b18;
                        String string14 = m4675b.getString(i10);
                        m4673b18 = i10;
                        int i11 = m4673b19;
                        String string15 = m4675b.getString(i11);
                        m4673b19 = i11;
                        int i12 = m4673b20;
                        List<RoomSplit> restoreSplitList = SplitTypeConverter.restoreSplitList(m4675b.getString(i12));
                        m4673b20 = i12;
                        int i13 = m4673b21;
                        List<String> restoreList = StringTypeConverter.restoreList(m4675b.getString(i13));
                        m4673b21 = i13;
                        int i14 = m4673b22;
                        if (m4675b.getInt(i14) != 0) {
                            m4673b22 = i14;
                            i2 = m4673b23;
                            z2 = true;
                        } else {
                            m4673b22 = i14;
                            i2 = m4673b23;
                            z2 = false;
                        }
                        m4673b23 = i2;
                        RoomUpdate roomUpdate = new RoomUpdate(j2, string2, string3, string, string4, string5, j3, string6, string8, i5, string7, string10, string11, string12, string13, string14, string15, z2, restoreSplitList, restoreList, string9, CampaignUrlTypeConverter.restoreCampaignUrlList(m4675b.getString(i2)));
                        int i15 = i3;
                        if (m4675b.getInt(i15) != 0) {
                            i3 = i15;
                            z3 = true;
                        } else {
                            i3 = i15;
                            z3 = false;
                        }
                        roomUpdate.setExcluded(z3);
                        arrayList.add(roomUpdate);
                        m4673b = i7;
                        i4 = i6;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.UpdateDao
    public AbstractC9049s<RoomUpdate> getByPackageAndExcluded(String str, boolean z) {
        final C0654m m4644c = C0654m.m4644c("SELECT * from `update` where excluded = ? and packageName = ? LIMIT 1", 2);
        m4644c.mo4652h0(1, z ? 1L : 0L);
        if (str == null) {
            m4644c.mo4646I0(2);
        } else {
            m4644c.mo4654w(2, str);
        }
        return C0655n.m4657c(new Callable<RoomUpdate>() { // from class: cm.aptoide.pt.database.room.UpdateDao_Impl.7
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomUpdate call() throws Exception {
                RoomUpdate roomUpdate;
                Cursor m4675b = C0663c.m4675b(UpdateDao_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "packageName");
                    int m4673b2 = C0662b.m4673b(m4675b, "appId");
                    int m4673b3 = C0662b.m4673b(m4675b, "label");
                    int m4673b4 = C0662b.m4673b(m4675b, RoomInstalled.ICON);
                    int m4673b5 = C0662b.m4673b(m4675b, "md5");
                    int m4673b6 = C0662b.m4673b(m4675b, "apkPath");
                    int m4673b7 = C0662b.m4673b(m4675b, "size");
                    int m4673b8 = C0662b.m4673b(m4675b, "updateVersionName");
                    int m4673b9 = C0662b.m4673b(m4675b, "updateVersionCode");
                    int m4673b10 = C0662b.m4673b(m4675b, "excluded");
                    int m4673b11 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b12 = C0662b.m4673b(m4675b, "alternativeApkPath");
                    int m4673b13 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b14 = C0662b.m4673b(m4675b, "mainObbName");
                    try {
                        int m4673b15 = C0662b.m4673b(m4675b, "mainObbPath");
                        int m4673b16 = C0662b.m4673b(m4675b, "mainObbMd5");
                        int m4673b17 = C0662b.m4673b(m4675b, "patchObbName");
                        int m4673b18 = C0662b.m4673b(m4675b, "patchObbPath");
                        int m4673b19 = C0662b.m4673b(m4675b, "patchObbMd5");
                        int m4673b20 = C0662b.m4673b(m4675b, "roomSplits");
                        int m4673b21 = C0662b.m4673b(m4675b, "requiredSplits");
                        int m4673b22 = C0662b.m4673b(m4675b, "hasAppc");
                        int m4673b23 = C0662b.m4673b(m4675b, "downloadCampaigns");
                        if (m4675b.moveToFirst()) {
                            String string = m4675b.getString(m4673b);
                            long j2 = m4675b.getLong(m4673b2);
                            String string2 = m4675b.getString(m4673b3);
                            String string3 = m4675b.getString(m4673b4);
                            String string4 = m4675b.getString(m4673b5);
                            String string5 = m4675b.getString(m4673b6);
                            long j3 = m4675b.getLong(m4673b7);
                            String string6 = m4675b.getString(m4673b8);
                            int i2 = m4675b.getInt(m4673b9);
                            String string7 = m4675b.getString(m4673b11);
                            String string8 = m4675b.getString(m4673b12);
                            String string9 = m4675b.getString(m4673b13);
                            roomUpdate = new RoomUpdate(j2, string2, string3, string, string4, string5, j3, string6, string8, i2, string7, m4675b.getString(m4673b14), m4675b.getString(m4673b15), m4675b.getString(m4673b16), m4675b.getString(m4673b17), m4675b.getString(m4673b18), m4675b.getString(m4673b19), m4675b.getInt(m4673b22) != 0, SplitTypeConverter.restoreSplitList(m4675b.getString(m4673b20)), StringTypeConverter.restoreList(m4675b.getString(m4673b21)), string9, CampaignUrlTypeConverter.restoreCampaignUrlList(m4675b.getString(m4673b23)));
                            roomUpdate.setExcluded(m4675b.getInt(m4673b10) != 0);
                        } else {
                            roomUpdate = null;
                        }
                        if (roomUpdate != null) {
                            m4675b.close();
                            return roomUpdate;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Query returned empty result set: ");
                        try {
                            sb.append(m4644c.mo4648a());
                            throw new EmptyResultSetException(sb.toString());
                        } catch (Throwable th) {
                            th = th;
                            m4675b.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.UpdateDao
    public void insert(RoomUpdate roomUpdate) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomUpdate.insert((AbstractC0644c<RoomUpdate>) roomUpdate);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.UpdateDao
    public void insertAll(List<RoomUpdate> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomUpdate.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
