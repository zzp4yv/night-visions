package p241e.p307h.p308a;

import android.content.Context;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import com.liulishuo.filedownloader.services.BinderC8672e;
import p241e.p307h.p308a.p315k0.C9002e;

/* compiled from: FileDownloadServiceProxy.java */
/* renamed from: e.h.a.m */
/* loaded from: classes2.dex */
public class C9005m implements InterfaceC9013u {

    /* renamed from: f */
    private final InterfaceC9013u f34836f;

    /* compiled from: FileDownloadServiceProxy.java */
    /* renamed from: e.h.a.m$b */
    private static final class b {

        /* renamed from: a */
        private static final C9005m f34837a = new C9005m();
    }

    /* renamed from: a */
    public static BinderC8672e.a m29028a() {
        if (m29029b().f34836f instanceof C9006n) {
            return (BinderC8672e.a) m29029b().f34836f;
        }
        return null;
    }

    /* renamed from: b */
    public static C9005m m29029b() {
        return b.f34837a;
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: Q */
    public byte mo29030Q(int i2) {
        return this.f34836f.mo29030Q(i2);
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: S */
    public boolean mo29031S(String str, String str2, boolean z, int i2, int i3, int i4, boolean z2, FileDownloadHeader fileDownloadHeader, boolean z3) {
        return this.f34836f.mo29031S(str, str2, z, i2, i3, i4, z2, fileDownloadHeader, z3);
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: a0 */
    public boolean mo29032a0(int i2) {
        return this.f34836f.mo29032a0(i2);
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    public boolean isConnected() {
        return this.f34836f.isConnected();
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: o0 */
    public boolean mo29033o0(int i2) {
        return this.f34836f.mo29033o0(i2);
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: t0 */
    public void mo29034t0(boolean z) {
        this.f34836f.mo29034t0(z);
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: u0 */
    public void mo27610u0(Context context) {
        this.f34836f.mo27610u0(context);
    }

    @Override // p241e.p307h.p308a.InterfaceC9013u
    /* renamed from: v0 */
    public boolean mo27611v0() {
        return this.f34836f.mo27611v0();
    }

    private C9005m() {
        this.f34836f = C9002e.m28971a().f34823d ? new C9006n() : new C9007o();
    }
}
