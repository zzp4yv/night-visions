package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0;

import kotlin.collections.C10780s;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: javaLoading.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.n0.p */
/* loaded from: classes2.dex */
public final class C10006p {
    /* renamed from: a */
    private static final boolean m33615a(InterfaceC10008r interfaceC10008r) {
        C10127c mo33596d;
        InterfaceC9989b0 interfaceC9989b0 = (InterfaceC9989b0) C10780s.m38870u0(interfaceC10008r.mo33620f());
        InterfaceC10014x type = interfaceC9989b0 != null ? interfaceC9989b0.getType() : null;
        InterfaceC10000j interfaceC10000j = type instanceof InterfaceC10000j ? (InterfaceC10000j) type : null;
        if (interfaceC10000j == null) {
            return false;
        }
        InterfaceC9999i mo33606c = interfaceC10000j.mo33606c();
        return (mo33606c instanceof InterfaceC9997g) && (mo33596d = ((InterfaceC9997g) mo33606c).mo33596d()) != null && C9768m.m32341a(mo33596d.m35420b(), "java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        return r3.mo33620f().isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r0.equals("toString") != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0.equals("hashCode") == false) goto L19;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean m33616b(kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r r3) {
        /*
            kotlin.f0.y.e.j0.f.f r0 = r3.getName()
            java.lang.String r0 = r0.m35455k()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L44
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L44
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L44
        L2e:
            boolean r3 = m33615a(r3)
            goto L45
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
        L3b:
            java.util.List r3 = r3.mo33620f()
            boolean r3 = r3.isEmpty()
            goto L45
        L44:
            r3 = 0
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.C10006p.m33616b(kotlin.f0.y.e.j0.d.a.n0.r):boolean");
    }

    /* renamed from: c */
    public static final boolean m33617c(InterfaceC10007q interfaceC10007q) {
        C9768m.m32346f(interfaceC10007q, "<this>");
        return interfaceC10007q.mo33618P().mo33590H() && (interfaceC10007q instanceof InterfaceC10008r) && m33616b((InterfaceC10008r) interfaceC10007q);
    }
}
