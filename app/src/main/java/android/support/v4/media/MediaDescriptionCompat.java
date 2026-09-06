package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.C0008b;
import android.support.v4.media.C0009c;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0003a();

    /* renamed from: f */
    private final String f6f;

    /* renamed from: g */
    private final CharSequence f7g;

    /* renamed from: h */
    private final CharSequence f8h;

    /* renamed from: i */
    private final CharSequence f9i;

    /* renamed from: j */
    private final Bitmap f10j;

    /* renamed from: k */
    private final Uri f11k;

    /* renamed from: l */
    private final Bundle f12l;

    /* renamed from: m */
    private final Uri f13m;

    /* renamed from: n */
    private Object f14n;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    static class C0003a implements Parcelable.Creator<MediaDescriptionCompat> {
        C0003a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return Build.VERSION.SDK_INT < 21 ? new MediaDescriptionCompat(parcel) : MediaDescriptionCompat.m8a(C0008b.m26a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static final class C0004b {

        /* renamed from: a */
        private String f15a;

        /* renamed from: b */
        private CharSequence f16b;

        /* renamed from: c */
        private CharSequence f17c;

        /* renamed from: d */
        private CharSequence f18d;

        /* renamed from: e */
        private Bitmap f19e;

        /* renamed from: f */
        private Uri f20f;

        /* renamed from: g */
        private Bundle f21g;

        /* renamed from: h */
        private Uri f22h;

        /* renamed from: a */
        public MediaDescriptionCompat m12a() {
            return new MediaDescriptionCompat(this.f15a, this.f16b, this.f17c, this.f18d, this.f19e, this.f20f, this.f21g, this.f22h);
        }

        /* renamed from: b */
        public C0004b m13b(CharSequence charSequence) {
            this.f18d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0004b m14c(Bundle bundle) {
            this.f21g = bundle;
            return this;
        }

        /* renamed from: d */
        public C0004b m15d(Bitmap bitmap) {
            this.f19e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C0004b m16e(Uri uri) {
            this.f20f = uri;
            return this;
        }

        /* renamed from: f */
        public C0004b m17f(String str) {
            this.f15a = str;
            return this;
        }

        /* renamed from: g */
        public C0004b m18g(Uri uri) {
            this.f22h = uri;
            return this;
        }

        /* renamed from: h */
        public C0004b m19h(CharSequence charSequence) {
            this.f17c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0004b m20i(CharSequence charSequence) {
            this.f16b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f6f = str;
        this.f7g = charSequence;
        this.f8h = charSequence2;
        this.f9i = charSequence3;
        this.f10j = bitmap;
        this.f11k = uri;
        this.f12l = bundle;
        this.f13m = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat m8a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L7e
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.C0008b.m31f(r9)
            r2.m17f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.C0008b.m33h(r9)
            r2.m20i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.C0008b.m32g(r9)
            r2.m19h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.C0008b.m27b(r9)
            r2.m13b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.C0008b.m29d(r9)
            r2.m15d(r3)
            android.net.Uri r3 = android.support.v4.media.C0008b.m30e(r9)
            r2.m16e(r3)
            android.os.Bundle r3 = android.support.v4.media.C0008b.m28c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4a
            android.support.v4.media.session.MediaSessionCompat.m54a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L4b
        L4a:
            r5 = r0
        L4b:
            if (r5 == 0) goto L63
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5d
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5d
            goto L64
        L5d:
            r3.remove(r4)
            r3.remove(r6)
        L63:
            r0 = r3
        L64:
            r2.m14c(r0)
            if (r5 == 0) goto L6d
            r2.m18g(r5)
            goto L78
        L6d:
            r0 = 23
            if (r1 < r0) goto L78
            android.net.Uri r0 = android.support.v4.media.C0009c.m44a(r9)
            r2.m18g(r0)
        L78:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.m12a()
            r0.f14n = r9
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.m8a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    /* renamed from: b */
    public Object m9b() {
        int i2;
        Object obj = this.f14n;
        if (obj != null || (i2 = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object m36b = C0008b.a.m36b();
        C0008b.a.m41g(m36b, this.f6f);
        C0008b.a.m43i(m36b, this.f7g);
        C0008b.a.m42h(m36b, this.f8h);
        C0008b.a.m37c(m36b, this.f9i);
        C0008b.a.m39e(m36b, this.f10j);
        C0008b.a.m40f(m36b, this.f11k);
        Bundle bundle = this.f12l;
        if (i2 < 23 && this.f13m != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f13m);
        }
        C0008b.a.m38d(m36b, bundle);
        if (i2 >= 23) {
            C0009c.a.m45a(m36b, this.f13m);
        }
        Object m35a = C0008b.a.m35a(m36b);
        this.f14n = m35a;
        return m35a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f7g) + ", " + ((Object) this.f8h) + ", " + ((Object) this.f9i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            C0008b.m34i(m9b(), parcel, i2);
            return;
        }
        parcel.writeString(this.f6f);
        TextUtils.writeToParcel(this.f7g, parcel, i2);
        TextUtils.writeToParcel(this.f8h, parcel, i2);
        TextUtils.writeToParcel(this.f9i, parcel, i2);
        parcel.writeParcelable(this.f10j, i2);
        parcel.writeParcelable(this.f11k, i2);
        parcel.writeBundle(this.f12l);
        parcel.writeParcelable(this.f13m, i2);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f6f = parcel.readString();
        this.f7g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f10j = (Bitmap) parcel.readParcelable(classLoader);
        this.f11k = (Uri) parcel.readParcelable(classLoader);
        this.f12l = parcel.readBundle(classLoader);
        this.f13m = (Uri) parcel.readParcelable(classLoader);
    }
}
