package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10542a1;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10100l;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10079a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10084e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10120e;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10206d;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10277t;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.EnumC10255e;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10256f;
import kotlin.text.C10514v;

/* compiled from: JvmPackagePartSource.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.k */
/* loaded from: classes3.dex */
public final class C10062k implements InterfaceC10256f {

    /* renamed from: b */
    private final C10206d f38456b;

    /* renamed from: c */
    private final C10206d f38457c;

    /* renamed from: d */
    private final C10277t<C10084e> f38458d;

    /* renamed from: e */
    private final boolean f38459e;

    /* renamed from: f */
    private final EnumC10255e f38460f;

    /* renamed from: g */
    private final InterfaceC10068q f38461g;

    /* renamed from: h */
    private final String f38462h;

    public C10062k(C10206d c10206d, C10206d c10206d2, C10100l c10100l, InterfaceC10118c interfaceC10118c, C10277t<C10084e> c10277t, boolean z, EnumC10255e enumC10255e, InterfaceC10068q interfaceC10068q) {
        String string;
        C9768m.m32346f(c10206d, "className");
        C9768m.m32346f(c10100l, "packageProto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(enumC10255e, "abiStability");
        this.f38456b = c10206d;
        this.f38457c = c10206d2;
        this.f38458d = c10277t;
        this.f38459e = z;
        this.f38460f = enumC10255e;
        this.f38461g = interfaceC10068q;
        AbstractC10716h.f<C10100l, Integer> fVar = C10079a.f38503m;
        C9768m.m32345e(fVar, "packageModuleName");
        Integer num = (Integer) C10120e.m35380a(c10100l, fVar);
        this.f38462h = (num == null || (string = interfaceC10118c.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0
    /* renamed from: a */
    public InterfaceC10542a1 mo33980a() {
        InterfaceC10542a1 interfaceC10542a1 = InterfaceC10542a1.f40728a;
        C9768m.m32345e(interfaceC10542a1, "NO_SOURCE_FILE");
        return interfaceC10542a1;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.InterfaceC10256f
    /* renamed from: c */
    public String mo33981c() {
        return "Class '" + m33982d().m35409b().m35420b() + '\'';
    }

    /* renamed from: d */
    public final C10126b m33982d() {
        return new C10126b(m33983e().m36112g(), m33986h());
    }

    /* renamed from: e */
    public C10206d m33983e() {
        return this.f38456b;
    }

    /* renamed from: f */
    public C10206d m33984f() {
        return this.f38457c;
    }

    /* renamed from: g */
    public final InterfaceC10068q m33985g() {
        return this.f38461g;
    }

    /* renamed from: h */
    public final C10130f m33986h() {
        String m37537I0;
        String m36111f = m33983e().m36111f();
        C9768m.m32345e(m36111f, "className.internalName");
        m37537I0 = C10514v.m37537I0(m36111f, '/', null, 2, null);
        C10130f m35454x = C10130f.m35454x(m37537I0);
        C9768m.m32345e(m35454x, "identifier(className.int….substringAfterLast('/'))");
        return m35454x;
    }

    public String toString() {
        return C10062k.class.getSimpleName() + ": " + m33983e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10062k(kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q r11, kotlin.reflect.p371y.internal.p374j0.p392e.C10100l r12, kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c r13, kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10277t<kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b.C10084e> r14, boolean r15, kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.EnumC10255e r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            r9 = r11
            kotlin.jvm.internal.C9768m.m32346f(r11, r0)
            java.lang.String r0 = "packageProto"
            r4 = r12
            kotlin.jvm.internal.C9768m.m32346f(r12, r0)
            java.lang.String r0 = "nameResolver"
            r5 = r13
            kotlin.jvm.internal.C9768m.m32346f(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            kotlin.jvm.internal.C9768m.m32346f(r8, r0)
            kotlin.f0.y.e.j0.f.b r0 = r11.mo34028e()
            kotlin.f0.y.e.j0.i.u.d r2 = kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10206d.m36107b(r0)
            java.lang.String r0 = "byClassId(kotlinClass.classId)"
            kotlin.jvm.internal.C9768m.m32345e(r2, r0)
            kotlin.f0.y.e.j0.d.b.c0.a r0 = r11.mo34025a()
            java.lang.String r0 = r0.m33915e()
            r1 = 0
            if (r0 == 0) goto L40
            int r3 = r0.length()
            if (r3 <= 0) goto L39
            r3 = 1
            goto L3a
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L40
            kotlin.f0.y.e.j0.i.u.d r1 = kotlin.reflect.p371y.internal.p374j0.p400i.p406u.C10206d.m36109d(r0)
        L40:
            r3 = r1
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10062k.<init>(kotlin.f0.y.e.j0.d.b.q, kotlin.f0.y.e.j0.e.l, kotlin.f0.y.e.j0.e.z.c, kotlin.f0.y.e.j0.j.b.t, boolean, kotlin.f0.y.e.j0.j.b.g0.e):void");
    }
}
