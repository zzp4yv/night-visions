package p456rx.p461n.p462a;

import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.exceptions.C11192a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p463b.C11286b;
import p456rx.p471q.C11361c;

/* compiled from: OperatorAny.java */
/* renamed from: rx.n.a.h0 */
/* loaded from: classes3.dex */
public final class C11235h0<T> implements C11186e.b<Boolean, T> {

    /* renamed from: f */
    final InterfaceC11208e<? super T, Boolean> f42311f;

    /* renamed from: g */
    final boolean f42312g;

    /* compiled from: OperatorAny.java */
    /* renamed from: rx.n.a.h0$a */
    class a extends AbstractC11197j<T> {

        /* renamed from: f */
        boolean f42313f;

        /* renamed from: g */
        boolean f42314g;

        /* renamed from: h */
        final /* synthetic */ C11286b f42315h;

        /* renamed from: i */
        final /* synthetic */ AbstractC11197j f42316i;

        a(C11286b c11286b, AbstractC11197j abstractC11197j) {
            this.f42315h = c11286b;
            this.f42316i = abstractC11197j;
        }

        @Override // p456rx.InterfaceC11193f
        public void onCompleted() {
            if (this.f42314g) {
                return;
            }
            this.f42314g = true;
            if (this.f42313f) {
                this.f42315h.m40377b(Boolean.FALSE);
            } else {
                this.f42315h.m40377b(Boolean.valueOf(C11235h0.this.f42312g));
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onError(Throwable th) {
            if (this.f42314g) {
                C11361c.m40578j(th);
            } else {
                this.f42314g = true;
                this.f42316i.onError(th);
            }
        }

        @Override // p456rx.InterfaceC11193f
        public void onNext(T t) {
            if (this.f42314g) {
                return;
            }
            this.f42313f = true;
            try {
                if (C11235h0.this.f42311f.call(t).booleanValue()) {
                    this.f42314g = true;
                    this.f42315h.m40377b(Boolean.valueOf(true ^ C11235h0.this.f42312g));
                    unsubscribe();
                }
            } catch (Throwable th) {
                C11192a.m40142g(th, this, t);
            }
        }
    }

    public C11235h0(InterfaceC11208e<? super T, Boolean> interfaceC11208e, boolean z) {
        this.f42311f = interfaceC11208e;
        this.f42312g = z;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public AbstractC11197j<? super T> call(AbstractC11197j<? super Boolean> abstractC11197j) {
        C11286b c11286b = new C11286b(abstractC11197j);
        a aVar = new a(c11286b, abstractC11197j);
        abstractC11197j.add(aVar);
        abstractC11197j.setProducer(c11286b);
        return aVar;
    }
}
