package com.bumptech.glide.load.engine;

import com.bumptech.glide.C5318e;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5335d;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.InterfaceC5395k;
import com.bumptech.glide.load.InterfaceC5396l;
import com.bumptech.glide.load.engine.RunnableC5358h;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5339a;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.load.p131o.C5446b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: DecodeHelper.java */
/* renamed from: com.bumptech.glide.load.engine.g */
/* loaded from: classes.dex */
final class C5357g<Transcode> {

    /* renamed from: a */
    private final List<InterfaceC5429n.a<?>> f13318a = new ArrayList();

    /* renamed from: b */
    private final List<InterfaceC5390f> f13319b = new ArrayList();

    /* renamed from: c */
    private C5318e f13320c;

    /* renamed from: d */
    private Object f13321d;

    /* renamed from: e */
    private int f13322e;

    /* renamed from: f */
    private int f13323f;

    /* renamed from: g */
    private Class<?> f13324g;

    /* renamed from: h */
    private RunnableC5358h.e f13325h;

    /* renamed from: i */
    private C5393i f13326i;

    /* renamed from: j */
    private Map<Class<?>, InterfaceC5396l<?>> f13327j;

    /* renamed from: k */
    private Class<Transcode> f13328k;

    /* renamed from: l */
    private boolean f13329l;

    /* renamed from: m */
    private boolean f13330m;

    /* renamed from: n */
    private InterfaceC5390f f13331n;

    /* renamed from: o */
    private EnumC5320g f13332o;

    /* renamed from: p */
    private AbstractC5360j f13333p;

    /* renamed from: q */
    private boolean f13334q;

    /* renamed from: r */
    private boolean f13335r;

    C5357g() {
    }

    /* renamed from: a */
    void m10232a() {
        this.f13320c = null;
        this.f13321d = null;
        this.f13331n = null;
        this.f13324g = null;
        this.f13328k = null;
        this.f13326i = null;
        this.f13332o = null;
        this.f13327j = null;
        this.f13333p = null;
        this.f13318a.clear();
        this.f13329l = false;
        this.f13319b.clear();
        this.f13330m = false;
    }

    /* renamed from: b */
    InterfaceC5377b m10233b() {
        return this.f13320c.m9998b();
    }

    /* renamed from: c */
    List<InterfaceC5390f> m10234c() {
        if (!this.f13330m) {
            this.f13330m = true;
            this.f13319b.clear();
            List<InterfaceC5429n.a<?>> m10238g = m10238g();
            int size = m10238g.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC5429n.a<?> aVar = m10238g.get(i2);
                if (!this.f13319b.contains(aVar.f13654a)) {
                    this.f13319b.add(aVar.f13654a);
                }
                for (int i3 = 0; i3 < aVar.f13655b.size(); i3++) {
                    if (!this.f13319b.contains(aVar.f13655b.get(i3))) {
                        this.f13319b.add(aVar.f13655b.get(i3));
                    }
                }
            }
        }
        return this.f13319b;
    }

    /* renamed from: d */
    InterfaceC5339a m10235d() {
        return this.f13325h.mo10289a();
    }

    /* renamed from: e */
    AbstractC5360j m10236e() {
        return this.f13333p;
    }

    /* renamed from: f */
    int m10237f() {
        return this.f13323f;
    }

    /* renamed from: g */
    List<InterfaceC5429n.a<?>> m10238g() {
        if (!this.f13329l) {
            this.f13329l = true;
            this.f13318a.clear();
            List m9959i = this.f13320c.m10004h().m9959i(this.f13321d);
            int size = m9959i.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC5429n.a<?> mo10509b = ((InterfaceC5429n) m9959i.get(i2)).mo10509b(this.f13321d, this.f13322e, this.f13323f, this.f13326i);
                if (mo10509b != null) {
                    this.f13318a.add(mo10509b);
                }
            }
        }
        return this.f13318a;
    }

    /* renamed from: h */
    <Data> C5369s<Data, ?, Transcode> m10239h(Class<Data> cls) {
        return this.f13320c.m10004h().m9958h(cls, this.f13324g, this.f13328k);
    }

    /* renamed from: i */
    Class<?> m10240i() {
        return this.f13321d.getClass();
    }

    /* renamed from: j */
    List<InterfaceC5429n<File, ?>> m10241j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f13320c.m10004h().m9959i(file);
    }

    /* renamed from: k */
    C5393i m10242k() {
        return this.f13326i;
    }

    /* renamed from: l */
    EnumC5320g m10243l() {
        return this.f13332o;
    }

    /* renamed from: m */
    List<Class<?>> m10244m() {
        return this.f13320c.m10004h().m9960j(this.f13321d.getClass(), this.f13324g, this.f13328k);
    }

    /* renamed from: n */
    <Z> InterfaceC5395k<Z> m10245n(InterfaceC5371u<Z> interfaceC5371u) {
        return this.f13320c.m10004h().m9961k(interfaceC5371u);
    }

    /* renamed from: o */
    InterfaceC5390f m10246o() {
        return this.f13331n;
    }

    /* renamed from: p */
    <X> InterfaceC5335d<X> m10247p(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f13320c.m10004h().m9963m(x);
    }

    /* renamed from: q */
    Class<?> m10248q() {
        return this.f13328k;
    }

    /* renamed from: r */
    <Z> InterfaceC5396l<Z> m10249r(Class<Z> cls) {
        InterfaceC5396l<Z> interfaceC5396l = (InterfaceC5396l) this.f13327j.get(cls);
        if (interfaceC5396l == null) {
            Iterator<Map.Entry<Class<?>, InterfaceC5396l<?>>> it = this.f13327j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, InterfaceC5396l<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    interfaceC5396l = (InterfaceC5396l) next.getValue();
                    break;
                }
            }
        }
        if (interfaceC5396l != null) {
            return interfaceC5396l;
        }
        if (!this.f13327j.isEmpty() || !this.f13334q) {
            return C5446b.m10603a();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    /* renamed from: s */
    int m10250s() {
        return this.f13322e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: t */
    boolean m10251t(Class<?> cls) {
        return m10239h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    <R> void m10252u(C5318e c5318e, Object obj, InterfaceC5390f interfaceC5390f, int i2, int i3, AbstractC5360j abstractC5360j, Class<?> cls, Class<R> cls2, EnumC5320g enumC5320g, C5393i c5393i, Map<Class<?>, InterfaceC5396l<?>> map, boolean z, boolean z2, RunnableC5358h.e eVar) {
        this.f13320c = c5318e;
        this.f13321d = obj;
        this.f13331n = interfaceC5390f;
        this.f13322e = i2;
        this.f13323f = i3;
        this.f13333p = abstractC5360j;
        this.f13324g = cls;
        this.f13325h = eVar;
        this.f13328k = cls2;
        this.f13332o = enumC5320g;
        this.f13326i = c5393i;
        this.f13327j = map;
        this.f13334q = z;
        this.f13335r = z2;
    }

    /* renamed from: v */
    boolean m10253v(InterfaceC5371u<?> interfaceC5371u) {
        return this.f13320c.m10004h().m9964n(interfaceC5371u);
    }

    /* renamed from: w */
    boolean m10254w() {
        return this.f13335r;
    }

    /* renamed from: x */
    boolean m10255x(InterfaceC5390f interfaceC5390f) {
        List<InterfaceC5429n.a<?>> m10238g = m10238g();
        int size = m10238g.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (m10238g.get(i2).f13654a.equals(interfaceC5390f)) {
                return true;
            }
        }
        return false;
    }
}
