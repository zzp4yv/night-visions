package io.sentry.internal.modules;

import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9637w1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ModulesLoader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.internal.modules.d */
/* loaded from: classes2.dex */
public abstract class AbstractC9450d implements InterfaceC9448b {

    /* renamed from: a */
    private static final Charset f36377a = Charset.forName("UTF-8");

    /* renamed from: b */
    protected final InterfaceC9637w1 f36378b;

    /* renamed from: c */
    private Map<String, String> f36379c = null;

    public AbstractC9450d(InterfaceC9637w1 interfaceC9637w1) {
        this.f36378b = interfaceC9637w1;
    }

    @Override // io.sentry.internal.modules.InterfaceC9448b
    /* renamed from: a */
    public Map<String, String> mo30866a() {
        Map<String, String> map = this.f36379c;
        if (map != null) {
            return map;
        }
        Map<String, String> mo30259b = mo30259b();
        this.f36379c = mo30259b;
        return mo30259b;
    }

    /* renamed from: b */
    protected abstract Map<String, String> mo30259b();

    /* renamed from: c */
    protected Map<String, String> m30872c(InputStream inputStream) {
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, f36377a));
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    int lastIndexOf = readLine.lastIndexOf(58);
                    treeMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
                }
                this.f36378b.mo30214c(EnumC9554s4.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e2) {
            this.f36378b.mo30213b(EnumC9554s4.ERROR, "Error extracting modules.", e2);
        } catch (RuntimeException e3) {
            this.f36378b.mo30212a(EnumC9554s4.ERROR, e3, "%s file is malformed.", "sentry-external-modules.txt");
        }
        return treeMap;
    }
}
