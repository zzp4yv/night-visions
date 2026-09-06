package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10278u;

/* compiled from: KotlinClassFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.o */
/* loaded from: classes3.dex */
public interface InterfaceC10066o extends InterfaceC10278u {

    /* compiled from: KotlinClassFinder.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.o$a */
    public static abstract class a {

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.o$a$a, reason: collision with other inner class name */
        public static final class C11503a extends a {

            /* renamed from: a */
            private final byte[] f38477a;

            /* renamed from: b */
            public final byte[] m34021b() {
                return this.f38477a;
            }
        }

        /* compiled from: KotlinClassFinder.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.o$a$b */
        public static final class b extends a {

            /* renamed from: a */
            private final InterfaceC10068q f38478a;

            /* renamed from: b */
            private final byte[] f38479b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC10068q interfaceC10068q, byte[] bArr) {
                super(null);
                C9768m.m32346f(interfaceC10068q, "kotlinJvmBinaryClass");
                this.f38478a = interfaceC10068q;
                this.f38479b = bArr;
            }

            /* renamed from: b */
            public final InterfaceC10068q m34022b() {
                return this.f38478a;
            }

            public /* synthetic */ b(InterfaceC10068q interfaceC10068q, byte[] bArr, int i2, C9756g c9756g) {
                this(interfaceC10068q, (i2 & 2) != 0 ? null : bArr);
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC10068q m34020a() {
            b bVar = this instanceof b ? (b) this : null;
            if (bVar != null) {
                return bVar.m34022b();
            }
            return null;
        }
    }

    /* renamed from: a */
    a mo34018a(InterfaceC9997g interfaceC9997g);

    /* renamed from: c */
    a mo34019c(C10126b c10126b);
}
