package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.p092pt.FirebaseConstants;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new C8405i0();

    /* renamed from: f */
    @SafeParcelable.Field
    Bundle f31926f;

    /* renamed from: g */
    private C8385b f31927g;

    /* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
    /* renamed from: com.google.firebase.messaging.RemoteMessage$b */
    public static class C8385b {

        /* renamed from: a */
        private final String f31928a;

        /* renamed from: b */
        private final String f31929b;

        /* renamed from: c */
        private final String[] f31930c;

        /* renamed from: d */
        private final String f31931d;

        /* renamed from: e */
        private final String f31932e;

        /* renamed from: f */
        private final String[] f31933f;

        /* renamed from: g */
        private final String f31934g;

        /* renamed from: h */
        private final String f31935h;

        /* renamed from: i */
        private final String f31936i;

        /* renamed from: j */
        private final String f31937j;

        /* renamed from: k */
        private final String f31938k;

        /* renamed from: l */
        private final String f31939l;

        /* renamed from: m */
        private final String f31940m;

        /* renamed from: n */
        private final Uri f31941n;

        /* renamed from: o */
        private final String f31942o;

        /* renamed from: p */
        private final Integer f31943p;

        /* renamed from: q */
        private final Integer f31944q;

        /* renamed from: r */
        private final Integer f31945r;

        /* renamed from: s */
        private final int[] f31946s;

        /* renamed from: t */
        private final Long f31947t;

        /* renamed from: u */
        private final boolean f31948u;

        /* renamed from: v */
        private final boolean f31949v;

        /* renamed from: w */
        private final boolean f31950w;

        /* renamed from: x */
        private final boolean f31951x;

        /* renamed from: y */
        private final boolean f31952y;

        /* renamed from: z */
        private final long[] f31953z;

        private C8385b(C8403h0 c8403h0) {
            this.f31928a = c8403h0.m26569p("gcm.n.title");
            this.f31929b = c8403h0.m26561h("gcm.n.title");
            this.f31930c = m26458c(c8403h0, "gcm.n.title");
            this.f31931d = c8403h0.m26569p("gcm.n.body");
            this.f31932e = c8403h0.m26561h("gcm.n.body");
            this.f31933f = m26458c(c8403h0, "gcm.n.body");
            this.f31934g = c8403h0.m26569p("gcm.n.icon");
            this.f31936i = c8403h0.m26568o();
            this.f31937j = c8403h0.m26569p("gcm.n.tag");
            this.f31938k = c8403h0.m26569p("gcm.n.color");
            this.f31939l = c8403h0.m26569p("gcm.n.click_action");
            this.f31940m = c8403h0.m26569p("gcm.n.android_channel_id");
            this.f31941n = c8403h0.m26559f();
            this.f31935h = c8403h0.m26569p("gcm.n.image");
            this.f31942o = c8403h0.m26569p("gcm.n.ticker");
            this.f31943p = c8403h0.m26556b("gcm.n.notification_priority");
            this.f31944q = c8403h0.m26556b("gcm.n.visibility");
            this.f31945r = c8403h0.m26556b("gcm.n.notification_count");
            this.f31948u = c8403h0.m26555a("gcm.n.sticky");
            this.f31949v = c8403h0.m26555a("gcm.n.local_only");
            this.f31950w = c8403h0.m26555a("gcm.n.default_sound");
            this.f31951x = c8403h0.m26555a("gcm.n.default_vibrate_timings");
            this.f31952y = c8403h0.m26555a("gcm.n.default_light_settings");
            this.f31947t = c8403h0.m26563j("gcm.n.event_time");
            this.f31946s = c8403h0.m26558e();
            this.f31953z = c8403h0.m26570q();
        }

        /* renamed from: c */
        private static String[] m26458c(C8403h0 c8403h0, String str) {
            Object[] m26560g = c8403h0.m26560g(str);
            if (m26560g == null) {
                return null;
            }
            String[] strArr = new String[m26560g.length];
            for (int i2 = 0; i2 < m26560g.length; i2++) {
                strArr[i2] = String.valueOf(m26560g[i2]);
            }
            return strArr;
        }

        /* renamed from: a */
        public String m26459a() {
            return this.f31931d;
        }

        /* renamed from: b */
        public Uri m26460b() {
            String str = this.f31935h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        /* renamed from: d */
        public String m26461d() {
            return this.f31928a;
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(id = 2) Bundle bundle) {
        this.f31926f = bundle;
    }

    @KeepForSdk
    /* renamed from: W */
    public Intent m26455W() {
        Intent intent = new Intent();
        intent.putExtras(this.f31926f);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        C8405i0.m26574c(this, parcel, i2);
    }

    /* renamed from: y */
    public String m26456y() {
        String string = this.f31926f.getString(FirebaseConstants.FIREBASE_MESSAGE_ID);
        return string == null ? this.f31926f.getString("message_id") : string;
    }

    /* renamed from: z */
    public C8385b m26457z() {
        if (this.f31927g == null && C8403h0.m26550t(this.f31926f)) {
            this.f31927g = new C8385b(new C8403h0(this.f31926f));
        }
        return this.f31927g;
    }
}
