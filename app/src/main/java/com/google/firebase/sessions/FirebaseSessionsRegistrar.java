package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C8372j;
import com.google.firebase.components.C8078b0;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;
import com.google.firebase.installations.InterfaceC8352i;
import com.google.firebase.p200o.p201a.InterfaceC8441a;
import com.google.firebase.p200o.p201a.InterfaceC8442b;
import com.google.firebase.p205s.InterfaceC8463b;
import com.google.firebase.p209u.C8522h;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10784u;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p257a.InterfaceC8757g;

/* compiled from: FirebaseSessionsRegistrar.kt */
@Keep
@Metadata(m32266d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¨\u0006\t"}, m32267d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/firebase/components/Component;", HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    private static final String LIBRARY_NAME = "fire-sessions";
    private static final C8464a Companion = new C8464a(null);

    @Deprecated
    private static final C8078b0<C8372j> firebaseApp = C8078b0.m24972b(C8372j.class);

    @Deprecated
    private static final C8078b0<InterfaceC8352i> firebaseInstallationsApi = C8078b0.m24972b(InterfaceC8352i.class);

    @Deprecated
    private static final C8078b0<CoroutineDispatcher> backgroundDispatcher = C8078b0.m24971a(InterfaceC8441a.class, CoroutineDispatcher.class);

    @Deprecated
    private static final C8078b0<CoroutineDispatcher> blockingDispatcher = C8078b0.m24971a(InterfaceC8442b.class, CoroutineDispatcher.class);

    @Deprecated
    private static final C8078b0<InterfaceC8757g> transportFactory = C8078b0.m24972b(InterfaceC8757g.class);

    @Deprecated
    private static final C8078b0<SessionsSettings> sessionsSettings = C8078b0.m24972b(SessionsSettings.class);

    /* compiled from: FirebaseSessionsRegistrar.kt */
    @Metadata(m32266d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\t\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u0007\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\n\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000b0\u000b \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\f\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\r0\r \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\r0\r\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u000e\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000f0\u000f \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u000f0\u000f\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R2\u0010\u0010\u001a&\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u0011 \b*\u0012\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00110\u0011\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m32267d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "LIBRARY_NAME", HttpUrl.FRAGMENT_ENCODE_SET, "backgroundDispatcher", "Lcom/google/firebase/components/Qualified;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "blockingDispatcher", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "firebaseInstallationsApi", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "transportFactory", "Lcom/google/android/datatransport/TransportFactory;", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.FirebaseSessionsRegistrar$a */
    private static final class C8464a {
        private C8464a() {
        }

        public /* synthetic */ C8464a(C9756g c9756g) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final FirebaseSessions m41042getComponents$lambda0(InterfaceC8093p interfaceC8093p) {
        Object mo24978f = interfaceC8093p.mo24978f(firebaseApp);
        C9768m.m32345e(mo24978f, "container[firebaseApp]");
        Object mo24978f2 = interfaceC8093p.mo24978f(sessionsSettings);
        C9768m.m32345e(mo24978f2, "container[sessionsSettings]");
        Object mo24978f3 = interfaceC8093p.mo24978f(backgroundDispatcher);
        C9768m.m32345e(mo24978f3, "container[backgroundDispatcher]");
        return new FirebaseSessions((C8372j) mo24978f, (SessionsSettings) mo24978f2, (CoroutineContext) mo24978f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-1, reason: not valid java name */
    public static final SessionGenerator m41043getComponents$lambda1(InterfaceC8093p interfaceC8093p) {
        return new SessionGenerator(WallClock.f32238a, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-2, reason: not valid java name */
    public static final SessionFirelogPublisher m41044getComponents$lambda2(InterfaceC8093p interfaceC8093p) {
        Object mo24978f = interfaceC8093p.mo24978f(firebaseApp);
        C9768m.m32345e(mo24978f, "container[firebaseApp]");
        C8372j c8372j = (C8372j) mo24978f;
        Object mo24978f2 = interfaceC8093p.mo24978f(firebaseInstallationsApi);
        C9768m.m32345e(mo24978f2, "container[firebaseInstallationsApi]");
        InterfaceC8352i interfaceC8352i = (InterfaceC8352i) mo24978f2;
        Object mo24978f3 = interfaceC8093p.mo24978f(sessionsSettings);
        C9768m.m32345e(mo24978f3, "container[sessionsSettings]");
        SessionsSettings sessionsSettings2 = (SessionsSettings) mo24978f3;
        InterfaceC8463b mo24974b = interfaceC8093p.mo24974b(transportFactory);
        C9768m.m32345e(mo24974b, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(mo24974b);
        Object mo24978f4 = interfaceC8093p.mo24978f(backgroundDispatcher);
        C9768m.m32345e(mo24978f4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl(c8372j, interfaceC8352i, sessionsSettings2, eventGDTLogger, (CoroutineContext) mo24978f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-3, reason: not valid java name */
    public static final SessionsSettings m41045getComponents$lambda3(InterfaceC8093p interfaceC8093p) {
        Object mo24978f = interfaceC8093p.mo24978f(firebaseApp);
        C9768m.m32345e(mo24978f, "container[firebaseApp]");
        Object mo24978f2 = interfaceC8093p.mo24978f(blockingDispatcher);
        C9768m.m32345e(mo24978f2, "container[blockingDispatcher]");
        Object mo24978f3 = interfaceC8093p.mo24978f(backgroundDispatcher);
        C9768m.m32345e(mo24978f3, "container[backgroundDispatcher]");
        Object mo24978f4 = interfaceC8093p.mo24978f(firebaseInstallationsApi);
        C9768m.m32345e(mo24978f4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((C8372j) mo24978f, (CoroutineContext) mo24978f2, (CoroutineContext) mo24978f3, (InterfaceC8352i) mo24978f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-4, reason: not valid java name */
    public static final SessionDatastore m41046getComponents$lambda4(InterfaceC8093p interfaceC8093p) {
        Context m26404i = ((C8372j) interfaceC8093p.mo24978f(firebaseApp)).m26404i();
        C9768m.m32345e(m26404i, "container[firebaseApp].applicationContext");
        Object mo24978f = interfaceC8093p.mo24978f(backgroundDispatcher);
        C9768m.m32345e(mo24978f, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(m26404i, (CoroutineContext) mo24978f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents$lambda-5, reason: not valid java name */
    public static final SessionLifecycleServiceBinder m41047getComponents$lambda5(InterfaceC8093p interfaceC8093p) {
        Object mo24978f = interfaceC8093p.mo24978f(firebaseApp);
        C9768m.m32345e(mo24978f, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((C8372j) mo24978f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8091n<? extends Object>> getComponents() {
        List<C8091n<? extends Object>> m38891m;
        C8091n.b m25011h = C8091n.m24986c(FirebaseSessions.class).m25011h(LIBRARY_NAME);
        C8078b0<C8372j> c8078b0 = firebaseApp;
        C8091n.b m25006b = m25011h.m25006b(C8099v.m25059j(c8078b0));
        C8078b0<SessionsSettings> c8078b02 = sessionsSettings;
        C8091n.b m25006b2 = m25006b.m25006b(C8099v.m25059j(c8078b02));
        C8078b0<CoroutineDispatcher> c8078b03 = backgroundDispatcher;
        C8091n.b m25006b3 = C8091n.m24986c(SessionFirelogPublisher.class).m25011h("session-publisher").m25006b(C8099v.m25059j(c8078b0));
        C8078b0<InterfaceC8352i> c8078b04 = firebaseInstallationsApi;
        m38891m = C10784u.m38891m(m25006b2.m25006b(C8099v.m25059j(c8078b03)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.sessions.g
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                FirebaseSessions m41042getComponents$lambda0;
                m41042getComponents$lambda0 = FirebaseSessionsRegistrar.m41042getComponents$lambda0(interfaceC8093p);
                return m41042getComponents$lambda0;
            }
        }).m25009e().m25008d(), C8091n.m24986c(SessionGenerator.class).m25011h("session-generator").m25010f(new InterfaceC8095r() { // from class: com.google.firebase.sessions.d
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                SessionGenerator m41043getComponents$lambda1;
                m41043getComponents$lambda1 = FirebaseSessionsRegistrar.m41043getComponents$lambda1(interfaceC8093p);
                return m41043getComponents$lambda1;
            }
        }).m25008d(), m25006b3.m25006b(C8099v.m25059j(c8078b04)).m25006b(C8099v.m25059j(c8078b02)).m25006b(C8099v.m25061l(transportFactory)).m25006b(C8099v.m25059j(c8078b03)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.sessions.f
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                SessionFirelogPublisher m41044getComponents$lambda2;
                m41044getComponents$lambda2 = FirebaseSessionsRegistrar.m41044getComponents$lambda2(interfaceC8093p);
                return m41044getComponents$lambda2;
            }
        }).m25008d(), C8091n.m24986c(SessionsSettings.class).m25011h("sessions-settings").m25006b(C8099v.m25059j(c8078b0)).m25006b(C8099v.m25059j(blockingDispatcher)).m25006b(C8099v.m25059j(c8078b03)).m25006b(C8099v.m25059j(c8078b04)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.sessions.h
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                SessionsSettings m41045getComponents$lambda3;
                m41045getComponents$lambda3 = FirebaseSessionsRegistrar.m41045getComponents$lambda3(interfaceC8093p);
                return m41045getComponents$lambda3;
            }
        }).m25008d(), C8091n.m24986c(SessionDatastore.class).m25011h("sessions-datastore").m25006b(C8099v.m25059j(c8078b0)).m25006b(C8099v.m25059j(c8078b03)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.sessions.e
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                SessionDatastore m41046getComponents$lambda4;
                m41046getComponents$lambda4 = FirebaseSessionsRegistrar.m41046getComponents$lambda4(interfaceC8093p);
                return m41046getComponents$lambda4;
            }
        }).m25008d(), C8091n.m24986c(SessionLifecycleServiceBinder.class).m25011h("sessions-service-binder").m25006b(C8099v.m25059j(c8078b0)).m25010f(new InterfaceC8095r() { // from class: com.google.firebase.sessions.c
            @Override // com.google.firebase.components.InterfaceC8095r
            /* renamed from: a */
            public final Object mo24937a(InterfaceC8093p interfaceC8093p) {
                SessionLifecycleServiceBinder m41047getComponents$lambda5;
                m41047getComponents$lambda5 = FirebaseSessionsRegistrar.m41047getComponents$lambda5(interfaceC8093p);
                return m41047getComponents$lambda5;
            }
        }).m25008d(), C8522h.m26903a(LIBRARY_NAME, "1.2.1"));
        return m38891m;
    }
}
