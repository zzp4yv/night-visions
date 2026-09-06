package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8538j;
import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.InterfaceC8536h;
import com.google.gson.InterfaceC8537i;
import com.google.gson.InterfaceC8542n;
import com.google.gson.InterfaceC8543o;
import com.google.gson.InterfaceC8546r;
import com.google.gson.p215t.C8566l;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import java.io.IOException;

/* compiled from: TreeTypeAdapter.java */
/* renamed from: com.google.gson.t.n.l */
/* loaded from: classes2.dex */
public final class C8579l<T> extends AbstractC8545q<T> {

    /* renamed from: a */
    private final InterfaceC8543o<T> f32627a;

    /* renamed from: b */
    private final InterfaceC8537i<T> f32628b;

    /* renamed from: c */
    final C8533e f32629c;

    /* renamed from: d */
    private final C8586a<T> f32630d;

    /* renamed from: e */
    private final InterfaceC8546r f32631e;

    /* renamed from: f */
    private final C8579l<T>.b f32632f = new b();

    /* renamed from: g */
    private AbstractC8545q<T> f32633g;

    /* compiled from: TreeTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.l$b */
    private final class b implements InterfaceC8542n, InterfaceC8536h {
        private b() {
        }
    }

    public C8579l(InterfaceC8543o<T> interfaceC8543o, InterfaceC8537i<T> interfaceC8537i, C8533e c8533e, C8586a<T> c8586a, InterfaceC8546r interfaceC8546r) {
        this.f32627a = interfaceC8543o;
        this.f32628b = interfaceC8537i;
        this.f32629c = c8533e;
        this.f32630d = c8586a;
        this.f32631e = interfaceC8546r;
    }

    /* renamed from: e */
    private AbstractC8545q<T> m27147e() {
        AbstractC8545q<T> abstractC8545q = this.f32633g;
        if (abstractC8545q != null) {
            return abstractC8545q;
        }
        AbstractC8545q<T> m26928l = this.f32629c.m26928l(this.f32631e, this.f32630d);
        this.f32633g = m26928l;
        return m26928l;
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: b */
    public T mo26938b(C8552a c8552a) throws IOException {
        if (this.f32628b == null) {
            return m27147e().mo26938b(c8552a);
        }
        AbstractC8538j m27110a = C8566l.m27110a(c8552a);
        if (m27110a.m26958i()) {
            return null;
        }
        return this.f32628b.m26953a(m27110a, this.f32630d.getType(), this.f32632f);
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: d */
    public void mo26939d(C8554c c8554c, T t) throws IOException {
        InterfaceC8543o<T> interfaceC8543o = this.f32627a;
        if (interfaceC8543o == null) {
            m27147e().mo26939d(c8554c, t);
        } else if (t == null) {
            c8554c.mo27043y();
        } else {
            C8566l.m27111b(interfaceC8543o.m26976a(t, this.f32630d.getType(), this.f32632f), c8554c);
        }
    }
}
