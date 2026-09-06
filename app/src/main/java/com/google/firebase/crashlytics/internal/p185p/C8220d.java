package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* renamed from: com.google.firebase.crashlytics.h.p.d */
/* loaded from: classes2.dex */
final class C8220d extends AbstractC8225f0.a.AbstractC11450a {

    /* renamed from: a */
    private final String f31321a;

    /* renamed from: b */
    private final String f31322b;

    /* renamed from: c */
    private final String f31323c;

    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.d$b */
    static final class b extends AbstractC8225f0.a.AbstractC11450a.AbstractC11451a {

        /* renamed from: a */
        private String f31324a;

        /* renamed from: b */
        private String f31325b;

        /* renamed from: c */
        private String f31326c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.a.AbstractC11450a.AbstractC11451a
        /* renamed from: a */
        public AbstractC8225f0.a.AbstractC11450a mo25637a() {
            String str = this.f31324a;
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (str == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET + " arch";
            }
            if (this.f31325b == null) {
                str2 = str2 + " libraryName";
            }
            if (this.f31326c == null) {
                str2 = str2 + " buildId";
            }
            if (str2.isEmpty()) {
                return new C8220d(this.f31324a, this.f31325b, this.f31326c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.a.AbstractC11450a.AbstractC11451a
        /* renamed from: b */
        public AbstractC8225f0.a.AbstractC11450a.AbstractC11451a mo25638b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f31324a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.a.AbstractC11450a.AbstractC11451a
        /* renamed from: c */
        public AbstractC8225f0.a.AbstractC11450a.AbstractC11451a mo25639c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f31326c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.a.AbstractC11450a.AbstractC11451a
        /* renamed from: d */
        public AbstractC8225f0.a.AbstractC11450a.AbstractC11451a mo25640d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f31325b = str;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.a.AbstractC11450a
    /* renamed from: b */
    public String mo25634b() {
        return this.f31321a;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.a.AbstractC11450a
    /* renamed from: c */
    public String mo25635c() {
        return this.f31323c;
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.a.AbstractC11450a
    /* renamed from: d */
    public String mo25636d() {
        return this.f31322b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8225f0.a.AbstractC11450a)) {
            return false;
        }
        AbstractC8225f0.a.AbstractC11450a abstractC11450a = (AbstractC8225f0.a.AbstractC11450a) obj;
        return this.f31321a.equals(abstractC11450a.mo25634b()) && this.f31322b.equals(abstractC11450a.mo25636d()) && this.f31323c.equals(abstractC11450a.mo25635c());
    }

    public int hashCode() {
        return ((((this.f31321a.hashCode() ^ 1000003) * 1000003) ^ this.f31322b.hashCode()) * 1000003) ^ this.f31323c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f31321a + ", libraryName=" + this.f31322b + ", buildId=" + this.f31323c + "}";
    }

    private C8220d(String str, String str2, String str3) {
        this.f31321a = str;
        this.f31322b = str2;
        this.f31323c = str3;
    }
}
