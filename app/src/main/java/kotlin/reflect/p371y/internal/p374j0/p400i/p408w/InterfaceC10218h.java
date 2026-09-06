package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.Collection;
import java.util.Set;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: MemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.h */
/* loaded from: classes3.dex */
public interface InterfaceC10218h extends InterfaceC10221k {

    /* renamed from: a */
    public static final a f39667a = a.f39668a;

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.h$a */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f39668a = new a();

        /* renamed from: b */
        private static final Function1<C10130f, Boolean> f39669b = C11515a.f39670f;

        /* compiled from: MemberScope.kt */
        /* renamed from: kotlin.f0.y.e.j0.i.w.h$a$a, reason: collision with other inner class name */
        static final class C11515a extends Lambda implements Function1<C10130f, Boolean> {

            /* renamed from: f */
            public static final C11515a f39670f = new C11515a();

            C11515a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(C10130f c10130f) {
                C9768m.m32346f(c10130f, "it");
                return Boolean.TRUE;
            }
        }

        private a() {
        }

        /* renamed from: a */
        public final Function1<C10130f, Boolean> m36159a() {
            return f39669b;
        }
    }

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.h$b */
    public static final class b extends AbstractC10219i {

        /* renamed from: b */
        public static final b f39671b = new b();

        private b() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: b */
        public Set<C10130f> mo33312b() {
            Set<C10130f> m38917d;
            m38917d = C10789w0.m38917d();
            return m38917d;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: d */
        public Set<C10130f> mo33314d() {
            Set<C10130f> m38917d;
            m38917d = C10789w0.m38917d();
            return m38917d;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10219i, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
        /* renamed from: e */
        public Set<C10130f> mo33315e() {
            Set<C10130f> m38917d;
            m38917d = C10789w0.m38917d();
            return m38917d;
        }
    }

    /* renamed from: a */
    Collection<? extends InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b);

    /* renamed from: b */
    Set<C10130f> mo33312b();

    /* renamed from: c */
    Collection<? extends InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b);

    /* renamed from: d */
    Set<C10130f> mo33314d();

    /* renamed from: e */
    Set<C10130f> mo33315e();
}
