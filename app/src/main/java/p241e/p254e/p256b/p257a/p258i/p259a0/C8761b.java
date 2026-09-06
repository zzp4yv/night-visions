package p241e.p254e.p256b.p257a.p258i.p259a0;

/* compiled from: Retries.java */
/* renamed from: e.e.b.a.i.a0.b */
/* loaded from: classes2.dex */
public final class C8761b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m27950a(int i2, TInput tinput, InterfaceC8760a<TInput, TResult, TException> interfaceC8760a, InterfaceC8762c<TInput, TResult> interfaceC8762c) throws Throwable {
        TResult mo13396a;
        if (i2 < 1) {
            return interfaceC8760a.mo13396a(tinput);
        }
        do {
            mo13396a = interfaceC8760a.mo13396a(tinput);
            tinput = interfaceC8762c.mo13395a(tinput, mo13396a);
            if (tinput == null) {
                break;
            }
            i2--;
        } while (i2 >= 1);
        return mo13396a;
    }
}
