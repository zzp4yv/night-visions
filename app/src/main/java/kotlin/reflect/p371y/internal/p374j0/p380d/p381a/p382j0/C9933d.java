package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10740s;
import kotlin.collections.C10777q0;
import kotlin.collections.C10786v;
import kotlin.collections.C10789w0;
import kotlin.collections.C10794z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.EnumC10593m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.EnumC10594n;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10003m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9988b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10173b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10181j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: JavaAnnotationMapper.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.j0.d */
/* loaded from: classes2.dex */
public final class C9933d {

    /* renamed from: a */
    public static final C9933d f37912a = new C9933d();

    /* renamed from: b */
    private static final Map<String, EnumSet<EnumC10594n>> f37913b;

    /* renamed from: c */
    private static final Map<String, EnumC10593m> f37914c;

    /* compiled from: JavaAnnotationMapper.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.j0.d$a */
    static final class a extends Lambda implements Function1<InterfaceC10559g0, AbstractC10311e0> {

        /* renamed from: f */
        public static final a f37915f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AbstractC10311e0 invoke(InterfaceC10559g0 interfaceC10559g0) {
            C9768m.m32346f(interfaceC10559g0, "module");
            InterfaceC10566i1 m33149b = C9930a.m33149b(C9932c.f37907a.m33170d(), interfaceC10559g0.mo37021o().m32797o(C9884k.a.f37538H));
            AbstractC10311e0 type = m33149b != null ? m33149b.getType() : null;
            return type == null ? C10394k.m37053d(EnumC10393j.f40281G0, new String[0]) : type;
        }
    }

    static {
        Map<String, EnumSet<EnumC10594n>> m38800l;
        Map<String, EnumC10593m> m38800l2;
        m38800l = C10777q0.m38800l(C10740s.m38547a("PACKAGE", EnumSet.noneOf(EnumC10594n.class)), C10740s.m38547a("TYPE", EnumSet.of(EnumC10594n.f40883w, EnumC10594n.f40836J)), C10740s.m38547a("ANNOTATION_TYPE", EnumSet.of(EnumC10594n.f40884x)), C10740s.m38547a("TYPE_PARAMETER", EnumSet.of(EnumC10594n.f40885y)), C10740s.m38547a("FIELD", EnumSet.of(EnumC10594n.f40827A)), C10740s.m38547a("LOCAL_VARIABLE", EnumSet.of(EnumC10594n.f40828B)), C10740s.m38547a("PARAMETER", EnumSet.of(EnumC10594n.f40829C)), C10740s.m38547a("CONSTRUCTOR", EnumSet.of(EnumC10594n.f40830D)), C10740s.m38547a("METHOD", EnumSet.of(EnumC10594n.f40831E, EnumC10594n.f40832F, EnumC10594n.f40833G)), C10740s.m38547a("TYPE_USE", EnumSet.of(EnumC10594n.f40834H)));
        f37913b = m38800l;
        m38800l2 = C10777q0.m38800l(C10740s.m38547a("RUNTIME", EnumC10593m.RUNTIME), C10740s.m38547a("CLASS", EnumC10593m.BINARY), C10740s.m38547a("SOURCE", EnumC10593m.SOURCE));
        f37914c = m38800l2;
    }

    private C9933d() {
    }

    /* renamed from: a */
    public final AbstractC10178g<?> m33172a(InterfaceC9988b interfaceC9988b) {
        InterfaceC10003m interfaceC10003m = interfaceC9988b instanceof InterfaceC10003m ? (InterfaceC10003m) interfaceC9988b : null;
        if (interfaceC10003m == null) {
            return null;
        }
        Map<String, EnumC10593m> map = f37914c;
        C10130f mo33612d = interfaceC10003m.mo33612d();
        EnumC10593m enumC10593m = map.get(mo33612d != null ? mo33612d.m35455k() : null);
        if (enumC10593m == null) {
            return null;
        }
        C10126b m35408m = C10126b.m35408m(C9884k.a.f37544K);
        C9768m.m32345e(m35408m, "topLevel(StandardNames.F…ames.annotationRetention)");
        C10130f m35454x = C10130f.m35454x(enumC10593m.name());
        C9768m.m32345e(m35454x, "identifier(retention.name)");
        return new C10181j(m35408m, m35454x);
    }

    /* renamed from: b */
    public final Set<EnumC10594n> m33173b(String str) {
        Set<EnumC10594n> m38917d;
        EnumSet<EnumC10594n> enumSet = f37913b.get(str);
        if (enumSet != null) {
            return enumSet;
        }
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    /* renamed from: c */
    public final AbstractC10178g<?> m33174c(List<? extends InterfaceC9988b> list) {
        C9768m.m32346f(list, "arguments");
        ArrayList<InterfaceC10003m> arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof InterfaceC10003m) {
                arrayList.add(obj);
            }
        }
        ArrayList<EnumC10594n> arrayList2 = new ArrayList();
        for (InterfaceC10003m interfaceC10003m : arrayList) {
            C9933d c9933d = f37912a;
            C10130f mo33612d = interfaceC10003m.mo33612d();
            C10794z.m38933z(arrayList2, c9933d.m33173b(mo33612d != null ? mo33612d.m35455k() : null));
        }
        ArrayList arrayList3 = new ArrayList(C10786v.m38911u(arrayList2, 10));
        for (EnumC10594n enumC10594n : arrayList2) {
            C10126b m35408m = C10126b.m35408m(C9884k.a.f37542J);
            C9768m.m32345e(m35408m, "topLevel(StandardNames.FqNames.annotationTarget)");
            C10130f m35454x = C10130f.m35454x(enumC10594n.name());
            C9768m.m32345e(m35454x, "identifier(kotlinTarget.name)");
            arrayList3.add(new C10181j(m35408m, m35454x));
        }
        return new C10173b(arrayList3, a.f37915f);
    }
}
