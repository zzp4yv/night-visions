package com.liulishuo.filedownloader.services;

import android.app.Notification;
import android.content.Intent;
import android.os.IBinder;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.lang.ref.WeakReference;
import p241e.p307h.p308a.C9005m;
import p241e.p307h.p308a.p313i0.InterfaceC8992a;
import p241e.p307h.p308a.p313i0.InterfaceC8993b;

/* compiled from: FDServiceSharedHandler.java */
/* renamed from: com.liulishuo.filedownloader.services.e */
/* loaded from: classes2.dex */
public class BinderC8672e extends InterfaceC8993b.a implements InterfaceC8677j {

    /* renamed from: f */
    private final C8674g f33052f;

    /* renamed from: g */
    private final WeakReference<FileDownloadService> f33053g;

    /* compiled from: FDServiceSharedHandler.java */
    /* renamed from: com.liulishuo.filedownloader.services.e$a */
    public interface a {
        /* renamed from: a */
        void mo27647a(BinderC8672e binderC8672e);
    }

    BinderC8672e(WeakReference<FileDownloadService> weakReference, C8674g c8674g) {
        this.f33053g = weakReference;
        this.f33052f = c8674g;
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: E6 */
    public void mo27630E6(int i2, Notification notification) {
        WeakReference<FileDownloadService> weakReference = this.f33053g;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f33053g.get().startForeground(i2, notification);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: I2 */
    public boolean mo27631I2(String str, String str2) {
        return this.f33052f.m27657i(str, str2);
    }

    @Override // com.liulishuo.filedownloader.services.InterfaceC8677j
    /* renamed from: P */
    public IBinder mo27632P(Intent intent) {
        return null;
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: Q */
    public byte mo27633Q(int i2) {
        return this.f33052f.m27654f(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: S */
    public void mo27634S(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        this.f33052f.m27662n(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: V4 */
    public void mo27635V4(InterfaceC8992a interfaceC8992a) {
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: Y6 */
    public void mo27636Y6() {
        this.f33052f.m27660l();
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: Z2 */
    public boolean mo27637Z2(int i2) {
        return this.f33052f.m27661m(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: Z4 */
    public boolean mo27638Z4() {
        return this.f33052f.m27658j();
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: a0 */
    public boolean mo27639a0(int i2) {
        return this.f33052f.m27659k(i2);
    }

    @Override // com.liulishuo.filedownloader.services.InterfaceC8677j
    /* renamed from: k0 */
    public void mo27640k0(Intent intent, int i2, int i3) {
        C9005m.m29028a().mo27647a(this);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: l2 */
    public void mo27641l2() {
        this.f33052f.m27651c();
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: o0 */
    public boolean mo27642o0(int i2) {
        return this.f33052f.m27652d(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: p4 */
    public long mo27643p4(int i2) {
        return this.f33052f.m27655g(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: t0 */
    public void mo27644t0(boolean z) {
        WeakReference<FileDownloadService> weakReference = this.f33053g;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f33053g.get().stopForeground(z);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: u5 */
    public long mo27645u5(int i2) {
        return this.f33052f.m27653e(i2);
    }

    @Override // p241e.p307h.p308a.p313i0.InterfaceC8993b
    /* renamed from: v1 */
    public void mo27646v1(InterfaceC8992a interfaceC8992a) {
    }
}
