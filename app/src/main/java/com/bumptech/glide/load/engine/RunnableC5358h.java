package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C5318e;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C5392h;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.EnumC5334c;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.InterfaceC5395k;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.load.engine.C5359i;
import com.bumptech.glide.load.engine.InterfaceC5356f;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5339a;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p127m.InterfaceC5401e;
import com.bumptech.glide.load.p131o.p132c.C5458l;
import com.bumptech.glide.p145r.C5559f;
import com.bumptech.glide.p145r.p146l.AbstractC5567c;
import com.bumptech.glide.p145r.p146l.C5565a;
import com.bumptech.glide.p145r.p146l.C5566b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: DecodeJob.java */
/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes.dex */
class RunnableC5358h<R> implements InterfaceC5356f.a, Runnable, Comparable<RunnableC5358h<?>>, C5565a.f {

    /* renamed from: A */
    private Object f13336A;

    /* renamed from: B */
    private Thread f13337B;

    /* renamed from: C */
    private InterfaceC5390f f13338C;

    /* renamed from: D */
    private InterfaceC5390f f13339D;

    /* renamed from: E */
    private Object f13340E;

    /* renamed from: F */
    private EnumC5332a f13341F;

    /* renamed from: G */
    private InterfaceC5400d<?> f13342G;

    /* renamed from: H */
    private volatile InterfaceC5356f f13343H;

    /* renamed from: I */
    private volatile boolean f13344I;

    /* renamed from: J */
    private volatile boolean f13345J;

    /* renamed from: i */
    private final e f13349i;

    /* renamed from: j */
    private final InterfaceC0956f<RunnableC5358h<?>> f13350j;

    /* renamed from: m */
    private C5318e f13353m;

    /* renamed from: n */
    private InterfaceC5390f f13354n;

    /* renamed from: o */
    private EnumC5320g f13355o;

    /* renamed from: p */
    private C5364n f13356p;

    /* renamed from: q */
    private int f13357q;

    /* renamed from: r */
    private int f13358r;

    /* renamed from: s */
    private AbstractC5360j f13359s;

    /* renamed from: t */
    private C5393i f13360t;

    /* renamed from: u */
    private b<R> f13361u;

    /* renamed from: v */
    private int f13362v;

    /* renamed from: w */
    private h f13363w;

    /* renamed from: x */
    private g f13364x;

    /* renamed from: y */
    private long f13365y;

    /* renamed from: z */
    private boolean f13366z;

    /* renamed from: f */
    private final C5357g<R> f13346f = new C5357g<>();

    /* renamed from: g */
    private final List<Throwable> f13347g = new ArrayList();

    /* renamed from: h */
    private final AbstractC5567c f13348h = AbstractC5567c.m11078a();

    /* renamed from: k */
    private final d<?> f13351k = new d<>();

    /* renamed from: l */
    private final f f13352l = new f();

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13367a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13368b;

        /* renamed from: c */
        static final /* synthetic */ int[] f13369c;

        static {
            int[] iArr = new int[EnumC5334c.values().length];
            f13369c = iArr;
            try {
                iArr[EnumC5334c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13369c[EnumC5334c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f13368b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13368b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13368b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13368b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13368b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f13367a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13367a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13367a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$b */
    interface b<R> {
        /* renamed from: a */
        void mo10281a(GlideException glideException);

        /* renamed from: b */
        void mo10282b(InterfaceC5371u<R> interfaceC5371u, EnumC5332a enumC5332a);

        /* renamed from: c */
        void mo10283c(RunnableC5358h<?> runnableC5358h);
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$c */
    private final class c<Z> implements C5359i.a<Z> {

        /* renamed from: a */
        private final EnumC5332a f13370a;

        c(EnumC5332a enumC5332a) {
            this.f13370a = enumC5332a;
        }

        @Override // com.bumptech.glide.load.engine.C5359i.a
        /* renamed from: a */
        public InterfaceC5371u<Z> mo10284a(InterfaceC5371u<Z> interfaceC5371u) {
            return RunnableC5358h.this.m10276Q(this.f13370a, interfaceC5371u);
        }
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$d */
    private static class d<Z> {

        /* renamed from: a */
        private InterfaceC5390f f13372a;

        /* renamed from: b */
        private InterfaceC5395k<Z> f13373b;

        /* renamed from: c */
        private C5370t<Z> f13374c;

        d() {
        }

        /* renamed from: a */
        void m10285a() {
            this.f13372a = null;
            this.f13373b = null;
            this.f13374c = null;
        }

        /* renamed from: b */
        void m10286b(e eVar, C5393i c5393i) {
            C5566b.m11074a("DecodeJob.encode");
            try {
                eVar.mo10289a().mo10179a(this.f13372a, new C5355e(this.f13373b, this.f13374c, c5393i));
            } finally {
                this.f13374c.m10356g();
                C5566b.m11077d();
            }
        }

        /* renamed from: c */
        boolean m10287c() {
            return this.f13374c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        <X> void m10288d(InterfaceC5390f interfaceC5390f, InterfaceC5395k<X> interfaceC5395k, C5370t<X> c5370t) {
            this.f13372a = interfaceC5390f;
            this.f13373b = interfaceC5395k;
            this.f13374c = c5370t;
        }
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$e */
    interface e {
        /* renamed from: a */
        InterfaceC5339a mo10289a();
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$f */
    private static class f {

        /* renamed from: a */
        private boolean f13375a;

        /* renamed from: b */
        private boolean f13376b;

        /* renamed from: c */
        private boolean f13377c;

        f() {
        }

        /* renamed from: a */
        private boolean m10290a(boolean z) {
            return (this.f13377c || z || this.f13376b) && this.f13375a;
        }

        /* renamed from: b */
        synchronized boolean m10291b() {
            this.f13376b = true;
            return m10290a(false);
        }

        /* renamed from: c */
        synchronized boolean m10292c() {
            this.f13377c = true;
            return m10290a(false);
        }

        /* renamed from: d */
        synchronized boolean m10293d(boolean z) {
            this.f13375a = true;
            return m10290a(z);
        }

        /* renamed from: e */
        synchronized void m10294e() {
            this.f13376b = false;
            this.f13375a = false;
            this.f13377c = false;
        }
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$g */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$h */
    private enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    RunnableC5358h(e eVar, InterfaceC0956f<RunnableC5358h<?>> interfaceC0956f) {
        this.f13349i = eVar;
        this.f13350j = interfaceC0956f;
    }

    /* renamed from: A */
    private <Data> InterfaceC5371u<R> m10256A(Data data, EnumC5332a enumC5332a) throws GlideException {
        return m10271U(data, enumC5332a, this.f13346f.m10239h(data.getClass()));
    }

    /* renamed from: D */
    private void m10257D() {
        if (Log.isLoggable("DecodeJob", 2)) {
            m10263K("Retrieved data", this.f13365y, "data: " + this.f13340E + ", cache key: " + this.f13338C + ", fetcher: " + this.f13342G);
        }
        InterfaceC5371u<R> interfaceC5371u = null;
        try {
            interfaceC5371u = m10274y(this.f13342G, this.f13340E, this.f13341F);
        } catch (GlideException e2) {
            e2.m10167i(this.f13339D, this.f13341F);
            this.f13347g.add(e2);
        }
        if (interfaceC5371u != null) {
            m10265M(interfaceC5371u, this.f13341F);
        } else {
            m10270T();
        }
    }

    /* renamed from: E */
    private InterfaceC5356f m10258E() {
        int i2 = a.f13368b[this.f13363w.ordinal()];
        if (i2 == 1) {
            return new C5372v(this.f13346f, this);
        }
        if (i2 == 2) {
            return new C5352c(this.f13346f, this);
        }
        if (i2 == 3) {
            return new C5375y(this.f13346f, this);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f13363w);
    }

    /* renamed from: F */
    private h m10259F(h hVar) {
        int i2 = a.f13368b[hVar.ordinal()];
        if (i2 == 1) {
            return this.f13359s.mo10298a() ? h.DATA_CACHE : m10259F(h.DATA_CACHE);
        }
        if (i2 == 2) {
            return this.f13366z ? h.FINISHED : h.SOURCE;
        }
        if (i2 == 3 || i2 == 4) {
            return h.FINISHED;
        }
        if (i2 == 5) {
            return this.f13359s.mo10299b() ? h.RESOURCE_CACHE : m10259F(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    /* renamed from: G */
    private C5393i m10260G(EnumC5332a enumC5332a) {
        C5393i c5393i = this.f13360t;
        if (Build.VERSION.SDK_INT < 26) {
            return c5393i;
        }
        boolean z = enumC5332a == EnumC5332a.RESOURCE_DISK_CACHE || this.f13346f.m10254w();
        C5392h<Boolean> c5392h = C5458l.f13741d;
        Boolean bool = (Boolean) c5393i.m10449a(c5392h);
        if (bool != null && (!bool.booleanValue() || z)) {
            return c5393i;
        }
        C5393i c5393i2 = new C5393i();
        c5393i2.m10450b(this.f13360t);
        c5393i2.m10451c(c5392h, Boolean.valueOf(z));
        return c5393i2;
    }

    /* renamed from: H */
    private int m10261H() {
        return this.f13355o.ordinal();
    }

    /* renamed from: J */
    private void m10262J(String str, long j2) {
        m10263K(str, j2, null);
    }

    /* renamed from: K */
    private void m10263K(String str, long j2, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C5559f.m11027a(j2));
        sb.append(", load key: ");
        sb.append(this.f13356p);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: L */
    private void m10264L(InterfaceC5371u<R> interfaceC5371u, EnumC5332a enumC5332a) {
        m10273W();
        this.f13361u.mo10282b(interfaceC5371u, enumC5332a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    private void m10265M(InterfaceC5371u<R> interfaceC5371u, EnumC5332a enumC5332a) {
        if (interfaceC5371u instanceof InterfaceC5367q) {
            ((InterfaceC5367q) interfaceC5371u).mo10346a();
        }
        C5370t c5370t = 0;
        if (this.f13351k.m10287c()) {
            interfaceC5371u = C5370t.m10354b(interfaceC5371u);
            c5370t = interfaceC5371u;
        }
        m10264L(interfaceC5371u, enumC5332a);
        this.f13363w = h.ENCODE;
        try {
            if (this.f13351k.m10287c()) {
                this.f13351k.m10286b(this.f13349i, this.f13360t);
            }
            m10267O();
        } finally {
            if (c5370t != 0) {
                c5370t.m10356g();
            }
        }
    }

    /* renamed from: N */
    private void m10266N() {
        m10273W();
        this.f13361u.mo10281a(new GlideException("Failed to load resource", new ArrayList(this.f13347g)));
        m10268P();
    }

    /* renamed from: O */
    private void m10267O() {
        if (this.f13352l.m10291b()) {
            m10269S();
        }
    }

    /* renamed from: P */
    private void m10268P() {
        if (this.f13352l.m10292c()) {
            m10269S();
        }
    }

    /* renamed from: S */
    private void m10269S() {
        this.f13352l.m10294e();
        this.f13351k.m10285a();
        this.f13346f.m10232a();
        this.f13344I = false;
        this.f13353m = null;
        this.f13354n = null;
        this.f13360t = null;
        this.f13355o = null;
        this.f13356p = null;
        this.f13361u = null;
        this.f13363w = null;
        this.f13343H = null;
        this.f13337B = null;
        this.f13338C = null;
        this.f13340E = null;
        this.f13341F = null;
        this.f13342G = null;
        this.f13365y = 0L;
        this.f13345J = false;
        this.f13336A = null;
        this.f13347g.clear();
        this.f13350j.mo6060a(this);
    }

    /* renamed from: T */
    private void m10270T() {
        this.f13337B = Thread.currentThread();
        this.f13365y = C5559f.m11028b();
        boolean z = false;
        while (!this.f13345J && this.f13343H != null && !(z = this.f13343H.mo10226a())) {
            this.f13363w = m10259F(this.f13363w);
            this.f13343H = m10258E();
            if (this.f13363w == h.SOURCE) {
                mo10230k();
                return;
            }
        }
        if ((this.f13363w == h.FINISHED || this.f13345J) && !z) {
            m10266N();
        }
    }

    /* renamed from: U */
    private <Data, ResourceType> InterfaceC5371u<R> m10271U(Data data, EnumC5332a enumC5332a, C5369s<Data, ResourceType, R> c5369s) throws GlideException {
        C5393i m10260G = m10260G(enumC5332a);
        InterfaceC5401e<Data> m9962l = this.f13353m.m10004h().m9962l(data);
        try {
            return c5369s.m10352a(m9962l, m10260G, this.f13357q, this.f13358r, new c(enumC5332a));
        } finally {
            m9962l.mo10469b();
        }
    }

    /* renamed from: V */
    private void m10272V() {
        int i2 = a.f13367a[this.f13364x.ordinal()];
        if (i2 == 1) {
            this.f13363w = m10259F(h.INITIALIZE);
            this.f13343H = m10258E();
            m10270T();
        } else if (i2 == 2) {
            m10270T();
        } else {
            if (i2 == 3) {
                m10257D();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f13364x);
        }
    }

    /* renamed from: W */
    private void m10273W() {
        Throwable th;
        this.f13348h.mo11080c();
        if (!this.f13344I) {
            this.f13344I = true;
            return;
        }
        if (this.f13347g.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f13347g;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: y */
    private <Data> InterfaceC5371u<R> m10274y(InterfaceC5400d<?> interfaceC5400d, Data data, EnumC5332a enumC5332a) throws GlideException {
        if (data == null) {
            return null;
        }
        try {
            long m11028b = C5559f.m11028b();
            InterfaceC5371u<R> m10256A = m10256A(data, enumC5332a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m10262J("Decoded result " + m10256A, m11028b);
            }
            return m10256A;
        } finally {
            interfaceC5400d.mo10460b();
        }
    }

    /* renamed from: I */
    RunnableC5358h<R> m10275I(C5318e c5318e, Object obj, C5364n c5364n, InterfaceC5390f interfaceC5390f, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC5320g enumC5320g, AbstractC5360j abstractC5360j, Map<Class<?>, InterfaceC5396l<?>> map, boolean z, boolean z2, boolean z3, C5393i c5393i, b<R> bVar, int i4) {
        this.f13346f.m10252u(c5318e, obj, interfaceC5390f, i2, i3, abstractC5360j, cls, cls2, enumC5320g, c5393i, map, z, z2, this.f13349i);
        this.f13353m = c5318e;
        this.f13354n = interfaceC5390f;
        this.f13355o = enumC5320g;
        this.f13356p = c5364n;
        this.f13357q = i2;
        this.f13358r = i3;
        this.f13359s = abstractC5360j;
        this.f13366z = z3;
        this.f13360t = c5393i;
        this.f13361u = bVar;
        this.f13362v = i4;
        this.f13364x = g.INITIALIZE;
        this.f13336A = obj;
        return this;
    }

    /* renamed from: Q */
    <Z> InterfaceC5371u<Z> m10276Q(EnumC5332a enumC5332a, InterfaceC5371u<Z> interfaceC5371u) {
        InterfaceC5371u<Z> interfaceC5371u2;
        InterfaceC5396l<Z> interfaceC5396l;
        EnumC5334c enumC5334c;
        InterfaceC5390f c5354d;
        Class<?> cls = interfaceC5371u.get().getClass();
        InterfaceC5395k<Z> interfaceC5395k = null;
        if (enumC5332a != EnumC5332a.RESOURCE_DISK_CACHE) {
            InterfaceC5396l<Z> m10249r = this.f13346f.m10249r(cls);
            interfaceC5396l = m10249r;
            interfaceC5371u2 = m10249r.transform(this.f13353m, interfaceC5371u, this.f13357q, this.f13358r);
        } else {
            interfaceC5371u2 = interfaceC5371u;
            interfaceC5396l = null;
        }
        if (!interfaceC5371u.equals(interfaceC5371u2)) {
            interfaceC5371u.mo10340c();
        }
        if (this.f13346f.m10253v(interfaceC5371u2)) {
            interfaceC5395k = this.f13346f.m10245n(interfaceC5371u2);
            enumC5334c = interfaceC5395k.mo10454b(this.f13360t);
        } else {
            enumC5334c = EnumC5334c.NONE;
        }
        InterfaceC5395k interfaceC5395k2 = interfaceC5395k;
        if (!this.f13359s.mo10301d(!this.f13346f.m10255x(this.f13338C), enumC5332a, enumC5334c)) {
            return interfaceC5371u2;
        }
        if (interfaceC5395k2 == null) {
            throw new Registry.NoResultEncoderAvailableException(interfaceC5371u2.get().getClass());
        }
        int i2 = a.f13369c[enumC5334c.ordinal()];
        if (i2 == 1) {
            c5354d = new C5354d(this.f13338C, this.f13354n);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + enumC5334c);
            }
            c5354d = new C5373w(this.f13346f.m10233b(), this.f13338C, this.f13354n, this.f13357q, this.f13358r, interfaceC5396l, cls, this.f13360t);
        }
        C5370t m10354b = C5370t.m10354b(interfaceC5371u2);
        this.f13351k.m10288d(c5354d, interfaceC5395k2, m10354b);
        return m10354b;
    }

    /* renamed from: R */
    void m10277R(boolean z) {
        if (this.f13352l.m10293d(z)) {
            m10269S();
        }
    }

    /* renamed from: X */
    boolean m10278X() {
        h m10259F = m10259F(h.INITIALIZE);
        return m10259F == h.RESOURCE_CACHE || m10259F == h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5356f.a
    /* renamed from: g */
    public void mo10229g(InterfaceC5390f interfaceC5390f, Exception exc, InterfaceC5400d<?> interfaceC5400d, EnumC5332a enumC5332a) {
        interfaceC5400d.mo10460b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m10168j(interfaceC5390f, enumC5332a, interfaceC5400d.mo10455a());
        this.f13347g.add(glideException);
        if (Thread.currentThread() == this.f13337B) {
            m10270T();
        } else {
            this.f13364x = g.SWITCH_TO_SOURCE_SERVICE;
            this.f13361u.mo10283c(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5356f.a
    /* renamed from: k */
    public void mo10230k() {
        this.f13364x = g.SWITCH_TO_SOURCE_SERVICE;
        this.f13361u.mo10283c(this);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5356f.a
    /* renamed from: q */
    public void mo10231q(InterfaceC5390f interfaceC5390f, Object obj, InterfaceC5400d<?> interfaceC5400d, EnumC5332a enumC5332a, InterfaceC5390f interfaceC5390f2) {
        this.f13338C = interfaceC5390f;
        this.f13340E = obj;
        this.f13342G = interfaceC5400d;
        this.f13341F = enumC5332a;
        this.f13339D = interfaceC5390f2;
        if (Thread.currentThread() != this.f13337B) {
            this.f13364x = g.DECODE_DATA;
            this.f13361u.mo10283c(this);
        } else {
            C5566b.m11074a("DecodeJob.decodeFromRetrievedData");
            try {
                m10257D();
            } finally {
                C5566b.m11077d();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C5566b.m11075b("DecodeJob#run(model=%s)", this.f13336A);
        InterfaceC5400d<?> interfaceC5400d = this.f13342G;
        try {
            try {
                try {
                    if (this.f13345J) {
                        m10266N();
                        if (interfaceC5400d != null) {
                            interfaceC5400d.mo10460b();
                        }
                        C5566b.m11077d();
                        return;
                    }
                    m10272V();
                    if (interfaceC5400d != null) {
                        interfaceC5400d.mo10460b();
                    }
                    C5566b.m11077d();
                } catch (C5349b e2) {
                    throw e2;
                }
            } catch (Throwable th) {
                if (Log.isLoggable("DecodeJob", 3)) {
                    Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f13345J + ", stage: " + this.f13363w, th);
                }
                if (this.f13363w != h.ENCODE) {
                    this.f13347g.add(th);
                    m10266N();
                }
                if (!this.f13345J) {
                    throw th;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (interfaceC5400d != null) {
                interfaceC5400d.mo10460b();
            }
            C5566b.m11077d();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.p145r.p146l.C5565a.f
    /* renamed from: u */
    public AbstractC5567c mo10213u() {
        return this.f13348h;
    }

    /* renamed from: v */
    public void m10279v() {
        this.f13345J = true;
        InterfaceC5356f interfaceC5356f = this.f13343H;
        if (interfaceC5356f != null) {
            interfaceC5356f.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC5358h<?> runnableC5358h) {
        int m10261H = m10261H() - runnableC5358h.m10261H();
        return m10261H == 0 ? this.f13362v - runnableC5358h.f13362v : m10261H;
    }
}
