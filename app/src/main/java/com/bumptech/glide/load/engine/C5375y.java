package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.InterfaceC5335d;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.engine.InterfaceC5356f;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.p145r.C5559f;
import java.util.Collections;
import java.util.List;

/* compiled from: SourceGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.y */
/* loaded from: classes.dex */
class C5375y implements InterfaceC5356f, InterfaceC5400d.a<Object>, InterfaceC5356f.a {

    /* renamed from: f */
    private final C5357g<?> f13503f;

    /* renamed from: g */
    private final InterfaceC5356f.a f13504g;

    /* renamed from: h */
    private int f13505h;

    /* renamed from: i */
    private C5352c f13506i;

    /* renamed from: j */
    private Object f13507j;

    /* renamed from: k */
    private volatile InterfaceC5429n.a<?> f13508k;

    /* renamed from: l */
    private C5354d f13509l;

    C5375y(C5357g<?> c5357g, InterfaceC5356f.a aVar) {
        this.f13503f = c5357g;
        this.f13504g = aVar;
    }

    /* renamed from: b */
    private void m10361b(Object obj) {
        long m11028b = C5559f.m11028b();
        try {
            InterfaceC5335d<X> m10247p = this.f13503f.m10247p(obj);
            C5355e c5355e = new C5355e(m10247p, obj, this.f13503f.m10242k());
            this.f13509l = new C5354d(this.f13508k.f13654a, this.f13503f.m10246o());
            this.f13503f.m10235d().mo10179a(this.f13509l, c5355e);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f13509l + ", data: " + obj + ", encoder: " + m10247p + ", duration: " + C5559f.m11027a(m11028b));
            }
            this.f13508k.f13656c.mo10460b();
            this.f13506i = new C5352c(Collections.singletonList(this.f13508k.f13654a), this.f13503f, this);
        } catch (Throwable th) {
            this.f13508k.f13656c.mo10460b();
            throw th;
        }
    }

    /* renamed from: d */
    private boolean m10362d() {
        return this.f13505h < this.f13503f.m10238g().size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5356f
    /* renamed from: a */
    public boolean mo10226a() {
        Object obj = this.f13507j;
        if (obj != null) {
            this.f13507j = null;
            m10361b(obj);
        }
        C5352c c5352c = this.f13506i;
        if (c5352c != null && c5352c.mo10226a()) {
            return true;
        }
        this.f13506i = null;
        this.f13508k = null;
        boolean z = false;
        while (!z && m10362d()) {
            List<InterfaceC5429n.a<?>> m10238g = this.f13503f.m10238g();
            int i2 = this.f13505h;
            this.f13505h = i2 + 1;
            this.f13508k = m10238g.get(i2);
            if (this.f13508k != null && (this.f13503f.m10236e().mo10300c(this.f13508k.f13656c.mo10462d()) || this.f13503f.m10251t(this.f13508k.f13656c.mo10455a()))) {
                this.f13508k.f13656c.mo10463e(this.f13503f.m10243l(), this);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d.a
    /* renamed from: c */
    public void mo10227c(Exception exc) {
        this.f13504g.mo10229g(this.f13509l, exc, this.f13508k.f13656c, this.f13508k.f13656c.mo10462d());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5356f
    public void cancel() {
        InterfaceC5429n.a<?> aVar = this.f13508k;
        if (aVar != null) {
            aVar.f13656c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d.a
    /* renamed from: f */
    public void mo10228f(Object obj) {
        AbstractC5360j m10236e = this.f13503f.m10236e();
        if (obj == null || !m10236e.mo10300c(this.f13508k.f13656c.mo10462d())) {
            this.f13504g.mo10231q(this.f13508k.f13654a, obj, this.f13508k.f13656c, this.f13508k.f13656c.mo10462d(), this.f13509l);
        } else {
            this.f13507j = obj;
            this.f13504g.mo10230k();
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5356f.a
    /* renamed from: g */
    public void mo10229g(InterfaceC5390f interfaceC5390f, Exception exc, InterfaceC5400d<?> interfaceC5400d, EnumC5332a enumC5332a) {
        this.f13504g.mo10229g(interfaceC5390f, exc, interfaceC5400d, this.f13508k.f13656c.mo10462d());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5356f.a
    /* renamed from: k */
    public void mo10230k() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5356f.a
    /* renamed from: q */
    public void mo10231q(InterfaceC5390f interfaceC5390f, Object obj, InterfaceC5400d<?> interfaceC5400d, EnumC5332a enumC5332a, InterfaceC5390f interfaceC5390f2) {
        this.f13504g.mo10231q(interfaceC5390f, obj, interfaceC5400d, this.f13508k.f13656c.mo10462d(), interfaceC5390f);
    }
}
