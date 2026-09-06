package com.google.firebase.crashlytics.internal.p183n;

import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.C8146h;
import com.google.firebase.crashlytics.internal.p184o.C8207f;
import com.google.firebase.crashlytics.internal.p184o.C8213l;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import com.google.firebase.crashlytics.internal.p188r.C8264e;
import com.google.firebase.crashlytics.internal.p188r.C8265f;
import com.google.firebase.crashlytics.internal.p189s.C8269d;
import com.google.firebase.crashlytics.internal.p190t.InterfaceC8279i;
import com.google.firebase.crashlytics.internal.p191u.InterfaceC8286d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;

/* compiled from: SessionReportingCoordinator.java */
/* renamed from: com.google.firebase.crashlytics.h.n.o0 */
/* loaded from: classes2.dex */
public class C8188o0 {

    /* renamed from: a */
    private final C8160a0 f30948a;

    /* renamed from: b */
    private final C8264e f30949b;

    /* renamed from: c */
    private final C8269d f30950c;

    /* renamed from: d */
    private final C8207f f30951d;

    /* renamed from: e */
    private final C8213l f30952e;

    /* renamed from: f */
    private final C8176i0 f30953f;

    C8188o0(C8160a0 c8160a0, C8264e c8264e, C8269d c8269d, C8207f c8207f, C8213l c8213l, C8176i0 c8176i0) {
        this.f30948a = c8160a0;
        this.f30949b = c8264e;
        this.f30950c = c8269d;
        this.f30951d = c8207f;
        this.f30952e = c8213l;
        this.f30953f = c8176i0;
    }

    /* renamed from: a */
    private AbstractC8225f0.e.d m25281a(AbstractC8225f0.e.d dVar, C8207f c8207f, C8213l c8213l) {
        AbstractC8225f0.e.d.b mo25756h = dVar.mo25756h();
        String m25476c = c8207f.m25476c();
        if (m25476c != null) {
            mo25756h.mo25851d(AbstractC8225f0.e.d.AbstractC11465d.m25869a().mo25872b(m25476c).mo25871a());
        } else {
            C8146h.m25176f().m25183i("No log data to include with this event.");
        }
        List<AbstractC8225f0.c> m25289k = m25289k(c8213l.m25541d());
        List<AbstractC8225f0.c> m25289k2 = m25289k(c8213l.m25542e());
        if (!m25289k.isEmpty() || !m25289k2.isEmpty()) {
            mo25756h.mo25849b(dVar.mo25750b().mo25765i().mo25770e(m25289k).mo25772g(m25289k2).mo25766a());
        }
        return mo25756h.mo25848a();
    }

    /* renamed from: b */
    private AbstractC8225f0.e.d m25282b(AbstractC8225f0.e.d dVar) {
        return m25283c(m25281a(dVar, this.f30951d, this.f30952e), this.f30952e);
    }

    /* renamed from: c */
    private AbstractC8225f0.e.d m25283c(AbstractC8225f0.e.d dVar, C8213l c8213l) {
        List<AbstractC8225f0.e.d.AbstractC11466e> m25543f = c8213l.m25543f();
        if (m25543f.isEmpty()) {
            return dVar;
        }
        AbstractC8225f0.e.d.b mo25756h = dVar.mo25756h();
        mo25756h.mo25852e(AbstractC8225f0.e.d.f.m25889a().mo25892b(m25543f).mo25891a());
        return mo25756h.mo25848a();
    }

    /* renamed from: d */
    private static AbstractC8225f0.a m25284d(ApplicationExitInfo applicationExitInfo) {
        String str = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                str = m25285e(traceInputStream);
            }
        } catch (IOException e2) {
            C8146h.m25176f().m25185k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e2);
        }
        return AbstractC8225f0.a.m25671a().mo25620c(applicationExitInfo.getImportance()).mo25622e(applicationExitInfo.getProcessName()).mo25624g(applicationExitInfo.getReason()).mo25626i(applicationExitInfo.getTimestamp()).mo25621d(applicationExitInfo.getPid()).mo25623f(applicationExitInfo.getPss()).mo25625h(applicationExitInfo.getRss()).mo25627j(str).mo25618a();
    }

    /* renamed from: e */
    public static String m25285e(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: f */
    public static C8188o0 m25286f(Context context, C8176i0 c8176i0, C8265f c8265f, C8181l c8181l, C8207f c8207f, C8213l c8213l, InterfaceC8286d interfaceC8286d, InterfaceC8279i interfaceC8279i, C8186n0 c8186n0, C8197v c8197v) {
        return new C8188o0(new C8160a0(context, c8176i0, c8181l, interfaceC8286d, interfaceC8279i), new C8264e(c8265f, interfaceC8279i, c8197v), C8269d.m26011a(context, interfaceC8279i, c8186n0), c8207f, c8213l, c8176i0);
    }

    /* renamed from: g */
    private AbstractC8162b0 m25287g(AbstractC8162b0 abstractC8162b0) {
        if (abstractC8162b0.mo25226b().mo25586g() != null) {
            return abstractC8162b0;
        }
        return AbstractC8162b0.m25225a(abstractC8162b0.mo25226b().m25668r(this.f30953f.m25262d()), abstractC8162b0.mo25228d(), abstractC8162b0.mo25227c());
    }

    /* renamed from: j */
    private ApplicationExitInfo m25288j(String str, List<ApplicationExitInfo> list) {
        long m25982m = this.f30949b.m25982m(str);
        for (ApplicationExitInfo applicationExitInfo : list) {
            if (applicationExitInfo.getTimestamp() < m25982m) {
                return null;
            }
            if (applicationExitInfo.getReason() == 6) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    /* renamed from: k */
    private static List<AbstractC8225f0.c> m25289k(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(AbstractC8225f0.c.m25673a().mo25653b(entry.getKey()).mo25654c(entry.getValue()).mo25652a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.google.firebase.crashlytics.h.n.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compareTo;
                compareTo = ((AbstractC8225f0.c) obj).mo25650b().compareTo(((AbstractC8225f0.c) obj2).mo25650b());
                return compareTo;
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public boolean m25292q(Task<AbstractC8162b0> task) {
        if (!task.mo23651n()) {
            C8146h.m25176f().m25186l("Crashlytics report could not be enqueued to DataTransport", task.mo23646i());
            return false;
        }
        AbstractC8162b0 mo23647j = task.mo23647j();
        C8146h.m25176f().m25177b("Crashlytics report successfully enqueued to DataTransport: " + mo23647j.mo25228d());
        File mo25227c = mo23647j.mo25227c();
        if (mo25227c.delete()) {
            C8146h.m25176f().m25177b("Deleted report file: " + mo25227c.getPath());
            return true;
        }
        C8146h.m25176f().m25185k("Crashlytics could not delete report file: " + mo25227c.getPath());
        return true;
    }

    /* renamed from: r */
    private void m25293r(Throwable th, Thread thread, String str, String str2, long j2, boolean z) {
        this.f30949b.m25985w(m25282b(this.f30948a.m25223d(th, thread, str2, j2, 4, 8, z)), str, str2.equals("crash"));
    }

    /* renamed from: h */
    public void m25294h(String str, List<InterfaceC8182l0> list, AbstractC8225f0.a aVar) {
        C8146h.m25176f().m25177b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8182l0> it = list.iterator();
        while (it.hasNext()) {
            AbstractC8225f0.d.b mo25253c = it.next().mo25253c();
            if (mo25253c != null) {
                arrayList.add(mo25253c);
            }
        }
        this.f30949b.m25980h(str, AbstractC8225f0.d.m25674a().mo25661b(Collections.unmodifiableList(arrayList)).mo25660a(), aVar);
    }

    /* renamed from: i */
    public void m25295i(long j2, String str) {
        this.f30949b.m25979g(str, j2);
    }

    /* renamed from: l */
    public boolean m25296l() {
        return this.f30949b.m25983n();
    }

    /* renamed from: o */
    public SortedSet<String> m25297o() {
        return this.f30949b.m25981l();
    }

    /* renamed from: p */
    public void m25298p(String str, long j2) {
        this.f30949b.m25986x(this.f30948a.m25224e(str, j2));
    }

    /* renamed from: s */
    public void m25299s(Throwable th, Thread thread, String str, long j2) {
        C8146h.m25176f().m25183i("Persisting fatal event for session " + str);
        m25293r(th, thread, str, "crash", j2, true);
    }

    /* renamed from: t */
    public void m25300t(String str, List<ApplicationExitInfo> list, C8207f c8207f, C8213l c8213l) {
        ApplicationExitInfo m25288j = m25288j(str, list);
        if (m25288j == null) {
            C8146h.m25176f().m25183i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC8225f0.e.d m25222c = this.f30948a.m25222c(m25284d(m25288j));
        C8146h.m25176f().m25177b("Persisting anr for session " + str);
        this.f30949b.m25985w(m25283c(m25281a(m25222c, c8207f, c8213l), c8213l), str, true);
    }

    /* renamed from: u */
    public void m25301u() {
        this.f30949b.m25978e();
    }

    /* renamed from: v */
    public Task<Void> m25302v(Executor executor) {
        return m25303w(executor, null);
    }

    /* renamed from: w */
    public Task<Void> m25303w(Executor executor, String str) {
        List<AbstractC8162b0> m25984u = this.f30949b.m25984u();
        ArrayList arrayList = new ArrayList();
        for (AbstractC8162b0 abstractC8162b0 : m25984u) {
            if (str == null || str.equals(abstractC8162b0.mo25228d())) {
                arrayList.add(this.f30950c.m26014b(m25287g(abstractC8162b0), str != null).mo23644g(executor, new Continuation() { // from class: com.google.firebase.crashlytics.h.n.e
                    @Override // com.google.android.gms.tasks.Continuation
                    /* renamed from: a */
                    public final Object mo13777a(Task task) {
                        boolean m25292q;
                        m25292q = C8188o0.this.m25292q(task);
                        return Boolean.valueOf(m25292q);
                    }
                }));
            }
        }
        return Tasks.m23664f(arrayList);
    }
}
