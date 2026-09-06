package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler.java */
/* renamed from: com.bumptech.glide.load.engine.x */
/* loaded from: classes.dex */
class C5374x {

    /* renamed from: a */
    private boolean f13501a;

    /* renamed from: b */
    private final Handler f13502b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler.java */
    /* renamed from: com.bumptech.glide.load.engine.x$a */
    private static final class a implements Handler.Callback {
        a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC5371u) message.obj).mo10340c();
            return true;
        }
    }

    C5374x() {
    }

    /* renamed from: a */
    synchronized void m10360a(InterfaceC5371u<?> interfaceC5371u) {
        if (this.f13501a) {
            this.f13502b.obtainMessage(1, interfaceC5371u).sendToTarget();
        } else {
            this.f13501a = true;
            interfaceC5371u.mo10340c();
            this.f13501a = false;
        }
    }
}
