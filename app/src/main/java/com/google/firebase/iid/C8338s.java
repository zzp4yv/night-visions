package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p024c.p041e.C0867a;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
/* renamed from: com.google.firebase.iid.s */
/* loaded from: classes2.dex */
class C8338s {

    /* renamed from: a */
    private final Executor f31756a;

    /* renamed from: b */
    private final Map<Pair<String, String>, Task<InterfaceC8331l>> f31757b = new C0867a();

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    /* renamed from: com.google.firebase.iid.s$a */
    interface a {
        Task<InterfaceC8331l> start();
    }

    C8338s(Executor executor) {
        this.f31756a = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    synchronized Task<InterfaceC8331l> m26220a(String str, String str2, a aVar) {
        final Pair pair = new Pair(str, str2);
        Task<InterfaceC8331l> task = this.f31757b.get(pair);
        if (task != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(valueOf.length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            return task;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(valueOf2);
            Log.d("FirebaseInstanceId", sb2.toString());
        }
        Task mo23645h = aVar.start().mo23645h(this.f31756a, new Continuation(this, pair) { // from class: com.google.firebase.iid.r

            /* renamed from: a */
            private final C8338s f31754a;

            /* renamed from: b */
            private final Pair f31755b;

            {
                this.f31754a = this;
                this.f31755b = pair;
            }

            @Override // com.google.android.gms.tasks.Continuation
            /* renamed from: a */
            public Object mo13777a(Task task2) {
                this.f31754a.m26221b(this.f31755b, task2);
                return task2;
            }
        });
        this.f31757b.put(pair, mo23645h);
        return mo23645h;
    }

    /* renamed from: b */
    final /* synthetic */ Task m26221b(Pair pair, Task task) throws Exception {
        synchronized (this) {
            this.f31757b.remove(pair);
        }
        return task;
    }
}
