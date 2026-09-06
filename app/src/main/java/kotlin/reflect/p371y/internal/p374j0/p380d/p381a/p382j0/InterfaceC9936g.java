package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10002l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10004n;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10007q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: JavaResolverCache.java */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.g */
/* loaded from: classes2.dex */
public interface InterfaceC9936g {

    /* renamed from: a */
    public static final InterfaceC9936g f37920a = new a();

    /* compiled from: JavaResolverCache.java */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.g$a */
    static class a implements InterfaceC9936g {
        a() {
        }

        /* renamed from: f */
        private static /* synthetic */ void m33183f(int i2) {
            Object[] objArr = new Object[3];
            switch (i2) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i2) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9936g
        /* renamed from: a */
        public InterfaceC10552e mo33178a(C10127c c10127c) {
            if (c10127c != null) {
                return null;
            }
            m33183f(0);
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9936g
        /* renamed from: b */
        public void mo33179b(InterfaceC10002l interfaceC10002l, InterfaceC10573l interfaceC10573l) {
            if (interfaceC10002l == null) {
                m33183f(3);
            }
            if (interfaceC10573l == null) {
                m33183f(4);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9936g
        /* renamed from: c */
        public void mo33180c(InterfaceC9997g interfaceC9997g, InterfaceC10552e interfaceC10552e) {
            if (interfaceC9997g == null) {
                m33183f(7);
            }
            if (interfaceC10552e == null) {
                m33183f(8);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9936g
        /* renamed from: d */
        public void mo33181d(InterfaceC10004n interfaceC10004n, InterfaceC10696t0 interfaceC10696t0) {
            if (interfaceC10004n == null) {
                m33183f(5);
            }
            if (interfaceC10696t0 == null) {
                m33183f(6);
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9936g
        /* renamed from: e */
        public void mo33182e(InterfaceC10007q interfaceC10007q, InterfaceC10706y0 interfaceC10706y0) {
            if (interfaceC10007q == null) {
                m33183f(1);
            }
            if (interfaceC10706y0 == null) {
                m33183f(2);
            }
        }
    }

    /* renamed from: a */
    InterfaceC10552e mo33178a(C10127c c10127c);

    /* renamed from: b */
    void mo33179b(InterfaceC10002l interfaceC10002l, InterfaceC10573l interfaceC10573l);

    /* renamed from: c */
    void mo33180c(InterfaceC9997g interfaceC9997g, InterfaceC10552e interfaceC10552e);

    /* renamed from: d */
    void mo33181d(InterfaceC10004n interfaceC10004n, InterfaceC10696t0 interfaceC10696t0);

    /* renamed from: e */
    void mo33182e(InterfaceC10007q interfaceC10007q, InterfaceC10706y0 interfaceC10706y0);
}
