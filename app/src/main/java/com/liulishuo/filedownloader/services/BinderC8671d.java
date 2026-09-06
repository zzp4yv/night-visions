package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.liulishuo.filedownloader.message.C8661b;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.lang.ref.WeakReference;
import p241e.p307h.p308a.p313i0.InterfaceC8992a;
import p241e.p307h.p308a.p313i0.InterfaceC8993b;
import p241e.p307h.p308a.p315k0.C9001d;

/* compiled from: FDServiceSeparateHandler.java */
/* renamed from: com.liulishuo.filedownloader.services.d */
/* loaded from: classes2.dex */
public class BinderC8671d extends InterfaceC8993b.a implements C8661b.b, InterfaceC8677j {

    /* renamed from: f */
    private final RemoteCallbackList<InterfaceC8992a> f33049f = new RemoteCallbackList<>();

    /* renamed from: g */
    private final C8674g f33050g;

    /* renamed from: h */
    private final WeakReference<FileDownloadService> f33051h;

    BinderC8671d(WeakReference<FileDownloadService> weakReference, C8674g c8674g) {
        this.f33051h = weakReference;
        this.f33050g = c8674g;
        C8661b.m27535a().m27537c(this);
    }

    /* renamed from: E3 */
    private synchronized int m27629E3(MessageSnapshot messageSnapshot) {
        int beginBroadcast;
        RemoteCallbackList<InterfaceC8992a> remoteCallbackList;
        beginBroadcast = this.f33049f.beginBroadcast();
        for (int i2 = 0; i2 < beginBroadcast; i2++) {
            try {
                try {
                    this.f33049f.getBroadcastItem(i2).mo28910D4(messageSnapshot);
                } catch (Throwable th) {
                    this.f33049f.finishBroadcast();
                    throw th;
                }
            } catch (RemoteException e2) {
                C9001d.m28964c(this, e2, "callback error", new Object[0]);
                remoteCallbackList = this.f33049f;
            }
        }
        remoteCallbackList = this.f33049f;
        remoteCallbackList.finishBroadcast();
        return beginBroadcast;
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: E6 */
    public void mo27630E6(int i2, Notification notification) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f33051h;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f33051h.get().startForeground(i2, notification);
    }

    @Override // com.liulishuo.filedownloader.message.C8661b.b
    /* renamed from: H */
    public void mo27539H(MessageSnapshot messageSnapshot) {
        m27629E3(messageSnapshot);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: I2 */
    public boolean mo27631I2(String str, String str2) throws RemoteException {
        return this.f33050g.m27657i(str, str2);
    }

    @Override // com.liulishuo.filedownloader.services.InterfaceC8677j
    /* renamed from: P */
    public IBinder mo27632P(Intent intent) {
        return this;
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: Q */
    public byte mo27633Q(int i2) throws RemoteException {
        return this.f33050g.m27654f(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: S */
    public void mo27634S(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) throws RemoteException {
        this.f33050g.m27662n(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: V4 */
    public void mo27635V4(InterfaceC8992a interfaceC8992a) throws RemoteException {
        this.f33049f.unregister(interfaceC8992a);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: Y6 */
    public void mo27636Y6() throws RemoteException {
        this.f33050g.m27660l();
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: Z2 */
    public boolean mo27637Z2(int i2) throws RemoteException {
        return this.f33050g.m27661m(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: Z4 */
    public boolean mo27638Z4() throws RemoteException {
        return this.f33050g.m27658j();
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: a0 */
    public boolean mo27639a0(int i2) throws RemoteException {
        return this.f33050g.m27659k(i2);
    }

    @Override // com.liulishuo.filedownloader.services.InterfaceC8677j
    /* renamed from: k0 */
    public void mo27640k0(Intent intent, int i2, int i3) {
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: l2 */
    public void mo27641l2() throws RemoteException {
        this.f33050g.m27651c();
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: o0 */
    public boolean mo27642o0(int i2) throws RemoteException {
        return this.f33050g.m27652d(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: p4 */
    public long mo27643p4(int i2) throws RemoteException {
        return this.f33050g.m27655g(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: t0 */
    public void mo27644t0(boolean z) throws RemoteException {
        WeakReference<FileDownloadService> weakReference = this.f33051h;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f33051h.get().stopForeground(z);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: u5 */
    public long mo27645u5(int i2) throws RemoteException {
        return this.f33050g.m27653e(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: v1 */
    public void mo27646v1(InterfaceC8992a interfaceC8992a) throws RemoteException {
        this.f33049f.register(interfaceC8992a);
    }
}
