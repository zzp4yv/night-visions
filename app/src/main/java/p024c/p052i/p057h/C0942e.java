package p024c.p052i.p057h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p024c.p041e.C0871e;
import p024c.p041e.C0873g;
import p024c.p052i.p053e.C0926d;
import p024c.p052i.p057h.C0943f;
import p024c.p052i.p059j.InterfaceC0951a;

/* compiled from: FontRequestWorker.java */
/* renamed from: c.i.h.e */
/* loaded from: classes.dex */
class C0942e {

    /* renamed from: a */
    static final C0871e<String, Typeface> f6328a = new C0871e<>(16);

    /* renamed from: b */
    private static final ExecutorService f6329b = C0944g.m6006a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f6330c = new Object();

    /* renamed from: d */
    static final C0873g<String, ArrayList<InterfaceC0951a<e>>> f6331d = new C0873g<>();

    /* compiled from: FontRequestWorker.java */
    /* renamed from: c.i.h.e$a */
    class a implements Callable<e> {

        /* renamed from: f */
        final /* synthetic */ String f6332f;

        /* renamed from: g */
        final /* synthetic */ Context f6333g;

        /* renamed from: h */
        final /* synthetic */ C0941d f6334h;

        /* renamed from: i */
        final /* synthetic */ int f6335i;

        a(String str, Context context, C0941d c0941d, int i2) {
            this.f6332f = str;
            this.f6333g = context;
            this.f6334h = c0941d;
            this.f6335i = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return C0942e.m5987c(this.f6332f, this.f6333g, this.f6334h, this.f6335i);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* renamed from: c.i.h.e$b */
    class b implements InterfaceC0951a<e> {

        /* renamed from: a */
        final /* synthetic */ C0938a f6336a;

        b(C0938a c0938a) {
            this.f6336a = c0938a;
        }

        @Override // p024c.p052i.p059j.InterfaceC0951a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5991a(e eVar) {
            this.f6336a.m5969b(eVar);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* renamed from: c.i.h.e$c */
    class c implements Callable<e> {

        /* renamed from: f */
        final /* synthetic */ String f6337f;

        /* renamed from: g */
        final /* synthetic */ Context f6338g;

        /* renamed from: h */
        final /* synthetic */ C0941d f6339h;

        /* renamed from: i */
        final /* synthetic */ int f6340i;

        c(String str, Context context, C0941d c0941d, int i2) {
            this.f6337f = str;
            this.f6338g = context;
            this.f6339h = c0941d;
            this.f6340i = i2;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return C0942e.m5987c(this.f6337f, this.f6338g, this.f6339h, this.f6340i);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* renamed from: c.i.h.e$d */
    class d implements InterfaceC0951a<e> {

        /* renamed from: a */
        final /* synthetic */ String f6341a;

        d(String str) {
            this.f6341a = str;
        }

        @Override // p024c.p052i.p059j.InterfaceC0951a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo5991a(e eVar) {
            synchronized (C0942e.f6330c) {
                C0873g<String, ArrayList<InterfaceC0951a<e>>> c0873g = C0942e.f6331d;
                ArrayList<InterfaceC0951a<e>> arrayList = c0873g.get(this.f6341a);
                if (arrayList == null) {
                    return;
                }
                c0873g.remove(this.f6341a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2).mo5991a(eVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static String m5985a(C0941d c0941d, int i2) {
        return c0941d.m5981d() + "-" + i2;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m5986b(C0943f.a aVar) {
        int i2 = 1;
        if (aVar.m5999c() != 0) {
            return aVar.m5999c() != 1 ? -3 : -2;
        }
        C0943f.b[] m5998b = aVar.m5998b();
        if (m5998b != null && m5998b.length != 0) {
            i2 = 0;
            for (C0943f.b bVar : m5998b) {
                int m6001b = bVar.m6001b();
                if (m6001b != 0) {
                    if (m6001b < 0) {
                        return -3;
                    }
                    return m6001b;
                }
            }
        }
        return i2;
    }

    /* renamed from: c */
    static e m5987c(String str, Context context, C0941d c0941d, int i2) {
        C0871e<String, Typeface> c0871e = f6328a;
        Typeface m5450c = c0871e.m5450c(str);
        if (m5450c != null) {
            return new e(m5450c);
        }
        try {
            C0943f.a m5974d = C0940c.m5974d(context, c0941d, null);
            int m5986b = m5986b(m5974d);
            if (m5986b != 0) {
                return new e(m5986b);
            }
            Typeface m5909b = C0926d.m5909b(context, null, m5974d.m5998b(), i2);
            if (m5909b == null) {
                return new e(-3);
            }
            c0871e.m5451d(str, m5909b);
            return new e(m5909b);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    /* renamed from: d */
    static Typeface m5988d(Context context, C0941d c0941d, int i2, Executor executor, C0938a c0938a) {
        String m5985a = m5985a(c0941d, i2);
        Typeface m5450c = f6328a.m5450c(m5985a);
        if (m5450c != null) {
            c0938a.m5969b(new e(m5450c));
            return m5450c;
        }
        b bVar = new b(c0938a);
        synchronized (f6330c) {
            C0873g<String, ArrayList<InterfaceC0951a<e>>> c0873g = f6331d;
            ArrayList<InterfaceC0951a<e>> arrayList = c0873g.get(m5985a);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<InterfaceC0951a<e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            c0873g.put(m5985a, arrayList2);
            c cVar = new c(m5985a, context, c0941d, i2);
            if (executor == null) {
                executor = f6329b;
            }
            C0944g.m6007b(executor, cVar, new d(m5985a));
            return null;
        }
    }

    /* renamed from: e */
    static Typeface m5989e(Context context, C0941d c0941d, C0938a c0938a, int i2, int i3) {
        String m5985a = m5985a(c0941d, i2);
        Typeface m5450c = f6328a.m5450c(m5985a);
        if (m5450c != null) {
            c0938a.m5969b(new e(m5450c));
            return m5450c;
        }
        if (i3 == -1) {
            e m5987c = m5987c(m5985a, context, c0941d, i2);
            c0938a.m5969b(m5987c);
            return m5987c.f6342a;
        }
        try {
            e eVar = (e) C0944g.m6008c(f6329b, new a(m5985a, context, c0941d, i2), i3);
            c0938a.m5969b(eVar);
            return eVar.f6342a;
        } catch (InterruptedException unused) {
            c0938a.m5969b(new e(-3));
            return null;
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* renamed from: c.i.h.e$e */
    static final class e {

        /* renamed from: a */
        final Typeface f6342a;

        /* renamed from: b */
        final int f6343b;

        e(int i2) {
            this.f6342a = null;
            this.f6343b = i2;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        boolean m5995a() {
            return this.f6343b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f6342a = typeface;
            this.f6343b = 0;
        }
    }
}
