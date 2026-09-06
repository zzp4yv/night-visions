package p241e.p254e.p256b.p257a.p258i;

import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.AbstractC8753c;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.InterfaceC8755e;
import p241e.p254e.p256b.p257a.p258i.AbstractC8840p;

/* compiled from: AutoValue_SendRequest.java */
/* renamed from: e.e.b.a.i.d */
/* loaded from: classes2.dex */
final class C8827d extends AbstractC8840p {

    /* renamed from: a */
    private final AbstractC8841q f33571a;

    /* renamed from: b */
    private final String f33572b;

    /* renamed from: c */
    private final AbstractC8753c<?> f33573c;

    /* renamed from: d */
    private final InterfaceC8755e<?, byte[]> f33574d;

    /* renamed from: e */
    private final C8752b f33575e;

    /* compiled from: AutoValue_SendRequest.java */
    /* renamed from: e.e.b.a.i.d$b */
    static final class b extends AbstractC8840p.a {

        /* renamed from: a */
        private AbstractC8841q f33576a;

        /* renamed from: b */
        private String f33577b;

        /* renamed from: c */
        private AbstractC8753c<?> f33578c;

        /* renamed from: d */
        private InterfaceC8755e<?, byte[]> f33579d;

        /* renamed from: e */
        private C8752b f33580e;

        b() {
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p.a
        /* renamed from: a */
        public AbstractC8840p mo28126a() {
            AbstractC8841q abstractC8841q = this.f33576a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (abstractC8841q == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " transportContext";
            }
            if (this.f33577b == null) {
                str = str + " transportName";
            }
            if (this.f33578c == null) {
                str = str + " event";
            }
            if (this.f33579d == null) {
                str = str + " transformer";
            }
            if (this.f33580e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C8827d(this.f33576a, this.f33577b, this.f33578c, this.f33579d, this.f33580e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p.a
        /* renamed from: b */
        AbstractC8840p.a mo28127b(C8752b c8752b) {
            if (c8752b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f33580e = c8752b;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p.a
        /* renamed from: c */
        AbstractC8840p.a mo28128c(AbstractC8753c<?> abstractC8753c) {
            if (abstractC8753c == null) {
                throw new NullPointerException("Null event");
            }
            this.f33578c = abstractC8753c;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p.a
        /* renamed from: d */
        AbstractC8840p.a mo28129d(InterfaceC8755e<?, byte[]> interfaceC8755e) {
            if (interfaceC8755e == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f33579d = interfaceC8755e;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p.a
        /* renamed from: e */
        public AbstractC8840p.a mo28130e(AbstractC8841q abstractC8841q) {
            if (abstractC8841q == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f33576a = abstractC8841q;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p.a
        /* renamed from: f */
        public AbstractC8840p.a mo28131f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f33577b = str;
            return this;
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p
    /* renamed from: b */
    public C8752b mo28121b() {
        return this.f33575e;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p
    /* renamed from: c */
    AbstractC8753c<?> mo28122c() {
        return this.f33573c;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p
    /* renamed from: e */
    InterfaceC8755e<?, byte[]> mo28123e() {
        return this.f33574d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8840p)) {
            return false;
        }
        AbstractC8840p abstractC8840p = (AbstractC8840p) obj;
        return this.f33571a.equals(abstractC8840p.mo28124f()) && this.f33572b.equals(abstractC8840p.mo28125g()) && this.f33573c.equals(abstractC8840p.mo28122c()) && this.f33574d.equals(abstractC8840p.mo28123e()) && this.f33575e.equals(abstractC8840p.mo28121b());
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p
    /* renamed from: f */
    public AbstractC8841q mo28124f() {
        return this.f33571a;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8840p
    /* renamed from: g */
    public String mo28125g() {
        return this.f33572b;
    }

    public int hashCode() {
        return ((((((((this.f33571a.hashCode() ^ 1000003) * 1000003) ^ this.f33572b.hashCode()) * 1000003) ^ this.f33573c.hashCode()) * 1000003) ^ this.f33574d.hashCode()) * 1000003) ^ this.f33575e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f33571a + ", transportName=" + this.f33572b + ", event=" + this.f33573c + ", transformer=" + this.f33574d + ", encoding=" + this.f33575e + "}";
    }

    private C8827d(AbstractC8841q abstractC8841q, String str, AbstractC8753c<?> abstractC8753c, InterfaceC8755e<?, byte[]> interfaceC8755e, C8752b c8752b) {
        this.f33571a = abstractC8841q;
        this.f33572b = str;
        this.f33573c = abstractC8753c;
        this.f33574d = interfaceC8755e;
        this.f33575e = c8752b;
    }
}
