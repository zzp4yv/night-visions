package p241e.p254e.p256b.p257a.p258i.p266y.p267a;

import com.google.firebase.encoders.p194i.InterfaceC8311f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: LogSourceMetrics.java */
/* renamed from: e.e.b.a.i.y.a.d */
/* loaded from: classes2.dex */
public final class C8855d {

    /* renamed from: a */
    private static final C8855d f33658a = new a().m28214a();

    /* renamed from: b */
    private final String f33659b;

    /* renamed from: c */
    private final List<C8854c> f33660c;

    /* compiled from: LogSourceMetrics.java */
    /* renamed from: e.e.b.a.i.y.a.d$a */
    public static final class a {

        /* renamed from: a */
        private String f33661a = HttpUrl.FRAGMENT_ENCODE_SET;

        /* renamed from: b */
        private List<C8854c> f33662b = new ArrayList();

        a() {
        }

        /* renamed from: a */
        public C8855d m28214a() {
            return new C8855d(this.f33661a, Collections.unmodifiableList(this.f33662b));
        }

        /* renamed from: b */
        public a m28215b(List<C8854c> list) {
            this.f33662b = list;
            return this;
        }

        /* renamed from: c */
        public a m28216c(String str) {
            this.f33661a = str;
            return this;
        }
    }

    C8855d(String str, List<C8854c> list) {
        this.f33659b = str;
        this.f33660c = list;
    }

    /* renamed from: c */
    public static a m28211c() {
        return new a();
    }

    @InterfaceC8311f(tag = 2)
    /* renamed from: a */
    public List<C8854c> m28212a() {
        return this.f33660c;
    }

    @InterfaceC8311f(tag = 1)
    /* renamed from: b */
    public String m28213b() {
        return this.f33659b;
    }
}
