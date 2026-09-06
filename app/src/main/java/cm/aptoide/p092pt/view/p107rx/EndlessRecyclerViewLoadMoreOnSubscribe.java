package cm.aptoide.p092pt.view.p107rx;

import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.view.recycler.BaseAdapter;
import cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener;
import p456rx.AbstractC11197j;
import p456rx.C11186e;
import p456rx.p457l.AbstractC11199a;

/* loaded from: classes.dex */
public class EndlessRecyclerViewLoadMoreOnSubscribe implements C11186e.a<Integer> {
    private final BaseAdapter adapter;
    private final RecyclerView recyclerView;

    public EndlessRecyclerViewLoadMoreOnSubscribe(RecyclerView recyclerView, BaseAdapter baseAdapter) {
        this.recyclerView = recyclerView;
        this.adapter = baseAdapter;
    }

    @Override // p456rx.p460m.InterfaceC11205b
    public void call(final AbstractC11197j<? super Integer> abstractC11197j) {
        AbstractC11199a.verifyMainThread();
        final EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener = new EndlessRecyclerOnScrollListener(this.adapter) { // from class: cm.aptoide.pt.view.rx.EndlessRecyclerViewLoadMoreOnSubscribe.1
            @Override // cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener
            protected boolean hasMoreElements() {
                return true;
            }

            @Override // cm.aptoide.p092pt.view.recycler.EndlessRecyclerOnScrollListener
            public void onLoadMore(boolean z, boolean z2) {
                if (abstractC11197j.isUnsubscribed()) {
                    return;
                }
                abstractC11197j.onNext(Integer.valueOf(getAdapter().getItemCount()));
            }
        };
        this.recyclerView.addOnScrollListener(endlessRecyclerOnScrollListener);
        abstractC11197j.add(new AbstractC11199a() { // from class: cm.aptoide.pt.view.rx.EndlessRecyclerViewLoadMoreOnSubscribe.2
            @Override // p456rx.p457l.AbstractC11199a
            protected void onUnsubscribe() {
                EndlessRecyclerViewLoadMoreOnSubscribe.this.recyclerView.removeOnScrollListener(endlessRecyclerOnScrollListener);
            }
        });
    }
}
