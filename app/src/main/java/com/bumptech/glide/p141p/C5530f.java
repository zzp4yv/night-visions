package com.bumptech.glide.p141p;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p141p.p142l.InterfaceC5543h;
import com.bumptech.glide.p141p.p142l.InterfaceC5544i;
import com.bumptech.glide.p141p.p143m.InterfaceC5549d;
import com.bumptech.glide.p145r.C5564k;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFutureTarget.java */
/* renamed from: com.bumptech.glide.p.f */
/* loaded from: classes.dex */
public class C5530f<R> implements InterfaceFutureC5527c<R>, InterfaceC5531g<R> {

    /* renamed from: f */
    private static final a f13938f = new a();

    /* renamed from: g */
    private final int f13939g;

    /* renamed from: h */
    private final int f13940h;

    /* renamed from: i */
    private final boolean f13941i;

    /* renamed from: j */
    private final a f13942j;

    /* renamed from: k */
    private R f13943k;

    /* renamed from: l */
    private InterfaceC5528d f13944l;

    /* renamed from: m */
    private boolean f13945m;

    /* renamed from: n */
    private boolean f13946n;

    /* renamed from: o */
    private boolean f13947o;

    /* renamed from: p */
    private GlideException f13948p;

    /* compiled from: RequestFutureTarget.java */
    /* renamed from: com.bumptech.glide.p.f$a */
    static class a {
        a() {
        }

        /* renamed from: a */
        void m10941a(Object obj) {
            obj.notifyAll();
        }

        /* renamed from: b */
        void m10942b(Object obj, long j2) throws InterruptedException {
            obj.wait(j2);
        }
    }

    public C5530f(int i2, int i3) {
        this(i2, i3, true, f13938f);
    }

    /* renamed from: a */
    private synchronized R m10940a(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f13941i && !isDone()) {
            C5564k.m11044a();
        }
        if (this.f13945m) {
            throw new CancellationException();
        }
        if (this.f13947o) {
            throw new ExecutionException(this.f13948p);
        }
        if (this.f13946n) {
            return this.f13943k;
        }
        if (l == null) {
            this.f13942j.m10942b(this, 0L);
        } else if (l.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                this.f13942j.m10942b(this, longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.f13947o) {
            throw new ExecutionException(this.f13948p);
        }
        if (this.f13945m) {
            throw new CancellationException();
        }
        if (!this.f13946n) {
            throw new TimeoutException();
        }
        return this.f13943k;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean cancel(boolean z) {
        InterfaceC5528d interfaceC5528d;
        if (isDone()) {
            return false;
        }
        this.f13945m = true;
        this.f13942j.m10941a(this);
        if (z && (interfaceC5528d = this.f13944l) != null) {
            interfaceC5528d.clear();
            this.f13944l = null;
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public R get() throws InterruptedException, ExecutionException {
        try {
            return m10940a(null);
        } catch (TimeoutException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public synchronized InterfaceC5528d getRequest() {
        return this.f13944l;
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public void getSize(InterfaceC5543h interfaceC5543h) {
        interfaceC5543h.mo10970g(this.f13939g, this.f13940h);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f13945m;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z;
        if (!this.f13945m && !this.f13946n) {
            z = this.f13947o;
        }
        return z;
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onDestroy() {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public synchronized void onResourceReady(R r, InterfaceC5549d<? super R> interfaceC5549d) {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onStart() {
    }

    @Override // com.bumptech.glide.p138m.InterfaceC5507i
    public void onStop() {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public void removeCallback(InterfaceC5543h interfaceC5543h) {
    }

    @Override // com.bumptech.glide.p141p.p142l.InterfaceC5544i
    public synchronized void setRequest(InterfaceC5528d interfaceC5528d) {
        this.f13944l = interfaceC5528d;
    }

    C5530f(int i2, int i3, boolean z, a aVar) {
        this.f13939g = i2;
        this.f13940h = i3;
        this.f13941i = z;
        this.f13942j = aVar;
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5531g
    public synchronized boolean onLoadFailed(GlideException glideException, Object obj, InterfaceC5544i<R> interfaceC5544i, boolean z) {
        this.f13947o = true;
        this.f13948p = glideException;
        this.f13942j.m10941a(this);
        return false;
    }

    @Override // com.bumptech.glide.p141p.InterfaceC5531g
    public synchronized boolean onResourceReady(R r, Object obj, InterfaceC5544i<R> interfaceC5544i, EnumC5332a enumC5332a, boolean z) {
        this.f13946n = true;
        this.f13943k = r;
        this.f13942j.m10941a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j2, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m10940a(Long.valueOf(timeUnit.toMillis(j2)));
    }
}
