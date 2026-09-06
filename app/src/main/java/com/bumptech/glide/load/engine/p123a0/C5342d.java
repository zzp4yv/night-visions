package com.bumptech.glide.load.engine.p123a0;

import com.bumptech.glide.load.engine.p123a0.InterfaceC5339a;
import java.io.File;

/* compiled from: DiskLruCacheFactory.java */
/* renamed from: com.bumptech.glide.load.engine.a0.d */
/* loaded from: classes.dex */
public class C5342d implements InterfaceC5339a.a {

    /* renamed from: a */
    private final long f13258a;

    /* renamed from: b */
    private final a f13259b;

    /* compiled from: DiskLruCacheFactory.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.d$a */
    public interface a {
        /* renamed from: a */
        File mo10187a();
    }

    public C5342d(a aVar, long j2) {
        this.f13258a = j2;
        this.f13259b = aVar;
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5339a.a
    /* renamed from: c */
    public InterfaceC5339a mo10181c() {
        File mo10187a = this.f13259b.mo10187a();
        if (mo10187a == null) {
            return null;
        }
        if (mo10187a.mkdirs() || (mo10187a.exists() && mo10187a.isDirectory())) {
            return C5343e.m10188c(mo10187a, this.f13258a);
        }
        return null;
    }
}
