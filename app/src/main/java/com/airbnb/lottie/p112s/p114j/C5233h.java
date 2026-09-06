package com.airbnb.lottie.p112s.p114j;

import com.airbnb.lottie.C5154c;
import com.airbnb.lottie.C5157f;
import com.airbnb.lottie.p108q.p109a.C5178k;
import com.airbnb.lottie.p108q.p109a.InterfaceC5169b;
import com.airbnb.lottie.p112s.p115k.AbstractC5243a;

/* compiled from: MergePaths.java */
/* renamed from: com.airbnb.lottie.s.j.h */
/* loaded from: classes.dex */
public class C5233h implements InterfaceC5227b {

    /* renamed from: a */
    private final String f12730a;

    /* renamed from: b */
    private final a f12731b;

    /* compiled from: MergePaths.java */
    /* renamed from: com.airbnb.lottie.s.j.h$a */
    public enum a {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        /* renamed from: g */
        public static a m9660g(int i2) {
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? Merge : ExcludeIntersections : Intersect : Subtract : Add : Merge;
        }
    }

    public C5233h(String str, a aVar) {
        this.f12730a = str;
        this.f12731b = aVar;
    }

    @Override // com.airbnb.lottie.p112s.p114j.InterfaceC5227b
    /* renamed from: a */
    public InterfaceC5169b mo9619a(C5157f c5157f, AbstractC5243a abstractC5243a) {
        if (c5157f.m9466h()) {
            return new C5178k(this);
        }
        C5154c.m9394d("Animation contains merge paths but they are disabled.");
        return null;
    }

    /* renamed from: b */
    public a m9658b() {
        return this.f12731b;
    }

    /* renamed from: c */
    public String m9659c() {
        return this.f12730a;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f12731b + '}';
    }
}
