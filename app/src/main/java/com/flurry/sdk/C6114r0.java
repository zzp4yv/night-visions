package com.flurry.sdk;

import com.flurry.sdk.C6122s0;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.flurry.sdk.r0 */
/* loaded from: classes2.dex */
public final class C6114r0 {

    /* renamed from: a */
    public static final Integer f16299a = 50;

    /* renamed from: b */
    String f16300b;

    /* renamed from: c */
    LinkedHashMap<String, List<String>> f16301c = new LinkedHashMap<>();

    /* renamed from: com.flurry.sdk.r0$a */
    final class a implements InterfaceC6171y1<List<C6122s0>> {
        a() {
        }

        @Override // com.flurry.sdk.InterfaceC6171y1
        /* renamed from: a */
        public final InterfaceC6147v1<List<C6122s0>> mo13122a(int i2) {
            return new C6139u1(new C6122s0.a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$b */
    final class b implements InterfaceC6171y1<List<C6122s0>> {
        b() {
        }

        @Override // com.flurry.sdk.InterfaceC6171y1
        /* renamed from: a */
        public final InterfaceC6147v1<List<C6122s0>> mo13122a(int i2) {
            return new C6139u1(new C6122s0.a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$c */
    final class c implements InterfaceC6171y1<List<C6122s0>> {
        c() {
        }

        @Override // com.flurry.sdk.InterfaceC6171y1
        /* renamed from: a */
        public final InterfaceC6147v1<List<C6122s0>> mo13122a(int i2) {
            return new C6139u1(new C6122s0.a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$d */
    final class d implements InterfaceC6171y1<List<C6122s0>> {
        d() {
        }

        @Override // com.flurry.sdk.InterfaceC6171y1
        /* renamed from: a */
        public final InterfaceC6147v1<List<C6122s0>> mo13122a(int i2) {
            return new C6139u1(new C6122s0.a());
        }
    }

    /* renamed from: com.flurry.sdk.r0$e */
    final class e implements InterfaceC6171y1<List<C6122s0>> {
        e() {
        }

        @Override // com.flurry.sdk.InterfaceC6171y1
        /* renamed from: a */
        public final InterfaceC6147v1<List<C6122s0>> mo13122a(int i2) {
            return new C6139u1(new C6122s0.a());
        }
    }

    public C6114r0(String str) {
        this.f16300b = str + "Main";
    }

    /* renamed from: d */
    private synchronized void m13277d(String str, List<String> list, String str2) {
        C5980c2.m12988d();
        C5988d1.m13030c(5, "FlurryDataSenderIndex", "Saving Index File for " + str + " file name:" + C5969b0.m12964a().getFileStreamPath(m13280i(str)));
        C5985c7 c5985c7 = new C5985c7(C5969b0.m12964a().getFileStreamPath(m13280i(str)), str2, 1, new c());
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C6122s0(it.next()));
        }
        c5985c7.m13012b(arrayList);
    }

    /* renamed from: f */
    private synchronized void m13278f() {
        LinkedList linkedList = new LinkedList(this.f16301c.keySet());
        new C5985c7(C5969b0.m12964a().getFileStreamPath(m13280i(this.f16300b)), ".YFlurrySenderIndex.info.", 1, new d()).m13013c();
        if (!linkedList.isEmpty()) {
            String str = this.f16300b;
            m13277d(str, linkedList, str);
        }
    }

    /* renamed from: h */
    static void m13279h(String str) {
        C5980c2.m12988d();
        C5988d1.m13030c(5, "FlurryDataSenderIndex", "Deleting Index File for " + str + " file name:" + C5969b0.m12964a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = C5969b0.m12964a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        if (fileStreamPath.exists()) {
            C5988d1.m13030c(5, "FlurryDataSenderIndex", "Found file for " + str + ". Deleted - " + fileStreamPath.delete());
        }
    }

    /* renamed from: i */
    static String m13280i(String str) {
        return ".YFlurrySenderIndex.info.".concat(String.valueOf(str));
    }

    /* renamed from: l */
    private static byte[] m13281l(String str) {
        byte[] bArr;
        DataInputStream dataInputStream;
        C5980c2.m12988d();
        C5988d1.m13030c(5, "FlurryDataSenderIndex", "Reading block File for " + str + " file name:" + C5969b0.m12964a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str))));
        File fileStreamPath = C5969b0.m12964a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str)));
        DataInputStream dataInputStream2 = null;
        byte[] bArr2 = null;
        if (!fileStreamPath.exists()) {
            C5988d1.m13030c(4, "FlurryDataSenderIndex", "Agent cache file doesn't exist.");
            return null;
        }
        C5988d1.m13030c(5, "FlurryDataSenderIndex", "Reading Index File for " + str + " Found file.");
        try {
            dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
        } catch (Throwable th) {
            th = th;
            bArr = null;
        }
        try {
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            if (readUnsignedShort == 0) {
                C5980c2.m12990f(dataInputStream);
                return null;
            }
            bArr2 = new byte[readUnsignedShort];
            dataInputStream.readFully(bArr2);
            dataInputStream.readUnsignedShort();
            C5980c2.m12990f(dataInputStream);
            return bArr2;
        } catch (Throwable th2) {
            th = th2;
            byte[] bArr3 = bArr2;
            dataInputStream2 = dataInputStream;
            bArr = bArr3;
            try {
                C5988d1.m13031d(6, "FlurryDataSenderIndex", "Error when loading persistent file", th);
                C5980c2.m12990f(dataInputStream2);
                return bArr;
            } catch (Throwable th3) {
                C5980c2.m12990f(dataInputStream2);
                throw th3;
            }
        }
    }

    /* renamed from: m */
    private synchronized boolean m13282m(String str) {
        boolean m13013c;
        C5980c2.m12988d();
        C5985c7 c5985c7 = new C5985c7(C5969b0.m12964a().getFileStreamPath(m13280i(str)), ".YFlurrySenderIndex.info.", 1, new e());
        List<String> m13289k = m13289k(str);
        if (m13289k != null && !m13289k.isEmpty()) {
            C5988d1.m13030c(4, "FlurryDataSenderIndex", "discardOutdatedBlocksForDataKey: notSentBlocks = " + m13289k.size());
            for (String str2 : m13289k) {
                C6105q0.m13265b(str2).m13013c();
                C5988d1.m13030c(4, "FlurryDataSenderIndex", "discardOutdatedBlocksForDataKey: removed block = ".concat(String.valueOf(str2)));
            }
        }
        this.f16301c.remove(str);
        m13013c = c5985c7.m13013c();
        m13278f();
        return m13013c;
    }

    /* renamed from: a */
    public final List<String> m13283a() {
        return new ArrayList(this.f16301c.keySet());
    }

    /* renamed from: b */
    final synchronized List<String> m13284b(String str) {
        ArrayList arrayList;
        DataInputStream dataInputStream;
        int readUnsignedShort;
        C5980c2.m12988d();
        C5988d1.m13030c(5, "FlurryDataSenderIndex", "Reading Index File for " + str + " file name:" + C5969b0.m12964a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str))));
        File fileStreamPath = C5969b0.m12964a().getFileStreamPath(".FlurrySenderIndex.info.".concat(String.valueOf(str)));
        ArrayList arrayList2 = null;
        DataInputStream dataInputStream2 = null;
        if (fileStreamPath.exists()) {
            C5988d1.m13030c(5, "FlurryDataSenderIndex", "Reading Index File for " + str + " Found file.");
            try {
                dataInputStream = new DataInputStream(new FileInputStream(fileStreamPath));
                try {
                    readUnsignedShort = dataInputStream.readUnsignedShort();
                } catch (Throwable th) {
                    th = th;
                    arrayList = null;
                }
            } catch (Throwable th2) {
                th = th2;
                arrayList = null;
            }
            if (readUnsignedShort == 0) {
                C5980c2.m12990f(dataInputStream);
                return null;
            }
            arrayList = new ArrayList(readUnsignedShort);
            for (int i2 = 0; i2 < readUnsignedShort; i2++) {
                try {
                    int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                    C5988d1.m13030c(4, "FlurryDataSenderIndex", "read iter " + i2 + " dataLength = " + readUnsignedShort2);
                    byte[] bArr = new byte[readUnsignedShort2];
                    dataInputStream.readFully(bArr);
                    arrayList.add(new String(bArr));
                } catch (Throwable th3) {
                    th = th3;
                    dataInputStream2 = dataInputStream;
                    try {
                        C5988d1.m13031d(6, "FlurryDataSenderIndex", "Error when loading persistent file", th);
                        arrayList2 = arrayList;
                        return arrayList2;
                    } finally {
                        C5980c2.m12990f(dataInputStream2);
                    }
                }
            }
            dataInputStream.readUnsignedShort();
            C5980c2.m12990f(dataInputStream);
            arrayList2 = arrayList;
        } else {
            C5988d1.m13030c(5, "FlurryDataSenderIndex", "Agent cache file doesn't exist.");
        }
        return arrayList2;
    }

    /* renamed from: c */
    public final synchronized void m13285c(C6105q0 c6105q0, String str) {
        boolean z;
        C5988d1.m13030c(4, "FlurryDataSenderIndex", "addBlockInfo".concat(String.valueOf(str)));
        String str2 = c6105q0.f16272a;
        List<String> list = this.f16301c.get(str);
        if (list == null) {
            C5988d1.m13030c(4, "FlurryDataSenderIndex", "New Data Key");
            list = new LinkedList<>();
            z = true;
        } else {
            z = false;
        }
        list.add(str2);
        if (list.size() > f16299a.intValue()) {
            C6105q0.m13265b(list.get(0)).m13013c();
            list.remove(0);
        }
        this.f16301c.put(str, list);
        m13277d(str, list, ".YFlurrySenderIndex.info.");
        if (z) {
            m13278f();
        }
    }

    /* renamed from: e */
    public final boolean m13286e(String str, String str2) {
        boolean z;
        List<String> list = this.f16301c.get(str2);
        if (list != null) {
            C6105q0.m13265b(str).m13013c();
            z = list.remove(str);
        } else {
            z = false;
        }
        if (list == null || list.isEmpty()) {
            m13282m(str2);
        } else {
            this.f16301c.put(str2, list);
            m13277d(str2, list, ".YFlurrySenderIndex.info.");
        }
        return z;
    }

    /* renamed from: g */
    final void m13287g(String str) {
        List<String> m13284b = m13284b(str);
        if (m13284b == null) {
            C5988d1.m13039l("FlurryDataSenderIndex", "No old file to replace");
            return;
        }
        for (String str2 : m13284b) {
            byte[] m13281l = m13281l(str2);
            if (m13281l == null) {
                C5988d1.m13030c(6, "FlurryDataSenderIndex", "File does not exist");
            } else {
                C5980c2.m12988d();
                C5988d1.m13030c(5, "FlurryDataSenderIndex", "Saving Block File for " + str2 + " file name:" + C5969b0.m12964a().getFileStreamPath(C6105q0.m13264a(str2)));
                C6105q0.m13265b(str2).m13012b(new C6105q0(m13281l));
                C5980c2.m12988d();
                C5988d1.m13030c(5, "FlurryDataSenderIndex", "Deleting  block File for " + str2 + " file name:" + C5969b0.m12964a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str2))));
                File fileStreamPath = C5969b0.m12964a().getFileStreamPath(".flurrydatasenderblock.".concat(String.valueOf(str2)));
                if (fileStreamPath.exists()) {
                    C5988d1.m13030c(5, "FlurryDataSenderIndex", "Found file for " + str2 + ". Deleted - " + fileStreamPath.delete());
                }
            }
        }
        m13277d(str, m13284b, ".YFlurrySenderIndex.info.");
        m13279h(str);
    }

    /* renamed from: j */
    final synchronized List<String> m13288j(String str) {
        C5980c2.m12988d();
        C5988d1.m13030c(5, "FlurryDataSenderIndex", "Reading Index File for " + str + " file name:" + C5969b0.m12964a().getFileStreamPath(m13280i(str)));
        List list = (List) new C5985c7(C5969b0.m12964a().getFileStreamPath(m13280i(str)), ".YFlurrySenderIndex.info.", 1, new b()).m13011a();
        if (list == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C6122s0) it.next()).f16315a);
        }
        return arrayList;
    }

    /* renamed from: k */
    public final List<String> m13289k(String str) {
        List<String> list = this.f16301c.get(str);
        return list == null ? Collections.emptyList() : new ArrayList(list);
    }
}
