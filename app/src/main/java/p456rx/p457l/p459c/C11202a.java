package p456rx.p457l.p459c;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import p456rx.AbstractC11195h;
import p456rx.p457l.p458b.C11200a;

/* compiled from: AndroidSchedulers.java */
/* renamed from: rx.l.c.a */
/* loaded from: classes.dex */
public final class C11202a {

    /* renamed from: a */
    private static final AtomicReference<C11202a> f42142a = new AtomicReference<>();

    /* renamed from: b */
    private final AbstractC11195h f42143b;

    private C11202a() {
        AbstractC11195h m40153b = C11200a.m40150a().m40151b().m40153b();
        if (m40153b != null) {
            this.f42143b = m40153b;
        } else {
            this.f42143b = new C11203b(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    private static C11202a m40155a() {
        AtomicReference<C11202a> atomicReference;
        C11202a c11202a;
        do {
            atomicReference = f42142a;
            C11202a c11202a2 = atomicReference.get();
            if (c11202a2 != null) {
                return c11202a2;
            }
            c11202a = new C11202a();
        } while (!atomicReference.compareAndSet(null, c11202a));
        return c11202a;
    }

    /* renamed from: b */
    public static AbstractC11195h m40156b() {
        return m40155a().f42143b;
    }
}
