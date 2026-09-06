package p456rx.p461n.p462a;

import java.util.ArrayList;
import java.util.Queue;
import p456rx.C11183b;
import p456rx.exceptions.CompositeException;

/* compiled from: CompletableOnSubscribeMerge.java */
/* renamed from: rx.n.a.e */
/* loaded from: classes3.dex */
public final class C11225e implements C11183b.w {
    /* renamed from: a */
    public static Throwable m40197a(Queue<Throwable> queue) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Throwable poll = queue.poll();
            if (poll == null) {
                break;
            }
            arrayList.add(poll);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? (Throwable) arrayList.get(0) : new CompositeException(arrayList);
    }
}
