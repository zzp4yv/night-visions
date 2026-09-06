package com.facebook.p157o0;

import com.facebook.internal.C5663p0;
import java.io.ObjectStreamException;
import java.io.Serializable;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;

/* compiled from: AccessTokenAppIdPair.kt */
/* renamed from: com.facebook.o0.t */
/* loaded from: classes.dex */
public final class C5895t implements Serializable {

    /* renamed from: f */
    public static final a f15475f = new a(null);

    /* renamed from: g */
    private final String f15476g;

    /* renamed from: h */
    private final String f15477h;

    /* compiled from: AccessTokenAppIdPair.kt */
    /* renamed from: com.facebook.o0.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: AccessTokenAppIdPair.kt */
    /* renamed from: com.facebook.o0.t$b */
    public static final class b implements Serializable {

        /* renamed from: f */
        public static final a f15478f = new a(null);

        /* renamed from: g */
        private final String f15479g;

        /* renamed from: h */
        private final String f15480h;

        /* compiled from: AccessTokenAppIdPair.kt */
        /* renamed from: com.facebook.o0.t$b$a */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(C9756g c9756g) {
                this();
            }
        }

        public b(String str, String str2) {
            C9768m.m32346f(str2, "appId");
            this.f15479g = str;
            this.f15480h = str2;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new C5895t(this.f15479g, this.f15480h);
        }
    }

    public C5895t(String str, String str2) {
        C9768m.m32346f(str2, "applicationId");
        this.f15476g = str2;
        C5663p0 c5663p0 = C5663p0.f14478a;
        this.f15477h = C5663p0.m11557a0(str) ? null : str;
    }

    private final Object writeReplace() throws ObjectStreamException {
        return new b(this.f15477h, this.f15476g);
    }

    /* renamed from: a */
    public final String m12759a() {
        return this.f15477h;
    }

    /* renamed from: b */
    public final String m12760b() {
        return this.f15476g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5895t)) {
            return false;
        }
        C5663p0 c5663p0 = C5663p0.f14478a;
        C5895t c5895t = (C5895t) obj;
        return C5663p0.m11560c(c5895t.f15477h, this.f15477h) && C5663p0.m11560c(c5895t.f15476g, this.f15476g);
    }

    public int hashCode() {
        String str = this.f15477h;
        return (str == null ? 0 : str.hashCode()) ^ this.f15476g.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C5895t(com.facebook.AccessToken r2) {
        /*
            r1 = this;
            java.lang.String r0 = "accessToken"
            kotlin.jvm.internal.C9768m.m32346f(r2, r0)
            java.lang.String r2 = r2.m11093l()
            com.facebook.a0 r0 = com.facebook.C5608a0.f14199a
            java.lang.String r0 = com.facebook.C5608a0.m11285d()
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.C5895t.<init>(com.facebook.AccessToken):void");
    }
}
