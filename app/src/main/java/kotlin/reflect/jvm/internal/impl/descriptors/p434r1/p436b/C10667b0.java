package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9989b0;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import okhttp3.HttpUrl;

/* compiled from: ReflectJavaValueParameter.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.b0 */
/* loaded from: classes2.dex */
public final class C10667b0 extends AbstractC10682p implements InterfaceC9989b0 {

    /* renamed from: a */
    private final AbstractC10692z f41167a;

    /* renamed from: b */
    private final Annotation[] f41168b;

    /* renamed from: c */
    private final String f41169c;

    /* renamed from: d */
    private final boolean f41170d;

    public C10667b0(AbstractC10692z abstractC10692z, Annotation[] annotationArr, String str, boolean z) {
        C9768m.m32346f(abstractC10692z, "type");
        C9768m.m32346f(annotationArr, "reflectAnnotations");
        this.f41167a = abstractC10692z;
        this.f41168b = annotationArr;
        this.f41169c = str;
        this.f41170d = z;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public C10671e mo33582l(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        return C10675i.m38084a(this.f41168b, c10127c);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public List<C10671e> getAnnotations() {
        return C10675i.m38085b(this.f41168b);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9989b0
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public AbstractC10692z getType() {
        return this.f41167a;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9989b0
    public C10130f getName() {
        String str = this.f41169c;
        if (str != null) {
            return C10130f.m35453v(str);
        }
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9989b0
    /* renamed from: h */
    public boolean mo33578h() {
        return this.f41170d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9992d
    /* renamed from: m */
    public boolean mo33583m() {
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C10667b0.class.getName());
        sb.append(": ");
        sb.append(mo33578h() ? "vararg " : HttpUrl.FRAGMENT_ENCODE_SET);
        sb.append(getName());
        sb.append(": ");
        sb.append(getType());
        return sb.toString();
    }
}
