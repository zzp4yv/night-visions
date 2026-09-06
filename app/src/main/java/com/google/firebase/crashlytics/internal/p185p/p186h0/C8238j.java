package com.google.firebase.crashlytics.internal.p185p.p186h0;

import android.util.Base64;
import android.util.JsonReader;
import cm.aptoide.p092pt.database.room.RoomNotification;
import com.google.firebase.crashlytics.internal.p185p.AbstractC8225f0;
import com.google.firebase.crashlytics.internal.p185p.C8214a;
import com.google.firebase.encoders.InterfaceC8292a;
import com.google.firebase.encoders.json.C8303d;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CrashlyticsReportJsonTransform.java */
/* renamed from: com.google.firebase.crashlytics.h.p.h0.j */
/* loaded from: classes2.dex */
public class C8238j {

    /* renamed from: a */
    private static final InterfaceC8292a f31385a = new C8303d().m26101g(C8214a.f31124a).m26102h(true).m26100f();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CrashlyticsReportJsonTransform.java */
    /* renamed from: com.google.firebase.crashlytics.h.p.h0.j$a */
    interface a<T> {
        /* renamed from: a */
        T mo25908a(JsonReader jsonReader) throws IOException;
    }

    /* renamed from: A */
    private static AbstractC8225f0.e.d.f m25909A(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.f.a m25889a = AbstractC8225f0.e.d.f.m25889a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("assignments")) {
                m25889a.mo25892b(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.b
                    @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j.a
                    /* renamed from: a */
                    public final Object mo25908a(JsonReader jsonReader2) {
                        AbstractC8225f0.e.d.AbstractC11466e m25943z;
                        m25943z = C8238j.m25943z(jsonReader2);
                        return m25943z;
                    }
                }));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m25889a.mo25891a();
    }

    /* renamed from: B */
    private static AbstractC8225f0.e.d.a.b.AbstractC11458d m25910B(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.a.b.AbstractC11458d.AbstractC11459a m25810a = AbstractC8225f0.e.d.a.b.AbstractC11458d.m25810a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "address":
                    m25810a.mo25815b(jsonReader.nextLong());
                    break;
                case "code":
                    m25810a.mo25816c(jsonReader.nextString());
                    break;
                case "name":
                    m25810a.mo25817d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25810a.mo25814a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static AbstractC8225f0.e.d.a.b.AbstractC11460e m25911C(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.a.b.AbstractC11460e.AbstractC11461a m25818a = AbstractC8225f0.e.d.a.b.AbstractC11460e.m25818a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "frames":
                    m25818a.mo25823b(m25931n(jsonReader, C8232d.f31379a));
                    break;
                case "name":
                    m25818a.mo25825d(jsonReader.nextString());
                    break;
                case "importance":
                    m25818a.mo25824c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25818a.mo25822a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static AbstractC8225f0.d.b m25912D(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.d.b.a m25675a = AbstractC8225f0.d.b.m25675a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                m25675a.mo25680c(jsonReader.nextString());
            } else if (nextName.equals("contents")) {
                m25675a.mo25679b(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m25675a.mo25678a();
    }

    /* renamed from: E */
    private static AbstractC8225f0.d m25913E(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.d.a m25674a = AbstractC8225f0.d.m25674a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                m25674a.mo25661b(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.g
                    @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j.a
                    /* renamed from: a */
                    public final Object mo25908a(JsonReader jsonReader2) {
                        AbstractC8225f0.d.b m25912D;
                        m25912D = C8238j.m25912D(jsonReader2);
                        return m25912D;
                    }
                }));
            } else if (nextName.equals("orgId")) {
                m25674a.mo25662c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m25674a.mo25660a();
    }

    /* renamed from: F */
    private static AbstractC8225f0.e.AbstractC11467e m25914F(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.AbstractC11467e.a m25893a = AbstractC8225f0.e.AbstractC11467e.m25893a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "buildVersion":
                    m25893a.mo25899b(jsonReader.nextString());
                    break;
                case "jailbroken":
                    m25893a.mo25900c(jsonReader.nextBoolean());
                    break;
                case "version":
                    m25893a.mo25902e(jsonReader.nextString());
                    break;
                case "platform":
                    m25893a.mo25901d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25893a.mo25898a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public static AbstractC8225f0.e.d.a.c m25915G(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.a.c.AbstractC11464a m25838a = AbstractC8225f0.e.d.a.c.m25838a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "pid":
                    m25838a.mo25846d(jsonReader.nextInt());
                    break;
                case "processName":
                    m25838a.mo25847e(jsonReader.nextString());
                    break;
                case "defaultProcess":
                    m25838a.mo25844b(jsonReader.nextBoolean());
                    break;
                case "importance":
                    m25838a.mo25845c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25838a.mo25843a();
    }

    /* renamed from: H */
    private static AbstractC8225f0 m25916H(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.b m25664b = AbstractC8225f0.m25664b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "ndkPayload":
                    m25664b.mo25602i(m25913E(jsonReader));
                    break;
                case "sdkVersion":
                    m25664b.mo25604k(jsonReader.nextString());
                    break;
                case "appQualitySessionId":
                    m25664b.mo25596c(jsonReader.nextString());
                    break;
                case "appExitInfo":
                    m25664b.mo25595b(m25930m(jsonReader));
                    break;
                case "buildVersion":
                    m25664b.mo25597d(jsonReader.nextString());
                    break;
                case "gmpAppId":
                    m25664b.mo25600g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    m25664b.mo25601h(jsonReader.nextString());
                    break;
                case "firebaseInstallationId":
                    m25664b.mo25599f(jsonReader.nextString());
                    break;
                case "platform":
                    m25664b.mo25603j(jsonReader.nextInt());
                    break;
                case "displayVersion":
                    m25664b.mo25598e(jsonReader.nextString());
                    break;
                case "session":
                    m25664b.mo25605l(m25918J(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25664b.mo25594a();
    }

    /* renamed from: I */
    private static AbstractC8225f0.e.d.AbstractC11466e.b m25917I(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.AbstractC11466e.b.a m25883a = AbstractC8225f0.e.d.AbstractC11466e.b.m25883a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("variantId")) {
                m25883a.mo25888c(jsonReader.nextString());
            } else if (nextName.equals("rolloutId")) {
                m25883a.mo25887b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m25883a.mo25886a();
    }

    /* renamed from: J */
    private static AbstractC8225f0.e m25918J(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.b m25681a = AbstractC8225f0.e.m25681a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "startedAt":
                    m25681a.mo25727m(jsonReader.nextLong());
                    break;
                case "appQualitySessionId":
                    m25681a.mo25717c(jsonReader.nextString());
                    break;
                case "identifier":
                    m25681a.m25725k(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "endedAt":
                    m25681a.mo25720f(Long.valueOf(jsonReader.nextLong()));
                    break;
                case "device":
                    m25681a.mo25719e(m25934q(jsonReader));
                    break;
                case "events":
                    m25681a.mo25721g(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.a
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            AbstractC8225f0.e.d m25935r;
                            m25935r = C8238j.m25935r(jsonReader2);
                            return m25935r;
                        }
                    }));
                    break;
                case "os":
                    m25681a.mo25726l(m25914F(jsonReader));
                    break;
                case "app":
                    m25681a.mo25716b(m25929l(jsonReader));
                    break;
                case "user":
                    m25681a.mo25728n(m25919K(jsonReader));
                    break;
                case "generator":
                    m25681a.mo25722h(jsonReader.nextString());
                    break;
                case "crashed":
                    m25681a.mo25718d(jsonReader.nextBoolean());
                    break;
                case "generatorType":
                    m25681a.mo25723i(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25681a.mo25715a();
    }

    /* renamed from: K */
    private static AbstractC8225f0.e.f m25919K(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.f.a m25903a = AbstractC8225f0.e.f.m25903a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("identifier")) {
                m25903a.mo25581b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m25903a.mo25580a();
    }

    /* renamed from: l */
    private static AbstractC8225f0.e.a m25929l(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.a.AbstractC11452a m25699a = AbstractC8225f0.e.a.m25699a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "identifier":
                    m25699a.mo25711e(jsonReader.nextString());
                    break;
                case "developmentPlatform":
                    m25699a.mo25708b(jsonReader.nextString());
                    break;
                case "developmentPlatformVersion":
                    m25699a.mo25709c(jsonReader.nextString());
                    break;
                case "version":
                    m25699a.mo25713g(jsonReader.nextString());
                    break;
                case "installationUuid":
                    m25699a.mo25712f(jsonReader.nextString());
                    break;
                case "displayVersion":
                    m25699a.mo25710d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25699a.mo25707a();
    }

    /* renamed from: m */
    private static AbstractC8225f0.a m25930m(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.a.b m25671a = AbstractC8225f0.a.m25671a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "buildIdMappingForArch":
                    m25671a.mo25619b(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.c
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            AbstractC8225f0.a.AbstractC11450a m25932o;
                            m25932o = C8238j.m25932o(jsonReader2);
                            return m25932o;
                        }
                    }));
                    break;
                case "pid":
                    m25671a.mo25621d(jsonReader.nextInt());
                    break;
                case "pss":
                    m25671a.mo25623f(jsonReader.nextLong());
                    break;
                case "rss":
                    m25671a.mo25625h(jsonReader.nextLong());
                    break;
                case "timestamp":
                    m25671a.mo25626i(jsonReader.nextLong());
                    break;
                case "processName":
                    m25671a.mo25622e(jsonReader.nextString());
                    break;
                case "reasonCode":
                    m25671a.mo25624g(jsonReader.nextInt());
                    break;
                case "traceFile":
                    m25671a.mo25627j(jsonReader.nextString());
                    break;
                case "importance":
                    m25671a.mo25620c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25671a.mo25618a();
    }

    /* renamed from: n */
    private static <T> List<T> m25931n(JsonReader jsonReader, a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo25908a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static AbstractC8225f0.a.AbstractC11450a m25932o(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.a.AbstractC11450a.AbstractC11451a m25672a = AbstractC8225f0.a.AbstractC11450a.m25672a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "libraryName":
                    m25672a.mo25640d(jsonReader.nextString());
                    break;
                case "arch":
                    m25672a.mo25638b(jsonReader.nextString());
                    break;
                case "buildId":
                    m25672a.mo25639c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25672a.mo25637a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static AbstractC8225f0.c m25933p(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.c.a m25673a = AbstractC8225f0.c.m25673a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals(RoomNotification.KEY)) {
                m25673a.mo25653b(jsonReader.nextString());
            } else if (nextName.equals("value")) {
                m25673a.mo25654c(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m25673a.mo25652a();
    }

    /* renamed from: q */
    private static AbstractC8225f0.e.c m25934q(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.c.a m25729a = AbstractC8225f0.e.c.m25729a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "simulator":
                    m25729a.mo25747i(jsonReader.nextBoolean());
                    break;
                case "manufacturer":
                    m25729a.mo25743e(jsonReader.nextString());
                    break;
                case "ram":
                    m25729a.mo25746h(jsonReader.nextLong());
                    break;
                case "arch":
                    m25729a.mo25740b(jsonReader.nextInt());
                    break;
                case "diskSpace":
                    m25729a.mo25742d(jsonReader.nextLong());
                    break;
                case "cores":
                    m25729a.mo25741c(jsonReader.nextInt());
                    break;
                case "model":
                    m25729a.mo25744f(jsonReader.nextString());
                    break;
                case "state":
                    m25729a.mo25748j(jsonReader.nextInt());
                    break;
                case "modelClass":
                    m25729a.mo25745g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25729a.mo25739a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static AbstractC8225f0.e.d m25935r(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.b m25749a = AbstractC8225f0.e.d.m25749a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "device":
                    m25749a.mo25850c(m25938u(jsonReader));
                    break;
                case "rollouts":
                    m25749a.mo25852e(m25909A(jsonReader));
                    break;
                case "app":
                    m25749a.mo25849b(m25936s(jsonReader));
                    break;
                case "log":
                    m25749a.mo25851d(m25942y(jsonReader));
                    break;
                case "type":
                    m25749a.mo25854g(jsonReader.nextString());
                    break;
                case "timestamp":
                    m25749a.mo25853f(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25749a.mo25848a();
    }

    /* renamed from: s */
    private static AbstractC8225f0.e.d.a m25936s(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.a.AbstractC11453a m25757a = AbstractC8225f0.e.d.a.m25757a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "appProcessDetails":
                    m25757a.mo25767b(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.e
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            AbstractC8225f0.e.d.a.c m25915G;
                            m25915G = C8238j.m25915G(jsonReader2);
                            return m25915G;
                        }
                    }));
                    break;
                case "background":
                    m25757a.mo25768c(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case "execution":
                    m25757a.mo25771f(m25939v(jsonReader));
                    break;
                case "internalKeys":
                    m25757a.mo25772g(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.i
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            AbstractC8225f0.c m25933p;
                            m25933p = C8238j.m25933p(jsonReader2);
                            return m25933p;
                        }
                    }));
                    break;
                case "customAttributes":
                    m25757a.mo25770e(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.i
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            AbstractC8225f0.c m25933p;
                            m25933p = C8238j.m25933p(jsonReader2);
                            return m25933p;
                        }
                    }));
                    break;
                case "uiOrientation":
                    m25757a.mo25773h(jsonReader.nextInt());
                    break;
                case "currentProcessDetails":
                    m25757a.mo25769d(m25915G(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25757a.mo25766a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static AbstractC8225f0.e.d.a.b.AbstractC11454a m25937t(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.a.b.AbstractC11454a.AbstractC11455a m25780a = AbstractC8225f0.e.d.a.b.AbstractC11454a.m25780a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "name":
                    m25780a.mo25788c(jsonReader.nextString());
                    break;
                case "size":
                    m25780a.mo25789d(jsonReader.nextLong());
                    break;
                case "uuid":
                    m25780a.m25791f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case "baseAddress":
                    m25780a.mo25787b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25780a.mo25786a();
    }

    /* renamed from: u */
    private static AbstractC8225f0.e.d.c m25938u(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.c.a m25855a = AbstractC8225f0.e.d.c.m25855a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "batteryLevel":
                    m25855a.mo25863b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case "batteryVelocity":
                    m25855a.mo25864c(jsonReader.nextInt());
                    break;
                case "orientation":
                    m25855a.mo25866e(jsonReader.nextInt());
                    break;
                case "diskUsed":
                    m25855a.mo25865d(jsonReader.nextLong());
                    break;
                case "ramUsed":
                    m25855a.mo25868g(jsonReader.nextLong());
                    break;
                case "proximityOn":
                    m25855a.mo25867f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25855a.mo25862a();
    }

    /* renamed from: v */
    private static AbstractC8225f0.e.d.a.b m25939v(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.a.b.AbstractC11456b m25774a = AbstractC8225f0.e.d.a.b.m25774a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "appExitInfo":
                    m25774a.mo25793b(m25930m(jsonReader));
                    break;
                case "threads":
                    m25774a.mo25797f(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.f
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            AbstractC8225f0.e.d.a.b.AbstractC11460e m25911C;
                            m25911C = C8238j.m25911C(jsonReader2);
                            return m25911C;
                        }
                    }));
                    break;
                case "signal":
                    m25774a.mo25796e(m25910B(jsonReader));
                    break;
                case "binaries":
                    m25774a.mo25794c(m25931n(jsonReader, new a() { // from class: com.google.firebase.crashlytics.h.p.h0.h
                        @Override // com.google.firebase.crashlytics.internal.p185p.p186h0.C8238j.a
                        /* renamed from: a */
                        public final Object mo25908a(JsonReader jsonReader2) {
                            AbstractC8225f0.e.d.a.b.AbstractC11454a m25937t;
                            m25937t = C8238j.m25937t(jsonReader2);
                            return m25937t;
                        }
                    }));
                    break;
                case "exception":
                    m25774a.mo25795d(m25940w(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25774a.mo25792a();
    }

    /* renamed from: w */
    private static AbstractC8225f0.e.d.a.b.c m25940w(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.a.b.c.AbstractC11457a m25798a = AbstractC8225f0.e.d.a.b.c.m25798a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "frames":
                    m25798a.mo25806c(m25931n(jsonReader, C8232d.f31379a));
                    break;
                case "reason":
                    m25798a.mo25808e(jsonReader.nextString());
                    break;
                case "type":
                    m25798a.mo25809f(jsonReader.nextString());
                    break;
                case "causedBy":
                    m25798a.mo25805b(m25940w(jsonReader));
                    break;
                case "overflowCount":
                    m25798a.mo25807d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25798a.mo25804a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static AbstractC8225f0.e.d.a.b.AbstractC11460e.AbstractC11462b m25941x(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.a.b.AbstractC11460e.AbstractC11462b.AbstractC11463a m25826a = AbstractC8225f0.e.d.a.b.AbstractC11460e.AbstractC11462b.m25826a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "offset":
                    m25826a.mo25835d(jsonReader.nextLong());
                    break;
                case "symbol":
                    m25826a.mo25837f(jsonReader.nextString());
                    break;
                case "pc":
                    m25826a.mo25836e(jsonReader.nextLong());
                    break;
                case "file":
                    m25826a.mo25833b(jsonReader.nextString());
                    break;
                case "importance":
                    m25826a.mo25834c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25826a.mo25832a();
    }

    /* renamed from: y */
    private static AbstractC8225f0.e.d.AbstractC11465d m25942y(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.AbstractC11465d.a m25869a = AbstractC8225f0.e.d.AbstractC11465d.m25869a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.nextName().equals("content")) {
                m25869a.mo25872b(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return m25869a.mo25871a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public static AbstractC8225f0.e.d.AbstractC11466e m25943z(JsonReader jsonReader) throws IOException {
        AbstractC8225f0.e.d.AbstractC11466e.a m25873a = AbstractC8225f0.e.d.AbstractC11466e.m25873a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "parameterKey":
                    m25873a.mo25879b(jsonReader.nextString());
                    break;
                case "templateVersion":
                    m25873a.mo25882e(jsonReader.nextLong());
                    break;
                case "rolloutVariant":
                    m25873a.mo25881d(m25917I(jsonReader));
                    break;
                case "parameterValue":
                    m25873a.mo25880c(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25873a.mo25878a();
    }

    /* renamed from: L */
    public AbstractC8225f0 m25944L(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC8225f0 m25916H = m25916H(jsonReader);
                jsonReader.close();
                return m25916H;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: M */
    public String m25945M(AbstractC8225f0 abstractC8225f0) {
        return f31385a.mo26075b(abstractC8225f0);
    }

    /* renamed from: a */
    public AbstractC8225f0.e.d m25946a(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                AbstractC8225f0.e.d m25935r = m25935r(jsonReader);
                jsonReader.close();
                return m25935r;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IllegalStateException e2) {
            throw new IOException(e2);
        }
    }

    /* renamed from: b */
    public String m25947b(AbstractC8225f0.e.d dVar) {
        return f31385a.mo26075b(dVar);
    }
}
