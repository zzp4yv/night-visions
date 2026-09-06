package p241e.p254e.p256b.p257a.p258i.p266y.p267a;

import com.google.firebase.encoders.p194i.InterfaceC8311f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.p258i.AbstractC8838n;

/* compiled from: ClientMetrics.java */
/* renamed from: e.e.b.a.i.y.a.a */
/* loaded from: classes2.dex */
public final class C8852a {

    /* renamed from: a */
    private static final C8852a f33632a = new a().m28197b();

    /* renamed from: b */
    private final C8857f f33633b;

    /* renamed from: c */
    private final List<C8855d> f33634c;

    /* renamed from: d */
    private final C8853b f33635d;

    /* renamed from: e */
    private final String f33636e;

    /* compiled from: ClientMetrics.java */
    /* renamed from: e.e.b.a.i.y.a.a$a */
    public static final class a {

        /* renamed from: a */
        private C8857f f33637a = null;

        /* renamed from: b */
        private List<C8855d> f33638b = new ArrayList();

        /* renamed from: c */
        private C8853b f33639c = null;

        /* renamed from: d */
        private String f33640d = HttpUrl.FRAGMENT_ENCODE_SET;

        a() {
        }

        /* renamed from: a */
        public a m28196a(C8855d c8855d) {
            this.f33638b.add(c8855d);
            return this;
        }

        /* renamed from: b */
        public C8852a m28197b() {
            return new C8852a(this.f33637a, Collections.unmodifiableList(this.f33638b), this.f33639c, this.f33640d);
        }

        /* renamed from: c */
        public a m28198c(String str) {
            this.f33640d = str;
            return this;
        }

        /* renamed from: d */
        public a m28199d(C8853b c8853b) {
            this.f33639c = c8853b;
            return this;
        }

        /* renamed from: e */
        public a m28200e(C8857f c8857f) {
            this.f33637a = c8857f;
            return this;
        }
    }

    C8852a(C8857f c8857f, List<C8855d> list, C8853b c8853b, String str) {
        this.f33633b = c8857f;
        this.f33634c = list;
        this.f33635d = c8853b;
        this.f33636e = str;
    }

    /* renamed from: e */
    public static a m28190e() {
        return new a();
    }

    @InterfaceC8311f(tag = 4)
    /* renamed from: a */
    public String m28191a() {
        return this.f33636e;
    }

    @InterfaceC8311f(tag = 3)
    /* renamed from: b */
    public C8853b m28192b() {
        return this.f33635d;
    }

    @InterfaceC8311f(tag = 2)
    /* renamed from: c */
    public List<C8855d> m28193c() {
        return this.f33634c;
    }

    @InterfaceC8311f(tag = 1)
    /* renamed from: d */
    public C8857f m28194d() {
        return this.f33633b;
    }

    /* renamed from: f */
    public byte[] m28195f() {
        return AbstractC8838n.m28165a(this);
    }
}
