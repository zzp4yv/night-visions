package p456rx.p461n.p462a;

import java.util.concurrent.atomic.AtomicInteger;
import p456rx.C11183b;
import p456rx.InterfaceC11184c;
import p456rx.InterfaceC11198k;
import p456rx.p461n.p465d.C11302a;

/* compiled from: CompletableOnSubscribeConcatArray.java */
/* renamed from: rx.n.a.d */
/* loaded from: classes3.dex */
public final class C11222d implements C11183b.w {

    /* renamed from: f */
    final C11183b[] f42223f;

    /* compiled from: CompletableOnSubscribeConcatArray.java */
    /* renamed from: rx.n.a.d$a */
    static final class a extends AtomicInteger implements InterfaceC11184c {

        /* renamed from: f */
        final InterfaceC11184c f42224f;

        /* renamed from: g */
        final C11183b[] f42225g;

        /* renamed from: h */
        int f42226h;

        /* renamed from: i */
        final C11302a f42227i = new C11302a();

        public a(InterfaceC11184c interfaceC11184c, C11183b[] c11183bArr) {
            this.f42224f = interfaceC11184c;
            this.f42225g = c11183bArr;
        }

        @Override // p456rx.InterfaceC11184c
        /* renamed from: a */
        public void mo29114a(InterfaceC11198k interfaceC11198k) {
            this.f42227i.m40415b(interfaceC11198k);
        }

        /* renamed from: b */
        void m40193b() {
            if (!this.f42227i.isUnsubscribed() && getAndIncrement() == 0) {
                C11183b[] c11183bArr = this.f42225g;
                while (!this.f42227i.isUnsubscribed()) {
                    int i2 = this.f42226h;
                    this.f42226h = i2 + 1;
                    if (i2 == c11183bArr.length) {
                        this.f42224f.onCompleted();
                        return;
                    } else {
                        c11183bArr[i2].m39971P(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // p456rx.InterfaceC11184c
        public void onCompleted() {
            m40193b();
        }

        @Override // p456rx.InterfaceC11184c
        public void onError(Throwable th) {
            this.f42224f.onError(th);
        }
    }

    public C11222d(C11183b[] c11183bArr) {
        this.f42223f = c11183bArr;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(InterfaceC11184c interfaceC11184c) {
        a aVar = new a(interfaceC11184c, this.f42223f);
        interfaceC11184c.mo29114a(aVar.f42227i);
        aVar.m40193b();
    }
}
