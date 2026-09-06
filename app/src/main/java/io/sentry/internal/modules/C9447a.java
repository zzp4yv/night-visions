package io.sentry.internal.modules;

import io.sentry.InterfaceC9637w1;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: CompositeModulesLoader.java */
@ApiStatus.Internal
@ApiStatus.Experimental
/* renamed from: io.sentry.internal.modules.a */
/* loaded from: classes2.dex */
public final class C9447a extends AbstractC9450d {

    /* renamed from: d */
    private final List<InterfaceC9448b> f36371d;

    public C9447a(List<InterfaceC9448b> list, InterfaceC9637w1 interfaceC9637w1) {
        super(interfaceC9637w1);
        this.f36371d = list;
    }

    @Override // io.sentry.internal.modules.AbstractC9450d
    /* renamed from: b */
    protected Map<String, String> mo30259b() {
        TreeMap treeMap = new TreeMap();
        Iterator<InterfaceC9448b> it = this.f36371d.iterator();
        while (it.hasNext()) {
            Map<String, String> mo30866a = it.next().mo30866a();
            if (mo30866a != null) {
                treeMap.putAll(mo30866a);
            }
        }
        return treeMap;
    }
}
