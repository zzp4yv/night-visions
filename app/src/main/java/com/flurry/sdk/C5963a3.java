package com.flurry.sdk;

import com.flurry.sdk.InterfaceC6164x2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.flurry.sdk.a3 */
/* loaded from: classes2.dex */
final class C5963a3 extends AbstractC5981c3 {

    /* renamed from: s */
    protected List<InterfaceC6045j3> f15657s;

    /* renamed from: t */
    protected InterfaceC6036i3 f15658t;

    /* renamed from: com.flurry.sdk.a3$a */
    final class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6144u6 f15659h;

        a(InterfaceC6144u6 interfaceC6144u6) {
            this.f15659h = interfaceC6144u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C5963a3.m12955y(C5963a3.this, this.f15659h);
            C5963a3.this.m13002w(this.f15659h);
        }
    }

    /* renamed from: com.flurry.sdk.a3$b */
    final class b implements InterfaceC6036i3 {
        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6036i3
        /* renamed from: a */
        public final void mo12958a(Runnable runnable) {
            C5963a3.this.mo13007m(runnable);
        }

        @Override // com.flurry.sdk.InterfaceC6036i3
        /* renamed from: b */
        public final void mo12959b(InterfaceC6144u6 interfaceC6144u6) {
            C5963a3.this.mo12999j(interfaceC6144u6);
        }

        @Override // com.flurry.sdk.InterfaceC6036i3
        /* renamed from: c */
        public final void mo12960c(InterfaceC6144u6 interfaceC6144u6) {
            C5963a3.this.m13002w(interfaceC6144u6);
        }
    }

    /* renamed from: com.flurry.sdk.a3$c */
    final class c extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6144u6 f15662h;

        c(InterfaceC6144u6 interfaceC6144u6) {
            this.f15662h = interfaceC6144u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C5963a3.m12955y(C5963a3.this, this.f15662h);
        }
    }

    C5963a3(InterfaceC6164x2 interfaceC6164x2) {
        super("PolicyModule", interfaceC6164x2);
        this.f15658t = new b();
        ArrayList arrayList = new ArrayList();
        this.f15657s = arrayList;
        arrayList.add(new C6054k3(this.f15658t));
    }

    /* renamed from: y */
    static /* synthetic */ void m12955y(C5963a3 c5963a3, InterfaceC6144u6 interfaceC6144u6) {
        Iterator<InterfaceC6045j3> it = c5963a3.f15657s.iterator();
        while (it.hasNext()) {
            it.next().mo13137b(interfaceC6144u6);
        }
    }

    @Override // com.flurry.sdk.AbstractC5981c3
    /* renamed from: b */
    public final void mo12956b(InterfaceC6144u6 interfaceC6144u6) {
        mo13007m(new a(interfaceC6144u6));
    }

    @Override // com.flurry.sdk.AbstractC5981c3, com.flurry.sdk.InterfaceC6164x2
    /* renamed from: c */
    public final InterfaceC6164x2.a mo12957c(InterfaceC6144u6 interfaceC6144u6) {
        mo13007m(new c(interfaceC6144u6));
        return super.mo12957c(interfaceC6144u6);
    }
}
