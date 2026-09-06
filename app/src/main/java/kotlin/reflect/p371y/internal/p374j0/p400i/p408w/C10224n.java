package kotlin.reflect.p371y.internal.p374j0.p400i.p408w;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C10749c0;
import kotlin.collections.C10786v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.jvm.internal.impl.utils.C10738e;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10162l;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p422m.p424v.C10453a;

/* compiled from: TypeIntersectionScope.kt */
/* renamed from: kotlin.f0.y.e.j0.i.w.n */
/* loaded from: classes3.dex */
public final class C10224n extends AbstractC10211a {

    /* renamed from: b */
    public static final a f39681b = new a(null);

    /* renamed from: c */
    private final String f39682c;

    /* renamed from: d */
    private final InterfaceC10218h f39683d;

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.n$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC10218h m36175a(String str, Collection<? extends AbstractC10311e0> collection) {
            C9768m.m32346f(str, "message");
            C9768m.m32346f(collection, "types");
            ArrayList arrayList = new ArrayList(C10786v.m38911u(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC10311e0) it.next()).mo33553q());
            }
            C10738e<InterfaceC10218h> m37231b = C10453a.m37231b(arrayList);
            InterfaceC10218h m36125b = C10212b.f39624b.m36125b(str, m37231b);
            return m37231b.size() <= 1 ? m36125b : new C10224n(str, m36125b, null);
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.n$b */
    static final class b extends Lambda implements Function1<InterfaceC10540a, InterfaceC10540a> {

        /* renamed from: f */
        public static final b f39684f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10540a invoke(InterfaceC10540a interfaceC10540a) {
            C9768m.m32346f(interfaceC10540a, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC10540a;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.n$c */
    static final class c extends Lambda implements Function1<InterfaceC10706y0, InterfaceC10540a> {

        /* renamed from: f */
        public static final c f39685f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10540a invoke(InterfaceC10706y0 interfaceC10706y0) {
            C9768m.m32346f(interfaceC10706y0, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC10706y0;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.w.n$d */
    static final class d extends Lambda implements Function1<InterfaceC10696t0, InterfaceC10540a> {

        /* renamed from: f */
        public static final d f39686f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10540a invoke(InterfaceC10696t0 interfaceC10696t0) {
            C9768m.m32346f(interfaceC10696t0, "$this$selectMostSpecificInEachOverridableGroup");
            return interfaceC10696t0;
        }
    }

    private C10224n(String str, InterfaceC10218h interfaceC10218h) {
        this.f39682c = str;
        this.f39683d = interfaceC10218h;
    }

    public /* synthetic */ C10224n(String str, InterfaceC10218h interfaceC10218h, C9756g c9756g) {
        this(str, interfaceC10218h);
    }

    /* renamed from: j */
    public static final InterfaceC10218h m36174j(String str, Collection<? extends AbstractC10311e0> collection) {
        return f39681b.m36175a(str, collection);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10211a, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: a */
    public Collection<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return C10162l.m35986a(super.mo33311a(c10130f, interfaceC9906b), c.f39685f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10211a, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: c */
    public Collection<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return C10162l.m35986a(super.mo33313c(c10130f, interfaceC9906b), d.f39686f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10211a, kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: g */
    public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        Collection<InterfaceC10576m> mo33317g = super.mo33317g(c10214d, function1);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : mo33317g) {
            if (((InterfaceC10576m) obj) instanceof InterfaceC10540a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.m37646a();
        List list2 = (List) pair.m37647b();
        C9768m.m32344d(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return C10749c0.m38609o0(C10162l.m35986a(list, b.f39684f), list2);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.AbstractC10211a
    /* renamed from: i */
    protected InterfaceC10218h mo36122i() {
        return this.f39683d;
    }
}
