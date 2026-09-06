package com.flurry.sdk;

import android.os.Bundle;
import com.flurry.sdk.C6095p;
import java.util.HashMap;

/* renamed from: com.flurry.sdk.h7 */
/* loaded from: classes2.dex */
public final class C6031h7 extends C5994d7<C6040i7> {

    /* renamed from: p */
    private ComponentCallbacks2C6104q f15954p;

    /* renamed from: q */
    private C6040i7 f15955q;

    /* renamed from: r */
    protected InterfaceC6013f7<C6095p> f15956r;

    /* renamed from: com.flurry.sdk.h7$a */
    final class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6013f7 f15957h;

        /* renamed from: i */
        final /* synthetic */ C6040i7 f15958i;

        a(InterfaceC6013f7 interfaceC6013f7, C6040i7 c6040i7) {
            this.f15957h = interfaceC6013f7;
            this.f15958i = c6040i7;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            this.f15957h.mo12962a(this.f15958i);
        }
    }

    /* renamed from: com.flurry.sdk.h7$b */
    final class b implements InterfaceC6013f7<C6095p> {
        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6013f7
        /* renamed from: a */
        public final /* synthetic */ void mo12962a(C6095p c6095p) {
            Bundle bundle;
            C6095p c6095p2 = c6095p;
            int i2 = c.f15961a[c6095p2.f16208a.ordinal()];
            if (i2 == 1) {
                C6031h7.m13091x(C6031h7.this, true);
                return;
            }
            if (i2 == 2) {
                C6031h7.m13091x(C6031h7.this, false);
            } else if (i2 == 3 && (bundle = c6095p2.f16209b) != null && bundle.containsKey("trim_memory_level") && bundle.getInt("trim_memory_level") == 20) {
                C6031h7.m13091x(C6031h7.this, false);
            }
        }
    }

    /* renamed from: com.flurry.sdk.h7$c */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f15961a;

        static {
            int[] iArr = new int[C6095p.a.values().length];
            f15961a = iArr;
            try {
                iArr[C6095p.a.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15961a[C6095p.a.APP_BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15961a[C6095p.a.TRIM_MEMORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C6031h7(ComponentCallbacks2C6104q componentCallbacks2C6104q) {
        super("AppStateChangeProvider");
        this.f15955q = null;
        this.f15956r = new b();
        this.f15954p = componentCallbacks2C6104q;
        EnumC6022g7 enumC6022g7 = EnumC6022g7.UNKNOWN;
        this.f15955q = new C6040i7(enumC6022g7, enumC6022g7);
        this.f15954p.mo13050v(this.f15956r);
    }

    /* renamed from: x */
    static /* synthetic */ void m13091x(C6031h7 c6031h7, boolean z) {
        EnumC6022g7 enumC6022g7 = z ? EnumC6022g7.FOREGROUND : EnumC6022g7.BACKGROUND;
        EnumC6022g7 enumC6022g72 = c6031h7.f15955q.f16000b;
        if (enumC6022g72 != enumC6022g7) {
            c6031h7.f15955q = new C6040i7(enumC6022g72, enumC6022g7);
            c6031h7.m13093a();
        }
    }

    /* renamed from: z */
    private void m13092z() {
        HashMap hashMap = new HashMap();
        hashMap.put("previous_state", this.f15955q.f15999a.name());
        hashMap.put("current_state", this.f15955q.f16000b.name());
        C6015g0.m13065a();
        C6015g0.m13068f("AppStateChangeProvider: app state change", hashMap);
    }

    /* renamed from: a */
    public final void m13093a() {
        C5988d1.m13030c(2, "AppStateChangeProvider", "AppStateChangeRule: prev " + this.f15955q.f15999a + " stateData.currentState:" + this.f15955q.f16000b);
        m13092z();
        C6040i7 c6040i7 = this.f15955q;
        m13048t(new C6040i7(c6040i7.f15999a, c6040i7.f16000b));
    }

    @Override // com.flurry.sdk.C5994d7
    /* renamed from: v */
    public final void mo13050v(InterfaceC6013f7<C6040i7> interfaceC6013f7) {
        super.mo13050v(interfaceC6013f7);
        mo13007m(new a(interfaceC6013f7, this.f15955q));
    }

    /* renamed from: y */
    public final EnumC6022g7 m13094y() {
        C6040i7 c6040i7 = this.f15955q;
        return c6040i7 == null ? EnumC6022g7.UNKNOWN : c6040i7.f16000b;
    }
}
