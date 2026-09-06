package io.sentry.android.core;

import android.content.Context;
import io.sentry.InterfaceC9637w1;
import io.sentry.android.core.internal.util.C9281k;
import io.sentry.transport.InterfaceC9582s;

/* compiled from: AndroidTransportGate.java */
/* renamed from: io.sentry.android.core.n0 */
/* loaded from: classes2.dex */
final class C9301n0 implements InterfaceC9582s {

    /* renamed from: a */
    private final Context f36078a;

    /* renamed from: b */
    private final InterfaceC9637w1 f36079b;

    /* compiled from: AndroidTransportGate.java */
    /* renamed from: io.sentry.android.core.n0$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f36080a;

        static {
            int[] iArr = new int[C9281k.a.values().length];
            f36080a = iArr;
            try {
                iArr[C9281k.a.CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36080a[C9281k.a.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36080a[C9281k.a.NO_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C9301n0(Context context, InterfaceC9637w1 interfaceC9637w1) {
        this.f36078a = context;
        this.f36079b = interfaceC9637w1;
    }

    /* renamed from: a */
    boolean m30352a(C9281k.a aVar) {
        int i2 = a.f36080a[aVar.ordinal()];
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    @Override // io.sentry.transport.InterfaceC9582s
    public boolean isConnected() {
        return m30352a(C9281k.m30281b(this.f36078a, this.f36079b));
    }
}
