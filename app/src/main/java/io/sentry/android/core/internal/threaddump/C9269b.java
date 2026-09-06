package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: Lines.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.threaddump.b */
/* loaded from: classes2.dex */
public final class C9269b {

    /* renamed from: a */
    private final ArrayList<? extends C9268a> f35961a;

    /* renamed from: b */
    private final int f35962b = 0;

    /* renamed from: c */
    private final int f35963c;

    /* renamed from: d */
    public int f35964d;

    public C9269b(ArrayList<? extends C9268a> arrayList) {
        this.f35961a = arrayList;
        this.f35963c = arrayList.size();
    }

    /* renamed from: c */
    public static C9269b m30260c(BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return new C9269b(arrayList);
            }
            i2++;
            arrayList.add(new C9268a(i2, readLine));
        }
    }

    /* renamed from: a */
    public boolean m30261a() {
        return this.f35964d < this.f35963c;
    }

    /* renamed from: b */
    public C9268a m30262b() {
        int i2 = this.f35964d;
        if (i2 < this.f35962b || i2 >= this.f35963c) {
            return null;
        }
        ArrayList<? extends C9268a> arrayList = this.f35961a;
        this.f35964d = i2 + 1;
        return arrayList.get(i2);
    }

    /* renamed from: d */
    public void m30263d() {
        this.f35964d--;
    }
}
