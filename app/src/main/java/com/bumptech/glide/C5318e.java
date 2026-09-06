package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import com.bumptech.glide.load.engine.C5361k;
import com.bumptech.glide.load.engine.p126z.InterfaceC5377b;
import com.bumptech.glide.p141p.C5532h;
import com.bumptech.glide.p141p.InterfaceC5531g;
import com.bumptech.glide.p141p.p142l.AbstractC5545j;
import com.bumptech.glide.p141p.p142l.C5540e;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext.java */
/* renamed from: com.bumptech.glide.e */
/* loaded from: classes.dex */
public class C5318e extends ContextWrapper {

    /* renamed from: a */
    static final AbstractC5323j<?, ?> f13071a = new C5315b();

    /* renamed from: b */
    private final InterfaceC5377b f13072b;

    /* renamed from: c */
    private final Registry f13073c;

    /* renamed from: d */
    private final C5540e f13074d;

    /* renamed from: e */
    private final C5532h f13075e;

    /* renamed from: f */
    private final List<InterfaceC5531g<Object>> f13076f;

    /* renamed from: g */
    private final Map<Class<?>, AbstractC5323j<?, ?>> f13077g;

    /* renamed from: h */
    private final C5361k f13078h;

    /* renamed from: i */
    private final boolean f13079i;

    /* renamed from: j */
    private final int f13080j;

    public C5318e(Context context, InterfaceC5377b interfaceC5377b, Registry registry, C5540e c5540e, C5532h c5532h, Map<Class<?>, AbstractC5323j<?, ?>> map, List<InterfaceC5531g<Object>> list, C5361k c5361k, boolean z, int i2) {
        super(context.getApplicationContext());
        this.f13072b = interfaceC5377b;
        this.f13073c = registry;
        this.f13074d = c5540e;
        this.f13075e = c5532h;
        this.f13076f = list;
        this.f13077g = map;
        this.f13078h = c5361k;
        this.f13079i = z;
        this.f13080j = i2;
    }

    /* renamed from: a */
    public <X> AbstractC5545j<ImageView, X> m9997a(ImageView imageView, Class<X> cls) {
        return this.f13074d.m10984a(imageView, cls);
    }

    /* renamed from: b */
    public InterfaceC5377b m9998b() {
        return this.f13072b;
    }

    /* renamed from: c */
    public List<InterfaceC5531g<Object>> m9999c() {
        return this.f13076f;
    }

    /* renamed from: d */
    public C5532h m10000d() {
        return this.f13075e;
    }

    /* renamed from: e */
    public <T> AbstractC5323j<?, T> m10001e(Class<T> cls) {
        AbstractC5323j<?, T> abstractC5323j = (AbstractC5323j) this.f13077g.get(cls);
        if (abstractC5323j == null) {
            for (Map.Entry<Class<?>, AbstractC5323j<?, ?>> entry : this.f13077g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    abstractC5323j = (AbstractC5323j) entry.getValue();
                }
            }
        }
        return abstractC5323j == null ? (AbstractC5323j<?, T>) f13071a : abstractC5323j;
    }

    /* renamed from: f */
    public C5361k m10002f() {
        return this.f13078h;
    }

    /* renamed from: g */
    public int m10003g() {
        return this.f13080j;
    }

    /* renamed from: h */
    public Registry m10004h() {
        return this.f13073c;
    }

    /* renamed from: i */
    public boolean m10005i() {
        return this.f13079i;
    }
}
