package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class zzak implements zzm {

    /* renamed from: a */
    private static final boolean f22076a = zzag.f21996b;

    /* renamed from: b */
    @Deprecated
    private final zzas f22077b;

    /* renamed from: c */
    private final zzaj f22078c;

    /* renamed from: d */
    private final zzal f22079d;

    @Deprecated
    public zzak(zzas zzasVar) {
        this(zzasVar, new zzal(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    /* renamed from: b */
    private static void m16629b(String str, zzr<?> zzrVar, zzaf zzafVar) throws zzaf {
        zzac m20425R = zzrVar.m20425R();
        int m20424Q = zzrVar.m20424Q();
        try {
            m20425R.mo16393a(zzafVar);
            zzrVar.m20418I(String.format("%s-retry [timeout=%s]", str, Integer.valueOf(m20424Q)));
        } catch (zzaf e2) {
            zzrVar.m20418I(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(m20424Q)));
            throw e2;
        }
    }

    /* renamed from: c */
    private final byte[] m16630c(InputStream inputStream, int i2) throws IOException, zzad {
        zzaw zzawVar = new zzaw(this.f22079d, i2);
        try {
            if (inputStream == null) {
                throw new zzad();
            }
            byte[] m16646b = this.f22079d.m16646b(1024);
            while (true) {
                int read = inputStream.read(m16646b);
                if (read == -1) {
                    break;
                }
                zzawVar.write(m16646b, 0, read);
            }
            byte[] byteArray = zzawVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused) {
                zzag.m16528c("Error occurred when closing InputStream", new Object[0]);
            }
            this.f22079d.m16645a(m16646b);
            zzawVar.close();
            return byteArray;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                    zzag.m16528c("Error occurred when closing InputStream", new Object[0]);
                }
            }
            this.f22079d.m16645a(null);
            zzawVar.close();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzm
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.zzp mo16589a(com.google.android.gms.internal.ads.zzr<?> r22) throws com.google.android.gms.internal.ads.zzaf {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzak.mo16589a(com.google.android.gms.internal.ads.zzr):com.google.android.gms.internal.ads.zzp");
    }

    @Deprecated
    private zzak(zzas zzasVar, zzal zzalVar) {
        this.f22077b = zzasVar;
        this.f22078c = new C6956o0(zzasVar);
        this.f22079d = zzalVar;
    }

    public zzak(zzaj zzajVar) {
        this(zzajVar, new zzal(RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    private zzak(zzaj zzajVar, zzal zzalVar) {
        this.f22078c = zzajVar;
        this.f22077b = zzajVar;
        this.f22079d = zzalVar;
    }
}
