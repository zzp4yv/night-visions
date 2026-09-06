package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C10749c0;
import kotlin.collections.C10775p0;
import kotlin.collections.C10784u;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.C9815l;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.C10006p;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10004n;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10007q;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10008r;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10013w;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9997g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.sequences.C10489n;
import kotlin.sequences.Sequence;

/* compiled from: DeclaredMemberIndex.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.a */
/* loaded from: classes2.dex */
public class C9962a implements InterfaceC9963b {

    /* renamed from: a */
    private final InterfaceC9997g f38011a;

    /* renamed from: b */
    private final Function1<InterfaceC10007q, Boolean> f38012b;

    /* renamed from: c */
    private final Function1<InterfaceC10008r, Boolean> f38013c;

    /* renamed from: d */
    private final Map<C10130f, List<InterfaceC10008r>> f38014d;

    /* renamed from: e */
    private final Map<C10130f, InterfaceC10004n> f38015e;

    /* renamed from: f */
    private final Map<C10130f, InterfaceC10013w> f38016f;

    /* compiled from: DeclaredMemberIndex.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.l0.l.a$a */
    static final class a extends Lambda implements Function1<InterfaceC10008r, Boolean> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(InterfaceC10008r interfaceC10008r) {
            C9768m.m32346f(interfaceC10008r, "m");
            return Boolean.valueOf(((Boolean) C9962a.this.f38012b.invoke(interfaceC10008r)).booleanValue() && !C10006p.m33617c(interfaceC10008r));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9962a(InterfaceC9997g interfaceC9997g, Function1<? super InterfaceC10007q, Boolean> function1) {
        Sequence m38575J;
        Sequence m37382l;
        Sequence m38575J2;
        Sequence m37382l2;
        int m38793e;
        int m32419b;
        C9768m.m32346f(interfaceC9997g, "jClass");
        C9768m.m32346f(function1, "memberFilter");
        this.f38011a = interfaceC9997g;
        this.f38012b = function1;
        a aVar = new a();
        this.f38013c = aVar;
        m38575J = C10749c0.m38575J(interfaceC9997g.mo33593M());
        m37382l = C10489n.m37382l(m38575J, aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : m37382l) {
            C10130f name = ((InterfaceC10008r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f38014d = linkedHashMap;
        m38575J2 = C10749c0.m38575J(this.f38011a.mo33589D());
        m37382l2 = C10489n.m37382l(m38575J2, this.f38012b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : m37382l2) {
            linkedHashMap2.put(((InterfaceC10004n) obj3).getName(), obj3);
        }
        this.f38015e = linkedHashMap2;
        Collection<InterfaceC10013w> mo33598j = this.f38011a.mo33598j();
        Function1<InterfaceC10007q, Boolean> function12 = this.f38012b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : mo33598j) {
            if (((Boolean) function12.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        m38793e = C10775p0.m38793e(C10786v.m38911u(arrayList, 10));
        m32419b = C9815l.m32419b(m38793e, 16);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(m32419b);
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((InterfaceC10013w) obj5).getName(), obj5);
        }
        this.f38016f = linkedHashMap3;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9963b
    /* renamed from: a */
    public Set<C10130f> mo33299a() {
        Sequence m38575J;
        Sequence m37382l;
        m38575J = C10749c0.m38575J(this.f38011a.mo33593M());
        m37382l = C10489n.m37382l(m38575J, this.f38013c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = m37382l.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC10008r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9963b
    /* renamed from: b */
    public InterfaceC10013w mo33300b(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        return this.f38016f.get(c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9963b
    /* renamed from: c */
    public InterfaceC10004n mo33301c(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        return this.f38015e.get(c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9963b
    /* renamed from: d */
    public Set<C10130f> mo33302d() {
        return this.f38016f.keySet();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9963b
    /* renamed from: e */
    public Set<C10130f> mo33303e() {
        Sequence m38575J;
        Sequence m37382l;
        m38575J = C10749c0.m38575J(this.f38011a.mo33589D());
        m37382l = C10489n.m37382l(m38575J, this.f38012b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = m37382l.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((InterfaceC10004n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p384l0.p385l.InterfaceC9963b
    /* renamed from: f */
    public Collection<InterfaceC10008r> mo33304f(C10130f c10130f) {
        C9768m.m32346f(c10130f, "name");
        List<InterfaceC10008r> list = this.f38014d.get(c10130f);
        return list != null ? list : C10784u.m38888j();
    }
}
