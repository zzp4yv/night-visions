package kotlin.reflect.p371y.internal.p374j0.p422m;

import java.util.Iterator;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: ArrayMap.kt */
/* renamed from: kotlin.f0.y.e.j0.m.c */
/* loaded from: classes3.dex */
public abstract class AbstractC10434c<T> implements Iterable<T>, KMappedMarker {
    private AbstractC10434c() {
    }

    public /* synthetic */ AbstractC10434c(C9756g c9756g) {
        this();
    }

    /* renamed from: c */
    public abstract int mo37188c();

    /* renamed from: f */
    public abstract void mo37189f(int i2, T t);

    public abstract T get(int i2);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();
}
