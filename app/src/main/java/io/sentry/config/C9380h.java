package io.sentry.config;

import io.sentry.C9488n5;
import java.util.ArrayList;
import java.util.Properties;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: PropertiesProviderFactory.java */
@ApiStatus.Internal
/* renamed from: io.sentry.config.h */
/* loaded from: classes2.dex */
public final class C9380h {
    /* renamed from: a */
    public static InterfaceC9379g m30716a() {
        Properties m30710a;
        Properties m30710a2;
        C9488n5 c9488n5 = new C9488n5();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C9382j());
        arrayList.add(new C9376d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (m30710a2 = new C9377e(property, c9488n5).m30710a()) != null) {
            arrayList.add(new C9381i(m30710a2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (m30710a = new C9377e(str, c9488n5).m30710a()) != null) {
            arrayList.add(new C9381i(m30710a));
        }
        Properties m30708a = new C9374b(c9488n5).m30708a();
        if (m30708a != null) {
            arrayList.add(new C9381i(m30708a));
        }
        Properties m30710a3 = new C9377e("sentry.properties", c9488n5).m30710a();
        if (m30710a3 != null) {
            arrayList.add(new C9381i(m30710a3));
        }
        return new C9375c(arrayList);
    }
}
