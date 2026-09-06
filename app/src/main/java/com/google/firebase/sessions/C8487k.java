package com.google.firebase.sessions;

import cm.aptoide.p092pt.database.room.RoomInstalled;
import com.google.firebase.encoders.C8293b;
import com.google.firebase.encoders.InterfaceC8294c;
import com.google.firebase.encoders.InterfaceC8295d;
import com.google.firebase.encoders.p192g.InterfaceC8298a;
import com.google.firebase.encoders.p192g.InterfaceC8299b;
import java.io.IOException;

/* compiled from: AutoSessionEventEncoder.java */
/* renamed from: com.google.firebase.sessions.k */
/* loaded from: classes2.dex */
public final class C8487k implements InterfaceC8298a {

    /* renamed from: a */
    public static final InterfaceC8298a f32203a = new C8487k();

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: com.google.firebase.sessions.k$a */
    private static final class a implements InterfaceC8294c<AndroidApplicationInfo> {

        /* renamed from: a */
        static final a f32204a = new a();

        /* renamed from: b */
        private static final C8293b f32205b = C8293b.m26077d("packageName");

        /* renamed from: c */
        private static final C8293b f32206c = C8293b.m26077d(RoomInstalled.VERSION_NAME);

        /* renamed from: d */
        private static final C8293b f32207d = C8293b.m26077d("appBuildVersion");

        /* renamed from: e */
        private static final C8293b f32208e = C8293b.m26077d("deviceManufacturer");

        /* renamed from: f */
        private static final C8293b f32209f = C8293b.m26077d("currentProcessDetails");

        /* renamed from: g */
        private static final C8293b f32210g = C8293b.m26077d("appProcessDetails");

        private a() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(AndroidApplicationInfo androidApplicationInfo, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f32205b, androidApplicationInfo.getPackageName());
            interfaceC8295d.mo26088i(f32206c, androidApplicationInfo.getVersionName());
            interfaceC8295d.mo26088i(f32207d, androidApplicationInfo.getAppBuildVersion());
            interfaceC8295d.mo26088i(f32208e, androidApplicationInfo.getDeviceManufacturer());
            interfaceC8295d.mo26088i(f32209f, androidApplicationInfo.getCurrentProcessDetails());
            interfaceC8295d.mo26088i(f32210g, androidApplicationInfo.m26769b());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: com.google.firebase.sessions.k$b */
    private static final class b implements InterfaceC8294c<ApplicationInfo> {

        /* renamed from: a */
        static final b f32211a = new b();

        /* renamed from: b */
        private static final C8293b f32212b = C8293b.m26077d("appId");

        /* renamed from: c */
        private static final C8293b f32213c = C8293b.m26077d("deviceModel");

        /* renamed from: d */
        private static final C8293b f32214d = C8293b.m26077d("sessionSdkVersion");

        /* renamed from: e */
        private static final C8293b f32215e = C8293b.m26077d("osVersion");

        /* renamed from: f */
        private static final C8293b f32216f = C8293b.m26077d("logEnvironment");

        /* renamed from: g */
        private static final C8293b f32217g = C8293b.m26077d("androidAppInfo");

        private b() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(ApplicationInfo applicationInfo, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f32212b, applicationInfo.getAppId());
            interfaceC8295d.mo26088i(f32213c, applicationInfo.getDeviceModel());
            interfaceC8295d.mo26088i(f32214d, applicationInfo.getSessionSdkVersion());
            interfaceC8295d.mo26088i(f32215e, applicationInfo.getOsVersion());
            interfaceC8295d.mo26088i(f32216f, applicationInfo.getLogEnvironment());
            interfaceC8295d.mo26088i(f32217g, applicationInfo.getAndroidAppInfo());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: com.google.firebase.sessions.k$c */
    private static final class c implements InterfaceC8294c<DataCollectionStatus> {

        /* renamed from: a */
        static final c f32218a = new c();

        /* renamed from: b */
        private static final C8293b f32219b = C8293b.m26077d("performance");

        /* renamed from: c */
        private static final C8293b f32220c = C8293b.m26077d("crashlytics");

        /* renamed from: d */
        private static final C8293b f32221d = C8293b.m26077d("sessionSamplingRate");

        private c() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(DataCollectionStatus dataCollectionStatus, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f32219b, dataCollectionStatus.getPerformance());
            interfaceC8295d.mo26088i(f32220c, dataCollectionStatus.getCrashlytics());
            interfaceC8295d.mo26085d(f32221d, dataCollectionStatus.getSessionSamplingRate());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: com.google.firebase.sessions.k$d */
    private static final class d implements InterfaceC8294c<ProcessDetails> {

        /* renamed from: a */
        static final d f32222a = new d();

        /* renamed from: b */
        private static final C8293b f32223b = C8293b.m26077d("processName");

        /* renamed from: c */
        private static final C8293b f32224c = C8293b.m26077d("pid");

        /* renamed from: d */
        private static final C8293b f32225d = C8293b.m26077d("importance");

        /* renamed from: e */
        private static final C8293b f32226e = C8293b.m26077d("defaultProcess");

        private d() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(ProcessDetails processDetails, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f32223b, processDetails.getProcessName());
            interfaceC8295d.mo26084c(f32224c, processDetails.getPid());
            interfaceC8295d.mo26084c(f32225d, processDetails.getImportance());
            interfaceC8295d.mo26082a(f32226e, processDetails.getIsDefaultProcess());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: com.google.firebase.sessions.k$e */
    private static final class e implements InterfaceC8294c<SessionEvent> {

        /* renamed from: a */
        static final e f32227a = new e();

        /* renamed from: b */
        private static final C8293b f32228b = C8293b.m26077d("eventType");

        /* renamed from: c */
        private static final C8293b f32229c = C8293b.m26077d("sessionData");

        /* renamed from: d */
        private static final C8293b f32230d = C8293b.m26077d("applicationInfo");

        private e() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(SessionEvent sessionEvent, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f32228b, sessionEvent.getEventType());
            interfaceC8295d.mo26088i(f32229c, sessionEvent.getSessionData());
            interfaceC8295d.mo26088i(f32230d, sessionEvent.getApplicationInfo());
        }
    }

    /* compiled from: AutoSessionEventEncoder.java */
    /* renamed from: com.google.firebase.sessions.k$f */
    private static final class f implements InterfaceC8294c<SessionInfo> {

        /* renamed from: a */
        static final f f32231a = new f();

        /* renamed from: b */
        private static final C8293b f32232b = C8293b.m26077d("sessionId");

        /* renamed from: c */
        private static final C8293b f32233c = C8293b.m26077d("firstSessionId");

        /* renamed from: d */
        private static final C8293b f32234d = C8293b.m26077d("sessionIndex");

        /* renamed from: e */
        private static final C8293b f32235e = C8293b.m26077d("eventTimestampUs");

        /* renamed from: f */
        private static final C8293b f32236f = C8293b.m26077d("dataCollectionStatus");

        /* renamed from: g */
        private static final C8293b f32237g = C8293b.m26077d("firebaseInstallationId");

        private f() {
        }

        @Override // com.google.firebase.encoders.InterfaceC8294c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13444a(SessionInfo sessionInfo, InterfaceC8295d interfaceC8295d) throws IOException {
            interfaceC8295d.mo26088i(f32232b, sessionInfo.getSessionId());
            interfaceC8295d.mo26088i(f32233c, sessionInfo.getFirstSessionId());
            interfaceC8295d.mo26084c(f32234d, sessionInfo.getSessionIndex());
            interfaceC8295d.mo26083b(f32235e, sessionInfo.getEventTimestampUs());
            interfaceC8295d.mo26088i(f32236f, sessionInfo.getDataCollectionStatus());
            interfaceC8295d.mo26088i(f32237g, sessionInfo.getFirebaseInstallationId());
        }
    }

    private C8487k() {
    }

    @Override // com.google.firebase.encoders.p192g.InterfaceC8298a
    /* renamed from: a */
    public void mo13443a(InterfaceC8299b<?> interfaceC8299b) {
        interfaceC8299b.mo26092a(SessionEvent.class, e.f32227a);
        interfaceC8299b.mo26092a(SessionInfo.class, f.f32231a);
        interfaceC8299b.mo26092a(DataCollectionStatus.class, c.f32218a);
        interfaceC8299b.mo26092a(ApplicationInfo.class, b.f32211a);
        interfaceC8299b.mo26092a(AndroidApplicationInfo.class, a.f32204a);
        interfaceC8299b.mo26092a(ProcessDetails.class, d.f32222a);
    }
}
