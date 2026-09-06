package com.liulishuo.filedownloader.services;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import p241e.p307h.p308a.p311g0.RunnableC8981d;
import p241e.p307h.p308a.p315k0.C8999b;
import p241e.p307h.p308a.p315k0.C9001d;
import p241e.p307h.p308a.p315k0.C9002e;

/* compiled from: FileDownloadThreadPool.java */
/* renamed from: com.liulishuo.filedownloader.services.h */
/* loaded from: classes2.dex */
class C8675h {

    /* renamed from: b */
    private ThreadPoolExecutor f33057b;

    /* renamed from: d */
    private int f33059d;

    /* renamed from: a */
    private SparseArray<RunnableC8981d> f33056a = new SparseArray<>();

    /* renamed from: c */
    private final String f33058c = "Network";

    /* renamed from: e */
    private int f33060e = 0;

    C8675h(int i2) {
        this.f33057b = C8999b.m28953a(i2, "Network");
        this.f33059d = i2;
    }

    /* renamed from: d */
    private synchronized void m27663d() {
        SparseArray<RunnableC8981d> sparseArray = new SparseArray<>();
        int size = this.f33056a.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = this.f33056a.keyAt(i2);
            RunnableC8981d runnableC8981d = this.f33056a.get(keyAt);
            if (runnableC8981d != null && runnableC8981d.m28822p()) {
                sparseArray.put(keyAt, runnableC8981d);
            }
        }
        this.f33056a = sparseArray;
    }

    /* renamed from: a */
    public void m27664a(int i2) {
        m27663d();
        synchronized (this) {
            RunnableC8981d runnableC8981d = this.f33056a.get(i2);
            if (runnableC8981d != null) {
                runnableC8981d.m28823r();
                boolean remove = this.f33057b.remove(runnableC8981d);
                if (C9001d.f34819a) {
                    C9001d.m28962a(this, "successful cancel %d %B", Integer.valueOf(i2), Boolean.valueOf(remove));
                }
            }
            this.f33056a.remove(i2);
        }
    }

    /* renamed from: b */
    public synchronized int m27665b() {
        m27663d();
        return this.f33056a.size();
    }

    /* renamed from: c */
    public void m27666c(RunnableC8981d runnableC8981d) {
        runnableC8981d.m28824s();
        synchronized (this) {
            this.f33056a.put(runnableC8981d.m28819k(), runnableC8981d);
        }
        this.f33057b.execute(runnableC8981d);
        int i2 = this.f33060e;
        if (i2 < 600) {
            this.f33060e = i2 + 1;
        } else {
            m27663d();
            this.f33060e = 0;
        }
    }

    /* renamed from: e */
    public synchronized int m27667e(String str, int i2) {
        if (str == null) {
            return 0;
        }
        int size = this.f33056a.size();
        for (int i3 = 0; i3 < size; i3++) {
            RunnableC8981d valueAt = this.f33056a.valueAt(i3);
            if (valueAt != null && valueAt.m28822p() && valueAt.m28819k() != i2 && str.equals(valueAt.m28820l())) {
                return valueAt.m28819k();
            }
        }
        return 0;
    }

    /* renamed from: f */
    public synchronized List<Integer> m27668f() {
        ArrayList arrayList;
        m27663d();
        arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.f33056a.size(); i2++) {
            SparseArray<RunnableC8981d> sparseArray = this.f33056a;
            arrayList.add(Integer.valueOf(sparseArray.get(sparseArray.keyAt(i2)).m28819k()));
        }
        return arrayList;
    }

    /* renamed from: g */
    public synchronized boolean m27669g(int i2) {
        boolean z;
        RunnableC8981d runnableC8981d = this.f33056a.get(i2);
        if (runnableC8981d != null) {
            z = runnableC8981d.m28822p();
        }
        return z;
    }

    /* renamed from: h */
    public synchronized boolean m27670h(int i2) {
        if (m27665b() > 0) {
            C9001d.m28970i(this, "Can't change the max network thread count, because the  network thread pool isn't in IDLE, please try again after all running tasks are completed or invoking FileDownloader#pauseAll directly.", new Object[0]);
            return false;
        }
        int m28972b = C9002e.m28972b(i2);
        if (C9001d.f34819a) {
            C9001d.m28962a(this, "change the max network thread count, from %d to %d", Integer.valueOf(this.f33059d), Integer.valueOf(m28972b));
        }
        List<Runnable> shutdownNow = this.f33057b.shutdownNow();
        this.f33057b = C8999b.m28953a(m28972b, "Network");
        if (shutdownNow.size() > 0) {
            C9001d.m28970i(this, "recreate the network thread pool and discard %d tasks", Integer.valueOf(shutdownNow.size()));
        }
        this.f33059d = m28972b;
        return true;
    }
}
