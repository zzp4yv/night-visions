package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.EnumC5334c;

/* compiled from: DiskCacheStrategy.java */
/* renamed from: com.bumptech.glide.load.engine.j */
/* loaded from: classes.dex */
public abstract class AbstractC5360j {

    /* renamed from: a */
    public static final AbstractC5360j f13394a = new a();

    /* renamed from: b */
    public static final AbstractC5360j f13395b = new b();

    /* renamed from: c */
    public static final AbstractC5360j f13396c = new c();

    /* renamed from: d */
    public static final AbstractC5360j f13397d = new d();

    /* renamed from: e */
    public static final AbstractC5360j f13398e = new e();

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$a */
    class a extends AbstractC5360j {
        a() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: a */
        public boolean mo10298a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: b */
        public boolean mo10299b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: c */
        public boolean mo10300c(EnumC5332a enumC5332a) {
            return enumC5332a == EnumC5332a.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5332a enumC5332a, EnumC5334c enumC5334c) {
            return (enumC5332a == EnumC5332a.RESOURCE_DISK_CACHE || enumC5332a == EnumC5332a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$b */
    class b extends AbstractC5360j {
        b() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: a */
        public boolean mo10298a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: b */
        public boolean mo10299b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: c */
        public boolean mo10300c(EnumC5332a enumC5332a) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5332a enumC5332a, EnumC5334c enumC5334c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$c */
    class c extends AbstractC5360j {
        c() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: a */
        public boolean mo10298a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: b */
        public boolean mo10299b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: c */
        public boolean mo10300c(EnumC5332a enumC5332a) {
            return (enumC5332a == EnumC5332a.DATA_DISK_CACHE || enumC5332a == EnumC5332a.MEMORY_CACHE) ? false : true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5332a enumC5332a, EnumC5334c enumC5334c) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$d */
    class d extends AbstractC5360j {
        d() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: a */
        public boolean mo10298a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: b */
        public boolean mo10299b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: c */
        public boolean mo10300c(EnumC5332a enumC5332a) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5332a enumC5332a, EnumC5334c enumC5334c) {
            return (enumC5332a == EnumC5332a.RESOURCE_DISK_CACHE || enumC5332a == EnumC5332a.MEMORY_CACHE) ? false : true;
        }
    }

    /* compiled from: DiskCacheStrategy.java */
    /* renamed from: com.bumptech.glide.load.engine.j$e */
    class e extends AbstractC5360j {
        e() {
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: a */
        public boolean mo10298a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: b */
        public boolean mo10299b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: c */
        public boolean mo10300c(EnumC5332a enumC5332a) {
            return enumC5332a == EnumC5332a.REMOTE;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC5360j
        /* renamed from: d */
        public boolean mo10301d(boolean z, EnumC5332a enumC5332a, EnumC5334c enumC5334c) {
            return ((z && enumC5332a == EnumC5332a.DATA_DISK_CACHE) || enumC5332a == EnumC5332a.LOCAL) && enumC5334c == EnumC5334c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo10298a();

    /* renamed from: b */
    public abstract boolean mo10299b();

    /* renamed from: c */
    public abstract boolean mo10300c(EnumC5332a enumC5332a);

    /* renamed from: d */
    public abstract boolean mo10301d(boolean z, EnumC5332a enumC5332a, EnumC5334c enumC5334c);
}
