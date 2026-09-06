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
import cm.aptoide.p092pt.download.DownloadAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p024c.p082u.p083a.InterfaceC1012f;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.AbstractC9049s;

/* loaded from: classes.dex */
public final class DownloadDAO_Impl implements DownloadDAO {
    private final AbstractC0651j __db;
    private final AbstractC0644c<RoomDownload> __insertionAdapterOfRoomDownload;
    private final AbstractC0658q __preparedStmtOfRemove;
    private final AbstractC0658q __preparedStmtOfRemove_1;

    public DownloadDAO_Impl(AbstractC0651j abstractC0651j) {
        this.__db = abstractC0651j;
        this.__insertionAdapterOfRoomDownload = new AbstractC0644c<RoomDownload>(abstractC0651j) { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.1
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "INSERT OR REPLACE INTO `download` (`filesToDownload`,`overallDownloadStatus`,`overallProgress`,`md5`,`appName`,`Icon`,`timeStamp`,`packageName`,`versionCode`,`action`,`versionName`,`hasAppc`,`size`,`storeName`,`trustedBadge`,`downloadError`,`attributionId`,`averageApkDownloadSpeed`,`averageObbDownloadSpeed`,`averageSplitsDownloadSpeed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.AbstractC0644c
            public void bind(InterfaceC1012f interfaceC1012f, RoomDownload roomDownload) {
                String saveFileToDownloadList = FileToDownloadTypeConverter.saveFileToDownloadList(roomDownload.getFilesToDownload());
                if (saveFileToDownloadList == null) {
                    interfaceC1012f.mo4646I0(1);
                } else {
                    interfaceC1012f.mo4654w(1, saveFileToDownloadList);
                }
                interfaceC1012f.mo4652h0(2, roomDownload.getOverallDownloadStatus());
                interfaceC1012f.mo4652h0(3, roomDownload.getOverallProgress());
                if (roomDownload.getMd5() == null) {
                    interfaceC1012f.mo4646I0(4);
                } else {
                    interfaceC1012f.mo4654w(4, roomDownload.getMd5());
                }
                if (roomDownload.getAppName() == null) {
                    interfaceC1012f.mo4646I0(5);
                } else {
                    interfaceC1012f.mo4654w(5, roomDownload.getAppName());
                }
                if (roomDownload.getIcon() == null) {
                    interfaceC1012f.mo4646I0(6);
                } else {
                    interfaceC1012f.mo4654w(6, roomDownload.getIcon());
                }
                interfaceC1012f.mo4652h0(7, roomDownload.getTimeStamp());
                if (roomDownload.getPackageName() == null) {
                    interfaceC1012f.mo4646I0(8);
                } else {
                    interfaceC1012f.mo4654w(8, roomDownload.getPackageName());
                }
                interfaceC1012f.mo4652h0(9, roomDownload.getVersionCode());
                interfaceC1012f.mo4652h0(10, roomDownload.getAction());
                if (roomDownload.getVersionName() == null) {
                    interfaceC1012f.mo4646I0(11);
                } else {
                    interfaceC1012f.mo4654w(11, roomDownload.getVersionName());
                }
                interfaceC1012f.mo4652h0(12, roomDownload.hasAppc() ? 1L : 0L);
                interfaceC1012f.mo4652h0(13, roomDownload.getSize());
                if (roomDownload.getStoreName() == null) {
                    interfaceC1012f.mo4646I0(14);
                } else {
                    interfaceC1012f.mo4654w(14, roomDownload.getStoreName());
                }
                if (roomDownload.getTrustedBadge() == null) {
                    interfaceC1012f.mo4646I0(15);
                } else {
                    interfaceC1012f.mo4654w(15, roomDownload.getTrustedBadge());
                }
                interfaceC1012f.mo4652h0(16, roomDownload.getDownloadError());
                if (roomDownload.getAttributionId() == null) {
                    interfaceC1012f.mo4646I0(17);
                } else {
                    interfaceC1012f.mo4654w(17, roomDownload.getAttributionId());
                }
                interfaceC1012f.mo4652h0(18, roomDownload.getAverageApkDownloadSpeed());
                interfaceC1012f.mo4652h0(19, roomDownload.getAverageObbDownloadSpeed());
                interfaceC1012f.mo4652h0(20, roomDownload.getAverageSplitsDownloadSpeed());
            }
        };
        this.__preparedStmtOfRemove = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.2
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE from download where md5= ?";
            }
        };
        this.__preparedStmtOfRemove_1 = new AbstractC0658q(abstractC0651j) { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.3
            @Override // androidx.room.AbstractC0658q
            public String createQuery() {
                return "DELETE from download where packageName=? and versionCode=?";
            }
        };
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public AbstractC9043m<List<RoomDownload>> getAll() {
        final C0654m m4644c = C0654m.m4644c("SELECT * from download", 0);
        return C0655n.m4655a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.4
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomDownload> call() throws Exception {
                Cursor m4675b = C0663c.m4675b(DownloadDAO_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "filesToDownload");
                    int m4673b2 = C0662b.m4673b(m4675b, "overallDownloadStatus");
                    int m4673b3 = C0662b.m4673b(m4675b, "overallProgress");
                    int m4673b4 = C0662b.m4673b(m4675b, "md5");
                    int m4673b5 = C0662b.m4673b(m4675b, "appName");
                    int m4673b6 = C0662b.m4673b(m4675b, "Icon");
                    int m4673b7 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b8 = C0662b.m4673b(m4675b, "packageName");
                    int m4673b9 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_CODE);
                    int m4673b10 = C0662b.m4673b(m4675b, "action");
                    int m4673b11 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_NAME);
                    int m4673b12 = C0662b.m4673b(m4675b, "hasAppc");
                    int m4673b13 = C0662b.m4673b(m4675b, "size");
                    int m4673b14 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b15 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b16 = C0662b.m4673b(m4675b, "downloadError");
                    int m4673b17 = C0662b.m4673b(m4675b, "attributionId");
                    int m4673b18 = C0662b.m4673b(m4675b, "averageApkDownloadSpeed");
                    int m4673b19 = C0662b.m4673b(m4675b, "averageObbDownloadSpeed");
                    int m4673b20 = C0662b.m4673b(m4675b, "averageSplitsDownloadSpeed");
                    int i2 = m4673b14;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i3 = m4673b;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(m4675b.getString(m4673b)));
                        roomDownload.setOverallDownloadStatus(m4675b.getInt(m4673b2));
                        roomDownload.setOverallProgress(m4675b.getInt(m4673b3));
                        roomDownload.setMd5(m4675b.getString(m4673b4));
                        roomDownload.setAppName(m4675b.getString(m4673b5));
                        roomDownload.setIcon(m4675b.getString(m4673b6));
                        int i4 = m4673b2;
                        int i5 = m4673b3;
                        roomDownload.setTimeStamp(m4675b.getLong(m4673b7));
                        roomDownload.setPackageName(m4675b.getString(m4673b8));
                        roomDownload.setVersionCode(m4675b.getInt(m4673b9));
                        roomDownload.setAction(m4675b.getInt(m4673b10));
                        roomDownload.setVersionName(m4675b.getString(m4673b11));
                        roomDownload.setHasAppc(m4675b.getInt(m4673b12) != 0);
                        roomDownload.setSize(m4675b.getLong(m4673b13));
                        int i6 = i2;
                        roomDownload.setStoreName(m4675b.getString(i6));
                        int i7 = m4673b15;
                        roomDownload.setTrustedBadge(m4675b.getString(i7));
                        i2 = i6;
                        int i8 = m4673b16;
                        roomDownload.setDownloadError(m4675b.getInt(i8));
                        m4673b16 = i8;
                        int i9 = m4673b17;
                        roomDownload.setAttributionId(m4675b.getString(i9));
                        int i10 = m4673b18;
                        roomDownload.setAverageApkDownloadSpeed(m4675b.getLong(i10));
                        int i11 = m4673b19;
                        int i12 = m4673b4;
                        roomDownload.setAverageObbDownloadSpeed(m4675b.getLong(i11));
                        int i13 = m4673b20;
                        int i14 = m4673b5;
                        roomDownload.setAverageSplitsDownloadSpeed(m4675b.getLong(i13));
                        arrayList.add(roomDownload);
                        m4673b4 = i12;
                        m4673b5 = i14;
                        m4673b19 = i11;
                        m4673b20 = i13;
                        m4673b2 = i4;
                        m4673b15 = i7;
                        m4673b17 = i9;
                        m4673b3 = i5;
                        m4673b18 = i10;
                        m4673b = i3;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public AbstractC9043m<List<RoomDownload>> getAsList(String str) {
        final C0654m m4644c = C0654m.m4644c("SELECT * from download where md5 = ?", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        return C0655n.m4655a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.9
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomDownload> call() throws Exception {
                Cursor m4675b = C0663c.m4675b(DownloadDAO_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "filesToDownload");
                    int m4673b2 = C0662b.m4673b(m4675b, "overallDownloadStatus");
                    int m4673b3 = C0662b.m4673b(m4675b, "overallProgress");
                    int m4673b4 = C0662b.m4673b(m4675b, "md5");
                    int m4673b5 = C0662b.m4673b(m4675b, "appName");
                    int m4673b6 = C0662b.m4673b(m4675b, "Icon");
                    int m4673b7 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b8 = C0662b.m4673b(m4675b, "packageName");
                    int m4673b9 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_CODE);
                    int m4673b10 = C0662b.m4673b(m4675b, "action");
                    int m4673b11 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_NAME);
                    int m4673b12 = C0662b.m4673b(m4675b, "hasAppc");
                    int m4673b13 = C0662b.m4673b(m4675b, "size");
                    int m4673b14 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b15 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b16 = C0662b.m4673b(m4675b, "downloadError");
                    int m4673b17 = C0662b.m4673b(m4675b, "attributionId");
                    int m4673b18 = C0662b.m4673b(m4675b, "averageApkDownloadSpeed");
                    int m4673b19 = C0662b.m4673b(m4675b, "averageObbDownloadSpeed");
                    int m4673b20 = C0662b.m4673b(m4675b, "averageSplitsDownloadSpeed");
                    int i2 = m4673b14;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i3 = m4673b;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(m4675b.getString(m4673b)));
                        roomDownload.setOverallDownloadStatus(m4675b.getInt(m4673b2));
                        roomDownload.setOverallProgress(m4675b.getInt(m4673b3));
                        roomDownload.setMd5(m4675b.getString(m4673b4));
                        roomDownload.setAppName(m4675b.getString(m4673b5));
                        roomDownload.setIcon(m4675b.getString(m4673b6));
                        int i4 = m4673b2;
                        int i5 = m4673b3;
                        roomDownload.setTimeStamp(m4675b.getLong(m4673b7));
                        roomDownload.setPackageName(m4675b.getString(m4673b8));
                        roomDownload.setVersionCode(m4675b.getInt(m4673b9));
                        roomDownload.setAction(m4675b.getInt(m4673b10));
                        roomDownload.setVersionName(m4675b.getString(m4673b11));
                        roomDownload.setHasAppc(m4675b.getInt(m4673b12) != 0);
                        roomDownload.setSize(m4675b.getLong(m4673b13));
                        int i6 = i2;
                        roomDownload.setStoreName(m4675b.getString(i6));
                        int i7 = m4673b15;
                        roomDownload.setTrustedBadge(m4675b.getString(i7));
                        i2 = i6;
                        int i8 = m4673b16;
                        roomDownload.setDownloadError(m4675b.getInt(i8));
                        m4673b16 = i8;
                        int i9 = m4673b17;
                        roomDownload.setAttributionId(m4675b.getString(i9));
                        int i10 = m4673b18;
                        roomDownload.setAverageApkDownloadSpeed(m4675b.getLong(i10));
                        int i11 = m4673b19;
                        int i12 = m4673b4;
                        roomDownload.setAverageObbDownloadSpeed(m4675b.getLong(i11));
                        int i13 = m4673b20;
                        int i14 = m4673b5;
                        roomDownload.setAverageSplitsDownloadSpeed(m4675b.getLong(i13));
                        arrayList.add(roomDownload);
                        m4673b4 = i12;
                        m4673b5 = i14;
                        m4673b19 = i11;
                        m4673b20 = i13;
                        m4673b2 = i4;
                        m4673b15 = i7;
                        m4673b17 = i9;
                        m4673b3 = i5;
                        m4673b18 = i10;
                        m4673b = i3;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public AbstractC9043m<RoomDownload> getAsObservable(String str) {
        final C0654m m4644c = C0654m.m4644c("SELECT * from download where md5 = ? LIMIT 1 ", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        return C0655n.m4655a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<RoomDownload>() { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.6
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomDownload call() throws Exception {
                RoomDownload roomDownload;
                Cursor m4675b = C0663c.m4675b(DownloadDAO_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "filesToDownload");
                    int m4673b2 = C0662b.m4673b(m4675b, "overallDownloadStatus");
                    int m4673b3 = C0662b.m4673b(m4675b, "overallProgress");
                    int m4673b4 = C0662b.m4673b(m4675b, "md5");
                    int m4673b5 = C0662b.m4673b(m4675b, "appName");
                    int m4673b6 = C0662b.m4673b(m4675b, "Icon");
                    int m4673b7 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b8 = C0662b.m4673b(m4675b, "packageName");
                    int m4673b9 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_CODE);
                    int m4673b10 = C0662b.m4673b(m4675b, "action");
                    int m4673b11 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_NAME);
                    int m4673b12 = C0662b.m4673b(m4675b, "hasAppc");
                    int m4673b13 = C0662b.m4673b(m4675b, "size");
                    int m4673b14 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b15 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b16 = C0662b.m4673b(m4675b, "downloadError");
                    int m4673b17 = C0662b.m4673b(m4675b, "attributionId");
                    int m4673b18 = C0662b.m4673b(m4675b, "averageApkDownloadSpeed");
                    int m4673b19 = C0662b.m4673b(m4675b, "averageObbDownloadSpeed");
                    int m4673b20 = C0662b.m4673b(m4675b, "averageSplitsDownloadSpeed");
                    if (m4675b.moveToFirst()) {
                        RoomDownload roomDownload2 = new RoomDownload();
                        roomDownload2.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(m4675b.getString(m4673b)));
                        roomDownload2.setOverallDownloadStatus(m4675b.getInt(m4673b2));
                        roomDownload2.setOverallProgress(m4675b.getInt(m4673b3));
                        roomDownload2.setMd5(m4675b.getString(m4673b4));
                        roomDownload2.setAppName(m4675b.getString(m4673b5));
                        roomDownload2.setIcon(m4675b.getString(m4673b6));
                        roomDownload2.setTimeStamp(m4675b.getLong(m4673b7));
                        roomDownload2.setPackageName(m4675b.getString(m4673b8));
                        roomDownload2.setVersionCode(m4675b.getInt(m4673b9));
                        roomDownload2.setAction(m4675b.getInt(m4673b10));
                        roomDownload2.setVersionName(m4675b.getString(m4673b11));
                        roomDownload2.setHasAppc(m4675b.getInt(m4673b12) != 0);
                        roomDownload2.setSize(m4675b.getLong(m4673b13));
                        roomDownload2.setStoreName(m4675b.getString(m4673b14));
                        roomDownload2.setTrustedBadge(m4675b.getString(m4673b15));
                        roomDownload2.setDownloadError(m4675b.getInt(m4673b16));
                        roomDownload2.setAttributionId(m4675b.getString(m4673b17));
                        roomDownload2.setAverageApkDownloadSpeed(m4675b.getLong(m4673b18));
                        roomDownload2.setAverageObbDownloadSpeed(m4675b.getLong(m4673b19));
                        roomDownload2.setAverageSplitsDownloadSpeed(m4675b.getLong(m4673b20));
                        roomDownload = roomDownload2;
                    } else {
                        roomDownload = null;
                    }
                    return roomDownload;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public AbstractC9049s<RoomDownload> getAsSingle(String str) {
        final C0654m m4644c = C0654m.m4644c("SELECT * from download where md5 = ? LIMIT 1 ", 1);
        if (str == null) {
            m4644c.mo4646I0(1);
        } else {
            m4644c.mo4654w(1, str);
        }
        return C0655n.m4657c(new Callable<RoomDownload>() { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.5
            protected void finalize() {
                m4644c.m4651f();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public RoomDownload call() throws Exception {
                RoomDownload roomDownload;
                Cursor m4675b = C0663c.m4675b(DownloadDAO_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "filesToDownload");
                    int m4673b2 = C0662b.m4673b(m4675b, "overallDownloadStatus");
                    int m4673b3 = C0662b.m4673b(m4675b, "overallProgress");
                    int m4673b4 = C0662b.m4673b(m4675b, "md5");
                    int m4673b5 = C0662b.m4673b(m4675b, "appName");
                    int m4673b6 = C0662b.m4673b(m4675b, "Icon");
                    int m4673b7 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b8 = C0662b.m4673b(m4675b, "packageName");
                    int m4673b9 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_CODE);
                    int m4673b10 = C0662b.m4673b(m4675b, "action");
                    int m4673b11 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_NAME);
                    int m4673b12 = C0662b.m4673b(m4675b, "hasAppc");
                    int m4673b13 = C0662b.m4673b(m4675b, "size");
                    int m4673b14 = C0662b.m4673b(m4675b, "storeName");
                    try {
                        int m4673b15 = C0662b.m4673b(m4675b, "trustedBadge");
                        int m4673b16 = C0662b.m4673b(m4675b, "downloadError");
                        int m4673b17 = C0662b.m4673b(m4675b, "attributionId");
                        int m4673b18 = C0662b.m4673b(m4675b, "averageApkDownloadSpeed");
                        int m4673b19 = C0662b.m4673b(m4675b, "averageObbDownloadSpeed");
                        int m4673b20 = C0662b.m4673b(m4675b, "averageSplitsDownloadSpeed");
                        if (m4675b.moveToFirst()) {
                            RoomDownload roomDownload2 = new RoomDownload();
                            roomDownload2.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(m4675b.getString(m4673b)));
                            roomDownload2.setOverallDownloadStatus(m4675b.getInt(m4673b2));
                            roomDownload2.setOverallProgress(m4675b.getInt(m4673b3));
                            roomDownload2.setMd5(m4675b.getString(m4673b4));
                            roomDownload2.setAppName(m4675b.getString(m4673b5));
                            roomDownload2.setIcon(m4675b.getString(m4673b6));
                            roomDownload2.setTimeStamp(m4675b.getLong(m4673b7));
                            roomDownload2.setPackageName(m4675b.getString(m4673b8));
                            roomDownload2.setVersionCode(m4675b.getInt(m4673b9));
                            roomDownload2.setAction(m4675b.getInt(m4673b10));
                            roomDownload2.setVersionName(m4675b.getString(m4673b11));
                            roomDownload2.setHasAppc(m4675b.getInt(m4673b12) != 0);
                            roomDownload2.setSize(m4675b.getLong(m4673b13));
                            roomDownload2.setStoreName(m4675b.getString(m4673b14));
                            roomDownload2.setTrustedBadge(m4675b.getString(m4673b15));
                            roomDownload2.setDownloadError(m4675b.getInt(m4673b16));
                            roomDownload2.setAttributionId(m4675b.getString(m4673b17));
                            roomDownload2.setAverageApkDownloadSpeed(m4675b.getLong(m4673b18));
                            roomDownload2.setAverageObbDownloadSpeed(m4675b.getLong(m4673b19));
                            roomDownload2.setAverageSplitsDownloadSpeed(m4675b.getLong(m4673b20));
                            roomDownload = roomDownload2;
                        } else {
                            roomDownload = null;
                        }
                        if (roomDownload != null) {
                            m4675b.close();
                            return roomDownload;
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

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public AbstractC9043m<List<RoomDownload>> getInQueueSortedDownloads() {
        final C0654m m4644c = C0654m.m4644c("SELECT * from download where overallDownloadStatus=13 ORDER BY timeStamp ASC", 0);
        return C0655n.m4655a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.8
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomDownload> call() throws Exception {
                Cursor m4675b = C0663c.m4675b(DownloadDAO_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "filesToDownload");
                    int m4673b2 = C0662b.m4673b(m4675b, "overallDownloadStatus");
                    int m4673b3 = C0662b.m4673b(m4675b, "overallProgress");
                    int m4673b4 = C0662b.m4673b(m4675b, "md5");
                    int m4673b5 = C0662b.m4673b(m4675b, "appName");
                    int m4673b6 = C0662b.m4673b(m4675b, "Icon");
                    int m4673b7 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b8 = C0662b.m4673b(m4675b, "packageName");
                    int m4673b9 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_CODE);
                    int m4673b10 = C0662b.m4673b(m4675b, "action");
                    int m4673b11 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_NAME);
                    int m4673b12 = C0662b.m4673b(m4675b, "hasAppc");
                    int m4673b13 = C0662b.m4673b(m4675b, "size");
                    int m4673b14 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b15 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b16 = C0662b.m4673b(m4675b, "downloadError");
                    int m4673b17 = C0662b.m4673b(m4675b, "attributionId");
                    int m4673b18 = C0662b.m4673b(m4675b, "averageApkDownloadSpeed");
                    int m4673b19 = C0662b.m4673b(m4675b, "averageObbDownloadSpeed");
                    int m4673b20 = C0662b.m4673b(m4675b, "averageSplitsDownloadSpeed");
                    int i2 = m4673b14;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i3 = m4673b;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(m4675b.getString(m4673b)));
                        roomDownload.setOverallDownloadStatus(m4675b.getInt(m4673b2));
                        roomDownload.setOverallProgress(m4675b.getInt(m4673b3));
                        roomDownload.setMd5(m4675b.getString(m4673b4));
                        roomDownload.setAppName(m4675b.getString(m4673b5));
                        roomDownload.setIcon(m4675b.getString(m4673b6));
                        int i4 = m4673b2;
                        int i5 = m4673b3;
                        roomDownload.setTimeStamp(m4675b.getLong(m4673b7));
                        roomDownload.setPackageName(m4675b.getString(m4673b8));
                        roomDownload.setVersionCode(m4675b.getInt(m4673b9));
                        roomDownload.setAction(m4675b.getInt(m4673b10));
                        roomDownload.setVersionName(m4675b.getString(m4673b11));
                        roomDownload.setHasAppc(m4675b.getInt(m4673b12) != 0);
                        roomDownload.setSize(m4675b.getLong(m4673b13));
                        int i6 = i2;
                        roomDownload.setStoreName(m4675b.getString(i6));
                        int i7 = m4673b15;
                        roomDownload.setTrustedBadge(m4675b.getString(i7));
                        i2 = i6;
                        int i8 = m4673b16;
                        roomDownload.setDownloadError(m4675b.getInt(i8));
                        m4673b16 = i8;
                        int i9 = m4673b17;
                        roomDownload.setAttributionId(m4675b.getString(i9));
                        int i10 = m4673b18;
                        roomDownload.setAverageApkDownloadSpeed(m4675b.getLong(i10));
                        int i11 = m4673b19;
                        int i12 = m4673b4;
                        roomDownload.setAverageObbDownloadSpeed(m4675b.getLong(i11));
                        int i13 = m4673b20;
                        int i14 = m4673b5;
                        roomDownload.setAverageSplitsDownloadSpeed(m4675b.getLong(i13));
                        arrayList.add(roomDownload);
                        m4673b4 = i12;
                        m4673b5 = i14;
                        m4673b19 = i11;
                        m4673b20 = i13;
                        m4673b2 = i4;
                        m4673b15 = i7;
                        m4673b17 = i9;
                        m4673b3 = i5;
                        m4673b18 = i10;
                        m4673b = i3;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public AbstractC9043m<List<RoomDownload>> getOutOfSpaceDownloads() {
        final C0654m m4644c = C0654m.m4644c("SELECT * from download where overallDownloadStatus=9 and downloadError=2 ORDER BY timeStamp ASC", 0);
        return C0655n.m4655a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.10
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomDownload> call() throws Exception {
                Cursor m4675b = C0663c.m4675b(DownloadDAO_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "filesToDownload");
                    int m4673b2 = C0662b.m4673b(m4675b, "overallDownloadStatus");
                    int m4673b3 = C0662b.m4673b(m4675b, "overallProgress");
                    int m4673b4 = C0662b.m4673b(m4675b, "md5");
                    int m4673b5 = C0662b.m4673b(m4675b, "appName");
                    int m4673b6 = C0662b.m4673b(m4675b, "Icon");
                    int m4673b7 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b8 = C0662b.m4673b(m4675b, "packageName");
                    int m4673b9 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_CODE);
                    int m4673b10 = C0662b.m4673b(m4675b, "action");
                    int m4673b11 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_NAME);
                    int m4673b12 = C0662b.m4673b(m4675b, "hasAppc");
                    int m4673b13 = C0662b.m4673b(m4675b, "size");
                    int m4673b14 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b15 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b16 = C0662b.m4673b(m4675b, "downloadError");
                    int m4673b17 = C0662b.m4673b(m4675b, "attributionId");
                    int m4673b18 = C0662b.m4673b(m4675b, "averageApkDownloadSpeed");
                    int m4673b19 = C0662b.m4673b(m4675b, "averageObbDownloadSpeed");
                    int m4673b20 = C0662b.m4673b(m4675b, "averageSplitsDownloadSpeed");
                    int i2 = m4673b14;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i3 = m4673b;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(m4675b.getString(m4673b)));
                        roomDownload.setOverallDownloadStatus(m4675b.getInt(m4673b2));
                        roomDownload.setOverallProgress(m4675b.getInt(m4673b3));
                        roomDownload.setMd5(m4675b.getString(m4673b4));
                        roomDownload.setAppName(m4675b.getString(m4673b5));
                        roomDownload.setIcon(m4675b.getString(m4673b6));
                        int i4 = m4673b2;
                        int i5 = m4673b3;
                        roomDownload.setTimeStamp(m4675b.getLong(m4673b7));
                        roomDownload.setPackageName(m4675b.getString(m4673b8));
                        roomDownload.setVersionCode(m4675b.getInt(m4673b9));
                        roomDownload.setAction(m4675b.getInt(m4673b10));
                        roomDownload.setVersionName(m4675b.getString(m4673b11));
                        roomDownload.setHasAppc(m4675b.getInt(m4673b12) != 0);
                        roomDownload.setSize(m4675b.getLong(m4673b13));
                        int i6 = i2;
                        roomDownload.setStoreName(m4675b.getString(i6));
                        int i7 = m4673b15;
                        roomDownload.setTrustedBadge(m4675b.getString(i7));
                        i2 = i6;
                        int i8 = m4673b16;
                        roomDownload.setDownloadError(m4675b.getInt(i8));
                        m4673b16 = i8;
                        int i9 = m4673b17;
                        roomDownload.setAttributionId(m4675b.getString(i9));
                        int i10 = m4673b18;
                        roomDownload.setAverageApkDownloadSpeed(m4675b.getLong(i10));
                        int i11 = m4673b19;
                        int i12 = m4673b4;
                        roomDownload.setAverageObbDownloadSpeed(m4675b.getLong(i11));
                        int i13 = m4673b20;
                        int i14 = m4673b5;
                        roomDownload.setAverageSplitsDownloadSpeed(m4675b.getLong(i13));
                        arrayList.add(roomDownload);
                        m4673b4 = i12;
                        m4673b5 = i14;
                        m4673b19 = i11;
                        m4673b20 = i13;
                        m4673b2 = i4;
                        m4673b15 = i7;
                        m4673b17 = i9;
                        m4673b3 = i5;
                        m4673b18 = i10;
                        m4673b = i3;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public AbstractC9043m<List<RoomDownload>> getRunningDownloads() {
        final C0654m m4644c = C0654m.m4644c("SELECT * from download where overallDownloadStatus = 5 OR overallDownloadStatus = 13 OR overallDownloadStatus = 4", 0);
        return C0655n.m4655a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() { // from class: cm.aptoide.pt.database.room.DownloadDAO_Impl.7
            protected void finalize() {
                m4644c.m4651f();
            }

            @Override // java.util.concurrent.Callable
            public List<RoomDownload> call() throws Exception {
                Cursor m4675b = C0663c.m4675b(DownloadDAO_Impl.this.__db, m4644c, false, null);
                try {
                    int m4673b = C0662b.m4673b(m4675b, "filesToDownload");
                    int m4673b2 = C0662b.m4673b(m4675b, "overallDownloadStatus");
                    int m4673b3 = C0662b.m4673b(m4675b, "overallProgress");
                    int m4673b4 = C0662b.m4673b(m4675b, "md5");
                    int m4673b5 = C0662b.m4673b(m4675b, "appName");
                    int m4673b6 = C0662b.m4673b(m4675b, "Icon");
                    int m4673b7 = C0662b.m4673b(m4675b, "timeStamp");
                    int m4673b8 = C0662b.m4673b(m4675b, "packageName");
                    int m4673b9 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_CODE);
                    int m4673b10 = C0662b.m4673b(m4675b, "action");
                    int m4673b11 = C0662b.m4673b(m4675b, RoomInstalled.VERSION_NAME);
                    int m4673b12 = C0662b.m4673b(m4675b, "hasAppc");
                    int m4673b13 = C0662b.m4673b(m4675b, "size");
                    int m4673b14 = C0662b.m4673b(m4675b, "storeName");
                    int m4673b15 = C0662b.m4673b(m4675b, "trustedBadge");
                    int m4673b16 = C0662b.m4673b(m4675b, "downloadError");
                    int m4673b17 = C0662b.m4673b(m4675b, "attributionId");
                    int m4673b18 = C0662b.m4673b(m4675b, "averageApkDownloadSpeed");
                    int m4673b19 = C0662b.m4673b(m4675b, "averageObbDownloadSpeed");
                    int m4673b20 = C0662b.m4673b(m4675b, "averageSplitsDownloadSpeed");
                    int i2 = m4673b14;
                    ArrayList arrayList = new ArrayList(m4675b.getCount());
                    while (m4675b.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i3 = m4673b;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(m4675b.getString(m4673b)));
                        roomDownload.setOverallDownloadStatus(m4675b.getInt(m4673b2));
                        roomDownload.setOverallProgress(m4675b.getInt(m4673b3));
                        roomDownload.setMd5(m4675b.getString(m4673b4));
                        roomDownload.setAppName(m4675b.getString(m4673b5));
                        roomDownload.setIcon(m4675b.getString(m4673b6));
                        int i4 = m4673b2;
                        int i5 = m4673b3;
                        roomDownload.setTimeStamp(m4675b.getLong(m4673b7));
                        roomDownload.setPackageName(m4675b.getString(m4673b8));
                        roomDownload.setVersionCode(m4675b.getInt(m4673b9));
                        roomDownload.setAction(m4675b.getInt(m4673b10));
                        roomDownload.setVersionName(m4675b.getString(m4673b11));
                        roomDownload.setHasAppc(m4675b.getInt(m4673b12) != 0);
                        roomDownload.setSize(m4675b.getLong(m4673b13));
                        int i6 = i2;
                        roomDownload.setStoreName(m4675b.getString(i6));
                        int i7 = m4673b15;
                        roomDownload.setTrustedBadge(m4675b.getString(i7));
                        i2 = i6;
                        int i8 = m4673b16;
                        roomDownload.setDownloadError(m4675b.getInt(i8));
                        m4673b16 = i8;
                        int i9 = m4673b17;
                        roomDownload.setAttributionId(m4675b.getString(i9));
                        int i10 = m4673b18;
                        roomDownload.setAverageApkDownloadSpeed(m4675b.getLong(i10));
                        int i11 = m4673b19;
                        int i12 = m4673b4;
                        roomDownload.setAverageObbDownloadSpeed(m4675b.getLong(i11));
                        int i13 = m4673b20;
                        int i14 = m4673b5;
                        roomDownload.setAverageSplitsDownloadSpeed(m4675b.getLong(i13));
                        arrayList.add(roomDownload);
                        m4673b4 = i12;
                        m4673b5 = i14;
                        m4673b19 = i11;
                        m4673b20 = i13;
                        m4673b2 = i4;
                        m4673b15 = i7;
                        m4673b17 = i9;
                        m4673b3 = i5;
                        m4673b18 = i10;
                        m4673b = i3;
                    }
                    return arrayList;
                } finally {
                    m4675b.close();
                }
            }
        });
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public void insert(RoomDownload roomDownload) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomDownload.insert((AbstractC0644c<RoomDownload>) roomDownload);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public void insertAll(List<RoomDownload> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomDownload.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public void remove(String str) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.__preparedStmtOfRemove.acquire();
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
            this.__preparedStmtOfRemove.release(acquire);
        }
    }

    @Override // cm.aptoide.p092pt.database.room.DownloadDAO
    public void remove(String str, int i2) {
        this.__db.assertNotSuspendingTransaction();
        InterfaceC1012f acquire = this.__preparedStmtOfRemove_1.acquire();
        if (str == null) {
            acquire.mo4646I0(1);
        } else {
            acquire.mo4654w(1, str);
        }
        acquire.mo4652h0(2, i2);
        this.__db.beginTransaction();
        try {
            acquire.mo6470E();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemove_1.release(acquire);
        }
    }
}
