package com.airbnb.epoxy;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p024c.p041e.C0870d;

/* compiled from: BoundViewHolders.java */
/* renamed from: com.airbnb.epoxy.e */
/* loaded from: classes.dex */
public class C5110e implements Iterable<C5143u> {

    /* renamed from: f */
    private final C0870d<C5143u> f12230f = new C0870d<>();

    /* compiled from: BoundViewHolders.java */
    /* renamed from: com.airbnb.epoxy.e$b */
    private class b implements Iterator<C5143u> {

        /* renamed from: f */
        private int f12231f;

        private b() {
            this.f12231f = 0;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5143u next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            C0870d c0870d = C5110e.this.f12230f;
            int i2 = this.f12231f;
            this.f12231f = i2 + 1;
            return (C5143u) c0870d.m5446o(i2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f12231f < C5110e.this.f12230f.m5445n();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    public void m9286f(C5143u c5143u) {
        this.f12230f.m5442k(c5143u.getItemId(), c5143u);
    }

    /* renamed from: g */
    public void m9287g(C5143u c5143u) {
        this.f12230f.m5443l(c5143u.getItemId());
    }

    @Override // java.lang.Iterable
    public Iterator<C5143u> iterator() {
        return new b();
    }

    public int size() {
        return this.f12230f.m5445n();
    }
}
