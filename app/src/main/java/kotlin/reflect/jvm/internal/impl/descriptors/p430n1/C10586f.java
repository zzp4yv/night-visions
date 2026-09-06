package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Map;
import kotlin.C10740s;
import kotlin.collections.C10777q0;
import kotlin.collections.C10784u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p375b.AbstractC9881h;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10171a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10173b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10181j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10193v;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import okhttp3.HttpUrl;

/* compiled from: annotationUtil.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.f */
/* loaded from: classes2.dex */
public final class C10586f {

    /* renamed from: a */
    private static final C10130f f40802a;

    /* renamed from: b */
    private static final C10130f f40803b;

    /* renamed from: c */
    private static final C10130f f40804c;

    /* renamed from: d */
    private static final C10130f f40805d;

    /* renamed from: e */
    private static final C10130f f40806e;

    /* compiled from: annotationUtil.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.f$a */
    static final class a extends Lambda implements Function1<InterfaceC10559g0, AbstractC10311e0> {

        /* renamed from: f */
        final /* synthetic */ AbstractC9881h f40807f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC9881h abstractC9881h) {
            super(1);
            this.f40807f = abstractC9881h;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(InterfaceC10559g0 interfaceC10559g0) {
            C9768m.m32346f(interfaceC10559g0, "module");
            AbstractC10335m0 m32794l = interfaceC10559g0.mo37021o().m32794l(EnumC10351r1.INVARIANT, this.f40807f.m32784W());
            C9768m.m32345e(m32794l, "module.builtIns.getArray…ce.INVARIANT, stringType)");
            return m32794l;
        }
    }

    static {
        C10130f m35454x = C10130f.m35454x("message");
        C9768m.m32345e(m35454x, "identifier(\"message\")");
        f40802a = m35454x;
        C10130f m35454x2 = C10130f.m35454x("replaceWith");
        C9768m.m32345e(m35454x2, "identifier(\"replaceWith\")");
        f40803b = m35454x2;
        C10130f m35454x3 = C10130f.m35454x("level");
        C9768m.m32345e(m35454x3, "identifier(\"level\")");
        f40804c = m35454x3;
        C10130f m35454x4 = C10130f.m35454x("expression");
        C9768m.m32345e(m35454x4, "identifier(\"expression\")");
        f40805d = m35454x4;
        C10130f m35454x5 = C10130f.m35454x("imports");
        C9768m.m32345e(m35454x5, "identifier(\"imports\")");
        f40806e = m35454x5;
    }

    /* renamed from: a */
    public static final InterfaceC10583c m37731a(AbstractC9881h abstractC9881h, String str, String str2, String str3) {
        Map m38800l;
        Map m38800l2;
        C9768m.m32346f(abstractC9881h, "<this>");
        C9768m.m32346f(str, "message");
        C9768m.m32346f(str2, "replaceWith");
        C9768m.m32346f(str3, "level");
        C10127c c10127c = C9884k.a.f37526B;
        m38800l = C10777q0.m38800l(C10740s.m38547a(f40805d, new C10193v(str2)), C10740s.m38547a(f40806e, new C10173b(C10784u.m38888j(), new a(abstractC9881h))));
        C10590j c10590j = new C10590j(abstractC9881h, c10127c, m38800l);
        C10127c c10127c2 = C9884k.a.f37608y;
        C10130f c10130f = f40804c;
        C10126b m35408m = C10126b.m35408m(C9884k.a.f37524A);
        C9768m.m32345e(m35408m, "topLevel(StandardNames.FqNames.deprecationLevel)");
        C10130f m35454x = C10130f.m35454x(str3);
        C9768m.m32345e(m35454x, "identifier(level)");
        m38800l2 = C10777q0.m38800l(C10740s.m38547a(f40802a, new C10193v(str)), C10740s.m38547a(f40803b, new C10171a(c10590j)), C10740s.m38547a(c10130f, new C10181j(m35408m, m35454x)));
        return new C10590j(abstractC9881h, c10127c2, m38800l2);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC10583c m37732b(AbstractC9881h abstractC9881h, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if ((i2 & 4) != 0) {
            str3 = "WARNING";
        }
        return m37731a(abstractC9881h, str, str2, str3);
    }
}
