package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10091c;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10117b;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.C10122g;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.InterfaceC10118c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: ProtoContainer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.z */
/* loaded from: classes3.dex */
public abstract class AbstractC10283z {

    /* renamed from: a */
    private final InterfaceC10118c f39994a;

    /* renamed from: b */
    private final C10122g f39995b;

    /* renamed from: c */
    private final InterfaceC10708z0 f39996c;

    /* compiled from: ProtoContainer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.z$a */
    public static final class a extends AbstractC10283z {

        /* renamed from: d */
        private final C10091c f39997d;

        /* renamed from: e */
        private final a f39998e;

        /* renamed from: f */
        private final C10126b f39999f;

        /* renamed from: g */
        private final C10091c.c f40000g;

        /* renamed from: h */
        private final boolean f40001h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C10091c c10091c, InterfaceC10118c interfaceC10118c, C10122g c10122g, InterfaceC10708z0 interfaceC10708z0, a aVar) {
            super(interfaceC10118c, c10122g, interfaceC10708z0, null);
            C9768m.m32346f(c10091c, "classProto");
            C9768m.m32346f(interfaceC10118c, "nameResolver");
            C9768m.m32346f(c10122g, "typeTable");
            this.f39997d = c10091c;
            this.f39998e = aVar;
            this.f39999f = C10281x.m36494a(interfaceC10118c, c10091c.m34439F0());
            C10091c.c mo35368d = C10117b.f39209f.mo35368d(c10091c.m34438E0());
            this.f40000g = mo35368d == null ? C10091c.c.CLASS : mo35368d;
            Boolean mo35368d2 = C10117b.f39210g.mo35368d(c10091c.m34438E0());
            C9768m.m32345e(mo35368d2, "IS_INNER.get(classProto.flags)");
            this.f40001h = mo35368d2.booleanValue();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10283z
        /* renamed from: a */
        public C10127c mo36497a() {
            C10127c m35409b = this.f39999f.m35409b();
            C9768m.m32345e(m35409b, "classId.asSingleFqName()");
            return m35409b;
        }

        /* renamed from: e */
        public final C10126b m36501e() {
            return this.f39999f;
        }

        /* renamed from: f */
        public final C10091c m36502f() {
            return this.f39997d;
        }

        /* renamed from: g */
        public final C10091c.c m36503g() {
            return this.f40000g;
        }

        /* renamed from: h */
        public final a m36504h() {
            return this.f39998e;
        }

        /* renamed from: i */
        public final boolean m36505i() {
            return this.f40001h;
        }
    }

    /* compiled from: ProtoContainer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.z$b */
    public static final class b extends AbstractC10283z {

        /* renamed from: d */
        private final C10127c f40002d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C10127c c10127c, InterfaceC10118c interfaceC10118c, C10122g c10122g, InterfaceC10708z0 interfaceC10708z0) {
            super(interfaceC10118c, c10122g, interfaceC10708z0, null);
            C9768m.m32346f(c10127c, "fqName");
            C9768m.m32346f(interfaceC10118c, "nameResolver");
            C9768m.m32346f(c10122g, "typeTable");
            this.f40002d = c10127c;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.AbstractC10283z
        /* renamed from: a */
        public C10127c mo36497a() {
            return this.f40002d;
        }
    }

    private AbstractC10283z(InterfaceC10118c interfaceC10118c, C10122g c10122g, InterfaceC10708z0 interfaceC10708z0) {
        this.f39994a = interfaceC10118c;
        this.f39995b = c10122g;
        this.f39996c = interfaceC10708z0;
    }

    public /* synthetic */ AbstractC10283z(InterfaceC10118c interfaceC10118c, C10122g c10122g, InterfaceC10708z0 interfaceC10708z0, C9756g c9756g) {
        this(interfaceC10118c, c10122g, interfaceC10708z0);
    }

    /* renamed from: a */
    public abstract C10127c mo36497a();

    /* renamed from: b */
    public final InterfaceC10118c m36498b() {
        return this.f39994a;
    }

    /* renamed from: c */
    public final InterfaceC10708z0 m36499c() {
        return this.f39996c;
    }

    /* renamed from: d */
    public final C10122g m36500d() {
        return this.f39995b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + mo36497a();
    }
}
