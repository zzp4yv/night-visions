package kotlin.reflect.p371y.internal.p374j0.p415l.p417u1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.C10784u;
import kotlin.collections.C10787v0;
import kotlin.collections.C10789w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10696t0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10706y0;
import kotlin.reflect.p371y.internal.p374j0.p378c.p379b.InterfaceC9906b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10130f;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.C10214d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h;

/* compiled from: ErrorScope.kt */
/* renamed from: kotlin.f0.y.e.j0.l.u1.f */
/* loaded from: classes3.dex */
public class C10389f implements InterfaceC10218h {

    /* renamed from: b */
    private final EnumC10390g f40244b;

    /* renamed from: c */
    private final String f40245c;

    public C10389f(EnumC10390g enumC10390g, String... strArr) {
        C9768m.m32346f(enumC10390g, "kind");
        C9768m.m32346f(strArr, "formatParams");
        this.f40244b = enumC10390g;
        String m37042k = enumC10390g.m37042k();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(m37042k, Arrays.copyOf(copyOf, copyOf.length));
        C9768m.m32345e(format, "format(this, *args)");
        this.f40245c = format;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: b */
    public Set<C10130f> mo33312b() {
        Set<C10130f> m38917d;
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: d */
    public Set<C10130f> mo33314d() {
        Set<C10130f> m38917d;
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: e */
    public Set<C10130f> mo33315e() {
        Set<C10130f> m38917d;
        m38917d = C10789w0.m38917d();
        return m38917d;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: f */
    public InterfaceC10561h mo33316f(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        String format = String.format(EnumC10385b.ERROR_CLASS.m36988k(), Arrays.copyOf(new Object[]{c10130f}, 1));
        C9768m.m32345e(format, "format(this, *args)");
        C10130f m35451D = C10130f.m35451D(format);
        C9768m.m32345e(m35451D, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new C10384a(m35451D);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10221k
    /* renamed from: g */
    public Collection<InterfaceC10576m> mo33317g(C10214d c10214d, Function1<? super C10130f, Boolean> function1) {
        C9768m.m32346f(c10214d, "kindFilter");
        C9768m.m32346f(function1, "nameFilter");
        return C10784u.m38888j();
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set<InterfaceC10706y0> mo33311a(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        Set<InterfaceC10706y0> m38916c;
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        m38916c = C10787v0.m38916c(new C10386c(C10394k.f40355a.m37061h()));
        return m38916c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p400i.p408w.InterfaceC10218h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<InterfaceC10696t0> mo33313c(C10130f c10130f, InterfaceC9906b interfaceC9906b) {
        C9768m.m32346f(c10130f, "name");
        C9768m.m32346f(interfaceC9906b, "location");
        return C10394k.f40355a.m37063j();
    }

    /* renamed from: j */
    protected final String m37040j() {
        return this.f40245c;
    }

    public String toString() {
        return "ErrorScope{" + this.f40245c + '}';
    }
}
