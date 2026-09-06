package com.flurry.sdk;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import p241e.p252d.p253a.EnumC8745d;

/* renamed from: com.flurry.sdk.s3 */
/* loaded from: classes2.dex */
public final class C6125s3 extends AbstractC6120r6 {

    /* renamed from: e */
    private static final AtomicInteger f16319e = new AtomicInteger(0);

    /* renamed from: com.flurry.sdk.s3$a */
    public enum a {
        RECOVERABLE_ERROR(1),
        CAUGHT_EXCEPTION(2),
        UNRECOVERABLE_CRASH(3);


        /* renamed from: j */
        public int f16324j;

        a(int i2) {
            this.f16324j = i2;
        }
    }

    /* renamed from: com.flurry.sdk.s3$b */
    public enum b {
        NO_LOG(0),
        ANDROID_LOG_ATTACHED(2),
        NATIVE_CRASH_ATTACHED(3);


        /* renamed from: j */
        public int f16329j;

        b(int i2) {
            this.f16329j = i2;
        }
    }

    private C6125s3(InterfaceC6136t6 interfaceC6136t6) {
        super(interfaceC6136t6);
    }

    /* renamed from: h */
    public static EnumC8745d m13302h(C5968b c5968b) {
        if (c5968b == null) {
            C5988d1.m13041n("StreamingErrorFrame", "Error is null, do not send the frame.");
            return EnumC8745d.kFlurryEventFailed;
        }
        EnumC6103p7 enumC6103p7 = EnumC6103p7.UNCAUGHT_EXCEPTION_ID;
        boolean equals = enumC6103p7.f16268i.equals(c5968b.f15668a);
        List<C6076m7> list = equals ? c5968b.f15675h : null;
        int incrementAndGet = f16319e.incrementAndGet();
        String str = c5968b.f15668a;
        long j2 = c5968b.f15669b;
        String str2 = c5968b.f15670c;
        String str3 = c5968b.f15671d;
        String m13304j = m13304j(c5968b.f15672e);
        String str4 = c5968b.f15668a;
        C6125s3 c6125s3 = new C6125s3(new C6133t3(incrementAndGet, str, j2, str2, str3, m13304j, c5968b.f15672e != null ? enumC6103p7.f16268i.equals(str4) ? a.UNRECOVERABLE_CRASH.f16324j : a.CAUGHT_EXCEPTION.f16324j : EnumC6103p7.NATIVE_CRASH.f16268i.equals(str4) ? a.UNRECOVERABLE_CRASH.f16324j : a.RECOVERABLE_ERROR.f16324j, c5968b.f15672e == null ? b.NO_LOG.f16329j : b.ANDROID_LOG_ATTACHED.f16329j, c5968b.f15673f, c5968b.f15674g, C6085n7.m13210c(), list, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET));
        if (equals) {
            C6071m2.m13180a().f16133b.f16377a.m13385c(c6125s3);
        } else {
            C6071m2.m13180a().m13181b(c6125s3);
        }
        return EnumC8745d.kFlurryEventRecorded;
    }

    /* renamed from: i */
    public static C6125s3 m13303i(C6133t3 c6133t3) {
        return new C6125s3(c6133t3);
    }

    /* renamed from: j */
    private static String m13304j(Throwable th) {
        if (th == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append(stackTraceElement);
            sb.append(C6080n2.f16169a);
        }
        if (th.getCause() != null) {
            sb.append(C6080n2.f16169a);
            sb.append("Caused by: ");
            for (StackTraceElement stackTraceElement2 : th.getCause().getStackTrace()) {
                sb.append(stackTraceElement2);
                sb.append(C6080n2.f16169a);
            }
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static AtomicInteger m13305k() {
        return f16319e;
    }

    @Override // com.flurry.sdk.InterfaceC6144u6
    /* renamed from: a */
    public final EnumC6128s6 mo12961a() {
        return EnumC6128s6.ANALYTICS_ERROR;
    }
}
