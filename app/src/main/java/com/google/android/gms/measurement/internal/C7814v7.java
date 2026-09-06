package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzbj;
import com.google.android.gms.internal.measurement.zzbr;

/* compiled from: com.google.android.gms:play-services-measurement@@17.2.0 */
/* renamed from: com.google.android.gms.measurement.internal.v7 */
/* loaded from: classes2.dex */
final class C7814v7 extends AbstractC7823w7 {

    /* renamed from: g */
    private zzbj.zze f28964g;

    /* renamed from: h */
    private final /* synthetic */ C7769q7 f28965h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7814v7(C7769q7 c7769q7, String str, int i2, zzbj.zze zzeVar) {
        super(str, i2);
        this.f28965h = c7769q7;
        this.f28964g = zzeVar;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC7823w7
    /* renamed from: a */
    final int mo22852a() {
        return this.f28964g.m21572E();
    }

    /* renamed from: i */
    final boolean m22863i(Long l, zzbr.zzk zzkVar, boolean z) {
        boolean m23593y = this.f28965h.mo22841n().m23593y(this.f28979a, zzap.f29176w0);
        boolean m23593y2 = this.f28965h.mo22841n().m23593y(this.f28979a, zzap.f29086C0);
        boolean m21575H = this.f28964g.m21575H();
        boolean m21576I = this.f28964g.m21576I();
        boolean z2 = m23593y && this.f28964g.m21578K();
        boolean z3 = m21575H || m21576I || z2;
        Boolean bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (z && !z3) {
            this.f28965h.mo22836h().m23145P().m23149c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f28980b), this.f28964g.m21571D() ? Integer.valueOf(this.f28964g.m21572E()) : null);
            return true;
        }
        zzbj.zzc m21574G = this.f28964g.m21574G();
        boolean m21549I = m21574G.m21549I();
        if (zzkVar.m22072T()) {
            if (m21574G.m21546F()) {
                bool = AbstractC7823w7.m22866d(AbstractC7823w7.m22865c(zzkVar.m22073U(), m21574G.m21547G()), m21549I);
            } else {
                this.f28965h.mo22836h().m23140K().m23148b("No number filter for long property. property", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()));
            }
        } else if (zzkVar.m22074V()) {
            if (m21574G.m21546F()) {
                bool = AbstractC7823w7.m22866d(AbstractC7823w7.m22864b(zzkVar.m22075W(), m21574G.m21547G()), m21549I);
            } else {
                this.f28965h.mo22836h().m23140K().m23148b("No number filter for double property. property", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()));
            }
        } else if (!zzkVar.m22070R()) {
            this.f28965h.mo22836h().m23140K().m23148b("User property has no value, property", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()));
        } else if (m21574G.m21544D()) {
            bool = AbstractC7823w7.m22866d(AbstractC7823w7.m22869g(zzkVar.m22071S(), m21574G.m21545E(), this.f28965h.mo22836h()), m21549I);
        } else if (!m21574G.m21546F()) {
            this.f28965h.mo22836h().m23140K().m23148b("No string or number filter defined. property", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()));
        } else if (zzkg.m23476S(zzkVar.m22071S())) {
            bool = AbstractC7823w7.m22866d(AbstractC7823w7.m22867e(zzkVar.m22071S(), m21574G.m21547G()), m21549I);
        } else {
            this.f28965h.mo22836h().m23140K().m23149c("Invalid user property value for Numeric number filter. property, value", this.f28965h.mo22838k().m23120B(zzkVar.m22069P()), zzkVar.m22071S());
        }
        this.f28965h.mo22836h().m23145P().m23148b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f28981c = Boolean.TRUE;
        if (m23593y && z2 && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.f28964g.m21575H()) {
            this.f28982d = bool;
        }
        if (bool.booleanValue() && z3 && zzkVar.m22067I()) {
            long m22068J = zzkVar.m22068J();
            if (m23593y2 && l != null) {
                m22068J = l.longValue();
            }
            if (m21576I) {
                this.f28984f = Long.valueOf(m22068J);
            } else {
                this.f28983e = Long.valueOf(m22068J);
            }
        }
        return true;
    }
}
