package p345i.p346a;

import java.util.EventObject;

/* compiled from: ServiceEvent.java */
/* renamed from: i.a.c */
/* loaded from: classes2.dex */
public abstract class AbstractC9151c extends EventObject implements Cloneable {
    public AbstractC9151c(Object obj) {
        super(obj);
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC9151c clone() {
        try {
            return (AbstractC9151c) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public abstract AbstractC9149a mo29411d();

    /* renamed from: e */
    public abstract AbstractC9152d mo29412e();

    /* renamed from: f */
    public abstract String mo29413f();

    /* renamed from: g */
    public abstract String mo29414g();
}
