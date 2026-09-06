package com.bumptech.glide.load.engine.p123a0;

import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.p145r.C5560g;
import com.bumptech.glide.p145r.C5563j;
import com.bumptech.glide.p145r.C5564k;
import com.bumptech.glide.p145r.p146l.AbstractC5567c;
import com.bumptech.glide.p145r.p146l.C5565a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: SafeKeyGenerator.java */
/* renamed from: com.bumptech.glide.load.engine.a0.j */
/* loaded from: classes.dex */
public class C5348j {

    /* renamed from: a */
    private final C5560g<InterfaceC5390f, String> f13282a = new C5560g<>(1000);

    /* renamed from: b */
    private final InterfaceC0956f<b> f13283b = C5565a.m11068d(10, new a());

    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.j$a */
    class a implements C5565a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.p145r.p146l.C5565a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b mo10211a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* compiled from: SafeKeyGenerator.java */
    /* renamed from: com.bumptech.glide.load.engine.a0.j$b */
    private static final class b implements C5565a.f {

        /* renamed from: f */
        final MessageDigest f13285f;

        /* renamed from: g */
        private final AbstractC5567c f13286g = AbstractC5567c.m11078a();

        b(MessageDigest messageDigest) {
            this.f13285f = messageDigest;
        }

        @Override // com.bumptech.glide.p145r.p146l.C5565a.f
        /* renamed from: u */
        public AbstractC5567c mo10213u() {
            return this.f13286g;
        }
    }

    /* renamed from: a */
    private String m10209a(InterfaceC5390f interfaceC5390f) {
        b bVar = (b) C5563j.m11042d(this.f13283b.mo6061b());
        try {
            interfaceC5390f.updateDiskCacheKey(bVar.f13285f);
            return C5564k.m11064u(bVar.f13285f.digest());
        } finally {
            this.f13283b.mo6060a(bVar);
        }
    }

    /* renamed from: b */
    public String m10210b(InterfaceC5390f interfaceC5390f) {
        String m11031g;
        synchronized (this.f13282a) {
            m11031g = this.f13282a.m11031g(interfaceC5390f);
        }
        if (m11031g == null) {
            m11031g = m10209a(interfaceC5390f);
        }
        synchronized (this.f13282a) {
            this.f13282a.m11033k(interfaceC5390f, m11031g);
        }
        return m11031g;
    }
}
