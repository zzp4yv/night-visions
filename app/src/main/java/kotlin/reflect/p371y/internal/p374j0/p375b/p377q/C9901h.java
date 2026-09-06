package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.io.InputStream;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10597a;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10599c;
import kotlin.reflect.p371y.internal.p374j0.p375b.p376p.C9889a;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9907c;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10066o;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p407v.InterfaceC10209a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10235a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10273p;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10241d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10268k;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10272o;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10267j;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10269l;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10275r;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10276s;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10279v;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0.C10246a;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0.C10248c;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10368l;

/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.h */
/* loaded from: classes2.dex */
public final class C9901h extends AbstractC10235a {

    /* renamed from: f */
    public static final a f37741f = new a(null);

    /* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    /* renamed from: kotlin.f0.y.e.j0.b.q.h$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9901h(InterfaceC10297n interfaceC10297n, InterfaceC10066o interfaceC10066o, InterfaceC10559g0 interfaceC10559g0, C10568j0 c10568j0, InterfaceC10597a interfaceC10597a, InterfaceC10599c interfaceC10599c, InterfaceC10269l interfaceC10269l, InterfaceC10368l interfaceC10368l, InterfaceC10209a interfaceC10209a) {
        super(interfaceC10297n, interfaceC10066o, interfaceC10559g0);
        List m38891m;
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10066o, "finder");
        C9768m.m32346f(interfaceC10559g0, "moduleDescriptor");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        C9768m.m32346f(interfaceC10597a, "additionalClassPartsProvider");
        C9768m.m32346f(interfaceC10599c, "platformDependentDeclarationFilter");
        C9768m.m32346f(interfaceC10269l, "deserializationConfiguration");
        C9768m.m32346f(interfaceC10368l, "kotlinTypeChecker");
        C9768m.m32346f(interfaceC10209a, "samConversionResolver");
        C10272o c10272o = new C10272o(this);
        C10246a c10246a = C10246a.f39754n;
        C10241d c10241d = new C10241d(interfaceC10559g0, c10568j0, c10246a);
        InterfaceC10279v.a aVar = InterfaceC10279v.a.f39960a;
        InterfaceC10275r interfaceC10275r = InterfaceC10275r.f39954a;
        C9768m.m32345e(interfaceC10275r, "DO_NOTHING");
        InterfaceC9907c.a aVar2 = InterfaceC9907c.a.f37749a;
        InterfaceC10276s.a aVar3 = InterfaceC10276s.a.f39955a;
        m38891m = C10784u.m38891m(new C9889a(interfaceC10297n, interfaceC10559g0), new C9898e(interfaceC10297n, interfaceC10559g0, null, 4, null));
        m36202i(new C10268k(interfaceC10297n, interfaceC10559g0, interfaceC10269l, c10272o, c10241d, this, aVar, interfaceC10275r, aVar2, aVar3, m38891m, c10568j0, InterfaceC10267j.f39908a.m36415a(), interfaceC10597a, interfaceC10599c, c10246a.m36190e(), interfaceC10368l, interfaceC10209a, null, null, 786432, null));
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10235a
    /* renamed from: d */
    protected AbstractC10273p mo33001d(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        InputStream mo36473b = m36199f().mo36473b(c10127c);
        if (mo36473b != null) {
            return C10248c.f39756s.m36250a(c10127c, m36201h(), m36200g(), mo36473b, false);
        }
        return null;
    }
}
