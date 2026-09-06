package kotlin.reflect.p371y.internal.p374j0.p410j.p411b.p412f0;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.C9768m;

/* compiled from: BuiltInsResourceLoader.kt */
/* renamed from: kotlin.f0.y.e.j0.j.b.f0.d */
/* loaded from: classes3.dex */
public final class C10249d {
    /* renamed from: a */
    public final InputStream m36251a(String str) {
        C9768m.m32346f(str, "path");
        ClassLoader classLoader = C10249d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
