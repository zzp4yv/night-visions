package com.bumptech.glide.load.p127m;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: FileDescriptorAssetPathFetcher.java */
/* renamed from: com.bumptech.glide.load.m.h */
/* loaded from: classes.dex */
public class C5404h extends AbstractC5398b<ParcelFileDescriptor> {
    public C5404h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo10455a() {
        return ParcelFileDescriptor.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5398b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo10461c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5398b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo10464f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
