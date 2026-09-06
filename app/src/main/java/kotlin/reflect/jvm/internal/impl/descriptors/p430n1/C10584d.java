package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p399h.AbstractC10139c;
import kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;

/* compiled from: AnnotationDescriptorImpl.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.d */
/* loaded from: classes2.dex */
public class C10584d implements InterfaceC10583c {

    /* renamed from: a */
    private final AbstractC10311e0 f40788a;

    /* renamed from: b */
    private final Map<C10130f, AbstractC10178g<?>> f40789b;

    /* renamed from: c */
    private final InterfaceC10708z0 f40790c;

    public C10584d(AbstractC10311e0 abstractC10311e0, Map<C10130f, AbstractC10178g<?>> map, InterfaceC10708z0 interfaceC10708z0) {
        if (abstractC10311e0 == null) {
            m37728b(0);
        }
        if (map == null) {
            m37728b(1);
        }
        if (interfaceC10708z0 == null) {
            m37728b(2);
        }
        this.f40788a = abstractC10311e0;
        this.f40789b = map;
        this.f40790c = interfaceC10708z0;
    }

    /* renamed from: b */
    private static /* synthetic */ void m37728b(int i2) {
        String str = (i2 == 3 || i2 == 4 || i2 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 3 || i2 == 4 || i2 == 5) ? 2 : 3];
        if (i2 == 1) {
            objArr[0] = "valueArguments";
        } else if (i2 == 2) {
            objArr[0] = "source";
        } else if (i2 == 3 || i2 == 4 || i2 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i2 == 3) {
            objArr[1] = "getType";
        } else if (i2 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i2 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: a */
    public Map<C10130f, AbstractC10178g<?>> mo33159a() {
        Map<C10130f, AbstractC10178g<?>> map = this.f40789b;
        if (map == null) {
            m37728b(4);
        }
        return map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: d */
    public C10127c mo33162d() {
        return InterfaceC10583c.a.m37727a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    public AbstractC10311e0 getType() {
        AbstractC10311e0 abstractC10311e0 = this.f40788a;
        if (abstractC10311e0 == null) {
            m37728b(3);
        }
        return abstractC10311e0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c
    /* renamed from: t */
    public InterfaceC10708z0 mo33164t() {
        InterfaceC10708z0 interfaceC10708z0 = this.f40790c;
        if (interfaceC10708z0 == null) {
            m37728b(5);
        }
        return interfaceC10708z0;
    }

    public String toString() {
        return AbstractC10139c.f39377g.mo35501r(this, null);
    }
}
