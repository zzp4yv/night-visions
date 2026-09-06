package com.google.zxing.p223h.p224b;

/* compiled from: ASCIIEncoder.java */
/* renamed from: com.google.zxing.h.b.a */
/* loaded from: classes2.dex */
final class C8607a implements InterfaceC8613g {
    C8607a() {
    }

    /* renamed from: b */
    private static char m27305b(char c2, char c3) {
        if (C8616j.m27359f(c2) && C8616j.m27359f(c3)) {
            return (char) (((c2 - '0') * 10) + (c3 - '0') + 130);
        }
        throw new IllegalArgumentException("not digits: " + c2 + c3);
    }

    @Override // com.google.zxing.p223h.p224b.InterfaceC8613g
    /* renamed from: a */
    public void mo27306a(C8614h c8614h) {
        if (C8616j.m27354a(c8614h.m27336d(), c8614h.f32840f) >= 2) {
            c8614h.m27349r(m27305b(c8614h.m27336d().charAt(c8614h.f32840f), c8614h.m27336d().charAt(c8614h.f32840f + 1)));
            c8614h.f32840f += 2;
            return;
        }
        char m27335c = c8614h.m27335c();
        int m27367n = C8616j.m27367n(c8614h.m27336d(), c8614h.f32840f, m27307c());
        if (m27367n == m27307c()) {
            if (!C8616j.m27360g(m27335c)) {
                c8614h.m27349r((char) (m27335c + 1));
                c8614h.f32840f++;
                return;
            } else {
                c8614h.m27349r((char) 235);
                c8614h.m27349r((char) ((m27335c - 128) + 1));
                c8614h.f32840f++;
                return;
            }
        }
        if (m27367n == 1) {
            c8614h.m27349r((char) 230);
            c8614h.m27346o(1);
            return;
        }
        if (m27367n == 2) {
            c8614h.m27349r((char) 239);
            c8614h.m27346o(2);
            return;
        }
        if (m27367n == 3) {
            c8614h.m27349r((char) 238);
            c8614h.m27346o(3);
        } else if (m27367n == 4) {
            c8614h.m27349r((char) 240);
            c8614h.m27346o(4);
        } else {
            if (m27367n != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(m27367n)));
            }
            c8614h.m27349r((char) 231);
            c8614h.m27346o(5);
        }
    }

    /* renamed from: c */
    public int m27307c() {
        return 0;
    }
}
