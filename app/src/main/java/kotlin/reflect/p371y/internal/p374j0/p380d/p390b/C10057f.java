package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.List;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10548c1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9883j;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9907c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10044w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9917d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10017o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10037p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10041t;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9935f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9936g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9939j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9952b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9956f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9953c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.InterfaceC9959i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC9984b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9986a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10021d;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10029l;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.C10210b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10267j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10269l;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10340o;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10368l;
import kotlin.reflect.p371y.internal.p374j0.p415l.p418v1.C10398a;

/* compiled from: DeserializationComponentsForJava.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.f */
/* loaded from: classes3.dex */
public final class C10057f {

    /* compiled from: DeserializationComponentsForJava.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.f$a */
    public static final class a implements InterfaceC10041t {
        a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10041t
        /* renamed from: a */
        public List<InterfaceC9986a> mo33803a(C10126b c10126b) {
            C9768m.m32346f(c10126b, "classId");
            return null;
        }
    }

    /* renamed from: a */
    public static final C10056e m33960a(InterfaceC10559g0 interfaceC10559g0, InterfaceC10297n interfaceC10297n, C10568j0 c10568j0, C9956f c9956f, InterfaceC10066o interfaceC10066o, C10058g c10058g, InterfaceC10275r interfaceC10275r) {
        C9768m.m32346f(interfaceC10559g0, "module");
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        C9768m.m32346f(c9956f, "lazyJavaPackageFragmentProvider");
        C9768m.m32346f(interfaceC10066o, "reflectKotlinClassFinder");
        C9768m.m32346f(c10058g, "deserializedDescriptorResolver");
        C9768m.m32346f(interfaceC10275r, "errorReporter");
        return new C10056e(interfaceC10297n, interfaceC10559g0, InterfaceC10269l.a.f39932a, new C10059h(interfaceC10066o, c10058g), new C10052c(interfaceC10559g0, c10568j0, interfaceC10297n, interfaceC10066o), c9956f, c10568j0, interfaceC10275r, InterfaceC9907c.a.f37749a, InterfaceC10267j.f39908a.m36415a(), InterfaceC10368l.f40201b.m36950a(), new C10398a(C10782t.m38883e(C10340o.f40157a)));
    }

    /* renamed from: b */
    public static final C9956f m33961b(InterfaceC10017o interfaceC10017o, InterfaceC10559g0 interfaceC10559g0, InterfaceC10297n interfaceC10297n, C10568j0 c10568j0, InterfaceC10066o interfaceC10066o, C10058g c10058g, InterfaceC10275r interfaceC10275r, InterfaceC9984b interfaceC9984b, InterfaceC9959i interfaceC9959i, InterfaceC10074w interfaceC10074w) {
        C9768m.m32346f(interfaceC10017o, "javaClassFinder");
        C9768m.m32346f(interfaceC10559g0, "module");
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        C9768m.m32346f(interfaceC10066o, "reflectKotlinClassFinder");
        C9768m.m32346f(c10058g, "deserializedDescriptorResolver");
        C9768m.m32346f(interfaceC10275r, "errorReporter");
        C9768m.m32346f(interfaceC9984b, "javaSourceElementFactory");
        C9768m.m32346f(interfaceC9959i, "singleModuleClassResolver");
        C9768m.m32346f(interfaceC10074w, "packagePartProvider");
        InterfaceC9939j interfaceC9939j = InterfaceC9939j.f37927a;
        C9768m.m32345e(interfaceC9939j, "DO_NOTHING");
        InterfaceC9936g interfaceC9936g = InterfaceC9936g.f37920a;
        C9768m.m32345e(interfaceC9936g, "EMPTY");
        InterfaceC9935f.a aVar = InterfaceC9935f.a.f37919a;
        C10210b c10210b = new C10210b(interfaceC10297n, C10784u.m38888j());
        InterfaceC10548c1.a aVar2 = InterfaceC10548c1.a.f40737a;
        InterfaceC9907c.a aVar3 = InterfaceC9907c.a.f37749a;
        C9883j c9883j = new C9883j(interfaceC10559g0, c10568j0);
        C10044w.b bVar = C10044w.f38316a;
        C9917d c9917d = new C9917d(bVar.m33821a());
        InterfaceC9953c.b bVar2 = InterfaceC9953c.b.f37988b;
        return new C9956f(new C9952b(interfaceC10297n, interfaceC10017o, interfaceC10066o, c10058g, interfaceC9939j, interfaceC10275r, interfaceC9936g, aVar, c10210b, interfaceC9984b, interfaceC9959i, interfaceC10074w, aVar2, aVar3, interfaceC10559g0, c9883j, c9917d, new C10029l(new C10021d(bVar2)), InterfaceC10037p.a.f38298a, bVar2, InterfaceC10368l.f40201b.m36950a(), bVar.m33821a(), new a(), null, 8388608, null));
    }
}
