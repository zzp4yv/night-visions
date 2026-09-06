package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10620i;
import kotlin.reflect.jvm.internal.impl.descriptors.p432p1.C10641x;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9899f;
import kotlin.reflect.p371y.internal.p374j0.p375b.p377q.C9901h;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9907c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.InterfaceC10017o;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.InterfaceC9936g;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9956f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.C9960j;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p387m0.InterfaceC9984b;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10074w;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10088i;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10205c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.C10210b;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10268k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10267j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10269l;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10279v;
import kotlin.reflect.p371y.internal.p374j0.p414k.C10289f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10368l;
import kotlin.reflect.p371y.internal.p374j0.p415l.p418v1.C10398a;

/* compiled from: DeserializationComponentsForJava.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.e */
/* loaded from: classes3.dex */
public final class C10056e {

    /* renamed from: a */
    public static final a f38441a = new a(null);

    /* renamed from: b */
    private final C10268k f38442b;

    /* compiled from: DeserializationComponentsForJava.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.e$a */
    public static final class a {

        /* compiled from: DeserializationComponentsForJava.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.e$a$a, reason: collision with other inner class name */
        public static final class C11502a {

            /* renamed from: a */
            private final C10056e f38443a;

            /* renamed from: b */
            private final C10058g f38444b;

            public C11502a(C10056e c10056e, C10058g c10058g) {
                C9768m.m32346f(c10056e, "deserializationComponentsForJava");
                C9768m.m32346f(c10058g, "deserializedDescriptorResolver");
                this.f38443a = c10056e;
                this.f38444b = c10058g;
            }

            /* renamed from: a */
            public final C10056e m33958a() {
                return this.f38443a;
            }

            /* renamed from: b */
            public final C10058g m33959b() {
                return this.f38444b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C11502a m33957a(InterfaceC10066o interfaceC10066o, InterfaceC10066o interfaceC10066o2, InterfaceC10017o interfaceC10017o, String str, InterfaceC10275r interfaceC10275r, InterfaceC9984b interfaceC9984b) {
            C9956f m33961b;
            List m38891m;
            C9768m.m32346f(interfaceC10066o, "kotlinClassFinder");
            C9768m.m32346f(interfaceC10066o2, "jvmBuiltInsKotlinClassFinder");
            C9768m.m32346f(interfaceC10017o, "javaClassFinder");
            C9768m.m32346f(str, "moduleName");
            C9768m.m32346f(interfaceC10275r, "errorReporter");
            C9768m.m32346f(interfaceC9984b, "javaSourceElementFactory");
            C10289f c10289f = new C10289f("DeserializationComponentsForJava.ModuleData");
            C9899f c9899f = new C9899f(c10289f, C9899f.a.FROM_DEPENDENCIES);
            C10130f m35451D = C10130f.m35451D('<' + str + '>');
            C9768m.m32345e(m35451D, "special(\"<$moduleName>\")");
            C10641x c10641x = new C10641x(m35451D, c10289f, c9899f, null, null, null, 56, null);
            c9899f.m32769D0(c10641x);
            c9899f.m32956I0(c10641x, true);
            C10058g c10058g = new C10058g();
            C9960j c9960j = new C9960j();
            C10568j0 c10568j0 = new C10568j0(c10289f, c10641x);
            m33961b = C10057f.m33961b(interfaceC10017o, c10641x, c10289f, c10568j0, interfaceC10066o, c10058g, interfaceC10275r, interfaceC9984b, c9960j, (r21 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? InterfaceC10074w.a.f38487a : null);
            C10056e m33960a = C10057f.m33960a(c10641x, c10289f, c10568j0, m33961b, interfaceC10066o, c10058g, interfaceC10275r);
            c10058g.m33974l(m33960a);
            InterfaceC9936g interfaceC9936g = InterfaceC9936g.f37920a;
            C9768m.m32345e(interfaceC9936g, "EMPTY");
            C10205c c10205c = new C10205c(m33961b, interfaceC9936g);
            c9960j.m33297c(c10205c);
            C9901h c9901h = new C9901h(c10289f, interfaceC10066o2, c10641x, c10568j0, c9899f.m32955H0(), c9899f.m32955H0(), InterfaceC10269l.a.f39932a, InterfaceC10368l.f40201b.m36950a(), new C10210b(c10289f, C10784u.m38888j()));
            c10641x.m37998Z0(c10641x);
            m38891m = C10784u.m38891m(c10205c.m36104a(), c9901h);
            c10641x.m37993T0(new C10620i(m38891m, "CompositeProvider@RuntimeModuleData for " + c10641x));
            return new C11502a(m33960a, c10058g);
        }
    }

    public C10056e(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0, InterfaceC10269l interfaceC10269l, C10059h c10059h, C10052c c10052c, C9956f c9956f, C10568j0 c10568j0, InterfaceC10275r interfaceC10275r, InterfaceC9907c interfaceC9907c, InterfaceC10267j interfaceC10267j, InterfaceC10368l interfaceC10368l, C10398a c10398a) {
        InterfaceC10599c m32955H0;
        InterfaceC10597a m32955H02;
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10559g0, "moduleDescriptor");
        C9768m.m32346f(interfaceC10269l, "configuration");
        C9768m.m32346f(c10059h, "classDataFinder");
        C9768m.m32346f(c10052c, "annotationAndConstantLoader");
        C9768m.m32346f(c9956f, "packageFragmentProvider");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        C9768m.m32346f(interfaceC10275r, "errorReporter");
        C9768m.m32346f(interfaceC9907c, "lookupTracker");
        C9768m.m32346f(interfaceC10267j, "contractDeserializer");
        C9768m.m32346f(interfaceC10368l, "kotlinTypeChecker");
        C9768m.m32346f(c10398a, "typeAttributeTranslators");
        AbstractC9881h mo37021o = interfaceC10559g0.mo37021o();
        C9899f c9899f = mo37021o instanceof C9899f ? (C9899f) mo37021o : null;
        this.f38442b = new C10268k(interfaceC10297n, interfaceC10559g0, interfaceC10269l, c10059h, c10052c, c9956f, InterfaceC10279v.a.f39960a, interfaceC10275r, interfaceC9907c, C10060i.f38455a, C10784u.m38888j(), c10568j0, interfaceC10267j, (c9899f == null || (m32955H02 = c9899f.m32955H0()) == null) ? InterfaceC10597a.a.f40889a : m32955H02, (c9899f == null || (m32955H0 = c9899f.m32955H0()) == null) ? InterfaceC10599c.b.f40891a : m32955H0, C10088i.f38607a.m34265a(), interfaceC10368l, new C10210b(interfaceC10297n, C10784u.m38888j()), null, c10398a.m37084a(), 262144, null);
    }

    /* renamed from: a */
    public final C10268k m33956a() {
        return this.f38442b;
    }
}
