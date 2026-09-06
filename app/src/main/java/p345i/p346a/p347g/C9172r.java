package p345i.p346a.p347g;

import java.io.IOException;
import java.net.DatagramPacket;
import p345i.p346a.p347g.p348s.C9173a;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: SocketListener.java */
/* renamed from: i.a.g.r */
/* loaded from: classes2.dex */
class C9172r extends Thread {

    /* renamed from: f */
    static InterfaceC9699b f35465f = C9700c.m32189i(C9172r.class.getName());

    /* renamed from: g */
    private final C9166l f35466g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    C9172r(p345i.p346a.p347g.C9166l r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SocketListener("
            r0.append(r1)
            if (r3 == 0) goto L11
            java.lang.String r1 = r3.m29676p0()
            goto L13
        L11:
            java.lang.String r1 = ""
        L13:
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r0 = 1
            r2.setDaemon(r0)
            r2.f35466g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p345i.p346a.p347g.C9172r.<init>(i.a.g.l):void");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            DatagramPacket datagramPacket = new DatagramPacket(new byte[8972], 8972);
            while (!this.f35466g.m29662X0() && !this.f35466g.m29660V0()) {
                datagramPacket.setLength(8972);
                this.f35466g.m29645E0().receive(datagramPacket);
                if (this.f35466g.m29662X0() || this.f35466g.m29660V0() || this.f35466g.m29664Z0() || this.f35466g.isClosed()) {
                    break;
                }
                try {
                    if (!this.f35466g.m29674n0().m29610E(datagramPacket)) {
                        C9157c c9157c = new C9157c(datagramPacket);
                        if (c9157c.m29502s()) {
                            if (f35465f.mo32175d()) {
                                f35465f.mo32180i(getName() + ".run() JmDNS in:" + c9157c.m29474C(true));
                            }
                            if (c9157c.m29499p()) {
                                int port = datagramPacket.getPort();
                                int i2 = C9173a.f35467a;
                                if (port != i2) {
                                    this.f35466g.m29648G0(c9157c, datagramPacket.getAddress(), datagramPacket.getPort());
                                }
                                C9166l c9166l = this.f35466g;
                                c9166l.m29648G0(c9157c, c9166l.m29668f0(), i2);
                            } else {
                                this.f35466g.m29652K0(c9157c);
                            }
                        } else if (f35465f.mo32173b()) {
                            f35465f.mo32174c(getName() + ".run() JmDNS in message with error code:" + c9157c.m29474C(true));
                        }
                    }
                } catch (IOException e2) {
                    f35465f.mo32177f(getName() + ".run() exception ", e2);
                }
            }
        } catch (IOException e3) {
            if (!this.f35466g.m29662X0() && !this.f35466g.m29660V0() && !this.f35466g.m29664Z0() && !this.f35466g.isClosed()) {
                f35465f.mo32177f(getName() + ".run() exception ", e3);
                this.f35466g.m29669h1();
            }
        }
        if (f35465f.mo32175d()) {
            f35465f.mo32180i(getName() + ".run() exiting.");
        }
    }
}
