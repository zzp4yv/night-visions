package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10692z;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10004n;

/* compiled from: ReflectJavaField.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.r */
/* loaded from: classes2.dex */
public final class C10684r extends AbstractC10686t implements InterfaceC10004n {

    /* renamed from: a */
    private final Field f41207a;

    public C10684r(Field field) {
        C9768m.m32346f(field, "member");
        this.f41207a = field;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10004n
    /* renamed from: G */
    public boolean mo33613G() {
        return mo38106U().isEnumConstant();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10004n
    /* renamed from: O */
    public boolean mo33614O() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10686t
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public Field mo38106U() {
        return this.f41207a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC10004n
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public AbstractC10692z getType() {
        AbstractC10692z.a aVar = AbstractC10692z.f41215a;
        Type genericType = mo38106U().getGenericType();
        C9768m.m32345e(genericType, "member.genericType");
        return aVar.m38122a(genericType);
    }
}
