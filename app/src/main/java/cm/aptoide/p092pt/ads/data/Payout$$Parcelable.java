package cm.aptoide.p092pt.ads.data;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C11137a;
import org.parceler.InterfaceC11139c;
import org.parceler.ParcelerRuntimeException;

/* loaded from: classes.dex */
public class Payout$$Parcelable implements Parcelable, InterfaceC11139c<Payout> {
    public static final Parcelable.Creator<Payout$$Parcelable> CREATOR = new Parcelable.Creator<Payout$$Parcelable>() { // from class: cm.aptoide.pt.ads.data.Payout$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Payout$$Parcelable createFromParcel(Parcel parcel) {
            return new Payout$$Parcelable(Payout$$Parcelable.read(parcel, new C11137a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Payout$$Parcelable[] newArray(int i2) {
            return new Payout$$Parcelable[i2];
        }
    };
    private Payout payout$$0;

    public Payout$$Parcelable(Payout payout) {
        this.payout$$0 = payout;
    }

    public static Payout read(Parcel parcel, C11137a c11137a) {
        int readInt = parcel.readInt();
        if (c11137a.m39861a(readInt)) {
            if (c11137a.m39864d(readInt)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return (Payout) c11137a.m39862b(readInt);
        }
        int m39867g = c11137a.m39867g();
        Payout payout = new Payout();
        c11137a.m39866f(m39867g, payout);
        payout.fiatAmount = parcel.readDouble();
        payout.fiatCurrency = parcel.readString();
        payout.fiatSymbol = parcel.readString();
        payout.appcAmount = parcel.readDouble();
        c11137a.m39866f(readInt, payout);
        return payout;
    }

    public static void write(Payout payout, Parcel parcel, int i2, C11137a c11137a) {
        int m39863c = c11137a.m39863c(payout);
        if (m39863c != -1) {
            parcel.writeInt(m39863c);
            return;
        }
        parcel.writeInt(c11137a.m39865e(payout));
        parcel.writeDouble(payout.fiatAmount);
        parcel.writeString(payout.fiatCurrency);
        parcel.writeString(payout.fiatSymbol);
        parcel.writeDouble(payout.appcAmount);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.payout$$0, parcel, i2, new C11137a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.InterfaceC11139c
    public Payout getParcel() {
        return this.payout$$0;
    }
}
