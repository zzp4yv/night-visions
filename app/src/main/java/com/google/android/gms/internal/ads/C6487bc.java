package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bc */
/* loaded from: classes2.dex */
final class C6487bc extends zzcvs {

    /* renamed from: a */
    private zzcwx f18312a;

    /* renamed from: b */
    private zzdtu<zzcvo> f18313b;

    /* renamed from: c */
    private zzdtu<String> f18314c;

    /* renamed from: d */
    private zzdtu<zzcvy> f18315d;

    /* renamed from: e */
    private zzdtu<zzcwc> f18316e;

    /* renamed from: f */
    private zzdtu<zzcwj> f18317f;

    /* renamed from: g */
    private zzdtu<Boolean> f18318g;

    /* renamed from: h */
    private zzdtu<ApplicationInfo> f18319h;

    /* renamed from: i */
    private zzdtu<zzcwq> f18320i;

    /* renamed from: j */
    private zzdtu<zzcwu> f18321j;

    /* renamed from: k */
    private zzdtu<zzcxh> f18322k;

    /* renamed from: l */
    private zzdtu<String> f18323l;

    /* renamed from: m */
    private zzdtu<zzcez> f18324m;

    /* renamed from: n */
    private zzdtu<zzcez> f18325n;

    /* renamed from: o */
    private zzdtu<zzcez> f18326o;

    /* renamed from: p */
    private zzdtu<zzcez> f18327p;

    /* renamed from: q */
    private zzdtu<Map<zzczs, zzcez>> f18328q;

    /* renamed from: r */
    private zzdtu<Set<zzbuz<zzczz>>> f18329r;

    /* renamed from: s */
    private zzdtu<Set<zzbuz<zzczz>>> f18330s;

    /* renamed from: t */
    private zzdtu f18331t;

    /* renamed from: u */
    private zzdtu<zzczt> f18332u;

    /* renamed from: v */
    private final /* synthetic */ zzbkc f18333v;

    private C6487bc(zzbkc zzbkcVar, zzcwx zzcwxVar) {
        zzdtu zzdtuVar;
        zzdtu zzdtuVar2;
        zzdtu zzdtuVar3;
        zzdtu zzdtuVar4;
        zzdtu zzdtuVar5;
        zzdtu zzdtuVar6;
        zzdtu zzdtuVar7;
        zzdtu zzdtuVar8;
        zzdtu zzdtuVar9;
        this.f18333v = zzbkcVar;
        this.f18312a = zzcwxVar;
        zzbln m17870a = zzbln.m17870a();
        zzdtuVar = zzbkcVar.f23149i;
        zzdtuVar2 = zzbkcVar.f23145e;
        this.f18313b = new zzcvr(m17870a, zzdtuVar, zzdtuVar2, zzcyx.m19087a());
        this.f18314c = new zzcwy(zzcwxVar);
        zzbjy m17801a = zzbjy.m17801a();
        zzdtuVar3 = zzbkcVar.f23149i;
        this.f18315d = new zzcwa(m17801a, zzdtuVar3, this.f18314c, zzcyx.m19087a());
        zzblj m17862a = zzblj.m17862a();
        zzcyx m19087a = zzcyx.m19087a();
        zzdtuVar4 = zzbkcVar.f23149i;
        this.f18316e = new zzcwe(m17862a, m19087a, zzdtuVar4);
        this.f18317f = new zzcwl(zzblk.m17864a(), zzcyx.m19087a(), this.f18314c);
        this.f18318g = new zzcxa(zzcwxVar);
        this.f18319h = new zzcwz(zzcwxVar);
        zzbll m17866a = zzbll.m17866a();
        zzdtuVar5 = zzbkcVar.f23145e;
        this.f18320i = new zzcws(m17866a, zzdtuVar5, this.f18318g, this.f18319h);
        zzblm m17868a = zzblm.m17868a();
        zzdtuVar6 = zzbkcVar.f23145e;
        zzdtuVar7 = zzbkcVar.f23149i;
        this.f18321j = new zzcww(m17868a, zzdtuVar6, zzdtuVar7);
        this.f18322k = new zzcxj(zzcyx.m19087a());
        this.f18323l = new zzcxb(zzcwxVar);
        this.f18324m = zzdth.m19867a(zzcet.m18710a());
        this.f18325n = zzdth.m19867a(zzces.m18709a());
        this.f18326o = zzdth.m19867a(zzceu.m18711a());
        this.f18327p = zzdth.m19867a(zzcev.m18712a());
        this.f18328q = zzdtk.m19870a(4).m19871a(zzczs.GMS_SIGNALS, this.f18324m).m19871a(zzczs.BUILD_URL, this.f18325n).m19871a(zzczs.HTTP, this.f18326o).m19871a(zzczs.PRE_PROCESS, this.f18327p).m19872b();
        zzdtu<String> zzdtuVar10 = this.f18323l;
        zzdtuVar8 = zzbkcVar.f23149i;
        this.f18329r = zzdth.m19867a(new zzcew(zzdtuVar10, zzdtuVar8, zzcyx.m19087a(), this.f18328q));
        zzdtq m19883c = zzdtq.m19880a(0, 1).m19882b(this.f18329r).m19883c();
        this.f18330s = m19883c;
        this.f18331t = zzdab.m19129a(m19883c);
        zzcyx m19087a2 = zzcyx.m19087a();
        zzdtuVar9 = zzbkcVar.f23145e;
        this.f18332u = zzdth.m19867a(zzdaa.m19128a(m19087a2, zzdtuVar9, this.f18331t));
    }

    /* renamed from: d */
    private final zzcwn m14942d() {
        return new zzcwn(zzbli.m17861a(), zzcyx.m19088b(), (List) zzdto.m19874b(this.f18312a.m19009e(), "Cannot return null from a non-@Nullable @Provides method"));
    }

    /* renamed from: e */
    private final zzcvu m14943e() {
        return new zzcvu(zzbln.m17871b(), zzcyx.m19088b(), (String) zzdto.m19874b(this.f18312a.m19006b(), "Cannot return null from a non-@Nullable @Provides method"), this.f18312a.m19007c());
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* renamed from: a */
    public final zzcvb<JSONObject> mo14944a() {
        zzdtu zzdtuVar;
        zzdtu zzdtuVar2;
        zzdtu zzdtuVar3;
        zzdtu zzdtuVar4;
        zzbjn zzbjnVar;
        zzdtu zzdtuVar5;
        zzbjn zzbjnVar2;
        zzdtu zzdtuVar6;
        zzdtu zzdtuVar7;
        zzdtu zzdtuVar8;
        zzbjn zzbjnVar3;
        zzbjn zzbjnVar4;
        zzdtu zzdtuVar9;
        zzbbl m19088b = zzcyx.m19088b();
        zzdtp m19876d = zzdtp.m19876d(11);
        zzcwj zzcwjVar = new zzcwj(zzblk.m17865b(), zzcyx.m19088b(), zzcwy.m19012a(this.f18312a));
        zzdtuVar = this.f18333v.f23145e;
        zzdtp m19877a = m19876d.m19877a((zzcva) zzdto.m19874b(new zzctz(zzcwjVar, 0L, (ScheduledExecutorService) zzdtuVar.get()), "Cannot return null from a non-@Nullable @Provides method"));
        zzamh m17867b = zzbll.m17867b();
        zzdtuVar2 = this.f18333v.f23145e;
        zzcwq zzcwqVar = new zzcwq(m17867b, (ScheduledExecutorService) zzdtuVar2.get(), this.f18312a.m19008d(), zzcwz.m19013a(this.f18312a));
        zzdtuVar3 = this.f18333v.f23145e;
        zzdtp m19877a2 = m19877a.m19877a((zzcva) zzdto.m19874b(new zzctz(zzcwqVar, ((Long) zzyt.m20848e().m16421c(zzacu.f21733X2)).longValue(), (ScheduledExecutorService) zzdtuVar3.get()), "Cannot return null from a non-@Nullable @Provides method"));
        zzaql m17869b = zzblm.m17869b();
        zzdtuVar4 = this.f18333v.f23145e;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zzdtuVar4.get();
        zzbjnVar = this.f18333v.f23142b;
        zzcwu zzcwuVar = new zzcwu(m17869b, scheduledExecutorService, zzbjq.m17799a(zzbjnVar));
        zzdtuVar5 = this.f18333v.f23145e;
        zzdtp m19877a3 = m19877a2.m19877a((zzcva) zzdto.m19874b(new zzctz(zzcwuVar, ((Long) zzyt.m20848e().m16421c(zzacu.f21836n3)).longValue(), (ScheduledExecutorService) zzdtuVar5.get()), "Cannot return null from a non-@Nullable @Provides method"));
        zzawi m17871b = zzbln.m17871b();
        zzbjnVar2 = this.f18333v.f23142b;
        Context m17799a = zzbjq.m17799a(zzbjnVar2);
        zzdtuVar6 = this.f18333v.f23145e;
        zzcvo zzcvoVar = new zzcvo(m17871b, m17799a, (ScheduledExecutorService) zzdtuVar6.get(), zzcyx.m19088b());
        zzdtuVar7 = this.f18333v.f23145e;
        zzdtp m19877a4 = m19877a3.m19877a((zzcva) zzdto.m19874b(new zzctz(zzcvoVar, 0L, (ScheduledExecutorService) zzdtuVar7.get()), "Cannot return null from a non-@Nullable @Provides method"));
        zzcxh zzcxhVar = new zzcxh(zzcyx.m19088b());
        zzdtuVar8 = this.f18333v.f23145e;
        zzdtp m19877a5 = m19877a4.m19877a((zzcva) zzdto.m19874b(new zzctz(zzcxhVar, 0L, (ScheduledExecutorService) zzdtuVar8.get()), "Cannot return null from a non-@Nullable @Provides method")).m19877a(zzcxe.m19014a());
        zzbjnVar3 = this.f18333v.f23142b;
        zzdtp m19877a6 = m19877a5.m19877a(new zzcvy(null, zzbjq.m17799a(zzbjnVar3), zzcwy.m19012a(this.f18312a), zzcyx.m19088b()));
        zzwa m17863b = zzblj.m17863b();
        zzbbl m19088b2 = zzcyx.m19088b();
        zzbjnVar4 = this.f18333v.f23142b;
        zzdtp m19877a7 = m19877a6.m19877a(new zzcwc(m17863b, m19088b2, zzbjq.m17799a(zzbjnVar4))).m19877a(m14942d()).m19877a(m14943e());
        zzdtuVar9 = this.f18333v.f23158r;
        return new zzcvb<>(m19088b, m19877a7.m19877a((zzcva) zzdtuVar9.get()).m19879c());
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* renamed from: b */
    public final zzcvb<JSONObject> mo14945b() {
        zzdtu zzdtuVar;
        zzdtuVar = this.f18333v.f23158r;
        return zzcxf.m19015a(zzdtuVar.get(), m14943e(), m14942d(), zzdth.m19868b(this.f18313b), zzdth.m19868b(this.f18315d), zzdth.m19868b(this.f18316e), zzdth.m19868b(this.f18317f), zzdth.m19868b(this.f18320i), zzdth.m19868b(this.f18321j), zzdth.m19868b(this.f18322k), zzcyx.m19088b());
    }

    @Override // com.google.android.gms.internal.ads.zzcvs
    /* renamed from: c */
    public final zzczt mo14946c() {
        return this.f18332u.get();
    }
}
