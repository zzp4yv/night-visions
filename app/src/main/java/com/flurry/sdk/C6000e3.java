package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.sdk.C6149v3;
import com.flurry.sdk.InterfaceC6009f3;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.flurry.sdk.e3 */
/* loaded from: classes2.dex */
public final class C6000e3 implements InterfaceC6009f3 {

    /* renamed from: k */
    private final Set<Integer> f15811k = new HashSet();

    /* renamed from: l */
    private final Set<Integer> f15812l = new HashSet();

    /* renamed from: m */
    private final Set<String> f15813m = new HashSet();

    /* renamed from: n */
    private final Set<Integer> f15814n = new HashSet();

    /* renamed from: o */
    private final Set<Integer> f15815o = new HashSet();

    /* renamed from: c */
    private static boolean m13053c(C6149v3 c6149v3) {
        return c6149v3.f16437g && !c6149v3.f16438h;
    }

    @Override // com.flurry.sdk.InterfaceC6009f3
    /* renamed from: a */
    public final void mo13043a() {
        this.f15811k.clear();
        this.f15812l.clear();
        this.f15813m.clear();
        this.f15814n.clear();
        this.f15815o.clear();
    }

    @Override // com.flurry.sdk.InterfaceC6009f3
    /* renamed from: b */
    public final InterfaceC6009f3.a mo13044b(InterfaceC6144u6 interfaceC6144u6) {
        if (interfaceC6144u6.mo12961a().equals(EnumC6128s6.FLUSH_FRAME)) {
            return new InterfaceC6009f3.a(InterfaceC6009f3.b.DO_NOT_DROP, new C6157w3(new C6165x3(this.f15811k.size(), this.f15812l.isEmpty())));
        }
        if (!interfaceC6144u6.mo12961a().equals(EnumC6128s6.ANALYTICS_EVENT)) {
            return InterfaceC6009f3.f15851a;
        }
        C6149v3 c6149v3 = (C6149v3) interfaceC6144u6.mo13298f();
        String str = c6149v3.f16432b;
        int i2 = c6149v3.f16433c;
        this.f15811k.add(Integer.valueOf(i2));
        if (c6149v3.f16434d != C6149v3.a.CUSTOM) {
            if (this.f15815o.size() < 1000 || m13053c(c6149v3)) {
                this.f15815o.add(Integer.valueOf(i2));
                return InterfaceC6009f3.f15851a;
            }
            this.f15812l.add(Integer.valueOf(i2));
            return InterfaceC6009f3.f15855e;
        }
        if (TextUtils.isEmpty(str)) {
            this.f15812l.add(Integer.valueOf(i2));
            return InterfaceC6009f3.f15853c;
        }
        if (m13053c(c6149v3) && !this.f15814n.contains(Integer.valueOf(i2))) {
            this.f15812l.add(Integer.valueOf(i2));
            return InterfaceC6009f3.f15856f;
        }
        if (this.f15814n.size() >= 1000 && !m13053c(c6149v3)) {
            this.f15812l.add(Integer.valueOf(i2));
            return InterfaceC6009f3.f15854d;
        }
        if (!this.f15813m.contains(str) && this.f15813m.size() >= 500) {
            this.f15812l.add(Integer.valueOf(i2));
            return InterfaceC6009f3.f15852b;
        }
        this.f15813m.add(str);
        this.f15814n.add(Integer.valueOf(i2));
        return InterfaceC6009f3.f15851a;
    }
}
