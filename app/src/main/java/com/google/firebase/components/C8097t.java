package com.google.firebase.components;

import android.util.Log;
import com.google.firebase.components.C8097t;
import com.google.firebase.p202p.InterfaceC8445a;
import com.google.firebase.p203q.InterfaceC8448c;
import com.google.firebase.p203q.InterfaceC8449d;
import com.google.firebase.p205s.InterfaceC8462a;
import com.google.firebase.p205s.InterfaceC8463b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ComponentRuntime.java */
/* renamed from: com.google.firebase.components.t */
/* loaded from: classes2.dex */
public class C8097t implements InterfaceC8093p, InterfaceC8445a {

    /* renamed from: a */
    private static final InterfaceC8463b<Set<Object>> f30719a = new InterfaceC8463b() { // from class: com.google.firebase.components.i
        @Override // com.google.firebase.p205s.InterfaceC8463b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* renamed from: b */
    private final Map<C8091n<?>, InterfaceC8463b<?>> f30720b;

    /* renamed from: c */
    private final Map<C8078b0<?>, InterfaceC8463b<?>> f30721c;

    /* renamed from: d */
    private final Map<C8078b0<?>, C8102y<?>> f30722d;

    /* renamed from: e */
    private final List<InterfaceC8463b<ComponentRegistrar>> f30723e;

    /* renamed from: f */
    private Set<String> f30724f;

    /* renamed from: g */
    private final C8100w f30725g;

    /* renamed from: h */
    private final AtomicReference<Boolean> f30726h;

    /* renamed from: i */
    private final InterfaceC8096s f30727i;

    /* compiled from: ComponentRuntime.java */
    /* renamed from: com.google.firebase.components.t$b */
    public static final class b {

        /* renamed from: a */
        private final Executor f30728a;

        /* renamed from: b */
        private final List<InterfaceC8463b<ComponentRegistrar>> f30729b = new ArrayList();

        /* renamed from: c */
        private final List<C8091n<?>> f30730c = new ArrayList();

        /* renamed from: d */
        private InterfaceC8096s f30731d = InterfaceC8096s.f30718a;

        b(Executor executor) {
            this.f30728a = executor;
        }

        /* renamed from: e */
        static /* synthetic */ ComponentRegistrar m25038e(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: a */
        public b m25039a(C8091n<?> c8091n) {
            this.f30730c.add(c8091n);
            return this;
        }

        /* renamed from: b */
        public b m25040b(final ComponentRegistrar componentRegistrar) {
            this.f30729b.add(new InterfaceC8463b() { // from class: com.google.firebase.components.e
                @Override // com.google.firebase.p205s.InterfaceC8463b
                public final Object get() {
                    ComponentRegistrar componentRegistrar2 = ComponentRegistrar.this;
                    C8097t.b.m25038e(componentRegistrar2);
                    return componentRegistrar2;
                }
            });
            return this;
        }

        /* renamed from: c */
        public b m25041c(Collection<InterfaceC8463b<ComponentRegistrar>> collection) {
            this.f30729b.addAll(collection);
            return this;
        }

        /* renamed from: d */
        public C8097t m25042d() {
            return new C8097t(this.f30728a, this.f30729b, this.f30730c, this.f30731d);
        }

        /* renamed from: f */
        public b m25043f(InterfaceC8096s interfaceC8096s) {
            this.f30731d = interfaceC8096s;
            return this;
        }
    }

    /* renamed from: j */
    public static b m25025j(Executor executor) {
        return new b(executor);
    }

    /* renamed from: k */
    private void m25026k(List<C8091n<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC8463b<ComponentRegistrar>> it = this.f30723e.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f30727i.mo24983a(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            Iterator<C8091n<?>> it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = it2.next().m24996h().toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f30724f.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f30724f.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.f30720b.isEmpty()) {
                C8098u.m25044a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f30720b.keySet());
                arrayList2.addAll(list);
                C8098u.m25044a(arrayList2);
            }
            for (final C8091n<?> c8091n : list) {
                this.f30720b.put(c8091n, new C8101x(new InterfaceC8463b() { // from class: com.google.firebase.components.d
                    @Override // com.google.firebase.p205s.InterfaceC8463b
                    public final Object get() {
                        return C8097t.this.m25037p(c8091n);
                    }
                }));
            }
            arrayList.addAll(m25034u(list));
            arrayList.addAll(m25035v());
            m25033t();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((Runnable) it3.next()).run();
        }
        m25032s();
    }

    /* renamed from: l */
    private void m25027l(Map<C8091n<?>, InterfaceC8463b<?>> map, boolean z) {
        for (Map.Entry<C8091n<?>, InterfaceC8463b<?>> entry : map.entrySet()) {
            C8091n<?> key = entry.getKey();
            InterfaceC8463b<?> value = entry.getValue();
            if (key.m24998l() || (key.m24999m() && z)) {
                value.get();
            }
        }
        this.f30725g.m25073c();
    }

    /* renamed from: n */
    private static <T> List<T> m25028n(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object m25037p(C8091n c8091n) {
        return c8091n.m24994f().mo24937a(new C8080c0(c8091n, this));
    }

    /* renamed from: s */
    private void m25032s() {
        Boolean bool = this.f30726h.get();
        if (bool != null) {
            m25027l(this.f30720b, bool.booleanValue());
        }
    }

    /* renamed from: t */
    private void m25033t() {
        for (C8091n<?> c8091n : this.f30720b.keySet()) {
            for (C8099v c8099v : c8091n.m24993e()) {
                if (c8099v.m25068g() && !this.f30722d.containsKey(c8099v.m25064c())) {
                    this.f30722d.put(c8099v.m25064c(), C8102y.m25075b(Collections.emptySet()));
                } else if (this.f30721c.containsKey(c8099v.m25064c())) {
                    continue;
                } else {
                    if (c8099v.m25067f()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", c8091n, c8099v.m25064c()));
                    }
                    if (!c8099v.m25068g()) {
                        this.f30721c.put(c8099v.m25064c(), C8103z.m25079b());
                    }
                }
            }
        }
    }

    /* renamed from: u */
    private List<Runnable> m25034u(List<C8091n<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C8091n<?> c8091n : list) {
            if (c8091n.m25000n()) {
                final InterfaceC8463b<?> interfaceC8463b = this.f30720b.get(c8091n);
                for (C8078b0<? super Object> c8078b0 : c8091n.m24996h()) {
                    if (this.f30721c.containsKey(c8078b0)) {
                        final C8103z c8103z = (C8103z) this.f30721c.get(c8078b0);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                C8103z.this.m25085g(interfaceC8463b);
                            }
                        });
                    } else {
                        this.f30721c.put(c8078b0, interfaceC8463b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: v */
    private List<Runnable> m25035v() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry<C8091n<?>, InterfaceC8463b<?>> entry : this.f30720b.entrySet()) {
            C8091n<?> key = entry.getKey();
            if (!key.m25000n()) {
                InterfaceC8463b<?> value = entry.getValue();
                for (C8078b0<? super Object> c8078b0 : key.m24996h()) {
                    if (!hashMap.containsKey(c8078b0)) {
                        hashMap.put(c8078b0, new HashSet());
                    }
                    ((Set) hashMap.get(c8078b0)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f30722d.containsKey(entry2.getKey())) {
                final C8102y<?> c8102y = this.f30722d.get(entry2.getKey());
                for (final InterfaceC8463b interfaceC8463b : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8102y.this.m25077a(interfaceC8463b);
                        }
                    });
                }
            } else {
                this.f30722d.put((C8078b0) entry2.getKey(), C8102y.m25075b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: a */
    public /* synthetic */ Object mo24973a(Class cls) {
        return C8092o.m25013b(this, cls);
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: b */
    public synchronized <T> InterfaceC8463b<T> mo24974b(C8078b0<T> c8078b0) {
        C8076a0.m24969c(c8078b0, "Null interface requested.");
        return (InterfaceC8463b) this.f30721c.get(c8078b0);
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: c */
    public /* synthetic */ InterfaceC8463b mo24975c(Class cls) {
        return C8092o.m25015d(this, cls);
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: d */
    public /* synthetic */ Set mo24976d(C8078b0 c8078b0) {
        return C8092o.m25016e(this, c8078b0);
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: e */
    public synchronized <T> InterfaceC8463b<Set<T>> mo24977e(C8078b0<T> c8078b0) {
        C8102y<?> c8102y = this.f30722d.get(c8078b0);
        if (c8102y != null) {
            return c8102y;
        }
        return (InterfaceC8463b<Set<T>>) f30719a;
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: f */
    public /* synthetic */ Object mo24978f(C8078b0 c8078b0) {
        return C8092o.m25012a(this, c8078b0);
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: g */
    public /* synthetic */ Set mo24979g(Class cls) {
        return C8092o.m25017f(this, cls);
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: h */
    public <T> InterfaceC8462a<T> mo24980h(C8078b0<T> c8078b0) {
        InterfaceC8463b<T> mo24974b = mo24974b(c8078b0);
        return mo24974b == null ? C8103z.m25079b() : mo24974b instanceof C8103z ? (C8103z) mo24974b : C8103z.m25083f(mo24974b);
    }

    @Override // com.google.firebase.components.InterfaceC8093p
    /* renamed from: i */
    public /* synthetic */ InterfaceC8462a mo24981i(Class cls) {
        return C8092o.m25014c(this, cls);
    }

    /* renamed from: m */
    public void m25036m(boolean z) {
        HashMap hashMap;
        if (this.f30726h.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f30720b);
            }
            m25027l(hashMap, z);
        }
    }

    private C8097t(Executor executor, Iterable<InterfaceC8463b<ComponentRegistrar>> iterable, Collection<C8091n<?>> collection, InterfaceC8096s interfaceC8096s) {
        this.f30720b = new HashMap();
        this.f30721c = new HashMap();
        this.f30722d = new HashMap();
        this.f30724f = new HashSet();
        this.f30726h = new AtomicReference<>();
        C8100w c8100w = new C8100w(executor);
        this.f30725g = c8100w;
        this.f30727i = interfaceC8096s;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C8091n.m24992q(c8100w, C8100w.class, InterfaceC8449d.class, InterfaceC8448c.class));
        arrayList.add(C8091n.m24992q(this, InterfaceC8445a.class, new Class[0]));
        for (C8091n<?> c8091n : collection) {
            if (c8091n != null) {
                arrayList.add(c8091n);
            }
        }
        this.f30723e = m25028n(iterable);
        m25026k(arrayList);
    }
}
