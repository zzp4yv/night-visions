package kotlin.reflect.p371y.internal.p374j0.p415l.p416t1;

import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p400i.C10160j;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10311e0;
import kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10348q1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10309d1;
import kotlin.reflect.p371y.internal.p374j0.p415l.C10313f;
import kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.AbstractC10362f;

/* compiled from: NewKotlinTypeChecker.kt */
/* renamed from: kotlin.f0.y.e.j0.l.t1.m */
/* loaded from: classes3.dex */
public final class C10369m implements InterfaceC10368l {

    /* renamed from: c */
    private final AbstractC10363g f40204c;

    /* renamed from: d */
    private final AbstractC10362f f40205d;

    /* renamed from: e */
    private final C10160j f40206e;

    public C10369m(AbstractC10363g abstractC10363g, AbstractC10362f abstractC10362f) {
        C9768m.m32346f(abstractC10363g, "kotlinTypeRefiner");
        C9768m.m32346f(abstractC10362f, "kotlinTypePreparator");
        this.f40204c = abstractC10363g;
        this.f40205d = abstractC10362f;
        C10160j m35870m = C10160j.m35870m(mo36949c());
        C9768m.m32345e(m35870m, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f40206e = m35870m;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10368l
    /* renamed from: a */
    public C10160j mo36948a() {
        return this.f40206e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e
    /* renamed from: b */
    public boolean mo36919b(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02) {
        C9768m.m32346f(abstractC10311e0, "a");
        C9768m.m32346f(abstractC10311e02, "b");
        return m36951e(C10357a.m36830b(false, false, null, m36952f(), mo36949c(), 6, null), abstractC10311e0.mo36635R0(), abstractC10311e02.mo36635R0());
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10368l
    /* renamed from: c */
    public AbstractC10363g mo36949c() {
        return this.f40204c;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.p416t1.InterfaceC10361e
    /* renamed from: d */
    public boolean mo36920d(AbstractC10311e0 abstractC10311e0, AbstractC10311e0 abstractC10311e02) {
        C9768m.m32346f(abstractC10311e0, "subtype");
        C9768m.m32346f(abstractC10311e02, "supertype");
        return m36953g(C10357a.m36830b(true, false, null, m36952f(), mo36949c(), 6, null), abstractC10311e0.mo36635R0(), abstractC10311e02.mo36635R0());
    }

    /* renamed from: e */
    public final boolean m36951e(C10309d1 c10309d1, AbstractC10348q1 abstractC10348q1, AbstractC10348q1 abstractC10348q12) {
        C9768m.m32346f(c10309d1, "<this>");
        C9768m.m32346f(abstractC10348q1, "a");
        C9768m.m32346f(abstractC10348q12, "b");
        return C10313f.f40078a.m36654k(c10309d1, abstractC10348q1, abstractC10348q12);
    }

    /* renamed from: f */
    public AbstractC10362f m36952f() {
        return this.f40205d;
    }

    /* renamed from: g */
    public final boolean m36953g(C10309d1 c10309d1, AbstractC10348q1 abstractC10348q1, AbstractC10348q1 abstractC10348q12) {
        C9768m.m32346f(c10309d1, "<this>");
        C9768m.m32346f(abstractC10348q1, "subType");
        C9768m.m32346f(abstractC10348q12, "superType");
        return C10313f.m36649t(C10313f.f40078a, c10309d1, abstractC10348q1, abstractC10348q12, false, 8, null);
    }

    public /* synthetic */ C10369m(AbstractC10363g abstractC10363g, AbstractC10362f abstractC10362f, int i2, C9756g c9756g) {
        this(abstractC10363g, (i2 & 2) != 0 ? AbstractC10362f.a.f40182a : abstractC10362f);
    }
}
