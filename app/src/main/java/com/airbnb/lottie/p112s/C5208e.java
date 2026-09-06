package com.airbnb.lottie.p112s;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath.java */
/* renamed from: com.airbnb.lottie.s.e */
/* loaded from: classes.dex */
public class C5208e {

    /* renamed from: a */
    private final List<String> f12672a;

    /* renamed from: b */
    private InterfaceC5209f f12673b;

    public C5208e(String... strArr) {
        this.f12672a = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m9603b() {
        return this.f12672a.get(r0.size() - 1).equals("**");
    }

    /* renamed from: f */
    private boolean m9604f(String str) {
        return str.equals("__container");
    }

    /* renamed from: a */
    public C5208e m9605a(String str) {
        C5208e c5208e = new C5208e(this);
        c5208e.f12672a.add(str);
        return c5208e;
    }

    /* renamed from: c */
    public boolean m9606c(String str, int i2) {
        if (i2 >= this.f12672a.size()) {
            return false;
        }
        boolean z = i2 == this.f12672a.size() - 1;
        String str2 = this.f12672a.get(i2);
        if (!str2.equals("**")) {
            return (z || (i2 == this.f12672a.size() + (-2) && m9603b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.f12672a.get(i2 + 1).equals(str)) {
            return i2 == this.f12672a.size() + (-2) || (i2 == this.f12672a.size() + (-3) && m9603b());
        }
        if (z) {
            return true;
        }
        int i3 = i2 + 1;
        if (i3 < this.f12672a.size() - 1) {
            return false;
        }
        return this.f12672a.get(i3).equals(str);
    }

    /* renamed from: d */
    public InterfaceC5209f m9607d() {
        return this.f12673b;
    }

    /* renamed from: e */
    public int m9608e(String str, int i2) {
        if (m9604f(str)) {
            return 0;
        }
        if (this.f12672a.get(i2).equals("**")) {
            return (i2 != this.f12672a.size() - 1 && this.f12672a.get(i2 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    /* renamed from: g */
    public boolean m9609g(String str, int i2) {
        if (m9604f(str)) {
            return true;
        }
        if (i2 >= this.f12672a.size()) {
            return false;
        }
        return this.f12672a.get(i2).equals(str) || this.f12672a.get(i2).equals("**") || this.f12672a.get(i2).equals("*");
    }

    /* renamed from: h */
    public boolean m9610h(String str, int i2) {
        return str.equals("__container") || i2 < this.f12672a.size() - 1 || this.f12672a.get(i2).equals("**");
    }

    /* renamed from: i */
    public C5208e m9611i(InterfaceC5209f interfaceC5209f) {
        C5208e c5208e = new C5208e(this);
        c5208e.f12673b = interfaceC5209f;
        return c5208e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f12672a);
        sb.append(",resolved=");
        sb.append(this.f12673b != null);
        sb.append('}');
        return sb.toString();
    }

    private C5208e(C5208e c5208e) {
        this.f12672a = new ArrayList(c5208e.f12672a);
        this.f12673b = c5208e.f12673b;
    }
}
