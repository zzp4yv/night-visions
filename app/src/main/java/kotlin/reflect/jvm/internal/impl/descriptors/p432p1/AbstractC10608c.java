package kotlin.reflect.jvm.internal.impl.descriptors.p432p1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC10697u;
import kotlin.reflect.jvm.internal.impl.descriptors.C10695t;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10552e;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10566i1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10595o;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10645q0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10702w0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10708z0;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10132h;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.p409o.C10233i;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10333l1;
import kotlin.reflect.p371y.internal.p374j0.p415l.EnumC10351r1;

/* compiled from: AbstractReceiverParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.p1.c */
/* loaded from: classes2.dex */
public abstract class AbstractC10608c extends AbstractC10622j implements InterfaceC10702w0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC10608c(InterfaceC10587g interfaceC10587g) {
        super(interfaceC10587g, C10132h.f39272h);
        if (interfaceC10587g == null) {
            m37776v(0);
        }
    }

    /* renamed from: v */
    private static /* synthetic */ void m37776v(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        switch (i2) {
            case 1:
                objArr[0] = "substitutor";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i2) {
            case 2:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 3:
                objArr[1] = "getTypeParameters";
                break;
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getValueParameters";
                break;
            case 6:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 7:
                objArr[1] = "getVisibility";
                break;
            case 8:
                objArr[1] = "getOriginal";
                break;
            case 9:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i2) {
            case 1:
                objArr[2] = "substitute";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: G */
    public boolean mo33204G() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p432p1.AbstractC10622j, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public InterfaceC10645q0 mo37019a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: L */
    public <R, D> R mo37017L(InterfaceC10595o<R, D> interfaceC10595o, D d2) {
        return interfaceC10595o.mo35682l(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: e */
    public Collection<? extends InterfaceC10540a> mo37027e() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            m37776v(6);
        }
        return emptySet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: f */
    public List<InterfaceC10566i1> mo37028f() {
        List<InterfaceC10566i1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m37776v(5);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: f0 */
    public InterfaceC10702w0 mo37029f0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public AbstractC10311e0 getReturnType() {
        return getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10563h1
    public AbstractC10311e0 getType() {
        AbstractC10311e0 type = getValue().getType();
        if (type == null) {
            m37776v(4);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    public List<InterfaceC10554e1> getTypeParameters() {
        List<InterfaceC10554e1> emptyList = Collections.emptyList();
        if (emptyList == null) {
            m37776v(3);
        }
        return emptyList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10644q, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10547c0
    public AbstractC10697u getVisibility() {
        AbstractC10697u abstractC10697u = C10695t.f41221f;
        if (abstractC10697u == null) {
            m37776v(7);
        }
        return abstractC10697u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: m0 */
    public InterfaceC10702w0 mo37032m0() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10602p
    /* renamed from: t */
    public InterfaceC10708z0 mo32883t() {
        InterfaceC10708z0 interfaceC10708z0 = InterfaceC10708z0.f41247a;
        if (interfaceC10708z0 == null) {
            m37776v(9);
        }
        return interfaceC10708z0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10545b1
    /* renamed from: c, reason: avoid collision after fix types in other method */
    public InterfaceC10702w0 mo36396c(C10333l1 c10333l1) {
        if (c10333l1 == null) {
            m37776v(1);
        }
        if (c10333l1.m36756k()) {
            return this;
        }
        AbstractC10311e0 m36759p = mo32876b() instanceof InterfaceC10552e ? c10333l1.m36759p(getType(), EnumC10351r1.OUT_VARIANCE) : c10333l1.m36759p(getType(), EnumC10351r1.INVARIANT);
        if (m36759p == null) {
            return null;
        }
        return m36759p == getType() ? this : new C10615f0(mo32876b(), new C10233i(m36759p), getAnnotations());
    }
}
