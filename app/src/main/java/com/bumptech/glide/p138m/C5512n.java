package com.bumptech.glide.p138m;

import android.util.Log;
import com.bumptech.glide.p141p.InterfaceC5528d;
import com.bumptech.glide.p145r.C5564k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* renamed from: com.bumptech.glide.m.n */
/* loaded from: classes.dex */
public class C5512n {

    /* renamed from: a */
    private final Set<InterfaceC5528d> f13880a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<InterfaceC5528d> f13881b = new ArrayList();

    /* renamed from: c */
    private boolean f13882c;

    /* renamed from: a */
    private boolean m10816a(InterfaceC5528d interfaceC5528d, boolean z) {
        boolean z2 = true;
        if (interfaceC5528d == null) {
            return true;
        }
        boolean remove = this.f13880a.remove(interfaceC5528d);
        if (!this.f13881b.remove(interfaceC5528d) && !remove) {
            z2 = false;
        }
        if (z2) {
            interfaceC5528d.clear();
            if (z) {
                interfaceC5528d.mo10928c();
            }
        }
        return z2;
    }

    /* renamed from: b */
    public boolean m10817b(InterfaceC5528d interfaceC5528d) {
        return m10816a(interfaceC5528d, true);
    }

    /* renamed from: c */
    public void m10818c() {
        Iterator it = C5564k.m11053j(this.f13880a).iterator();
        while (it.hasNext()) {
            m10816a((InterfaceC5528d) it.next(), false);
        }
        this.f13881b.clear();
    }

    /* renamed from: d */
    public void m10819d() {
        this.f13882c = true;
        for (InterfaceC5528d interfaceC5528d : C5564k.m11053j(this.f13880a)) {
            if (interfaceC5528d.isRunning()) {
                interfaceC5528d.clear();
                this.f13881b.add(interfaceC5528d);
            }
        }
    }

    /* renamed from: e */
    public void m10820e() {
        for (InterfaceC5528d interfaceC5528d : C5564k.m11053j(this.f13880a)) {
            if (!interfaceC5528d.mo10937l() && !interfaceC5528d.mo10934i()) {
                interfaceC5528d.clear();
                if (this.f13882c) {
                    this.f13881b.add(interfaceC5528d);
                } else {
                    interfaceC5528d.mo10929d();
                }
            }
        }
    }

    /* renamed from: f */
    public void m10821f() {
        this.f13882c = false;
        for (InterfaceC5528d interfaceC5528d : C5564k.m11053j(this.f13880a)) {
            if (!interfaceC5528d.mo10937l() && !interfaceC5528d.isRunning()) {
                interfaceC5528d.mo10929d();
            }
        }
        this.f13881b.clear();
    }

    /* renamed from: g */
    public void m10822g(InterfaceC5528d interfaceC5528d) {
        this.f13880a.add(interfaceC5528d);
        if (!this.f13882c) {
            interfaceC5528d.mo10929d();
            return;
        }
        interfaceC5528d.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f13881b.add(interfaceC5528d);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f13880a.size() + ", isPaused=" + this.f13882c + "}";
    }
}
