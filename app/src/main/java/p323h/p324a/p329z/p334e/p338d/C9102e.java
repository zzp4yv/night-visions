package p323h.p324a.p329z.p334e.p338d;

import io.reactivex.exceptions.C9207a;
import java.util.concurrent.Callable;
import p323h.p324a.AbstractC9043m;
import p323h.p324a.InterfaceC9047q;
import p323h.p324a.p329z.p330a.EnumC9071d;
import p323h.p324a.p329z.p331b.C9075b;

/* compiled from: ObservableError.java */
/* renamed from: h.a.z.e.d.e */
/* loaded from: classes2.dex */
public final class C9102e<T> extends AbstractC9043m<T> {

    /* renamed from: f */
    final Callable<? extends Throwable> f35024f;

    public C9102e(Callable<? extends Throwable> callable) {
        this.f35024f = callable;
    }

    @Override // p323h.p324a.AbstractC9043m
    /* renamed from: x */
    public void mo29214x(InterfaceC9047q<? super T> interfaceC9047q) {
        try {
            th = (Throwable) C9075b.m29271c(this.f35024f.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            C9207a.m30000a(th);
        }
        EnumC9071d.m29257x(th, interfaceC9047q);
    }
}
