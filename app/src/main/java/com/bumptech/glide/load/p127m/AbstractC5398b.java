package com.bumptech.glide.load.p127m;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import java.io.IOException;

/* compiled from: AssetPathFetcher.java */
/* renamed from: com.bumptech.glide.load.m.b */
/* loaded from: classes.dex */
public abstract class AbstractC5398b<T> implements InterfaceC5400d<T> {

    /* renamed from: f */
    private final String f13563f;

    /* renamed from: g */
    private final AssetManager f13564g;

    /* renamed from: h */
    private T f13565h;

    public AbstractC5398b(AssetManager assetManager, String str) {
        this.f13564g = assetManager;
        this.f13563f = str;
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: b */
    public void mo10460b() {
        T t = this.f13565h;
        if (t == null) {
            return;
        }
        try {
            mo10461c(t);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    protected abstract void mo10461c(T t) throws IOException;

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
    public void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super T> aVar) {
        try {
            T mo10464f = mo10464f(this.f13564g, this.f13563f);
            this.f13565h = mo10464f;
            aVar.mo10228f(mo10464f);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.mo10227c(e2);
        }
    }

    /* renamed from: f */
    protected abstract T mo10464f(AssetManager assetManager, String str) throws IOException;
}
