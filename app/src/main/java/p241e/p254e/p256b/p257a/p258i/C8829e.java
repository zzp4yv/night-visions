package p241e.p254e.p256b.p257a.p258i;

import java.util.Arrays;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.EnumC8754d;
import p241e.p254e.p256b.p257a.p258i.AbstractC8841q;

/* compiled from: AutoValue_TransportContext.java */
/* renamed from: e.e.b.a.i.e */
/* loaded from: classes2.dex */
final class C8829e extends AbstractC8841q {

    /* renamed from: a */
    private final String f33583a;

    /* renamed from: b */
    private final byte[] f33584b;

    /* renamed from: c */
    private final EnumC8754d f33585c;

    /* compiled from: AutoValue_TransportContext.java */
    /* renamed from: e.e.b.a.i.e$b */
    static final class b extends AbstractC8841q.a {

        /* renamed from: a */
        private String f33586a;

        /* renamed from: b */
        private byte[] f33587b;

        /* renamed from: c */
        private EnumC8754d f33588c;

        b() {
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8841q.a
        /* renamed from: a */
        public AbstractC8841q mo28137a() {
            String str = this.f33586a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " backendName";
            }
            if (this.f33588c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new C8829e(this.f33586a, this.f33587b, this.f33588c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8841q.a
        /* renamed from: b */
        public AbstractC8841q.a mo28138b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f33586a = str;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8841q.a
        /* renamed from: c */
        public AbstractC8841q.a mo28139c(byte[] bArr) {
            this.f33587b = bArr;
            return this;
        }

        @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8841q.a
        /* renamed from: d */
        public AbstractC8841q.a mo28140d(EnumC8754d enumC8754d) {
            if (enumC8754d == null) {
                throw new NullPointerException("Null priority");
            }
            this.f33588c = enumC8754d;
            return this;
        }
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8841q
    /* renamed from: b */
    public String mo28134b() {
        return this.f33583a;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8841q
    /* renamed from: c */
    public byte[] mo28135c() {
        return this.f33584b;
    }

    @Override // p241e.p254e.p256b.p257a.p258i.AbstractC8841q
    /* renamed from: d */
    public EnumC8754d mo28136d() {
        return this.f33585c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8841q)) {
            return false;
        }
        AbstractC8841q abstractC8841q = (AbstractC8841q) obj;
        if (this.f33583a.equals(abstractC8841q.mo28134b())) {
            if (Arrays.equals(this.f33584b, abstractC8841q instanceof C8829e ? ((C8829e) abstractC8841q).f33584b : abstractC8841q.mo28135c()) && this.f33585c.equals(abstractC8841q.mo28136d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f33583a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f33584b)) * 1000003) ^ this.f33585c.hashCode();
    }

    private C8829e(String str, byte[] bArr, EnumC8754d enumC8754d) {
        this.f33583a = str;
        this.f33584b = bArr;
        this.f33585c = enumC8754d;
    }
}
