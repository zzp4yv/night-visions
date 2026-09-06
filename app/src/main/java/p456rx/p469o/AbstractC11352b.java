package p456rx.p469o;

import p456rx.C11186e;
import p456rx.InterfaceC11198k;
import p456rx.p460m.C11206c;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p461n.p462a.C11237i;
import p456rx.p461n.p462a.C11283z;

/* compiled from: ConnectableObservable.java */
/* renamed from: rx.o.b */
/* loaded from: classes3.dex */
public abstract class AbstractC11352b<T> extends C11186e<T> {
    protected AbstractC11352b(C11186e.a<T> aVar) {
        super(aVar);
    }

    /* renamed from: f1 */
    public C11186e<T> m40552f1() {
        return m40553g1(1);
    }

    /* renamed from: g1 */
    public C11186e<T> m40553g1(int i2) {
        return m40554h1(i2, C11206c.m40157a());
    }

    /* renamed from: h1 */
    public C11186e<T> m40554h1(int i2, InterfaceC11205b<? super InterfaceC11198k> interfaceC11205b) {
        if (i2 > 0) {
            return C11186e.m40035b1(new C11237i(this, i2, interfaceC11205b));
        }
        mo40336i1(interfaceC11205b);
        return this;
    }

    /* renamed from: i1 */
    public abstract void mo40336i1(InterfaceC11205b<? super InterfaceC11198k> interfaceC11205b);

    /* renamed from: j1 */
    public C11186e<T> m40555j1() {
        return C11186e.m40035b1(new C11283z(this));
    }
}
