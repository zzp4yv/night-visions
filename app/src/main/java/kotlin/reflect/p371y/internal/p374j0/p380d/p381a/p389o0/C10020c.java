package kotlin.reflect.p371y.internal.p374j0.p380d.p381a.p389o0;

import java.util.Iterator;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10583c;
import kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: typeEnhancement.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.o0.c */
/* loaded from: classes3.dex */
final class C10020c implements InterfaceC10587g {

    /* renamed from: f */
    private final C10127c f38209f;

    public C10020c(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqNameToMatch");
        this.f38209f = c10127c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: R0 */
    public boolean mo33270R0(C10127c c10127c) {
        return InterfaceC10587g.b.m37738b(this, c10127c);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C10019b mo33271l(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        if (C9768m.m32341a(c10127c, this.f38209f)) {
            return C10019b.f38208a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10583c> iterator() {
        return C10784u.m38888j().iterator();
    }
}
