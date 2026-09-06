package androidx.room;

import android.database.Cursor;
import androidx.room.p009s.AbstractC0660a;
import java.util.Iterator;
import java.util.List;
import p024c.p082u.p083a.C1007a;
import p024c.p082u.p083a.InterfaceC1008b;
import p024c.p082u.p083a.InterfaceC1009c;

/* compiled from: RoomOpenHelper.java */
/* renamed from: androidx.room.l */
/* loaded from: classes.dex */
public class C0653l extends InterfaceC1009c.a {

    /* renamed from: b */
    private C0642a f4322b;

    /* renamed from: c */
    private final a f4323c;

    /* renamed from: d */
    private final String f4324d;

    /* renamed from: e */
    private final String f4325e;

    /* compiled from: RoomOpenHelper.java */
    /* renamed from: androidx.room.l$a */
    public static abstract class a {
        public final int version;

        public a(int i2) {
            this.version = i2;
        }

        protected abstract void createAllTables(InterfaceC1008b interfaceC1008b);

        protected abstract void dropAllTables(InterfaceC1008b interfaceC1008b);

        protected abstract void onCreate(InterfaceC1008b interfaceC1008b);

        protected abstract void onOpen(InterfaceC1008b interfaceC1008b);

        protected abstract void onPostMigrate(InterfaceC1008b interfaceC1008b);

        protected abstract void onPreMigrate(InterfaceC1008b interfaceC1008b);

        protected abstract b onValidateSchema(InterfaceC1008b interfaceC1008b);

        @Deprecated
        protected void validateMigration(InterfaceC1008b interfaceC1008b) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* compiled from: RoomOpenHelper.java */
    /* renamed from: androidx.room.l$b */
    public static class b {

        /* renamed from: a */
        public final boolean f4326a;

        /* renamed from: b */
        public final String f4327b;

        public b(boolean z, String str) {
            this.f4326a = z;
            this.f4327b = str;
        }
    }

    public C0653l(C0642a c0642a, a aVar, String str, String str2) {
        super(aVar.version);
        this.f4322b = c0642a;
        this.f4323c = aVar;
        this.f4324d = str;
        this.f4325e = str2;
    }

    /* renamed from: h */
    private void m4634h(InterfaceC1008b interfaceC1008b) {
        if (!m4637k(interfaceC1008b)) {
            b onValidateSchema = this.f4323c.onValidateSchema(interfaceC1008b);
            if (onValidateSchema.f4326a) {
                this.f4323c.onPostMigrate(interfaceC1008b);
                m4638l(interfaceC1008b);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f4327b);
            }
        }
        Cursor mo6452H0 = interfaceC1008b.mo6452H0(new C1007a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = mo6452H0.moveToFirst() ? mo6452H0.getString(0) : null;
            mo6452H0.close();
            if (!this.f4324d.equals(string) && !this.f4325e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            mo6452H0.close();
            throw th;
        }
    }

    /* renamed from: i */
    private void m4635i(InterfaceC1008b interfaceC1008b) {
        interfaceC1008b.mo6461v("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: j */
    private static boolean m4636j(InterfaceC1008b interfaceC1008b) {
        Cursor mo6460u0 = interfaceC1008b.mo6460u0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (mo6460u0.moveToFirst()) {
                if (mo6460u0.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            mo6460u0.close();
        }
    }

    /* renamed from: k */
    private static boolean m4637k(InterfaceC1008b interfaceC1008b) {
        Cursor mo6460u0 = interfaceC1008b.mo6460u0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (mo6460u0.moveToFirst()) {
                if (mo6460u0.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            mo6460u0.close();
        }
    }

    /* renamed from: l */
    private void m4638l(InterfaceC1008b interfaceC1008b) {
        m4635i(interfaceC1008b);
        interfaceC1008b.mo6461v(C0652k.m4633a(this.f4324d));
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c.a
    /* renamed from: b */
    public void mo4639b(InterfaceC1008b interfaceC1008b) {
        super.mo4639b(interfaceC1008b);
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c.a
    /* renamed from: d */
    public void mo4640d(InterfaceC1008b interfaceC1008b) {
        boolean m4636j = m4636j(interfaceC1008b);
        this.f4323c.createAllTables(interfaceC1008b);
        if (!m4636j) {
            b onValidateSchema = this.f4323c.onValidateSchema(interfaceC1008b);
            if (!onValidateSchema.f4326a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f4327b);
            }
        }
        m4638l(interfaceC1008b);
        this.f4323c.onCreate(interfaceC1008b);
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c.a
    /* renamed from: e */
    public void mo4641e(InterfaceC1008b interfaceC1008b, int i2, int i3) {
        mo4643g(interfaceC1008b, i2, i3);
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c.a
    /* renamed from: f */
    public void mo4642f(InterfaceC1008b interfaceC1008b) {
        super.mo4642f(interfaceC1008b);
        m4634h(interfaceC1008b);
        this.f4323c.onOpen(interfaceC1008b);
        this.f4322b = null;
    }

    @Override // p024c.p082u.p083a.InterfaceC1009c.a
    /* renamed from: g */
    public void mo4643g(InterfaceC1008b interfaceC1008b, int i2, int i3) {
        boolean z;
        List<AbstractC0660a> m4632c;
        C0642a c0642a = this.f4322b;
        if (c0642a == null || (m4632c = c0642a.f4239d.m4632c(i2, i3)) == null) {
            z = false;
        } else {
            this.f4323c.onPreMigrate(interfaceC1008b);
            Iterator<AbstractC0660a> it = m4632c.iterator();
            while (it.hasNext()) {
                it.next().migrate(interfaceC1008b);
            }
            b onValidateSchema = this.f4323c.onValidateSchema(interfaceC1008b);
            if (!onValidateSchema.f4326a) {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f4327b);
            }
            this.f4323c.onPostMigrate(interfaceC1008b);
            m4638l(interfaceC1008b);
            z = true;
        }
        if (z) {
            return;
        }
        C0642a c0642a2 = this.f4322b;
        if (c0642a2 != null && !c0642a2.m4586a(i2, i3)) {
            this.f4323c.dropAllTables(interfaceC1008b);
            this.f4323c.createAllTables(interfaceC1008b);
            return;
        }
        throw new IllegalStateException("A migration from " + i2 + " to " + i3 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
