package p323h.p324a.p329z.p334e.p335a;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.atomic.AtomicReference;
import p323h.p324a.AbstractC9031b;
import p323h.p324a.InterfaceC9033c;
import p323h.p324a.InterfaceC9034d;
import p323h.p324a.InterfaceC9035e;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p327x.InterfaceC9056c;
import p323h.p324a.p328y.InterfaceC9063d;
import p323h.p324a.p329z.p330a.C9068a;
import p323h.p324a.p329z.p330a.EnumC9070c;

/* compiled from: CompletableCreate.java */
/* renamed from: h.a.z.e.a.a */
/* loaded from: classes2.dex */
public final class C9085a extends AbstractC9031b {

    /* renamed from: a */
    final InterfaceC9035e f34963a;

    /* compiled from: CompletableCreate.java */
    /* renamed from: h.a.z.e.a.a$a */
    static final class a extends AtomicReference<InterfaceC9056c> implements InterfaceC9033c, InterfaceC9056c {

        /* renamed from: f */
        final InterfaceC9034d f34964f;

        a(InterfaceC9034d interfaceC9034d) {
            this.f34964f = interfaceC9034d;
        }

        @Override // p323h.p324a.InterfaceC9033c
        /* renamed from: a */
        public void mo29169a() {
            InterfaceC9056c andSet;
            InterfaceC9056c interfaceC9056c = get();
            EnumC9070c enumC9070c = EnumC9070c.DISPOSED;
            if (interfaceC9056c == enumC9070c || (andSet = getAndSet(enumC9070c)) == enumC9070c) {
                return;
            }
            try {
                this.f34964f.mo29118a();
            } finally {
                if (andSet != null) {
                    andSet.mo29115k();
                }
            }
        }

        @Override // p323h.p324a.InterfaceC9033c
        /* renamed from: b */
        public void mo29170b(InterfaceC9063d interfaceC9063d) {
            m29276d(new C9068a(interfaceC9063d));
        }

        @Override // p323h.p324a.InterfaceC9033c
        /* renamed from: c */
        public boolean mo29171c(Throwable th) {
            InterfaceC9056c andSet;
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            InterfaceC9056c interfaceC9056c = get();
            EnumC9070c enumC9070c = EnumC9070c.DISPOSED;
            if (interfaceC9056c == enumC9070c || (andSet = getAndSet(enumC9070c)) == enumC9070c) {
                return false;
            }
            try {
                this.f34964f.onError(th);
            } finally {
                if (andSet != null) {
                    andSet.mo29115k();
                }
            }
        }

        /* renamed from: d */
        public void m29276d(InterfaceC9056c interfaceC9056c) {
            EnumC9070c.m29254y(this, interfaceC9056c);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: k */
        public void mo29115k() {
            EnumC9070c.m29250g(this);
        }

        @Override // p323h.p324a.InterfaceC9033c
        public void onError(Throwable th) {
            if (mo29171c(th)) {
                return;
            }
            C9030a.m29147o(th);
        }

        @Override // p323h.p324a.p327x.InterfaceC9056c
        /* renamed from: q */
        public boolean mo29116q() {
            return EnumC9070c.m29251u(get());
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public String toString() {
            return String.format("%s{%s}", a.class.getSimpleName(), super.toString());
        }
    }

    public C9085a(InterfaceC9035e interfaceC9035e) {
        this.f34963a = interfaceC9035e;
    }

    @Override // p323h.p324a.AbstractC9031b
    /* renamed from: e */
    protected void mo29113e(InterfaceC9034d interfaceC9034d) {
        a aVar = new a(interfaceC9034d);
        interfaceC9034d.mo29119b(aVar);
        try {
            this.f34963a.mo7421a(aVar);
        } catch (Throwable th) {
            C9207a.m30000a(th);
            aVar.onError(th);
        }
    }
}
