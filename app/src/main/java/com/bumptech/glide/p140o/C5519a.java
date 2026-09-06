package com.bumptech.glide.p140o;

import com.bumptech.glide.load.InterfaceC5335d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderRegistry.java */
/* renamed from: com.bumptech.glide.o.a */
/* loaded from: classes.dex */
public class C5519a {

    /* renamed from: a */
    private final List<a<?>> f13892a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* renamed from: com.bumptech.glide.o.a$a */
    private static final class a<T> {

        /* renamed from: a */
        private final Class<T> f13893a;

        /* renamed from: b */
        final InterfaceC5335d<T> f13894b;

        a(Class<T> cls, InterfaceC5335d<T> interfaceC5335d) {
            this.f13893a = cls;
            this.f13894b = interfaceC5335d;
        }

        /* renamed from: a */
        boolean m10845a(Class<?> cls) {
            return this.f13893a.isAssignableFrom(cls);
        }
    }

    /* renamed from: a */
    public synchronized <T> void m10843a(Class<T> cls, InterfaceC5335d<T> interfaceC5335d) {
        this.f13892a.add(new a<>(cls, interfaceC5335d));
    }

    /* renamed from: b */
    public synchronized <T> InterfaceC5335d<T> m10844b(Class<T> cls) {
        for (a<?> aVar : this.f13892a) {
            if (aVar.m10845a(cls)) {
                return (InterfaceC5335d<T>) aVar.f13894b;
            }
        }
        return null;
    }
}
