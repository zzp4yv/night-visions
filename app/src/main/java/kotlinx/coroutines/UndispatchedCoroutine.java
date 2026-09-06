package kotlinx.coroutines;

import kotlin.C10740s;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C10953i0;
import kotlinx.coroutines.internal.ScopeCoroutine;
import okhttp3.HttpUrl;

/* compiled from: CoroutineContext.kt */
@Metadata(m32266d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0014J\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bR\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m32267d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", HttpUrl.FRAGMENT_ENCODE_SET, "afterResume", HttpUrl.FRAGMENT_ENCODE_SET, "state", "clearThreadContext", HttpUrl.FRAGMENT_ENCODE_SET, "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, m32268k = 1, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.w2, reason: from Kotlin metadata */
/* loaded from: classes3.dex */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {

    /* renamed from: i */
    private ThreadLocal<Pair<CoroutineContext, Object>> f41896i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UndispatchedCoroutine(kotlin.coroutines.CoroutineContext r3, kotlin.coroutines.Continuation<? super T> r4) {
        /*
            r2 = this;
            kotlinx.coroutines.x2 r0 = kotlinx.coroutines.UndispatchedMarker.f41898f
            kotlin.y.g$b r1 = r3.get(r0)
            if (r1 != 0) goto Ld
            kotlin.y.g r0 = r3.plus(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f41896i = r0
            kotlin.y.g r4 = r4.getF41861l()
            kotlin.y.e$b r0 = kotlin.coroutines.ContinuationInterceptor.f41528b
            kotlin.y.g$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = kotlinx.coroutines.internal.C10953i0.m39492c(r3, r4)
            kotlinx.coroutines.internal.C10953i0.m39490a(r3, r4)
            r2.m39706I0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.UndispatchedCoroutine.<init>(kotlin.y.g, kotlin.y.d):void");
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    /* renamed from: C0 */
    protected void mo39077C0(Object obj) {
        Pair<CoroutineContext, Object> pair = this.f41896i.get();
        if (pair != null) {
            C10953i0.m39490a(pair.m37646a(), pair.m37647b());
            this.f41896i.set(null);
        }
        Object m39296a = C10904e0.m39296a(obj, this.f41768h);
        Continuation<T> continuation = this.f41768h;
        CoroutineContext f41861l = continuation.getF41861l();
        Object m39492c = C10953i0.m39492c(f41861l, null);
        UndispatchedCoroutine<?> m39419g = m39492c != C10953i0.f41784a ? C10929h0.m39419g(continuation, f41861l, m39492c) : null;
        try {
            this.f41768h.resumeWith(m39296a);
            C10742u c10742u = C10742u.f41439a;
        } finally {
            if (m39419g == null || m39419g.m39705H0()) {
                C10953i0.m39490a(f41861l, m39492c);
            }
        }
    }

    /* renamed from: H0 */
    public final boolean m39705H0() {
        if (this.f41896i.get() == null) {
            return false;
        }
        this.f41896i.set(null);
        return true;
    }

    /* renamed from: I0 */
    public final void m39706I0(CoroutineContext coroutineContext, Object obj) {
        this.f41896i.set(C10740s.m38547a(coroutineContext, obj));
    }
}
