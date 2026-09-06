package kotlin.reflect.p371y.internal.p374j0.p399h;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;

/* compiled from: DescriptorRenderer.kt */
/* renamed from: kotlin.f0.y.e.j0.h.m */
/* loaded from: classes3.dex */
public enum EnumC10149m {
    PLAIN { // from class: kotlin.f0.y.e.j0.h.m.b
        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.EnumC10149m
        /* renamed from: k */
        public String mo35762k(String str) {
            C9768m.m32346f(str, "string");
            return str;
        }
    },
    HTML { // from class: kotlin.f0.y.e.j0.h.m.a
        @Override // kotlin.reflect.p371y.internal.p374j0.p399h.EnumC10149m
        /* renamed from: k */
        public String mo35762k(String str) {
            String m37507A;
            String m37507A2;
            C9768m.m32346f(str, "string");
            m37507A = C10513u.m37507A(str, "<", "&lt;", false, 4, null);
            m37507A2 = C10513u.m37507A(m37507A, ">", "&gt;", false, 4, null);
            return m37507A2;
        }
    };

    /* synthetic */ EnumC10149m(C9756g c9756g) {
        this();
    }

    /* renamed from: k */
    public abstract String mo35762k(String str);
}
