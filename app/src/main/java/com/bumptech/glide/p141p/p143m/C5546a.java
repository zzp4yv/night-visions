package com.bumptech.glide.p141p.p143m;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.EnumC5332a;

/* compiled from: DrawableCrossFadeFactory.java */
/* renamed from: com.bumptech.glide.p.m.a */
/* loaded from: classes.dex */
public class C5546a implements InterfaceC5550e<Drawable> {

    /* renamed from: a */
    private final int f14010a;

    /* renamed from: b */
    private final boolean f14011b;

    /* renamed from: c */
    private C5547b f14012c;

    /* compiled from: DrawableCrossFadeFactory.java */
    /* renamed from: com.bumptech.glide.p.m.a$a */
    public static class a {

        /* renamed from: a */
        private final int f14013a;

        /* renamed from: b */
        private boolean f14014b;

        public a() {
            this(300);
        }

        /* renamed from: a */
        public C5546a m11004a() {
            return new C5546a(this.f14013a, this.f14014b);
        }

        public a(int i2) {
            this.f14013a = i2;
        }
    }

    protected C5546a(int i2, boolean z) {
        this.f14010a = i2;
        this.f14011b = z;
    }

    /* renamed from: b */
    private InterfaceC5549d<Drawable> m11002b() {
        if (this.f14012c == null) {
            this.f14012c = new C5547b(this.f14010a, this.f14011b);
        }
        return this.f14012c;
    }

    @Override // com.bumptech.glide.p141p.p143m.InterfaceC5550e
    /* renamed from: a */
    public InterfaceC5549d<Drawable> mo11003a(EnumC5332a enumC5332a, boolean z) {
        return enumC5332a == EnumC5332a.MEMORY_CACHE ? C5548c.m11007b() : m11002b();
    }
}
