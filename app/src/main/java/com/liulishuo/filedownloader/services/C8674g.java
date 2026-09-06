package com.liulishuo.filedownloader.services;

import com.liulishuo.filedownloader.model.C8666a;
import com.liulishuo.filedownloader.model.C8667b;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.util.Iterator;
import java.util.List;
import p241e.p307h.p308a.InterfaceC9017y;
import p241e.p307h.p308a.p310f0.InterfaceC8972a;
import p241e.p307h.p308a.p311g0.C8980c;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9003f;

/* compiled from: FileDownloadManager.java */
/* renamed from: com.liulishuo.filedownloader.services.g */
/* loaded from: classes2.dex */
class C8674g implements InterfaceC9017y {

    /* renamed from: a */
    private final InterfaceC8972a f33054a;

    /* renamed from: b */
    private final C8675h f33055b;

    C8674g() {
        C8980c m28789j = C8980c.m28789j();
        this.f33054a = m28789j.m28795f();
        this.f33055b = new C8675h(m28789j.m28798k());
    }

    @Override // p241e.p307h.p308a.InterfaceC9017y
    /* renamed from: a */
    public boolean mo27649a(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            return false;
        }
        boolean m27669g = this.f33055b.m27669g(fileDownloadModel.m27561e());
        if (C8667b.m27601e(fileDownloadModel.m27564h())) {
            if (!m27669g) {
                return false;
            }
        } else if (!m27669g) {
            C9001d.m28963b(this, "%d status is[%s](not finish) & but not in the pool", Integer.valueOf(fileDownloadModel.m27561e()), Byte.valueOf(fileDownloadModel.m27564h()));
            return false;
        }
        return true;
    }

    @Override // p241e.p307h.p308a.InterfaceC9017y
    /* renamed from: b */
    public int mo27650b(String str, int i2) {
        return this.f33055b.m27667e(str, i2);
    }

    /* renamed from: c */
    public void m27651c() {
        this.f33054a.clear();
    }

    /* renamed from: d */
    public boolean m27652d(int i2) {
        if (i2 == 0) {
            C9001d.m28970i(this, "The task[%d] id is invalid, can't clear it.", Integer.valueOf(i2));
            return false;
        }
        if (m27656h(i2)) {
            C9001d.m28970i(this, "The task[%d] is downloading, can't clear it.", Integer.valueOf(i2));
            return false;
        }
        this.f33054a.remove(i2);
        this.f33054a.mo28733h(i2);
        return true;
    }

    /* renamed from: e */
    public long m27653e(int i2) {
        FileDownloadModel mo28740o = this.f33054a.mo28740o(i2);
        if (mo28740o == null) {
            return 0L;
        }
        int m27557a = mo28740o.m27557a();
        if (m27557a <= 1) {
            return mo28740o.m27563g();
        }
        List<C8666a> mo28739n = this.f33054a.mo28739n(i2);
        if (mo28739n == null || mo28739n.size() != m27557a) {
            return 0L;
        }
        return C8666a.m27585f(mo28739n);
    }

    /* renamed from: f */
    public byte m27654f(int i2) {
        FileDownloadModel mo28740o = this.f33054a.mo28740o(i2);
        if (mo28740o == null) {
            return (byte) 0;
        }
        return mo28740o.m27564h();
    }

    /* renamed from: g */
    public long m27655g(int i2) {
        FileDownloadModel mo28740o = this.f33054a.mo28740o(i2);
        if (mo28740o == null) {
            return 0L;
        }
        return mo28740o.m27567k();
    }

    /* renamed from: h */
    public boolean m27656h(int i2) {
        return mo27649a(this.f33054a.mo28740o(i2));
    }

    /* renamed from: i */
    public boolean m27657i(String str, String str2) {
        return m27656h(C9003f.m29012r(str, str2));
    }

    /* renamed from: j */
    public boolean m27658j() {
        return this.f33055b.m27665b() <= 0;
    }

    /* renamed from: k */
    public boolean m27659k(int i2) {
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "request pause the task %d", Integer.valueOf(i2));
        }
        FileDownloadModel mo28740o = this.f33054a.mo28740o(i2);
        if (mo28740o == null) {
            return false;
        }
        mo28740o.m27581y((byte) -2);
        this.f33055b.m27664a(i2);
        return true;
    }

    /* renamed from: l */
    public void m27660l() {
        List<Integer> m27668f = this.f33055b.m27668f();
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "pause all tasks %d", Integer.valueOf(m27668f.size()));
        }
        Iterator<Integer> it = m27668f.iterator();
        while (it.hasNext()) {
            m27659k(it.next().intValue());
        }
    }

    /* renamed from: m */
    public synchronized boolean m27661m(int i2) {
        return this.f33055b.m27670h(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0184 A[Catch: all -> 0x01cf, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x0010, B:7:0x0022, B:10:0x0034, B:12:0x0044, B:14:0x004e, B:16:0x0052, B:17:0x0065, B:19:0x0072, B:21:0x0078, B:23:0x007c, B:28:0x008d, B:29:0x0096, B:31:0x009f, B:33:0x00a3, B:38:0x00b6, B:40:0x00bf, B:41:0x00c8, B:43:0x00d7, B:45:0x00db, B:47:0x00ec, B:51:0x00fa, B:53:0x0101, B:55:0x0108, B:57:0x010e, B:59:0x0115, B:61:0x011b, B:63:0x0121, B:65:0x013b, B:66:0x013f, B:68:0x0145, B:72:0x0184, B:73:0x0189, B:76:0x0154, B:78:0x015e, B:80:0x0164, B:81:0x016a, B:82:0x00c4, B:84:0x0092), top: B:3:0x0009 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void m27662n(java.lang.String r19, java.lang.String r20, boolean r21, int r22, int r23, int r24, boolean r25, com.liulishuo.filedownloader.model.FileDownloadHeader r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.C8674g.m27662n(java.lang.String, java.lang.String, boolean, int, int, int, boolean, com.liulishuo.filedownloader.model.FileDownloadHeader, boolean):void");
    }
}
