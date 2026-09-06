package p241e.p307h.p308a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.RemoteException;
import java.io.File;
import p241e.p307h.p308a.p313i0.InterfaceC8993b;
import p241e.p307h.p308a.p315k0.C9000c;
import p241e.p307h.p308a.p315k0.C9001d;

/* compiled from: PauseAllMarker.java */
/* renamed from: e.h.a.b0 */
/* loaded from: classes2.dex */
public class C8961b0 implements Handler.Callback {

    /* renamed from: f */
    private static File f34583f;

    /* renamed from: g */
    private static final Long f34584g = 1000L;

    /* renamed from: h */
    private HandlerThread f34585h;

    /* renamed from: i */
    private Handler f34586i;

    /* renamed from: j */
    private final InterfaceC8993b f34587j;

    public C8961b0(InterfaceC8993b interfaceC8993b) {
        this.f34587j = interfaceC8993b;
    }

    /* renamed from: a */
    public static void m28664a() {
        File m28666c = m28666c();
        if (m28666c.exists()) {
            C9001d.m28962a(C8961b0.class, "delete marker file " + m28666c.delete(), new Object[0]);
        }
    }

    /* renamed from: b */
    private static boolean m28665b() {
        return m28666c().exists();
    }

    /* renamed from: c */
    private static File m28666c() {
        if (f34583f == null) {
            f34583f = new File(C9000c.m28956a().getCacheDir() + File.separator + ".filedownloader_pause_all_marker.b");
        }
        return f34583f;
    }

    /* renamed from: d */
    public void m28667d() {
        HandlerThread handlerThread = new HandlerThread("PauseAllChecker");
        this.f34585h = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(this.f34585h.getLooper(), this);
        this.f34586i = handler;
        handler.sendEmptyMessageDelayed(0, f34584g.longValue());
    }

    /* renamed from: e */
    public void m28668e() {
        this.f34586i.removeMessages(0);
        this.f34585h.quit();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        try {
            if (m28665b()) {
                try {
                    this.f34587j.mo27636Y6();
                } catch (RemoteException e2) {
                    C9001d.m28964c(this, e2, "pause all failed", new Object[0]);
                }
            }
            this.f34586i.sendEmptyMessageDelayed(0, f34584g.longValue());
            return true;
        } finally {
            m28664a();
        }
    }
}
