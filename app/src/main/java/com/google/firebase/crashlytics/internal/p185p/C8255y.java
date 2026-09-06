package com.google.firebase.crashlytics.internal.p185p;

import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import java.util.List;
import okhttp3.HttpUrl;

/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* renamed from: com.google.firebase.crashlytics.h.p.y */
/* loaded from: classes2.dex */
final class C8255y extends AbstractC8225f0.e.d.f {

    /* renamed from: a */
    private final List<AbstractC8225f0.e.d.AbstractC11466e> f31529a;

    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.y$b */
    static final class b extends AbstractC8225f0.e.d.f.a {

        /* renamed from: a */
        private List<AbstractC8225f0.e.d.AbstractC11466e> f31530a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.f.a
        /* renamed from: a */
        public AbstractC8225f0.e.d.f mo25891a() {
            List<AbstractC8225f0.e.d.AbstractC11466e> list = this.f31530a;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (list == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET + " rolloutAssignments";
            }
            if (str.isEmpty()) {
                return new C8255y(this.f31530a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.f.a
        /* renamed from: b */
        public AbstractC8225f0.e.d.f.a mo25892b(List<AbstractC8225f0.e.d.AbstractC11466e> list) {
            if (list == null) {
                throw new NullPointerException("Null rolloutAssignments");
            }
            this.f31530a = list;
            return this;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0.e.d.f
    /* renamed from: b */
    public List<AbstractC8225f0.e.d.AbstractC11466e> mo25890b() {
        return this.f31529a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8225f0.e.d.f) {
            return this.f31529a.equals(((AbstractC8225f0.e.d.f) obj).mo25890b());
        }
        return false;
    }

    public int hashCode() {
        return this.f31529a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f31529a + "}";
    }

    private C8255y(List<AbstractC8225f0.e.d.AbstractC11466e> list) {
        this.f31529a = list;
    }
}
