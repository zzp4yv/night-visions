package com.bumptech.glide.load.p129n;

import com.bumptech.glide.EnumC5320g;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.load.p127m.InterfaceC5400d;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.p144q.C5553c;

/* compiled from: UnitModelLoader.java */
/* renamed from: com.bumptech.glide.load.n.v */
/* loaded from: classes.dex */
public class C5437v<Model> implements InterfaceC5429n<Model, Model> {

    /* renamed from: a */
    private static final C5437v<?> f13687a = new C5437v<>();

    /* compiled from: UnitModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.v$a */
    public static class a<Model> implements InterfaceC5430o<Model, Model> {

        /* renamed from: a */
        private static final a<?> f13688a = new a<>();

        @Deprecated
        public a() {
        }

        /* renamed from: a */
        public static <T> a<T> m10586a() {
            return (a<T>) f13688a;
        }

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<Model, Model> mo10513b(C5433r c5433r) {
            return C5437v.m10585c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.v$b */
    private static class b<Model> implements InterfaceC5400d<Model> {

        /* renamed from: f */
        private final Model f13689f;

        b(Model model) {
            this.f13689f = model;
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: a */
        public Class<Model> mo10455a() {
            return (Class<Model>) this.f13689f.getClass();
        }

        @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
        /* renamed from: b */
        public void mo10460b() {
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
        public void mo10463e(EnumC5320g enumC5320g, InterfaceC5400d.a<? super Model> aVar) {
            aVar.mo10228f(this.f13689f);
        }
    }

    @Deprecated
    public C5437v() {
    }

    /* renamed from: c */
    public static <T> C5437v<T> m10585c() {
        return (C5437v<T>) f13687a;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: a */
    public boolean mo10508a(Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: b */
    public InterfaceC5429n.a<Model> mo10509b(Model model, int i2, int i3, C5393i c5393i) {
        return new InterfaceC5429n.a<>(new C5553c(model), new b(model));
    }
}
