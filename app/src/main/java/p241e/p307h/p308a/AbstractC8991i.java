package p241e.p307h.p308a;

import p241e.p307h.p308a.p315k0.C9001d;

/* compiled from: FileDownloadListener.java */
/* renamed from: e.h.a.i */
/* loaded from: classes2.dex */
public abstract class AbstractC8991i {
    public AbstractC8991i() {
    }

    protected void blockComplete(InterfaceC8958a interfaceC8958a) throws Throwable {
    }

    protected abstract void completed(InterfaceC8958a interfaceC8958a);

    protected abstract void connected(InterfaceC8958a interfaceC8958a, String str, boolean z, int i2, int i3);

    protected abstract void error(InterfaceC8958a interfaceC8958a, Throwable th);

    protected boolean isInvalid() {
        return false;
    }

    protected abstract void paused(InterfaceC8958a interfaceC8958a, int i2, int i3);

    protected abstract void pending(InterfaceC8958a interfaceC8958a, int i2, int i3);

    protected abstract void progress(InterfaceC8958a interfaceC8958a, int i2, int i3);

    protected abstract void retry(InterfaceC8958a interfaceC8958a, Throwable th, int i2, int i3);

    protected void started(InterfaceC8958a interfaceC8958a) {
    }

    protected abstract void warn(InterfaceC8958a interfaceC8958a);

    public AbstractC8991i(int i2) {
        C9001d.m28970i(this, "not handle priority any more", new Object[0]);
    }
}
