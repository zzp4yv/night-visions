package com.bumptech.glide.p138m;

import com.bumptech.glide.p141p.p142l.InterfaceC5544i;
import com.bumptech.glide.p145r.C5564k;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* renamed from: com.bumptech.glide.m.p */
/* loaded from: classes.dex */
public final class C5514p implements InterfaceC5507i {

    /* renamed from: f */
    private final Set<InterfaceC5544i<?>> f13890f = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void m10833a() {
        this.f13890f.clear();
    }

    /* renamed from: b */
    public List<InterfaceC5544i<?>> m10834b() {
        return C5564k.m11053j(this.f13890f);
    }

    /* renamed from: c */
    public void m10835c(InterfaceC5544i<?> interfaceC5544i) {
        this.f13890f.add(interfaceC5544i);
    }

    /* renamed from: d */
    public void m10836d(InterfaceC5544i<?> interfaceC5544i) {
        this.f13890f.remove(interfaceC5544i);
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onDestroy() {
        Iterator it = C5564k.m11053j(this.f13890f).iterator();
        while (it.hasNext()) {
            ((InterfaceC5544i) it.next()).onDestroy();
        }
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onStart() {
        Iterator it = C5564k.m11053j(this.f13890f).iterator();
        while (it.hasNext()) {
            ((InterfaceC5544i) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onStop() {
        Iterator it = C5564k.m11053j(this.f13890f).iterator();
        while (it.hasNext()) {
            ((InterfaceC5544i) it.next()).onStop();
        }
    }
}
