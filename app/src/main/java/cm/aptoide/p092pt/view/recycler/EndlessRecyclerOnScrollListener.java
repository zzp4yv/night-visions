package cm.aptoide.p092pt.view.recycler;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.dataprovider.interfaces.ErrorRequestListener;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7EndlessResponse;
import cm.aptoide.p092pt.dataprovider.model.p096v7.BaseV7Response;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.AbstractC2213V7;
import cm.aptoide.p092pt.dataprovider.p097ws.p101v7.Endless;
import cm.aptoide.p092pt.view.recycler.displayable.ProgressBarDisplayable;
import java.util.LinkedList;
import java.util.List;
import p456rx.InterfaceC11198k;
import p456rx.p457l.p459c.C11202a;
import p456rx.p460m.InterfaceC11204a;
import p456rx.p460m.InterfaceC11205b;

/* loaded from: classes.dex */
public class EndlessRecyclerOnScrollListener extends RecyclerView.AbstractC0607t {
    private final BaseAdapter adapter;
    private final boolean bypassCache;
    private final boolean bypassServerCache;
    private boolean endCallbackCalled;
    private final ErrorRequestListener errorRequestListener;
    private boolean firstCallbackCalled;
    private int firstVisibleItem;
    private int lastTotal;
    private boolean loading;
    private final MultiLangPatch multiLangPatch;
    private int offset;
    private InterfaceC11204a onEndOfListReachedListener;
    private final List<OnEndlessFinish> onEndlessFinishList;
    private BooleanAction onFirstLoadListener;
    private RecyclerViewPositionHelper recyclerViewPositionHelper;
    private boolean stableData;
    private InterfaceC11198k subscription;
    private InterfaceC11205b successRequestListener;
    private int total;
    private int totalItemCount;
    private AbstractC2213V7<? extends BaseV7EndlessResponse, ? extends Endless> v7request;
    private int visibleItemCount;
    private final int visibleThreshold;

    public interface BooleanAction<T extends BaseV7Response> {
        boolean call(T t);
    }

    public interface OnEndlessFinish {
        void onEndlessFinish(EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends BaseV7EndlessResponse> EndlessRecyclerOnScrollListener(BaseAdapter baseAdapter, AbstractC2213V7<T, ? extends Endless> abstractC2213V7, InterfaceC11205b<T> interfaceC11205b, ErrorRequestListener errorRequestListener) {
        this.stableData = false;
        this.adapter = baseAdapter;
        this.v7request = abstractC2213V7;
        this.successRequestListener = interfaceC11205b;
        this.errorRequestListener = errorRequestListener;
        this.visibleThreshold = 6;
        this.bypassCache = false;
        this.onFirstLoadListener = null;
        this.onEndOfListReachedListener = null;
        this.endCallbackCalled = false;
        this.firstCallbackCalled = false;
        this.multiLangPatch = new MultiLangPatch();
        this.onEndlessFinishList = new LinkedList();
        this.bypassServerCache = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleLoadMoreErrorAfterWebRequest(Throwable th) {
        th.printStackTrace();
        popProgressBarDisplayable();
        this.errorRequestListener.onError(th);
        this.loading = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleLoadMoreResponseAfterWebRequest, reason: merged with bridge method [inline-methods] */
    public void m9003c(boolean z, BaseV7EndlessResponse baseV7EndlessResponse) {
        if (baseV7EndlessResponse.hasData()) {
            boolean hasStableTotal = baseV7EndlessResponse.hasStableTotal();
            this.stableData = hasStableTotal;
            if (hasStableTotal) {
                this.total = baseV7EndlessResponse.getTotal();
                this.offset = baseV7EndlessResponse.getNextSize();
            } else {
                int i2 = this.total;
                int total = baseV7EndlessResponse.getTotal();
                this.lastTotal = total;
                this.total = i2 + total;
                this.offset += baseV7EndlessResponse.getNextSize();
            }
            this.v7request.getBody().setOffset(this.offset);
        }
        BooleanAction booleanAction = this.onFirstLoadListener;
        if (booleanAction == null || this.firstCallbackCalled) {
            this.successRequestListener.call(baseV7EndlessResponse);
        } else {
            if (!booleanAction.call(baseV7EndlessResponse)) {
                this.successRequestListener.call(baseV7EndlessResponse);
            }
            this.firstCallbackCalled = true;
        }
        this.loading = false;
        RecyclerViewPositionHelper recyclerViewPositionHelper = this.recyclerViewPositionHelper;
        if (recyclerViewPositionHelper != null) {
            this.totalItemCount = recyclerViewPositionHelper.getItemCount();
        }
        if (!hasMoreElements()) {
            InterfaceC11204a interfaceC11204a = this.onEndOfListReachedListener;
            if (interfaceC11204a != null && !this.endCallbackCalled) {
                interfaceC11204a.call();
                this.endCallbackCalled = true;
            }
            List<OnEndlessFinish> list = this.onEndlessFinishList;
            if (list != null) {
                for (OnEndlessFinish onEndlessFinish : list) {
                    if (onEndlessFinish != null) {
                        onEndlessFinish.onEndlessFinish(this);
                    }
                }
            }
        }
        if (shouldLoadMore()) {
            onLoadMore(z, this.bypassServerCache);
        }
    }

    private boolean isNearTheEndOfTheList() {
        return this.totalItemCount - this.visibleItemCount < (this.firstVisibleItem + this.visibleThreshold) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$onLoadMore$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m9002b(BaseV7EndlessResponse baseV7EndlessResponse) {
        popProgressBarDisplayable();
        this.multiLangPatch.updateTotal(baseV7EndlessResponse);
    }

    private void popProgressBarDisplayable() {
        if (this.adapter.getItemCount() > 0) {
            if (this.adapter.getDisplayable(r0.getItemCount() - 1) instanceof ProgressBarDisplayable) {
                this.adapter.popDisplayable();
            }
        }
    }

    private boolean shouldLoadMore() {
        RecyclerViewPositionHelper recyclerViewPositionHelper;
        return !this.loading && (recyclerViewPositionHelper = this.recyclerViewPositionHelper) != null && recyclerViewPositionHelper.recyclerView.isAttachedToWindow() && isNearTheEndOfTheList() && hasMoreElements();
    }

    public void addOnEndlessFinishListener(OnEndlessFinish onEndlessFinish) {
        this.onEndlessFinishList.add(onEndlessFinish);
    }

    public BaseAdapter getAdapter() {
        return this.adapter;
    }

    protected boolean hasMoreElements() {
        if (this.stableData) {
            if (this.offset < this.total) {
                return true;
            }
        } else if (this.lastTotal != 0) {
            return true;
        }
        return false;
    }

    public void onLoadMore(final boolean z, boolean z2) {
        if (this.loading) {
            return;
        }
        this.loading = true;
        this.adapter.addDisplayable(new ProgressBarDisplayable());
        AbstractC2213V7<? extends BaseV7EndlessResponse, ? extends Endless> abstractC2213V7 = this.v7request;
        if (abstractC2213V7 != null) {
            this.subscription = abstractC2213V7.observe(z, z2).m40095j0(C11202a.m40156b()).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.recycler.i
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    EndlessRecyclerOnScrollListener.this.m9002b((BaseV7EndlessResponse) obj);
                }
            }).m40063H0(new InterfaceC11205b() { // from class: cm.aptoide.pt.view.recycler.j
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    EndlessRecyclerOnScrollListener.this.m9003c(z, (BaseV7EndlessResponse) obj);
                }
            }, new InterfaceC11205b() { // from class: cm.aptoide.pt.view.recycler.h
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    EndlessRecyclerOnScrollListener.this.handleLoadMoreErrorAfterWebRequest((Throwable) obj);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0607t
    public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        super.onScrolled(recyclerView, i2, i3);
        if (this.recyclerViewPositionHelper == null) {
            this.recyclerViewPositionHelper = RecyclerViewPositionHelper.createHelper(recyclerView);
        }
        this.visibleItemCount = recyclerView.getChildCount();
        int findFirstVisibleItemPosition = this.recyclerViewPositionHelper.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1) {
            findFirstVisibleItemPosition = 0;
        }
        this.firstVisibleItem = findFirstVisibleItemPosition;
        if (shouldLoadMore()) {
            onLoadMore(this.bypassCache, this.bypassServerCache);
        }
    }

    public void removeListeners() {
        this.onFirstLoadListener = null;
        this.onEndOfListReachedListener = null;
        this.successRequestListener = null;
    }

    public void reset(AbstractC2213V7<? extends BaseV7EndlessResponse, ? extends Endless> abstractC2213V7) {
        this.v7request = abstractC2213V7;
        this.multiLangPatch.updateOffset();
        this.offset = -1;
        this.total = 0;
    }

    public void stopLoading() {
        InterfaceC11198k interfaceC11198k = this.subscription;
        if (interfaceC11198k != null && !interfaceC11198k.isUnsubscribed()) {
            this.subscription.unsubscribe();
        }
        popProgressBarDisplayable();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends BaseV7EndlessResponse> EndlessRecyclerOnScrollListener(BaseAdapter baseAdapter, AbstractC2213V7<T, ? extends Endless> abstractC2213V7, InterfaceC11205b<T> interfaceC11205b, ErrorRequestListener errorRequestListener, int i2, boolean z, BooleanAction<T> booleanAction, InterfaceC11204a interfaceC11204a) {
        this.stableData = false;
        this.multiLangPatch = new MultiLangPatch();
        this.onEndlessFinishList = new LinkedList();
        this.adapter = baseAdapter;
        this.v7request = abstractC2213V7;
        this.successRequestListener = interfaceC11205b;
        this.errorRequestListener = errorRequestListener;
        this.visibleThreshold = i2;
        this.bypassCache = z;
        this.onFirstLoadListener = booleanAction;
        this.onEndOfListReachedListener = interfaceC11204a;
        this.endCallbackCalled = false;
        this.firstCallbackCalled = false;
        this.bypassServerCache = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends BaseV7EndlessResponse> EndlessRecyclerOnScrollListener(BaseAdapter baseAdapter, AbstractC2213V7<T, ? extends Endless> abstractC2213V7, InterfaceC11205b<T> interfaceC11205b, ErrorRequestListener errorRequestListener, boolean z, boolean z2) {
        this.stableData = false;
        this.adapter = baseAdapter;
        this.v7request = abstractC2213V7;
        this.successRequestListener = interfaceC11205b;
        this.errorRequestListener = errorRequestListener;
        this.bypassServerCache = z2;
        this.visibleThreshold = 6;
        this.bypassCache = z;
        this.onFirstLoadListener = null;
        this.onEndOfListReachedListener = null;
        this.endCallbackCalled = false;
        this.firstCallbackCalled = false;
        this.multiLangPatch = new MultiLangPatch();
        this.onEndlessFinishList = new LinkedList();
    }

    public EndlessRecyclerOnScrollListener(BaseAdapter baseAdapter) {
        this.stableData = false;
        this.adapter = baseAdapter;
        this.v7request = null;
        this.successRequestListener = null;
        this.errorRequestListener = null;
        this.visibleThreshold = 0;
        this.bypassCache = false;
        this.onFirstLoadListener = null;
        this.onEndOfListReachedListener = null;
        this.endCallbackCalled = false;
        this.firstCallbackCalled = false;
        this.multiLangPatch = new MultiLangPatch();
        this.onEndlessFinishList = new LinkedList();
        this.bypassServerCache = false;
    }
}
