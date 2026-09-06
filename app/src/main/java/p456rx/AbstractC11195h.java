package p456rx;

import java.util.concurrent.TimeUnit;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11208e;
import p456rx.p461n.p464c.C11296i;
import p456rx.p461n.p464c.C11299l;

/* compiled from: Scheduler.java */
/* renamed from: rx.h */
/* loaded from: classes.dex */
public abstract class AbstractC11195h {

    /* compiled from: Scheduler.java */
    /* renamed from: rx.h$a */
    /* loaded from: classes3.dex */
    public static abstract class a implements InterfaceC11198k {
        /* renamed from: b */
        public long mo40145b() {
            return System.currentTimeMillis();
        }

        /* renamed from: c */
        public abstract InterfaceC11198k mo40146c(InterfaceC11204a interfaceC11204a);

        /* renamed from: d */
        public abstract InterfaceC11198k mo40147d(InterfaceC11204a interfaceC11204a, long j2, TimeUnit timeUnit);

        /* renamed from: e */
        public InterfaceC11198k mo40148e(InterfaceC11204a interfaceC11204a, long j2, long j3, TimeUnit timeUnit) {
            return C11296i.m40400a(this, interfaceC11204a, j2, j3, timeUnit, null);
        }
    }

    public abstract a createWorker();

    public long now() {
        return System.currentTimeMillis();
    }

    public <S extends AbstractC11195h & InterfaceC11198k> S when(InterfaceC11208e<C11186e<C11186e<C11183b>>, C11183b> interfaceC11208e) {
        return new C11299l(interfaceC11208e, this);
    }
}
