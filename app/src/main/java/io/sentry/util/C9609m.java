package io.sentry.util;

import io.sentry.C9484n1;
import io.sentry.InterfaceC9637w1;
import io.sentry.hints.EnumC9425h;
import io.sentry.hints.InterfaceC9420c;
import io.sentry.hints.InterfaceC9421d;
import io.sentry.hints.InterfaceC9423f;
import io.sentry.util.C9609m;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: HintUtils.java */
@ApiStatus.Internal
/* renamed from: io.sentry.util.m */
/* loaded from: classes2.dex */
public final class C9609m {

    /* compiled from: HintUtils.java */
    @FunctionalInterface
    /* renamed from: io.sentry.util.m$a */
    public interface a<T> {
        /* renamed from: a */
        void mo30156a(T t);
    }

    /* compiled from: HintUtils.java */
    @FunctionalInterface
    /* renamed from: io.sentry.util.m$b */
    public interface b {
        /* renamed from: a */
        void mo31660a(Object obj, Class<?> cls);
    }

    /* compiled from: HintUtils.java */
    @FunctionalInterface
    /* renamed from: io.sentry.util.m$c */
    public interface c<T> {
        /* renamed from: a */
        void mo31666a(T t);
    }

    /* renamed from: a */
    public static C9484n1 m31778a(Object obj) {
        C9484n1 c9484n1 = new C9484n1();
        m31793p(c9484n1, obj);
        return c9484n1;
    }

    /* renamed from: b */
    public static EnumC9425h m31779b(C9484n1 c9484n1) {
        return (EnumC9425h) c9484n1.m31074d("sentry:eventDropReason", EnumC9425h.class);
    }

    /* renamed from: c */
    public static Object m31780c(C9484n1 c9484n1) {
        return c9484n1.m31073c("sentry:typeCheckHint");
    }

    /* renamed from: d */
    public static boolean m31781d(C9484n1 c9484n1, Class<?> cls) {
        return cls.isInstance(m31780c(c9484n1));
    }

    /* renamed from: e */
    public static boolean m31782e(C9484n1 c9484n1) {
        return Boolean.TRUE.equals(c9484n1.m31074d("sentry:isFromHybridSdk", Boolean.class));
    }

    /* renamed from: f */
    static /* synthetic */ void m31783f(Object obj) {
    }

    /* renamed from: h */
    static /* synthetic */ void m31785h(Object obj, Class cls) {
    }

    /* renamed from: j */
    public static <T> void m31787j(C9484n1 c9484n1, Class<T> cls, final c<Object> cVar) {
        m31789l(c9484n1, cls, new a() { // from class: io.sentry.util.d
            @Override // io.sentry.util.C9609m.a
            /* renamed from: a */
            public final void mo30156a(Object obj) {
                C9609m.m31783f(obj);
            }
        }, new b() { // from class: io.sentry.util.c
            @Override // io.sentry.util.C9609m.b
            /* renamed from: a */
            public final void mo31660a(Object obj, Class cls2) {
                C9609m.c.this.mo31666a(obj);
            }
        });
    }

    /* renamed from: k */
    public static <T> void m31788k(C9484n1 c9484n1, Class<T> cls, a<T> aVar) {
        m31789l(c9484n1, cls, aVar, new b() { // from class: io.sentry.util.a
            @Override // io.sentry.util.C9609m.b
            /* renamed from: a */
            public final void mo31660a(Object obj, Class cls2) {
                C9609m.m31785h(obj, cls2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public static <T> void m31789l(C9484n1 c9484n1, Class<T> cls, a<T> aVar, b bVar) {
        Object m31780c = m31780c(c9484n1);
        if (!m31781d(c9484n1, cls) || m31780c == null) {
            bVar.mo31660a(m31780c, cls);
        } else {
            aVar.mo30156a(m31780c);
        }
    }

    /* renamed from: m */
    public static <T> void m31790m(C9484n1 c9484n1, Class<T> cls, final InterfaceC9637w1 interfaceC9637w1, a<T> aVar) {
        m31789l(c9484n1, cls, aVar, new b() { // from class: io.sentry.util.b
            @Override // io.sentry.util.C9609m.b
            /* renamed from: a */
            public final void mo31660a(Object obj, Class cls2) {
                C9612p.m31799a(cls2, obj, InterfaceC9637w1.this);
            }
        });
    }

    /* renamed from: n */
    public static void m31791n(C9484n1 c9484n1, EnumC9425h enumC9425h) {
        c9484n1.m31079j("sentry:eventDropReason", enumC9425h);
    }

    /* renamed from: o */
    public static void m31792o(C9484n1 c9484n1, String str) {
        if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
            c9484n1.m31079j("sentry:isFromHybridSdk", Boolean.TRUE);
        }
    }

    /* renamed from: p */
    public static void m31793p(C9484n1 c9484n1, Object obj) {
        c9484n1.m31079j("sentry:typeCheckHint", obj);
    }

    /* renamed from: q */
    public static boolean m31794q(C9484n1 c9484n1) {
        return !(m31781d(c9484n1, InterfaceC9423f.class) || m31781d(c9484n1, InterfaceC9421d.class)) || m31781d(c9484n1, InterfaceC9420c.class);
    }
}
