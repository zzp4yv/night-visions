package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.message.C8661b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import p241e.p307h.p308a.p315k0.C8999b;

/* compiled from: MessageSnapshotThreadPool.java */
/* renamed from: com.liulishuo.filedownloader.message.d */
/* loaded from: classes2.dex */
public class C8663d {

    /* renamed from: a */
    private final List<a> f33007a = new ArrayList();

    /* renamed from: b */
    private final C8661b.b f33008b;

    /* compiled from: MessageSnapshotThreadPool.java */
    /* renamed from: com.liulishuo.filedownloader.message.d$a */
    public class a {

        /* renamed from: a */
        private final List<Integer> f33009a = new ArrayList();

        /* renamed from: b */
        private final Executor f33010b;

        /* compiled from: MessageSnapshotThreadPool.java */
        /* renamed from: com.liulishuo.filedownloader.message.d$a$a, reason: collision with other inner class name */
        class RunnableC11472a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ MessageSnapshot f33012f;

            RunnableC11472a(MessageSnapshot messageSnapshot) {
                this.f33012f = messageSnapshot;
            }

            @Override // java.lang.Runnable
            public void run() {
                C8663d.this.f33008b.mo27539H(this.f33012f);
                a.this.f33009a.remove(Integer.valueOf(this.f33012f.m27531e()));
            }
        }

        public a(int i2) {
            this.f33010b = C8999b.m28953a(1, "Flow-" + i2);
        }

        /* renamed from: b */
        public void m27549b(int i2) {
            this.f33009a.add(Integer.valueOf(i2));
        }

        /* renamed from: c */
        public void m27550c(MessageSnapshot messageSnapshot) {
            this.f33010b.execute(new RunnableC11472a(messageSnapshot));
        }
    }

    C8663d(int i2, C8661b.b bVar) {
        this.f33008b = bVar;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f33007a.add(new a(i3));
        }
    }

    /* renamed from: b */
    public void m27547b(MessageSnapshot messageSnapshot) {
        a aVar = null;
        try {
            synchronized (this.f33007a) {
                int m27531e = messageSnapshot.m27531e();
                Iterator<a> it = this.f33007a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    a next = it.next();
                    if (next.f33009a.contains(Integer.valueOf(m27531e))) {
                        aVar = next;
                        break;
                    }
                }
                if (aVar == null) {
                    int i2 = 0;
                    Iterator<a> it2 = this.f33007a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        a next2 = it2.next();
                        if (next2.f33009a.size() <= 0) {
                            aVar = next2;
                            break;
                        } else if (i2 == 0 || next2.f33009a.size() < i2) {
                            i2 = next2.f33009a.size();
                            aVar = next2;
                        }
                    }
                }
                aVar.m27549b(m27531e);
            }
        } finally {
            aVar.m27550c(messageSnapshot);
        }
    }
}
