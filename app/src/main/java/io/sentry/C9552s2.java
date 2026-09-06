package io.sentry;

import io.sentry.C9389d5;
import io.sentry.C9403f5;
import io.sentry.C9417h5;
import io.sentry.C9440i4;
import io.sentry.C9466k4;
import io.sentry.C9473l4;
import io.sentry.C9479m3;
import io.sentry.C9486n3;
import io.sentry.C9561t4;
import io.sentry.C9624v0;
import io.sentry.C9641w5;
import io.sentry.EnumC9460j5;
import io.sentry.EnumC9547r4;
import io.sentry.EnumC9554s4;
import io.sentry.clientreport.C9365b;
import io.sentry.profilemeasurements.C9503a;
import io.sentry.profilemeasurements.C9504b;
import io.sentry.protocol.C9506a;
import io.sentry.protocol.C9507a0;
import io.sentry.protocol.C9508b;
import io.sentry.protocol.C9509b0;
import io.sentry.protocol.C9510c;
import io.sentry.protocol.C9511c0;
import io.sentry.protocol.C9512d;
import io.sentry.protocol.C9513e;
import io.sentry.protocol.C9514f;
import io.sentry.protocol.C9515g;
import io.sentry.protocol.C9516h;
import io.sentry.protocol.C9517i;
import io.sentry.protocol.C9518j;
import io.sentry.protocol.C9519k;
import io.sentry.protocol.C9520l;
import io.sentry.protocol.C9522n;
import io.sentry.protocol.C9523o;
import io.sentry.protocol.C9524p;
import io.sentry.protocol.C9526r;
import io.sentry.protocol.C9527s;
import io.sentry.protocol.C9528t;
import io.sentry.protocol.C9529u;
import io.sentry.protocol.C9530v;
import io.sentry.protocol.C9531w;
import io.sentry.protocol.C9532x;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C9613q;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: JsonSerializer.java */
/* renamed from: io.sentry.s2 */
/* loaded from: classes2.dex */
public final class C9552s2 implements InterfaceC9340c2 {

    /* renamed from: a */
    private static final Charset f36822a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C9647x4 f36823b;

    /* renamed from: c */
    private final Map<Class<?>, InterfaceC9471l2<?>> f36824c;

    public C9552s2(C9647x4 c9647x4) {
        this.f36823b = c9647x4;
        HashMap hashMap = new HashMap();
        this.f36824c = hashMap;
        hashMap.put(C9506a.class, new C9506a.a());
        hashMap.put(C9624v0.class, new C9624v0.a());
        hashMap.put(C9508b.class, new C9508b.a());
        hashMap.put(C9510c.class, new C9510c.a());
        hashMap.put(DebugImage.class, new DebugImage.C9505a());
        hashMap.put(C9512d.class, new C9512d.a());
        hashMap.put(C9513e.class, new C9513e.a());
        hashMap.put(C9513e.b.class, new C9513e.b.a());
        hashMap.put(C9515g.class, new C9515g.a());
        hashMap.put(C9516h.class, new C9516h.a());
        hashMap.put(C9517i.class, new C9517i.a());
        hashMap.put(C9518j.class, new C9518j.a());
        hashMap.put(C9519k.class, new C9519k.a());
        hashMap.put(C9479m3.class, new C9479m3.b());
        hashMap.put(C9486n3.class, new C9486n3.a());
        hashMap.put(C9503a.class, new C9503a.a());
        hashMap.put(C9504b.class, new C9504b.a());
        hashMap.put(C9520l.class, new C9520l.a());
        hashMap.put(C9522n.class, new C9522n.a());
        hashMap.put(C9523o.class, new C9523o.a());
        hashMap.put(C9440i4.class, new C9440i4.a());
        hashMap.put(C9466k4.class, new C9466k4.a());
        hashMap.put(C9473l4.class, new C9473l4.a());
        hashMap.put(C9524p.class, new C9524p.a());
        hashMap.put(EnumC9547r4.class, new EnumC9547r4.a());
        hashMap.put(EnumC9554s4.class, new EnumC9554s4.a());
        hashMap.put(C9561t4.class, new C9561t4.a());
        hashMap.put(C9526r.class, new C9526r.a());
        hashMap.put(C9527s.class, new C9527s.a());
        hashMap.put(C9528t.class, new C9528t.a());
        hashMap.put(C9529u.class, new C9529u.a());
        hashMap.put(C9530v.class, new C9530v.a());
        hashMap.put(C9531w.class, new C9531w.a());
        hashMap.put(C9532x.class, new C9532x.a());
        hashMap.put(C9389d5.class, new C9389d5.a());
        hashMap.put(C9403f5.class, new C9403f5.a());
        hashMap.put(C9417h5.class, new C9417h5.a());
        hashMap.put(EnumC9460j5.class, new EnumC9460j5.a());
        hashMap.put(C9507a0.class, new C9507a0.a());
        hashMap.put(C9514f.class, new C9514f.a());
        hashMap.put(C9641w5.class, new C9641w5.a());
        hashMap.put(C9365b.class, new C9365b.a());
        hashMap.put(C9511c0.class, new C9511c0.a());
        hashMap.put(C9509b0.class, new C9509b0.a());
    }

    /* renamed from: g */
    private <T> boolean m31582g(Class<T> cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    /* renamed from: h */
    private String m31583h(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        C9499p2 c9499p2 = new C9499p2(stringWriter, this.f36823b.getMaxDepth());
        if (z) {
            c9499p2.m31166s("\t");
        }
        c9499p2.mo30824g(this.f36823b.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.InterfaceC9340c2
    /* renamed from: a */
    public <T> void mo30487a(T t, Writer writer) throws IOException {
        C9613q.m31802c(t, "The entity is required.");
        C9613q.m31802c(writer, "The Writer object is required.");
        InterfaceC9637w1 logger = this.f36823b.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        if (logger.mo30215d(enumC9554s4)) {
            this.f36823b.getLogger().mo30214c(enumC9554s4, "Serializing object: %s", m31583h(t, this.f36823b.isEnablePrettySerializationOutput()));
        }
        new C9499p2(writer, this.f36823b.getMaxDepth()).mo30824g(this.f36823b.getLogger(), t);
        writer.flush();
    }

    @Override // io.sentry.InterfaceC9340c2
    /* renamed from: b */
    public void mo30488b(C9416h4 c9416h4, OutputStream outputStream) throws Exception {
        C9613q.m31802c(c9416h4, "The SentryEnvelope object is required.");
        C9613q.m31802c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f36822a));
        try {
            c9416h4.m30831b().serialize(new C9499p2(bufferedWriter, this.f36823b.getMaxDepth()), this.f36823b.getLogger());
            bufferedWriter.write("\n");
            for (C9459j4 c9459j4 : c9416h4.m30832c()) {
                try {
                    byte[] m30909h = c9459j4.m30909h();
                    c9459j4.m30910i().serialize(new C9499p2(bufferedWriter, this.f36823b.getMaxDepth()), this.f36823b.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(m30909h);
                    bufferedWriter.write("\n");
                } catch (Exception e2) {
                    this.f36823b.getLogger().mo30213b(EnumC9554s4.ERROR, "Failed to create envelope item. Dropping it.", e2);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.InterfaceC9340c2
    /* renamed from: c */
    public <T> T mo30489c(Reader reader, Class<T> cls) {
        try {
            C9485n2 c9485n2 = new C9485n2(reader);
            try {
                InterfaceC9471l2<?> interfaceC9471l2 = this.f36824c.get(cls);
                if (interfaceC9471l2 != null) {
                    T cast = cls.cast(interfaceC9471l2.mo30683a(c9485n2, this.f36823b.getLogger()));
                    c9485n2.close();
                    return cast;
                }
                if (!m31582g(cls)) {
                    c9485n2.close();
                    return null;
                }
                T t = (T) c9485n2.m31088K0();
                c9485n2.close();
                return t;
            } catch (Throwable th) {
                try {
                    c9485n2.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e2) {
            this.f36823b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error when deserializing", e2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC9340c2
    /* renamed from: d */
    public C9416h4 mo30490d(InputStream inputStream) {
        C9613q.m31802c(inputStream, "The InputStream object is required.");
        try {
            return this.f36823b.getEnvelopeReader().mo30817a(inputStream);
        } catch (IOException e2) {
            this.f36823b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error deserializing envelope.", e2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC9340c2
    /* renamed from: e */
    public <T, R> T mo30491e(Reader reader, Class<T> cls, InterfaceC9471l2<R> interfaceC9471l2) {
        try {
            C9485n2 c9485n2 = new C9485n2(reader);
            try {
                if (!Collection.class.isAssignableFrom(cls)) {
                    T t = (T) c9485n2.m31088K0();
                    c9485n2.close();
                    return t;
                }
                if (interfaceC9471l2 == null) {
                    T t2 = (T) c9485n2.m31088K0();
                    c9485n2.close();
                    return t2;
                }
                T t3 = (T) c9485n2.m31085F0(this.f36823b.getLogger(), interfaceC9471l2);
                c9485n2.close();
                return t3;
            } catch (Throwable th) {
                try {
                    c9485n2.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            this.f36823b.getLogger().mo30213b(EnumC9554s4.ERROR, "Error when deserializing", th2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC9340c2
    /* renamed from: f */
    public String mo30492f(Map<String, Object> map) throws Exception {
        return m31583h(map, false);
    }
}
