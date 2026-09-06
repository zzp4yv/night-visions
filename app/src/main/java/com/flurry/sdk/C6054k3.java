package com.flurry.sdk;

import android.os.SystemClock;
import com.flurry.sdk.C6125s3;
import com.flurry.sdk.InterfaceC6045j3;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.k3 */
/* loaded from: classes2.dex */
public final class C6054k3 implements InterfaceC6045j3 {

    /* renamed from: a */
    Map<EnumC6128s6, InterfaceC6144u6> f16079a;

    /* renamed from: b */
    private AtomicBoolean f16080b;

    /* renamed from: c */
    private InterfaceC6036i3 f16081c;

    /* renamed from: d */
    private boolean f16082d = false;

    /* renamed from: e */
    private Timer f16083e = null;

    /* renamed from: f */
    private TimerTask f16084f = null;

    /* renamed from: g */
    long f16085g = Long.MIN_VALUE;

    /* renamed from: h */
    long f16086h = Long.MIN_VALUE;

    /* renamed from: i */
    long f16087i = Long.MIN_VALUE;

    /* renamed from: j */
    int f16088j = EnumC6006f0.BACKGROUND.f15845j;

    /* renamed from: k */
    private d f16089k = d.INACTIVE;

    /* renamed from: com.flurry.sdk.k3$a */
    final class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ boolean f16090h;

        a(boolean z) {
            this.f16090h = z;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            if (this.f16090h) {
                C5987d0 c5987d0 = C6004e7.m13055a().f15832l;
                C6054k3 c6054k3 = C6054k3.this;
                c5987d0.m13027z(c6054k3.f16085g, c6054k3.f16086h);
            }
            C5987d0 c5987d02 = C6004e7.m13055a().f15832l;
            c5987d02.f15767r.set(this.f16090h);
        }
    }

    /* renamed from: com.flurry.sdk.k3$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f16092a;

        static {
            int[] iArr = new int[d.values().length];
            f16092a = iArr;
            try {
                iArr[d.FOREGROUND_RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16092a[d.FOREGROUND_ENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16092a[d.BACKGROUND_RUNNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16092a[d.BACKGROUND_ENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16092a[d.INACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: com.flurry.sdk.k3$c */
    public class c extends TimerTask {
        protected c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C6054k3.this.m13166g();
            C6054k3 c6054k3 = C6054k3.this;
            C6015g0.m13065a().m13071e();
            if (c6054k3.f16087i <= 0) {
                c6054k3.f16087i = SystemClock.elapsedRealtime();
            }
            if (C6054k3.m13157f(c6054k3.f16085g)) {
                c6054k3.m13167i(C6057k6.m13169h(c6054k3.f16085g, c6054k3.f16086h, c6054k3.f16087i, c6054k3.f16088j));
            } else {
                C5988d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
            InterfaceC6045j3.a aVar = InterfaceC6045j3.a.REASON_SESSION_FINALIZE;
            c6054k3.m13167i(C6119r5.m13293h(aVar.ordinal(), aVar.f16030p));
            c6054k3.m13165e(false);
            c6054k3.m13168k();
        }
    }

    /* renamed from: com.flurry.sdk.k3$d */
    enum d {
        INACTIVE,
        FOREGROUND_RUNNING,
        FOREGROUND_ENDING,
        BACKGROUND_RUNNING,
        BACKGROUND_ENDING
    }

    public C6054k3(InterfaceC6036i3 interfaceC6036i3) {
        this.f16081c = interfaceC6036i3;
        if (this.f16079a == null) {
            this.f16079a = new HashMap();
        }
        this.f16079a.clear();
        this.f16079a.put(EnumC6128s6.SESSION_INFO, null);
        this.f16079a.put(EnumC6128s6.APP_STATE, null);
        this.f16079a.put(EnumC6128s6.APP_INFO, null);
        this.f16079a.put(EnumC6128s6.REPORTED_ID, null);
        this.f16079a.put(EnumC6128s6.DEVICE_PROPERTIES, null);
        this.f16079a.put(EnumC6128s6.SESSION_ID, null);
        this.f16079a = this.f16079a;
        this.f16080b = new AtomicBoolean(false);
    }

    /* renamed from: a */
    private static void m13154a(long j2, long j3, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("fl.session.elapsed.start.time", String.valueOf(j2));
        if (j3 != Long.MIN_VALUE) {
            hashMap.put("fl.session.elapsed.end.time", String.valueOf(j3));
            hashMap.put("fl.session.duration", String.valueOf(j3 - j2));
        }
        hashMap.put("fl.session.message", str);
        C6015g0.m13065a();
        C6015g0.m13068f("Session Duration", hashMap);
    }

    /* renamed from: c */
    private void m13155c(d dVar) {
        if (this.f16089k.equals(dVar)) {
            C5988d1.m13030c(3, "SessionRule", "Invalid state transition.");
            return;
        }
        C5988d1.m13030c(3, "SessionRule", "Previous session state: " + this.f16089k.name());
        this.f16089k = dVar;
        C5988d1.m13030c(3, "SessionRule", "Current session state: " + this.f16089k.name());
    }

    /* renamed from: d */
    private void m13156d(C6010f4 c6010f4) {
        if (!c6010f4.f15879f.equals(EnumC5997e0.SESSION_START)) {
            C5988d1.m13030c(3, "SessionRule", "Only generate session id during session start");
            return;
        }
        if (this.f16085g == Long.MIN_VALUE && this.f16079a.get(EnumC6128s6.SESSION_ID) == null) {
            C5988d1.m13030c(3, "SessionRule", "Generating Session Id:" + c6010f4.f15876c);
            this.f16085g = c6010f4.f15876c;
            this.f16086h = SystemClock.elapsedRealtime();
            this.f16088j = c6010f4.f15875b.f15845j == 1 ? 2 : 0;
            if (m13157f(this.f16085g)) {
                m13154a(this.f16086h, this.f16087i, "Generate Session Id");
                m13161m(C6057k6.m13169h(this.f16085g, this.f16086h, this.f16087i, this.f16088j));
            } else {
                C5988d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
            m13165e(true);
        }
    }

    /* renamed from: f */
    static boolean m13157f(long j2) {
        return j2 > 0;
    }

    /* renamed from: h */
    private void m13158h(long j2) {
        m13166g();
        this.f16087i = SystemClock.elapsedRealtime();
        if (m13157f(this.f16085g)) {
            m13154a(this.f16086h, this.f16087i, "Start Session Finalize Timer");
            m13161m(C6057k6.m13169h(this.f16085g, this.f16086h, this.f16087i, this.f16088j));
        } else {
            C5988d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
        }
        m13160l(j2);
    }

    /* renamed from: j */
    private static boolean m13159j(C6010f4 c6010f4) {
        return c6010f4.f15875b.equals(EnumC6006f0.FOREGROUND) && c6010f4.f15879f.equals(EnumC5997e0.SESSION_START);
    }

    /* renamed from: l */
    private synchronized void m13160l(long j2) {
        if (this.f16083e != null) {
            m13166g();
        }
        this.f16083e = new Timer("FlurrySessionTimer");
        c cVar = new c();
        this.f16084f = cVar;
        this.f16083e.schedule(cVar, j2);
    }

    /* renamed from: m */
    private void m13161m(InterfaceC6144u6 interfaceC6144u6) {
        if (this.f16081c != null) {
            C5988d1.m13030c(3, "SessionRule", "Appending Frame:" + interfaceC6144u6.mo13296d());
            this.f16081c.mo12959b(interfaceC6144u6);
        }
    }

    /* renamed from: n */
    private static boolean m13162n(C6010f4 c6010f4) {
        return c6010f4.f15875b.equals(EnumC6006f0.BACKGROUND) && c6010f4.f15879f.equals(EnumC5997e0.SESSION_START);
    }

    /* renamed from: o */
    private boolean m13163o() {
        Iterator<Map.Entry<EnumC6128s6, InterfaceC6144u6>> it = this.f16079a.entrySet().iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (it.next().getValue() == null) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: p */
    private void m13164p() {
        if (this.f16085g <= 0) {
            C5988d1.m13030c(6, "SessionRule", "Finalize session " + this.f16085g);
            return;
        }
        m13166g();
        C6015g0.m13065a().m13071e();
        this.f16087i = SystemClock.elapsedRealtime();
        if (m13157f(this.f16085g)) {
            m13167i(C6057k6.m13169h(this.f16085g, this.f16086h, this.f16087i, this.f16088j));
        } else {
            C5988d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
        }
        InterfaceC6045j3.a aVar = InterfaceC6045j3.a.REASON_SESSION_FINALIZE;
        m13167i(C6119r5.m13293h(aVar.ordinal(), aVar.f16030p));
        m13165e(false);
        m13168k();
    }

    @Override // com.flurry.sdk.InterfaceC6045j3
    /* renamed from: b */
    public final void mo13137b(InterfaceC6144u6 interfaceC6144u6) {
        if (interfaceC6144u6.mo12961a().equals(EnumC6128s6.FLUSH_FRAME)) {
            C6127s5 c6127s5 = (C6127s5) interfaceC6144u6.mo13298f();
            if (InterfaceC6045j3.a.REASON_SESSION_FINALIZE.f16030p.equals(c6127s5.f16331c)) {
                return;
            }
            if (!InterfaceC6045j3.a.REASON_STICKY_SET_COMPLETE.f16030p.equals(c6127s5.f16331c)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                m13154a(this.f16086h, elapsedRealtime, "Flush In Middle");
                m13167i(C6057k6.m13169h(this.f16085g, this.f16086h, elapsedRealtime, this.f16088j));
            }
            InterfaceC6144u6 interfaceC6144u62 = this.f16079a.get(EnumC6128s6.SESSION_ID);
            if (interfaceC6144u62 != null) {
                m13161m(interfaceC6144u62);
                return;
            }
            return;
        }
        if (interfaceC6144u6.mo12961a().equals(EnumC6128s6.REPORTING)) {
            C6010f4 c6010f4 = (C6010f4) interfaceC6144u6.mo13298f();
            int i2 = b.f16092a[this.f16089k.ordinal()];
            if (i2 == 1) {
                EnumC6006f0 enumC6006f0 = c6010f4.f15875b;
                EnumC6006f0 enumC6006f02 = EnumC6006f0.FOREGROUND;
                if (enumC6006f0.equals(enumC6006f02)) {
                    if (this.f16082d && !c6010f4.f15880g) {
                        this.f16082d = false;
                    }
                    if ((c6010f4.f15875b.equals(enumC6006f02) && c6010f4.f15879f.equals(EnumC5997e0.SESSION_END)) && (this.f16082d || !c6010f4.f15880g)) {
                        m13158h(c6010f4.f15878e);
                        m13155c(d.FOREGROUND_ENDING);
                    }
                }
            } else if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            C5988d1.m13030c(6, "SessionRule", "Unreachable Code");
                        } else if (m13159j(c6010f4)) {
                            this.f16082d = c6010f4.f15880g;
                            m13155c(d.FOREGROUND_RUNNING);
                            m13156d(c6010f4);
                        } else if (m13162n(c6010f4)) {
                            m13155c(d.BACKGROUND_RUNNING);
                            m13156d(c6010f4);
                        }
                    } else if (m13159j(c6010f4)) {
                        m13164p();
                        m13155c(d.FOREGROUND_RUNNING);
                        m13156d(c6010f4);
                    } else if (m13162n(c6010f4)) {
                        m13166g();
                        this.f16087i = Long.MIN_VALUE;
                        m13155c(d.BACKGROUND_RUNNING);
                    }
                } else if (m13159j(c6010f4)) {
                    m13164p();
                    m13155c(d.FOREGROUND_RUNNING);
                    m13156d(c6010f4);
                } else {
                    if (c6010f4.f15875b.equals(EnumC6006f0.BACKGROUND) && c6010f4.f15879f.equals(EnumC5997e0.SESSION_END)) {
                        m13158h(c6010f4.f15878e);
                        m13155c(d.BACKGROUND_ENDING);
                    }
                }
            } else if (m13159j(c6010f4)) {
                m13166g();
                this.f16087i = Long.MIN_VALUE;
                m13155c(d.FOREGROUND_RUNNING);
            }
        }
        if (interfaceC6144u6.mo12961a().equals(EnumC6128s6.ANALYTICS_ERROR) && ((C6133t3) interfaceC6144u6.mo13298f()).f16384h == C6125s3.a.UNRECOVERABLE_CRASH.f16324j) {
            m13166g();
            this.f16087i = SystemClock.elapsedRealtime();
            if (m13157f(this.f16085g)) {
                m13154a(this.f16086h, this.f16087i, "Process Crash");
                m13167i(C6057k6.m13169h(this.f16085g, this.f16086h, this.f16087i, this.f16088j));
            } else {
                C5988d1.m13030c(6, "SessionRule", "Session id is invalid. Not appending this session id frame.");
            }
        }
        if (interfaceC6144u6.mo12961a().equals(EnumC6128s6.CCPA_DELETION)) {
            InterfaceC6045j3.a aVar = InterfaceC6045j3.a.REASON_DATA_DELETION;
            m13161m(C6119r5.m13293h(aVar.ordinal(), aVar.f16030p));
        }
        EnumC6128s6 mo12961a = interfaceC6144u6.mo12961a();
        if (this.f16079a.containsKey(mo12961a)) {
            C5988d1.m13030c(3, "SessionRule", "Adding Sticky Frame:" + interfaceC6144u6.mo13296d());
            this.f16079a.put(mo12961a, interfaceC6144u6);
        }
        if (this.f16080b.get() || !m13163o()) {
            if (this.f16080b.get() && interfaceC6144u6.mo12961a().equals(EnumC6128s6.NOTIFICATION)) {
                C6015g0.m13065a();
                C6015g0.m13068f("Flush Token Refreshed", Collections.emptyMap());
                InterfaceC6045j3.a aVar2 = InterfaceC6045j3.a.REASON_PUSH_TOKEN_REFRESH;
                m13161m(C6119r5.m13293h(aVar2.ordinal(), aVar2.f16030p));
                return;
            }
            return;
        }
        this.f16080b.set(true);
        InterfaceC6045j3.a aVar3 = InterfaceC6045j3.a.REASON_STICKY_SET_COMPLETE;
        m13161m(C6119r5.m13293h(aVar3.ordinal(), aVar3.f16030p));
        int m13256e = C6098p2.m13256e("last_streaming_http_error_code", Integer.MIN_VALUE);
        String m13258g = C6098p2.m13258g("last_streaming_http_error_message", HttpUrl.FRAGMENT_ENCODE_SET);
        String m13258g2 = C6098p2.m13258g("last_streaming_http_report_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
        if (m13256e != Integer.MIN_VALUE) {
            C5980c2.m12989e(m13256e, m13258g, m13258g2, false);
            C6098p2.m13252a("last_streaming_http_error_code");
            C6098p2.m13252a("last_streaming_http_error_message");
            C6098p2.m13252a("last_streaming_http_report_identifier");
        }
        int m13256e2 = C6098p2.m13256e("last_legacy_http_error_code", Integer.MIN_VALUE);
        String m13258g3 = C6098p2.m13258g("last_legacy_http_error_message", HttpUrl.FRAGMENT_ENCODE_SET);
        String m13258g4 = C6098p2.m13258g("last_legacy_http_report_identifier", HttpUrl.FRAGMENT_ENCODE_SET);
        if (m13256e2 != Integer.MIN_VALUE) {
            C5980c2.m12989e(m13256e2, m13258g3, m13258g4, false);
            C6098p2.m13252a("last_legacy_http_error_code");
            C6098p2.m13252a("last_legacy_http_error_message");
            C6098p2.m13252a("last_legacy_http_report_identifier");
        }
        C6098p2.m13254c("last_streaming_session_id", this.f16085g);
        HashMap hashMap = new HashMap();
        hashMap.put("streaming.session.id", String.valueOf(this.f16085g));
        C6015g0.m13065a();
        C6015g0.m13068f("Session Ids", hashMap);
        C6015g0.m13065a().m13071e();
    }

    /* renamed from: e */
    final void m13165e(boolean z) {
        InterfaceC6036i3 interfaceC6036i3 = this.f16081c;
        if (interfaceC6036i3 != null) {
            interfaceC6036i3.mo12958a(new a(z));
        }
    }

    /* renamed from: g */
    final synchronized void m13166g() {
        Timer timer = this.f16083e;
        if (timer != null) {
            timer.cancel();
            this.f16083e = null;
        }
        TimerTask timerTask = this.f16084f;
        if (timerTask != null) {
            timerTask.cancel();
            this.f16084f = null;
        }
    }

    /* renamed from: i */
    final void m13167i(InterfaceC6144u6 interfaceC6144u6) {
        if (this.f16081c != null) {
            C5988d1.m13030c(3, "SessionRule", "Forwarding Frame:" + interfaceC6144u6.mo13296d());
            this.f16081c.mo12960c(interfaceC6144u6);
        }
    }

    /* renamed from: k */
    final void m13168k() {
        C5988d1.m13030c(3, "SessionRule", "Reset session rule");
        this.f16079a.put(EnumC6128s6.SESSION_ID, null);
        this.f16080b.set(false);
        this.f16085g = Long.MIN_VALUE;
        this.f16086h = Long.MIN_VALUE;
        this.f16087i = Long.MIN_VALUE;
        this.f16089k = d.INACTIVE;
        this.f16082d = false;
    }
}
