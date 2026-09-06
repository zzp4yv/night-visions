package com.trello.rxlifecycle;

import p456rx.C11186e;

/* compiled from: UntilEventObservableTransformer.java */
/* renamed from: com.trello.rxlifecycle.f */
/* loaded from: classes2.dex */
final class C8727f<T, R> implements InterfaceC8723b<T> {

    /* renamed from: f */
    final C11186e<R> f33257f;

    /* renamed from: g */
    final R f33258g;

    public C8727f(C11186e<R> c11186e, R r) {
        this.f33257f = c11186e;
        this.f33258g = r;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C11186e<T> call(C11186e<T> c11186e) {
        return c11186e.m40075P0(C8725d.m27900b(this.f33257f, this.f33258g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8727f.class != obj.getClass()) {
            return false;
        }
        C8727f c8727f = (C8727f) obj;
        if (this.f33257f.equals(c8727f.f33257f)) {
            return this.f33258g.equals(c8727f.f33258g);
        }
        return false;
    }

    public int hashCode() {
        return (this.f33257f.hashCode() * 31) + this.f33258g.hashCode();
    }

    public String toString() {
        return "UntilEventObservableTransformer{lifecycle=" + this.f33257f + ", event=" + this.f33258g + '}';
    }
}
