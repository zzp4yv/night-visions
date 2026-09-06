package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* renamed from: com.google.firebase.crashlytics.h.p.w */
/* loaded from: classes2.dex */
final class C8253w extends AbstractC8225f0.e.d.AbstractC11466e {

    /* renamed from: a */
    private final AbstractC8225f0.e.d.AbstractC11466e.b f31517a;

    /* renamed from: b */
    private final String f31518b;

    /* renamed from: c */
    private final String f31519c;

    /* renamed from: d */
    private final long f31520d;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.w$b */
    static final class b extends AbstractC8225f0.e.d.AbstractC11466e.a {

        /* renamed from: a */
        private AbstractC8225f0.e.d.AbstractC11466e.b f31521a;

        /* renamed from: b */
        private String f31522b;

        /* renamed from: c */
        private String f31523c;

        /* renamed from: d */
        private Long f31524d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.AbstractC11466e.a
        /* renamed from: a */
        public AbstractC8225f0.e.d.AbstractC11466e mo25878a() {
            AbstractC8225f0.e.d.AbstractC11466e.b bVar = this.f31521a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (bVar == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " rolloutVariant";
            }
            if (this.f31522b == null) {
                str = str + " parameterKey";
            }
            if (this.f31523c == null) {
                str = str + " parameterValue";
            }
            if (this.f31524d == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new C8253w(this.f31521a, this.f31522b, this.f31523c, this.f31524d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.AbstractC11466e.a
        /* renamed from: b */
        public AbstractC8225f0.e.d.AbstractC11466e.a mo25879b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f31522b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.AbstractC11466e.a
        /* renamed from: c */
        public AbstractC8225f0.e.d.AbstractC11466e.a mo25880c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f31523c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.AbstractC11466e.a
        /* renamed from: d */
        public AbstractC8225f0.e.d.AbstractC11466e.a mo25881d(AbstractC8225f0.e.d.AbstractC11466e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f31521a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.AbstractC11466e.a
        /* renamed from: e */
        public AbstractC8225f0.e.d.AbstractC11466e.a mo25882e(long j2) {
            this.f31524d = Long.valueOf(j2);
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.AbstractC11466e
    /* renamed from: b */
    public String mo25874b() {
        return this.f31518b;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.AbstractC11466e
    /* renamed from: c */
    public String mo25875c() {
        return this.f31519c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.AbstractC11466e
    /* renamed from: d */
    public AbstractC8225f0.e.d.AbstractC11466e.b mo25876d() {
        return this.f31517a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.AbstractC11466e
    /* renamed from: e */
    public long mo25877e() {
        return this.f31520d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8225f0.e.d.AbstractC11466e)) {
            return false;
        }
        AbstractC8225f0.e.d.AbstractC11466e abstractC11466e = (AbstractC8225f0.e.d.AbstractC11466e) obj;
        return this.f31517a.equals(abstractC11466e.mo25876d()) && this.f31518b.equals(abstractC11466e.mo25874b()) && this.f31519c.equals(abstractC11466e.mo25875c()) && this.f31520d == abstractC11466e.mo25877e();
    }

    public int hashCode() {
        int hashCode = (((((this.f31517a.hashCode() ^ 1000003) * 1000003) ^ this.f31518b.hashCode()) * 1000003) ^ this.f31519c.hashCode()) * 1000003;
        long j2 = this.f31520d;
        return hashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f31517a + ", parameterKey=" + this.f31518b + ", parameterValue=" + this.f31519c + ", templateVersion=" + this.f31520d + "}";
    }

    private C8253w(AbstractC8225f0.e.d.AbstractC11466e.b bVar, String str, String str2, long j2) {
        this.f31517a = bVar;
        this.f31518b = str;
        this.f31519c = str2;
        this.f31520d = j2;
    }
}
