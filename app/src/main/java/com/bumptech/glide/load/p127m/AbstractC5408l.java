package com.bumptech.glide.load.p127m;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher.java */
/* renamed from: com.bumptech.glide.load.m.l */
/* loaded from: classes.dex */
public abstract class AbstractC5408l<T> implements InterfaceC5400d<T> {

    /* renamed from: f */
    private final Uri f13587f;

    /* renamed from: g */
    private final ContentResolver f13588g;

    /* renamed from: h */
    private T f13589h;

    public AbstractC5408l(ContentResolver contentResolver, Uri uri) {
        this.f13588g = contentResolver;
        this.f13587f = uri;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: b */
    public void mo10460b() {
        T t = this.f13589h;
        if (t != null) {
            try {
                mo10456c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    protected abstract void mo10456c(T t) throws IOException;

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
    public final void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super T> aVar) {
        try {
            T mo10457f = mo10457f(this.f13587f, this.f13588g);
            this.f13589h = mo10457f;
            aVar.mo10228f(mo10457f);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.mo10227c(e2);
        }
    }

    /* renamed from: f */
    protected abstract T mo10457f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
