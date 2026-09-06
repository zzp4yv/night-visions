package com.airbnb.epoxy;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.preload.AbstractC5131a;
import com.airbnb.epoxy.preload.C5132b;
import com.airbnb.epoxy.preload.InterfaceC5133c;
import com.airbnb.epoxy.preload.InterfaceC5138h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C10742u;
import kotlin.Metadata;
import kotlin.collections.C10782t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import okhttp3.HttpUrl;
import p241e.p242a.p243a.C8739c;

/* compiled from: EpoxyRecyclerView.kt */
@Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 w2\u00020\u0001:\u0005xyz{|B'\b\u0007\u0012\u0006\u0010q\u001a\u00020\u0013\u0012\n\b\u0002\u0010s\u001a\u0004\u0018\u00010r\u0012\b\b\u0002\u0010t\u001a\u00020\u0010¢\u0006\u0004\bu\u0010vJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0085\u0001\u0010\u001c\u001a\u00020\u0002\"\f\b\u0000\u0010\u000b*\u0006\u0012\u0002\b\u00030\n\"\n\b\u0001\u0010\r*\u0004\u0018\u00010\f\"\b\b\u0002\u0010\u000f*\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102 \u0010\u0017\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\b\u0012\u00060\u0014j\u0002`\u0015\u0012\u0004\u0012\u00020\u00020\u0012j\u0002`\u00162\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u0004J\u0015\u0010!\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0010¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0002H\u0015¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001fH\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0014¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u000100H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0002H\u0016¢\u0006\u0004\b6\u0010\u0004J\u0017\u00108\u001a\u00020\u00022\b\b\u0001\u00107\u001a\u00020\u0010¢\u0006\u0004\b8\u0010%J\u0017\u0010:\u001a\u00020\u00022\b\b\u0001\u00109\u001a\u00020\u0010¢\u0006\u0004\b:\u0010%J\u0017\u0010<\u001a\u00020\u00022\b\b\u0001\u0010;\u001a\u00020\u0010¢\u0006\u0004\b<\u0010%J!\u0010?\u001a\u00020\u00022\u0010\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0=H\u0016¢\u0006\u0004\b?\u0010@J\u0015\u0010C\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\u00020\u00022\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bE\u0010DJ!\u0010H\u001a\u00020\u00022\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00020F¢\u0006\u0004\bH\u0010IJ\u0015\u0010L\u001a\u00020\u00022\u0006\u0010K\u001a\u00020J¢\u0006\u0004\bL\u0010MJ\r\u0010N\u001a\u00020\u0002¢\u0006\u0004\bN\u0010\u0004J\u000f\u0010O\u001a\u00020\u0002H\u0016¢\u0006\u0004\bO\u0010\u0004J\u0019\u0010P\u001a\u00020\u00102\b\b\u0001\u00109\u001a\u00020\u0010H\u0005¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u00020\u00102\b\b\u0001\u00107\u001a\u00020\u0010H\u0005¢\u0006\u0004\bR\u0010QJ\u001d\u0010U\u001a\u00020\u00022\f\u0010T\u001a\b\u0012\u0002\b\u0003\u0018\u00010SH\u0016¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u00020\u00022\f\u0010T\u001a\b\u0012\u0002\b\u0003\u0018\u00010S2\u0006\u0010W\u001a\u00020\u001fH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0002H\u0016¢\u0006\u0004\bZ\u0010\u0004J\u000f\u0010[\u001a\u00020\u0002H\u0016¢\u0006\u0004\b[\u0010\u0004R(\u0010^\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030]0\\8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001c\u0010a\u001a\u00020`8\u0004@\u0004X\u0084\u0004¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001c\u0010e\u001a\b\u0012\u0002\b\u0003\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010gR\u0016\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010hR \u0010j\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030i0\\8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010_R\u0018\u0010k\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010gR\u0016\u0010o\u001a\u00020n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010p¨\u0006}"}, m32267d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lkotlin/u;", "updatePreloaders", "()V", "initViewPool", "syncSpanCount", "removeAdapter", "clearRemovedAdapterAndCancelRunnable", "clearPoolIfActivityIsDestroyed", "Lcom/airbnb/epoxy/s;", "T", "Lcom/airbnb/epoxy/preload/h;", "U", "Lcom/airbnb/epoxy/preload/c;", "P", HttpUrl.FRAGMENT_ENCODE_SET, "maxPreloadDistance", "Lkotlin/Function2;", "Landroid/content/Context;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcom/airbnb/epoxy/preload/PreloadErrorHandler;", "errorHandler", "Lcom/airbnb/epoxy/preload/a;", "preloader", "Lkotlin/Function0;", "requestHolderFactory", "addPreloader", "(ILkotlin/a0/c/p;Lcom/airbnb/epoxy/preload/a;Lkotlin/a0/c/a;)V", "clearPreloaders", HttpUrl.FRAGMENT_ENCODE_SET, "removeAdapterWhenDetachedFromWindow", "setRemoveAdapterWhenDetachedFromWindow", "(Z)V", "delayMsWhenRemovingAdapterOnDetach", "setDelayMsWhenRemovingAdapterOnDetach", "(I)V", "init", "Landroidx/recyclerview/widget/RecyclerView$u;", "createViewPool", "()Landroidx/recyclerview/widget/RecyclerView$u;", "shouldShareViewPoolAcrossContext", "()Z", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroidx/recyclerview/widget/RecyclerView$o;", "createLayoutManager", "()Landroidx/recyclerview/widget/RecyclerView$o;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/RecyclerView$o;)V", "requestLayout", "itemSpacingRes", "setItemSpacingRes", "dp", "setItemSpacingDp", "spacingPx", "setItemSpacingPx", HttpUrl.FRAGMENT_ENCODE_SET, "models", "setModels", "(Ljava/util/List;)V", "Lcom/airbnb/epoxy/n;", "controller", "setController", "(Lcom/airbnb/epoxy/n;)V", "setControllerAndBuildModels", "Lkotlin/Function1;", "buildModels", "withModels", "(Lkotlin/a0/c/l;)V", "Lcom/airbnb/epoxy/EpoxyRecyclerView$b;", "callback", "buildModelsWith", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$b;)V", "requestModelBuild", "clear", "dpToPx", "(I)I", "resToPx", "Landroidx/recyclerview/widget/RecyclerView$g;", "adapter", "setAdapter", "(Landroidx/recyclerview/widget/RecyclerView$g;)V", "removeAndRecycleExistingViews", "swapAdapter", "(Landroidx/recyclerview/widget/RecyclerView$g;Z)V", "onAttachedToWindow", "onDetachedFromWindow", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/airbnb/epoxy/EpoxyRecyclerView$c;", "preloadConfigs", "Ljava/util/List;", "Lcom/airbnb/epoxy/r;", "spacingDecorator", "Lcom/airbnb/epoxy/r;", "getSpacingDecorator", "()Lcom/airbnb/epoxy/r;", "removedAdapter", "Landroidx/recyclerview/widget/RecyclerView$g;", "Z", "I", "Lcom/airbnb/epoxy/preload/b;", "preloadScrollListeners", "epoxyController", "Lcom/airbnb/epoxy/n;", "isRemoveAdapterRunnablePosted", "Ljava/lang/Runnable;", "removeAdapterRunnable", "Ljava/lang/Runnable;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "a", "b", "ModelBuilderCallbackController", "c", "WithModelsController", "epoxy-adapter_release"}, m32268k = 1, m32269mv = {1, 4, 0})
/* loaded from: classes.dex */
public class EpoxyRecyclerView extends RecyclerView {
    private static final int DEFAULT_ADAPTER_REMOVAL_DELAY_MS = 2000;
    private int delayMsWhenRemovingAdapterOnDetach;
    private AbstractC5128n epoxyController;
    private boolean isRemoveAdapterRunnablePosted;
    private final List<C5097c<?, ?, ?>> preloadConfigs;
    private final List<C5132b<?>> preloadScrollListeners;
    private final Runnable removeAdapterRunnable;
    private boolean removeAdapterWhenDetachedFromWindow;
    private RecyclerView.AbstractC0594g<?> removedAdapter;
    private final C5140r spacingDecorator;
    private static final C5102a ACTIVITY_RECYCLER_POOL = new C5102a();

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, m32267d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$ModelBuilderCallbackController;", "Lcom/airbnb/epoxy/n;", "Lkotlin/u;", "buildModels", "()V", "Lcom/airbnb/epoxy/EpoxyRecyclerView$b;", "callback", "Lcom/airbnb/epoxy/EpoxyRecyclerView$b;", "getCallback", "()Lcom/airbnb/epoxy/EpoxyRecyclerView$b;", "setCallback", "(Lcom/airbnb/epoxy/EpoxyRecyclerView$b;)V", "<init>", "epoxy-adapter_release"}, m32268k = 1, m32269mv = {1, 4, 0})
    private static final class ModelBuilderCallbackController extends AbstractC5128n {
        private InterfaceC5096b callback = new C5093a();

        /* compiled from: EpoxyRecyclerView.kt */
        /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$ModelBuilderCallbackController$a */
        public static final class C5093a implements InterfaceC5096b {
            C5093a() {
            }

            @Override // com.airbnb.epoxy.EpoxyRecyclerView.InterfaceC5096b
            /* renamed from: a */
            public void mo9175a(AbstractC5128n abstractC5128n) {
                C9768m.m32347g(abstractC5128n, "controller");
            }
        }

        @Override // com.airbnb.epoxy.AbstractC5128n
        protected void buildModels() {
            this.callback.mo9175a(this);
        }

        public final InterfaceC5096b getCallback() {
            return this.callback;
        }

        public final void setCallback(InterfaceC5096b interfaceC5096b) {
            C9768m.m32347g(interfaceC5096b, "<set-?>");
            this.callback = interfaceC5096b;
        }
    }

    /* compiled from: EpoxyRecyclerView.kt */
    @Metadata(m32265bv = {1, 0, 3}, m32266d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, m32267d2 = {"Lcom/airbnb/epoxy/EpoxyRecyclerView$WithModelsController;", "Lcom/airbnb/epoxy/n;", "Lkotlin/u;", "buildModels", "()V", "Lkotlin/Function1;", "callback", "Lkotlin/a0/c/l;", "getCallback", "()Lkotlin/a0/c/l;", "setCallback", "(Lkotlin/a0/c/l;)V", "<init>", "epoxy-adapter_release"}, m32268k = 1, m32269mv = {1, 4, 0})
    private static final class WithModelsController extends AbstractC5128n {
        private Function1<? super AbstractC5128n, C10742u> callback = C5094a.f12177f;

        /* compiled from: EpoxyRecyclerView.kt */
        /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$WithModelsController$a */
        static final class C5094a extends Lambda implements Function1<AbstractC5128n, C10742u> {

            /* renamed from: f */
            public static final C5094a f12177f = new C5094a();

            C5094a() {
                super(1);
            }

            /* renamed from: b */
            public final void m9176b(AbstractC5128n abstractC5128n) {
                C9768m.m32347g(abstractC5128n, "$receiver");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ C10742u invoke(AbstractC5128n abstractC5128n) {
                m9176b(abstractC5128n);
                return C10742u.f41439a;
            }
        }

        @Override // com.airbnb.epoxy.AbstractC5128n
        protected void buildModels() {
            this.callback.invoke(this);
        }

        public final Function1<AbstractC5128n, C10742u> getCallback() {
            return this.callback;
        }

        public final void setCallback(Function1<? super AbstractC5128n, C10742u> function1) {
            C9768m.m32347g(function1, "<set-?>");
            this.callback = function1;
        }
    }

    /* compiled from: EpoxyRecyclerView.kt */
    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$b */
    public interface InterfaceC5096b {
        /* renamed from: a */
        void mo9175a(AbstractC5128n abstractC5128n);
    }

    /* compiled from: EpoxyRecyclerView.kt */
    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$c */
    private static final class C5097c<T extends AbstractC5141s<?>, U extends InterfaceC5138h, P extends InterfaceC5133c> {

        /* renamed from: a */
        private final int f12178a;

        /* renamed from: b */
        private final Function2<Context, RuntimeException, C10742u> f12179b;

        /* renamed from: c */
        private final AbstractC5131a<T, U, P> f12180c;

        /* renamed from: d */
        private final Function0<P> f12181d;

        /* JADX WARN: Multi-variable type inference failed */
        public C5097c(int i2, Function2<? super Context, ? super RuntimeException, C10742u> function2, AbstractC5131a<T, U, P> abstractC5131a, Function0<? extends P> function0) {
            C9768m.m32347g(function2, "errorHandler");
            C9768m.m32347g(abstractC5131a, "preloader");
            C9768m.m32347g(function0, "requestHolderFactory");
            this.f12178a = i2;
            this.f12179b = function2;
            this.f12180c = abstractC5131a;
            this.f12181d = function0;
        }

        /* renamed from: a */
        public final Function2<Context, RuntimeException, C10742u> m9177a() {
            return this.f12179b;
        }

        /* renamed from: b */
        public final int m9178b() {
            return this.f12178a;
        }

        /* renamed from: c */
        public final AbstractC5131a<T, U, P> m9179c() {
            return this.f12180c;
        }

        /* renamed from: d */
        public final Function0<P> m9180d() {
            return this.f12181d;
        }
    }

    /* compiled from: EpoxyRecyclerView.kt */
    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$d */
    static final class C5098d extends Lambda implements Function0<RecyclerView.C0608u> {
        C5098d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RecyclerView.C0608u invoke() {
            return EpoxyRecyclerView.this.createViewPool();
        }
    }

    /* compiled from: EpoxyRecyclerView.kt */
    /* renamed from: com.airbnb.epoxy.EpoxyRecyclerView$e */
    static final class RunnableC5099e implements Runnable {
        RunnableC5099e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (EpoxyRecyclerView.this.isRemoveAdapterRunnablePosted) {
                EpoxyRecyclerView.this.isRemoveAdapterRunnablePosted = false;
                EpoxyRecyclerView.this.removeAdapter();
            }
        }
    }

    public EpoxyRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EpoxyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i2, int i3, C9756g c9756g) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public static /* synthetic */ void addPreloader$default(EpoxyRecyclerView epoxyRecyclerView, int i2, Function2 function2, AbstractC5131a abstractC5131a, Function0 function0, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPreloader");
        }
        if ((i3 & 1) != 0) {
            i2 = 3;
        }
        epoxyRecyclerView.addPreloader(i2, function2, abstractC5131a, function0);
    }

    private final void clearPoolIfActivityIsDestroyed() {
        if (C5104b.m9201a(getContext())) {
            getRecycledViewPool().mo4249b();
        }
    }

    private final void clearRemovedAdapterAndCancelRunnable() {
        this.removedAdapter = null;
        if (this.isRemoveAdapterRunnablePosted) {
            removeCallbacks(this.removeAdapterRunnable);
            this.isRemoveAdapterRunnablePosted = false;
        }
    }

    private final void initViewPool() {
        if (!shouldShareViewPoolAcrossContext()) {
            setRecycledViewPool(createViewPool());
            return;
        }
        C5102a c5102a = ACTIVITY_RECYCLER_POOL;
        Context context = getContext();
        C9768m.m32342b(context, "context");
        setRecycledViewPool(c5102a.m9196b(context, new C5098d()).getViewPool());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeAdapter() {
        RecyclerView.AbstractC0594g<?> adapter = getAdapter();
        if (adapter != null) {
            swapAdapter(null, true);
            this.removedAdapter = adapter;
        }
        clearPoolIfActivityIsDestroyed();
    }

    private final void syncSpanCount() {
        RecyclerView.AbstractC0602o layoutManager = getLayoutManager();
        AbstractC5128n abstractC5128n = this.epoxyController;
        if (!(layoutManager instanceof GridLayoutManager) || abstractC5128n == null) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        if (abstractC5128n.getSpanCount() == gridLayoutManager.getSpanCount() && gridLayoutManager.getSpanSizeLookup() == abstractC5128n.getSpanSizeLookup()) {
            return;
        }
        abstractC5128n.setSpanCount(gridLayoutManager.getSpanCount());
        gridLayoutManager.setSpanSizeLookup(abstractC5128n.getSpanSizeLookup());
    }

    private final void updatePreloaders() {
        C5132b<?> m9340b;
        Iterator<T> it = this.preloadScrollListeners.iterator();
        while (it.hasNext()) {
            removeOnScrollListener((C5132b) it.next());
        }
        this.preloadScrollListeners.clear();
        RecyclerView.AbstractC0594g adapter = getAdapter();
        if (adapter != null) {
            C9768m.m32342b(adapter, "adapter ?: return");
            Iterator<T> it2 = this.preloadConfigs.iterator();
            while (it2.hasNext()) {
                C5097c c5097c = (C5097c) it2.next();
                if (adapter instanceof AbstractC5124l) {
                    m9340b = C5132b.f12265a.m9339a((AbstractC5124l) adapter, c5097c.m9180d(), c5097c.m9177a(), c5097c.m9178b(), C10782t.m38883e(c5097c.m9179c()));
                } else {
                    AbstractC5128n abstractC5128n = this.epoxyController;
                    m9340b = abstractC5128n != null ? C5132b.f12265a.m9340b(abstractC5128n, c5097c.m9180d(), c5097c.m9177a(), c5097c.m9178b(), C10782t.m38883e(c5097c.m9179c())) : null;
                }
                if (m9340b != null) {
                    this.preloadScrollListeners.add(m9340b);
                    addOnScrollListener(m9340b);
                }
            }
        }
    }

    public final <T extends AbstractC5141s<?>, U extends InterfaceC5138h, P extends InterfaceC5133c> void addPreloader(int maxPreloadDistance, Function2<? super Context, ? super RuntimeException, C10742u> errorHandler, AbstractC5131a<T, U, P> preloader, Function0<? extends P> requestHolderFactory) {
        C9768m.m32347g(errorHandler, "errorHandler");
        C9768m.m32347g(preloader, "preloader");
        C9768m.m32347g(requestHolderFactory, "requestHolderFactory");
        this.preloadConfigs.add(new C5097c<>(maxPreloadDistance, errorHandler, preloader, requestHolderFactory));
        updatePreloaders();
    }

    public final void buildModelsWith(InterfaceC5096b callback) {
        C9768m.m32347g(callback, "callback");
        AbstractC5128n abstractC5128n = this.epoxyController;
        if (!(abstractC5128n instanceof ModelBuilderCallbackController)) {
            abstractC5128n = null;
        }
        ModelBuilderCallbackController modelBuilderCallbackController = (ModelBuilderCallbackController) abstractC5128n;
        if (modelBuilderCallbackController == null) {
            modelBuilderCallbackController = new ModelBuilderCallbackController();
            setController(modelBuilderCallbackController);
        }
        modelBuilderCallbackController.setCallback(callback);
        modelBuilderCallbackController.requestModelBuild();
    }

    public void clear() {
        AbstractC5128n abstractC5128n = this.epoxyController;
        if (abstractC5128n != null) {
            abstractC5128n.cancelPendingModelBuild();
        }
        this.epoxyController = null;
        swapAdapter(null, true);
    }

    public final void clearPreloaders() {
        this.preloadConfigs.clear();
        updatePreloaders();
    }

    protected RecyclerView.AbstractC0602o createLayoutManager() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int i2 = layoutParams.height;
        if (i2 != -1 && i2 != 0) {
            return new LinearLayoutManager(getContext(), 0, false);
        }
        int i3 = layoutParams.width;
        if (i3 == -1 || i3 == 0) {
            setHasFixedSize(true);
        }
        return new LinearLayoutManager(getContext());
    }

    protected RecyclerView.C0608u createViewPool() {
        return new C5125l0();
    }

    protected final int dpToPx(int dp) {
        Resources resources = getResources();
        C9768m.m32342b(resources, "resources");
        return (int) TypedValue.applyDimension(1, dp, resources.getDisplayMetrics());
    }

    protected final C5140r getSpacingDecorator() {
        return this.spacingDecorator;
    }

    protected void init() {
        setClipToPadding(false);
        initViewPool();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RecyclerView.AbstractC0594g<?> abstractC0594g = this.removedAdapter;
        if (abstractC0594g != null) {
            swapAdapter(abstractC0594g, false);
        }
        clearRemovedAdapterAndCancelRunnable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Iterator<T> it = this.preloadScrollListeners.iterator();
        while (it.hasNext()) {
            ((C5132b) it.next()).m9338b();
        }
        if (this.removeAdapterWhenDetachedFromWindow) {
            int i2 = this.delayMsWhenRemovingAdapterOnDetach;
            if (i2 > 0) {
                this.isRemoveAdapterRunnablePosted = true;
                postDelayed(this.removeAdapterRunnable, i2);
            } else {
                removeAdapter();
            }
        }
        clearPoolIfActivityIsDestroyed();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public void requestLayout() {
        syncSpanCount();
        super.requestLayout();
    }

    public final void requestModelBuild() {
        AbstractC5128n abstractC5128n = this.epoxyController;
        if (abstractC5128n == null) {
            throw new IllegalStateException("A controller must be set before requesting a model build.");
        }
        if (abstractC5128n instanceof SimpleEpoxyController) {
            throw new IllegalStateException("Models were set with #setModels, they can not be rebuilt.");
        }
        if (abstractC5128n == null) {
            C9768m.m32357q();
        }
        abstractC5128n.requestModelBuild();
    }

    protected final int resToPx(int itemSpacingRes) {
        return getResources().getDimensionPixelOffset(itemSpacingRes);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.AbstractC0594g<?> adapter) {
        super.setAdapter(adapter);
        clearRemovedAdapterAndCancelRunnable();
        updatePreloaders();
    }

    public final void setController(AbstractC5128n controller) {
        C9768m.m32347g(controller, "controller");
        this.epoxyController = controller;
        setAdapter(controller.getAdapter());
        syncSpanCount();
    }

    public final void setControllerAndBuildModels(AbstractC5128n controller) {
        C9768m.m32347g(controller, "controller");
        controller.requestModelBuild();
        setController(controller);
    }

    public final void setDelayMsWhenRemovingAdapterOnDetach(int delayMsWhenRemovingAdapterOnDetach) {
        this.delayMsWhenRemovingAdapterOnDetach = delayMsWhenRemovingAdapterOnDetach;
    }

    public final void setItemSpacingDp(int dp) {
        setItemSpacingPx(dpToPx(dp));
    }

    public final void setItemSpacingPx(int spacingPx) {
        removeItemDecoration(this.spacingDecorator);
        this.spacingDecorator.m9358g(spacingPx);
        if (spacingPx > 0) {
            addItemDecoration(this.spacingDecorator);
        }
    }

    public final void setItemSpacingRes(int itemSpacingRes) {
        setItemSpacingPx(resToPx(itemSpacingRes));
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.AbstractC0602o layout) {
        super.setLayoutManager(layout);
        syncSpanCount();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams params) {
        C9768m.m32347g(params, "params");
        boolean z = getLayoutParams() == null;
        super.setLayoutParams(params);
        if (z && getLayoutManager() == null) {
            setLayoutManager(createLayoutManager());
        }
    }

    public void setModels(List<? extends AbstractC5141s<?>> models) {
        C9768m.m32347g(models, "models");
        AbstractC5128n abstractC5128n = this.epoxyController;
        if (!(abstractC5128n instanceof SimpleEpoxyController)) {
            abstractC5128n = null;
        }
        SimpleEpoxyController simpleEpoxyController = (SimpleEpoxyController) abstractC5128n;
        if (simpleEpoxyController == null) {
            simpleEpoxyController = new SimpleEpoxyController();
            setController(simpleEpoxyController);
        }
        simpleEpoxyController.setModels(models);
    }

    public final void setRemoveAdapterWhenDetachedFromWindow(boolean removeAdapterWhenDetachedFromWindow) {
        this.removeAdapterWhenDetachedFromWindow = removeAdapterWhenDetachedFromWindow;
    }

    public boolean shouldShareViewPoolAcrossContext() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void swapAdapter(RecyclerView.AbstractC0594g<?> adapter, boolean removeAndRecycleExistingViews) {
        super.swapAdapter(adapter, removeAndRecycleExistingViews);
        clearRemovedAdapterAndCancelRunnable();
        updatePreloaders();
    }

    public final void withModels(Function1<? super AbstractC5128n, C10742u> buildModels) {
        C9768m.m32347g(buildModels, "buildModels");
        AbstractC5128n abstractC5128n = this.epoxyController;
        if (!(abstractC5128n instanceof WithModelsController)) {
            abstractC5128n = null;
        }
        WithModelsController withModelsController = (WithModelsController) abstractC5128n;
        if (withModelsController == null) {
            withModelsController = new WithModelsController();
            setController(withModelsController);
        }
        withModelsController.setCallback(buildModels);
        withModelsController.requestModelBuild();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EpoxyRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C9768m.m32347g(context, "context");
        this.spacingDecorator = new C5140r();
        this.removeAdapterWhenDetachedFromWindow = true;
        this.delayMsWhenRemovingAdapterOnDetach = DEFAULT_ADAPTER_REMOVAL_DELAY_MS;
        this.removeAdapterRunnable = new RunnableC5099e();
        this.preloadScrollListeners = new ArrayList();
        this.preloadConfigs = new ArrayList();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8739c.f33295G, i2, 0);
            setItemSpacingPx(obtainStyledAttributes.getDimensionPixelSize(C8739c.f33296H, 0));
            obtainStyledAttributes.recycle();
        }
        init();
    }
}
