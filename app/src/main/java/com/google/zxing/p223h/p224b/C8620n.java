package com.google.zxing.p223h.p224b;

/* compiled from: X12Encoder.java */
/* renamed from: com.google.zxing.h.b.n */
/* loaded from: classes2.dex */
final class C8620n extends C8609c {
    C8620n() {
    }

    @Override // com.google.zxing.p223h.p224b.C8609c, com.google.zxing.p223h.p224b.InterfaceC8613g
    /* renamed from: a */
    public void mo27306a(C8614h c8614h) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!c8614h.m27340i()) {
                break;
            }
            char m27335c = c8614h.m27335c();
            c8614h.f32840f++;
            mo27313c(m27335c, sb);
            if (sb.length() % 3 == 0) {
                C8609c.m27312g(c8614h, sb);
                if (C8616j.m27367n(c8614h.m27336d(), c8614h.f32840f, mo27314e()) != mo27314e()) {
                    c8614h.m27346o(0);
                    break;
                }
            }
        }
        mo27315f(c8614h, sb);
    }

    @Override // com.google.zxing.p223h.p224b.C8609c
    /* renamed from: c */
    int mo27313c(char c2, StringBuilder sb) {
        if (c2 == '\r') {
            sb.append((char) 0);
        } else if (c2 == ' ') {
            sb.append((char) 3);
        } else if (c2 == '*') {
            sb.append((char) 1);
        } else if (c2 == '>') {
            sb.append((char) 2);
        } else if (c2 >= '0' && c2 <= '9') {
            sb.append((char) ((c2 - '0') + 4));
        } else if (c2 < 'A' || c2 > 'Z') {
            C8616j.m27358e(c2);
        } else {
            sb.append((char) ((c2 - 'A') + 14));
        }
        return 1;
    }

    @Override // com.google.zxing.p223h.p224b.C8609c
    /* renamed from: e */
    public int mo27314e() {
        return 3;
    }

    @Override // com.google.zxing.p223h.p224b.C8609c
    /* renamed from: f */
    void mo27315f(C8614h c8614h, StringBuilder sb) {
        c8614h.m27347p();
        int m27372a = c8614h.m27339g().m27372a() - c8614h.m27333a();
        c8614h.f32840f -= sb.length();
        if (c8614h.m27338f() > 1 || m27372a > 1 || c8614h.m27338f() != m27372a) {
            c8614h.m27349r((char) 254);
        }
        if (c8614h.m27337e() < 0) {
            c8614h.m27346o(0);
        }
    }
}
