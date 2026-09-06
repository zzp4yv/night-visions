package p241e.p294g.p295a.p297b.p302c.p303a;

import androidx.recyclerview.widget.RecyclerView;
import p241e.p294g.p295a.p304c.AbstractC8944c;

/* compiled from: RecyclerViewScrollEvent.java */
/* renamed from: e.g.a.b.c.a.a */
/* loaded from: classes2.dex */
public final class C8934a extends AbstractC8944c<RecyclerView> {

    /* renamed from: b */
    private final int f34509b;

    /* renamed from: c */
    private final int f34510c;

    private C8934a(RecyclerView recyclerView, int i2, int i3) {
        super(recyclerView);
        this.f34509b = i2;
        this.f34510c = i3;
    }

    /* renamed from: b */
    public static C8934a m28563b(RecyclerView recyclerView, int i2, int i3) {
        return new C8934a(recyclerView, i2, i3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8934a)) {
            return false;
        }
        C8934a c8934a = (C8934a) obj;
        return c8934a.m28577a() == m28577a() && this.f34509b == c8934a.f34509b && this.f34510c == c8934a.f34510c;
    }

    public int hashCode() {
        return ((((629 + m28577a().hashCode()) * 37) + this.f34509b) * 37) + this.f34510c;
    }

    public String toString() {
        return "RecyclerViewScrollEvent{view=" + m28577a() + ", dx=" + this.f34509b + ", dy=" + this.f34510c + '}';
    }
}
