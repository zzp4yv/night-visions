package kotlin.reflect.p371y.internal.p374j0.p400i.p404s;

import kotlin.jvm.internal.C9768m;

/* compiled from: DeprecationInfo.kt */
/* renamed from: kotlin.f0.y.e.j0.i.s.a */
/* loaded from: classes3.dex */
public abstract class AbstractC10198a implements Comparable<AbstractC10198a> {
    @Override // java.lang.Comparable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC10198a abstractC10198a) {
        C9768m.m32346f(abstractC10198a, "other");
        int compareTo = mo33147k().compareTo(abstractC10198a.mo33147k());
        if (compareTo == 0 && !mo36064q() && abstractC10198a.mo36064q()) {
            return 1;
        }
        return compareTo;
    }

    /* renamed from: k */
    public abstract EnumC10199b mo33147k();

    /* renamed from: q */
    public abstract boolean mo36064q();
}
