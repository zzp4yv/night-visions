package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.Map;
import kotlin.C10740s;
import kotlin.KotlinVersion;
import kotlin.collections.C10777q0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C10043v;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: JavaNullabilityAnnotationSettings.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.u */
/* loaded from: classes2.dex */
public final class C10042u {

    /* renamed from: a */
    private static final C10127c f38307a;

    /* renamed from: b */
    private static final C10127c f38308b;

    /* renamed from: c */
    private static final InterfaceC9916c0<C10043v> f38309c;

    /* renamed from: d */
    private static final C10043v f38310d;

    static {
        Map m38800l;
        C10127c c10127c = new C10127c("org.jspecify.nullness");
        f38307a = c10127c;
        C10127c c10127c2 = new C10127c("org.checkerframework.checker.nullness.compatqual");
        f38308b = c10127c2;
        C10127c c10127c3 = new C10127c("org.jetbrains.annotations");
        C10043v.a aVar = C10043v.f38311a;
        C10127c c10127c4 = new C10127c("androidx.annotation.RecentlyNullable");
        EnumC9922f0 enumC9922f0 = EnumC9922f0.WARN;
        KotlinVersion kotlinVersion = new KotlinVersion(1, 8);
        EnumC9922f0 enumC9922f02 = EnumC9922f0.STRICT;
        m38800l = C10777q0.m38800l(C10740s.m38547a(c10127c3, aVar.m33815a()), C10740s.m38547a(new C10127c("androidx.annotation"), aVar.m33815a()), C10740s.m38547a(new C10127c("android.support.annotation"), aVar.m33815a()), C10740s.m38547a(new C10127c("android.annotation"), aVar.m33815a()), C10740s.m38547a(new C10127c("com.android.annotations"), aVar.m33815a()), C10740s.m38547a(new C10127c("org.eclipse.jdt.annotation"), aVar.m33815a()), C10740s.m38547a(new C10127c("org.checkerframework.checker.nullness.qual"), aVar.m33815a()), C10740s.m38547a(c10127c2, aVar.m33815a()), C10740s.m38547a(new C10127c("javax.annotation"), aVar.m33815a()), C10740s.m38547a(new C10127c("edu.umd.cs.findbugs.annotations"), aVar.m33815a()), C10740s.m38547a(new C10127c("io.reactivex.annotations"), aVar.m33815a()), C10740s.m38547a(c10127c4, new C10043v(enumC9922f0, null, null, 4, null)), C10740s.m38547a(new C10127c("androidx.annotation.RecentlyNonNull"), new C10043v(enumC9922f0, null, null, 4, null)), C10740s.m38547a(new C10127c("lombok"), aVar.m33815a()), C10740s.m38547a(c10127c, new C10043v(enumC9922f0, kotlinVersion, enumC9922f02)), C10740s.m38547a(new C10127c("io.reactivex.rxjava3.annotations"), new C10043v(enumC9922f0, new KotlinVersion(1, 8), enumC9922f02)));
        f38309c = new C9918d0(m38800l);
        f38310d = new C10043v(enumC9922f0, null, null, 4, null);
    }

    /* renamed from: a */
    public static final C10046y m33804a(KotlinVersion kotlinVersion) {
        C9768m.m32346f(kotlinVersion, "configuredKotlinVersion");
        C10043v c10043v = f38310d;
        EnumC9922f0 m33813c = (c10043v.m33814d() == null || c10043v.m33814d().compareTo(kotlinVersion) > 0) ? c10043v.m33813c() : c10043v.m33812b();
        return new C10046y(m33813c, m33806c(m33813c), null, 4, null);
    }

    /* renamed from: b */
    public static /* synthetic */ C10046y m33805b(KotlinVersion kotlinVersion, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kotlinVersion = KotlinVersion.f37199g;
        }
        return m33804a(kotlinVersion);
    }

    /* renamed from: c */
    public static final EnumC9922f0 m33806c(EnumC9922f0 enumC9922f0) {
        C9768m.m32346f(enumC9922f0, "globalReportLevel");
        if (enumC9922f0 == EnumC9922f0.WARN) {
            return null;
        }
        return enumC9922f0;
    }

    /* renamed from: d */
    public static final EnumC9922f0 m33807d(C10127c c10127c) {
        C9768m.m32346f(c10127c, "annotationFqName");
        return m33810g(c10127c, InterfaceC9916c0.f37839a.m33067a(), null, 4, null);
    }

    /* renamed from: e */
    public static final C10127c m33808e() {
        return f38307a;
    }

    /* renamed from: f */
    public static final EnumC9922f0 m33809f(C10127c c10127c, InterfaceC9916c0<? extends EnumC9922f0> interfaceC9916c0, KotlinVersion kotlinVersion) {
        C9768m.m32346f(c10127c, "annotation");
        C9768m.m32346f(interfaceC9916c0, "configuredReportLevels");
        C9768m.m32346f(kotlinVersion, "configuredKotlinVersion");
        EnumC9922f0 mo33066a = interfaceC9916c0.mo33066a(c10127c);
        if (mo33066a != null) {
            return mo33066a;
        }
        C10043v mo33066a2 = f38309c.mo33066a(c10127c);
        return mo33066a2 == null ? EnumC9922f0.IGNORE : (mo33066a2.m33814d() == null || mo33066a2.m33814d().compareTo(kotlinVersion) > 0) ? mo33066a2.m33813c() : mo33066a2.m33812b();
    }

    /* renamed from: g */
    public static /* synthetic */ EnumC9922f0 m33810g(C10127c c10127c, InterfaceC9916c0 interfaceC9916c0, KotlinVersion kotlinVersion, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            kotlinVersion = new KotlinVersion(1, 7, 0);
        }
        return m33809f(c10127c, interfaceC9916c0, kotlinVersion);
    }
}
