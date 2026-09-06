package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;

/* compiled from: MemberScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.c */
/* loaded from: classes3.dex */
public abstract class AbstractC10213c {

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.c$a */
    public static final class a extends AbstractC10213c {

        /* renamed from: a */
        public static final a f39627a = new a();

        /* renamed from: b */
        private static final int f39628b;

        static {
            C10214d.a aVar = C10214d.f39630a;
            f39628b = ((aVar.m36150i() | aVar.m36145d()) ^ (-1)) & aVar.m36143b();
        }

        private a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10213c
        /* renamed from: a */
        public int mo36126a() {
            return f39628b;
        }
    }

    /* compiled from: MemberScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.c$b */
    public static final class b extends AbstractC10213c {

        /* renamed from: a */
        public static final b f39629a = new b();

        private b() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10213c
        /* renamed from: a */
        public int mo36126a() {
            return 0;
        }
    }

    /* renamed from: a */
    public abstract int mo36126a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
