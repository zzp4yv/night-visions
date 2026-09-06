package io.sentry;

import io.sentry.EnumC9547r4;
import io.sentry.util.C9613q;
import io.sentry.vendor.gson.stream.EnumC9633b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelopeItemHeader.java */
@ApiStatus.Internal
/* renamed from: io.sentry.k4 */
/* loaded from: classes2.dex */
public final class C9466k4 implements InterfaceC9545r2 {

    /* renamed from: f */
    private final String f36402f;

    /* renamed from: g */
    private final String f36403g;

    /* renamed from: h */
    private final EnumC9547r4 f36404h;

    /* renamed from: i */
    private final int f36405i;

    /* renamed from: j */
    private final Callable<Integer> f36406j;

    /* renamed from: k */
    private final String f36407k;

    /* renamed from: l */
    private Map<String, Object> f36408l;

    /* compiled from: SentryEnvelopeItemHeader.java */
    /* renamed from: io.sentry.k4$a */
    public static final class a implements InterfaceC9471l2<C9466k4> {
        /* renamed from: c */
        private Exception m30921c(String str, InterfaceC9637w1 interfaceC9637w1) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC9637w1.mo30213b(EnumC9554s4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC9471l2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C9466k4 mo30683a(C9485n2 c9485n2, InterfaceC9637w1 interfaceC9637w1) throws Exception {
            String m31879B;
            c9485n2.m31884b();
            HashMap hashMap = null;
            EnumC9547r4 enumC9547r4 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            int i2 = 0;
            while (c9485n2.m31882N() == EnumC9633b.NAME) {
                m31879B = c9485n2.m31879B();
                m31879B.hashCode();
                switch (m31879B) {
                    case "length":
                        i2 = c9485n2.m31894z();
                        break;
                    case "filename":
                        str2 = c9485n2.m31090N0();
                        break;
                    case "attachment_type":
                        str3 = c9485n2.m31090N0();
                        break;
                    case "type":
                        enumC9547r4 = (EnumC9547r4) c9485n2.m31089M0(interfaceC9637w1, new EnumC9547r4.a());
                        break;
                    case "content_type":
                        str = c9485n2.m31090N0();
                        break;
                    default:
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c9485n2.m31092R0(interfaceC9637w1, hashMap, m31879B);
                        break;
                }
            }
            if (enumC9547r4 == null) {
                throw m30921c("type", interfaceC9637w1);
            }
            C9466k4 c9466k4 = new C9466k4(enumC9547r4, i2, str, str2, str3);
            c9466k4.m30920c(hashMap);
            c9485n2.m31889j();
            return c9466k4;
        }
    }

    @ApiStatus.Internal
    public C9466k4(EnumC9547r4 enumC9547r4, int i2, String str, String str2, String str3) {
        this.f36404h = (EnumC9547r4) C9613q.m31802c(enumC9547r4, "type is required");
        this.f36402f = str;
        this.f36405i = i2;
        this.f36403g = str2;
        this.f36406j = null;
        this.f36407k = str3;
    }

    /* renamed from: a */
    public int m30918a() {
        Callable<Integer> callable = this.f36406j;
        if (callable == null) {
            return this.f36405i;
        }
        try {
            return callable.call().intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public EnumC9547r4 m30919b() {
        return this.f36404h;
    }

    /* renamed from: c */
    public void m30920c(Map<String, Object> map) {
        this.f36408l = map;
    }

    @Override // io.sentry.InterfaceC9545r2
    public void serialize(InterfaceC9415h3 interfaceC9415h3, InterfaceC9637w1 interfaceC9637w1) throws IOException {
        interfaceC9415h3.mo30823f();
        if (this.f36402f != null) {
            interfaceC9415h3.mo30828k("content_type").mo30819b(this.f36402f);
        }
        if (this.f36403g != null) {
            interfaceC9415h3.mo30828k("filename").mo30819b(this.f36403g);
        }
        interfaceC9415h3.mo30828k("type").mo30824g(interfaceC9637w1, this.f36404h);
        if (this.f36407k != null) {
            interfaceC9415h3.mo30828k("attachment_type").mo30819b(this.f36407k);
        }
        interfaceC9415h3.mo30828k("length").mo30818a(m30918a());
        Map<String, Object> map = this.f36408l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f36408l.get(str);
                interfaceC9415h3.mo30828k(str);
                interfaceC9415h3.mo30824g(interfaceC9637w1, obj);
            }
        }
        interfaceC9415h3.mo30821d();
    }

    C9466k4(EnumC9547r4 enumC9547r4, Callable<Integer> callable, String str, String str2, String str3) {
        this.f36404h = (EnumC9547r4) C9613q.m31802c(enumC9547r4, "type is required");
        this.f36402f = str;
        this.f36405i = -1;
        this.f36403g = str2;
        this.f36406j = callable;
        this.f36407k = str3;
    }

    C9466k4(EnumC9547r4 enumC9547r4, Callable<Integer> callable, String str, String str2) {
        this(enumC9547r4, callable, str, str2, (String) null);
    }
}
