package p241e.p254e.p256b.p257a.p258i.p260b0.p261j;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6263a;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.EnumC8754d;
import p241e.p254e.p256b.p257a.p258i.AbstractC8834j;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;
import p241e.p254e.p256b.p257a.p258i.C8833i;
import p241e.p254e.p256b.p257a.p258i.p262c0.InterfaceC8821a;
import p241e.p254e.p256b.p257a.p258i.p263d0.C8828a;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8852a;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8853b;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8854c;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8855d;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8856e;
import p241e.p254e.p256b.p257a.p258i.p266y.p267a.C8857f;
import p241e.p254e.p256b.p257a.p258i.p268z.C8858a;

/* compiled from: SQLiteEventStore.java */
@Singleton
/* renamed from: e.e.b.a.i.b0.j.r0 */
/* loaded from: classes2.dex */
public class C8808r0 implements InterfaceC8792j0, InterfaceC6263a, InterfaceC8790i0 {

    /* renamed from: f */
    private static final C8752b f33518f = C8752b.m27945b("proto");

    /* renamed from: g */
    private final C8812t0 f33519g;

    /* renamed from: h */
    private final InterfaceC8821a f33520h;

    /* renamed from: i */
    private final InterfaceC8821a f33521i;

    /* renamed from: j */
    private final AbstractC8794k0 f33522j;

    /* renamed from: k */
    private final Provider<String> f33523k;

    /* compiled from: SQLiteEventStore.java */
    /* renamed from: e.e.b.a.i.b0.j.r0$b */
    interface b<T, U> {
        /* renamed from: a */
        U mo27974a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: e.e.b.a.i.b0.j.r0$c */
    static class c {

        /* renamed from: a */
        final String f33524a;

        /* renamed from: b */
        final String f33525b;

        private c(String str, String str2) {
            this.f33524a = str;
            this.f33525b = str2;
        }
    }

    /* compiled from: SQLiteEventStore.java */
    /* renamed from: e.e.b.a.i.b0.j.r0$d */
    interface d<T> {
        /* renamed from: a */
        T mo27976a();
    }

    @Inject
    C8808r0(InterfaceC8821a interfaceC8821a, InterfaceC8821a interfaceC8821a2, AbstractC8794k0 abstractC8794k0, C8812t0 c8812t0, @Named("PACKAGE_NAME") Provider<String> provider) {
        this.f33519g = c8812t0;
        this.f33520h = interfaceC8821a;
        this.f33521i = interfaceC8821a2;
        this.f33522j = abstractC8794k0;
        this.f33523k = provider;
    }

    /* renamed from: B */
    private boolean m28024B() {
        return m28058p() * m28064x() >= this.f33522j.mo27981f();
    }

    /* renamed from: D */
    private List<AbstractC8806q0> m28025D(List<AbstractC8806q0> list, Map<Long, Set<c>> map) {
        ListIterator<AbstractC8806q0> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC8806q0 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo27989c()))) {
                AbstractC8834j.a m28155l = next.mo27988b().m28155l();
                for (c cVar : map.get(Long.valueOf(next.mo27989c()))) {
                    m28155l.m28158c(cVar.f33524a, cVar.f33525b);
                }
                listIterator.set(AbstractC8806q0.m28023a(next.mo27989c(), next.mo27990d(), m28155l.mo28102d()));
            }
        }
        return list;
    }

    /* renamed from: E0 */
    private /* synthetic */ Object m28026E0(List list, AbstractC8841q abstractC8841q, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j2 = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            AbstractC8834j.a mo28109k = AbstractC8834j.m28150a().mo28108j(cursor.getString(1)).mo28107i(cursor.getLong(2)).mo28109k(cursor.getLong(3));
            if (z) {
                mo28109k.mo28106h(new C8833i(m28061r1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                mo28109k.mo28106h(new C8833i(m28061r1(cursor.getString(4)), m28057n1(j2)));
            }
            if (!cursor.isNull(6)) {
                mo28109k.mo28105g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC8806q0.m28023a(j2, abstractC8841q, mo28109k.mo28102d()));
        }
        return null;
    }

    /* renamed from: G0 */
    static /* synthetic */ Object m28027G0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j2 = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j2));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j2), set);
            }
            set.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    /* renamed from: H */
    private /* synthetic */ Object m28028H(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo27993d(cursor.getInt(0), C8854c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Integer m28071K(long j2, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j2)};
        m28063t1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: e.e.b.a.i.b0.j.j
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                C8808r0.this.m28070I((Cursor) obj);
                return null;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Long m28072K0(AbstractC8834j abstractC8834j, AbstractC8841q abstractC8841q, SQLiteDatabase sQLiteDatabase) {
        if (m28024B()) {
            mo27993d(1L, C8854c.b.CACHE_FULL, abstractC8834j.mo28100j());
            return -1L;
        }
        long m28051j = m28051j(sQLiteDatabase, abstractC8841q);
        int mo27980e = this.f33522j.mo27980e();
        byte[] m28148a = abstractC8834j.mo28098e().m28148a();
        boolean z = m28148a.length <= mo27980e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m28051j));
        contentValues.put("transport_name", abstractC8834j.mo28100j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC8834j.mo28099f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC8834j.mo28101k()));
        contentValues.put("payload_encoding", abstractC8834j.mo28098e().m28149b().m27946a());
        contentValues.put("code", abstractC8834j.mo28097d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? m28148a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            double length = m28148a.length;
            double d2 = mo27980e;
            Double.isNaN(length);
            Double.isNaN(d2);
            int ceil = (int) Math.ceil(length / d2);
            for (int i2 = 1; i2 <= ceil; i2++) {
                byte[] copyOfRange = Arrays.copyOfRange(m28148a, (i2 - 1) * mo27980e, Math.min(i2 * mo27980e, m28148a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i2));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC8834j.m28154i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* renamed from: M0 */
    static /* synthetic */ byte[] m28031M0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i2 += blob.length;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        return bArr;
    }

    /* renamed from: N */
    static /* synthetic */ Object m28032N(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    /* renamed from: N0 */
    private /* synthetic */ Object m28033N0(Cursor cursor) {
        while (cursor.moveToNext()) {
            mo27993d(cursor.getInt(0), C8854c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* renamed from: Q */
    static /* synthetic */ Object m28034Q(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: R0 */
    private /* synthetic */ Object m28035R0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m28063t1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: e.e.b.a.i.b0.j.v
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                C8808r0.this.m28073Q0((Cursor) obj);
                return null;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: T */
    static /* synthetic */ SQLiteDatabase m28036T(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* renamed from: W */
    static /* synthetic */ Long m28038W(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: X0 */
    static /* synthetic */ Object m28039X0(String str, C8854c.b bVar, long j2, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) m28063t1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo26129f())}), new b() { // from class: e.e.b.a.i.b0.j.y
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r0.getCount() > 0);
                return valueOf;
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j2 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.mo26129f())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.mo26129f()));
            contentValues.put("events_dropped_count", Long.valueOf(j2));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    /* renamed from: Y */
    static /* synthetic */ C8857f m28040Y(long j2, Cursor cursor) {
        cursor.moveToNext();
        return C8857f.m28223c().m28228c(cursor.getLong(0)).m28227b(j2).m28226a();
    }

    /* renamed from: Z */
    static /* synthetic */ C8857f m28041Z(final long j2, SQLiteDatabase sQLiteDatabase) {
        return (C8857f) m28063t1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: e.e.b.a.i.b0.j.c
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.m28040Y(j2, (Cursor) obj);
            }
        });
    }

    /* renamed from: Z0 */
    static /* synthetic */ Object m28042Z0(long j2, AbstractC8841q abstractC8841q, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j2));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC8841q.mo28134b(), String.valueOf(C8828a.m28132a(abstractC8841q.mo28136d()))}) < 1) {
            contentValues.put("backend_name", abstractC8841q.mo28134b());
            contentValues.put("priority", Integer.valueOf(C8828a.m28132a(abstractC8841q.mo28136d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* renamed from: a0 */
    static /* synthetic */ Long m28043a0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* renamed from: a1 */
    private /* synthetic */ Object m28044a1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f33520h.mo28110a()).execute();
        return null;
    }

    /* renamed from: e */
    private C8854c.b m28045e(int i2) {
        C8854c.b bVar = C8854c.b.REASON_UNKNOWN;
        if (i2 == bVar.mo26129f()) {
            return bVar;
        }
        C8854c.b bVar2 = C8854c.b.MESSAGE_TOO_OLD;
        if (i2 == bVar2.mo26129f()) {
            return bVar2;
        }
        C8854c.b bVar3 = C8854c.b.CACHE_FULL;
        if (i2 == bVar3.mo26129f()) {
            return bVar3;
        }
        C8854c.b bVar4 = C8854c.b.PAYLOAD_TOO_BIG;
        if (i2 == bVar4.mo26129f()) {
            return bVar4;
        }
        C8854c.b bVar5 = C8854c.b.MAX_RETRIES_REACHED;
        if (i2 == bVar5.mo26129f()) {
            return bVar5;
        }
        C8854c.b bVar6 = C8854c.b.INVALID_PAYLOD;
        if (i2 == bVar6.mo26129f()) {
            return bVar6;
        }
        C8854c.b bVar7 = C8854c.b.SERVER_ERROR;
        if (i2 == bVar7.mo26129f()) {
            return bVar7;
        }
        C8858a.m28230b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i2));
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Boolean m28076f0(AbstractC8841q abstractC8841q, SQLiteDatabase sQLiteDatabase) {
        Long m28067z = m28067z(sQLiteDatabase, abstractC8841q);
        return m28067z == null ? Boolean.FALSE : (Boolean) m28063t1(m28078l().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m28067z.toString()}), new b() { // from class: e.e.b.a.i.b0.j.e0
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* renamed from: f */
    private void m28047f(final SQLiteDatabase sQLiteDatabase) {
        m28060q1(new d() { // from class: e.e.b.a.i.b0.j.e
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.d
            /* renamed from: a */
            public final Object mo27976a() {
                C8808r0.m28032N(sQLiteDatabase);
                return null;
            }
        }, new b() { // from class: e.e.b.a.i.b0.j.b
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                C8808r0.m28034Q((Throwable) obj);
                throw null;
            }
        });
    }

    /* renamed from: f1 */
    private List<AbstractC8806q0> m28048f1(SQLiteDatabase sQLiteDatabase, final AbstractC8841q abstractC8841q, int i2) {
        final ArrayList arrayList = new ArrayList();
        Long m28067z = m28067z(sQLiteDatabase, abstractC8841q);
        if (m28067z == null) {
            return arrayList;
        }
        m28063t1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m28067z.toString()}, null, null, null, String.valueOf(i2)), new b() { // from class: e.e.b.a.i.b0.j.o
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                C8808r0.this.m28069F0(arrayList, abstractC8841q, (Cursor) obj);
                return null;
            }
        });
        return arrayList;
    }

    /* renamed from: h1 */
    private Map<Long, Set<c>> m28049h1(SQLiteDatabase sQLiteDatabase, List<AbstractC8806q0> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(list.get(i2).mo27989c());
            if (i2 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        m28063t1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: e.e.b.a.i.b0.j.t
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                C8808r0.m28027G0(hashMap, (Cursor) obj);
                return null;
            }
        });
        return hashMap;
    }

    /* renamed from: i0 */
    static /* synthetic */ List m28050i0(SQLiteDatabase sQLiteDatabase) {
        return (List) m28063t1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: e.e.b.a.i.b0.j.h
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.m28055m0((Cursor) obj);
            }
        });
    }

    /* renamed from: j */
    private long m28051j(SQLiteDatabase sQLiteDatabase, AbstractC8841q abstractC8841q) {
        Long m28067z = m28067z(sQLiteDatabase, abstractC8841q);
        if (m28067z != null) {
            return m28067z.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC8841q.mo28134b());
        contentValues.put("priority", Integer.valueOf(C8828a.m28132a(abstractC8841q.mo28136d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC8841q.mo28135c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC8841q.mo28135c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: k1 */
    private static byte[] m28052k1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: l1 */
    private void m28053l1(C8852a.a aVar, Map<String, List<C8854c>> map) {
        for (Map.Entry<String, List<C8854c>> entry : map.entrySet()) {
            aVar.m28196a(C8855d.m28211c().m28216c(entry.getKey()).m28215b(entry.getValue()).m28214a());
        }
    }

    /* renamed from: m */
    private C8853b m28054m() {
        return C8853b.m28201b().m28204b(C8856e.m28217c().m28221b(m28077k()).m28222c(AbstractC8794k0.f33499a.mo27981f()).m28220a()).m28203a();
    }

    /* renamed from: m0 */
    static /* synthetic */ List m28055m0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC8841q.m28169a().mo28138b(cursor.getString(1)).mo28140d(C8828a.m28133b(cursor.getInt(2))).mo28139c(m28052k1(cursor.getString(3))).mo28137a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ List m28079p0(AbstractC8841q abstractC8841q, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC8806q0> m28048f1 = m28048f1(sQLiteDatabase, abstractC8841q, this.f33522j.mo27979d());
        for (EnumC8754d enumC8754d : EnumC8754d.values()) {
            if (enumC8754d != abstractC8841q.mo28136d()) {
                int mo27979d = this.f33522j.mo27979d() - m28048f1.size();
                if (mo27979d <= 0) {
                    break;
                }
                m28048f1.addAll(m28048f1(sQLiteDatabase, abstractC8841q.m28171f(enumC8754d), mo27979d));
            }
        }
        return m28025D(m28048f1, m28049h1(sQLiteDatabase, m28048f1));
    }

    /* renamed from: n1 */
    private byte[] m28057n1(long j2) {
        return (byte[]) m28063t1(m28078l().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num"), new b() { // from class: e.e.b.a.i.b0.j.g
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.m28031M0((Cursor) obj);
            }
        });
    }

    /* renamed from: p */
    private long m28058p() {
        return m28078l().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C8852a m28080t0(Map map, C8852a.a aVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C8854c.b m28045e = m28045e(cursor.getInt(1));
            long j2 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C8854c.m28205c().m28210c(m28045e).m28209b(j2).m28208a());
        }
        m28053l1(aVar, map);
        aVar.m28200e(m28066y());
        aVar.m28199d(m28054m());
        aVar.m28198c(this.f33523k.get());
        return aVar.m28197b();
    }

    /* renamed from: q1 */
    private <T> T m28060q1(d<T> dVar, b<Throwable, T> bVar) {
        long mo28110a = this.f33521i.mo28110a();
        while (true) {
            try {
                return dVar.mo27976a();
            } catch (SQLiteDatabaseLockedException e2) {
                if (this.f33521i.mo28110a() >= this.f33522j.mo27977b() + mo28110a) {
                    return bVar.mo27974a(e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: r1 */
    private static C8752b m28061r1(String str) {
        return str == null ? f33518f : C8752b.m27945b(str);
    }

    /* renamed from: s1 */
    private static String m28062s1(Iterable<AbstractC8806q0> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC8806q0> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo27989c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: t1 */
    static <T> T m28063t1(Cursor cursor, b<Cursor, T> bVar) {
        try {
            return bVar.mo27974a(cursor);
        } finally {
            cursor.close();
        }
    }

    /* renamed from: x */
    private long m28064x() {
        return m28078l().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C8852a m28081y0(String str, final Map map, final C8852a.a aVar, SQLiteDatabase sQLiteDatabase) {
        return (C8852a) m28063t1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: e.e.b.a.i.b0.j.u
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.this.m28080t0(map, aVar, (Cursor) obj);
            }
        });
    }

    /* renamed from: y */
    private C8857f m28066y() {
        final long mo28110a = this.f33520h.mo28110a();
        return (C8857f) m28068A(new b() { // from class: e.e.b.a.i.b0.j.l
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.m28041Z(mo28110a, (SQLiteDatabase) obj);
            }
        });
    }

    /* renamed from: z */
    private Long m28067z(SQLiteDatabase sQLiteDatabase, AbstractC8841q abstractC8841q) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC8841q.mo28134b(), String.valueOf(C8828a.m28132a(abstractC8841q.mo28136d()))));
        if (abstractC8841q.mo28135c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC8841q.mo28135c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m28063t1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: e.e.b.a.i.b0.j.q
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.m28043a0((Cursor) obj);
            }
        });
    }

    /* renamed from: A */
    <T> T m28068A(b<SQLiteDatabase, T> bVar) {
        SQLiteDatabase m28078l = m28078l();
        m28078l.beginTransaction();
        try {
            T mo27974a = bVar.mo27974a(m28078l);
            m28078l.setTransactionSuccessful();
            return mo27974a;
        } finally {
            m28078l.endTransaction();
        }
    }

    /* renamed from: F0 */
    public /* synthetic */ Object m28069F0(List list, AbstractC8841q abstractC8841q, Cursor cursor) {
        m28026E0(list, abstractC8841q, cursor);
        return null;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0
    /* renamed from: G */
    public Iterable<AbstractC8806q0> mo27994G(final AbstractC8841q abstractC8841q) {
        return (Iterable) m28068A(new b() { // from class: e.e.b.a.i.b0.j.d
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.this.m28079p0(abstractC8841q, (SQLiteDatabase) obj);
            }
        });
    }

    /* renamed from: I */
    public /* synthetic */ Object m28070I(Cursor cursor) {
        m28028H(cursor);
        return null;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0
    /* renamed from: O */
    public void mo27995O(final AbstractC8841q abstractC8841q, final long j2) {
        m28068A(new b() { // from class: e.e.b.a.i.b0.j.f
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                C8808r0.m28042Z0(j2, abstractC8841q, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* renamed from: Q0 */
    public /* synthetic */ Object m28073Q0(Cursor cursor) {
        m28033N0(cursor);
        return null;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0
    /* renamed from: S0 */
    public AbstractC8806q0 mo27996S0(final AbstractC8841q abstractC8841q, final AbstractC8834j abstractC8834j) {
        C8858a.m28231c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC8841q.mo28136d(), abstractC8834j.mo28100j(), abstractC8841q.mo28134b());
        long longValue = ((Long) m28068A(new b() { // from class: e.e.b.a.i.b0.j.s
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.this.m28072K0(abstractC8834j, abstractC8841q, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC8806q0.m28023a(longValue, abstractC8841q, abstractC8834j);
    }

    /* renamed from: T0 */
    public /* synthetic */ Object m28074T0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        m28035R0(str, str2, sQLiteDatabase);
        return null;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0
    /* renamed from: U */
    public Iterable<AbstractC8841q> mo27997U() {
        return (Iterable) m28068A(new b() { // from class: e.e.b.a.i.b0.j.x
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.m28050i0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0
    /* renamed from: W0 */
    public long mo27998W0(AbstractC8841q abstractC8841q) {
        return ((Long) m28063t1(m28078l().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC8841q.mo28134b(), String.valueOf(C8828a.m28132a(abstractC8841q.mo28136d()))}), new b() { // from class: e.e.b.a.i.b0.j.m
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.m28038W((Cursor) obj);
            }
        })).longValue();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8790i0
    /* renamed from: a */
    public void mo27991a() {
        m28068A(new b() { // from class: e.e.b.a.i.b0.j.p
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                C8808r0.this.m28075c1((SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6263a
    /* renamed from: b */
    public <T> T mo13599b(InterfaceC6263a.a<T> aVar) {
        SQLiteDatabase m28078l = m28078l();
        m28047f(m28078l);
        try {
            T execute = aVar.execute();
            m28078l.setTransactionSuccessful();
            return execute;
        } finally {
            m28078l.endTransaction();
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0
    /* renamed from: b1 */
    public boolean mo27999b1(final AbstractC8841q abstractC8841q) {
        return ((Boolean) m28068A(new b() { // from class: e.e.b.a.i.b0.j.k
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.this.m28076f0(abstractC8841q, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8790i0
    /* renamed from: c */
    public C8852a mo27992c() {
        final C8852a.a m28190e = C8852a.m28190e();
        final HashMap hashMap = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (C8852a) m28068A(new b() { // from class: e.e.b.a.i.b0.j.n
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.this.m28081y0(str, hashMap, m28190e, (SQLiteDatabase) obj);
            }
        });
    }

    /* renamed from: c1 */
    public /* synthetic */ Object m28075c1(SQLiteDatabase sQLiteDatabase) {
        m28044a1(sQLiteDatabase);
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f33519g.close();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8790i0
    /* renamed from: d */
    public void mo27993d(final long j2, final C8854c.b bVar, final String str) {
        m28068A(new b() { // from class: e.e.b.a.i.b0.j.i
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                C8808r0.m28039X0(str, bVar, j2, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0
    /* renamed from: e1 */
    public void mo28000e1(Iterable<AbstractC8806q0> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m28062s1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            m28068A(new b() { // from class: e.e.b.a.i.b0.j.r
                @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
                /* renamed from: a */
                public final Object mo27974a(Object obj) {
                    C8808r0.this.m28074T0(str, str2, (SQLiteDatabase) obj);
                    return null;
                }
            });
        }
    }

    /* renamed from: k */
    long m28077k() {
        return m28058p() * m28064x();
    }

    /* renamed from: l */
    SQLiteDatabase m28078l() {
        final C8812t0 c8812t0 = this.f33519g;
        c8812t0.getClass();
        return (SQLiteDatabase) m28060q1(new d() { // from class: e.e.b.a.i.b0.j.f0
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.d
            /* renamed from: a */
            public final Object mo27976a() {
                return C8812t0.this.getWritableDatabase();
            }
        }, new b() { // from class: e.e.b.a.i.b0.j.a
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                C8808r0.m28036T((Throwable) obj);
                throw null;
            }
        });
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0
    /* renamed from: o */
    public int mo28001o() {
        final long mo28110a = this.f33520h.mo28110a() - this.f33522j.mo27978c();
        return ((Integer) m28068A(new b() { // from class: e.e.b.a.i.b0.j.w
            @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0.b
            /* renamed from: a */
            public final Object mo27974a(Object obj) {
                return C8808r0.this.m28071K(mo28110a, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0
    /* renamed from: q */
    public void mo28002q(Iterable<AbstractC8806q0> iterable) {
        if (iterable.iterator().hasNext()) {
            m28078l().compileStatement("DELETE FROM events WHERE _id in " + m28062s1(iterable)).execute();
        }
    }
}
