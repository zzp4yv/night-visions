package kotlin.reflect.p371y.internal.p374j0.p397f;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;

/* compiled from: FqNamesUtil.kt */
/* renamed from: kotlin.f0.y.e.j0.f.e */
/* loaded from: classes3.dex */
public final class C10129e {

    /* compiled from: FqNamesUtil.kt */
    /* renamed from: kotlin.f0.y.e.j0.f.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39260a;

        static {
            int[] iArr = new int[EnumC10135k.values().length];
            iArr[EnumC10135k.BEGINNING.ordinal()] = 1;
            iArr[EnumC10135k.AFTER_DOT.ordinal()] = 2;
            iArr[EnumC10135k.MIDDLE.ordinal()] = 3;
            f39260a = iArr;
        }
    }

    /* renamed from: a */
    public static final <V> V m35443a(C10127c c10127c, Map<C10127c, ? extends V> map) {
        Object next;
        C9768m.m32346f(c10127c, "<this>");
        C9768m.m32346f(map, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<C10127c, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<C10127c, ? extends V> next2 = it.next();
            C10127c key = next2.getKey();
            if (!C9768m.m32341a(c10127c, key) && !m35444b(c10127c, key)) {
                z = false;
            }
            if (z) {
                linkedHashMap.put(next2.getKey(), next2.getValue());
            }
        }
        if (!(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int length = m35449g((C10127c) ((Map.Entry) next).getKey(), c10127c).m35420b().length();
                do {
                    Object next3 = it2.next();
                    int length2 = m35449g((C10127c) ((Map.Entry) next3).getKey(), c10127c).m35420b().length();
                    if (length > length2) {
                        next = next3;
                        length = length2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (V) entry.getValue();
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m35444b(C10127c c10127c, C10127c c10127c2) {
        C9768m.m32346f(c10127c, "<this>");
        C9768m.m32346f(c10127c2, "packageName");
        return C9768m.m32341a(m35448f(c10127c), c10127c2);
    }

    /* renamed from: c */
    private static final boolean m35445c(String str, String str2) {
        return C10513u.m37511E(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    /* renamed from: d */
    public static final boolean m35446d(C10127c c10127c, C10127c c10127c2) {
        C9768m.m32346f(c10127c, "<this>");
        C9768m.m32346f(c10127c2, "packageName");
        if (C9768m.m32341a(c10127c, c10127c2) || c10127c2.m35422d()) {
            return true;
        }
        String m35420b = c10127c.m35420b();
        C9768m.m32345e(m35420b, "this.asString()");
        String m35420b2 = c10127c2.m35420b();
        C9768m.m32345e(m35420b2, "packageName.asString()");
        return m35445c(m35420b, m35420b2);
    }

    /* renamed from: e */
    public static final boolean m35447e(String str) {
        if (str == null) {
            return false;
        }
        EnumC10135k enumC10135k = EnumC10135k.BEGINNING;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            int i3 = a.f39260a[enumC10135k.ordinal()];
            if (i3 == 1 || i3 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                enumC10135k = EnumC10135k.MIDDLE;
            } else if (i3 != 3) {
                continue;
            } else if (charAt == '.') {
                enumC10135k = EnumC10135k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        return enumC10135k != EnumC10135k.AFTER_DOT;
    }

    /* renamed from: f */
    public static final C10127c m35448f(C10127c c10127c) {
        C9768m.m32346f(c10127c, "<this>");
        if (c10127c.m35422d()) {
            return null;
        }
        return c10127c.m35423e();
    }

    /* renamed from: g */
    public static final C10127c m35449g(C10127c c10127c, C10127c c10127c2) {
        C9768m.m32346f(c10127c, "<this>");
        C9768m.m32346f(c10127c2, "prefix");
        if (!m35446d(c10127c, c10127c2) || c10127c2.m35422d()) {
            return c10127c;
        }
        if (C9768m.m32341a(c10127c, c10127c2)) {
            C10127c c10127c3 = C10127c.f39250a;
            C9768m.m32345e(c10127c3, "ROOT");
            return c10127c3;
        }
        String m35420b = c10127c.m35420b();
        C9768m.m32345e(m35420b, "asString()");
        String substring = m35420b.substring(c10127c2.m35420b().length() + 1);
        C9768m.m32345e(substring, "this as java.lang.String).substring(startIndex)");
        return new C10127c(substring);
    }
}
