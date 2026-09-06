package com.bumptech.glide.load.p129n.p130y;

import com.bumptech.glide.load.C5392h;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.p127m.C5406j;
import com.bumptech.glide.load.p129n.C5422g;
import com.bumptech.glide.load.p129n.C5428m;
import com.bumptech.glide.load.p129n.C5433r;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.load.p129n.InterfaceC5430o;
import java.io.InputStream;

/* compiled from: HttpGlideUrlLoader.java */
/* renamed from: com.bumptech.glide.load.n.y.a */
/* loaded from: classes.dex */
public class C5440a implements InterfaceC5429n<C5422g, InputStream> {

    /* renamed from: a */
    public static final C5392h<Integer> f13697a = C5392h.m10444f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: b */
    private final C5428m<C5422g, C5422g> f13698b;

    /* compiled from: HttpGlideUrlLoader.java */
    /* renamed from: com.bumptech.glide.load.n.y.a$a */
    public static class a implements InterfaceC5430o<C5422g, InputStream> {

        /* renamed from: a */
        private final C5428m<C5422g, C5422g> f13699a = new C5428m<>(500);

        @Override // com.bumptech.glide.load.p129n.InterfaceC5430o
        /* renamed from: b */
        public InterfaceC5429n<C5422g, InputStream> mo10513b(C5433r c5433r) {
            return new C5440a(this.f13699a);
        }
    }

    public C5440a(C5428m<C5422g, C5422g> c5428m) {
        this.f13698b = c5428m;
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC5429n.a<InputStream> mo10509b(C5422g c5422g, int i2, int i3, C5393i c5393i) {
        C5428m<C5422g, C5422g> c5428m = this.f13698b;
        if (c5428m != null) {
            C5422g m10552a = c5428m.m10552a(c5422g, 0, 0);
            if (m10552a == null) {
                this.f13698b.m10553b(c5422g, 0, 0, c5422g);
            } else {
                c5422g = m10552a;
            }
        }
        return new InterfaceC5429n.a<>(c5422g, new C5406j(c5422g, ((Integer) c5393i.m10449a(f13697a)).intValue()));
    }

    @Override // com.bumptech.glide.load.p129n.InterfaceC5429n
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo10508a(C5422g c5422g) {
        return true;
    }
}
