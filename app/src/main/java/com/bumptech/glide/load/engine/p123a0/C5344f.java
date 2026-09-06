package com.bumptech.glide.load.engine.p123a0;

import android.content.Context;
import com.bumptech.glide.load.engine.p123a0.C5342d;
import java.io.File;

/* compiled from: InternalCacheDiskCacheFactory.java */
/* renamed from: com.bumptech.glide.load.engine.a0.f */
/* loaded from: classes.dex */
public final class C5344f extends C5342d {

    /* compiled from: InternalCacheDiskCacheFactory.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.f$a */
    class a implements C5342d.a {

        /* renamed from: a */
        final /* synthetic */ Context f13265a;

        /* renamed from: b */
        final /* synthetic */ String f13266b;

        a(Context context, String str) {
            this.f13265a = context;
            this.f13266b = str;
        }

        @Override // com.bumptech.glide.load.engine.p123a0.C5342d.a
        /* renamed from: a */
        public File mo10187a() {
            File cacheDir = this.f13265a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f13266b != null ? new File(cacheDir, this.f13266b) : cacheDir;
        }
    }

    public C5344f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public C5344f(Context context, String str, long j2) {
        super(new a(context, str), j2);
    }
}
