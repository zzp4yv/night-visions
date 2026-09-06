package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.x6 */
/* loaded from: classes2.dex */
final class C7831x6 {

    /* renamed from: a */
    private final Runnable f29000a = new Runnable(this) { // from class: com.google.android.gms.measurement.internal.w6

        /* renamed from: f */
        private final C7831x6 f28978f;

        {
            this.f28978f = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            final C7831x6 c7831x6 = this.f28978f;
            c7831x6.f29001b.mo22835g().m23201z(new Runnable(c7831x6) { // from class: com.google.android.gms.measurement.internal.z6

                /* renamed from: f */
                private final C7831x6 f29058f;

                {
                    this.f29058f = c7831x6;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C7831x6 c7831x62 = this.f29058f;
                    c7831x62.f29001b.mo22792d();
                    c7831x62.f29001b.mo22836h().m23144O().m23147a("Application backgrounded");
                    c7831x62.f29001b.mo22794p().m23303u0("auto", "_ab", new Bundle());
                }
            });
        }
    };

    /* renamed from: b */
    final /* synthetic */ zzjl f29001b;

    C7831x6(zzjl zzjlVar) {
        this.f29001b = zzjlVar;
    }

    /* renamed from: a */
    final void m22873a(long j2) {
        Handler handler;
        this.f29001b.mo22792d();
        if (this.f29001b.mo22841n().m23587r(zzap.f29110O0)) {
            handler = this.f29001b.f29349c;
            handler.removeCallbacks(this.f29000a);
        }
    }

    /* renamed from: b */
    final void m22874b(long j2) {
        Handler handler;
        if (this.f29001b.mo22841n().m23587r(zzap.f29110O0)) {
            handler = this.f29001b.f29349c;
            handler.postDelayed(this.f29000a, 2000L);
        }
    }
}
