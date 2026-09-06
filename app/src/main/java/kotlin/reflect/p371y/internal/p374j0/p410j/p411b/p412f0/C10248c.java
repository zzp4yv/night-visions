package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0;

import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9875b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10101m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p395y.C10113a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p395y.C10115c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p405t.C10202a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10274q;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;

/* compiled from: BuiltInsPackageFragmentImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.f0.c */
/* loaded from: classes3.dex */
public final class C10248c extends AbstractC10274q implements InterfaceC9875b {

    /* renamed from: s */
    public static final a f39756s = new a(null);

    /* renamed from: t */
    private final boolean f39757t;

    /* compiled from: BuiltInsPackageFragmentImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.f0.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10248c m36250a(C10127c c10127c, InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, InputStream inputStream, boolean z) {
            C9768m.m32346f(c10127c, "fqName");
            C9768m.m32346f(interfaceC10297n, "storageManager");
            C9768m.m32346f(interfaceC10559g0, "module");
            C9768m.m32346f(inputStream, "inputStream");
            Pair<C10101m, C10113a> m35357a = C10115c.m35357a(inputStream);
            C10101m m37646a = m35357a.m37646a();
            C10113a m37647b = m35357a.m37647b();
            if (m37646a != null) {
                return new C10248c(c10127c, interfaceC10297n, interfaceC10559g0, m37646a, m37647b, z, null);
            }
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + C10113a.f39169h + ", actual " + m37647b + ". Please update Kotlin");
        }
    }

    private C10248c(C10127c c10127c, InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, C10101m c10101m, C10113a c10113a, boolean z) {
        super(c10127c, interfaceC10297n, interfaceC10559g0, c10101m, c10113a, null);
        this.f39757t = z;
    }

    public /* synthetic */ C10248c(C10127c c10127c, InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, C10101m c10101m, C10113a c10113a, boolean z, C9756g c9756g) {
        this(c10127c, interfaceC10297n, interfaceC10559g0, c10101m, c10113a, z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10643z, kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j
    public String toString() {
        return "builtins package fragment for " + mo37712d() + " from " + C10202a.m36078l(this);
    }
}
