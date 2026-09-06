package p241e.p294g.p295a.p305d;

import android.text.Editable;
import android.widget.TextView;
import p241e.p294g.p295a.p304c.AbstractC8944c;

/* compiled from: TextViewAfterTextChangeEvent.java */
/* renamed from: e.g.a.d.b */
/* loaded from: classes2.dex */
public final class C8949b extends AbstractC8944c<TextView> {

    /* renamed from: b */
    private final Editable f34544b;

    private C8949b(TextView textView, Editable editable) {
        super(textView);
        this.f34544b = editable;
    }

    /* renamed from: b */
    public static C8949b m28583b(TextView textView, Editable editable) {
        return new C8949b(textView, editable);
    }

    /* renamed from: c */
    public Editable m28584c() {
        return this.f34544b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8949b)) {
            return false;
        }
        C8949b c8949b = (C8949b) obj;
        return c8949b.m28577a() == m28577a() && this.f34544b.equals(c8949b.f34544b);
    }

    public int hashCode() {
        return ((629 + m28577a().hashCode()) * 37) + this.f34544b.hashCode();
    }

    public String toString() {
        return "TextViewAfterTextChangeEvent{editable=" + ((Object) this.f34544b) + ", view=" + m28577a() + '}';
    }
}
