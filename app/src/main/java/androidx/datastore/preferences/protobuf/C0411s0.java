package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0423y;
import cm.aptoide.p092pt.database.room.RoomNotification;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import okhttp3.HttpUrl;

/* compiled from: MessageLiteToString.java */
/* renamed from: androidx.datastore.preferences.protobuf.s0 */
/* loaded from: classes.dex */
final class C0411s0 {
    /* renamed from: a */
    private static final String m3210a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m3211b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? ((Float) obj).floatValue() == 0.0f : obj instanceof Double ? ((Double) obj).doubleValue() == 0.0d : obj instanceof String ? obj.equals(HttpUrl.FRAGMENT_ENCODE_SET) : obj instanceof AbstractC0377h ? obj.equals(AbstractC0377h.f2734f) : obj instanceof InterfaceC0405q0 ? obj == ((InterfaceC0405q0) obj).mo3201b() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    /* renamed from: c */
    static final void m3212c(StringBuilder sb, int i2, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m3212c(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m3212c(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C0388k1.m2940c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0377h) {
            sb.append(": \"");
            sb.append(C0388k1.m2938a((AbstractC0377h) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0423y) {
            sb.append(" {");
            m3213d((AbstractC0423y) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        m3212c(sb, i5, RoomNotification.KEY, entry.getKey());
        m3212c(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    /* renamed from: d */
    private static void m3213d(InterfaceC0405q0 interfaceC0405q0, StringBuilder sb, int i2) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : interfaceC0405q0.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String replaceFirst = str.replaceFirst("get", HttpUrl.FRAGMENT_ENCODE_SET);
            boolean z = true;
            if (replaceFirst.endsWith("List") && !replaceFirst.endsWith("OrBuilderList") && !replaceFirst.equals("List")) {
                String str2 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 4);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    m3212c(sb, i2, m3210a(str2), AbstractC0423y.m3338y(method2, interfaceC0405q0, new Object[0]));
                }
            }
            if (replaceFirst.endsWith("Map") && !replaceFirst.equals("Map")) {
                String str3 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1, replaceFirst.length() - 3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    m3212c(sb, i2, m3210a(str3), AbstractC0423y.m3338y(method3, interfaceC0405q0, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set" + replaceFirst)) != null) {
                if (replaceFirst.endsWith("Bytes")) {
                    if (hashMap.containsKey("get" + replaceFirst.substring(0, replaceFirst.length() - 5))) {
                    }
                }
                String str4 = replaceFirst.substring(0, 1).toLowerCase() + replaceFirst.substring(1);
                Method method4 = (Method) hashMap.get("get" + replaceFirst);
                Method method5 = (Method) hashMap.get("has" + replaceFirst);
                if (method4 != null) {
                    Object m3338y = AbstractC0423y.m3338y(method4, interfaceC0405q0, new Object[0]);
                    if (method5 != null) {
                        z = ((Boolean) AbstractC0423y.m3338y(method5, interfaceC0405q0, new Object[0])).booleanValue();
                    } else if (m3211b(m3338y)) {
                        z = false;
                    }
                    if (z) {
                        m3212c(sb, i2, m3210a(str4), m3338y);
                    }
                }
            }
        }
        if (interfaceC0405q0 instanceof AbstractC0423y.c) {
            Iterator<Map.Entry<AbstractC0423y.d, Object>> m3296s = ((AbstractC0423y.c) interfaceC0405q0).extensions.m3296s();
            while (m3296s.hasNext()) {
                Map.Entry<AbstractC0423y.d, Object> next = m3296s.next();
                m3212c(sb, i2, "[" + next.getKey().mo3301f() + "]", next.getValue());
            }
        }
        C0394m1 c0394m1 = ((AbstractC0423y) interfaceC0405q0).unknownFields;
        if (c0394m1 != null) {
            c0394m1.m3045m(sb, i2);
        }
    }

    /* renamed from: e */
    static String m3214e(InterfaceC0405q0 interfaceC0405q0, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m3213d(interfaceC0405q0, sb, 0);
        return sb.toString();
    }
}
