package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzfd;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.s5 */
/* loaded from: classes2.dex */
final class C7785s5 extends AbstractC7670f7 {
    public C7785s5(zzkc zzkcVar) {
        super(zzkcVar);
    }

    /* renamed from: i */
    private static String m22850i(String str, String str2) {
        throw new SecurityException("This implementation should not be used.");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7670f7
    /* renamed from: v */
    protected final boolean mo22757v() {
        return false;
    }

    /* renamed from: w */
    public final byte[] m22851w(zzan zzanVar, String str) {
        C7733m7 c7733m7;
        zzbr.zzg.zza zzaVar;
        C7845z3 c7845z3;
        zzbr.zzf.zza zzaVar2;
        Bundle bundle;
        byte[] bArr;
        long j2;
        C7680h m22780a;
        mo22792d();
        this.f28874a.m23239s();
        Preconditions.m14372k(zzanVar);
        Preconditions.m14368g(str);
        if (!mo22841n().m23564B(str, zzap.f29162p0)) {
            mo22836h().m23144O().m23148b("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzanVar.f29077f) && !"_iapx".equals(zzanVar.f29077f)) {
            mo22836h().m23144O().m23149c("Generating a payload for this event is not available. package_name, event_name", str, zzanVar.f29077f);
            return null;
        }
        zzbr.zzf.zza m21749F = zzbr.zzf.m21749F();
        mo22785q().m22760w0();
        try {
            C7845z3 m22746j0 = mo22785q().m22746j0(str);
            if (m22746j0 == null) {
                mo22836h().m23144O().m23148b("Log and bundle not available. package_name", str);
                return new byte[0];
            }
            if (!m22746j0.m22917e0()) {
                mo22836h().m23144O().m23148b("Log and bundle disabled. package_name", str);
                return new byte[0];
            }
            zzbr.zzg.zza m21937I = zzbr.zzg.m21799R0().m21978w(1).m21937I("android");
            if (!TextUtils.isEmpty(m22746j0.m22940t())) {
                m21937I.m21969m0(m22746j0.m22940t());
            }
            if (!TextUtils.isEmpty(m22746j0.m22905X())) {
                m21937I.m21965h0(m22746j0.m22905X());
            }
            if (!TextUtils.isEmpty(m22746j0.m22901T())) {
                m21937I.m21973r0(m22746j0.m22901T());
            }
            if (m22746j0.m22903V() != -2147483648L) {
                m21937I.m21975t0((int) m22746j0.m22903V());
            }
            m21937I.m21968l0(m22746j0.m22907Z()).m21930E0(m22746j0.m22915d0());
            if (!TextUtils.isEmpty(m22746j0.m22882A())) {
                m21937I.m21932F0(m22746j0.m22882A());
            } else if (!TextUtils.isEmpty(m22746j0.m22885D())) {
                m21937I.m21950P0(m22746j0.m22885D());
            }
            m21937I.m21976u0(m22746j0.m22911b0());
            if (this.f28874a.m23236p() && zzx.m23559X() && mo22841n().m23592x(m21937I.m21926C0())) {
                m21937I.m21926C0();
                if (!TextUtils.isEmpty(null)) {
                    m21937I.m21948O0(null);
                }
            }
            Pair<String, Boolean> m22827v = mo22840m().m22827v(m22746j0.m22940t());
            if (m22746j0.m22930l() && m22827v != null && !TextUtils.isEmpty((CharSequence) m22827v.first)) {
                m21937I.m21977v0(m22850i((String) m22827v.first, Long.toString(zzanVar.f29080i)));
                Object obj = m22827v.second;
                if (obj != null) {
                    m21937I.m21939J(((Boolean) obj).booleanValue());
                }
            }
            mo22833e().m22807p();
            zzbr.zzg.zza m21956V = m21937I.m21956V(Build.MODEL);
            mo22833e().m22807p();
            m21956V.m21949P(Build.VERSION.RELEASE).m21967k0((int) mo22833e().m22952v()).m21959a0(mo22833e().m22953w());
            m21937I.m21982z0(m22850i(m22746j0.m22944x(), Long.toString(zzanVar.f29080i)));
            if (!TextUtils.isEmpty(m22746j0.m22894M())) {
                m21937I.m21936H0(m22746j0.m22894M());
            }
            String m22940t = m22746j0.m22940t();
            List<C7733m7> m22732I = mo22785q().m22732I(m22940t);
            Iterator<C7733m7> it = m22732I.iterator();
            while (true) {
                if (!it.hasNext()) {
                    c7733m7 = null;
                    break;
                }
                c7733m7 = it.next();
                if ("_lte".equals(c7733m7.f28779c)) {
                    break;
                }
            }
            if (c7733m7 == null || c7733m7.f28781e == null) {
                C7733m7 c7733m72 = new C7733m7(m22940t, "auto", "_lte", mo22837j().mo14608a(), 0L);
                m22732I.add(c7733m72);
                mo22785q().m22742T(c7733m72);
            }
            if (mo22841n().m23564B(m22940t, zzap.f29152k0)) {
                zzkg mo22784p = mo22784p();
                mo22784p.mo22836h().m23145P().m23147a("Checking account type status for ad personalization signals");
                if (mo22784p.mo22833e().m22956z()) {
                    String m22940t2 = m22746j0.m22940t();
                    if (m22746j0.m22930l() && mo22784p.mo22786r().m23182I(m22940t2)) {
                        mo22784p.mo22836h().m23144O().m23147a("Turning off ad personalization due to account type");
                        Iterator<C7733m7> it2 = m22732I.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if ("_npa".equals(it2.next().f28779c)) {
                                it2.remove();
                                break;
                            }
                        }
                        m22732I.add(new C7733m7(m22940t2, "auto", "_npa", mo22784p.mo22837j().mo14608a(), 1L));
                    }
                }
            }
            zzbr.zzk[] zzkVarArr = new zzbr.zzk[m22732I.size()];
            for (int i2 = 0; i2 < m22732I.size(); i2++) {
                zzbr.zzk.zza m22077B = zzbr.zzk.m22062X().m22078C(m22732I.get(i2).f28779c).m22077B(m22732I.get(i2).f28780d);
                mo22784p().m23486K(m22077B, m22732I.get(i2).f28781e);
                zzkVarArr[i2] = (zzbr.zzk) ((zzfd) m22077B.mo22283y());
            }
            m21937I.m21947O(Arrays.asList(zzkVarArr));
            Bundle m22960Y = zzanVar.f29078g.m22960Y();
            m22960Y.putLong("_c", 1L);
            mo22836h().m23144O().m23147a("Marking in-app purchase as real-time");
            m22960Y.putLong("_r", 1L);
            m22960Y.putString("_o", zzanVar.f29079h);
            if (mo22839l().m23550v0(m21937I.m21926C0())) {
                mo22839l().m23529L(m22960Y, "_dbg", 1L);
                mo22839l().m23529L(m22960Y, "_r", 1L);
            }
            C7680h m22726D = mo22785q().m22726D(str, zzanVar.f29077f);
            if (m22726D == null) {
                c7845z3 = m22746j0;
                zzaVar = m21937I;
                zzaVar2 = m21749F;
                bundle = m22960Y;
                bArr = null;
                m22780a = new C7680h(str, zzanVar.f29077f, 0L, 0L, zzanVar.f29080i, 0L, null, null, null, null);
                j2 = 0;
            } else {
                zzaVar = m21937I;
                c7845z3 = m22746j0;
                zzaVar2 = m21749F;
                bundle = m22960Y;
                bArr = null;
                j2 = m22726D.f28667f;
                m22780a = m22726D.m22780a(zzanVar.f29080i);
            }
            mo22785q().m22736N(m22780a);
            zzak zzakVar = new zzak(this.f28874a, zzanVar.f29079h, str, zzanVar.f29077f, zzanVar.f29080i, j2, bundle);
            zzbr.zzc.zza m21703J = zzbr.zzc.m21681c0().m21695B(zzakVar.f29073d).m21698E(zzakVar.f29071b).m21703J(zzakVar.f29074e);
            Iterator<String> it3 = zzakVar.f29075f.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                zzbr.zze.zza m21742C = zzbr.zze.m21728T().m21742C(next);
                mo22784p().m23485J(m21742C, zzakVar.f29075f.m22959W(next));
                m21703J.m21696C(m21742C);
            }
            zzbr.zzg.zza zzaVar3 = zzaVar;
            zzaVar3.m21927D(m21703J).m21929E(zzbr.zzh.m21983B().m21989w(zzbr.zzd.m21709B().m21716w(m22780a.f28664c).m21715A(zzanVar.f29077f)));
            zzaVar3.m21955U(mo22783o().m22812w(c7845z3.m22940t(), Collections.emptyList(), zzaVar3.m21961c0(), Long.valueOf(m21703J.m21706M())));
            if (m21703J.m21705L()) {
                zzaVar3.m21945N(m21703J.m21706M()).m21954T(m21703J.m21706M());
            }
            long m22899R = c7845z3.m22899R();
            if (m22899R != 0) {
                zzaVar3.m21964g0(m22899R);
            }
            long m22897P = c7845z3.m22897P();
            if (m22897P != 0) {
                zzaVar3.m21957X(m22897P);
            } else if (m22899R != 0) {
                zzaVar3.m21957X(m22899R);
            }
            c7845z3.m22925i0();
            zzaVar3.m21971o0((int) c7845z3.m22919f0()).m21972q0(mo22841n().m23565C()).m21925C(mo22837j().mo14608a()).m21951Q(true);
            zzbr.zzf.zza zzaVar4 = zzaVar2;
            zzaVar4.m21754w(zzaVar3);
            C7845z3 c7845z32 = c7845z3;
            c7845z32.m22908a(zzaVar3.m21966j0());
            c7845z32.m22937q(zzaVar3.m21970n0());
            mo22785q().m22737O(c7845z32);
            mo22785q().m22759w();
            try {
                return mo22784p().m23490W(((zzbr.zzf) ((zzfd) zzaVar4.mo22283y())).m22136j());
            } catch (IOException e2) {
                mo22836h().m23137H().m23149c("Data loss. Failed to bundle and serialize. appId", zzet.m23131x(str), e2);
                return bArr;
            }
        } catch (SecurityException e3) {
            mo22836h().m23144O().m23148b("Resettable device id encryption failed", e3.getMessage());
            return new byte[0];
        } catch (SecurityException e4) {
            mo22836h().m23144O().m23148b("app instance id encryption failed", e4.getMessage());
            return new byte[0];
        } finally {
            mo22785q().m22721A0();
        }
    }
}
