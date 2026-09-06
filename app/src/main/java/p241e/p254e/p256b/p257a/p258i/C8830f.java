package p241e.p254e.p256b.p257a.p258i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.C6234j;
import com.google.android.datatransport.runtime.backends.C6236l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6257t;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6258u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6259v;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6260w;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C6261x;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6262y;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p241e.p254e.p256b.p257a.p258i.AbstractC8846v;
import p241e.p254e.p256b.p257a.p258i.p260b0.C8766c;
import p241e.p254e.p256b.p257a.p258i.p260b0.C8767d;
import p241e.p254e.p256b.p257a.p258i.p260b0.C8770g;
import p241e.p254e.p256b.p257a.p258i.p260b0.C8772i;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8798m0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8800n0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8802o0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8804p0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8808r0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8810s0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.C8814u0;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8792j0;
import p241e.p254e.p256b.p257a.p258i.p262c0.C8823c;
import p241e.p254e.p256b.p257a.p258i.p262c0.C8824d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8848a;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8850c;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.C8851d;
import p241e.p254e.p256b.p257a.p258i.p264x.p265a.InterfaceC8849b;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* renamed from: e.e.b.a.i.f */
/* loaded from: classes2.dex */
final class C8830f extends AbstractC8846v {

    /* renamed from: f */
    private Provider<Executor> f33589f;

    /* renamed from: g */
    private Provider<Context> f33590g;

    /* renamed from: h */
    private Provider f33591h;

    /* renamed from: i */
    private Provider f33592i;

    /* renamed from: j */
    private Provider f33593j;

    /* renamed from: k */
    private Provider<String> f33594k;

    /* renamed from: l */
    private Provider<C8808r0> f33595l;

    /* renamed from: m */
    private Provider<AbstractC6257t> f33596m;

    /* renamed from: n */
    private Provider<InterfaceC6262y> f33597n;

    /* renamed from: o */
    private Provider<C8766c> f33598o;

    /* renamed from: p */
    private Provider<C6258u> f33599p;

    /* renamed from: q */
    private Provider<C6260w> f33600q;

    /* renamed from: r */
    private Provider<C8845u> f33601r;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    /* renamed from: e.e.b.a.i.f$b */
    private static final class b implements AbstractC8846v.a {

        /* renamed from: a */
        private Context f33602a;

        private b() {
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8846v.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo28145a(Context context) {
            this.f33602a = (Context) C8851d.m28188b(context);
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8846v.a
        /* renamed from: c */
        public AbstractC8846v mo28147c() {
            C8851d.m28187a(this.f33602a, Context.class);
            return new C8830f(this.f33602a);
        }
    }

    /* renamed from: c */
    public static AbstractC8846v.a m28141c() {
        return new b();
    }

    /* renamed from: d */
    private void m28142d(Context context) {
        this.f33589f = C8848a.m28184a(C8836l.m28160a());
        InterfaceC8849b m28186a = C8850c.m28186a(context);
        this.f33590g = m28186a;
        C6234j m13527a = C6234j.m13527a(m28186a, C8823c.m28113a(), C8824d.m28117a());
        this.f33591h = m13527a;
        this.f33592i = C8848a.m28184a(C6236l.m13534a(this.f33590g, m13527a));
        this.f33593j = C8814u0.m28093a(this.f33590g, C8798m0.m28008a(), C8802o0.m28015a());
        this.f33594k = C8848a.m28184a(C8800n0.m28012a(this.f33590g));
        this.f33595l = C8848a.m28184a(C8810s0.m28082a(C8823c.m28113a(), C8824d.m28117a(), C8804p0.m28019a(), this.f33593j, this.f33594k));
        C8770g m27968b = C8770g.m27968b(C8823c.m28113a());
        this.f33596m = m27968b;
        C8772i m27971a = C8772i.m27971a(this.f33590g, this.f33595l, m27968b, C8824d.m28117a());
        this.f33597n = m27971a;
        Provider<Executor> provider = this.f33589f;
        Provider provider2 = this.f33592i;
        Provider<C8808r0> provider3 = this.f33595l;
        this.f33598o = C8767d.m27963a(provider, provider2, m27971a, provider3, provider3);
        Provider<Context> provider4 = this.f33590g;
        Provider provider5 = this.f33592i;
        Provider<C8808r0> provider6 = this.f33595l;
        this.f33599p = C6259v.m13588a(provider4, provider5, provider6, this.f33597n, this.f33589f, provider6, C8823c.m28113a(), C8824d.m28117a(), this.f33595l);
        Provider<Executor> provider7 = this.f33589f;
        Provider<C8808r0> provider8 = this.f33595l;
        this.f33600q = C6261x.m13596a(provider7, provider8, this.f33597n, provider8);
        this.f33601r = C8848a.m28184a(C8847w.m28181a(C8823c.m28113a(), C8824d.m28117a(), this.f33598o, this.f33599p, this.f33600q));
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8846v
    /* renamed from: a */
    InterfaceC8792j0 mo28143a() {
        return this.f33595l.get();
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8846v
    /* renamed from: b */
    C8845u mo28144b() {
        return this.f33601r.get();
    }

    private C8830f(Context context) {
        m28142d(context);
    }
}
