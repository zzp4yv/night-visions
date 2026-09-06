package io.sentry;

import io.sentry.InterfaceC9629v5;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.hints.AbstractC9422e;
import io.sentry.hints.EnumC9425h;
import io.sentry.hints.InterfaceC9429l;
import io.sentry.protocol.C9517i;
import io.sentry.protocol.C9525q;
import io.sentry.util.C9609m;
import io.sentry.util.C9613q;
import java.io.Closeable;
import java.lang.Thread;
import org.jetbrains.annotations.ApiStatus;

/* loaded from: classes2.dex */
public final class UncaughtExceptionHandlerIntegration implements Integration, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: f */
    private Thread.UncaughtExceptionHandler f35736f;

    /* renamed from: g */
    private InterfaceC9625v1 f35737g;

    /* renamed from: h */
    private C9647x4 f35738h;

    /* renamed from: i */
    private boolean f35739i;

    /* renamed from: j */
    private final InterfaceC9629v5 f35740j;

    @ApiStatus.Internal
    /* renamed from: io.sentry.UncaughtExceptionHandlerIntegration$a */
    public static class C9208a extends AbstractC9422e implements InterfaceC9429l {
        public C9208a(long j2, InterfaceC9637w1 interfaceC9637w1) {
            super(j2, interfaceC9637w1);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(InterfaceC9629v5.a.m31850c());
    }

    /* renamed from: b */
    static Throwable m30005b(Thread thread, Throwable th) {
        C9517i c9517i = new C9517i();
        c9517i.m31371i(Boolean.FALSE);
        c9517i.m31372j("UncaughtExceptionHandler");
        return new ExceptionMechanismException(c9517i, th, thread);
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9438i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public final void mo30001c(InterfaceC9625v1 interfaceC9625v1, C9647x4 c9647x4) {
        if (this.f35739i) {
            c9647x4.getLogger().mo30214c(EnumC9554s4.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f35739i = true;
        this.f35737g = (InterfaceC9625v1) C9613q.m31802c(interfaceC9625v1, "Hub is required");
        C9647x4 c9647x42 = (C9647x4) C9613q.m31802c(c9647x4, "SentryOptions is required");
        this.f35738h = c9647x42;
        InterfaceC9637w1 logger = c9647x42.getLogger();
        EnumC9554s4 enumC9554s4 = EnumC9554s4.DEBUG;
        logger.mo30214c(enumC9554s4, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f35738h.isEnableUncaughtExceptionHandler()));
        if (this.f35738h.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler mo31849b = this.f35740j.mo31849b();
            if (mo31849b != null) {
                this.f35738h.getLogger().mo30214c(enumC9554s4, "default UncaughtExceptionHandler class='" + mo31849b.getClass().getName() + "'", new Object[0]);
                this.f35736f = mo31849b;
            }
            this.f35740j.mo31848a(this);
            this.f35738h.getLogger().mo30214c(enumC9554s4, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            mo30003a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this == this.f35740j.mo31849b()) {
            this.f35740j.mo31848a(this.f35736f);
            C9647x4 c9647x4 = this.f35738h;
            if (c9647x4 != null) {
                c9647x4.getLogger().mo30214c(EnumC9554s4.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC9457j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9438i2.m30846b(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        C9647x4 c9647x4 = this.f35738h;
        if (c9647x4 == null || this.f35737g == null) {
            return;
        }
        c9647x4.getLogger().mo30214c(EnumC9554s4.INFO, "Uncaught exception received.", new Object[0]);
        try {
            C9208a c9208a = new C9208a(this.f35738h.getFlushTimeoutMillis(), this.f35738h.getLogger());
            C9473l4 c9473l4 = new C9473l4(m30005b(thread, th));
            c9473l4.m31011z0(EnumC9554s4.FATAL);
            C9484n1 m31778a = C9609m.m31778a(c9208a);
            boolean equals = this.f35737g.mo31159t(c9473l4, m31778a).equals(C9525q.f36725f);
            EnumC9425h m31779b = C9609m.m31779b(m31778a);
            if ((!equals || EnumC9425h.MULTITHREADED_DEDUPLICATION.equals(m31779b)) && !c9208a.mo30477e()) {
                this.f35738h.getLogger().mo30214c(EnumC9554s4.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c9473l4.m30579G());
            }
        } catch (Throwable th2) {
            this.f35738h.getLogger().mo30213b(EnumC9554s4.ERROR, "Error sending uncaught exception to Sentry.", th2);
        }
        if (this.f35736f != null) {
            this.f35738h.getLogger().mo30214c(EnumC9554s4.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
            this.f35736f.uncaughtException(thread, th);
        } else if (this.f35738h.isPrintUncaughtStackTrace()) {
            th.printStackTrace();
        }
    }

    UncaughtExceptionHandlerIntegration(InterfaceC9629v5 interfaceC9629v5) {
        this.f35739i = false;
        this.f35740j = (InterfaceC9629v5) C9613q.m31802c(interfaceC9629v5, "threadAdapter is required.");
    }
}
