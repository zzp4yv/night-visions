package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import kotlin.C10742u;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10391h;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.C10394k;
import kotlin.reflect.p371y.internal.p374j0.p415l.p417u1.EnumC10393j;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.k */
/* loaded from: classes3.dex */
public abstract class AbstractC10182k extends AbstractC10178g<C10742u> {

    /* renamed from: b */
    public static final a f39565b = new a(null);

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.k$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10182k m36032a(String str) {
            C9768m.m32346f(str, "message");
            return new b(str);
        }
    }

    /* compiled from: constantValues.kt */
    /* renamed from: kotlin.f0.y.e.j0.i.r.k$b */
    public static final class b extends AbstractC10182k {

        /* renamed from: c */
        private final String f39566c;

        public b(String str) {
            C9768m.m32346f(str, "message");
            this.f39566c = str;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public C10391h mo36013a(InterfaceC10559g0 interfaceC10559g0) {
            C9768m.m32346f(interfaceC10559g0, "module");
            return C10394k.m37053d(EnumC10393j.f40326m0, this.f39566c);
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
        public String toString() {
            return this.f39566c;
        }
    }

    public AbstractC10182k() {
        super(C10742u.f41439a);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C10742u mo36023b() {
        throw new UnsupportedOperationException();
    }
}
