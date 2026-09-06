package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.p197q.AbstractC8363d;

/* compiled from: GetIdListener.java */
/* renamed from: com.google.firebase.installations.k */
/* loaded from: classes2.dex */
class C8354k implements InterfaceC8357n {

    /* renamed from: a */
    final TaskCompletionSource<String> f31812a;

    public C8354k(TaskCompletionSource<String> taskCompletionSource) {
        this.f31812a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.InterfaceC8357n
    /* renamed from: a */
    public boolean mo26284a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.InterfaceC8357n
    /* renamed from: b */
    public boolean mo26285b(AbstractC8363d abstractC8363d) {
        if (!abstractC8363d.m26332l() && !abstractC8363d.m26331k() && !abstractC8363d.m26329i()) {
            return false;
        }
        this.f31812a.m23658e(abstractC8363d.mo26301d());
        return true;
    }
}
