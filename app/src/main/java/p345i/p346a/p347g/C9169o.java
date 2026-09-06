package p345i.p346a.p347g;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.HashSet;
import p345i.p346a.InterfaceC9150b;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* compiled from: NetworkTopologyDiscoveryImpl.java */
/* renamed from: i.a.g.o */
/* loaded from: classes2.dex */
public class C9169o implements InterfaceC9150b {

    /* renamed from: a */
    private static final InterfaceC9699b f35441a = C9700c.m32189i(C9169o.class.getName());

    @Override // p345i.p346a.InterfaceC9150b
    /* renamed from: a */
    public InetAddress[] mo29406a() {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface nextElement = networkInterfaces.nextElement();
                Enumeration<InetAddress> inetAddresses = nextElement.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement2 = inetAddresses.nextElement();
                    InterfaceC9699b interfaceC9699b = f35441a;
                    if (interfaceC9699b.mo32175d()) {
                        interfaceC9699b.mo32180i("Found NetworkInterface/InetAddress: " + nextElement + " -- " + nextElement2);
                    }
                    if (m29710b(nextElement, nextElement2)) {
                        hashSet.add(nextElement2);
                    }
                }
            }
        } catch (SocketException e2) {
            f35441a.mo32179h("Error while fetching network interfaces addresses: " + e2);
        }
        return (InetAddress[]) hashSet.toArray(new InetAddress[hashSet.size()]);
    }

    /* renamed from: b */
    public boolean m29710b(NetworkInterface networkInterface, InetAddress inetAddress) {
        try {
            if (networkInterface.isUp() && networkInterface.supportsMulticast()) {
                return !networkInterface.isLoopback();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
