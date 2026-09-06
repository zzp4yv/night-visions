package com.bumptech.glide.load.p129n;

import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.p145r.C5563j;
import java.util.Collections;
import java.util.List;

/* compiled from: ModelLoader.java */
/* renamed from: com.bumptech.glide.load.n.n */
/* loaded from: classes.dex */
public interface InterfaceC5429n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.n$a */
    public static class a<Data> {

        /* renamed from: a */
        public final InterfaceC5390f f13654a;

        /* renamed from: b */
        public final List<InterfaceC5390f> f13655b;

        /* renamed from: c */
        public final InterfaceC5400d<Data> f13656c;

        public a(InterfaceC5390f interfaceC5390f, InterfaceC5400d<Data> interfaceC5400d) {
            this(interfaceC5390f, Collections.emptyList(), interfaceC5400d);
        }

        public a(InterfaceC5390f interfaceC5390f, List<InterfaceC5390f> list, InterfaceC5400d<Data> interfaceC5400d) {
            this.f13654a = (InterfaceC5390f) C5563j.m11042d(interfaceC5390f);
            this.f13655b = (List) C5563j.m11042d(list);
            this.f13656c = (InterfaceC5400d) C5563j.m11042d(interfaceC5400d);
        }
    }

    /* renamed from: a */
    boolean mo10508a(Model model);

    /* renamed from: b */
    a<Data> mo10509b(Model model, int i2, int i3, C5393i c5393i);
}
