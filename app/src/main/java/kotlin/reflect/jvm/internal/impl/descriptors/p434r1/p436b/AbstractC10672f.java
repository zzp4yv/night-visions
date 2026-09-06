package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9988b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;

/* compiled from: ReflectJavaAnnotationArguments.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.f */
/* loaded from: classes2.dex */
public abstract class AbstractC10672f implements InterfaceC9988b {

    /* renamed from: a */
    public static final a f41185a = new a(null);

    /* renamed from: b */
    private final C10130f f41186b;

    /* compiled from: ReflectJavaAnnotationArguments.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.b.f$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10672f m38080a(Object obj, C10130f c10130f) {
            C9768m.m32346f(obj, "value");
            return C10670d.m38075g(obj.getClass()) ? new C10683q(c10130f, (Enum) obj) : obj instanceof Annotation ? new C10673g(c10130f, (Annotation) obj) : obj instanceof Object[] ? new C10676j(c10130f, (Object[]) obj) : obj instanceof Class ? new C10679m(c10130f, (Class) obj) : new C10685s(c10130f, obj);
        }
    }

    private AbstractC10672f(C10130f c10130f) {
        this.f41186b = c10130f;
    }

    public /* synthetic */ AbstractC10672f(C10130f c10130f, C9756g c9756g) {
        this(c10130f);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p388n0.InterfaceC9988b
    public C10130f getName() {
        return this.f41186b;
    }
}
