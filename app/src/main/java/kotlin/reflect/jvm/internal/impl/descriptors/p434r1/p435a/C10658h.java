package kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p435a;

import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10126b;
import kotlin.text.C10513u;

/* compiled from: ReflectKotlinClassFinder.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.r1.a.h */
/* loaded from: classes2.dex */
public final class C10658h {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m38029b(C10126b c10126b) {
        String m37524z;
        String m35420b = c10126b.m35414i().m35420b();
        C9768m.m32345e(m35420b, "relativeClassName.asString()");
        m37524z = C10513u.m37524z(m35420b, '.', '$', false, 4, null);
        if (c10126b.m35413h().m35422d()) {
            return m37524z;
        }
        return c10126b.m35413h() + '.' + m37524z;
    }
}
