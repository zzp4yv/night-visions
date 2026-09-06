package p355k.p357b.p359f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import p355k.p357b.InterfaceC9698a;
import p355k.p357b.InterfaceC9699b;
import p355k.p357b.p358e.C9705d;

/* compiled from: SubstituteLoggerFactory.java */
/* renamed from: k.b.f.h */
/* loaded from: classes3.dex */
public class C9713h implements InterfaceC9698a {

    /* renamed from: a */
    boolean f37141a = false;

    /* renamed from: b */
    final Map<String, C9712g> f37142b = new HashMap();

    /* renamed from: c */
    final LinkedBlockingQueue<C9705d> f37143c = new LinkedBlockingQueue<>();

    @Override // p355k.p357b.InterfaceC9698a
    /* renamed from: a */
    public synchronized InterfaceC9699b mo32171a(String str) {
        C9712g c9712g;
        c9712g = this.f37142b.get(str);
        if (c9712g == null) {
            c9712g = new C9712g(str, this.f37143c, this.f37141a);
            this.f37142b.put(str, c9712g);
        }
        return c9712g;
    }

    /* renamed from: b */
    public void m32239b() {
        this.f37142b.clear();
        this.f37143c.clear();
    }

    /* renamed from: c */
    public LinkedBlockingQueue<C9705d> m32240c() {
        return this.f37143c;
    }

    /* renamed from: d */
    public List<C9712g> m32241d() {
        return new ArrayList(this.f37142b.values());
    }

    /* renamed from: e */
    public void m32242e() {
        this.f37141a = true;
    }
}
