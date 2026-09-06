package com.google.firebase.crashlytics.internal.p183n;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.ProcessDetailsProvider;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8279i;
import com.google.firebase.crashlytics.internal.p191u.C8287e;
import com.google.firebase.crashlytics.internal.p191u.InterfaceC8286d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: CrashlyticsReportDataCapture.java */
/* renamed from: com.google.firebase.crashlytics.h.n.a0 */
/* loaded from: classes2.dex */
public class C8160a0 {

    /* renamed from: a */
    private static final Map<String, Integer> f30874a;

    /* renamed from: b */
    static final String f30875b;

    /* renamed from: c */
    private final Context f30876c;

    /* renamed from: d */
    private final C8176i0 f30877d;

    /* renamed from: e */
    private final C8181l f30878e;

    /* renamed from: f */
    private final InterfaceC8286d f30879f;

    /* renamed from: g */
    private final InterfaceC8279i f30880g;

    /* renamed from: h */
    private final ProcessDetailsProvider f30881h = ProcessDetailsProvider.f30863a;

    static {
        HashMap hashMap = new HashMap();
        f30874a = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
        f30875b = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.6.1");
    }

    public C8160a0(Context context, C8176i0 c8176i0, C8181l c8181l, InterfaceC8286d interfaceC8286d, InterfaceC8279i interfaceC8279i) {
        this.f30876c = context;
        this.f30877d = c8176i0;
        this.f30878e = c8181l;
        this.f30879f = interfaceC8286d;
        this.f30880g = interfaceC8279i;
    }

    /* renamed from: A */
    private AbstractC8225f0.e.d.a.c m25198A(AbstractC8225f0.a aVar) {
        return this.f30881h.m25189a(aVar.mo25612e(), aVar.mo25611d(), aVar.mo25610c());
    }

    /* renamed from: a */
    private AbstractC8225f0.a m25199a(AbstractC8225f0.a aVar) {
        List<AbstractC8225f0.a.AbstractC11450a> list;
        if (!this.f30880g.mo26060b().f31595b.f31604c || this.f30878e.f30935c.size() <= 0) {
            list = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (C8191q c8191q : this.f30878e.f30935c) {
                arrayList.add(AbstractC8225f0.a.AbstractC11450a.m25672a().mo25640d(c8191q.m25311c()).mo25638b(c8191q.m25309a()).mo25639c(c8191q.m25310b()).mo25637a());
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return AbstractC8225f0.a.m25671a().mo25620c(aVar.mo25610c()).mo25622e(aVar.mo25612e()).mo25624g(aVar.mo25614g()).mo25626i(aVar.mo25616i()).mo25621d(aVar.mo25611d()).mo25623f(aVar.mo25613f()).mo25625h(aVar.mo25615h()).mo25627j(aVar.mo25617j()).mo25619b(list).mo25618a();
    }

    /* renamed from: b */
    private AbstractC8225f0.b m25200b() {
        return AbstractC8225f0.m25664b().mo25604k("18.6.1").mo25600g(this.f30878e.f30933a).mo25601h(this.f30877d.mo25261a().mo25270c()).mo25599f(this.f30877d.mo25261a().mo25271d()).mo25597d(this.f30878e.f30938f).mo25598e(this.f30878e.f30939g).mo25603j(4);
    }

    /* renamed from: f */
    private static long m25201f(long j2) {
        if (j2 > 0) {
            return j2;
        }
        return 0L;
    }

    /* renamed from: g */
    private static int m25202g() {
        Integer num;
        String str = Build.CPU_ABI;
        if (TextUtils.isEmpty(str) || (num = f30874a.get(str.toLowerCase(Locale.US))) == null) {
            return 7;
        }
        return num.intValue();
    }

    /* renamed from: h */
    private AbstractC8225f0.e.d.a.b.AbstractC11454a m25203h() {
        return AbstractC8225f0.e.d.a.b.AbstractC11454a.m25780a().mo25787b(0L).mo25789d(0L).mo25788c(this.f30878e.f30937e).mo25790e(this.f30878e.f30934b).mo25786a();
    }

    /* renamed from: i */
    private List<AbstractC8225f0.e.d.a.b.AbstractC11454a> m25204i() {
        return Collections.singletonList(m25203h());
    }

    /* renamed from: j */
    private AbstractC8225f0.e.d.a m25205j(int i2, AbstractC8225f0.a aVar) {
        return AbstractC8225f0.e.d.a.m25757a().mo25768c(Boolean.valueOf(aVar.mo25610c() != 100)).mo25769d(m25198A(aVar)).mo25773h(i2).mo25771f(m25210o(aVar)).mo25766a();
    }

    /* renamed from: k */
    private AbstractC8225f0.e.d.a m25206k(int i2, C8287e c8287e, Thread thread, int i3, int i4, boolean z) {
        Boolean bool;
        AbstractC8225f0.e.d.a.c m25192e = this.f30881h.m25192e(this.f30876c);
        if (m25192e.mo25839b() > 0) {
            bool = Boolean.valueOf(m25192e.mo25839b() != 100);
        } else {
            bool = null;
        }
        return AbstractC8225f0.e.d.a.m25757a().mo25768c(bool).mo25769d(m25192e).mo25767b(this.f30881h.m25191d(this.f30876c)).mo25773h(i2).mo25771f(m25211p(c8287e, thread, i3, i4, z)).mo25766a();
    }

    /* renamed from: l */
    private AbstractC8225f0.e.d.c m25207l(int i2) {
        C8189p m25304a = C8189p.m25304a(this.f30876c);
        Float m25307b = m25304a.m25307b();
        Double valueOf = m25307b != null ? Double.valueOf(m25307b.doubleValue()) : null;
        int m25308c = m25304a.m25308c();
        boolean m25343n = C8195t.m25343n(this.f30876c);
        return AbstractC8225f0.e.d.c.m25855a().mo25863b(valueOf).mo25864c(m25308c).mo25867f(m25343n).mo25866e(i2).mo25868g(m25201f(C8195t.m25331b(this.f30876c) - C8195t.m25330a(this.f30876c))).mo25865d(C8195t.m25332c(Environment.getDataDirectory().getPath())).mo25862a();
    }

    /* renamed from: m */
    private AbstractC8225f0.e.d.a.b.c m25208m(C8287e c8287e, int i2, int i3) {
        return m25209n(c8287e, i2, i3, 0);
    }

    /* renamed from: n */
    private AbstractC8225f0.e.d.a.b.c m25209n(C8287e c8287e, int i2, int i3, int i4) {
        String str = c8287e.f31637b;
        String str2 = c8287e.f31636a;
        StackTraceElement[] stackTraceElementArr = c8287e.f31638c;
        int i5 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C8287e c8287e2 = c8287e.f31639d;
        if (i4 >= i3) {
            C8287e c8287e3 = c8287e2;
            while (c8287e3 != null) {
                c8287e3 = c8287e3.f31639d;
                i5++;
            }
        }
        AbstractC8225f0.e.d.a.b.c.AbstractC11457a mo25807d = AbstractC8225f0.e.d.a.b.c.m25798a().mo25809f(str).mo25808e(str2).mo25806c(m25213r(stackTraceElementArr, i2)).mo25807d(i5);
        if (c8287e2 != null && i5 == 0) {
            mo25807d.mo25805b(m25209n(c8287e2, i2, i3, i4 + 1));
        }
        return mo25807d.mo25804a();
    }

    /* renamed from: o */
    private AbstractC8225f0.e.d.a.b m25210o(AbstractC8225f0.a aVar) {
        return AbstractC8225f0.e.d.a.b.m25774a().mo25793b(aVar).mo25796e(m25218w()).mo25794c(m25204i()).mo25792a();
    }

    /* renamed from: p */
    private AbstractC8225f0.e.d.a.b m25211p(C8287e c8287e, Thread thread, int i2, int i3, boolean z) {
        return AbstractC8225f0.e.d.a.b.m25774a().mo25797f(m25221z(c8287e, thread, i2, z)).mo25795d(m25208m(c8287e, i2, i3)).mo25796e(m25218w()).mo25794c(m25204i()).mo25792a();
    }

    /* renamed from: q */
    private AbstractC8225f0.e.d.a.b.AbstractC11460e.AbstractC11462b m25212q(StackTraceElement stackTraceElement, AbstractC8225f0.e.d.a.b.AbstractC11460e.AbstractC11462b.AbstractC11463a abstractC11463a) {
        long j2 = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j2 = stackTraceElement.getLineNumber();
        }
        return abstractC11463a.mo25836e(max).mo25837f(str).mo25833b(fileName).mo25835d(j2).mo25832a();
    }

    /* renamed from: r */
    private List<AbstractC8225f0.e.d.a.b.AbstractC11460e.AbstractC11462b> m25213r(StackTraceElement[] stackTraceElementArr, int i2) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            arrayList.add(m25212q(stackTraceElement, AbstractC8225f0.e.d.a.b.AbstractC11460e.AbstractC11462b.m25826a().mo25834c(i2)));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: s */
    private AbstractC8225f0.e.a m25214s() {
        return AbstractC8225f0.e.a.m25699a().mo25711e(this.f30877d.m25263f()).mo25713g(this.f30878e.f30938f).mo25710d(this.f30878e.f30939g).mo25712f(this.f30877d.mo25261a().mo25270c()).mo25708b(this.f30878e.f30940h.m25171d()).mo25709c(this.f30878e.f30940h.m25172e()).mo25707a();
    }

    /* renamed from: t */
    private AbstractC8225f0.e m25215t(String str, long j2) {
        return AbstractC8225f0.e.m25681a().mo25727m(j2).mo25724j(str).mo25722h(f30875b).mo25716b(m25214s()).mo25726l(m25217v()).mo25719e(m25216u()).mo25723i(3).mo25715a();
    }

    /* renamed from: u */
    private AbstractC8225f0.e.c m25216u() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int m25202g = m25202g();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long m25331b = C8195t.m25331b(this.f30876c);
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        boolean m25352w = C8195t.m25352w();
        int m25341l = C8195t.m25341l();
        return AbstractC8225f0.e.c.m25729a().mo25740b(m25202g).mo25744f(Build.MODEL).mo25741c(availableProcessors).mo25746h(m25331b).mo25742d(blockCount).mo25747i(m25352w).mo25748j(m25341l).mo25743e(Build.MANUFACTURER).mo25745g(Build.PRODUCT).mo25739a();
    }

    /* renamed from: v */
    private AbstractC8225f0.e.AbstractC11467e m25217v() {
        return AbstractC8225f0.e.AbstractC11467e.m25893a().mo25901d(3).mo25902e(Build.VERSION.RELEASE).mo25899b(Build.VERSION.CODENAME).mo25900c(C8195t.m25353x()).mo25898a();
    }

    /* renamed from: w */
    private AbstractC8225f0.e.d.a.b.AbstractC11458d m25218w() {
        return AbstractC8225f0.e.d.a.b.AbstractC11458d.m25810a().mo25817d("0").mo25816c("0").mo25815b(0L).mo25814a();
    }

    /* renamed from: x */
    private AbstractC8225f0.e.d.a.b.AbstractC11460e m25219x(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m25220y(thread, stackTraceElementArr, 0);
    }

    /* renamed from: y */
    private AbstractC8225f0.e.d.a.b.AbstractC11460e m25220y(Thread thread, StackTraceElement[] stackTraceElementArr, int i2) {
        return AbstractC8225f0.e.d.a.b.AbstractC11460e.m25818a().mo25825d(thread.getName()).mo25824c(i2).mo25823b(m25213r(stackTraceElementArr, i2)).mo25822a();
    }

    /* renamed from: z */
    private List<AbstractC8225f0.e.d.a.b.AbstractC11460e> m25221z(C8287e c8287e, Thread thread, int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m25220y(thread, c8287e.f31638c, i2));
        if (z) {
            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                Thread key = entry.getKey();
                if (!key.equals(thread)) {
                    arrayList.add(m25219x(key, this.f30879f.mo26070a(entry.getValue())));
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: c */
    public AbstractC8225f0.e.d m25222c(AbstractC8225f0.a aVar) {
        int i2 = this.f30876c.getResources().getConfiguration().orientation;
        return AbstractC8225f0.e.d.m25749a().mo25854g("anr").mo25853f(aVar.mo25616i()).mo25849b(m25205j(i2, m25199a(aVar))).mo25850c(m25207l(i2)).mo25848a();
    }

    /* renamed from: d */
    public AbstractC8225f0.e.d m25223d(Throwable th, Thread thread, String str, long j2, int i2, int i3, boolean z) {
        int i4 = this.f30876c.getResources().getConfiguration().orientation;
        return AbstractC8225f0.e.d.m25749a().mo25854g(str).mo25853f(j2).mo25849b(m25206k(i4, C8287e.m26073a(th, this.f30879f), thread, i2, i3, z)).mo25850c(m25207l(i4)).mo25848a();
    }

    /* renamed from: e */
    public AbstractC8225f0 m25224e(String str, long j2) {
        return m25200b().mo25605l(m25215t(str, j2)).mo25594a();
    }
}
