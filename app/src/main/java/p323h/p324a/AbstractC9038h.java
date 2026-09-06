package p323h.p324a;

import io.reactivex.exceptions.C9207a;
import p323h.p324a.p325a0.C9030a;
import p323h.p324a.p329z.p331b.C9074a;
import p323h.p324a.p329z.p331b.C9075b;
import p323h.p324a.p329z.p334e.p336b.C9091c;
import p323h.p324a.p329z.p334e.p336b.C9092d;
import p323h.p324a.p329z.p334e.p336b.C9094f;
import p323h.p324a.p329z.p342h.C9140a;
import p355k.p356a.InterfaceC9695a;
import p355k.p356a.InterfaceC9696b;

/* compiled from: Flowable.java */
/* renamed from: h.a.h */
/* loaded from: classes2.dex */
public abstract class AbstractC9038h<T> implements InterfaceC9695a<T> {

    /* renamed from: a */
    static final int f34931a = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    /* renamed from: c */
    public static int m29172c() {
        return f34931a;
    }

    @Override // p355k.p356a.InterfaceC9695a
    /* renamed from: b */
    public final void mo29173b(InterfaceC9696b<? super T> interfaceC9696b) {
        if (interfaceC9696b instanceof InterfaceC9039i) {
            m29178h((InterfaceC9039i) interfaceC9696b);
        } else {
            C9075b.m29271c(interfaceC9696b, "s is null");
            m29178h(new C9140a(interfaceC9696b));
        }
    }

    /* renamed from: d */
    public final AbstractC9038h<T> m29174d() {
        return m29175e(m29172c(), false, true);
    }

    /* renamed from: e */
    public final AbstractC9038h<T> m29175e(int i2, boolean z, boolean z2) {
        C9075b.m29272d(i2, "capacity");
        return C9030a.m29143k(new C9091c(this, i2, z2, z, C9074a.f34948c));
    }

    /* renamed from: f */
    public final AbstractC9038h<T> m29176f() {
        return C9030a.m29143k(new C9092d(this));
    }

    /* renamed from: g */
    public final AbstractC9038h<T> m29177g() {
        return C9030a.m29143k(new C9094f(this));
    }

    /* renamed from: h */
    public final void m29178h(InterfaceC9039i<? super T> interfaceC9039i) {
        C9075b.m29271c(interfaceC9039i, "s is null");
        try {
            InterfaceC9696b<? super T> m29155w = C9030a.m29155w(this, interfaceC9039i);
            C9075b.m29271c(m29155w, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            mo29179i(m29155w);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            C9207a.m30000a(th);
            C9030a.m29147o(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* renamed from: i */
    protected abstract void mo29179i(InterfaceC9696b<? super T> interfaceC9696b);
}
