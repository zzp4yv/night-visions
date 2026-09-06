package cm.aptoide.p092pt.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.aptoideviews.filters.Filter;
import cm.aptoide.aptoideviews.filters.Filter$$Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.parceler.C11137a;
import org.parceler.C11138b;
import org.parceler.InterfaceC11139c;
import org.parceler.ParcelerRuntimeException;

/* loaded from: classes.dex */
public class SearchViewModel$$Parcelable implements Parcelable, InterfaceC11139c<SearchViewModel> {
    public static final Parcelable.Creator<SearchViewModel$$Parcelable> CREATOR = new Parcelable.Creator<SearchViewModel$$Parcelable>() { // from class: cm.aptoide.pt.search.model.SearchViewModel$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchViewModel$$Parcelable createFromParcel(Parcel parcel) {
            return new SearchViewModel$$Parcelable(SearchViewModel$$Parcelable.read(parcel, new C11137a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SearchViewModel$$Parcelable[] newArray(int i2) {
            return new SearchViewModel$$Parcelable[i2];
        }
    };
    private SearchViewModel searchViewModel$$0;

    public SearchViewModel$$Parcelable(SearchViewModel searchViewModel) {
        this.searchViewModel$$0 = searchViewModel;
    }

    public static SearchViewModel read(Parcel parcel, C11137a c11137a) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        if (c11137a.m39861a(readInt)) {
            if (c11137a.m39864d(readInt)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return (SearchViewModel) c11137a.m39862b(readInt);
        }
        int m39867g = c11137a.m39867g();
        SearchViewModel searchViewModel = new SearchViewModel();
        c11137a.m39866f(m39867g, searchViewModel);
        searchViewModel.searchQueryModel = (SearchQueryModel) parcel.readParcelable(SearchViewModel$$Parcelable.class.getClassLoader());
        searchViewModel.storeName = parcel.readString();
        searchViewModel.onlyTrustedApps = parcel.readInt() == 1;
        C11138b.m39869b(SearchViewModel.class, searchViewModel, "storeTheme", parcel.readString());
        searchViewModel.loadedAds = parcel.readInt() == 1;
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i2 = 0; i2 < readInt2; i2++) {
                arrayList2.add(Filter$$Parcelable.read(parcel, c11137a));
            }
            arrayList = arrayList2;
        }
        searchViewModel.filters = arrayList;
        searchViewModel.loadedResults = parcel.readInt() == 1;
        c11137a.m39866f(readInt, searchViewModel);
        return searchViewModel;
    }

    public static void write(SearchViewModel searchViewModel, Parcel parcel, int i2, C11137a c11137a) {
        int m39863c = c11137a.m39863c(searchViewModel);
        if (m39863c != -1) {
            parcel.writeInt(m39863c);
            return;
        }
        parcel.writeInt(c11137a.m39865e(searchViewModel));
        parcel.writeParcelable(searchViewModel.searchQueryModel, i2);
        parcel.writeString(searchViewModel.storeName);
        parcel.writeInt(searchViewModel.onlyTrustedApps ? 1 : 0);
        parcel.writeString((String) C11138b.m39868a(String.class, SearchViewModel.class, searchViewModel, "storeTheme"));
        parcel.writeInt(searchViewModel.loadedAds ? 1 : 0);
        List<Filter> list = searchViewModel.filters;
        if (list == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(list.size());
            Iterator<Filter> it = searchViewModel.filters.iterator();
            while (it.hasNext()) {
                Filter$$Parcelable.write(it.next(), parcel, i2, c11137a);
            }
        }
        parcel.writeInt(searchViewModel.loadedResults ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.searchViewModel$$0, parcel, i2, new C11137a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.InterfaceC11139c
    public SearchViewModel getParcel() {
        return this.searchViewModel$$0;
    }
}
