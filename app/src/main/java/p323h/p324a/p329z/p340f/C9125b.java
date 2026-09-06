package p323h.p324a.p329z.p340f;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p323h.p324a.p329z.p332c.InterfaceC9080e;
import p323h.p324a.p329z.p344j.C9148f;

/* compiled from: SpscArrayQueue.java */
/* renamed from: h.a.z.f.b */
/* loaded from: classes2.dex */
public final class C9125b<E> extends AtomicReferenceArray<E> implements InterfaceC9080e<E> {

    /* renamed from: f */
    private static final Integer f35162f = Integer.getInteger("jctools.spsc.max.lookahead.step", RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: g */
    final int f35163g;

    /* renamed from: h */
    final AtomicLong f35164h;

    /* renamed from: i */
    long f35165i;

    /* renamed from: j */
    final AtomicLong f35166j;

    /* renamed from: k */
    final int f35167k;

    public C9125b(int i2) {
        super(C9148f.m29401a(i2));
        this.f35163g = length() - 1;
        this.f35164h = new AtomicLong();
        this.f35166j = new AtomicLong();
        this.f35167k = Math.min(i2 / 4, f35162f.intValue());
    }

    /* renamed from: a */
    int m29325a(long j2) {
        return this.f35163g & ((int) j2);
    }

    /* renamed from: b */
    int m29326b(long j2, int i2) {
        return ((int) j2) & i2;
    }

    /* renamed from: c */
    E m29327c(int i2) {
        return get(i2);
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: d */
    void m29328d(long j2) {
        this.f35166j.lazySet(j2);
    }

    /* renamed from: e */
    void m29329e(int i2, E e2) {
        lazySet(i2, e2);
    }

    /* renamed from: f */
    void m29330f(long j2) {
        this.f35164h.lazySet(j2);
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public boolean isEmpty() {
        return this.f35164h.get() == this.f35166j.get();
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9081f
    public boolean offer(E e2) {
        if (e2 == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        int i2 = this.f35163g;
        long j2 = this.f35164h.get();
        int m29326b = m29326b(j2, i2);
        if (j2 >= this.f35165i) {
            long j3 = this.f35167k + j2;
            if (m29327c(m29326b(j3, i2)) == null) {
                this.f35165i = j3;
            } else if (m29327c(m29326b) != null) {
                return false;
            }
        }
        m29329e(m29326b, e2);
        m29330f(j2 + 1);
        return true;
    }

    @Override // p323h.p324a.p329z.p332c.InterfaceC9080e, p323h.p324a.p329z.p332c.InterfaceC9081f
    public E poll() {
        long j2 = this.f35166j.get();
        int m29325a = m29325a(j2);
        E m29327c = m29327c(m29325a);
        if (m29327c == null) {
            return null;
        }
        m29328d(j2 + 1);
        m29329e(m29325a, null);
        return m29327c;
    }
}
