package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import cm.aptoide.p092pt.database.room.RoomNotification;
import java.util.Set;
import kotlin.collections.C10787v0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9884k;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;

/* compiled from: ClassDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.i */
/* loaded from: classes3.dex */
public final class C10266i {

    /* renamed from: a */
    public static final b f39901a = new b(null);

    /* renamed from: b */
    private static final Set<C10126b> f39902b;

    /* renamed from: c */
    private final C10268k f39903c;

    /* renamed from: d */
    private final Function1<a, InterfaceC10552e> f39904d;

    /* compiled from: ClassDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.i$a */
    private static final class a {

        /* renamed from: a */
        private final C10126b f39905a;

        /* renamed from: b */
        private final C10250g f39906b;

        public a(C10126b c10126b, C10250g c10250g) {
            C9768m.m32346f(c10126b, "classId");
            this.f39905a = c10126b;
            this.f39906b = c10250g;
        }

        /* renamed from: a */
        public final C10250g m36410a() {
            return this.f39906b;
        }

        /* renamed from: b */
        public final C10126b m36411b() {
            return this.f39905a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C9768m.m32341a(this.f39905a, ((a) obj).f39905a);
        }

        public int hashCode() {
            return this.f39905a.hashCode();
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.i$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final Set<C10126b> m36412a() {
            return C10266i.f39902b;
        }
    }

    /* compiled from: ClassDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.i$c */
    static final class c extends Lambda implements Function1<a, InterfaceC10552e> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC10552e invoke(a aVar) {
            C9768m.m32346f(aVar, RoomNotification.KEY);
            return C10266i.this.m36407c(aVar);
        }
    }

    static {
        Set<C10126b> m38916c;
        m38916c = C10787v0.m38916c(C10126b.m35408m(C9884k.a.f37566d.m35441l()));
        f39902b = m38916c;
    }

    public C10266i(C10268k c10268k) {
        C9768m.m32346f(c10268k, "components");
        this.f39903c = c10268k;
        this.f39904d = c10268k.m36436u().mo36521i(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8 A[EDGE_INSN: B:43:0x00b8->B:44:0x00b8 BREAK  A[LOOP:1: B:34:0x0090->B:48:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[LOOP:1: B:34:0x0090->B:48:?, LOOP_END, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e m36407c(kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10266i.a r13) {
        /*
            r12 = this;
            kotlin.f0.y.e.j0.f.b r0 = r13.m36411b()
            kotlin.f0.y.e.j0.j.b.k r1 = r12.f39903c
            java.lang.Iterable r1 = r1.m36426k()
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.o1.b r2 = (kotlin.reflect.jvm.internal.impl.descriptors.p431o1.InterfaceC10598b) r2
            kotlin.reflect.jvm.internal.impl.descriptors.e r2 = r2.mo32850c(r0)
            if (r2 == 0) goto Le
            return r2
        L21:
            java.util.Set<kotlin.f0.y.e.j0.f.b> r1 = kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10266i.f39902b
            boolean r1 = r1.contains(r0)
            r2 = 0
            if (r1 == 0) goto L2b
            return r2
        L2b:
            kotlin.f0.y.e.j0.j.b.g r13 = r13.m36410a()
            if (r13 != 0) goto L3e
            kotlin.f0.y.e.j0.j.b.k r13 = r12.f39903c
            kotlin.f0.y.e.j0.j.b.h r13 = r13.m36420e()
            kotlin.f0.y.e.j0.j.b.g r13 = r13.mo33978a(r0)
            if (r13 != 0) goto L3e
            return r2
        L3e:
            kotlin.f0.y.e.j0.e.z.c r1 = r13.m36252a()
            kotlin.f0.y.e.j0.e.c r10 = r13.m36253b()
            kotlin.f0.y.e.j0.e.z.a r11 = r13.m36254c()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r13 = r13.m36255d()
            kotlin.f0.y.e.j0.f.b r3 = r0.m35412g()
            java.lang.String r4 = "classId.shortClassName"
            if (r3 == 0) goto L79
            r5 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.e r3 = m36408e(r12, r3, r2, r5, r2)
            boolean r5 = r3 instanceof kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10254d
            if (r5 == 0) goto L62
            kotlin.f0.y.e.j0.j.b.g0.d r3 = (kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p413g0.C10254d) r3
            goto L63
        L62:
            r3 = r2
        L63:
            if (r3 != 0) goto L66
            return r2
        L66:
            kotlin.f0.y.e.j0.f.f r0 = r0.m35415j()
            kotlin.jvm.internal.C9768m.m32345e(r0, r4)
            boolean r0 = r3.m36287h1(r0)
            if (r0 != 0) goto L74
            return r2
        L74:
            kotlin.f0.y.e.j0.j.b.m r0 = r3.m36282b1()
            goto Le4
        L79:
            kotlin.f0.y.e.j0.j.b.k r3 = r12.f39903c
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r3 = r3.m36433r()
            kotlin.f0.y.e.j0.f.c r5 = r0.m35413h()
            java.lang.String r6 = "classId.packageFqName"
            kotlin.jvm.internal.C9768m.m32345e(r5, r6)
            java.util.List r3 = kotlin.reflect.jvm.internal.impl.descriptors.C10580n0.m37725c(r3, r5)
            java.util.Iterator r3 = r3.iterator()
        L90:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lb7
            java.lang.Object r5 = r3.next()
            r6 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0) r6
            boolean r7 = r6 instanceof kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10273p
            if (r7 == 0) goto Lb3
            kotlin.f0.y.e.j0.j.b.p r6 = (kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10273p) r6
            kotlin.f0.y.e.j0.f.f r7 = r0.m35415j()
            kotlin.jvm.internal.C9768m.m32345e(r7, r4)
            boolean r6 = r6.m36464L0(r7)
            if (r6 == 0) goto Lb1
            goto Lb3
        Lb1:
            r6 = 0
            goto Lb4
        Lb3:
            r6 = 1
        Lb4:
            if (r6 == 0) goto L90
            goto Lb8
        Lb7:
            r5 = r2
        Lb8:
            r4 = r5
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10571k0) r4
            if (r4 != 0) goto Lbe
            return r2
        Lbe:
            kotlin.f0.y.e.j0.j.b.k r3 = r12.f39903c
            kotlin.f0.y.e.j0.e.z.g r6 = new kotlin.f0.y.e.j0.e.z.g
            kotlin.f0.y.e.j0.e.t r0 = r10.m34469i1()
            java.lang.String r2 = "classProto.typeTable"
            kotlin.jvm.internal.C9768m.m32345e(r0, r2)
            r6.<init>(r0)
            kotlin.f0.y.e.j0.e.z.h$a r0 = kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10123h.f39237a
            kotlin.f0.y.e.j0.e.w r2 = r10.m34471k1()
            java.lang.String r5 = "classProto.versionRequirementTable"
            kotlin.jvm.internal.C9768m.m32345e(r2, r5)
            kotlin.f0.y.e.j0.e.z.h r7 = r0.m35401a(r2)
            r9 = 0
            r5 = r1
            r8 = r11
            kotlin.f0.y.e.j0.j.b.m r0 = r3.m36416a(r4, r5, r6, r7, r8, r9)
        Le4:
            r4 = r0
            kotlin.f0.y.e.j0.j.b.g0.d r0 = new kotlin.f0.y.e.j0.j.b.g0.d
            r3 = r0
            r5 = r10
            r6 = r1
            r7 = r11
            r8 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p410j.p411b.C10266i.m36407c(kotlin.f0.y.e.j0.j.b.i$a):kotlin.reflect.jvm.internal.impl.descriptors.e");
    }

    /* renamed from: e */
    public static /* synthetic */ InterfaceC10552e m36408e(C10266i c10266i, C10126b c10126b, C10250g c10250g, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c10250g = null;
        }
        return c10266i.m36409d(c10126b, c10250g);
    }

    /* renamed from: d */
    public final InterfaceC10552e m36409d(C10126b c10126b, C10250g c10250g) {
        C9768m.m32346f(c10126b, "classId");
        return this.f39904d.invoke(new a(c10126b, c10250g));
    }
}
