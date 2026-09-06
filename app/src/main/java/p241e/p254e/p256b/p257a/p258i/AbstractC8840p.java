package p241e.p254e.p256b.p257a.p258i;

import com.google.auto.value.AutoValue;
import p241e.p254e.p256b.p257a.AbstractC8753c;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.InterfaceC8755e;
import p241e.p254e.p256b.p257a.p258i.C8827d;

/* compiled from: SendRequest.java */
@AutoValue
/* renamed from: e.e.b.a.i.p */
/* loaded from: classes2.dex */
abstract class AbstractC8840p {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    /* renamed from: e.e.b.a.i.p$a */
    public static abstract class a {
        /* renamed from: a */
        public abstract AbstractC8840p mo28126a();

        /* renamed from: b */
        abstract a mo28127b(C8752b c8752b);

        /* renamed from: c */
        abstract a mo28128c(AbstractC8753c<?> abstractC8753c);

        /* renamed from: d */
        abstract a mo28129d(InterfaceC8755e<?, byte[]> interfaceC8755e);

        /* renamed from: e */
        public abstract a mo28130e(AbstractC8841q abstractC8841q);

        /* renamed from: f */
        public abstract a mo28131f(String str);
    }

    AbstractC8840p() {
    }

    /* renamed from: a */
    public static a m28167a() {
        return new C8827d.b();
    }

    /* renamed from: b */
    public abstract C8752b mo28121b();

    /* renamed from: c */
    abstract AbstractC8753c<?> mo28122c();

    /* renamed from: d */
    public byte[] m28168d() {
        return mo28123e().mo26009a(mo28122c().mo27943b());
    }

    /* renamed from: e */
    abstract InterfaceC8755e<?, byte[]> mo28123e();

    /* renamed from: f */
    public abstract AbstractC8841q mo28124f();

    /* renamed from: g */
    public abstract String mo28125g();
}
