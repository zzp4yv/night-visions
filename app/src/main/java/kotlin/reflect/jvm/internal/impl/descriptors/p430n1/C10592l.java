package kotlin.reflect.jvm.internal.impl.descriptors.p430n1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: Annotations.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.n1.l */
/* loaded from: classes2.dex */
public final class C10592l implements InterfaceC10587g {

    /* renamed from: f */
    private final InterfaceC10587g f40820f;

    /* renamed from: g */
    private final boolean f40821g;

    /* renamed from: h */
    private final Function1<C10127c, Boolean> f40822h;

    /* JADX WARN: Multi-variable type inference failed */
    public C10592l(InterfaceC10587g interfaceC10587g, boolean z, Function1<? super C10127c, Boolean> function1) {
        C9768m.m32346f(interfaceC10587g, "delegate");
        C9768m.m32346f(function1, "fqNameFilter");
        this.f40820f = interfaceC10587g;
        this.f40821g = z;
        this.f40822h = function1;
    }

    /* renamed from: c */
    private final boolean m37744c(InterfaceC10583c interfaceC10583c) {
        C10127c mo33162d = interfaceC10583c.mo33162d();
        return mo33162d != null && this.f40822h.invoke(mo33162d).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: R0 */
    public boolean mo33270R0(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        if (this.f40822h.invoke(c10127c).booleanValue()) {
            return this.f40820f.mo33270R0(c10127c);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    public boolean isEmpty() {
        boolean z;
        InterfaceC10587g interfaceC10587g = this.f40820f;
        if (!(interfaceC10587g instanceof Collection) || !((Collection) interfaceC10587g).isEmpty()) {
            Iterator<InterfaceC10583c> it = interfaceC10587g.iterator();
            while (it.hasNext()) {
                if (m37744c(it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return this.f40821g ? !z : z;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC10583c> iterator() {
        InterfaceC10587g interfaceC10587g = this.f40820f;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC10583c interfaceC10583c : interfaceC10587g) {
            if (m37744c(interfaceC10583c)) {
                arrayList.add(interfaceC10583c);
            }
        }
        return arrayList.iterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p430n1.InterfaceC10587g
    /* renamed from: l */
    public InterfaceC10583c mo33271l(C10127c c10127c) {
        C9768m.m32346f(c10127c, "fqName");
        if (this.f40822h.invoke(c10127c).booleanValue()) {
            return this.f40820f.mo33271l(c10127c);
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10592l(InterfaceC10587g interfaceC10587g, Function1<? super C10127c, Boolean> function1) {
        this(interfaceC10587g, false, function1);
        C9768m.m32346f(interfaceC10587g, "delegate");
        C9768m.m32346f(function1, "fqNameFilter");
    }
}
