package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import p024c.p041e.C0870d;
import p241e.p242a.p243a.C8737a;

/* loaded from: classes.dex */
class ViewHolderState extends C0870d<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new C5101a();

    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new C5100a();

        /* renamed from: com.airbnb.epoxy.ViewHolderState$ViewState$a */
        static class C5100a implements Parcelable.ClassLoaderCreator<ViewState> {
            C5100a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ViewState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ViewState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray(classLoader), null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public ViewState[] newArray(int i2) {
                return new ViewState[i2];
            }
        }

        /* synthetic */ ViewState(int i2, int[] iArr, Parcelable[] parcelableArr, C5101a c5101a) {
            this(i2, iArr, parcelableArr);
        }

        /* renamed from: e */
        private void m9187e(View view) {
            if (view.getId() == -1) {
                view.setId(C8737a.f33287a);
            }
        }

        /* renamed from: b */
        public void m9188b(View view) {
            int id = view.getId();
            m9187e(view);
            view.restoreHierarchyState(this);
            view.setId(id);
        }

        /* renamed from: d */
        public void m9189d(View view) {
            int id = view.getId();
            m9187e(view);
            view.saveHierarchyState(this);
            view.setId(id);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = keyAt(i3);
                parcelableArr[i3] = valueAt(i3);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }

        ViewState() {
        }

        private ViewState(int i2, int[] iArr, Parcelable[] parcelableArr) {
            super(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                put(iArr[i3], parcelableArr[i3]);
            }
        }
    }

    /* renamed from: com.airbnb.epoxy.ViewHolderState$a */
    static class C5101a implements Parcelable.Creator<ViewHolderState> {
        C5101a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ViewHolderState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(readInt, null);
            for (int i2 = 0; i2 < readInt; i2++) {
                viewHolderState.m5442k(parcel.readLong(), (ViewState) parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ViewHolderState[] newArray(int i2) {
            return new ViewHolderState[i2];
        }
    }

    /* synthetic */ ViewHolderState(int i2, C5101a c5101a) {
        this(i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: p */
    public void m9185p(C5143u c5143u) {
        if (c5143u.m9364c().shouldSaveViewState()) {
            ViewState m5438g = m5438g(c5143u.getItemId());
            if (m5438g != null) {
                m5438g.m9188b(c5143u.itemView);
            } else {
                c5143u.m9366e();
            }
        }
    }

    /* renamed from: q */
    public void m9186q(C5143u c5143u) {
        if (c5143u.m9364c().shouldSaveViewState()) {
            ViewState m5438g = m5438g(c5143u.getItemId());
            if (m5438g == null) {
                m5438g = new ViewState();
            }
            m5438g.m9189d(c5143u.itemView);
            m5442k(c5143u.getItemId(), m5438g);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int m5445n = m5445n();
        parcel.writeInt(m5445n);
        for (int i3 = 0; i3 < m5445n; i3++) {
            parcel.writeLong(m5441j(i3));
            parcel.writeParcelable(m5446o(i3), 0);
        }
    }

    ViewHolderState() {
    }

    private ViewHolderState(int i2) {
        super(i2);
    }
}
