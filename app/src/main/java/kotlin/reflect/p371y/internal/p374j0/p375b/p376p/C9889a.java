package kotlin.reflect.p371y.internal.p374j0.p375b.p376p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10780s;
import kotlin.collections.C10789w0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0;
import kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9875b;
import kotlin.reflect.p371y.internal.p374j0.p375b.InterfaceC9879f;
import kotlin.reflect.p371y.internal.p374j0.p375b.p376p.EnumC9891c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.text.C10513u;
import kotlin.text.C10514v;

/* compiled from: BuiltInFictitiousFunctionClassFactory.kt */
/* renamed from: kotlin.f0.y.e.j0.b.p.a */
/* loaded from: classes2.dex */
public final class C9889a implements InterfaceC10598b {

    /* renamed from: a */
    private final InterfaceC10297n f37635a;

    /* renamed from: b */
    private final InterfaceC10559g0 f37636b;

    public C9889a(InterfaceC10297n interfaceC10297n, InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10559g0, "module");
        this.f37635a = interfaceC10297n;
        this.f37636b = interfaceC10559g0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b
    /* renamed from: a */
    public Collection<InterfaceC10552e> mo32848a(C10127c c10127c) {
        Set m38917d;
        C9768m.m32346f(c10127c, "packageFqName");
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b
    /* renamed from: b */
    public boolean mo32849b(C10127c c10127c, C10130f c10130f) {
        C9768m.m32346f(c10127c, "packageFqName");
        C9768m.m32346f(c10130f, "name");
        String m35455k = c10130f.m35455k();
        C9768m.m32345e(m35455k, "name.asString()");
        return (C10513u.m37511E(m35455k, "Function", false, 2, null) || C10513u.m37511E(m35455k, "KFunction", false, 2, null) || C10513u.m37511E(m35455k, "SuspendFunction", false, 2, null) || C10513u.m37511E(m35455k, "KSuspendFunction", false, 2, null)) && EnumC9891c.f37649f.m32900c(m35455k, c10127c) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b
    /* renamed from: c */
    public InterfaceC10552e mo32850c(C10126b c10126b) {
        boolean m37538J;
        C9768m.m32346f(c10126b, "classId");
        if (c10126b.m35416k() || c10126b.m35417l()) {
            return null;
        }
        String m35420b = c10126b.m35414i().m35420b();
        C9768m.m32345e(m35420b, "classId.relativeClassName.asString()");
        m37538J = C10514v.m37538J(m35420b, "Function", false, 2, null);
        if (!m37538J) {
            return null;
        }
        C10127c m35413h = c10126b.m35413h();
        C9768m.m32345e(m35413h, "classId.packageFqName");
        EnumC9891c.a.C11494a m32900c = EnumC9891c.f37649f.m32900c(m35420b, m35413h);
        if (m32900c == null) {
            return null;
        }
        EnumC9891c m32901a = m32900c.m32901a();
        int m32902b = m32900c.m32902b();
        List<InterfaceC10571k0> mo37749I = this.f37636b.mo37018N(m35413h).mo37749I();
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo37749I) {
            if (obj instanceof InterfaceC9875b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof InterfaceC9879f) {
                arrayList2.add(obj2);
            }
        }
        InterfaceC10571k0 interfaceC10571k0 = (InterfaceC9879f) C10780s.m38832W(arrayList2);
        if (interfaceC10571k0 == null) {
            interfaceC10571k0 = (InterfaceC9875b) C10780s.m38830U(arrayList);
        }
        return new C9890b(this.f37635a, interfaceC10571k0, m32901a, m32902b);
    }
}
