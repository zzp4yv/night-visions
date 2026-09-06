package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10749c0;
import kotlin.collections.C10784u;
import kotlin.internal.C10836c;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10513u;
import okhttp3.HttpUrl;

/* compiled from: ClassMapperLite.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.b */
/* loaded from: classes3.dex */
public final class C10081b {

    /* renamed from: a */
    public static final C10081b f38583a = new C10081b();

    /* renamed from: b */
    private static final String f38584b;

    /* renamed from: c */
    private static final Map<String, String> f38585c;

    static {
        List m38891m;
        String m38599e0;
        List m38891m2;
        List<String> m38891m3;
        List<String> m38891m4;
        List<String> m38891m5;
        m38891m = C10784u.m38891m('k', 'o', 't', 'l', 'i', 'n');
        m38599e0 = C10749c0.m38599e0(m38891m, HttpUrl.FRAGMENT_ENCODE_SET, null, null, 0, null, null, 62, null);
        f38584b = m38599e0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        m38891m2 = C10784u.m38891m("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int m39068c = C10836c.m39068c(0, m38891m2.size() - 1, 2);
        if (m39068c >= 0) {
            int i2 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f38584b;
                sb.append(str);
                sb.append('/');
                sb.append((String) m38891m2.get(i2));
                int i3 = i2 + 1;
                linkedHashMap.put(sb.toString(), m38891m2.get(i3));
                linkedHashMap.put(str + '/' + ((String) m38891m2.get(i2)) + "Array", '[' + ((String) m38891m2.get(i3)));
                if (i2 == m39068c) {
                    break;
                } else {
                    i2 += 2;
                }
            }
        }
        linkedHashMap.put(f38584b + "/Unit", "V");
        m34244a(linkedHashMap, "Any", "java/lang/Object");
        m34244a(linkedHashMap, "Nothing", "java/lang/Void");
        m34244a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        m38891m3 = C10784u.m38891m("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum");
        for (String str2 : m38891m3) {
            m34244a(linkedHashMap, str2, "java/lang/" + str2);
        }
        m38891m4 = C10784u.m38891m("Iterator", "Collection", "List", "Set", "Map", "ListIterator");
        for (String str3 : m38891m4) {
            m34244a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            m34244a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        m34244a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m34244a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m34244a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m34244a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i4 = 0; i4 < 23; i4++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f38584b;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i4);
            m34244a(linkedHashMap, "Function" + i4, sb2.toString());
            m34244a(linkedHashMap, "reflect/KFunction" + i4, str4 + "/reflect/KFunction");
        }
        m38891m5 = C10784u.m38891m("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum");
        for (String str5 : m38891m5) {
            m34244a(linkedHashMap, str5 + ".Companion", f38584b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f38585c = linkedHashMap;
    }

    private C10081b() {
    }

    /* renamed from: a */
    private static final void m34244a(Map<String, String> map, String str, String str2) {
        map.put(f38584b + '/' + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m34245b(String str) {
        String m37524z;
        C9768m.m32346f(str, "classId");
        String str2 = f38585c.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('L');
        m37524z = C10513u.m37524z(str, '.', '$', false, 4, null);
        sb.append(m37524z);
        sb.append(';');
        return sb.toString();
    }
}
