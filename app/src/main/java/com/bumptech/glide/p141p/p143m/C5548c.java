package com.bumptech.glide.p141p.p143m;

import com.bumptech.glide.load.EnumC5332a;
import com.bumptech.glide.p141p.p143m.InterfaceC5549d;

/* compiled from: NoTransition.java */
/* renamed from: com.bumptech.glide.p.m.c */
/* loaded from: classes.dex */
public class C5548c<R> implements InterfaceC5549d<R> {

    /* renamed from: a */
    static final C5548c<?> f14017a = new C5548c<>();

    /* renamed from: b */
    private static final InterfaceC5550e<?> f14018b = new a();

    /* compiled from: NoTransition.java */
    /* renamed from: com.bumptech.glide.p.m.c$a */
    public static class a<R> implements InterfaceC5550e<R> {
        @Override // com.bumptech.glide.p141p.p143m.InterfaceC5550e
        /* renamed from: a */
        public InterfaceC5549d<R> mo11003a(EnumC5332a enumC5332a, boolean z) {
            return C5548c.f14017a;
        }
    }

    /* renamed from: b */
    public static <R> InterfaceC5549d<R> m11007b() {
        return f14017a;
    }

    /* renamed from: c */
    public static <R> InterfaceC5550e<R> m11008c() {
        return (InterfaceC5550e<R>) f14018b;
    }

    @Override // com.bumptech.glide.p141p.p143m.InterfaceC5549d
    /* renamed from: a */
    public boolean mo11005a(Object obj, InterfaceC5549d.a aVar) {
        return false;
    }
}
