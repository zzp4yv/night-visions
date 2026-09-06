package com.google.firebase.sessions;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.collections.C10749c0;
import kotlin.collections.C10784u;
import kotlin.comparisons.C10806b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.C10975j;
import kotlinx.coroutines.C11000p0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import okhttp3.HttpUrl;

/* compiled from: SessionLifecycleClient.kt */
@Metadata(m32266d1 = {"\u0000U\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\r\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0010J \u0010\u0015\u001a\u0004\u0018\u00010\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0007H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0019H\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0003J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e¨\u0006#"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient;", HttpUrl.FRAGMENT_ENCODE_SET, "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "queuedMessages", "Ljava/util/concurrent/LinkedBlockingDeque;", "Landroid/os/Message;", "service", "Landroid/os/Messenger;", "serviceBound", HttpUrl.FRAGMENT_ENCODE_SET, "serviceConnection", "com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "Lcom/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1;", "backgrounded", HttpUrl.FRAGMENT_ENCODE_SET, "bindToService", "drainQueue", HttpUrl.FRAGMENT_ENCODE_SET, "foregrounded", "getLatestByCode", "messages", HttpUrl.FRAGMENT_ENCODE_SET, "msgCode", HttpUrl.FRAGMENT_ENCODE_SET, "queueMessage", "msg", "sendLifecycleEvent", "messageCode", "sendLifecycleEvents", "Lkotlinx/coroutines/Job;", "sendMessageToServer", "ClientUpdateHandler", "Companion", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: com.google.firebase.sessions.f0, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class SessionLifecycleClient {

    /* renamed from: a */
    public static final b f32169a = new b(null);

    /* renamed from: b */
    private final CoroutineContext f32170b;

    /* renamed from: c */
    private Messenger f32171c;

    /* renamed from: d */
    private boolean f32172d;

    /* renamed from: e */
    private final LinkedBlockingDeque<Message> f32173e;

    /* renamed from: f */
    private final d f32174f;

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(m32266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$ClientUpdateHandler;", "Landroid/os/Handler;", "backgroundDispatcher", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "handleMessage", HttpUrl.FRAGMENT_ENCODE_SET, "msg", "Landroid/os/Message;", "handleSessionUpdate", "sessionId", HttpUrl.FRAGMENT_ENCODE_SET, "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.f0$a */
    public static final class a extends Handler {

        /* renamed from: a */
        private final CoroutineContext f32175a;

        /* compiled from: SessionLifecycleClient.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", m39050f = "SessionLifecycleClient.kt", m39051l = {74}, m39052m = "invokeSuspend")
        /* renamed from: com.google.firebase.sessions.f0$a$a, reason: collision with other inner class name */
        static final class C11468a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10742u>, Object> {

            /* renamed from: f */
            int f32176f;

            /* renamed from: g */
            final /* synthetic */ String f32177g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C11468a(String str, Continuation<? super C11468a> continuation) {
                super(2, continuation);
                this.f32177g = str;
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
                return new C11468a(this.f32177g, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10742u> continuation) {
                return ((C11468a) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
            }

            @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m39045c;
                m39045c = C10822d.m39045c();
                int i2 = this.f32176f;
                if (i2 == 0) {
                    C10535o.m37655b(obj);
                    FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.f32247a;
                    this.f32176f = 1;
                    obj = firebaseSessionsDependencies.m26792c(this);
                    if (obj == m39045c) {
                        return m39045c;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C10535o.m37655b(obj);
                }
                Collection<SessionSubscriber> values = ((Map) obj).values();
                String str = this.f32177g;
                for (SessionSubscriber sessionSubscriber : values) {
                    sessionSubscriber.mo25366c(new SessionSubscriber.SessionDetails(str));
                    Log.d("SessionLifecycleClient", "Notified " + sessionSubscriber.mo25365b() + " of new session " + str);
                }
                return C10742u.f41439a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineContext coroutineContext) {
            super(Looper.getMainLooper());
            C9768m.m32346f(coroutineContext, "backgroundDispatcher");
            this.f32175a = coroutineContext;
        }

        /* renamed from: a */
        private final void m26765a(String str) {
            Log.d("SessionLifecycleClient", "Session update received: " + str);
            C10975j.m39597b(C11000p0.m39668a(this.f32175a), null, null, new C11468a(str, null), 3, null);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            String str;
            C9768m.m32346f(msg, "msg");
            if (msg.what == 3) {
                Bundle data = msg.getData();
                if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                m26765a(str);
                return;
            }
            Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
            super.handleMessage(msg);
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m32267d2 = {"Lcom/google/firebase/sessions/SessionLifecycleClient$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "()V", "MAX_QUEUED_MESSAGES", HttpUrl.FRAGMENT_ENCODE_SET, "TAG", HttpUrl.FRAGMENT_ENCODE_SET, "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.f0$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    @DebugMetadata(m39049c = "com.google.firebase.sessions.SessionLifecycleClient$sendLifecycleEvents$1", m39050f = "SessionLifecycleClient.kt", m39051l = {151}, m39052m = "invokeSuspend")
    /* renamed from: com.google.firebase.sessions.f0$c */
    static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super C10742u>, Object> {

        /* renamed from: f */
        int f32178f;

        /* renamed from: h */
        final /* synthetic */ List<Message> f32180h;

        /* compiled from: Comparisons.kt */
        @Metadata(m32266d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m32267d2 = {"<anonymous>", HttpUrl.FRAGMENT_ENCODE_SET, "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
        /* renamed from: com.google.firebase.sessions.f0$c$a */
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int m39017a;
                m39017a = C10806b.m39017a(Long.valueOf(((Message) t).getWhen()), Long.valueOf(((Message) t2).getWhen()));
                return m39017a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Message> list, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f32180h = list;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
            return SessionLifecycleClient.this.new c(this.f32180h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super C10742u> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(C10742u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m39045c;
            boolean z;
            List m38894p;
            List m38586R;
            List m38618x0;
            m39045c = C10822d.m39045c();
            int i2 = this.f32178f;
            if (i2 == 0) {
                C10535o.m37655b(obj);
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.f32247a;
                this.f32178f = 1;
                obj = firebaseSessionsDependencies.m26792c(this);
                if (obj == m39045c) {
                    return m39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10535o.m37655b(obj);
            }
            Map map = (Map) obj;
            if (map.isEmpty()) {
                Log.d("SessionLifecycleClient", "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.");
            } else {
                Collection values = map.values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((SessionSubscriber) it.next()).mo25364a()) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                if (z) {
                    Log.d("SessionLifecycleClient", "Data Collection is disabled for all subscribers. Skipping this Event");
                } else {
                    m38894p = C10784u.m38894p(SessionLifecycleClient.this.m26757l(this.f32180h, 2), SessionLifecycleClient.this.m26757l(this.f32180h, 1));
                    m38586R = C10749c0.m38586R(m38894p);
                    m38618x0 = C10749c0.m38618x0(m38586R, new a());
                    SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
                    Iterator it2 = m38618x0.iterator();
                    while (it2.hasNext()) {
                        sessionLifecycleClient.m26761p((Message) it2.next());
                    }
                }
            }
            return C10742u.f41439a;
        }
    }

    /* compiled from: SessionLifecycleClient.kt */
    @Metadata(m32266d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, m32267d2 = {"com/google/firebase/sessions/SessionLifecycleClient$serviceConnection$1", "Landroid/content/ServiceConnection;", "onServiceConnected", HttpUrl.FRAGMENT_ENCODE_SET, "className", "Landroid/content/ComponentName;", "serviceBinder", "Landroid/os/IBinder;", "onServiceDisconnected", "com.google.firebase-firebase-sessions"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: com.google.firebase.sessions.f0$d */
    public static final class d implements ServiceConnection {
        d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName className, IBinder serviceBinder) {
            Log.d("SessionLifecycleClient", "Connected to SessionLifecycleService. Queue size " + SessionLifecycleClient.this.f32173e.size());
            SessionLifecycleClient.this.f32171c = new Messenger(serviceBinder);
            SessionLifecycleClient.this.f32172d = true;
            SessionLifecycleClient sessionLifecycleClient = SessionLifecycleClient.this;
            sessionLifecycleClient.m26760o(sessionLifecycleClient.m26756j());
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName className) {
            Log.d("SessionLifecycleClient", "Disconnected from SessionLifecycleService");
            SessionLifecycleClient.this.f32171c = null;
            SessionLifecycleClient.this.f32172d = false;
        }
    }

    public SessionLifecycleClient(CoroutineContext coroutineContext) {
        C9768m.m32346f(coroutineContext, "backgroundDispatcher");
        this.f32170b = coroutineContext;
        this.f32173e = new LinkedBlockingDeque<>(20);
        this.f32174f = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final List<Message> m26756j() {
        ArrayList arrayList = new ArrayList();
        this.f32173e.drainTo(arrayList);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final Message m26757l(List<Message> list, int i2) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((Message) obj2).what == i2) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long when = ((Message) next).getWhen();
                do {
                    Object next2 = it.next();
                    long when2 = ((Message) next2).getWhen();
                    if (when < when2) {
                        next = next2;
                        when = when2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (Message) obj;
    }

    /* renamed from: m */
    private final void m26758m(Message message) {
        if (!this.f32173e.offer(message)) {
            Log.d("SessionLifecycleClient", "Failed to enqueue message " + message.what + ". Dropping.");
            return;
        }
        Log.d("SessionLifecycleClient", "Queued message " + message.what + ". Queue size " + this.f32173e.size());
    }

    /* renamed from: n */
    private final void m26759n(int i2) {
        List<Message> m26756j = m26756j();
        Message obtain = Message.obtain(null, i2, 0, 0);
        C9768m.m32345e(obtain, "obtain(null, messageCode, 0, 0)");
        m26756j.add(obtain);
        m26760o(m26756j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public final Job m26760o(List<Message> list) {
        Job m39597b;
        m39597b = C10975j.m39597b(C11000p0.m39668a(this.f32170b), null, null, new c(list, null), 3, null);
        return m39597b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m26761p(Message message) {
        if (this.f32171c == null) {
            m26758m(message);
            return;
        }
        try {
            Log.d("SessionLifecycleClient", "Sending lifecycle " + message.what + " to service");
            Messenger messenger = this.f32171c;
            if (messenger != null) {
                messenger.send(message);
            }
        } catch (RemoteException e2) {
            Log.w("SessionLifecycleClient", "Unable to deliver message: " + message.what, e2);
            m26758m(message);
        }
    }

    /* renamed from: h */
    public final void m26762h() {
        m26759n(2);
    }

    /* renamed from: i */
    public final void m26763i() {
        SessionLifecycleServiceBinder.f32183a.m26767a().mo26766a(new Messenger(new a(this.f32170b)), this.f32174f);
    }

    /* renamed from: k */
    public final void m26764k() {
        m26759n(1);
    }
}
