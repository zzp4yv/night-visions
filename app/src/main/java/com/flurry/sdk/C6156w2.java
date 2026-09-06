package com.flurry.sdk;

import com.flurry.sdk.AbstractC5981c3;
import com.flurry.sdk.InterfaceC6099p3;
import com.flurry.sdk.InterfaceC6164x2;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import okhttp3.HttpUrl;

/* renamed from: com.flurry.sdk.w2 */
/* loaded from: classes2.dex */
public final class C6156w2 extends AbstractC5981c3 {

    /* renamed from: s */
    protected InterfaceC6099p3 f16479s;

    /* renamed from: t */
    protected C6168x6 f16480t;

    /* renamed from: com.flurry.sdk.w2$a */
    final class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6144u6 f16481h;

        /* renamed from: com.flurry.sdk.w2$a$a, reason: collision with other inner class name */
        final class C11427a implements InterfaceC6099p3.a {
            C11427a() {
            }

            @Override // com.flurry.sdk.InterfaceC6099p3.a
            /* renamed from: a */
            public final void mo13259a() {
                C6156w2.this.f15722p = AbstractC5981c3.c.f15731h;
                C6156w2.this.f16479s.mo13187d();
                C6156w2.this.f15722p = AbstractC5981c3.c.f15732i;
                C6156w2.this.m13001v();
            }
        }

        a(InterfaceC6144u6 interfaceC6144u6) {
            this.f16481h = interfaceC6144u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            if (!C6156w2.this.f16479s.mo13186c()) {
                if (C6156w2.this.m13367y("currentFile")) {
                    C5988d1.m13030c(4, "FileWriterModule", "File created. Adding counter");
                    C6156w2.this.f16479s.mo13188f(C6135t5.m13308h(), null);
                } else {
                    C5988d1.m13030c(4, "FileWriterModule", "File creation failed.");
                }
            }
            if (this.f16481h.mo12961a().equals(EnumC6128s6.FLUSH_FRAME)) {
                C6156w2.this.f15722p = AbstractC5981c3.c.f15731h;
                C5988d1.m13030c(4, "FileWriterModule", "Adding flush frame:" + this.f16481h.mo13296d());
                C6156w2.this.f16479s.mo13188f(this.f16481h, new C11427a());
                return;
            }
            C5988d1.m13030c(4, "FileWriterModule", "Adding frame " + this.f16481h.mo12961a() + ": " + this.f16481h.mo13296d());
            C6156w2.this.f16479s.mo13188f(this.f16481h, null);
        }
    }

    C6156w2() {
        super("FileWriterModule", null);
        this.f16479s = null;
        this.f16480t = null;
        this.f16479s = new C6072m3();
        this.f16480t = new C6168x6();
    }

    /* renamed from: A */
    private static String m13365A() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat -d").getInputStream()));
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null || i2 >= 1000 || sb.length() + readLine.length() > 524288) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
                i2++;
            }
            C5988d1.m13030c(4, "FileWriterModule", "Get Logcat lines: ".concat(String.valueOf(i2)));
            return sb.toString();
        } catch (IOException unused) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public boolean m13367y(String str) {
        if (this.f16479s.mo13186c()) {
            C5988d1.m13030c(6, "FileWriterModule", "File was open, closing now.");
            this.f16479s.mo13184a();
        }
        return this.f16479s.mo13189i(C6107q2.m13273e(), str);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:10|(1:12)(1:52)|13|(1:15)(1:51)|16|(2:18|(1:20)(1:21))|22|(2:48|(12:50|25|(1:27)|28|29|30|31|32|(1:34)(1:45)|35|(1:(2:38|39)(2:41|42))(2:43|44)|40))|24|25|(0)|28|29|30|31|32|(0)(0)|35|(0)(0)|40) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f8, code lost:
    
        com.flurry.sdk.C5988d1.m13030c(4, "FileWriterModule", "Issue parsing session id into start time: ".concat(java.lang.String.valueOf(r7)));
        r19 = r14;
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.flurry.sdk.C6133t3 m13368z() {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6156w2.m13368z():com.flurry.sdk.t3");
    }

    @Override // com.flurry.sdk.AbstractC5981c3
    /* renamed from: b */
    public final void mo12956b(InterfaceC6144u6 interfaceC6144u6) {
        if (this.f15722p != AbstractC5981c3.c.f15731h) {
            mo13007m(new a(interfaceC6144u6));
            return;
        }
        this.f15723q.add(interfaceC6144u6);
        C5988d1.m13030c(4, "FileWriterModule", "In paused state, cannot process message now. " + interfaceC6144u6.mo12961a());
    }

    @Override // com.flurry.sdk.AbstractC5981c3, com.flurry.sdk.InterfaceC6164x2
    /* renamed from: c */
    public final InterfaceC6164x2.a mo12957c(InterfaceC6144u6 interfaceC6144u6) {
        C6072m3 c6072m3 = new C6072m3();
        if (c6072m3.mo13189i(C6107q2.m13273e(), "crashFile")) {
            c6072m3.mo13185b(interfaceC6144u6);
            c6072m3.mo13184a();
        } else {
            C5988d1.m13030c(4, "FileWriterModule", "Can't create crash file. Cannot write crash frame to disc");
        }
        return InterfaceC6164x2.a.QUEUED;
    }

    @Override // com.flurry.sdk.AbstractC5981c3
    /* renamed from: t */
    public final void mo13000t() {
        C6107q2.m13269a();
        File file = new File(C6107q2.m13273e());
        if (!file.exists()) {
            file.mkdirs();
        }
        C6107q2.m13269a();
        File file2 = new File(C6107q2.m13271c());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        C6133t3 m13368z = m13368z();
        C6125s3 m13303i = m13368z != null ? C6125s3.m13303i(m13368z) : null;
        StringBuilder sb = new StringBuilder();
        sb.append(C6107q2.m13273e());
        String str = File.separator;
        sb.append(str);
        sb.append("currentFile");
        if (C6107q2.m13272d(sb.toString())) {
            if (C6107q2.m13272d(C6107q2.m13273e() + str + "crashFile")) {
                C6160w6 c6160w6 = new C6160w6(C6107q2.m13273e(), "currentFile");
                C6160w6 c6160w62 = new C6160w6(C6107q2.m13273e(), "crashFile");
                if (C6116r2.m13290a(c6160w6, c6160w62) && C6116r2.m13291b(c6160w6.f16502a, c6160w6.f16503b, c6160w62.f16502a, c6160w62.f16503b) && C6168x6.m13374d(c6160w6, c6160w62)) {
                    C6168x6.m13371a(c6160w62);
                }
                C6168x6.m13371a(c6160w62);
            }
            this.f16479s.mo13187d();
        }
        if (m13367y("currentFile")) {
            this.f16479s.mo13188f(C6135t5.m13308h(), null);
            if (m13303i != null) {
                this.f16479s.mo13185b(m13303i);
            }
        }
    }
}
