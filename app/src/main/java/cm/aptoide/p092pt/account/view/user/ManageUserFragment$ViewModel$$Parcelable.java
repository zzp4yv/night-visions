package cm.aptoide.p092pt.account.view.user;

import android.os.Parcel;
import android.os.Parcelable;
import cm.aptoide.p092pt.account.view.user.ManageUserFragment;
import org.parceler.C11137a;
import org.parceler.InterfaceC11139c;
import org.parceler.ParcelerRuntimeException;

/* loaded from: classes.dex */
public class ManageUserFragment$ViewModel$$Parcelable implements Parcelable, InterfaceC11139c<ManageUserFragment.ViewModel> {
    public static final Parcelable.Creator<ManageUserFragment$ViewModel$$Parcelable> CREATOR = new Parcelable.Creator<ManageUserFragment$ViewModel$$Parcelable>() { // from class: cm.aptoide.pt.account.view.user.ManageUserFragment$ViewModel$$Parcelable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ManageUserFragment$ViewModel$$Parcelable createFromParcel(Parcel parcel) {
            return new ManageUserFragment$ViewModel$$Parcelable(ManageUserFragment$ViewModel$$Parcelable.read(parcel, new C11137a()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ManageUserFragment$ViewModel$$Parcelable[] newArray(int i2) {
            return new ManageUserFragment$ViewModel$$Parcelable[i2];
        }
    };
    private ManageUserFragment.ViewModel viewModel$$0;

    public ManageUserFragment$ViewModel$$Parcelable(ManageUserFragment.ViewModel viewModel) {
        this.viewModel$$0 = viewModel;
    }

    public static ManageUserFragment.ViewModel read(Parcel parcel, C11137a c11137a) {
        int readInt = parcel.readInt();
        if (c11137a.m39861a(readInt)) {
            if (c11137a.m39864d(readInt)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return (ManageUserFragment.ViewModel) c11137a.m39862b(readInt);
        }
        int m39867g = c11137a.m39867g();
        ManageUserFragment.ViewModel viewModel = new ManageUserFragment.ViewModel();
        c11137a.m39866f(m39867g, viewModel);
        viewModel.hasNewPicture = parcel.readInt() == 1;
        viewModel.name = parcel.readString();
        viewModel.pictureUri = parcel.readString();
        c11137a.m39866f(readInt, viewModel);
        return viewModel;
    }

    public static void write(ManageUserFragment.ViewModel viewModel, Parcel parcel, int i2, C11137a c11137a) {
        int m39863c = c11137a.m39863c(viewModel);
        if (m39863c != -1) {
            parcel.writeInt(m39863c);
            return;
        }
        parcel.writeInt(c11137a.m39865e(viewModel));
        parcel.writeInt(viewModel.hasNewPicture ? 1 : 0);
        parcel.writeString(viewModel.name);
        parcel.writeString(viewModel.pictureUri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        write(this.viewModel$$0, parcel, i2, new C11137a());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.parceler.InterfaceC11139c
    public ManageUserFragment.ViewModel getParcel() {
        return this.viewModel$$0;
    }
}
