package cm.aptoide.p092pt.account.view.store;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.p092pt.themes.StoreTheme;
import org.parceler.C11137a;
import org.parceler.InterfaceC11139c;
import org.parceler.ParcelerRuntimeException;

/* loaded from: classes.dex */
public class ManageStoreViewModel$$Parcelable implements Parcelable, InterfaceC11139c<ManageStoreViewModel> {
    public static final Parcelable.Creator<ManageStoreViewModel$$Parcelable> CREATOR = new Parcelable.Creator<ManageStoreViewModel$$Parcelable>() { // from class: cm.aptoide.pt.account.view.store.ManageStoreViewModel$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ManageStoreViewModel$$Parcelable createFromParcel(Parcel parcel) {
            return new ManageStoreViewModel$$Parcelable(ManageStoreViewModel$$Parcelable.read(parcel, new C11137a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ManageStoreViewModel$$Parcelable[] newArray(int i2) {
            return new ManageStoreViewModel$$Parcelable[i2];
        }
    };
    private ManageStoreViewModel manageStoreViewModel$$0;

    public ManageStoreViewModel$$Parcelable(ManageStoreViewModel manageStoreViewModel) {
        this.manageStoreViewModel$$0 = manageStoreViewModel;
    }

    public static ManageStoreViewModel read(Parcel parcel, C11137a c11137a) {
        int readInt = parcel.readInt();
        if (c11137a.m39861a(readInt)) {
            if (c11137a.m39864d(readInt)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return (ManageStoreViewModel) c11137a.m39862b(readInt);
        }
        int m39867g = c11137a.m39867g();
        ManageStoreViewModel manageStoreViewModel = new ManageStoreViewModel();
        c11137a.m39866f(m39867g, manageStoreViewModel);
        manageStoreViewModel.storeDescription = parcel.readString();
        manageStoreViewModel.newAvatar = parcel.readInt() == 1;
        manageStoreViewModel.pictureUri = parcel.readString();
        manageStoreViewModel.storeName = parcel.readString();
        String readString = parcel.readString();
        manageStoreViewModel.storeTheme = readString == null ? null : (StoreTheme) Enum.valueOf(StoreTheme.class, readString);
        manageStoreViewModel.storeId = parcel.readLong();
        c11137a.m39866f(readInt, manageStoreViewModel);
        return manageStoreViewModel;
    }

    public static void write(ManageStoreViewModel manageStoreViewModel, Parcel parcel, int i2, C11137a c11137a) {
        int m39863c = c11137a.m39863c(manageStoreViewModel);
        if (m39863c != -1) {
            parcel.writeInt(m39863c);
            return;
        }
        parcel.writeInt(c11137a.m39865e(manageStoreViewModel));
        parcel.writeString(manageStoreViewModel.storeDescription);
        parcel.writeInt(manageStoreViewModel.newAvatar ? 1 : 0);
        parcel.writeString(manageStoreViewModel.pictureUri);
        parcel.writeString(manageStoreViewModel.storeName);
        StoreTheme storeTheme = manageStoreViewModel.storeTheme;
        parcel.writeString(storeTheme == null ? null : storeTheme.name());
        parcel.writeLong(manageStoreViewModel.storeId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.manageStoreViewModel$$0, parcel, i2, new C11137a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.InterfaceC11139c
    public ManageStoreViewModel getParcel() {
        return this.manageStoreViewModel$$0;
    }
}
