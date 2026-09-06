package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.su */
/* loaded from: classes2.dex */
final class C7134su implements InterfaceC7211ux {

    /* renamed from: a */
    private final zzdni f20541a;

    private C7134su(zzdni zzdniVar) {
        zzdni zzdniVar2 = (zzdni) zzdod.m19743d(zzdniVar, "output");
        this.f20541a = zzdniVar2;
        zzdniVar2.f25672c = this;
    }

    /* renamed from: a */
    public static C7134su m15853a(zzdni zzdniVar) {
        C7134su c7134su = zzdniVar.f25672c;
        return c7134su != null ? c7134su : new C7134su(zzdniVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: A */
    public final void mo15854A(int i2, List<String> list) throws IOException {
        int i3 = 0;
        if (!(list instanceof zzdot)) {
            while (i3 < list.size()) {
                this.f20541a.mo19671R(i2, list.get(i3));
                i3++;
            }
            return;
        }
        zzdot zzdotVar = (zzdot) list;
        while (i3 < list.size()) {
            Object mo19767k1 = zzdotVar.mo19767k1(i3);
            if (mo19767k1 instanceof String) {
                this.f20541a.mo19671R(i2, (String) mo19767k1);
            } else {
                this.f20541a.mo19682g(i2, (zzdmr) mo19767k1);
            }
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: B */
    public final void mo15855B(int i2, long j2) throws IOException {
        this.f20541a.mo19695x0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: C */
    public final void mo15856C(int i2) throws IOException {
        this.f20541a.mo19665H0(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: D */
    public final void mo15857D(int i2, int i3) throws IOException {
        this.f20541a.mo19688l(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: E */
    public final void mo15858E(int i2, double d2) throws IOException {
        this.f20541a.m19661C(i2, d2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: F */
    public final int mo15859F() {
        return zzdob.zze.f25769l;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: G */
    public final void mo15860G(int i2, Object obj) throws IOException {
        if (obj instanceof zzdmr) {
            this.f20541a.mo19662D(i2, (zzdmr) obj);
        } else {
            this.f20541a.mo19663E(i2, (zzdpk) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: H */
    public final void mo15861H(int i2, int i3) throws IOException {
        this.f20541a.mo19688l(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: I */
    public final void mo15862I(int i2, zzdmr zzdmrVar) throws IOException {
        this.f20541a.mo19682g(i2, zzdmrVar);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: J */
    public final void mo15863J(int i2, long j2) throws IOException {
        this.f20541a.mo19690t0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: K */
    public final void mo15864K(int i2, int i3) throws IOException {
        this.f20541a.mo19667J0(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: L */
    public final void mo15865L(int i2, long j2) throws IOException {
        this.f20541a.mo19690t0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: M */
    public final void mo15866M(int i2, long j2) throws IOException {
        this.f20541a.mo19695x0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: N */
    public final void mo15867N(int i2, int i3) throws IOException {
        this.f20541a.mo19666I0(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: O */
    public final void mo15868O(int i2, int i3) throws IOException {
        this.f20541a.m19668K0(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: P */
    public final void mo15869P(int i2, long j2) throws IOException {
        this.f20541a.m19692u0(i2, j2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: Q */
    public final void mo15870Q(int i2) throws IOException {
        this.f20541a.mo19665H0(i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: R */
    public final void mo15871R(int i2, boolean z) throws IOException {
        this.f20541a.mo19694v0(i2, z);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: S */
    public final void mo15872S(int i2, List<?> list, InterfaceC6877lw interfaceC6877lw) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mo15874U(i2, list.get(i3), interfaceC6877lw);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: T */
    public final void mo15873T(int i2, int i3) throws IOException {
        this.f20541a.mo19666I0(i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: U */
    public final void mo15874U(int i2, Object obj, InterfaceC6877lw interfaceC6877lw) throws IOException {
        zzdni zzdniVar = this.f20541a;
        zzdniVar.mo19665H0(i2, 3);
        interfaceC6877lw.mo14825e((zzdpk) obj, zzdniVar.f25672c);
        zzdniVar.mo19665H0(i2, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: V */
    public final <K, V> void mo15875V(int i2, C7172tv<K, V> c7172tv, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f20541a.mo19665H0(i2, 2);
            this.f20541a.mo19679e0(zzdpc.m19770a(c7172tv, entry.getKey(), entry.getValue()));
            zzdpc.m19771b(this.f20541a, c7172tv, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: W */
    public final void mo15876W(int i2, List<?> list, InterfaceC6877lw interfaceC6877lw) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            mo15878Y(i2, list.get(i3), interfaceC6877lw);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: X */
    public final void mo15877X(int i2, String str) throws IOException {
        this.f20541a.mo19671R(i2, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: Y */
    public final void mo15878Y(int i2, Object obj, InterfaceC6877lw interfaceC6877lw) throws IOException {
        this.f20541a.mo19685i(i2, (zzdpk) obj, interfaceC6877lw);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: i */
    public final void mo15879i(int i2, List<Boolean> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19694v0(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19616G(list.get(i5).booleanValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.m19664F(list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: j */
    public final void mo15880j(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19666I0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19636i0(list.get(i5).intValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.mo19676b0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: k */
    public final void mo15881k(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19666I0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19643n0(list.get(i5).intValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.mo19676b0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: l */
    public final void mo15882l(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19690t0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19626V(list.get(i5).longValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.mo19672S(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: m */
    public final void mo15883m(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19695x0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19630Z(list.get(i5).longValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.mo19674U(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: n */
    public final void mo15884n(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19688l(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19639l0(list.get(i5).intValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.mo19683g0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: o */
    public final void mo15885o(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19667J0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19637j0(list.get(i5).intValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.mo19679e0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: p */
    public final void mo15886p(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19688l(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19641m0(list.get(i5).intValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.mo19683g0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: r */
    public final void mo15887r(int i2, float f2) throws IOException {
        this.f20541a.m19680f(i2, f2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: s */
    public final void mo15888s(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19695x0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19629Y(list.get(i5).longValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.mo19674U(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: t */
    public final void mo15889t(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.m19692u0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19628X(list.get(i5).longValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.m19673T(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: u */
    public final void mo15890u(int i2, List<Long> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.mo19690t0(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19627W(list.get(i5).longValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.mo19672S(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: v */
    public final void mo15891v(int i2, List<Integer> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.m19668K0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19638k0(list.get(i5).intValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.m19681f0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: w */
    public final void mo15892w(int i2, List<Double> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.m19661C(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19618H(list.get(i5).doubleValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.m19660B(list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: x */
    public final void mo15893x(int i2, List<zzdmr> list) throws IOException {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.f20541a.mo19682g(i2, list.get(i3));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7211ux
    /* renamed from: z */
    public final void mo15894z(int i2, List<Float> list, boolean z) throws IOException {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.f20541a.m19680f(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.f20541a.mo19665H0(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            i4 += zzdni.m19652s0(list.get(i5).floatValue());
        }
        this.f20541a.mo19679e0(i4);
        while (i3 < list.size()) {
            this.f20541a.m19678d0(list.get(i3).floatValue());
            i3++;
        }
    }
}
