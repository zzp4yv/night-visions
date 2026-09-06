package com.bumptech.glide.load.p127m.p128o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.ComponentCallbacks2C5316c;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.p127m.C5403g;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* renamed from: com.bumptech.glide.load.m.o.c */
/* loaded from: classes.dex */
public class C5413c implements InterfaceC5400d<InputStream> {

    /* renamed from: f */
    private final Uri f13591f;

    /* renamed from: g */
    private final C5415e f13592g;

    /* renamed from: h */
    private InputStream f13593h;

    /* compiled from: ThumbFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.o.c$a */
    static class a implements InterfaceC5414d {

        /* renamed from: a */
        private static final String[] f13594a = {"_data"};

        /* renamed from: b */
        private final ContentResolver f13595b;

        a(ContentResolver contentResolver) {
            this.f13595b = contentResolver;
        }

        @Override // com.bumptech.glide.load.p127m.p128o.InterfaceC5414d
        /* renamed from: a */
        public Cursor mo10503a(Uri uri) {
            return this.f13595b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f13594a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* renamed from: com.bumptech.glide.load.m.o.c$b */
    static class b implements InterfaceC5414d {

        /* renamed from: a */
        private static final String[] f13596a = {"_data"};

        /* renamed from: b */
        private final ContentResolver f13597b;

        b(ContentResolver contentResolver) {
            this.f13597b = contentResolver;
        }

        @Override // com.bumptech.glide.load.p127m.p128o.InterfaceC5414d
        /* renamed from: a */
        public Cursor mo10503a(Uri uri) {
            return this.f13597b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f13596a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    C5413c(Uri uri, C5415e c5415e) {
        this.f13591f = uri;
        this.f13592g = c5415e;
    }

    /* renamed from: c */
    private static C5413c m10499c(Context context, Uri uri, InterfaceC5414d interfaceC5414d) {
        return new C5413c(uri, new C5415e(ComponentCallbacks2C5316c.m9972c(context).m9986j().m9957g(), interfaceC5414d, ComponentCallbacks2C5316c.m9972c(context).m9981e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static C5413c m10500f(Context context, Uri uri) {
        return m10499c(context, uri, new a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static C5413c m10501g(Context context, Uri uri) {
        return m10499c(context, uri, new b(context.getContentResolver()));
    }

    /* renamed from: h */
    private InputStream m10502h() throws FileNotFoundException {
        InputStream m10507d = this.f13592g.m10507d(this.f13591f);
        int m10506a = m10507d != null ? this.f13592g.m10506a(this.f13591f) : -1;
        return m10506a != -1 ? new C5403g(m10507d, m10506a) : m10507d;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: a */
    public Class<InputStream> mo10455a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: b */
    public void mo10460b() {
        InputStream inputStream = this.f13593h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: d */
    public EnumC5332a mo10462d() {
        return EnumC5332a.LOCAL;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: e */
    public void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super InputStream> aVar) {
        try {
            InputStream m10502h = m10502h();
            this.f13593h = m10502h;
            aVar.mo10228f(m10502h);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.mo10227c(e2);
        }
    }
}
