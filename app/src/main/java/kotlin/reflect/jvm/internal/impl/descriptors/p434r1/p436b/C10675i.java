package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.C9719a;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: ReflectJavaAnnotationOwner.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.i */
/* loaded from: classes2.dex */
public final class C10675i {
    /* renamed from: a */
    public static final C10671e m38084a(Annotation[] annotationArr, C10127c c10127c) {
        Annotation annotation;
        C9768m.m32346f(annotationArr, "<this>");
        C9768m.m32346f(c10127c, "fqName");
        int length = annotationArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i2];
            if (C9768m.m32341a(C10670d.m38069a(C9719a.m32276b(C9719a.m32275a(annotation))).m35409b(), c10127c)) {
                break;
            }
            i2++;
        }
        if (annotation != null) {
            return new C10671e(annotation);
        }
        return null;
    }

    /* renamed from: b */
    public static final List<C10671e> m38085b(Annotation[] annotationArr) {
        C9768m.m32346f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new C10671e(annotation));
        }
        return arrayList;
    }
}
