package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: LazyFieldLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.k */
/* loaded from: classes3.dex */
public class C10719k {

    /* renamed from: a */
    private AbstractC10712d f41319a;

    /* renamed from: b */
    private C10714f f41320b;

    /* renamed from: c */
    private volatile boolean f41321c;

    /* renamed from: d */
    protected volatile InterfaceC10723o f41322d;

    /* renamed from: a */
    protected void m38419a(InterfaceC10723o interfaceC10723o) {
        if (this.f41322d != null) {
            return;
        }
        synchronized (this) {
            if (this.f41322d != null) {
                return;
            }
            try {
                if (this.f41319a != null) {
                    this.f41322d = interfaceC10723o.mo34080g().mo38262d(this.f41319a, this.f41320b);
                } else {
                    this.f41322d = interfaceC10723o;
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public int m38420b() {
        return this.f41321c ? this.f41322d.mo34078e() : this.f41319a.size();
    }

    /* renamed from: c */
    public InterfaceC10723o m38421c(InterfaceC10723o interfaceC10723o) {
        m38419a(interfaceC10723o);
        return this.f41322d;
    }

    /* renamed from: d */
    public InterfaceC10723o m38422d(InterfaceC10723o interfaceC10723o) {
        InterfaceC10723o interfaceC10723o2 = this.f41322d;
        this.f41322d = interfaceC10723o;
        this.f41319a = null;
        this.f41321c = true;
        return interfaceC10723o2;
    }
}
