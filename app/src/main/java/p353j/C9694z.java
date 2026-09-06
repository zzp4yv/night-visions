package p353j;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.C9768m;

/* compiled from: SegmentPool.kt */
/* renamed from: j.z */
/* loaded from: classes3.dex */
public final class C9694z {

    /* renamed from: c */
    private static final int f37100c;

    /* renamed from: d */
    private static final AtomicReference<C9693y>[] f37101d;

    /* renamed from: e */
    public static final C9694z f37102e = new C9694z();

    /* renamed from: a */
    private static final int f37098a = 65536;

    /* renamed from: b */
    private static final C9693y f37099b = new C9693y(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f37100c = highestOneBit;
        AtomicReference<C9693y>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        f37101d = atomicReferenceArr;
    }

    private C9694z() {
    }

    /* renamed from: a */
    private final AtomicReference<C9693y> m32168a() {
        Thread currentThread = Thread.currentThread();
        C9768m.m32345e(currentThread, "Thread.currentThread()");
        return f37101d[(int) (currentThread.getId() & (f37100c - 1))];
    }

    /* renamed from: b */
    public static final void m32169b(C9693y c9693y) {
        AtomicReference<C9693y> m32168a;
        C9693y c9693y2;
        C9768m.m32346f(c9693y, "segment");
        if (!(c9693y.f37096g == null && c9693y.f37097h == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c9693y.f37094e || (c9693y2 = (m32168a = f37102e.m32168a()).get()) == f37099b) {
            return;
        }
        int i2 = c9693y2 != null ? c9693y2.f37093d : 0;
        if (i2 >= f37098a) {
            return;
        }
        c9693y.f37096g = c9693y2;
        c9693y.f37092c = 0;
        c9693y.f37093d = i2 + 8192;
        if (m32168a.compareAndSet(c9693y2, c9693y)) {
            return;
        }
        c9693y.f37096g = null;
    }

    /* renamed from: c */
    public static final C9693y m32170c() {
        AtomicReference<C9693y> m32168a = f37102e.m32168a();
        C9693y c9693y = f37099b;
        C9693y andSet = m32168a.getAndSet(c9693y);
        if (andSet == c9693y) {
            return new C9693y();
        }
        if (andSet == null) {
            m32168a.set(null);
            return new C9693y();
        }
        m32168a.set(andSet.f37096g);
        andSet.f37096g = null;
        andSet.f37093d = 0;
        return andSet;
    }
}
