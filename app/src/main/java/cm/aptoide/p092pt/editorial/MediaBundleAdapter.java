package cm.aptoide.p092pt.editorial;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1138R;
import java.util.List;
import p456rx.p473s.C11370b;

/* loaded from: classes.dex */
class MediaBundleAdapter extends RecyclerView.AbstractC0594g<MediaViewHolder> {
    private List<EditorialMedia> media;
    private C11370b<EditorialEvent> uiEventListener;

    public MediaBundleAdapter(List<EditorialMedia> list, C11370b<EditorialEvent> c11370b) {
        this.media = list;
        this.uiEventListener = c11370b;
    }

    public void add(List<EditorialMedia> list) {
        this.media.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        return this.media.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(MediaViewHolder mediaViewHolder, int i2) {
        mediaViewHolder.setVisibility(this.media.get(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public MediaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new MediaViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1138R.layout.media_layout, viewGroup, false), this.uiEventListener);
    }
}
