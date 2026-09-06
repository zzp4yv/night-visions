package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.p197q.AbstractC8363d;

/* compiled from: GetAuthTokenListener.java */
/* renamed from: com.google.firebase.installations.j */
/* loaded from: classes2.dex */
class C8353j implements InterfaceC8357n {

    /* renamed from: a */
    private final C8358o f31810a;

    /* renamed from: b */
    private final TaskCompletionSource<AbstractC8355l> f31811b;

    public C8353j(C8358o c8358o, TaskCompletionSource<AbstractC8355l> taskCompletionSource) {
        this.f31810a = c8358o;
        this.f31811b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC8357n
    /* renamed from: a */
    public boolean mo26284a(Exception exc) {
        this.f31811b.m23657d(exc);
        return true;
    }

    @Override // com.google.firebase.installations.InterfaceC8357n
    /* renamed from: b */
    public boolean mo26285b(AbstractC8363d abstractC8363d) {
        if (!abstractC8363d.m26331k() || this.f31810a.m26297f(abstractC8363d)) {
            return false;
        }
        this.f31811b.m23656c(AbstractC8355l.m26286a().mo26249b(abstractC8363d.mo26299b()).mo26251d(abstractC8363d.mo26300c()).mo26250c(abstractC8363d.mo26305h()).mo26248a());
        return true;
    }
}
