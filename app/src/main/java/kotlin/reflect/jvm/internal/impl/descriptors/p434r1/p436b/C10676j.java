package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.AbstractC10672f;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9994e;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.j */
/* loaded from: classes2.dex */
public final class C10676j extends AbstractC10672f implements InterfaceC9994e {

    /* renamed from: c */
    private final Object[] f41188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10676j(C10130f c10130f, Object[] objArr) {
        super(c10130f, null);
        C9768m.m32346f(objArr, "values");
        this.f41188c = objArr;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9994e
    /* renamed from: e */
    public List<AbstractC10672f> mo33585e() {
        Object[] objArr = this.f41188c;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            AbstractC10672f.a aVar = AbstractC10672f.f41185a;
            C9768m.m32343c(obj);
            arrayList.add(aVar.m38080a(obj, null));
        }
        return arrayList;
    }
}
