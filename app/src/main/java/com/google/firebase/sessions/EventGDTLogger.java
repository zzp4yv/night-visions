package com.google.firebase.sessions;

import android.util.Log;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import com.google.firebase.p205s.InterfaceC8463b;
import kotlin.Metadata;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.AbstractC8753c;
import p241e.p254e.p256b.p257a.C8752b;
import p241e.p254e.p256b.p257a.InterfaceC8755e;
import p241e.p254e.p256b.p257a.InterfaceC8757g;

/* compiled from: EventGDTLogger.kt */
@Metadata(m32266d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m32267d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "transportFactoryProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "(Lcom/google/firebase/inject/Provider;)V", "encode", HttpUrl.FRAGMENT_ENCODE_SET, "value", "Lcom/google/firebase/sessions/SessionEvent;", "log", HttpUrl.FRAGMENT_ENCODE_SET, "sessionEvent", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.n, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class EventGDTLogger implements EventGDTLoggerInterface {

    /* renamed from: a */
    public static final a f32332a = new a(null);

    /* renamed from: b */
    private final InterfaceC8463b<InterfaceC8757g> f32333b;

    /* compiled from: EventGDTLogger.kt */
    @Metadata(m32266d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m32267d2 = {"Lcom/google/firebase/sessions/EventGDTLogger$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "AQS_LOG_SOURCE", HttpUrl.FRAGMENT_ENCODE_SET, "TAG", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.n$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    public EventGDTLogger(InterfaceC8463b<InterfaceC8757g> interfaceC8463b) {
        C9768m.m32346f(interfaceC8463b, "transportFactoryProvider");
        this.f32333b = interfaceC8463b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final byte[] m26845b(SessionEvent sessionEvent) {
        String mo26075b = SessionEvents.f32124a.m26726c().mo26075b(sessionEvent);
        C9768m.m32345e(mo26075b, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: " + mo26075b);
        byte[] bytes = mo26075b.getBytes(Charsets.f40651b);
        C9768m.m32345e(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    /* renamed from: a */
    public void mo26847a(SessionEvent sessionEvent) {
        C9768m.m32346f(sessionEvent, "sessionEvent");
        this.f32333b.get().mo26454a("FIREBASE_APPQUALITY_SESSION", SessionEvent.class, C8752b.m27945b(BodyInterceptorV3.RESPONSE_MODE_JSON), new InterfaceC8755e() { // from class: com.google.firebase.sessions.a
            @Override // p241e.p254e.p256b.p257a.InterfaceC8755e
            /* renamed from: a */
            public final Object mo26009a(Object obj) {
                byte[] m26845b;
                m26845b = EventGDTLogger.this.m26845b((SessionEvent) obj);
                return m26845b;
            }
        }).mo26452a(AbstractC8753c.m27947d(sessionEvent));
    }
}
