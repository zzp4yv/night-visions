package p241e.p307h.p308a;

import com.liulishuo.filedownloader.message.C8662c;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.model.C8667b;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import p241e.p307h.p308a.InterfaceC8958a;
import p241e.p307h.p308a.InterfaceC9016x;
import p241e.p307h.p308a.p315k0.C9000c;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: DownloadTaskHunter.java */
/* renamed from: e.h.a.d */
/* loaded from: classes2.dex */
public class C8964d implements InterfaceC9016x, InterfaceC9016x.b, InterfaceC9016x.a, InterfaceC8958a.d {

    /* renamed from: a */
    private InterfaceC9012t f34620a;

    /* renamed from: b */
    private final Object f34621b;

    /* renamed from: c */
    private final a f34622c;

    /* renamed from: f */
    private final InterfaceC9011s f34625f;

    /* renamed from: g */
    private final InterfaceC9010r f34626g;

    /* renamed from: h */
    private long f34627h;

    /* renamed from: i */
    private long f34628i;

    /* renamed from: j */
    private int f34629j;

    /* renamed from: k */
    private boolean f34630k;

    /* renamed from: l */
    private boolean f34631l;

    /* renamed from: m */
    private String f34632m;

    /* renamed from: d */
    private volatile byte f34623d = 0;

    /* renamed from: e */
    private Throwable f34624e = null;

    /* renamed from: n */
    private boolean f34633n = false;

    /* compiled from: DownloadTaskHunter.java */
    /* renamed from: e.h.a.d$a */
    interface a {
        /* renamed from: D */
        ArrayList<InterfaceC8958a.a> mo28672D();

        /* renamed from: N */
        FileDownloadHeader mo28673N();

        /* renamed from: a */
        void mo28675a(String str);

        /* renamed from: s */
        InterfaceC8958a.b mo28678s();
    }

    C8964d(a aVar, Object obj) {
        this.f34621b = obj;
        this.f34622c = aVar;
        C8960b c8960b = new C8960b();
        this.f34625f = c8960b;
        this.f34626g = c8960b;
        this.f34620a = new C8997k(aVar.mo28678s(), this);
    }

    /* renamed from: s */
    private int m28696s() {
        return this.f34622c.mo28678s().mo28649v().getId();
    }

    /* renamed from: t */
    private void m28697t() throws IOException {
        File file;
        InterfaceC8958a mo28649v = this.f34622c.mo28678s().mo28649v();
        if (mo28649v.mo28624g() == null) {
            mo28649v.mo28628k(C9003f.m29016v(mo28649v.mo28631n()));
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "save Path is null to %s", mo28649v.mo28624g());
            }
        }
        if (mo28649v.mo28615Q()) {
            file = new File(mo28649v.mo28624g());
        } else {
            String m28974A = C9003f.m28974A(mo28649v.mo28624g());
            if (m28974A == null) {
                throw new InvalidParameterException(C9003f.m29009o("the provided mPath[%s] is invalid, can't find its directory", mo28649v.mo28624g()));
            }
            file = new File(m28974A);
        }
        if (!file.exists() && !file.mkdirs() && !file.exists()) {
            throw new IOException(C9003f.m29009o("Create parent directory failed, please make sure you have permission to create file or directory on the path: %s", file.getAbsolutePath()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    private void m28698u(MessageSnapshot messageSnapshot) {
        InterfaceC8958a mo28649v = this.f34622c.mo28678s().mo28649v();
        byte mo27519k = messageSnapshot.mo27519k();
        this.f34623d = mo27519k;
        this.f34630k = messageSnapshot.m27532m();
        if (mo27519k == -4) {
            this.f34625f.mo28659a();
            int m28895e = C8986h.m28890i().m28895e(mo28649v.getId());
            if (m28895e + ((m28895e > 1 || !mo28649v.mo28615Q()) ? 0 : C8986h.m28890i().m28895e(C9003f.m29012r(mo28649v.mo28631n(), mo28649v.mo28629l()))) <= 1) {
                byte mo29030Q = C9005m.m29029b().mo29030Q(mo28649v.getId());
                C9001d.m28970i(this, "warn, but no mListener to receive, switch to pending %d %d", Integer.valueOf(mo28649v.getId()), Integer.valueOf(mo29030Q));
                if (C8667b.m27597a(mo29030Q)) {
                    this.f34623d = (byte) 1;
                    this.f34628i = messageSnapshot.mo27522g();
                    long mo27527f = messageSnapshot.mo27527f();
                    this.f34627h = mo27527f;
                    this.f34625f.mo28662g(mo27527f);
                    this.f34620a.mo28934b(((MessageSnapshot.InterfaceC8659b) messageSnapshot).mo27530a());
                    return;
                }
            }
            C8986h.m28890i().m28901l(this.f34622c.mo28678s(), messageSnapshot);
            return;
        }
        if (mo27519k == -3) {
            this.f34633n = messageSnapshot.mo27523o();
            this.f34627h = messageSnapshot.mo27522g();
            this.f34628i = messageSnapshot.mo27522g();
            C8986h.m28890i().m28901l(this.f34622c.mo28678s(), messageSnapshot);
            return;
        }
        if (mo27519k == -1) {
            this.f34624e = messageSnapshot.mo27528l();
            this.f34627h = messageSnapshot.mo27527f();
            C8986h.m28890i().m28901l(this.f34622c.mo28678s(), messageSnapshot);
            return;
        }
        if (mo27519k == 1) {
            this.f34627h = messageSnapshot.mo27527f();
            this.f34628i = messageSnapshot.mo27522g();
            this.f34620a.mo28934b(messageSnapshot);
            return;
        }
        if (mo27519k == 2) {
            this.f34628i = messageSnapshot.mo27522g();
            this.f34631l = messageSnapshot.mo27526n();
            this.f34632m = messageSnapshot.mo27524c();
            String mo27525d = messageSnapshot.mo27525d();
            if (mo27525d != null) {
                if (mo28649v.mo28618V() != null) {
                    C9001d.m28970i(this, "already has mFilename[%s], but assign mFilename[%s] again", mo28649v.mo28618V(), mo27525d);
                }
                this.f34622c.mo28675a(mo27525d);
            }
            this.f34625f.mo28662g(this.f34627h);
            this.f34620a.mo28940h(messageSnapshot);
            return;
        }
        if (mo27519k == 3) {
            this.f34627h = messageSnapshot.mo27527f();
            this.f34625f.mo28663i(messageSnapshot.mo27527f());
            this.f34620a.mo28938f(messageSnapshot);
        } else if (mo27519k != 5) {
            if (mo27519k != 6) {
                return;
            }
            this.f34620a.mo28944l(messageSnapshot);
        } else {
            this.f34627h = messageSnapshot.mo27527f();
            this.f34624e = messageSnapshot.mo27528l();
            this.f34629j = messageSnapshot.mo27529h();
            this.f34625f.mo28659a();
            this.f34620a.mo28937e(messageSnapshot);
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x.a
    /* renamed from: a */
    public boolean mo28699a(MessageSnapshot messageSnapshot) {
        if (!this.f34622c.mo28678s().mo28649v().mo28615Q() || messageSnapshot.mo27519k() != -4 || getStatus() != 2) {
            return false;
        }
        m28698u(messageSnapshot);
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x
    /* renamed from: b */
    public void mo28700b() {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "free the task %d, when the status is %d", Integer.valueOf(m28696s()), Byte.valueOf(this.f34623d));
        }
        this.f34623d = (byte) 0;
    }

    @Override // p241e.p307h.p308a.InterfaceC9010r
    /* renamed from: c */
    public int mo28660c() {
        return this.f34626g.mo28660c();
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x
    /* renamed from: d */
    public int mo28701d() {
        return this.f34629j;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x
    /* renamed from: e */
    public Throwable mo28702e() {
        return this.f34624e;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x.a
    /* renamed from: f */
    public InterfaceC9012t mo28703f() {
        return this.f34620a;
    }

    @Override // p241e.p307h.p308a.InterfaceC8958a.d
    /* renamed from: g */
    public void mo28655g() {
        InterfaceC8958a mo28649v = this.f34622c.mo28678s().mo28649v();
        if (C9004l.m29022b()) {
            C9004l.m29021a().m29025c(mo28649v);
        }
        if (C9001d.f34819a) {
            C9001d.m28969h(this, "filedownloader:lifecycle:over %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
        this.f34625f.mo28661f(this.f34627h);
        if (this.f34622c.mo28672D() != null) {
            ArrayList arrayList = (ArrayList) this.f34622c.mo28672D().clone();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC8958a.a) arrayList.get(i2)).mo28638a(mo28649v);
            }
        }
        C9009q.m29052e().m29058f().mo29069c(this.f34622c.mo28678s());
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x
    public byte getStatus() {
        return this.f34623d;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x
    /* renamed from: h */
    public boolean mo28704h() {
        return this.f34630k;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x.a
    /* renamed from: i */
    public boolean mo28705i(MessageSnapshot messageSnapshot) {
        if (C8667b.m27598b(getStatus(), messageSnapshot.mo27519k())) {
            m28698u(messageSnapshot);
            return true;
        }
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "can't update mStatus change by keep ahead, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f34623d), Byte.valueOf(getStatus()), Integer.valueOf(m28696s()));
        }
        return false;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x
    /* renamed from: j */
    public void mo28706j() {
        boolean z;
        synchronized (this.f34621b) {
            if (this.f34623d != 0) {
                C9001d.m28970i(this, "High concurrent cause, this task %d will not input to launch pool, because of the status isn't idle : %d", Integer.valueOf(m28696s()), Byte.valueOf(this.f34623d));
                return;
            }
            this.f34623d = (byte) 10;
            InterfaceC8958a.b mo28678s = this.f34622c.mo28678s();
            InterfaceC8958a mo28649v = mo28678s.mo28649v();
            if (C9004l.m29022b()) {
                C9004l.m29021a().m29024b(mo28649v);
            }
            if (C9001d.f34819a) {
                C9001d.m28969h(this, "call start Url[%s], Path[%s] Listener[%s], Tag[%s]", mo28649v.mo28631n(), mo28649v.mo28624g(), mo28649v.mo28610G(), mo28649v.getTag());
            }
            try {
                m28697t();
                z = true;
            } catch (Throwable th) {
                C8986h.m28890i().m28891a(mo28678s);
                C8986h.m28890i().m28901l(mo28678s, mo28708l(th));
                z = false;
            }
            if (z) {
                C9008p.m29041c().m29044d(this);
            }
            if (C9001d.f34819a) {
                C9001d.m28969h(this, "the task[%d] has been into the launch pool.", Integer.valueOf(m28696s()));
            }
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x
    /* renamed from: k */
    public long mo28707k() {
        return this.f34627h;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x.a
    /* renamed from: l */
    public MessageSnapshot mo28708l(Throwable th) {
        this.f34623d = (byte) -1;
        this.f34624e = th;
        return C8662c.m27541b(m28696s(), mo28707k(), th);
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x
    /* renamed from: m */
    public long mo28709m() {
        return this.f34628i;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x.a
    /* renamed from: n */
    public boolean mo28710n(MessageSnapshot messageSnapshot) {
        if (!C8667b.m27600d(this.f34622c.mo28678s().mo28649v())) {
            return false;
        }
        m28698u(messageSnapshot);
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC8958a.d
    /* renamed from: o */
    public void mo28656o() {
        if (C9004l.m29022b() && getStatus() == 6) {
            C9004l.m29021a().m29027e(this.f34622c.mo28678s().mo28649v());
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x.a
    /* renamed from: p */
    public boolean mo28711p(MessageSnapshot messageSnapshot) {
        byte status = getStatus();
        byte mo27519k = messageSnapshot.mo27519k();
        if (-2 == status && C8667b.m27597a(mo27519k)) {
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "High concurrent cause, callback pending, but has already be paused %d", Integer.valueOf(m28696s()));
            }
            return true;
        }
        if (C8667b.m27599c(status, mo27519k)) {
            m28698u(messageSnapshot);
            return true;
        }
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "can't update mStatus change by keep flow, %d, but the current mStatus is %d, %d", Byte.valueOf(this.f34623d), Byte.valueOf(getStatus()), Integer.valueOf(m28696s()));
        }
        return false;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x
    public boolean pause() {
        if (C8667b.m27601e(getStatus())) {
            if (C9001d.f34819a) {
                C9001d.m28962a(this, "High concurrent cause, Already is over, can't pause again, %d %d", Byte.valueOf(getStatus()), Integer.valueOf(this.f34622c.mo28678s().mo28649v().getId()));
            }
            return false;
        }
        this.f34623d = (byte) -2;
        InterfaceC8958a.b mo28678s = this.f34622c.mo28678s();
        InterfaceC8958a mo28649v = mo28678s.mo28649v();
        C9008p.m29041c().m29043b(this);
        if (C9001d.f34819a) {
            C9001d.m28969h(this, "the task[%d] has been expired from the launch pool.", Integer.valueOf(m28696s()));
        }
        if (C9009q.m29052e().m29060i()) {
            C9005m.m29029b().mo29032a0(mo28649v.getId());
        } else if (C9001d.f34819a) {
            C9001d.m28962a(this, "request pause the task[%d] to the download service, but the download service isn't connected yet.", Integer.valueOf(mo28649v.getId()));
        }
        C8986h.m28890i().m28891a(mo28678s);
        C8986h.m28890i().m28901l(mo28678s, C8662c.m27542c(mo28649v));
        C9009q.m29052e().m29058f().mo29069c(mo28678s);
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC8958a.d
    /* renamed from: q */
    public void mo28657q() {
        if (C9004l.m29022b()) {
            C9004l.m29021a().m29026d(this.f34622c.mo28678s().mo28649v());
        }
        if (C9001d.f34819a) {
            C9001d.m28969h(this, "filedownloader:lifecycle:start %s by %d ", toString(), Byte.valueOf(getStatus()));
        }
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x.b
    /* renamed from: r */
    public boolean mo28712r(AbstractC8991i abstractC8991i) {
        return this.f34622c.mo28678s().mo28649v().mo28610G() == abstractC8991i;
    }

    @Override // p241e.p307h.p308a.InterfaceC9016x.b
    public void start() {
        if (this.f34623d != 10) {
            C9001d.m28970i(this, "High concurrent cause, this task %d will not start, because the of status isn't toLaunchPool: %d", Integer.valueOf(m28696s()), Byte.valueOf(this.f34623d));
            return;
        }
        InterfaceC8958a.b mo28678s = this.f34622c.mo28678s();
        InterfaceC8958a mo28649v = mo28678s.mo28649v();
        InterfaceC9014v m29058f = C9009q.m29052e().m29058f();
        try {
            if (m29058f.mo29068b(mo28678s)) {
                return;
            }
            synchronized (this.f34621b) {
                if (this.f34623d != 10) {
                    C9001d.m28970i(this, "High concurrent cause, this task %d will not start, the status can't assign to toFileDownloadService, because the status isn't toLaunchPool: %d", Integer.valueOf(m28696s()), Byte.valueOf(this.f34623d));
                    return;
                }
                this.f34623d = (byte) 11;
                C8986h.m28890i().m28891a(mo28678s);
                if (C9000c.m28959d(mo28649v.getId(), mo28649v.mo28629l(), mo28649v.mo28613M(), true)) {
                    return;
                }
                boolean mo29031S = C9005m.m29029b().mo29031S(mo28649v.mo28631n(), mo28649v.mo28624g(), mo28649v.mo28615Q(), mo28649v.mo28612K(), mo28649v.mo28634q(), mo28649v.mo28636t(), mo28649v.mo28613M(), this.f34622c.mo28673N(), mo28649v.mo28635r());
                if (this.f34623d == -2) {
                    C9001d.m28970i(this, "High concurrent cause, this task %d will be paused,because of the status is paused, so the pause action must be applied", Integer.valueOf(m28696s()));
                    if (mo29031S) {
                        C9005m.m29029b().mo29032a0(m28696s());
                        return;
                    }
                    return;
                }
                if (mo29031S) {
                    m29058f.mo29069c(mo28678s);
                    return;
                }
                if (m29058f.mo29068b(mo28678s)) {
                    return;
                }
                MessageSnapshot mo28708l = mo28708l(new RuntimeException("Occur Unknown Error, when request to start maybe some problem in binder, maybe the process was killed in unexpected."));
                if (C8986h.m28890i().m28900k(mo28678s)) {
                    m29058f.mo29069c(mo28678s);
                    C8986h.m28890i().m28891a(mo28678s);
                }
                C8986h.m28890i().m28901l(mo28678s, mo28708l);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            C8986h.m28890i().m28901l(mo28678s, mo28708l(th));
        }
    }
}
