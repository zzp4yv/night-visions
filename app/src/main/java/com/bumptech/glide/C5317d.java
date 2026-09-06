package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.load.engine.C5361k;
import com.bumptech.glide.load.engine.p123a0.C5344f;
import com.bumptech.glide.load.engine.p123a0.C5345g;
import com.bumptech.glide.load.engine.p123a0.C5347i;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5339a;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5346h;
import com.bumptech.glide.load.engine.p124b0.ExecutorServiceC5350a;
import com.bumptech.glide.load.engine.p126z.C5381f;
import com.bumptech.glide.load.engine.p126z.C5385j;
import com.bumptech.glide.load.engine.p126z.C5386k;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.load.engine.p126z.InterfaceC5380e;
import com.bumptech.glide.p138m.C5504f;
import com.bumptech.glide.p138m.C5510l;
import com.bumptech.glide.p138m.InterfaceC5502d;
import com.bumptech.glide.p141p.C5532h;
import com.bumptech.glide.p141p.InterfaceC5531g;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p024c.p041e.C0867a;

/* compiled from: GlideBuilder.java */
/* renamed from: com.bumptech.glide.d */
/* loaded from: classes.dex */
public final class C5317d {

    /* renamed from: b */
    private C5361k f13055b;

    /* renamed from: c */
    private InterfaceC5380e f13056c;

    /* renamed from: d */
    private InterfaceC5377b f13057d;

    /* renamed from: e */
    private InterfaceC5346h f13058e;

    /* renamed from: f */
    private ExecutorServiceC5350a f13059f;

    /* renamed from: g */
    private ExecutorServiceC5350a f13060g;

    /* renamed from: h */
    private InterfaceC5339a.a f13061h;

    /* renamed from: i */
    private C5347i f13062i;

    /* renamed from: j */
    private InterfaceC5502d f13063j;

    /* renamed from: m */
    private C5510l.b f13066m;

    /* renamed from: n */
    private ExecutorServiceC5350a f13067n;

    /* renamed from: o */
    private boolean f13068o;

    /* renamed from: p */
    private List<InterfaceC5531g<Object>> f13069p;

    /* renamed from: q */
    private boolean f13070q;

    /* renamed from: a */
    private final Map<Class<?>, AbstractC5323j<?, ?>> f13054a = new C0867a();

    /* renamed from: k */
    private int f13064k = 4;

    /* renamed from: l */
    private C5532h f13065l = new C5532h();

    /* renamed from: a */
    ComponentCallbacks2C5316c m9992a(Context context) {
        if (this.f13059f == null) {
            this.f13059f = ExecutorServiceC5350a.m10219f();
        }
        if (this.f13060g == null) {
            this.f13060g = ExecutorServiceC5350a.m10217d();
        }
        if (this.f13067n == null) {
            this.f13067n = ExecutorServiceC5350a.m10215b();
        }
        if (this.f13062i == null) {
            this.f13062i = new C5347i.a(context).m10206a();
        }
        if (this.f13063j == null) {
            this.f13063j = new C5504f();
        }
        if (this.f13056c == null) {
            int m10204b = this.f13062i.m10204b();
            if (m10204b > 0) {
                this.f13056c = new C5386k(m10204b);
            } else {
                this.f13056c = new C5381f();
            }
        }
        if (this.f13057d == null) {
            this.f13057d = new C5385j(this.f13062i.m10203a());
        }
        if (this.f13058e == null) {
            this.f13058e = new C5345g(this.f13062i.m10205d());
        }
        if (this.f13061h == null) {
            this.f13061h = new C5344f(context);
        }
        if (this.f13055b == null) {
            this.f13055b = new C5361k(this.f13058e, this.f13061h, this.f13060g, this.f13059f, ExecutorServiceC5350a.m10221h(), ExecutorServiceC5350a.m10215b(), this.f13068o);
        }
        List<InterfaceC5531g<Object>> list = this.f13069p;
        if (list == null) {
            this.f13069p = Collections.emptyList();
        } else {
            this.f13069p = Collections.unmodifiableList(list);
        }
        return new ComponentCallbacks2C5316c(context, this.f13055b, this.f13058e, this.f13056c, this.f13057d, new C5510l(this.f13066m), this.f13063j, this.f13064k, this.f13065l.m10883Q(), this.f13054a, this.f13069p, this.f13070q);
    }

    /* renamed from: b */
    public C5317d m9993b(InterfaceC5380e interfaceC5380e) {
        this.f13056c = interfaceC5380e;
        return this;
    }

    /* renamed from: c */
    public C5317d m9994c(C5532h c5532h) {
        this.f13065l = c5532h;
        return this;
    }

    /* renamed from: d */
    public C5317d m9995d(InterfaceC5346h interfaceC5346h) {
        this.f13058e = interfaceC5346h;
        return this;
    }

    /* renamed from: e */
    void m9996e(C5510l.b bVar) {
        this.f13066m = bVar;
    }
}
