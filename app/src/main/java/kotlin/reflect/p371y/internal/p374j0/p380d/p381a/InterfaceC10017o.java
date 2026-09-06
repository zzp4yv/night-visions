package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Arrays;
import java.util.Set;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10011u;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: JavaClassFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o */
/* loaded from: classes2.dex */
public interface InterfaceC10017o {

    /* compiled from: JavaClassFinder.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o$a */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ InterfaceC10011u m33632a(InterfaceC10017o interfaceC10017o, C10127c c10127c, boolean z, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findPackage");
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            return interfaceC10017o.mo33631c(c10127c, z);
        }
    }

    /* renamed from: a */
    InterfaceC9997g mo33629a(b bVar);

    /* renamed from: b */
    Set<String> mo33630b(C10127c c10127c);

    /* renamed from: c */
    InterfaceC10011u mo33631c(C10127c c10127c, boolean z);

    /* compiled from: JavaClassFinder.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.o$b */
    public static final class b {

        /* renamed from: a */
        private final C10126b f38197a;

        /* renamed from: b */
        private final byte[] f38198b;

        /* renamed from: c */
        private final InterfaceC9997g f38199c;

        public b(C10126b c10126b, byte[] bArr, InterfaceC9997g interfaceC9997g) {
            C9768m.m32346f(c10126b, "classId");
            this.f38197a = c10126b;
            this.f38198b = bArr;
            this.f38199c = interfaceC9997g;
        }

        /* renamed from: a */
        public final C10126b m33633a() {
            return this.f38197a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C9768m.m32341a(this.f38197a, bVar.f38197a) && C9768m.m32341a(this.f38198b, bVar.f38198b) && C9768m.m32341a(this.f38199c, bVar.f38199c);
        }

        public int hashCode() {
            int hashCode = this.f38197a.hashCode() * 31;
            byte[] bArr = this.f38198b;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC9997g interfaceC9997g = this.f38199c;
            return hashCode2 + (interfaceC9997g != null ? interfaceC9997g.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f38197a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f38198b) + ", outerClass=" + this.f38199c + ')';
        }

        public /* synthetic */ b(C10126b c10126b, byte[] bArr, InterfaceC9997g interfaceC9997g, int i2, C9756g c9756g) {
            this(c10126b, (i2 & 2) != 0 ? null : bArr, (i2 & 4) != 0 ? null : interfaceC9997g);
        }
    }
}
