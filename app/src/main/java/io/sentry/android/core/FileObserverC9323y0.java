package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.C9484n1;
import io.sentry.EnumC9554s4;
import io.sentry.InterfaceC9558t1;
import io.sentry.InterfaceC9637w1;
import io.sentry.hints.InterfaceC9420c;
import io.sentry.hints.InterfaceC9423f;
import io.sentry.hints.InterfaceC9426i;
import io.sentry.hints.InterfaceC9427j;
import io.sentry.hints.InterfaceC9428k;
import io.sentry.hints.InterfaceC9433p;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: EnvelopeFileObserver.java */
/* renamed from: io.sentry.android.core.y0 */
/* loaded from: classes2.dex */
final class FileObserverC9323y0 extends FileObserver {

    /* renamed from: a */
    private final String f36129a;

    /* renamed from: b */
    private final InterfaceC9558t1 f36130b;

    /* renamed from: c */
    private final InterfaceC9637w1 f36131c;

    /* renamed from: d */
    private final long f36132d;

    /* compiled from: EnvelopeFileObserver.java */
    /* renamed from: io.sentry.android.core.y0$a */
    private static final class a implements InterfaceC9423f, InterfaceC9428k, InterfaceC9433p, InterfaceC9426i, InterfaceC9420c, InterfaceC9427j {

        /* renamed from: a */
        boolean f36133a;

        /* renamed from: b */
        boolean f36134b;

        /* renamed from: c */
        private CountDownLatch f36135c;

        /* renamed from: d */
        private final long f36136d;

        /* renamed from: e */
        private final InterfaceC9637w1 f36137e;

        public a(long j2, InterfaceC9637w1 interfaceC9637w1) {
            mo30473a();
            this.f36136d = j2;
            this.f36137e = (InterfaceC9637w1) C9613q.m31802c(interfaceC9637w1, "ILogger is required.");
        }

        @Override // io.sentry.hints.InterfaceC9427j
        /* renamed from: a */
        public void mo30473a() {
            this.f36135c = new CountDownLatch(1);
            this.f36133a = false;
            this.f36134b = false;
        }

        @Override // io.sentry.hints.InterfaceC9428k
        /* renamed from: b */
        public boolean mo30474b() {
            return this.f36133a;
        }

        @Override // io.sentry.hints.InterfaceC9433p
        /* renamed from: c */
        public void mo30475c(boolean z) {
            this.f36134b = z;
            this.f36135c.countDown();
        }

        @Override // io.sentry.hints.InterfaceC9428k
        /* renamed from: d */
        public void mo30476d(boolean z) {
            this.f36133a = z;
        }

        @Override // io.sentry.hints.InterfaceC9426i
        /* renamed from: e */
        public boolean mo30477e() {
            try {
                return this.f36135c.await(this.f36136d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                this.f36137e.mo30213b(EnumC9554s4.ERROR, "Exception while awaiting on lock.", e2);
                return false;
            }
        }

        @Override // io.sentry.hints.InterfaceC9433p
        /* renamed from: f */
        public boolean mo30478f() {
            return this.f36134b;
        }
    }

    FileObserverC9323y0(String str, InterfaceC9558t1 interfaceC9558t1, InterfaceC9637w1 interfaceC9637w1, long j2) {
        super(str);
        this.f36129a = str;
        this.f36130b = (InterfaceC9558t1) C9613q.m31802c(interfaceC9558t1, "Envelope sender is required.");
        this.f36131c = (InterfaceC9637w1) C9613q.m31802c(interfaceC9637w1, "Logger is required.");
        this.f36132d = j2;
    }

    @Override // android.os.FileObserver
    public void onEvent(int i2, String str) {
        if (str == null || i2 != 8) {
            return;
        }
        this.f36131c.mo30214c(EnumC9554s4.DEBUG, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", Integer.valueOf(i2), this.f36129a, str);
        C9484n1 m31778a = C9609m.m31778a(new a(this.f36132d, this.f36131c));
        this.f36130b.mo30841a(this.f36129a + File.separator + str, m31778a);
    }
}
