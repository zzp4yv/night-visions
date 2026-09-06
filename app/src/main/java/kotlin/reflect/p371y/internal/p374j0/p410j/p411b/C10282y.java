package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10775p0;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.C9815l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10101m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10116a;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;

/* compiled from: ProtoBasedClassDataFinder.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.y */
/* loaded from: classes3.dex */
public final class C10282y implements InterfaceC10265h {

    /* renamed from: a */
    private final InterfaceC10118c f39990a;

    /* renamed from: b */
    private final AbstractC10116a f39991b;

    /* renamed from: c */
    private final Function1<C10126b, InterfaceC10708z0> f39992c;

    /* renamed from: d */
    private final Map<C10126b, C10091c> f39993d;

    /* JADX WARN: Multi-variable type inference failed */
    public C10282y(C10101m c10101m, InterfaceC10118c interfaceC10118c, AbstractC10116a abstractC10116a, Function1<? super C10126b, ? extends InterfaceC10708z0> function1) {
        int m38793e;
        int m32419b;
        C9768m.m32346f(c10101m, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        C9768m.m32346f(abstractC10116a, "metadataVersion");
        C9768m.m32346f(function1, "classSource");
        this.f39990a = interfaceC10118c;
        this.f39991b = abstractC10116a;
        this.f39992c = function1;
        List<C10091c> m34831J = c10101m.m34831J();
        C9768m.m32345e(m34831J, "proto.class_List");
        m38793e = C10775p0.m38793e(C10786v.m38911u(m34831J, 10));
        m32419b = C9815l.m32419b(m38793e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m32419b);
        for (Object obj : m34831J) {
            linkedHashMap.put(C10281x.m36494a(this.f39990a, ((C10091c) obj).m34439F0()), obj);
        }
        this.f39993d = linkedHashMap;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10265h
    /* renamed from: a */
    public C10250g mo33978a(C10126b c10126b) {
        C9768m.m32346f(c10126b, "classId");
        C10091c c10091c = this.f39993d.get(c10126b);
        if (c10091c == null) {
            return null;
        }
        return new C10250g(this.f39990a, c10091c, this.f39991b, this.f39992c.invoke(c10126b));
    }

    /* renamed from: b */
    public final Collection<C10126b> m36496b() {
        return this.f39993d.keySet();
    }
}
