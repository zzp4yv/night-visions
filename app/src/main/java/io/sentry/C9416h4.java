package io.sentry;

import io.sentry.protocol.C9523o;
import io.sentry.protocol.C9525q;
import io.sentry.util.C9613q;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryEnvelope.java */
@ApiStatus.Internal
/* renamed from: io.sentry.h4 */
/* loaded from: classes2.dex */
public final class C9416h4 {

    /* renamed from: a */
    private final C9440i4 f36342a;

    /* renamed from: b */
    private final Iterable<C9459j4> f36343b;

    public C9416h4(C9440i4 c9440i4, Iterable<C9459j4> iterable) {
        this.f36342a = (C9440i4) C9613q.m31802c(c9440i4, "SentryEnvelopeHeader is required.");
        this.f36343b = (Iterable) C9613q.m31802c(iterable, "SentryEnvelope items are required.");
    }

    /* renamed from: a */
    public static C9416h4 m30830a(InterfaceC9340c2 interfaceC9340c2, C9389d5 c9389d5, C9523o c9523o) throws IOException {
        C9613q.m31802c(interfaceC9340c2, "Serializer is required.");
        C9613q.m31802c(c9389d5, "session is required.");
        return new C9416h4(null, c9523o, C9459j4.m30892f(interfaceC9340c2, c9389d5));
    }

    /* renamed from: b */
    public C9440i4 m30831b() {
        return this.f36342a;
    }

    /* renamed from: c */
    public Iterable<C9459j4> m30832c() {
        return this.f36343b;
    }

    public C9416h4(C9525q c9525q, C9523o c9523o, C9459j4 c9459j4) {
        C9613q.m31802c(c9459j4, "SentryEnvelopeItem is required.");
        this.f36342a = new C9440i4(c9525q, c9523o);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c9459j4);
        this.f36343b = arrayList;
    }
}
