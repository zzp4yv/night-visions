package com.liulishuo.filedownloader.message;

/* compiled from: MessageSnapshotFlow.java */
/* renamed from: com.liulishuo.filedownloader.message.b */
/* loaded from: classes2.dex */
public class C8661b {

    /* renamed from: a */
    private volatile C8663d f33004a;

    /* renamed from: b */
    private volatile b f33005b;

    /* compiled from: MessageSnapshotFlow.java */
    /* renamed from: com.liulishuo.filedownloader.message.b$a */
    public static final class a {

        /* renamed from: a */
        private static final C8661b f33006a = new C8661b();
    }

    /* compiled from: MessageSnapshotFlow.java */
    /* renamed from: com.liulishuo.filedownloader.message.b$b */
    public interface b {
        /* renamed from: H */
        void mo27539H(MessageSnapshot messageSnapshot);
    }

    /* renamed from: a */
    public static C8661b m27535a() {
        return a.f33006a;
    }

    /* renamed from: b */
    public void m27536b(MessageSnapshot messageSnapshot) {
        if (messageSnapshot instanceof InterfaceC8660a) {
            if (this.f33005b != null) {
                this.f33005b.mo27539H(messageSnapshot);
            }
        } else if (this.f33004a != null) {
            this.f33004a.m27547b(messageSnapshot);
        }
    }

    /* renamed from: c */
    public void m27537c(b bVar) {
        this.f33005b = bVar;
        if (bVar == null) {
            this.f33004a = null;
        } else {
            this.f33004a = new C8663d(5, bVar);
        }
    }
}
