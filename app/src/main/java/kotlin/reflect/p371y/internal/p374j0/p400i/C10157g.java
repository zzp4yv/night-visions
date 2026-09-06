package kotlin.reflect.p371y.internal.p374j0.p400i;

import java.util.Comparator;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10551d1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10573l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10705y;

/* compiled from: MemberComparator.java */
/* renamed from: kotlin.f0.y.e.j0.i.g */
/* loaded from: classes3.dex */
public class C10157g implements Comparator<InterfaceC10576m> {

    /* renamed from: f */
    public static final C10157g f39518f = new C10157g();

    private C10157g() {
    }

    /* renamed from: b */
    private static Integer m35844b(InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2) {
        int m35845c = m35845c(interfaceC10576m2) - m35845c(interfaceC10576m);
        if (m35845c != 0) {
            return Integer.valueOf(m35845c);
        }
        if (C10154d.m35801B(interfaceC10576m) && C10154d.m35801B(interfaceC10576m2)) {
            return 0;
        }
        int compareTo = interfaceC10576m.getName().compareTo(interfaceC10576m2.getName());
        if (compareTo != 0) {
            return Integer.valueOf(compareTo);
        }
        return null;
    }

    /* renamed from: c */
    private static int m35845c(InterfaceC10576m interfaceC10576m) {
        if (C10154d.m35801B(interfaceC10576m)) {
            return 8;
        }
        if (interfaceC10576m instanceof InterfaceC10573l) {
            return 7;
        }
        if (interfaceC10576m instanceof InterfaceC10696t0) {
            return ((InterfaceC10696t0) interfaceC10576m).mo37032m0() == null ? 6 : 5;
        }
        if (interfaceC10576m instanceof InterfaceC10705y) {
            return ((InterfaceC10705y) interfaceC10576m).mo37032m0() == null ? 4 : 3;
        }
        if (interfaceC10576m instanceof InterfaceC10552e) {
            return 2;
        }
        return interfaceC10576m instanceof InterfaceC10551d1 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC10576m interfaceC10576m, InterfaceC10576m interfaceC10576m2) {
        Integer m35844b = m35844b(interfaceC10576m, interfaceC10576m2);
        if (m35844b != null) {
            return m35844b.intValue();
        }
        return 0;
    }
}
