package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.InterfaceC5335d;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.InterfaceC5395k;
import com.bumptech.glide.load.engine.C5359i;
import com.bumptech.glide.load.engine.C5369s;
import com.bumptech.glide.load.engine.InterfaceC5371u;
import com.bumptech.glide.load.p127m.C5402f;
import com.bumptech.glide.load.p127m.InterfaceC5401e;
import com.bumptech.glide.load.p129n.C5431p;
import com.bumptech.glide.load.p129n.InterfaceC5429n;
import com.bumptech.glide.load.p129n.InterfaceC5430o;
import com.bumptech.glide.load.p131o.p137h.C5497f;
import com.bumptech.glide.load.p131o.p137h.InterfaceC5496e;
import com.bumptech.glide.p140o.C5519a;
import com.bumptech.glide.p140o.C5520b;
import com.bumptech.glide.p140o.C5521c;
import com.bumptech.glide.p140o.C5522d;
import com.bumptech.glide.p140o.C5523e;
import com.bumptech.glide.p140o.C5524f;
import com.bumptech.glide.p145r.p146l.C5565a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p024c.p052i.p059j.InterfaceC0956f;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: a */
    private final C5431p f13031a;

    /* renamed from: b */
    private final C5519a f13032b;

    /* renamed from: c */
    private final C5523e f13033c;

    /* renamed from: d */
    private final C5524f f13034d;

    /* renamed from: e */
    private final C5402f f13035e;

    /* renamed from: f */
    private final C5497f f13036f;

    /* renamed from: g */
    private final C5520b f13037g;

    /* renamed from: h */
    private final C5522d f13038h = new C5522d();

    /* renamed from: i */
    private final C5521c f13039i = new C5521c();

    /* renamed from: j */
    private final InterfaceC0956f<List<Throwable>> f13040j;

    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Object obj) {
            super("Failed to find any ModelLoaders for model: " + obj);
        }

        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        InterfaceC0956f<List<Throwable>> m11069e = C5565a.m11069e();
        this.f13040j = m11069e;
        this.f13031a = new C5431p(m11069e);
        this.f13032b = new C5519a();
        this.f13033c = new C5523e();
        this.f13034d = new C5524f();
        this.f13035e = new C5402f();
        this.f13036f = new C5497f();
        this.f13037g = new C5520b();
        m9968r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    /* renamed from: f */
    private <Data, TResource, Transcode> List<C5359i<Data, TResource, Transcode>> m9951f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f13033c.m10857d(cls, cls2)) {
            for (Class cls5 : this.f13036f.m10779b(cls4, cls3)) {
                arrayList.add(new C5359i(cls, cls4, cls5, this.f13033c.m10856b(cls, cls4), this.f13036f.m10778a(cls4, cls5), this.f13040j));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public <Data> Registry m9952a(Class<Data> cls, InterfaceC5335d<Data> interfaceC5335d) {
        this.f13032b.m10843a(cls, interfaceC5335d);
        return this;
    }

    /* renamed from: b */
    public <TResource> Registry m9953b(Class<TResource> cls, InterfaceC5395k<TResource> interfaceC5395k) {
        this.f13034d.m10860a(cls, interfaceC5395k);
        return this;
    }

    /* renamed from: c */
    public <Data, TResource> Registry m9954c(Class<Data> cls, Class<TResource> cls2, InterfaceC5394j<Data, TResource> interfaceC5394j) {
        m9956e("legacy_append", cls, cls2, interfaceC5394j);
        return this;
    }

    /* renamed from: d */
    public <Model, Data> Registry m9955d(Class<Model> cls, Class<Data> cls2, InterfaceC5430o<Model, Data> interfaceC5430o) {
        this.f13031a.m10560a(cls, cls2, interfaceC5430o);
        return this;
    }

    /* renamed from: e */
    public <Data, TResource> Registry m9956e(String str, Class<Data> cls, Class<TResource> cls2, InterfaceC5394j<Data, TResource> interfaceC5394j) {
        this.f13033c.m10855a(str, interfaceC5394j, cls, cls2);
        return this;
    }

    /* renamed from: g */
    public List<ImageHeaderParser> m9957g() {
        List<ImageHeaderParser> m10847b = this.f13037g.m10847b();
        if (m10847b.isEmpty()) {
            throw new NoImageHeaderParserException();
        }
        return m10847b;
    }

    /* renamed from: h */
    public <Data, TResource, Transcode> C5369s<Data, TResource, Transcode> m9958h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        C5369s<Data, TResource, Transcode> m10849a = this.f13039i.m10849a(cls, cls2, cls3);
        if (this.f13039i.m10850c(m10849a)) {
            return null;
        }
        if (m10849a == null) {
            List<C5359i<Data, TResource, Transcode>> m9951f = m9951f(cls, cls2, cls3);
            m10849a = m9951f.isEmpty() ? null : new C5369s<>(cls, cls2, cls3, m9951f, this.f13040j);
            this.f13039i.m10851d(cls, cls2, cls3, m10849a);
        }
        return m10849a;
    }

    /* renamed from: i */
    public <Model> List<InterfaceC5429n<Model, ?>> m9959i(Model model) {
        List<InterfaceC5429n<Model, ?>> m10562d = this.f13031a.m10562d(model);
        if (m10562d.isEmpty()) {
            throw new NoModelLoaderAvailableException(model);
        }
        return m10562d;
    }

    /* renamed from: j */
    public <Model, TResource, Transcode> List<Class<?>> m9960j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> m10852a = this.f13038h.m10852a(cls, cls2, cls3);
        if (m10852a == null) {
            m10852a = new ArrayList<>();
            Iterator<Class<?>> it = this.f13031a.m10561c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f13033c.m10857d(it.next(), cls2)) {
                    if (!this.f13036f.m10779b(cls4, cls3).isEmpty() && !m10852a.contains(cls4)) {
                        m10852a.add(cls4);
                    }
                }
            }
            this.f13038h.m10853b(cls, cls2, cls3, Collections.unmodifiableList(m10852a));
        }
        return m10852a;
    }

    /* renamed from: k */
    public <X> InterfaceC5395k<X> m9961k(InterfaceC5371u<X> interfaceC5371u) throws NoResultEncoderAvailableException {
        InterfaceC5395k<X> m10861b = this.f13034d.m10861b(interfaceC5371u.mo10342e());
        if (m10861b != null) {
            return m10861b;
        }
        throw new NoResultEncoderAvailableException(interfaceC5371u.mo10342e());
    }

    /* renamed from: l */
    public <X> InterfaceC5401e<X> m9962l(X x) {
        return this.f13035e.m10472a(x);
    }

    /* renamed from: m */
    public <X> InterfaceC5335d<X> m9963m(X x) throws NoSourceEncoderAvailableException {
        InterfaceC5335d<X> m10844b = this.f13032b.m10844b(x.getClass());
        if (m10844b != null) {
            return m10844b;
        }
        throw new NoSourceEncoderAvailableException(x.getClass());
    }

    /* renamed from: n */
    public boolean m9964n(InterfaceC5371u<?> interfaceC5371u) {
        return this.f13034d.m10861b(interfaceC5371u.mo10342e()) != null;
    }

    /* renamed from: o */
    public Registry m9965o(ImageHeaderParser imageHeaderParser) {
        this.f13037g.m10846a(imageHeaderParser);
        return this;
    }

    /* renamed from: p */
    public Registry m9966p(InterfaceC5401e.a<?> aVar) {
        this.f13035e.m10473b(aVar);
        return this;
    }

    /* renamed from: q */
    public <TResource, Transcode> Registry m9967q(Class<TResource> cls, Class<Transcode> cls2, InterfaceC5496e<TResource, Transcode> interfaceC5496e) {
        this.f13036f.m10780c(cls, cls2, interfaceC5496e);
        return this;
    }

    /* renamed from: r */
    public final Registry m9968r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f13033c.m10858e(arrayList);
        return this;
    }
}
