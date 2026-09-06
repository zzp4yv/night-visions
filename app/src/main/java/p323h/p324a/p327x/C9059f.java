package p323h.p324a.p327x;

/* compiled from: RunnableDisposable.java */
/* renamed from: h.a.x.f */
/* loaded from: classes2.dex */
final class C9059f extends AbstractC9058e<Runnable> {
    C9059f(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p323h.p324a.p327x.AbstractC9058e
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo29236a(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + mo29116q() + ", " + get() + ")";
    }
}
