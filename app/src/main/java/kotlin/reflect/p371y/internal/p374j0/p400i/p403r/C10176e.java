package kotlin.reflect.p371y.internal.p374j0.p400i.p403r;

import java.util.Arrays;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10559g0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10335m0;

/* compiled from: constantValues.kt */
/* renamed from: kotlin.f0.y.e.j0.i.r.e */
/* loaded from: classes3.dex */
public final class C10176e extends AbstractC10186o<Character> {
    public C10176e(char c2) {
        super(Character.valueOf(c2));
    }

    /* renamed from: c */
    private final String m36016c(char c2) {
        return c2 == '\b' ? "\\b" : c2 == '\t' ? "\\t" : c2 == '\n' ? "\\n" : c2 == '\f' ? "\\f" : c2 == '\r' ? "\\r" : m36017e(c2) ? String.valueOf(c2) : "?";
    }

    /* renamed from: e */
    private final boolean m36017e(char c2) {
        byte type = (byte) Character.getType(c2);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public AbstractC10335m0 mo36013a(InterfaceC10559g0 interfaceC10559g0) {
        C9768m.m32346f(interfaceC10559g0, "module");
        AbstractC10335m0 m32801u = interfaceC10559g0.mo37021o().m32801u();
        C9768m.m32345e(m32801u, "module.builtIns.charType");
        return m32801u;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p403r.AbstractC10178g
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(mo36023b().charValue()), m36016c(mo36023b().charValue())}, 2));
        C9768m.m32345e(format, "format(this, *args)");
        return format;
    }
}
