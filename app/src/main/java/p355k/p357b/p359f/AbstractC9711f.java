package p355k.p357b.p359f;

import java.io.ObjectStreamException;
import java.io.Serializable;
import p355k.p357b.C9700c;
import p355k.p357b.InterfaceC9699b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NamedLoggerBase.java */
/* renamed from: k.b.f.f */
/* loaded from: classes3.dex */
public abstract class AbstractC9711f implements InterfaceC9699b, Serializable {

    /* renamed from: f */
    protected String f37133f;

    AbstractC9711f() {
    }

    /* renamed from: j */
    public String mo32212j() {
        return this.f37133f;
    }

    protected Object readResolve() throws ObjectStreamException {
        return C9700c.m32189i(mo32212j());
    }
}
