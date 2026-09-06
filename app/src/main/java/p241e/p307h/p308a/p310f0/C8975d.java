package p241e.p307h.p308a.p310f0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.SparseArray;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import com.liulishuo.filedownloader.model.C8666a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.p310f0.InterfaceC8972a;
import p241e.p307h.p308a.p315k0.C9000c;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: SqliteDatabaseImpl.java */
/* renamed from: e.h.a.f0.d */
/* loaded from: classes2.dex */
public class C8975d implements InterfaceC8972a {

    /* renamed from: a */
    private final SQLiteDatabase f34652a = new C8976e(C9000c.m28956a()).getWritableDatabase();

    /* compiled from: SqliteDatabaseImpl.java */
    /* renamed from: e.h.a.f0.d$a */
    public class a implements InterfaceC8972a.a {

        /* renamed from: f */
        private final SparseArray<FileDownloadModel> f34653f;

        /* renamed from: g */
        private b f34654g;

        /* renamed from: h */
        private final SparseArray<FileDownloadModel> f34655h;

        /* renamed from: i */
        private final SparseArray<List<C8666a>> f34656i;

        a(C8975d c8975d) {
            this(null, null);
        }

        @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a.a
        /* renamed from: K */
        public void mo28743K(FileDownloadModel fileDownloadModel) {
        }

        @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a.a
        /* renamed from: T */
        public void mo28744T(FileDownloadModel fileDownloadModel) {
            SparseArray<FileDownloadModel> sparseArray = this.f34655h;
            if (sparseArray != null) {
                sparseArray.put(fileDownloadModel.m27561e(), fileDownloadModel);
            }
        }

        @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a.a
        /* renamed from: T0 */
        public void mo28745T0() {
            b bVar = this.f34654g;
            if (bVar != null) {
                bVar.m28764c();
            }
            int size = this.f34653f.size();
            if (size < 0) {
                return;
            }
            C8975d.this.f34652a.beginTransaction();
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    int keyAt = this.f34653f.keyAt(i2);
                    FileDownloadModel fileDownloadModel = this.f34653f.get(keyAt);
                    C8975d.this.f34652a.delete("filedownloader", "_id = ?", new String[]{String.valueOf(keyAt)});
                    C8975d.this.f34652a.insert("filedownloader", null, fileDownloadModel.m27556C());
                    if (fileDownloadModel.m27557a() > 1) {
                        List<C8666a> mo28739n = C8975d.this.mo28739n(keyAt);
                        if (mo28739n.size() > 0) {
                            C8975d.this.f34652a.delete("filedownloaderConnection", "id = ?", new String[]{String.valueOf(keyAt)});
                            for (C8666a c8666a : mo28739n) {
                                c8666a.m27593i(fileDownloadModel.m27561e());
                                C8975d.this.f34652a.insert("filedownloaderConnection", null, c8666a.m27596l());
                            }
                        }
                    }
                } finally {
                    C8975d.this.f34652a.endTransaction();
                }
            }
            SparseArray<FileDownloadModel> sparseArray = this.f34655h;
            if (sparseArray != null && this.f34656i != null) {
                int size2 = sparseArray.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    int m27561e = this.f34655h.valueAt(i3).m27561e();
                    List<C8666a> mo28739n2 = C8975d.this.mo28739n(m27561e);
                    if (mo28739n2 != null && mo28739n2.size() > 0) {
                        this.f34656i.put(m27561e, mo28739n2);
                    }
                }
            }
            C8975d.this.f34652a.setTransactionSuccessful();
        }

        @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a.a
        /* renamed from: f0 */
        public void mo28746f0(int i2, FileDownloadModel fileDownloadModel) {
            this.f34653f.put(i2, fileDownloadModel);
        }

        @Override // java.lang.Iterable
        public Iterator<FileDownloadModel> iterator() {
            b bVar = C8975d.this.new b();
            this.f34654g = bVar;
            return bVar;
        }

        a(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<C8666a>> sparseArray2) {
            this.f34653f = new SparseArray<>();
            this.f34655h = sparseArray;
            this.f34656i = sparseArray2;
        }
    }

    /* compiled from: SqliteDatabaseImpl.java */
    /* renamed from: e.h.a.f0.d$b */
    class b implements Iterator<FileDownloadModel> {

        /* renamed from: f */
        private final Cursor f34658f;

        /* renamed from: g */
        private final List<Integer> f34659g = new ArrayList();

        /* renamed from: h */
        private int f34660h;

        b() {
            this.f34658f = C8975d.this.f34652a.rawQuery("SELECT * FROM filedownloader", null);
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel next() {
            FileDownloadModel m28759t = C8975d.m28759t(this.f34658f);
            this.f34660h = m28759t.m27561e();
            return m28759t;
        }

        /* renamed from: c */
        void m28764c() {
            this.f34658f.close();
            if (this.f34659g.isEmpty()) {
                return;
            }
            String join = TextUtils.join(", ", this.f34659g);
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "delete %s", join);
            }
            C8975d.this.f34652a.execSQL(C9003f.m29009o("DELETE FROM %s WHERE %s IN (%s);", "filedownloader", "_id", join));
            C8975d.this.f34652a.execSQL(C9003f.m29009o("DELETE FROM %s WHERE %s IN (%s);", "filedownloaderConnection", DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, join));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f34658f.moveToNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f34659g.add(Integer.valueOf(this.f34660h));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static FileDownloadModel m28759t(Cursor cursor) {
        FileDownloadModel fileDownloadModel = new FileDownloadModel();
        fileDownloadModel.m27578v(cursor.getInt(cursor.getColumnIndex("_id")));
        fileDownloadModel.m27555B(cursor.getString(cursor.getColumnIndex("url")));
        fileDownloadModel.m27579w(cursor.getString(cursor.getColumnIndex("path")), cursor.getShort(cursor.getColumnIndex("pathAsDirectory")) == 1);
        fileDownloadModel.m27581y((byte) cursor.getShort(cursor.getColumnIndex("status")));
        fileDownloadModel.m27580x(cursor.getLong(cursor.getColumnIndex("sofar")));
        fileDownloadModel.m27582z(cursor.getLong(cursor.getColumnIndex("total")));
        fileDownloadModel.m27576t(cursor.getString(cursor.getColumnIndex("errMsg")));
        fileDownloadModel.m27575s(cursor.getString(cursor.getColumnIndex("etag")));
        fileDownloadModel.m27577u(cursor.getString(cursor.getColumnIndex("filename")));
        fileDownloadModel.m27574r(cursor.getInt(cursor.getColumnIndex("connectionCount")));
        return fileDownloadModel;
    }

    /* renamed from: w */
    private void m28760w(int i2, ContentValues contentValues) {
        this.f34652a.update("filedownloader", contentValues, "_id = ? ", new String[]{String.valueOf(i2)});
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: a */
    public void mo28726a(int i2) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: b */
    public InterfaceC8972a.a mo28727b() {
        return new a(this);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: c */
    public void mo28728c(int i2, Throwable th) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th.toString());
        contentValues.put("status", (Byte) (byte) 5);
        m28760w(i2, contentValues);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    public void clear() {
        this.f34652a.delete("filedownloader", null, null);
        this.f34652a.delete("filedownloaderConnection", null, null);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: d */
    public void mo28729d(int i2, long j2) {
        remove(i2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: e */
    public void mo28730e(int i2, String str, long j2, long j3, int i3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sofar", Long.valueOf(j2));
        contentValues.put("total", Long.valueOf(j3));
        contentValues.put("etag", str);
        contentValues.put("connectionCount", Integer.valueOf(i3));
        m28760w(i2, contentValues);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: f */
    public void mo28731f(int i2, int i3, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("currentOffset", Long.valueOf(j2));
        this.f34652a.update("filedownloaderConnection", contentValues, "id = ? AND connectionIndex = ?", new String[]{Integer.toString(i2), Integer.toString(i3)});
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: g */
    public void mo28732g(C8666a c8666a) {
        this.f34652a.insert("filedownloaderConnection", null, c8666a.m27596l());
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: h */
    public void mo28733h(int i2) {
        this.f34652a.execSQL("DELETE FROM filedownloaderConnection WHERE id = " + i2);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: i */
    public void mo28734i(int i2) {
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: j */
    public void mo28735j(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            C9001d.m28970i(this, "update but model == null!", new Object[0]);
        } else if (mo28740o(fileDownloadModel.m27561e()) == null) {
            m28761u(fileDownloadModel);
        } else {
            this.f34652a.update("filedownloader", fileDownloadModel.m27556C(), "_id = ? ", new String[]{String.valueOf(fileDownloadModel.m27561e())});
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: k */
    public void mo28736k(int i2, Throwable th, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th.toString());
        contentValues.put("status", (Byte) (byte) -1);
        contentValues.put("sofar", Long.valueOf(j2));
        m28760w(i2, contentValues);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: l */
    public void mo28737l(int i2, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 3);
        contentValues.put("sofar", Long.valueOf(j2));
        m28760w(i2, contentValues);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: m */
    public void mo28738m(int i2, long j2, String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) 2);
        contentValues.put("total", Long.valueOf(j2));
        contentValues.put("etag", str);
        contentValues.put("filename", str2);
        m28760w(i2, contentValues);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: n */
    public List<C8666a> mo28739n(int i2) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.f34652a.rawQuery(C9003f.m29009o("SELECT * FROM %s WHERE %s = ?", "filedownloaderConnection", DeepLinkIntentReceiver.DeepLinksKeys.f7163ID), new String[]{Integer.toString(i2)});
            while (cursor.moveToNext()) {
                C8666a c8666a = new C8666a();
                c8666a.m27593i(i2);
                c8666a.m27594j(cursor.getInt(cursor.getColumnIndex("connectionIndex")));
                c8666a.m27595k(cursor.getLong(cursor.getColumnIndex("startOffset")));
                c8666a.m27591g(cursor.getLong(cursor.getColumnIndex("currentOffset")));
                c8666a.m27592h(cursor.getLong(cursor.getColumnIndex("endOffset")));
                arrayList.add(c8666a);
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: o */
    public FileDownloadModel mo28740o(int i2) {
        Throwable th;
        Cursor cursor;
        try {
            cursor = this.f34652a.rawQuery(C9003f.m29009o("SELECT * FROM %s WHERE %s = ?", "filedownloader", "_id"), new String[]{Integer.toString(i2)});
            try {
                if (!cursor.moveToNext()) {
                    cursor.close();
                    return null;
                }
                FileDownloadModel m28759t = m28759t(cursor);
                cursor.close();
                return m28759t;
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: p */
    public void mo28741p(int i2, int i3) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("connectionCount", Integer.valueOf(i3));
        this.f34652a.update("filedownloader", contentValues, "_id = ? ", new String[]{Integer.toString(i2)});
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    /* renamed from: q */
    public void mo28742q(int i2, long j2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Byte) (byte) -2);
        contentValues.put("sofar", Long.valueOf(j2));
        m28760w(i2, contentValues);
    }

    @Override // p241e.p307h.p308a.p310f0.InterfaceC8972a
    public boolean remove(int i2) {
        return this.f34652a.delete("filedownloader", "_id = ?", new String[]{String.valueOf(i2)}) != 0;
    }

    /* renamed from: u */
    public void m28761u(FileDownloadModel fileDownloadModel) {
        this.f34652a.insert("filedownloader", null, fileDownloadModel.m27556C());
    }

    /* renamed from: v */
    public InterfaceC8972a.a m28762v(SparseArray<FileDownloadModel> sparseArray, SparseArray<List<C8666a>> sparseArray2) {
        return new a(sparseArray, sparseArray2);
    }
}
