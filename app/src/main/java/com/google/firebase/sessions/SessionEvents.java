package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.C8372j;
import com.google.firebase.encoders.InterfaceC8292a;
import com.google.firebase.encoders.json.C8303d;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9768m;
import okhttp3.HttpUrl;

/* compiled from: SessionEvents.kt */
@Metadata(m32266d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012H\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001a"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionEvents;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "SESSION_EVENT_ENCODER", "Lcom/google/firebase/encoders/DataEncoder;", "getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/encoders/DataEncoder;", "buildSession", "Lcom/google/firebase/sessions/SessionEvent;", "firebaseApp", "Lcom/google/firebase/FirebaseApp;", "sessionDetails", "Lcom/google/firebase/sessions/SessionDetails;", "sessionsSettings", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "subscribers", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "firebaseInstallationId", HttpUrl.FRAGMENT_ENCODE_SET, "getApplicationInfo", "Lcom/google/firebase/sessions/ApplicationInfo;", "toDataCollectionState", "Lcom/google/firebase/sessions/DataCollectionState;", "subscriber", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.a0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SessionEvents {

    /* renamed from: a */
    public static final SessionEvents f32124a = new SessionEvents();

    /* renamed from: b */
    private static final InterfaceC8292a f32125b;

    static {
        InterfaceC8292a m26100f = new C8303d().m26101g(C8487k.f32203a).m26102h(true).m26100f();
        C9768m.m32345e(m26100f, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f32125b = m26100f;
    }

    private SessionEvents() {
    }

    /* renamed from: d */
    private final DataCollectionState m26723d(SessionSubscriber sessionSubscriber) {
        return sessionSubscriber == null ? DataCollectionState.COLLECTION_SDK_NOT_INSTALLED : sessionSubscriber.mo25364a() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
    }

    /* renamed from: a */
    public final SessionEvent m26724a(C8372j c8372j, SessionDetails sessionDetails, SessionsSettings sessionsSettings, Map<SessionSubscriber.a, ? extends SessionSubscriber> map, String str) {
        C9768m.m32346f(c8372j, "firebaseApp");
        C9768m.m32346f(sessionDetails, "sessionDetails");
        C9768m.m32346f(sessionsSettings, "sessionsSettings");
        C9768m.m32346f(map, "subscribers");
        C9768m.m32346f(str, "firebaseInstallationId");
        return new SessionEvent(EventType.SESSION_START, new SessionInfo(sessionDetails.getSessionId(), sessionDetails.getFirstSessionId(), sessionDetails.getSessionIndex(), sessionDetails.getSessionStartTimestampUs(), new DataCollectionStatus(m26723d(map.get(SessionSubscriber.a.PERFORMANCE)), m26723d(map.get(SessionSubscriber.a.CRASHLYTICS)), sessionsSettings.m26821b()), str), m26725b(c8372j));
    }

    /* renamed from: b */
    public final ApplicationInfo m26725b(C8372j c8372j) {
        C9768m.m32346f(c8372j, "firebaseApp");
        Context m26404i = c8372j.m26404i();
        C9768m.m32345e(m26404i, "firebaseApp.applicationContext");
        String packageName = m26404i.getPackageName();
        PackageInfo packageInfo = m26404i.getPackageManager().getPackageInfo(packageName, 0);
        String valueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String m26424c = c8372j.m26406l().m26424c();
        C9768m.m32345e(m26424c, "firebaseApp.options.applicationId");
        String str = Build.MODEL;
        C9768m.m32345e(str, "MODEL");
        String str2 = Build.VERSION.RELEASE;
        C9768m.m32345e(str2, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        C9768m.m32345e(packageName, "packageName");
        String str3 = packageInfo.versionName;
        String str4 = str3 == null ? valueOf : str3;
        String str5 = Build.MANUFACTURER;
        C9768m.m32345e(str5, "MANUFACTURER");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.f32355a;
        Context m26404i2 = c8372j.m26404i();
        C9768m.m32345e(m26404i2, "firebaseApp.applicationContext");
        ProcessDetails m26860d = processDetailsProvider.m26860d(m26404i2);
        Context m26404i3 = c8372j.m26404i();
        C9768m.m32345e(m26404i3, "firebaseApp.applicationContext");
        return new ApplicationInfo(m26424c, str, "1.2.1", str2, logEnvironment, new AndroidApplicationInfo(packageName, str4, valueOf, str5, m26860d, processDetailsProvider.m26859c(m26404i3)));
    }

    /* renamed from: c */
    public final InterfaceC8292a m26726c() {
        return f32125b;
    }
}
