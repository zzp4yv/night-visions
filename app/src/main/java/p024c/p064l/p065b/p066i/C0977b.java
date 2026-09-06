package p024c.p064l.p065b.p066i;

import androidx.datastore.core.InterfaceC0340e;
import kotlin.C10535o;
import kotlin.C10742u;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C10822d;
import kotlin.coroutines.p442j.internal.DebugMetadata;
import kotlin.coroutines.p442j.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9768m;
import kotlinx.coroutines.flow.Flow;

/* compiled from: PreferenceDataStoreFactory.kt */
/* renamed from: c.l.b.i.b */
/* loaded from: classes.dex */
public final class C0977b implements InterfaceC0340e<AbstractC0979d> {

    /* renamed from: a */
    private final InterfaceC0340e<AbstractC0979d> f6485a;

    /* compiled from: PreferenceDataStoreFactory.kt */
    @DebugMetadata(m39049c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", m39050f = "PreferenceDataStoreFactory.kt", m39051l = {85}, m39052m = "invokeSuspend")
    /* renamed from: c.l.b.i.b$a */
    static final class a extends SuspendLambda implements Function2<AbstractC0979d, Continuation<? super AbstractC0979d>, Object> {

        /* renamed from: f */
        int f6486f;

        /* renamed from: g */
        /* synthetic */ Object f6487g;

        /* renamed from: h */
        final /* synthetic */ Function2<AbstractC0979d, Continuation<? super AbstractC0979d>, Object> f6488h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super AbstractC0979d, ? super Continuation<? super AbstractC0979d>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f6488h = function2;
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Continuation<C10742u> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f6488h, continuation);
            aVar.f6487g = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC0979d abstractC0979d, Continuation<? super AbstractC0979d> continuation) {
            return ((a) create(abstractC0979d, continuation)).invokeSuspend(C10742u.f41439a);
        }

        @Override // kotlin.coroutines.p442j.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m39045c;
            m39045c = C10822d.m39045c();
            int i2 = this.f6486f;
            if (i2 == 0) {
                C10535o.m37655b(obj);
                AbstractC0979d abstractC0979d = (AbstractC0979d) this.f6487g;
                Function2<AbstractC0979d, Continuation<? super AbstractC0979d>, Object> function2 = this.f6488h;
                this.f6486f = 1;
                obj = function2.invoke(abstractC0979d, this);
                if (obj == m39045c) {
                    return m39045c;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C10535o.m37655b(obj);
            }
            AbstractC0979d abstractC0979d2 = (AbstractC0979d) obj;
            ((C0976a) abstractC0979d2).m6240f();
            return abstractC0979d2;
        }
    }

    public C0977b(InterfaceC0340e<AbstractC0979d> interfaceC0340e) {
        C9768m.m32346f(interfaceC0340e, "delegate");
        this.f6485a = interfaceC0340e;
    }

    @Override // androidx.datastore.core.InterfaceC0340e
    /* renamed from: a */
    public Object mo2358a(Function2<? super AbstractC0979d, ? super Continuation<? super AbstractC0979d>, ? extends Object> function2, Continuation<? super AbstractC0979d> continuation) {
        return this.f6485a.mo2358a(new a(function2, null), continuation);
    }

    @Override // androidx.datastore.core.InterfaceC0340e
    /* renamed from: b */
    public Flow<AbstractC0979d> mo2359b() {
        return this.f6485a.mo2359b();
    }
}
