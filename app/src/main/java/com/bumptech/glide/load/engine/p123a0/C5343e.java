package com.bumptech.glide.load.engine.p123a0;

import android.util.Log;
import com.bumptech.glide.load.InterfaceC5390f;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5339a;
import com.bumptech.glide.p121k.C5324a;
import java.io.File;
import java.io.IOException;

/* compiled from: DiskLruCacheWrapper.java */
/* renamed from: com.bumptech.glide.load.engine.a0.e */
/* loaded from: classes.dex */
public class C5343e implements InterfaceC5339a {

    /* renamed from: b */
    private final File f13261b;

    /* renamed from: c */
    private final long f13262c;

    /* renamed from: e */
    private C5324a f13264e;

    /* renamed from: d */
    private final C5341c f13263d = new C5341c();

    /* renamed from: a */
    private final C5348j f13260a = new C5348j();

    @Deprecated
    protected C5343e(File file, long j2) {
        this.f13261b = file;
        this.f13262c = j2;
    }

    /* renamed from: c */
    public static InterfaceC5339a m10188c(File file, long j2) {
        return new C5343e(file, j2);
    }

    /* renamed from: d */
    private synchronized C5324a m10189d() throws IOException {
        if (this.f13264e == null) {
            this.f13264e = C5324a.m10054D(this.f13261b, 1, 1, this.f13262c);
        }
        return this.f13264e;
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5339a
    /* renamed from: a */
    public void mo10179a(InterfaceC5390f interfaceC5390f, InterfaceC5339a.b bVar) {
        C5324a m10189d;
        String m10210b = this.f13260a.m10210b(interfaceC5390f);
        this.f13263d.m10183a(m10210b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + m10210b + " for for Key: " + interfaceC5390f);
            }
            try {
                m10189d = m10189d();
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
            if (m10189d.m10073A(m10210b) != null) {
                return;
            }
            C5324a.c m10076y = m10189d.m10076y(m10210b);
            if (m10076y == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + m10210b);
            }
            try {
                if (bVar.mo10182a(m10076y.m10083f(0))) {
                    m10076y.m10082e();
                }
                m10076y.m10081b();
            } catch (Throwable th) {
                m10076y.m10081b();
                throw th;
            }
        } finally {
            this.f13263d.m10184b(m10210b);
        }
    }

    @Override // com.bumptech.glide.load.engine.p123a0.InterfaceC5339a
    /* renamed from: b */
    public File mo10180b(InterfaceC5390f interfaceC5390f) {
        String m10210b = this.f13260a.m10210b(interfaceC5390f);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + m10210b + " for for Key: " + interfaceC5390f);
        }
        try {
            C5324a.e m10073A = m10189d().m10073A(m10210b);
            if (m10073A != null) {
                return m10073A.m10098a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }
}
