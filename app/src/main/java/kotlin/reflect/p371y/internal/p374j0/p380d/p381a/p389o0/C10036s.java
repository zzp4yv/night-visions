package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.Set;
import kotlin.collections.C10749c0;
import kotlin.collections.C10780s;
import kotlin.collections.C10791x0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.C9912a0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10336m1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;

/* compiled from: typeEnhancementUtils.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.s */
/* loaded from: classes3.dex */
public final class C10036s {
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d2, code lost:
    
        if (r6 != false) goto L49;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e m33777a(kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e r6, java.util.Collection<kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e> r7, boolean r8, boolean r9, boolean r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9768m.m32346f(r6, r0)
            java.lang.String r0 = "superQualifiers"
            kotlin.jvm.internal.C9768m.m32346f(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            kotlin.f0.y.e.j0.d.a.o0.e r2 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e) r2
            kotlin.f0.y.e.j0.d.a.o0.h r2 = m33778b(r2)
            if (r2 == 0) goto L13
            r0.add(r2)
            goto L13
        L29:
            java.util.Set r0 = kotlin.collections.C10780s.m38818I0(r0)
            kotlin.f0.y.e.j0.d.a.o0.h r1 = m33778b(r6)
            kotlin.f0.y.e.j0.d.a.o0.h r0 = m33781e(r0, r1, r8)
            if (r0 != 0) goto L63
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L40:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()
            kotlin.f0.y.e.j0.d.a.o0.e r3 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e) r3
            kotlin.f0.y.e.j0.d.a.o0.h r3 = r3.m33684d()
            if (r3 == 0) goto L40
            r1.add(r3)
            goto L40
        L56:
            java.util.Set r1 = kotlin.collections.C10780s.m38818I0(r1)
            kotlin.f0.y.e.j0.d.a.o0.h r2 = r6.m33684d()
            kotlin.f0.y.e.j0.d.a.o0.h r1 = m33781e(r1, r2, r8)
            goto L64
        L63:
            r1 = r0
        L64:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L6d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r3.next()
            kotlin.f0.y.e.j0.d.a.o0.e r4 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e) r4
            kotlin.f0.y.e.j0.d.a.o0.f r4 = r4.m33683c()
            if (r4 == 0) goto L6d
            r2.add(r4)
            goto L6d
        L83:
            java.util.Set r2 = kotlin.collections.C10780s.m38818I0(r2)
            kotlin.f0.y.e.j0.d.a.o0.f r3 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10023f.MUTABLE
            kotlin.f0.y.e.j0.d.a.o0.f r4 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10023f.READ_ONLY
            kotlin.f0.y.e.j0.d.a.o0.f r5 = r6.m33683c()
            java.lang.Object r8 = m33780d(r2, r3, r4, r5, r8)
            kotlin.f0.y.e.j0.d.a.o0.f r8 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10023f) r8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto La9
            if (r10 != 0) goto La5
            if (r9 == 0) goto La3
            kotlin.f0.y.e.j0.d.a.o0.h r9 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NULLABLE
            if (r1 != r9) goto La3
            goto La5
        La3:
            r9 = 0
            goto La6
        La5:
            r9 = 1
        La6:
            if (r9 != 0) goto La9
            r2 = r1
        La9:
            kotlin.f0.y.e.j0.d.a.o0.h r9 = kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.EnumC10025h.NOT_NULL
            if (r2 != r9) goto Ld6
            boolean r6 = r6.m33682b()
            if (r6 != 0) goto Ld4
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto Lbb
        Lb9:
            r6 = 0
            goto Ld2
        Lbb:
            java.util.Iterator r6 = r7.iterator()
        Lbf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb9
            java.lang.Object r7 = r6.next()
            kotlin.f0.y.e.j0.d.a.o0.e r7 = (kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10022e) r7
            boolean r7 = r7.m33682b()
            if (r7 == 0) goto Lbf
            r6 = 1
        Ld2:
            if (r6 == 0) goto Ld6
        Ld4:
            r6 = 1
            goto Ld7
        Ld6:
            r6 = 0
        Ld7:
            if (r2 == 0) goto Ldc
            if (r0 == r1) goto Ldc
            goto Ldd
        Ldc:
            r3 = 0
        Ldd:
            kotlin.f0.y.e.j0.d.a.o0.e r7 = new kotlin.f0.y.e.j0.d.a.o0.e
            r7.<init>(r2, r8, r6, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0.C10036s.m33777a(kotlin.f0.y.e.j0.d.a.o0.e, java.util.Collection, boolean, boolean, boolean):kotlin.f0.y.e.j0.d.a.o0.e");
    }

    /* renamed from: b */
    private static final EnumC10025h m33778b(C10022e c10022e) {
        if (c10022e.m33685e()) {
            return null;
        }
        return c10022e.m33684d();
    }

    /* renamed from: c */
    public static final boolean m33779c(InterfaceC10336m1 interfaceC10336m1, InterfaceC10409i interfaceC10409i) {
        C9768m.m32346f(interfaceC10336m1, "<this>");
        C9768m.m32346f(interfaceC10409i, "type");
        C10127c c10127c = C9912a0.f37806u;
        C9768m.m32345e(c10127c, "ENHANCED_NULLABILITY_ANNOTATION");
        return interfaceC10336m1.mo35956l0(interfaceC10409i, c10127c);
    }

    /* renamed from: d */
    private static final <T> T m33780d(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set m38926m;
        Set<? extends T> m38574I0;
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (C9768m.m32341a(t4, t) && C9768m.m32341a(t3, t2)) {
                return null;
            }
            return t3 == null ? t4 : t3;
        }
        if (t3 != null) {
            m38926m = C10791x0.m38926m(set, t3);
            m38574I0 = C10749c0.m38574I0(m38926m);
            if (m38574I0 != null) {
                set = m38574I0;
            }
        }
        return (T) C10780s.m38868t0(set);
    }

    /* renamed from: e */
    private static final EnumC10025h m33781e(Set<? extends EnumC10025h> set, EnumC10025h enumC10025h, boolean z) {
        EnumC10025h enumC10025h2 = EnumC10025h.FORCE_FLEXIBILITY;
        return enumC10025h == enumC10025h2 ? enumC10025h2 : (EnumC10025h) m33780d(set, EnumC10025h.NOT_NULL, EnumC10025h.NULLABLE, enumC10025h, z);
    }
}
