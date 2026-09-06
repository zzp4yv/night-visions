package kotlin.reflect.p371y.internal.p374j0.p380d.p390b;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10780s;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.C10568j0;
import kotlin.reflect.jvm.internal.impl.descriptors.C10703x;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.C10584d;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.utils.C10734a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p382j0.C9930a;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10090b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10182k;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10171a;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10175d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10177f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10179h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10181j;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10184m;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10188q;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10189r;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10192u;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10194w;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10195x;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10196y;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.C10197z;
import kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10243e;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.text.C10514v;

/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
/* renamed from: kotlin.f0.y.e.j0.d.b.c */
/* loaded from: classes3.dex */
public final class C10052c extends AbstractC10048a<InterfaceC10583c, AbstractC10178g<?>> {

    /* renamed from: c */
    private final InterfaceC10559g0 f38379c;

    /* renamed from: d */
    private final C10568j0 f38380d;

    /* renamed from: e */
    private final C10243e f38381e;

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.c$a */
    private abstract class a implements InterfaceC10068q.a {

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c$a$a, reason: collision with other inner class name */
        public static final class C11499a implements InterfaceC10068q.a {

            /* renamed from: a */
            private final /* synthetic */ InterfaceC10068q.a f38383a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC10068q.a f38384b;

            /* renamed from: c */
            final /* synthetic */ a f38385c;

            /* renamed from: d */
            final /* synthetic */ C10130f f38386d;

            /* renamed from: e */
            final /* synthetic */ ArrayList<InterfaceC10583c> f38387e;

            C11499a(InterfaceC10068q.a aVar, a aVar2, C10130f c10130f, ArrayList<InterfaceC10583c> arrayList) {
                this.f38384b = aVar;
                this.f38385c = aVar2;
                this.f38386d = c10130f;
                this.f38387e = arrayList;
                this.f38383a = aVar;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
            /* renamed from: a */
            public void mo33903a() {
                this.f38384b.mo33903a();
                this.f38385c.mo33902h(this.f38386d, new C10171a((InterfaceC10583c) C10780s.m38866s0(this.f38387e)));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
            /* renamed from: b */
            public void mo33896b(C10130f c10130f, C10177f c10177f) {
                C9768m.m32346f(c10177f, "value");
                this.f38383a.mo33896b(c10130f, c10177f);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
            /* renamed from: c */
            public void mo33897c(C10130f c10130f, Object obj) {
                this.f38383a.mo33897c(c10130f, obj);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
            /* renamed from: d */
            public void mo33898d(C10130f c10130f, C10126b c10126b, C10130f c10130f2) {
                C9768m.m32346f(c10126b, "enumClassId");
                C9768m.m32346f(c10130f2, "enumEntryName");
                this.f38383a.mo33898d(c10130f, c10126b, c10130f2);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
            /* renamed from: e */
            public InterfaceC10068q.a mo33899e(C10130f c10130f, C10126b c10126b) {
                C9768m.m32346f(c10126b, "classId");
                return this.f38383a.mo33899e(c10130f, c10126b);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
            /* renamed from: f */
            public InterfaceC10068q.b mo33900f(C10130f c10130f) {
                return this.f38383a.mo33900f(c10130f);
            }
        }

        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        /* renamed from: kotlin.f0.y.e.j0.d.b.c$a$b */
        public static final class b implements InterfaceC10068q.b {

            /* renamed from: a */
            private final ArrayList<AbstractC10178g<?>> f38388a = new ArrayList<>();

            /* renamed from: b */
            final /* synthetic */ C10052c f38389b;

            /* renamed from: c */
            final /* synthetic */ C10130f f38390c;

            /* renamed from: d */
            final /* synthetic */ a f38391d;

            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            /* renamed from: kotlin.f0.y.e.j0.d.b.c$a$b$a, reason: collision with other inner class name */
            public static final class C11500a implements InterfaceC10068q.a {

                /* renamed from: a */
                private final /* synthetic */ InterfaceC10068q.a f38392a;

                /* renamed from: b */
                final /* synthetic */ InterfaceC10068q.a f38393b;

                /* renamed from: c */
                final /* synthetic */ b f38394c;

                /* renamed from: d */
                final /* synthetic */ ArrayList<InterfaceC10583c> f38395d;

                C11500a(InterfaceC10068q.a aVar, b bVar, ArrayList<InterfaceC10583c> arrayList) {
                    this.f38393b = aVar;
                    this.f38394c = bVar;
                    this.f38395d = arrayList;
                    this.f38392a = aVar;
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
                /* renamed from: a */
                public void mo33903a() {
                    this.f38393b.mo33903a();
                    this.f38394c.f38388a.add(new C10171a((InterfaceC10583c) C10780s.m38866s0(this.f38395d)));
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
                /* renamed from: b */
                public void mo33896b(C10130f c10130f, C10177f c10177f) {
                    C9768m.m32346f(c10177f, "value");
                    this.f38392a.mo33896b(c10130f, c10177f);
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
                /* renamed from: c */
                public void mo33897c(C10130f c10130f, Object obj) {
                    this.f38392a.mo33897c(c10130f, obj);
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
                /* renamed from: d */
                public void mo33898d(C10130f c10130f, C10126b c10126b, C10130f c10130f2) {
                    C9768m.m32346f(c10126b, "enumClassId");
                    C9768m.m32346f(c10130f2, "enumEntryName");
                    this.f38392a.mo33898d(c10130f, c10126b, c10130f2);
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
                /* renamed from: e */
                public InterfaceC10068q.a mo33899e(C10130f c10130f, C10126b c10126b) {
                    C9768m.m32346f(c10126b, "classId");
                    return this.f38392a.mo33899e(c10130f, c10126b);
                }

                @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
                /* renamed from: f */
                public InterfaceC10068q.b mo33900f(C10130f c10130f) {
                    return this.f38392a.mo33900f(c10130f);
                }
            }

            b(C10052c c10052c, C10130f c10130f, a aVar) {
                this.f38389b = c10052c;
                this.f38390c = c10130f;
                this.f38391d = aVar;
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.b
            /* renamed from: a */
            public void mo33905a() {
                this.f38391d.mo33901g(this.f38390c, this.f38388a);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.b
            /* renamed from: b */
            public void mo33906b(Object obj) {
                this.f38388a.add(this.f38389b.m33891K(this.f38390c, obj));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.b
            /* renamed from: c */
            public void mo33907c(C10126b c10126b, C10130f c10130f) {
                C9768m.m32346f(c10126b, "enumClassId");
                C9768m.m32346f(c10130f, "enumEntryName");
                this.f38388a.add(new C10181j(c10126b, c10130f));
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.b
            /* renamed from: d */
            public InterfaceC10068q.a mo33908d(C10126b c10126b) {
                C9768m.m32346f(c10126b, "classId");
                ArrayList arrayList = new ArrayList();
                C10052c c10052c = this.f38389b;
                InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
                C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
                InterfaceC10068q.a mo33885x = c10052c.mo33885x(c10126b, interfaceC10708z0, arrayList);
                C9768m.m32343c(mo33885x);
                return new C11500a(mo33885x, this, arrayList);
            }

            @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.b
            /* renamed from: e */
            public void mo33909e(C10177f c10177f) {
                C9768m.m32346f(c10177f, "value");
                this.f38388a.add(new C10188q(c10177f));
            }
        }

        public a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
        /* renamed from: b */
        public void mo33896b(C10130f c10130f, C10177f c10177f) {
            C9768m.m32346f(c10177f, "value");
            mo33902h(c10130f, new C10188q(c10177f));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
        /* renamed from: c */
        public void mo33897c(C10130f c10130f, Object obj) {
            mo33902h(c10130f, C10052c.this.m33891K(c10130f, obj));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
        /* renamed from: d */
        public void mo33898d(C10130f c10130f, C10126b c10126b, C10130f c10130f2) {
            C9768m.m32346f(c10126b, "enumClassId");
            C9768m.m32346f(c10130f2, "enumEntryName");
            mo33902h(c10130f, new C10181j(c10126b, c10130f2));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
        /* renamed from: e */
        public InterfaceC10068q.a mo33899e(C10130f c10130f, C10126b c10126b) {
            C9768m.m32346f(c10126b, "classId");
            ArrayList arrayList = new ArrayList();
            C10052c c10052c = C10052c.this;
            InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
            C9768m.m32345e(interfaceC10708z0, "NO_SOURCE");
            InterfaceC10068q.a mo33885x = c10052c.mo33885x(c10126b, interfaceC10708z0, arrayList);
            C9768m.m32343c(mo33885x);
            return new C11499a(mo33885x, this, c10130f, arrayList);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
        /* renamed from: f */
        public InterfaceC10068q.b mo33900f(C10130f c10130f) {
            return new b(C10052c.this, c10130f, this);
        }

        /* renamed from: g */
        public abstract void mo33901g(C10130f c10130f, ArrayList<AbstractC10178g<?>> arrayList);

        /* renamed from: h */
        public abstract void mo33902h(C10130f c10130f, AbstractC10178g<?> abstractC10178g);
    }

    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.b.c$b */
    public static final class b extends a {

        /* renamed from: b */
        private final HashMap<C10130f, AbstractC10178g<?>> f38396b;

        /* renamed from: d */
        final /* synthetic */ InterfaceC10552e f38398d;

        /* renamed from: e */
        final /* synthetic */ C10126b f38399e;

        /* renamed from: f */
        final /* synthetic */ List<InterfaceC10583c> f38400f;

        /* renamed from: g */
        final /* synthetic */ InterfaceC10708z0 f38401g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC10552e interfaceC10552e, C10126b c10126b, List<InterfaceC10583c> list, InterfaceC10708z0 interfaceC10708z0) {
            super();
            this.f38398d = interfaceC10552e;
            this.f38399e = c10126b;
            this.f38400f = list;
            this.f38401g = interfaceC10708z0;
            this.f38396b = new HashMap<>();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.InterfaceC10068q.a
        /* renamed from: a */
        public void mo33903a() {
            if (C10052c.this.m33839E(this.f38399e, this.f38396b) || C10052c.this.m33884w(this.f38399e)) {
                return;
            }
            this.f38400f.add(new C10584d(this.f38398d.mo36400s(), this.f38396b, this.f38401g));
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10052c.a
        /* renamed from: g */
        public void mo33901g(C10130f c10130f, ArrayList<AbstractC10178g<?>> arrayList) {
            C9768m.m32346f(arrayList, "elements");
            if (c10130f == null) {
                return;
            }
            InterfaceC10566i1 m33149b = C9930a.m33149b(c10130f, this.f38398d);
            if (m33149b != null) {
                HashMap<C10130f, AbstractC10178g<?>> hashMap = this.f38396b;
                C10179h c10179h = C10179h.f39560a;
                List<? extends AbstractC10178g<?>> m38510c = C10734a.m38510c(arrayList);
                AbstractC10311e0 type = m33149b.getType();
                C9768m.m32345e(type, "parameter.type");
                hashMap.put(c10130f, c10179h.m36025b(m38510c, type));
                return;
            }
            if (C10052c.this.m33884w(this.f38399e) && C9768m.m32341a(c10130f.m35455k(), "value")) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof C10171a) {
                        arrayList2.add(obj);
                    }
                }
                List<InterfaceC10583c> list = this.f38400f;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    list.add(((C10171a) it.next()).mo36023b());
                }
            }
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10052c.a
        /* renamed from: h */
        public void mo33902h(C10130f c10130f, AbstractC10178g<?> abstractC10178g) {
            C9768m.m32346f(abstractC10178g, "value");
            if (c10130f != null) {
                this.f38396b.put(c10130f, abstractC10178g);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10052c(InterfaceC10559g0 interfaceC10559g0, C10568j0 c10568j0, InterfaceC10297n interfaceC10297n, InterfaceC10066o interfaceC10066o) {
        super(interfaceC10297n, interfaceC10066o);
        C9768m.m32346f(interfaceC10559g0, "module");
        C9768m.m32346f(c10568j0, "notFoundClasses");
        C9768m.m32346f(interfaceC10297n, "storageManager");
        C9768m.m32346f(interfaceC10066o, "kotlinClassFinder");
        this.f38379c = interfaceC10559g0;
        this.f38380d = c10568j0;
        this.f38381e = new C10243e(interfaceC10559g0, c10568j0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public final AbstractC10178g<?> m33891K(C10130f c10130f, Object obj) {
        AbstractC10178g<?> m36026c = C10179h.f39560a.m36026c(obj);
        if (m36026c != null) {
            return m36026c;
        }
        return AbstractC10182k.f39565b.m36032a("Unsupported annotation argument: " + c10130f);
    }

    /* renamed from: N */
    private final InterfaceC10552e m33892N(C10126b c10126b) {
        return C10703x.m38151c(this.f38379c, c10126b, this.f38380d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10048a
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public AbstractC10178g<?> mo33840G(String str, Object obj) {
        boolean m37538J;
        C9768m.m32346f(str, "desc");
        C9768m.m32346f(obj, "initializer");
        m37538J = C10514v.m37538J("ZBCS", str, false, 2, null);
        if (m37538J) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode == 66) {
                if (str.equals("B")) {
                    obj = Byte.valueOf((byte) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 67) {
                if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 83) {
                if (str.equals("S")) {
                    obj = Short.valueOf((short) intValue);
                }
                throw new AssertionError(str);
            }
            if (hashCode == 90 && str.equals("Z")) {
                obj = Boolean.valueOf(intValue != 0);
            }
            throw new AssertionError(str);
        }
        return C10179h.f39560a.m36026c(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10050b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public InterfaceC10583c mo33869A(C10090b c10090b, InterfaceC10118c interfaceC10118c) {
        C9768m.m32346f(c10090b, "proto");
        C9768m.m32346f(interfaceC10118c, "nameResolver");
        return this.f38381e.m36242a(c10090b, interfaceC10118c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10048a
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public AbstractC10178g<?> mo33841I(AbstractC10178g<?> abstractC10178g) {
        AbstractC10178g<?> c10196y;
        C9768m.m32346f(abstractC10178g, "constant");
        if (abstractC10178g instanceof C10175d) {
            c10196y = new C10194w(((C10175d) abstractC10178g).mo36023b().byteValue());
        } else if (abstractC10178g instanceof C10192u) {
            c10196y = new C10197z(((C10192u) abstractC10178g).mo36023b().shortValue());
        } else if (abstractC10178g instanceof C10184m) {
            c10196y = new C10195x(((C10184m) abstractC10178g).mo36023b().intValue());
        } else {
            if (!(abstractC10178g instanceof C10189r)) {
                return abstractC10178g;
            }
            c10196y = new C10196y(((C10189r) abstractC10178g).mo36023b().longValue());
        }
        return c10196y;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p390b.AbstractC10050b
    /* renamed from: x */
    protected InterfaceC10068q.a mo33885x(C10126b c10126b, InterfaceC10708z0 interfaceC10708z0, List<InterfaceC10583c> list) {
        C9768m.m32346f(c10126b, "annotationClassId");
        C9768m.m32346f(interfaceC10708z0, "source");
        C9768m.m32346f(list, "result");
        return new b(m33892N(c10126b), c10126b, list, interfaceC10708z0);
    }
}
