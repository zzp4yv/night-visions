package com.google.firebase.encoders.json;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.InterfaceC8292a;
import com.google.firebase.encoders.InterfaceC8294c;
import com.google.firebase.encoders.InterfaceC8295d;
import com.google.firebase.encoders.InterfaceC8296e;
import com.google.firebase.encoders.InterfaceC8297f;
import com.google.firebase.encoders.p192g.InterfaceC8298a;
import com.google.firebase.encoders.p192g.InterfaceC8299b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: JsonDataEncoderBuilder.java */
/* renamed from: com.google.firebase.encoders.h.d */
/* loaded from: classes2.dex */
public final class C8303d implements InterfaceC8299b<C8303d> {

    /* renamed from: a */
    private static final InterfaceC8294c<Object> f31650a = new InterfaceC8294c() { // from class: com.google.firebase.encoders.h.a
        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: a */
        public final void mo13444a(Object obj, Object obj2) {
            C8303d.m26097i(obj, (InterfaceC8295d) obj2);
            throw null;
        }
    };

    /* renamed from: b */
    private static final InterfaceC8296e<String> f31651b = new InterfaceC8296e() { // from class: com.google.firebase.encoders.h.b
        @Override // com.google.firebase.encoders.InterfaceC8296e
        /* renamed from: a */
        public final void mo26089a(Object obj, Object obj2) {
            ((InterfaceC8297f) obj2).mo26090f((String) obj);
        }
    };

    /* renamed from: c */
    private static final InterfaceC8296e<Boolean> f31652c = new InterfaceC8296e() { // from class: com.google.firebase.encoders.h.c
        @Override // com.google.firebase.encoders.InterfaceC8296e
        /* renamed from: a */
        public final void mo26089a(Object obj, Object obj2) {
            ((InterfaceC8297f) obj2).mo26091g(((Boolean) obj).booleanValue());
        }
    };

    /* renamed from: d */
    private static final b f31653d = new b(null);

    /* renamed from: e */
    private final Map<Class<?>, InterfaceC8294c<?>> f31654e = new HashMap();

    /* renamed from: f */
    private final Map<Class<?>, InterfaceC8296e<?>> f31655f = new HashMap();

    /* renamed from: g */
    private InterfaceC8294c<Object> f31656g = f31650a;

    /* renamed from: h */
    private boolean f31657h = false;

    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: com.google.firebase.encoders.h.d$a */
    class a implements InterfaceC8292a {
        a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8292a
        /* renamed from: a */
        public void mo26074a(Object obj, Writer writer) throws IOException {
            C8304e c8304e = new C8304e(writer, C8303d.this.f31654e, C8303d.this.f31655f, C8303d.this.f31656g, C8303d.this.f31657h);
            c8304e.m26113m(obj, false);
            c8304e.m26122w();
        }

        @Override // com.google.firebase.encoders.InterfaceC8292a
        /* renamed from: b */
        public String mo26075b(Object obj) {
            StringWriter stringWriter = new StringWriter();
            try {
                mo26074a(obj, stringWriter);
            } catch (IOException unused) {
            }
            return stringWriter.toString();
        }
    }

    /* compiled from: JsonDataEncoderBuilder.java */
    /* renamed from: com.google.firebase.encoders.h.d$b */
    private static final class b implements InterfaceC8296e<Date> {

        /* renamed from: a */
        private static final DateFormat f31659a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f31659a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8296e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo26089a(Date date, InterfaceC8297f interfaceC8297f) throws IOException {
            interfaceC8297f.mo26090f(f31659a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C8303d() {
        m26104m(String.class, f31651b);
        m26104m(Boolean.class, f31652c);
        m26104m(Date.class, f31653d);
    }

    /* renamed from: i */
    static /* synthetic */ void m26097i(Object obj, InterfaceC8295d interfaceC8295d) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: f */
    public InterfaceC8292a m26100f() {
        return new a();
    }

    /* renamed from: g */
    public C8303d m26101g(InterfaceC8298a interfaceC8298a) {
        interfaceC8298a.mo13443a(this);
        return this;
    }

    /* renamed from: h */
    public C8303d m26102h(boolean z) {
        this.f31657h = z;
        return this;
    }

    @Override // com.google.firebase.encoders.p192g.InterfaceC8299b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public <T> C8303d mo26092a(Class<T> cls, InterfaceC8294c<? super T> interfaceC8294c) {
        this.f31654e.put(cls, interfaceC8294c);
        this.f31655f.remove(cls);
        return this;
    }

    /* renamed from: m */
    public <T> C8303d m26104m(Class<T> cls, InterfaceC8296e<? super T> interfaceC8296e) {
        this.f31655f.put(cls, interfaceC8296e);
        this.f31654e.remove(cls);
        return this;
    }
}
