package com.flurry.sdk;

import com.flurry.sdk.C6035i2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.flurry.sdk.d7 */
/* loaded from: classes2.dex */
public class C5994d7<T> extends C6062l2 {

    /* renamed from: o */
    protected Set<InterfaceC6013f7<T>> f15793o;

    /* renamed from: com.flurry.sdk.d7$a */
    final class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6013f7 f15794h;

        a(InterfaceC6013f7 interfaceC6013f7) {
            this.f15794h = interfaceC6013f7;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C5994d7.this.f15793o.add(this.f15794h);
        }
    }

    /* renamed from: com.flurry.sdk.d7$b */
    final class b extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6013f7 f15796h;

        b(InterfaceC6013f7 interfaceC6013f7) {
            this.f15796h = interfaceC6013f7;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C5994d7.this.f15793o.remove(this.f15796h);
        }
    }

    /* renamed from: com.flurry.sdk.d7$c */
    final class c extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ Object f15798h;

        /* renamed from: com.flurry.sdk.d7$c$a */
        final class a extends AbstractRunnableC6008f2 {

            /* renamed from: h */
            final /* synthetic */ InterfaceC6013f7 f15800h;

            a(InterfaceC6013f7 interfaceC6013f7) {
                this.f15800h = interfaceC6013f7;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.flurry.sdk.AbstractRunnableC6008f2
            /* renamed from: a */
            public final void mo12950a() {
                this.f15800h.mo12962a(c.this.f15798h);
            }
        }

        c(Object obj) {
            this.f15798h = obj;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            Iterator<InterfaceC6013f7<T>> it = C5994d7.this.f15793o.iterator();
            while (it.hasNext()) {
                C5994d7.this.mo13007m(new a(it.next()));
            }
        }
    }

    protected C5994d7(String str) {
        super(str, C6035i2.m13111a(C6035i2.b.PROVIDER));
        this.f15793o = null;
        this.f15793o = new HashSet();
    }

    /* renamed from: t */
    public void m13048t(T t) {
        mo13007m(new c(t));
    }

    /* renamed from: u */
    public void mo13049u() {
    }

    /* renamed from: v */
    public void mo13050v(InterfaceC6013f7<T> interfaceC6013f7) {
        if (interfaceC6013f7 == null) {
            return;
        }
        mo13007m(new a(interfaceC6013f7));
    }

    /* renamed from: w */
    public void m13051w(InterfaceC6013f7<T> interfaceC6013f7) {
        mo13007m(new b(interfaceC6013f7));
    }
}
