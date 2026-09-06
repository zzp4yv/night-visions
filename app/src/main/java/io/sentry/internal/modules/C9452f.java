package io.sentry.internal.modules;

import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import io.sentry.util.C9604h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ResourcesModulesLoader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.internal.modules.f */
/* loaded from: classes2.dex */
public final class C9452f extends AbstractC9450d {

    /* renamed from: d */
    private final ClassLoader f36381d;

    public C9452f(InterfaceC9637w1 interfaceC9637w1) {
        this(interfaceC9637w1, C9452f.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.AbstractC9450d
    /* renamed from: b */
    protected Map<String, String> mo30259b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f36381d.getResourceAsStream("sentry-external-modules.txt");
            try {
                if (resourceAsStream != null) {
                    Map<String, String> m30872c = m30872c(resourceAsStream);
                    resourceAsStream.close();
                    return m30872c;
                }
                this.f36378b.mo30214c(EnumC9554s4.INFO, "%s file was not found.", "sentry-external-modules.txt");
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return treeMap;
            } catch (Throwable th) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f36378b.mo30213b(EnumC9554s4.INFO, "Access to resources failed.", e2);
            return treeMap;
        } catch (SecurityException e3) {
            this.f36378b.mo30213b(EnumC9554s4.INFO, "Access to resources denied.", e3);
            return treeMap;
        }
    }

    C9452f(InterfaceC9637w1 interfaceC9637w1, ClassLoader classLoader) {
        super(interfaceC9637w1);
        this.f36381d = C9604h.m31765a(classLoader);
    }
}
