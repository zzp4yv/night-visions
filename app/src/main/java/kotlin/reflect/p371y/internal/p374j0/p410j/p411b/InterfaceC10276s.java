package kotlin.reflect.p371y.internal.p374j0.p410j.p411b;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10105q;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: FlexibleTypeDeserializer.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.s */
/* loaded from: classes3.dex */
public interface InterfaceC10276s {

    /* compiled from: FlexibleTypeDeserializer.kt */
    /* renamed from: kotlin.f0.y.e.j0.j.b.s$a */
    public static final class a implements InterfaceC10276s {

        /* renamed from: a */
        public static final a f39955a = new a();

        private a() {
        }

        @Override // kotlin.reflect.p371y.internal.p374j0.p410j.p411b.InterfaceC10276s
        /* renamed from: a */
        public AbstractC10311e0 mo33979a(C10105q c10105q, String str, AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02) {
            C9768m.m32346f(c10105q, "proto");
            C9768m.m32346f(str, "flexibleId");
            C9768m.m32346f(abstractC10335m0, "lowerBound");
            C9768m.m32346f(abstractC10335m02, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    /* renamed from: a */
    AbstractC10311e0 mo33979a(C10105q c10105q, String str, AbstractC10335m0 abstractC10335m0, AbstractC10335m0 abstractC10335m02);
}
