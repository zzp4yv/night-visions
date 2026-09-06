package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10322i;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;
import kotlin.reflect.p371y.internal.p374j0.p415l.p419w1.InterfaceC10409i;

/* compiled from: KotlinTypeRefiner.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10363g extends AbstractC10322i {

    /* compiled from: KotlinTypeRefiner.kt */
    /* renamed from: kotlin.f0.y.e.j0.l.t1.g$a */
    public static final class a extends AbstractC10363g {

        /* renamed from: a */
        public static final a f40183a = new a();

        private a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g
        /* renamed from: b */
        public InterfaceC10552e mo36924b(C10126b c10126b) {
            C9768m.m32346f(c10126b, "classId");
            return null;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g
        /* renamed from: c */
        public <S extends InterfaceC10218h> S mo36925c(InterfaceC10552e interfaceC10552e, Function0<? extends S> function0) {
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            C9768m.m32346f(function0, "compute");
            return function0.invoke();
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g
        /* renamed from: d */
        public boolean mo36926d(InterfaceC10559g0 interfaceC10559g0) {
            C9768m.m32346f(interfaceC10559g0, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g
        /* renamed from: e */
        public boolean mo36927e(InterfaceC10312e1 interfaceC10312e1) {
            C9768m.m32346f(interfaceC10312e1, "typeConstructor");
            return false;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g
        /* renamed from: g */
        public Collection<AbstractC10311e0> mo36929g(InterfaceC10552e interfaceC10552e) {
            C9768m.m32346f(interfaceC10552e, "classDescriptor");
            Collection<AbstractC10311e0> mo35998a = interfaceC10552e.mo32877h().mo35998a();
            C9768m.m32345e(mo35998a, "classDescriptor.typeConstructor.supertypes");
            return mo35998a;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10322i
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC10311e0 mo36717a(InterfaceC10409i interfaceC10409i) {
            C9768m.m32346f(interfaceC10409i, "type");
            return (AbstractC10311e0) interfaceC10409i;
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10363g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC10552e mo36928f(InterfaceC10576m interfaceC10576m) {
            C9768m.m32346f(interfaceC10576m, "descriptor");
            return null;
        }
    }

    /* renamed from: b */
    public abstract InterfaceC10552e mo36924b(C10126b c10126b);

    /* renamed from: c */
    public abstract <S extends InterfaceC10218h> S mo36925c(InterfaceC10552e interfaceC10552e, Function0<? extends S> function0);

    /* renamed from: d */
    public abstract boolean mo36926d(InterfaceC10559g0 interfaceC10559g0);

    /* renamed from: e */
    public abstract boolean mo36927e(InterfaceC10312e1 interfaceC10312e1);

    /* renamed from: f */
    public abstract InterfaceC10561h mo36928f(InterfaceC10576m interfaceC10576m);

    /* renamed from: g */
    public abstract Collection<AbstractC10311e0> mo36929g(InterfaceC10552e interfaceC10552e);

    /* renamed from: h */
    public abstract AbstractC10311e0 mo36717a(InterfaceC10409i interfaceC10409i);
}
