package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.bumptech.glide.load.engine.AbstractC5360j;
import com.bumptech.glide.load.p131o.p136g.C5484c;
import com.bumptech.glide.p138m.C5512n;
import com.bumptech.glide.p138m.C5514p;
import com.bumptech.glide.p138m.InterfaceC5501c;
import com.bumptech.glide.p138m.InterfaceC5502d;
import com.bumptech.glide.p138m.InterfaceC5506h;
import com.bumptech.glide.p138m.InterfaceC5507i;
import com.bumptech.glide.p138m.InterfaceC5511m;
import com.bumptech.glide.p141p.C5532h;
import com.bumptech.glide.p141p.InterfaceC5528d;
import com.bumptech.glide.p141p.InterfaceC5531g;
import com.bumptech.glide.p141p.p142l.AbstractC5545j;
import com.bumptech.glide.p141p.p142l.InterfaceC5544i;
import com.bumptech.glide.p141p.p143m.InterfaceC5549d;
import com.bumptech.glide.p145r.C5564k;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* renamed from: com.bumptech.glide.i */
/* loaded from: classes.dex */
public class C5322i implements InterfaceC5507i {

    /* renamed from: f */
    private static final C5532h f13108f = C5532h.m10943s0(Bitmap.class).m10883Q();

    /* renamed from: g */
    private static final C5532h f13109g = C5532h.m10943s0(C5484c.class).m10883Q();

    /* renamed from: h */
    private static final C5532h f13110h = C5532h.m10944t0(AbstractC5360j.f13396c).m10891b0(EnumC5320g.LOW).m10902k0(true);

    /* renamed from: i */
    protected final ComponentCallbacks2C5316c f13111i;

    /* renamed from: j */
    protected final Context f13112j;

    /* renamed from: k */
    final InterfaceC5506h f13113k;

    /* renamed from: l */
    private final C5512n f13114l;

    /* renamed from: m */
    private final InterfaceC5511m f13115m;

    /* renamed from: n */
    private final C5514p f13116n;

    /* renamed from: o */
    private final Runnable f13117o;

    /* renamed from: p */
    private final Handler f13118p;

    /* renamed from: q */
    private final InterfaceC5501c f13119q;

    /* renamed from: r */
    private final CopyOnWriteArrayList<InterfaceC5531g<Object>> f13120r;

    /* renamed from: s */
    private C5532h f13121s;

    /* compiled from: RequestManager.java */
    /* renamed from: com.bumptech.glide.i$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5322i c5322i = C5322i.this;
            c5322i.f13113k.mo10783a(c5322i);
        }
    }

    /* compiled from: RequestManager.java */
    /* renamed from: com.bumptech.glide.i$b */
    private static class b extends AbstractC5545j<View, Object> {
        b(View view) {
            super(view);
        }

        @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
        public void onResourceReady(Object obj, InterfaceC5549d<? super Object> interfaceC5549d) {
        }
    }

    /* compiled from: RequestManager.java */
    /* renamed from: com.bumptech.glide.i$c */
    private class c implements InterfaceC5501c.a {

        /* renamed from: a */
        private final C5512n f13123a;

        c(C5512n c5512n) {
            this.f13123a = c5512n;
        }

        @Override // com.bumptech.glide.p138m.InterfaceC5501c.a
        /* renamed from: a */
        public void mo10048a(boolean z) {
            if (z) {
                synchronized (C5322i.this) {
                    this.f13123a.m10820e();
                }
            }
        }
    }

    public C5322i(ComponentCallbacks2C5316c componentCallbacks2C5316c, InterfaceC5506h interfaceC5506h, InterfaceC5511m interfaceC5511m, Context context) {
        this(componentCallbacks2C5316c, interfaceC5506h, interfaceC5511m, new C5512n(), componentCallbacks2C5316c.m9983g(), context);
    }

    /* renamed from: q */
    private void m10031q(InterfaceC5544i<?> interfaceC5544i) {
        if (m10047p(interfaceC5544i) || this.f13111i.m9989p(interfaceC5544i) || interfaceC5544i.getRequest() == null) {
            return;
        }
        InterfaceC5528d request = interfaceC5544i.getRequest();
        interfaceC5544i.setRequest(null);
        request.clear();
    }

    /* renamed from: a */
    public <ResourceType> C5321h<ResourceType> m10032a(Class<ResourceType> cls) {
        return new C5321h<>(this.f13111i, this, cls, this.f13112j);
    }

    /* renamed from: b */
    public C5321h<Bitmap> m10033b() {
        return m10032a(Bitmap.class).mo10026b(f13108f);
    }

    /* renamed from: c */
    public C5321h<Drawable> m10034c() {
        return m10032a(Drawable.class);
    }

    /* renamed from: d */
    public void m10035d(View view) {
        m10036e(new b(view));
    }

    /* renamed from: e */
    public synchronized void m10036e(InterfaceC5544i<?> interfaceC5544i) {
        if (interfaceC5544i == null) {
            return;
        }
        m10031q(interfaceC5544i);
    }

    /* renamed from: f */
    List<InterfaceC5531g<Object>> m10037f() {
        return this.f13120r;
    }

    /* renamed from: g */
    synchronized C5532h m10038g() {
        return this.f13121s;
    }

    /* renamed from: h */
    <T> AbstractC5323j<?, T> m10039h(Class<T> cls) {
        return this.f13111i.m9985i().m10001e(cls);
    }

    /* renamed from: i */
    public C5321h<Drawable> m10040i(Uri uri) {
        return m10034c().m10019G0(uri);
    }

    /* renamed from: j */
    public C5321h<Drawable> m10041j(Integer num) {
        return m10034c().m10020H0(num);
    }

    /* renamed from: k */
    public C5321h<Drawable> m10042k(String str) {
        return m10034c().m10022K0(str);
    }

    /* renamed from: l */
    public synchronized void m10043l() {
        this.f13114l.m10819d();
    }

    /* renamed from: m */
    public synchronized void m10044m() {
        this.f13114l.m10821f();
    }

    /* renamed from: n */
    protected synchronized void m10045n(C5532h c5532h) {
        this.f13121s = c5532h.clone().m10892d();
    }

    /* renamed from: o */
    synchronized void m10046o(InterfaceC5544i<?> interfaceC5544i, InterfaceC5528d interfaceC5528d) {
        this.f13116n.m10835c(interfaceC5544i);
        this.f13114l.m10822g(interfaceC5528d);
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public synchronized void onDestroy() {
        this.f13116n.onDestroy();
        Iterator<InterfaceC5544i<?>> it = this.f13116n.m10834b().iterator();
        while (it.hasNext()) {
            m10036e(it.next());
        }
        this.f13116n.m10833a();
        this.f13114l.m10818c();
        this.f13113k.mo10784b(this);
        this.f13113k.mo10784b(this.f13119q);
        this.f13118p.removeCallbacks(this.f13117o);
        this.f13111i.m9991s(this);
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public synchronized void onStart() {
        m10044m();
        this.f13116n.onStart();
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public synchronized void onStop() {
        m10043l();
        this.f13116n.onStop();
    }

    /* renamed from: p */
    synchronized boolean m10047p(InterfaceC5544i<?> interfaceC5544i) {
        InterfaceC5528d request = interfaceC5544i.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.f13114l.m10817b(request)) {
            return false;
        }
        this.f13116n.m10836d(interfaceC5544i);
        interfaceC5544i.setRequest(null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f13114l + ", treeNode=" + this.f13115m + "}";
    }

    C5322i(ComponentCallbacks2C5316c componentCallbacks2C5316c, InterfaceC5506h interfaceC5506h, InterfaceC5511m interfaceC5511m, C5512n c5512n, InterfaceC5502d interfaceC5502d, Context context) {
        this.f13116n = new C5514p();
        a aVar = new a();
        this.f13117o = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f13118p = handler;
        this.f13111i = componentCallbacks2C5316c;
        this.f13113k = interfaceC5506h;
        this.f13115m = interfaceC5511m;
        this.f13114l = c5512n;
        this.f13112j = context;
        InterfaceC5501c mo10788a = interfaceC5502d.mo10788a(context.getApplicationContext(), new c(c5512n));
        this.f13119q = mo10788a;
        if (C5564k.m11060q()) {
            handler.post(aVar);
        } else {
            interfaceC5506h.mo10783a(this);
        }
        interfaceC5506h.mo10783a(mo10788a);
        this.f13120r = new CopyOnWriteArrayList<>(componentCallbacks2C5316c.m9985i().m9999c());
        m10045n(componentCallbacks2C5316c.m9985i().m10000d());
        componentCallbacks2C5316c.m9988o(this);
    }
}
