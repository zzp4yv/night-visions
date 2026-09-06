package com.bumptech.glide.load.engine.p123a0;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5346h;
import com.bumptech.glide.p145r.C5560g;

/* compiled from: LruResourceCache.java */
/* renamed from: com.bumptech.glide.load.engine.a0.g */
/* loaded from: classes.dex */
public class C5345g extends C5560g<InterfaceC5390f, InterfaceC5371u<?>> implements InterfaceC5346h {

    /* renamed from: e */
    private InterfaceC5346h.a f13267e;

    public C5345g(long j2) {
        super(j2);
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5346h
    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo10190a(int i2) {
        if (i2 >= 40) {
            m11030b();
        } else if (i2 >= 20 || i2 == 15) {
            m11035m(m11032h() / 2);
        }
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5346h
    /* renamed from: c */
    public /* bridge */ /* synthetic */ InterfaceC5371u mo10191c(InterfaceC5390f interfaceC5390f, InterfaceC5371u interfaceC5371u) {
        return (InterfaceC5371u) super.m11033k(interfaceC5390f, interfaceC5371u);
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5346h
    /* renamed from: d */
    public /* bridge */ /* synthetic */ InterfaceC5371u mo10192d(InterfaceC5390f interfaceC5390f) {
        return (InterfaceC5371u) super.m11034l(interfaceC5390f);
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5346h
    /* renamed from: e */
    public void mo10193e(InterfaceC5346h.a aVar) {
        this.f13267e = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.p145r.C5560g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo10194i(InterfaceC5371u<?> interfaceC5371u) {
        return interfaceC5371u == null ? super.mo10194i(null) : interfaceC5371u.mo10341d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.p145r.C5560g
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo10195j(InterfaceC5390f interfaceC5390f, InterfaceC5371u<?> interfaceC5371u) {
        InterfaceC5346h.a aVar = this.f13267e;
        if (aVar == null || interfaceC5371u == null) {
            return;
        }
        aVar.mo10199a(interfaceC5371u);
    }
}
