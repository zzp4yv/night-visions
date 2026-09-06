package com.trello.rxlifecycle;

import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: UntilCorrespondingEventObservableTransformer.java */
/* renamed from: com.trello.rxlifecycle.e */
/* loaded from: classes2.dex */
final class C8726e<T, R> implements InterfaceC8723b<T> {

    /* renamed from: f */
    final C11186e<R> f33255f;

    /* renamed from: g */
    final InterfaceC11208e<R, R> f33256g;

    public C8726e(C11186e<R> c11186e, InterfaceC11208e<R, R> interfaceC11208e) {
        this.f33255f = c11186e;
        this.f33256g = interfaceC11208e;
    }

    @Override // p456rx.p460m.InterfaceC11208e
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C11186e<T> call(C11186e<T> c11186e) {
        return c11186e.m40075P0(C8725d.m27899a(this.f33255f, this.f33256g));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8726e.class != obj.getClass()) {
            return false;
        }
        C8726e c8726e = (C8726e) obj;
        if (this.f33255f.equals(c8726e.f33255f)) {
            return this.f33256g.equals(c8726e.f33256g);
        }
        return false;
    }

    public int hashCode() {
        return (this.f33255f.hashCode() * 31) + this.f33256g.hashCode();
    }

    public String toString() {
        return "UntilCorrespondingEventObservableTransformer{sharedLifecycle=" + this.f33255f + ", correspondingEvents=" + this.f33256g + '}';
    }
}
