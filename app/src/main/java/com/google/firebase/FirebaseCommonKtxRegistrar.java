package com.google.firebase;

import androidx.annotation.Keep;
import com.google.firebase.components.C8078b0;
import com.google.firebase.components.C8091n;
import com.google.firebase.components.C8099v;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InterfaceC8093p;
import com.google.firebase.components.InterfaceC8095r;
import com.google.firebase.p200o.p201a.InterfaceC8441a;
import com.google.firebase.p200o.p201a.InterfaceC8442b;
import com.google.firebase.p200o.p201a.InterfaceC8443c;
import com.google.firebase.p200o.p201a.InterfaceC8444d;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.C11005q1;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.HttpUrl;

/* compiled from: Firebase.kt */
@Keep
@Metadata(m32266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¨\u0006\u0006"}, m32267d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "()V", "getComponents", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/google/firebase/components/Component;", "com.google.firebase-firebase-common"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Lcom/google/firebase/components/ComponentContainer;", "create", "com/google/firebase/FirebaseKt$coroutineDispatcher$1"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$a */
    public static final class C8057a<T> implements InterfaceC8095r {

        /* renamed from: a */
        public static final C8057a<T> f30634a = new C8057a<>();

        @Override // com.google.firebase.components.InterfaceC8095r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo24937a(InterfaceC8093p interfaceC8093p) {
            Object mo24978f = interfaceC8093p.mo24978f(C8078b0.m24971a(InterfaceC8441a.class, Executor.class));
            C9768m.m32345e(mo24978f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C11005q1.m39679a((Executor) mo24978f);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Lcom/google/firebase/components/ComponentContainer;", "create", "com/google/firebase/FirebaseKt$coroutineDispatcher$1"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$b */
    public static final class C8058b<T> implements InterfaceC8095r {

        /* renamed from: a */
        public static final C8058b<T> f30635a = new C8058b<>();

        @Override // com.google.firebase.components.InterfaceC8095r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo24937a(InterfaceC8093p interfaceC8093p) {
            Object mo24978f = interfaceC8093p.mo24978f(C8078b0.m24971a(InterfaceC8443c.class, Executor.class));
            C9768m.m32345e(mo24978f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C11005q1.m39679a((Executor) mo24978f);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Lcom/google/firebase/components/ComponentContainer;", "create", "com/google/firebase/FirebaseKt$coroutineDispatcher$1"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$c */
    public static final class C8059c<T> implements InterfaceC8095r {

        /* renamed from: a */
        public static final C8059c<T> f30636a = new C8059c<>();

        @Override // com.google.firebase.components.InterfaceC8095r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo24937a(InterfaceC8093p interfaceC8093p) {
            Object mo24978f = interfaceC8093p.mo24978f(C8078b0.m24971a(InterfaceC8442b.class, Executor.class));
            C9768m.m32345e(mo24978f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C11005q1.m39679a((Executor) mo24978f);
        }
    }

    /* compiled from: Firebase.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlin.jvm.PlatformType", "T", HttpUrl.FRAGMENT_ENCODE_SET, "c", "Lcom/google/firebase/components/ComponentContainer;", "create", "com/google/firebase/FirebaseKt$coroutineDispatcher$1"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.FirebaseCommonKtxRegistrar$d */
    public static final class C8060d<T> implements InterfaceC8095r {

        /* renamed from: a */
        public static final C8060d<T> f30637a = new C8060d<>();

        @Override // com.google.firebase.components.InterfaceC8095r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CoroutineDispatcher mo24937a(InterfaceC8093p interfaceC8093p) {
            Object mo24978f = interfaceC8093p.mo24978f(C8078b0.m24971a(InterfaceC8444d.class, Executor.class));
            C9768m.m32345e(mo24978f, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C11005q1.m39679a((Executor) mo24978f);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C8091n<?>> getComponents() {
        List<C8091n<?>> m38891m;
        C8091n m25008d = C8091n.m24984a(C8078b0.m24971a(InterfaceC8441a.class, CoroutineDispatcher.class)).m25006b(C8099v.m25059j(C8078b0.m24971a(InterfaceC8441a.class, Executor.class))).m25010f(C8057a.f30634a).m25008d();
        C9768m.m32345e(m25008d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C8091n m25008d2 = C8091n.m24984a(C8078b0.m24971a(InterfaceC8443c.class, CoroutineDispatcher.class)).m25006b(C8099v.m25059j(C8078b0.m24971a(InterfaceC8443c.class, Executor.class))).m25010f(C8058b.f30635a).m25008d();
        C9768m.m32345e(m25008d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C8091n m25008d3 = C8091n.m24984a(C8078b0.m24971a(InterfaceC8442b.class, CoroutineDispatcher.class)).m25006b(C8099v.m25059j(C8078b0.m24971a(InterfaceC8442b.class, Executor.class))).m25010f(C8059c.f30636a).m25008d();
        C9768m.m32345e(m25008d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C8091n m25008d4 = C8091n.m24984a(C8078b0.m24971a(InterfaceC8444d.class, CoroutineDispatcher.class)).m25006b(C8099v.m25059j(C8078b0.m24971a(InterfaceC8444d.class, Executor.class))).m25010f(C8060d.f30637a).m25008d();
        C9768m.m32345e(m25008d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        m38891m = C10784u.m38891m(m25008d, m25008d2, m25008d3, m25008d4);
        return m38891m;
    }
}
