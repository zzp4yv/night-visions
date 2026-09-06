package p456rx.p461n.p466e;

import java.util.List;
import p456rx.C11185d;
import p456rx.C11186e;
import p456rx.exceptions.OnErrorNotImplementedException;
import p456rx.p460m.InterfaceC11205b;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p460m.InterfaceC11209f;
import p456rx.p461n.p462a.C11235h0;

/* compiled from: InternalObservableUtils.java */
/* renamed from: rx.n.e.f */
/* loaded from: classes3.dex */
public enum EnumC11309f {
    ;


    /* renamed from: f */
    public static final e f42872f = new InterfaceC11209f<Long, Object, Long>() { // from class: rx.n.e.f.e
        @Override // p456rx.p460m.InterfaceC11209f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long mo6865a(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    };

    /* renamed from: g */
    public static final c f42873g = new InterfaceC11209f<Object, Object, Boolean>() { // from class: rx.n.e.f.c
        @Override // p456rx.p460m.InterfaceC11209f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean mo6865a(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    };

    /* renamed from: h */
    public static final h f42874h = new InterfaceC11208e<List<? extends C11186e<?>>, C11186e<?>[]>() { // from class: rx.n.e.f.h
        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11186e<?>[] call(List<? extends C11186e<?>> list) {
            return (C11186e[]) list.toArray(new C11186e[list.size()]);
        }
    };

    /* renamed from: i */
    static final g f42875i = new InterfaceC11208e<Object, Void>() { // from class: rx.n.e.f.g
        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call(Object obj) {
            return null;
        }
    };

    /* renamed from: j */
    public static final d f42876j = new InterfaceC11209f<Integer, Object, Integer>() { // from class: rx.n.e.f.d
        @Override // p456rx.p460m.InterfaceC11209f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer mo6865a(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    };

    /* renamed from: k */
    static final b f42877k = new b();

    /* renamed from: l */
    public static final InterfaceC11205b<Throwable> f42878l = new InterfaceC11205b<Throwable>() { // from class: rx.n.e.f.a
        @Override // p456rx.p460m.InterfaceC11205b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    };

    /* renamed from: m */
    public static final C11186e.b<Boolean, Object> f42879m = new C11235h0(C11316m.m40466a(), true);

    /* compiled from: InternalObservableUtils.java */
    /* renamed from: rx.n.e.f$b */
    static final class b implements InterfaceC11208e<C11185d<?>, Throwable> {
        b() {
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(C11185d<?> c11185d) {
            return c11185d.m40009e();
        }
    }

    /* compiled from: InternalObservableUtils.java */
    /* renamed from: rx.n.e.f$f */
    static final class f implements InterfaceC11208e<C11186e<? extends C11185d<?>>, C11186e<?>> {

        /* renamed from: f */
        final InterfaceC11208e<? super C11186e<? extends Throwable>, ? extends C11186e<?>> f42881f;

        public f(InterfaceC11208e<? super C11186e<? extends Throwable>, ? extends C11186e<?>> interfaceC11208e) {
            this.f42881f = interfaceC11208e;
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C11186e<?> call(C11186e<? extends C11185d<?>> c11186e) {
            return this.f42881f.call(c11186e.m40082X(EnumC11309f.f42877k));
        }
    }

    /* renamed from: g */
    public static InterfaceC11208e<C11186e<? extends C11185d<?>>, C11186e<?>> m40424g(InterfaceC11208e<? super C11186e<? extends Throwable>, ? extends C11186e<?>> interfaceC11208e) {
        return new f(interfaceC11208e);
    }
}
