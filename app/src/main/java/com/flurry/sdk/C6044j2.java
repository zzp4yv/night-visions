package com.flurry.sdk;

import com.flurry.sdk.C6015g0;
import com.flurry.sdk.C6035i2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.flurry.sdk.j2 */
/* loaded from: classes2.dex */
public final class C6044j2 extends C6062l2 implements InterfaceC6152v6 {

    /* renamed from: o */
    private PriorityQueue<String> f16014o;

    /* renamed from: p */
    private AbstractC6096p0 f16015p;

    /* renamed from: q */
    private AbstractC6096p0 f16016q;

    /* renamed from: com.flurry.sdk.j2$a */
    final class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ List f16017h;

        a(List list) {
            this.f16017h = list;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6044j2.this.f16014o.addAll(this.f16017h);
            C6044j2.this.m13131w();
        }
    }

    /* renamed from: com.flurry.sdk.j2$b */
    final class b implements InterfaceC6087o0 {
        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6087o0
        /* renamed from: a */
        public final void mo13135a() {
            C6044j2.m13128t(true);
        }

        @Override // com.flurry.sdk.InterfaceC6087o0
        /* renamed from: d */
        public final void mo13136d() {
            C6044j2.m13128t(false);
        }
    }

    public C6044j2() {
        super("FrameLogDataSender", C6035i2.m13111a(C6035i2.b.CORE));
        this.f16014o = null;
        this.f16014o = new PriorityQueue<>(4, new C6124s2());
        this.f16015p = new C6138u0();
        this.f16016q = new C6130t0();
    }

    /* renamed from: h */
    private synchronized void m13126h(String str) {
        C5988d1.m13039l("FrameLogDataSender", "File upload status: ".concat(String.valueOf(str)));
        C5988d1.m13030c(2, "FrameLogDataSender", "Deleting file " + str + " deleted " + C6107q2.m13270b(str));
        m13131w();
    }

    /* renamed from: t */
    static /* synthetic */ void m13128t(boolean z) {
        C6071m2.m13180a().m13181b(new C6003e6(new C6012f6(z)));
    }

    /* renamed from: u */
    private static byte[] m13129u(File file) throws IOException {
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        byte[] bArr2 = new byte[length];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            try {
                int read = fileInputStream.read(bArr, 0, length);
                if (read < length) {
                    int i2 = length - read;
                    while (i2 > 0) {
                        int read2 = fileInputStream.read(bArr2, 0, i2);
                        System.arraycopy(bArr2, 0, bArr, length - i2, read2);
                        i2 -= read2;
                    }
                }
            } catch (IOException e2) {
                C5988d1.m13030c(6, "FrameLogDataSender", "Error reading file. ".concat(String.valueOf(e2)));
            }
            return bArr;
        } finally {
            fileInputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m13131w() {
        C5988d1.m13039l("FrameLogDataSender", " Starting processNextFile " + this.f16014o.size());
        if (this.f16014o.peek() == null) {
            C5988d1.m13039l("FrameLogDataSender", "No file present to process.");
            return;
        }
        String poll = this.f16014o.poll();
        if (!C6107q2.m13272d(poll)) {
            C5988d1.m13030c(6, "FrameLogDataSender", "Something wrong with the file. File does not exist.");
            return;
        }
        C5988d1.m13039l("FrameLogDataSender", "Starting to upload file: ".concat(String.valueOf(poll)));
        byte[] bArr = new byte[0];
        try {
            bArr = m13129u(new File(poll));
        } catch (IOException e2) {
            C5988d1.m13030c(6, "FrameLogDataSender", "Error in getting bytes form the file: " + e2.getMessage());
        }
        String m13143b = C6051k0.m13141a().m13143b();
        StringBuilder sb = new StringBuilder();
        C6078n0.m13190a();
        sb.append(328);
        this.f16015p.m13247w(bArr, m13143b, sb.toString());
        this.f16015p.m13246v(new b());
        m13126h(poll);
        C5988d1.m13039l("FrameLogDataSender", "File appended for upload: ".concat(String.valueOf(poll)));
    }

    @Override // com.flurry.sdk.InterfaceC6152v6
    /* renamed from: a */
    public final void mo13132a() {
        this.f16015p.m13243a();
        this.f16016q.m13243a();
    }

    @Override // com.flurry.sdk.InterfaceC6152v6
    /* renamed from: d */
    public final C6015g0.c mo13133d() {
        AbstractC6096p0 abstractC6096p0 = this.f16015p;
        C6015g0.c cVar = new C6015g0.c();
        Iterator<String> it = abstractC6096p0.f16225s.m13283a().iterator();
        while (it.hasNext()) {
            cVar.m13074a(abstractC6096p0.f16225s.m13289k(it.next()).size());
        }
        return cVar;
    }

    @Override // com.flurry.sdk.InterfaceC6152v6
    /* renamed from: e */
    public final void mo13134e(List<String> list) {
        if (list.size() == 0) {
            C5988d1.m13030c(6, "FrameLogDataSender", "File List is null or empty");
            return;
        }
        C5988d1.m13039l("FrameLogDataSender", "Number of files being added:" + list.toString());
        mo13007m(new a(list));
    }
}
