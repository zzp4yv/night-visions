package p241e.p307h.p308a.p309e0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p241e.p307h.p308a.p311g0.C8980c;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: RedirectHandler.java */
/* renamed from: e.h.a.e0.d */
/* loaded from: classes2.dex */
public class C8970d {
    /* renamed from: a */
    private static InterfaceC8968b m28721a(Map<String, List<String>> map, String str) throws IOException {
        InterfaceC8968b m28792a = C8980c.m28789j().m28792a(str);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                Iterator<String> it = value.iterator();
                while (it.hasNext()) {
                    m28792a.mo27915f(key, it.next());
                }
            }
        }
        return m28792a;
    }

    /* renamed from: b */
    private static boolean m28722b(int i2) {
        return i2 == 301 || i2 == 302 || i2 == 303 || i2 == 300 || i2 == 307 || i2 == 308;
    }

    /* renamed from: c */
    public static InterfaceC8968b m28723c(Map<String, List<String>> map, InterfaceC8968b interfaceC8968b, List<String> list) throws IOException, IllegalAccessException {
        int mo27913d = interfaceC8968b.mo27913d();
        String mo27914e = interfaceC8968b.mo27914e("Location");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (m28722b(mo27913d)) {
            if (mo27914e == null) {
                throw new IllegalAccessException(C9003f.m29009o("receive %d (redirect) but the location is null with response [%s]", Integer.valueOf(mo27913d), interfaceC8968b.mo27911b()));
            }
            if (C9001d.f34819a) {
                C9001d.m28962a(C8970d.class, "redirect to %s with %d, %s", mo27914e, Integer.valueOf(mo27913d), arrayList);
            }
            interfaceC8968b.mo27916g();
            interfaceC8968b = m28721a(map, mo27914e);
            arrayList.add(mo27914e);
            interfaceC8968b.execute();
            mo27913d = interfaceC8968b.mo27913d();
            mo27914e = interfaceC8968b.mo27914e("Location");
            i2++;
            if (i2 >= 10) {
                throw new IllegalAccessException(C9003f.m29009o("redirect too many times! %s", arrayList));
            }
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return interfaceC8968b;
    }
}
