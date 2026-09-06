package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p414k.InterfaceC10297n;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;
import kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10312e1;

/* compiled from: typeParameterUtils.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.c */
/* loaded from: classes2.dex */
final class C10546c implements InterfaceC10554e1 {

    /* renamed from: f */
    private final InterfaceC10554e1 f40734f;

    /* renamed from: g */
    private final InterfaceC10576m f40735g;

    /* renamed from: h */
    private final int f40736h;

    public C10546c(InterfaceC10554e1 interfaceC10554e1, InterfaceC10576m interfaceC10576m, int i2) {
        C9768m.m32346f(interfaceC10554e1, "originalDescriptor");
        C9768m.m32346f(interfaceC10576m, "declarationDescriptor");
        this.f40734f = interfaceC10554e1;
        this.f40735g = interfaceC10576m;
        this.f40736h = i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: F */
    public boolean mo37669F() {
        return this.f40734f.mo37669F();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return (R) this.f40734f.mo37017L(interfaceC10595o, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10579n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: b */
    public InterfaceC10576m mo32876b() {
        return this.f40735g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: g */
    public int mo37670g() {
        return this.f40736h + this.f40734f.mo37670g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10581a
    public InterfaceC10587g getAnnotations() {
        return this.f40734f.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10565i0
    public C10130f getName() {
        return this.f40734f.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    public List<AbstractC10311e0> getUpperBounds() {
        return this.f40734f.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: h */
    public InterfaceC10312e1 mo32877h() {
        return this.f40734f.mo32877h();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: h0 */
    public InterfaceC10297n mo37671h0() {
        return this.f40734f.mo37671h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: n */
    public EnumC10351r1 mo37672n() {
        return this.f40734f.mo37672n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1
    /* renamed from: o0 */
    public boolean mo37673o0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h
    /* renamed from: s */
    public AbstractC10335m0 mo36400s() {
        return this.f40734f.mo36400s();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p
    /* renamed from: t */
    public InterfaceC10708z0 mo32883t() {
        return this.f40734f.mo32883t();
    }

    public String toString() {
        return this.f40734f + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    public InterfaceC10554e1 mo37019a() {
        InterfaceC10554e1 mo37019a = this.f40734f.mo37019a();
        C9768m.m32345e(mo37019a, "originalDescriptor.original");
        return mo37019a;
    }
}
