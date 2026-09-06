package com.google.firebase.encoders.p194i;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8294c;
import com.google.firebase.encoders.InterfaceC8295d;
import com.google.firebase.encoders.InterfaceC8296e;
import com.google.firebase.encoders.p192g.InterfaceC8298a;
import com.google.firebase.encoders.p192g.InterfaceC8299b;
import com.google.firebase.encoders.p194i.C8313h;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ProtobufEncoder.java */
/* renamed from: com.google.firebase.encoders.i.h */
/* loaded from: classes2.dex */
public class C8313h {

    /* renamed from: a */
    private final Map<Class<?>, InterfaceC8294c<?>> f31688a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC8296e<?>> f31689b;

    /* renamed from: c */
    private final InterfaceC8294c<Object> f31690c;

    /* compiled from: ProtobufEncoder.java */
    /* renamed from: com.google.firebase.encoders.i.h$a */
    public static final class a implements InterfaceC8299b<a> {

        /* renamed from: a */
        private static final InterfaceC8294c<Object> f31691a = new InterfaceC8294c() { // from class: com.google.firebase.encoders.i.b
            @Override // com.google.firebase.encoders.InterfaceC8294c
            /* renamed from: a */
            public final void mo13444a(Object obj, Object obj2) {
                C8313h.a.m26152d(obj, (InterfaceC8295d) obj2);
                throw null;
            }
        };

        /* renamed from: b */
        private final Map<Class<?>, InterfaceC8294c<?>> f31692b = new HashMap();

        /* renamed from: c */
        private final Map<Class<?>, InterfaceC8296e<?>> f31693c = new HashMap();

        /* renamed from: d */
        private InterfaceC8294c<Object> f31694d = f31691a;

        /* renamed from: d */
        static /* synthetic */ void m26152d(Object obj, InterfaceC8295d interfaceC8295d) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        /* renamed from: b */
        public C8313h m26153b() {
            return new C8313h(new HashMap(this.f31692b), new HashMap(this.f31693c), this.f31694d);
        }

        /* renamed from: c */
        public a m26154c(InterfaceC8298a interfaceC8298a) {
            interfaceC8298a.mo13443a(this);
            return this;
        }

        @Override // com.google.firebase.encoders.p192g.InterfaceC8299b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public <U> a mo26092a(Class<U> cls, InterfaceC8294c<? super U> interfaceC8294c) {
            this.f31692b.put(cls, interfaceC8294c);
            this.f31693c.remove(cls);
            return this;
        }
    }

    C8313h(Map<Class<?>, InterfaceC8294c<?>> map, Map<Class<?>, InterfaceC8296e<?>> map2, InterfaceC8294c<Object> interfaceC8294c) {
        this.f31688a = map;
        this.f31689b = map2;
        this.f31690c = interfaceC8294c;
    }

    /* renamed from: a */
    public static a m26149a() {
        return new a();
    }

    /* renamed from: b */
    public void m26150b(Object obj, OutputStream outputStream) throws IOException {
        new C8312g(outputStream, this.f31688a, this.f31689b, this.f31690c).m26148u(obj);
    }

    /* renamed from: c */
    public byte[] m26151c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m26150b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
