package kotlin.reflect.p371y.internal.p374j0.p399h;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10745a0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10128d;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10154d;
import okhttp3.HttpUrl;

/* compiled from: ClassifierNamePolicy.kt */
/* renamed from: kotlin.f0.y.e.j0.h.b */
/* loaded from: classes3.dex */
public interface InterfaceC10138b {

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.b$a */
    public static final class a implements InterfaceC10138b {

        /* renamed from: a */
        public static final a f39368a = new a();

        private a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10138b
        /* renamed from: a */
        public String mo35496a(InterfaceC10561h interfaceC10561h, AbstractC10139c abstractC10139c) {
            C9768m.m32346f(interfaceC10561h, "classifier");
            C9768m.m32346f(abstractC10139c, "renderer");
            if (interfaceC10561h instanceof InterfaceC10554e1) {
                C10130f name = ((InterfaceC10554e1) interfaceC10561h).getName();
                C9768m.m32345e(name, "classifier.name");
                return abstractC10139c.mo35504v(name, false);
            }
            C10128d m35825m = C10154d.m35825m(interfaceC10561h);
            C9768m.m32345e(m35825m, "getFqName(classifier)");
            return abstractC10139c.mo35503u(m35825m);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.b$b */
    public static final class b implements InterfaceC10138b {

        /* renamed from: a */
        public static final b f39369a = new b();

        private b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.h] */
        /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.i0, kotlin.reflect.jvm.internal.impl.descriptors.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.m] */
        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10138b
        /* renamed from: a */
        public String mo35496a(InterfaceC10561h interfaceC10561h, AbstractC10139c abstractC10139c) {
            List m38552F;
            C9768m.m32346f(interfaceC10561h, "classifier");
            C9768m.m32346f(abstractC10139c, "renderer");
            if (interfaceC10561h instanceof InterfaceC10554e1) {
                C10130f name = ((InterfaceC10554e1) interfaceC10561h).getName();
                C9768m.m32345e(name, "classifier.name");
                return abstractC10139c.mo35504v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(interfaceC10561h.getName());
                interfaceC10561h = interfaceC10561h.mo32876b();
            } while (interfaceC10561h instanceof InterfaceC10552e);
            m38552F = C10745a0.m38552F(arrayList);
            return C10150n.m35765c(m38552F);
        }
    }

    /* compiled from: ClassifierNamePolicy.kt */
    /* renamed from: kotlin.f0.y.e.j0.h.b$c */
    public static final class c implements InterfaceC10138b {

        /* renamed from: a */
        public static final c f39370a = new c();

        private c() {
        }

        /* renamed from: b */
        private final String m35497b(InterfaceC10561h interfaceC10561h) {
            C10130f name = interfaceC10561h.getName();
            C9768m.m32345e(name, "descriptor.name");
            String m35764b = C10150n.m35764b(name);
            if (interfaceC10561h instanceof InterfaceC10554e1) {
                return m35764b;
            }
            InterfaceC10576m mo32876b = interfaceC10561h.mo32876b();
            C9768m.m32345e(mo32876b, "descriptor.containingDeclaration");
            String m35498c = m35498c(mo32876b);
            if (m35498c == null || C9768m.m32341a(m35498c, HttpUrl.FRAGMENT_ENCODE_SET)) {
                return m35764b;
            }
            return m35498c + '.' + m35764b;
        }

        /* renamed from: c */
        private final String m35498c(InterfaceC10576m interfaceC10576m) {
            if (interfaceC10576m instanceof InterfaceC10552e) {
                return m35497b((InterfaceC10561h) interfaceC10576m);
            }
            if (!(interfaceC10576m instanceof InterfaceC10571k0)) {
                return null;
            }
            C10128d m35428j = ((InterfaceC10571k0) interfaceC10576m).mo37712d().m35428j();
            C9768m.m32345e(m35428j, "descriptor.fqName.toUnsafe()");
            return C10150n.m35763a(m35428j);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.InterfaceC10138b
        /* renamed from: a */
        public String mo35496a(InterfaceC10561h interfaceC10561h, AbstractC10139c abstractC10139c) {
            C9768m.m32346f(interfaceC10561h, "classifier");
            C9768m.m32346f(abstractC10139c, "renderer");
            return m35497b(interfaceC10561h);
        }
    }

    /* renamed from: a */
    String mo35496a(InterfaceC10561h interfaceC10561h, AbstractC10139c abstractC10139c);
}
