package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5335d;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5339a;
import java.io.File;

/* compiled from: DataCacheWriter.java */
/* renamed from: com.bumptech.glide.load.engine.e */
/* loaded from: classes.dex */
class C5355e<DataType> implements InterfaceC5339a.b {

    /* renamed from: a */
    private final InterfaceC5335d<DataType> f13315a;

    /* renamed from: b */
    private final DataType f13316b;

    /* renamed from: c */
    private final C5393i f13317c;

    C5355e(InterfaceC5335d<DataType> interfaceC5335d, DataType datatype, C5393i c5393i) {
        this.f13315a = interfaceC5335d;
        this.f13316b = datatype;
        this.f13317c = c5393i;
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5339a.b
    /* renamed from: a */
    public boolean mo10182a(File file) {
        return this.f13315a.mo10155a(this.f13316b, file, this.f13317c);
    }
}
