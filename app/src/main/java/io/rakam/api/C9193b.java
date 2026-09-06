package io.rakam.api;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.account.AccountAnalytics;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DatabaseHelper.java */
/* renamed from: io.rakam.api.b */
/* loaded from: classes2.dex */
class C9193b extends SQLiteOpenHelper {

    /* renamed from: f */
    static final Map<String, C9193b> f35617f = new HashMap();

    /* renamed from: g */
    private static final C9199h f35618g = C9199h.m29964d();

    /* renamed from: h */
    File f35619h;

    /* renamed from: i */
    private String f35620i;

    /* renamed from: j */
    private boolean f35621j;

    /* renamed from: k */
    private InterfaceC9194c f35622k;

    protected C9193b(Context context, String str) {
        super(context, m29804l(str), (SQLiteDatabase.CursorFactory) null, 3);
        this.f35621j = true;
        this.f35619h = context.getDatabasePath(m29804l(str));
        this.f35620i = C9201j.m29989e(str);
    }

    /* renamed from: H */
    private synchronized long m29797H(String str, long j2) {
        long j3;
        j3 = -1;
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                try {
                    SQLiteStatement compileStatement = getReadableDatabase().compileStatement("SELECT id FROM " + str + " LIMIT 1 OFFSET " + (j2 - 1));
                    try {
                        j3 = compileStatement.simpleQueryForLong();
                    } catch (SQLiteDoneException e2) {
                        f35618g.m29971h("io.rakam.api.DatabaseHelper", e2);
                    }
                    if (compileStatement != null) {
                        compileStatement.close();
                    }
                } catch (StackOverflowError e3) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getNthEventId from %s failed", str), e3);
                    C9196e.m29884e().m29888g(String.format("DB: Failed to getNthEventId from table %s", str), e3);
                    m29800e();
                    if (0 != 0) {
                        sQLiteStatement.close();
                    }
                }
            } catch (SQLiteException e4) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getNthEventId from %s failed", str), e4);
                C9196e.m29884e().m29888g(String.format("DB: Failed to getNthEventId from table %s", str), e4);
                m29800e();
                if (0 != 0) {
                    sQLiteStatement.close();
                }
            }
            close();
        } catch (Throwable th) {
            if (0 != 0) {
                sQLiteStatement.close();
            }
            close();
            throw th;
        }
        return j3;
    }

    /* renamed from: b */
    private synchronized long m29798b(String str, String str2) {
        StackOverflowError e2;
        long j2;
        SQLiteException e3;
        try {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put("event", str2);
                j2 = m29815Q(writableDatabase, str, contentValues);
                if (j2 == -1) {
                    try {
                        f35618g.m29970g("io.rakam.api.DatabaseHelper", String.format("Insert into %s failed", str));
                    } catch (SQLiteException e4) {
                        e3 = e4;
                        f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("addEvent to %s failed", str), e3);
                        C9196e.m29884e().m29888g(String.format("DB: Failed to addEvent: %s", str2), e3);
                        m29800e();
                        return j2;
                    } catch (StackOverflowError e5) {
                        e2 = e5;
                        f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("addEvent to %s failed", str), e2);
                        C9196e.m29884e().m29888g(String.format("DB: Failed to addEvent: %s", str2), e2);
                        m29800e();
                        return j2;
                    }
                }
            } catch (SQLiteException e6) {
                e3 = e6;
                j2 = -1;
            } catch (StackOverflowError e7) {
                e2 = e7;
                j2 = -1;
            }
        } finally {
            close();
        }
        return j2;
    }

    /* renamed from: d */
    private static void m29799d(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (C9201j.m29988d(message)) {
            throw runtimeException;
        }
        if (!message.startsWith("Cursor window allocation of")) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
    
        if (r3.isOpen() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00eb, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0112, code lost:
    
        if (r3.isOpen() != false) goto L71;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m29800e() {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.C9193b.m29800e():void");
    }

    /* renamed from: i0 */
    private synchronized void m29801i0(String str, long j2) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id = " + j2, null);
                } catch (SQLiteException e2) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("removeEvent from %s failed", str), e2);
                    C9196e.m29884e().m29888g(String.format("DB: Failed to removeEvent from table %s", str), e2);
                    m29800e();
                }
            } catch (StackOverflowError e3) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("removeEvent from %s failed", str), e3);
                C9196e.m29884e().m29888g(String.format("DB: Failed to removeEvent from table %s", str), e3);
                m29800e();
            }
        } finally {
        }
    }

    @Deprecated
    /* renamed from: j */
    static C9193b m29802j(Context context) {
        return m29803k(context, null);
    }

    /* renamed from: k */
    static synchronized C9193b m29803k(Context context, String str) {
        C9193b c9193b;
        synchronized (C9193b.class) {
            String m29989e = C9201j.m29989e(str);
            Map<String, C9193b> map = f35617f;
            c9193b = map.get(m29989e);
            if (c9193b == null) {
                c9193b = new C9193b(context.getApplicationContext(), m29989e);
                map.put(m29989e, c9193b);
            }
        }
        return c9193b;
    }

    /* renamed from: l */
    private static String m29804l(String str) {
        if (C9201j.m29988d(str) || str.equals("$default_instance")) {
            return "io.rakam.api";
        }
        return "io.rakam.api_" + str;
    }

    /* renamed from: n0 */
    private synchronized void m29805n0(String str, long j2) {
        try {
            try {
                try {
                    getWritableDatabase().delete(str, "id <= " + j2, null);
                } catch (SQLiteException e2) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("removeEvents from %s failed", str), e2);
                    C9196e.m29884e().m29888g(String.format("DB: Failed to removeEvents from table %s", str), e2);
                    m29800e();
                }
            } catch (StackOverflowError e3) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("removeEvents from %s failed", str), e3);
                C9196e.m29884e().m29888g(String.format("DB: Failed to removeEvents from table %s", str), e3);
                m29800e();
            }
        } finally {
        }
    }

    /* renamed from: p */
    private synchronized long m29806p(String str) {
        long j2;
        SQLiteStatement sQLiteStatement = null;
        try {
            try {
                try {
                    sQLiteStatement = getReadableDatabase().compileStatement("SELECT COUNT(*) FROM " + str);
                    j2 = sQLiteStatement.simpleQueryForLong();
                    sQLiteStatement.close();
                    close();
                } catch (SQLiteException e2) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getNumberRows for %s failed", str), e2);
                    C9196e.m29884e().m29888g(String.format("DB: Failed to getNumberRows for table %s", str), e2);
                    m29800e();
                    if (sQLiteStatement != null) {
                        sQLiteStatement.close();
                    }
                    j2 = 0;
                    return j2;
                }
            } catch (StackOverflowError e3) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getNumberRows for %s failed", str), e3);
                C9196e.m29884e().m29888g(String.format("DB: Failed to getNumberRows for table %s", str), e3);
                m29800e();
                j2 = 0;
                return j2;
            }
        } finally {
            if (0 != 0) {
                sQLiteStatement.close();
            }
            close();
        }
        return j2;
    }

    /* renamed from: t0 */
    private void m29807t0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    /* renamed from: A */
    synchronized List<JSONObject> m29808A(long j2, long j3) throws JSONException {
        return m29832y("identifys", j2, j3);
    }

    /* renamed from: B */
    synchronized Long m29809B(String str) {
        return (Long) m29814N("long_store", str);
    }

    /* renamed from: D */
    synchronized long m29810D(long j2) {
        return m29797H("events", j2);
    }

    /* renamed from: I */
    synchronized long m29811I(long j2) {
        return m29797H("identifys", j2);
    }

    /* renamed from: J */
    synchronized long m29812J() {
        return m29826m() + m29833z();
    }

    /* renamed from: K */
    synchronized String m29813K(String str) {
        return (String) m29814N(AccountAnalytics.STORE, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00ca: MOVE (r0 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:46:0x00ca */
    /* renamed from: N */
    protected synchronized Object m29814N(String str, String str2) {
        Cursor cursor;
        Object obj;
        Cursor cursor2;
        cursor = null;
        try {
        } catch (Throwable th) {
            th = th;
            cursor = obj;
        }
        try {
            cursor2 = m29823e0(getReadableDatabase(), str, new String[]{RoomNotification.KEY, "value"}, "key = ?", new String[]{str2}, null, null, null, null);
            try {
                if (cursor2.moveToFirst()) {
                    cursor = str.equals(AccountAnalytics.STORE) ? cursor2.getString(1) : Long.valueOf(cursor2.getLong(1));
                }
                cursor2.close();
            } catch (SQLiteException e2) {
                e = e2;
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getValue from %s failed", str), e);
                C9196e.m29884e().m29888g(String.format("DB: Failed to getValue: %s", str2), e);
                m29800e();
                if (cursor2 != null) {
                    cursor2.close();
                }
                close();
                return cursor;
            } catch (RuntimeException e3) {
                e = e3;
                C9196e.m29884e().m29888g(String.format("DB: Failed to getValue: %s", str2), e);
                m29799d(e);
                if (cursor2 != null) {
                    cursor2.close();
                }
                close();
                return cursor;
            } catch (StackOverflowError e4) {
                e = e4;
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getValue from %s failed", str), e);
                C9196e.m29884e().m29888g(String.format("DB: Failed to getValue: %s", str2), e);
                m29800e();
                if (cursor2 != null) {
                    cursor2.close();
                }
                close();
                return cursor;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor2 = null;
        } catch (RuntimeException e6) {
            e = e6;
            cursor2 = null;
        } catch (StackOverflowError e7) {
            e = e7;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            close();
            throw th;
        }
        close();
        return cursor;
    }

    /* renamed from: Q */
    synchronized long m29815Q(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insert(str, null, contentValues);
    }

    /* renamed from: T */
    synchronized long m29816T(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 5);
    }

    /* renamed from: W */
    synchronized long m29817W(String str, Long l) {
        return l == null ? m29824f("long_store", str) : m29821a0("long_store", str, l);
    }

    /* renamed from: Y */
    synchronized long m29818Y(String str, String str2) {
        return str2 == null ? m29824f(AccountAnalytics.STORE, str) : m29821a0(AccountAnalytics.STORE, str, str2);
    }

    /* renamed from: Z */
    synchronized long m29819Z(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) throws SQLiteException, StackOverflowError {
        long m29816T;
        ContentValues contentValues = new ContentValues();
        contentValues.put(RoomNotification.KEY, str2);
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            contentValues.put("value", (String) obj);
        }
        m29816T = m29816T(sQLiteDatabase, str, contentValues);
        if (m29816T == -1) {
            f35618g.m29970g("io.rakam.api.DatabaseHelper", "Insert failed");
        }
        return m29816T;
    }

    /* renamed from: a */
    synchronized long m29820a(String str) {
        return m29798b("events", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r2.isOpen() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r2.isOpen() != false) goto L17;
     */
    /* renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized long m29821a0(java.lang.String r8, java.lang.String r9, java.lang.Object r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 1
            r2 = 0
            android.database.sqlite.SQLiteDatabase r2 = r7.getWritableDatabase()     // Catch: java.lang.Throwable -> L18 java.lang.StackOverflowError -> L1a android.database.sqlite.SQLiteException -> L4c
            long r8 = r7.m29819Z(r2, r8, r9, r10)     // Catch: java.lang.Throwable -> L18 java.lang.StackOverflowError -> L1a android.database.sqlite.SQLiteException -> L4c
            if (r2 == 0) goto L7d
            boolean r10 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L7d
            r7.close()     // Catch: java.lang.Throwable -> L8b
            goto L7d
        L18:
            r8 = move-exception
            goto L7f
        L1a:
            r10 = move-exception
            io.rakam.api.h r3 = io.rakam.api.C9193b.f35618g     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "io.rakam.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r6[r0] = r8     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L18
            r3.m29967c(r4, r8, r10)     // Catch: java.lang.Throwable -> L18
            io.rakam.api.e r8 = io.rakam.api.C9196e.m29884e()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r1[r0] = r9     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> L18
            r8.m29888g(r9, r10)     // Catch: java.lang.Throwable -> L18
            r7.m29800e()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L7b
            boolean r8 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L7b
        L48:
            r7.close()     // Catch: java.lang.Throwable -> L8b
            goto L7b
        L4c:
            r10 = move-exception
            io.rakam.api.h r3 = io.rakam.api.C9193b.f35618g     // Catch: java.lang.Throwable -> L18
            java.lang.String r4 = "io.rakam.api.DatabaseHelper"
            java.lang.String r5 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r6[r0] = r8     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch: java.lang.Throwable -> L18
            r3.m29967c(r4, r8, r10)     // Catch: java.lang.Throwable -> L18
            io.rakam.api.e r8 = io.rakam.api.C9196e.m29884e()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L18
            r1[r0] = r9     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = java.lang.String.format(r3, r1)     // Catch: java.lang.Throwable -> L18
            r8.m29888g(r9, r10)     // Catch: java.lang.Throwable -> L18
            r7.m29800e()     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L7b
            boolean r8 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r8 == 0) goto L7b
            goto L48
        L7b:
            r8 = -1
        L7d:
            monitor-exit(r7)
            return r8
        L7f:
            if (r2 == 0) goto L8a
            boolean r9 = r2.isOpen()     // Catch: java.lang.Throwable -> L8b
            if (r9 == 0) goto L8a
            r7.close()     // Catch: java.lang.Throwable -> L8b
        L8a:
            throw r8     // Catch: java.lang.Throwable -> L8b
        L8b:
            r8 = move-exception
            monitor-exit(r7)
            goto L8f
        L8e:
            throw r8
        L8f:
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: io.rakam.api.C9193b.m29821a0(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    /* renamed from: c */
    synchronized long m29822c(String str) {
        return m29798b("identifys", str);
    }

    /* renamed from: e0 */
    Cursor m29823e0(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    /* renamed from: f */
    synchronized long m29824f(String str, String str2) {
        long j2;
        try {
            try {
                try {
                    j2 = getWritableDatabase().delete(str, "key=?", new String[]{str2});
                } catch (StackOverflowError e2) {
                    f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("deleteKey from %s failed", str), e2);
                    C9196e.m29884e().m29888g(String.format("DB: Failed to deleteKey: %s", str2), e2);
                    m29800e();
                    close();
                    j2 = -1;
                    return j2;
                }
            } catch (SQLiteException e3) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("deleteKey from %s failed", str), e3);
                C9196e.m29884e().m29888g(String.format("DB: Failed to deleteKey: %s", str2), e3);
                m29800e();
                close();
                j2 = -1;
                return j2;
            }
        } finally {
            close();
        }
        return j2;
    }

    /* renamed from: f0 */
    synchronized void m29825f0(long j2) {
        m29801i0("events", j2);
    }

    /* renamed from: m */
    synchronized long m29826m() {
        return m29806p("events");
    }

    /* renamed from: m0 */
    synchronized void m29827m0(long j2) {
        m29805n0("events", j2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        InterfaceC9194c interfaceC9194c = this.f35622k;
        if (interfaceC9194c == null || !this.f35621j) {
            return;
        }
        try {
            try {
                this.f35621j = false;
                interfaceC9194c.mo29834a(sQLiteDatabase);
            } catch (SQLiteException e2) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("databaseReset callback failed during onCreate", new Object[0]), e2);
                C9196e.m29884e().m29888g(String.format("DB: Failed to run databaseReset callback during onCreate", new Object[0]), e2);
            }
        } finally {
            this.f35621j = true;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 > i3) {
            f35618g.m29966b("io.rakam.api.DatabaseHelper", "onUpgrade() with invalid oldVersion and newVersion");
            m29807t0(sQLiteDatabase);
            return;
        }
        if (i3 <= 1) {
            return;
        }
        if (i2 == 1) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
            if (i3 <= 2) {
                return;
            }
        } else if (i2 != 2) {
            if (i2 != 3) {
                f35618g.m29966b("io.rakam.api.DatabaseHelper", "onUpgrade() with unknown oldVersion " + i2);
                m29807t0(sQLiteDatabase);
                return;
            }
            return;
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
    }

    /* renamed from: p0 */
    synchronized void m29828p0(long j2) {
        m29801i0("identifys", j2);
    }

    /* renamed from: q0 */
    synchronized void m29829q0(long j2) {
        m29805n0("identifys", j2);
    }

    /* renamed from: x */
    synchronized List<JSONObject> m29830x(long j2, long j3) throws JSONException {
        return m29832y("events", j2, j3);
    }

    /* renamed from: x0 */
    void m29831x0(InterfaceC9194c interfaceC9194c) {
        this.f35622k = interfaceC9194c;
    }

    /* renamed from: y */
    protected synchronized List<JSONObject> m29832y(String str, long j2, long j3) throws JSONException {
        LinkedList linkedList;
        String str2;
        String str3;
        linkedList = new LinkedList();
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        SQLiteDatabase readableDatabase = getReadableDatabase();
                        String[] strArr = {DeepLinkIntentReceiver.DeepLinksKeys.f7163ID, "event"};
                        if (j2 >= 0) {
                            str2 = "id <= " + j2;
                        } else {
                            str2 = null;
                        }
                        if (j3 >= 0) {
                            str3 = HttpUrl.FRAGMENT_ENCODE_SET + j3;
                        } else {
                            str3 = null;
                        }
                        cursor = m29823e0(readableDatabase, str, strArr, str2, null, null, null, "id ASC", str3);
                        while (cursor.moveToNext()) {
                            long j4 = cursor.getLong(0);
                            String string = cursor.getString(1);
                            if (!C9201j.m29988d(string)) {
                                JSONObject jSONObject = new JSONObject(string);
                                jSONObject.put("event_id", j4);
                                linkedList.add(jSONObject);
                            }
                        }
                        cursor.close();
                    } catch (SQLiteException e2) {
                        f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getEvents from %s failed", str), e2);
                        C9196e.m29884e().m29888g(String.format("DB: Failed to getEventsFromTable %s", str), e2);
                        m29800e();
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                } catch (RuntimeException e3) {
                    C9196e.m29884e().m29888g(String.format("DB: Failed to getEventsFromTable %s", str), e3);
                    m29799d(e3);
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            } catch (StackOverflowError e4) {
                f35618g.m29967c("io.rakam.api.DatabaseHelper", String.format("getEvents from %s failed", str), e4);
                C9196e.m29884e().m29888g(String.format("DB: Failed to getEventsFromTable %s", str), e4);
                m29800e();
                if (cursor != null) {
                    cursor.close();
                }
            }
            close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            close();
            throw th;
        }
        return linkedList;
    }

    /* renamed from: z */
    synchronized long m29833z() {
        return m29806p("identifys");
    }
}
