package cm.aptoide.p092pt.account.view.store;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.C1138R;
import cm.aptoide.p092pt.account.view.store.ThemeSelectorViewAdapter;
import cm.aptoide.p092pt.themes.StoreTheme;
import cm.aptoide.p092pt.themes.ThemeManager;
import java.util.List;
import p241e.p294g.p295a.p304c.C8942a;
import p241e.p294g.p306b.C8955c;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11205b;

/* loaded from: classes.dex */
public class ThemeSelectorViewAdapter extends RecyclerView.AbstractC0594g<ViewHolder> {
    private StoreTheme selectedStoreTheme;
    private final C8955c<StoreTheme> storeThemePublishRelay;
    private final ThemeManager themeManager;
    private final List<StoreTheme> themes;

    public static final class ViewHolder extends RecyclerView.AbstractC0590c0 {
        private static final int LAYOUT = 2131493121;
        private StoreTheme storeTheme;
        private ImageView storeThemeCheckMark;
        private ImageView storeThemeImage;
        private final C8955c<StoreTheme> storeThemePublishRelay;

        public ViewHolder(View view, C8955c<StoreTheme> c8955c) {
            super(view);
            this.storeThemePublishRelay = c8955c;
            bind(view);
        }

        private void bind(View view) {
            this.storeThemeImage = (ImageView) view.findViewById(C1138R.id.theme_color);
            this.storeThemeCheckMark = (ImageView) view.findViewById(C1138R.id.theme_checked);
            C8942a.m28573a(view).m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.account.view.store.d0
                @Override // p456rx.p460m.InterfaceC11205b
                public final void call(Object obj) {
                    ThemeSelectorViewAdapter.ViewHolder.this.m6948a((Void) obj);
                }
            }).m40056D0();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: lambda$bind$0, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void m6948a(Void r2) {
            this.storeThemePublishRelay.call(this.storeTheme);
        }

        public void update(StoreTheme storeTheme, StoreTheme storeTheme2, int i2) {
            this.storeTheme = storeTheme;
            this.storeThemeImage.setBackgroundResource(i2);
            if (storeTheme == storeTheme2) {
                this.storeThemeCheckMark.setVisibility(0);
            } else {
                this.storeThemeCheckMark.setVisibility(8);
            }
        }
    }

    public ThemeSelectorViewAdapter(C8955c<StoreTheme> c8955c, List<StoreTheme> list, ThemeManager themeManager) {
        this.storeThemePublishRelay = c8955c;
        this.themes = list;
        this.themeManager = themeManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public int getItemCount() {
        List<StoreTheme> list = this.themes;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public StoreTheme getSelectedTheme() {
        return this.selectedStoreTheme;
    }

    /* renamed from: selectTheme, reason: merged with bridge method [inline-methods] */
    public void m6947g(StoreTheme storeTheme) {
        this.selectedStoreTheme = storeTheme;
        notifyDataSetChanged();
    }

    public C11186e<StoreTheme> storeThemeSelection() {
        return this.storeThemePublishRelay.m40119x(new InterfaceC11205b() { // from class: cm.aptoide.pt.account.view.store.e0
            @Override // p456rx.p460m.InterfaceC11205b
            public final void call(Object obj) {
                ThemeSelectorViewAdapter.this.m6947g((StoreTheme) obj);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public void onBindViewHolder(ViewHolder viewHolder, int i2) {
        viewHolder.update(this.themes.get(i2), this.selectedStoreTheme, this.themeManager.getAttributeForTheme(this.themes.get(i2).getThemeName(), C1138R.attr.themeSelectorItemBackground).resourceId);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0594g
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1138R.layout.partial_store_theme_round_item, viewGroup, false), this.storeThemePublishRelay);
    }
}
