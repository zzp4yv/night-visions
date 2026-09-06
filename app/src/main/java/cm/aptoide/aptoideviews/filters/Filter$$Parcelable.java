package cm.aptoide.aptoideviews.filters;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C11137a;
import org.parceler.InterfaceC11139c;
import org.parceler.ParcelerRuntimeException;

/* loaded from: classes.dex */
public class Filter$$Parcelable implements Parcelable, InterfaceC11139c<Filter> {
    public static final Parcelable.Creator<Filter$$Parcelable> CREATOR = new Parcelable.Creator<Filter$$Parcelable>() { // from class: cm.aptoide.aptoideviews.filters.Filter$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Filter$$Parcelable createFromParcel(Parcel parcel) {
            return new Filter$$Parcelable(Filter$$Parcelable.read(parcel, new C11137a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Filter$$Parcelable[] newArray(int i2) {
            return new Filter$$Parcelable[i2];
        }
    };
    private Filter filter$$0;

    public Filter$$Parcelable(Filter filter) {
        this.filter$$0 = filter;
    }

    public static Filter read(Parcel parcel, C11137a c11137a) {
        int readInt = parcel.readInt();
        if (c11137a.m39861a(readInt)) {
            if (c11137a.m39864d(readInt)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return (Filter) c11137a.m39862b(readInt);
        }
        int m39867g = c11137a.m39867g();
        Filter filter = new Filter();
        c11137a.m39866f(m39867g, filter);
        filter.setId$aptoide_views_prodRelease(parcel.readInt());
        c11137a.m39866f(readInt, filter);
        return filter;
    }

    public static void write(Filter filter, Parcel parcel, int i2, C11137a c11137a) {
        int m39863c = c11137a.m39863c(filter);
        if (m39863c != -1) {
            parcel.writeInt(m39863c);
        } else {
            parcel.writeInt(c11137a.m39865e(filter));
            parcel.writeInt(filter.getId());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.filter$$0, parcel, i2, new C11137a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.InterfaceC11139c
    public Filter getParcel() {
        return this.filter$$0;
    }
}
