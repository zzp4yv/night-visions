package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C10740s;
import kotlin.collections.C10775p0;
import kotlin.collections.C10777q0;
import kotlin.collections.C10782t;
import kotlin.collections.C10784u;
import kotlin.collections.C10789w0;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10026i;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.c */
/* loaded from: classes2.dex */
public final class C9915c {

    /* renamed from: a */
    private static final C10127c f37831a = new C10127c("javax.annotation.meta.TypeQualifierNickname");

    /* renamed from: b */
    private static final C10127c f37832b = new C10127c("javax.annotation.meta.TypeQualifier");

    /* renamed from: c */
    private static final C10127c f37833c = new C10127c("javax.annotation.meta.TypeQualifierDefault");

    /* renamed from: d */
    private static final C10127c f37834d = new C10127c("kotlin.annotations.jvm.UnderMigration");

    /* renamed from: e */
    private static final List<EnumC9913b> f37835e;

    /* renamed from: f */
    private static final Map<C10127c, C10038q> f37836f;

    /* renamed from: g */
    private static final Map<C10127c, C10038q> f37837g;

    /* renamed from: h */
    private static final Set<C10127c> f37838h;

    static {
        List<EnumC9913b> m38891m;
        Map<C10127c, C10038q> m38794f;
        Map m38800l;
        Map<C10127c, C10038q> m38802n;
        Set<C10127c> m38922i;
        EnumC9913b enumC9913b = EnumC9913b.VALUE_PARAMETER;
        m38891m = C10784u.m38891m(EnumC9913b.FIELD, EnumC9913b.METHOD_RETURN_TYPE, enumC9913b, EnumC9913b.TYPE_PARAMETER_BOUNDS, EnumC9913b.TYPE_USE);
        f37835e = m38891m;
        C10127c m33054i = C9914b0.m33054i();
        EnumC10025h enumC10025h = EnumC10025h.NOT_NULL;
        m38794f = C10775p0.m38794f(C10740s.m38547a(m33054i, new C10038q(new C10026i(enumC10025h, false, 2, null), m38891m, false)));
        f37836f = m38794f;
        m38800l = C10777q0.m38800l(C10740s.m38547a(new C10127c("javax.annotation.ParametersAreNullableByDefault"), new C10038q(new C10026i(EnumC10025h.NULLABLE, false, 2, null), C10782t.m38883e(enumC9913b), false, 4, null)), C10740s.m38547a(new C10127c("javax.annotation.ParametersAreNonnullByDefault"), new C10038q(new C10026i(enumC10025h, false, 2, null), C10782t.m38883e(enumC9913b), false, 4, null)));
        m38802n = C10777q0.m38802n(m38800l, m38794f);
        f37837g = m38802n;
        m38922i = C10789w0.m38922i(C9914b0.m33051f(), C9914b0.m33050e());
        f37838h = m38922i;
    }

    /* renamed from: a */
    public static final Map<C10127c, C10038q> m33059a() {
        return f37837g;
    }

    /* renamed from: b */
    public static final Set<C10127c> m33060b() {
        return f37838h;
    }

    /* renamed from: c */
    public static final Map<C10127c, C10038q> m33061c() {
        return f37836f;
    }

    /* renamed from: d */
    public static final C10127c m33062d() {
        return f37834d;
    }

    /* renamed from: e */
    public static final C10127c m33063e() {
        return f37833c;
    }

    /* renamed from: f */
    public static final C10127c m33064f() {
        return f37832b;
    }

    /* renamed from: g */
    public static final C10127c m33065g() {
        return f37831a;
    }
}
