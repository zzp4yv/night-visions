package com.flurry.sdk;

import com.flurry.sdk.C6035i2;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.flurry.sdk.z6 */
/* loaded from: classes2.dex */
public final class C6184z6 extends C6062l2 implements InterfaceC6176y6 {

    /* renamed from: o */
    public FileObserverC5967a7 f16544o;

    /* renamed from: p */
    public InterfaceC6152v6 f16545p;

    /* renamed from: com.flurry.sdk.z6$a */
    public class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6176y6 f16546h;

        public a(InterfaceC6176y6 interfaceC6176y6) {
            this.f16546h = interfaceC6176y6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C6184z6.this.f16544o = new FileObserverC5967a7(C6107q2.m13271c(), this.f16546h);
            C6184z6.this.f16544o.startWatching();
        }
    }

    /* renamed from: com.flurry.sdk.z6$b */
    final class b extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ List f16548h;

        b(List list) {
            this.f16548h = list;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() throws Exception {
            C5988d1.m13030c(2, "VNodeFileProcessor", "Number of files already pending: in VNodeListener " + this.f16548h.size());
            ArrayList arrayList = new ArrayList();
            for (File file : this.f16548h) {
                if (file.exists()) {
                    arrayList.add(file.getAbsolutePath());
                }
            }
            if (C6184z6.this.f16545p != null) {
                C6184z6.this.f16545p.mo13134e(arrayList);
            }
        }
    }

    public C6184z6(InterfaceC6152v6 interfaceC6152v6) {
        super("VNodeFileProcessor", C6035i2.m13111a(C6035i2.b.DATA_PROCESSOR));
        this.f16544o = null;
        this.f16545p = interfaceC6152v6;
    }

    /* renamed from: e */
    public final void m13390e(List<File> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        mo13007m(new b(list));
    }

    @Override // com.flurry.sdk.InterfaceC6176y6
    /* renamed from: h */
    public final void mo13379h(String str) {
        File file = new File(C6107q2.m13271c() + File.separator + str);
        if (file.exists()) {
            m13390e(Arrays.asList(file));
        }
    }
}
