package p241e.p307h.p308a;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.BinderC8672e;
import com.liulishuo.filedownloader.services.FileDownloadService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.p312h0.C8988b;
import p241e.p307h.p308a.p315k0.C8998a;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: FileDownloadServiceSharedTransmit.java */
/* renamed from: e.h.a.n */
/* loaded from: classes2.dex */
class C9006n implements InterfaceC9013u, BinderC8672e.a {

    /* renamed from: f */
    private static final Class<?> f34838f = FileDownloadService.SharedMainProcessService.class;

    /* renamed from: g */
    private boolean f34839g = false;

    /* renamed from: h */
    private final ArrayList<Runnable> f34840h = new ArrayList<>();

    /* renamed from: i */
    private BinderC8672e f34841i;

    C9006n() {
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: Q */
    public byte mo29030Q(int i2) {
        return !isConnected() ? C8998a.m28948b(i2) : this.f34841i.mo27633Q(i2);
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: S */
    public boolean mo29031S(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        if (!isConnected()) {
            return C8998a.m28951e(str, str2, z);
        }
        this.f34841i.mo27634S(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
        return true;
    }

    @Override // com.liulishuo.filedownloader.services.BinderC8672e.a
    /* renamed from: a */
    public void mo27647a(BinderC8672e binderC8672e) {
        this.f34841i = binderC8672e;
        List list = (List) this.f34840h.clone();
        this.f34840h.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        C8971f.m28724e().m28906b(new C8988b(C8988b.a.connected, f34838f));
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: a0 */
    public boolean mo29032a0(int i2) {
        return !isConnected() ? C8998a.m28950d(i2) : this.f34841i.mo27639a0(i2);
    }

    /* renamed from: b */
    public void m29036b(Context context, Runnable runnable) {
        if (runnable != null && !this.f34840h.contains(runnable)) {
            this.f34840h.add(runnable);
        }
        Intent intent = new Intent(context, f34838f);
        boolean m28989P = C9003f.m28989P(context);
        this.f34839g = m28989P;
        intent.putExtra("is_foreground", m28989P);
        if (!this.f34839g) {
            context.startService(intent);
            return;
        }
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "start foreground service", new Object[0]);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    public boolean isConnected() {
        return this.f34841i != null;
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: o0 */
    public boolean mo29033o0(int i2) {
        return !isConnected() ? C8998a.m28947a(i2) : this.f34841i.mo27642o0(i2);
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: t0 */
    public void mo29034t0(boolean z) {
        if (!isConnected()) {
            C8998a.m28952f(z);
        } else {
            this.f34841i.mo27644t0(z);
            this.f34839g = false;
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: u0 */
    public void mo27610u0(Context context) {
        m29036b(context, null);
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: v0 */
    public boolean mo27611v0() {
        return this.f34839g;
    }
}
