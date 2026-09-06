package com.google.firebase.p209u;

import android.content.Context;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;

/* compiled from: LibraryVersionComponent.java */
/* renamed from: com.google.firebase.u.h */
/* loaded from: classes2.dex */
public class C8522h {

    /* compiled from: LibraryVersionComponent.java */
    /* renamed from: com.google.firebase.u.h$a */
    public interface a<T> {
        /* renamed from: a */
        String mo24966a(T t);
    }

    /* renamed from: a */
    public static C8091n<?> m26903a(String str, String str2) {
        return C8091n.m24988j(AbstractC8521g.m26902a(str, str2), AbstractC8521g.class);
    }

    /* renamed from: b */
    public static C8091n<?> m26904b(final String str, final a<Context> aVar) {
        return C8091n.m24989k(AbstractC8521g.class).m25006b(C8099v.m25060k(Context.class)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.u.b
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                AbstractC8521g m26902a;
                m26902a = AbstractC8521g.m26902a(str, aVar.mo24966a((Context) interfaceC8093p.mo24973a(Context.class)));
                return m26902a;
            }
        }).m25008d();
    }
}
