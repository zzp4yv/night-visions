package org.parceler;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import org.parceler.C11140d;
import org.parceler.p455g.AbstractC11143a;
import org.parceler.p455g.AbstractC11146d;
import org.parceler.p455g.AbstractC11147e;
import org.parceler.p455g.AbstractC11148f;
import org.parceler.p455g.AbstractC11149g;
import org.parceler.p455g.AbstractC11150h;
import org.parceler.p455g.AbstractC11151i;
import org.parceler.p455g.AbstractC11153k;
import org.parceler.p455g.AbstractC11154l;
import org.parceler.p455g.AbstractC11155m;
import org.parceler.p455g.AbstractC11156n;
import org.parceler.p455g.C11144b;
import org.parceler.p455g.C11145c;

/* loaded from: classes3.dex */
final class NonParcelRepository implements InterfaceC11141e<C11140d.c> {

    /* renamed from: a */
    private static final NonParcelRepository f41962a = new NonParcelRepository();

    /* renamed from: b */
    private final Map<Class, C11140d.c> f41963b;

    public static final class BooleanArrayParcelable extends ConverterParcelable<boolean[]> {

        /* renamed from: h */
        private static final C11144b f41964h = new C11144b();
        public static final C11067a CREATOR = new C11067a();

        /* renamed from: org.parceler.NonParcelRepository$BooleanArrayParcelable$a */
        private static final class C11067a implements Parcelable.Creator<BooleanArrayParcelable> {
            private C11067a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new BooleanArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BooleanArrayParcelable[] newArray(int i2) {
                return new BooleanArrayParcelable[i2];
            }
        }

        public BooleanArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41964h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public BooleanArrayParcelable(boolean[] zArr) {
            super(zArr, f41964h);
        }
    }

    public static final class BooleanParcelable extends ConverterParcelable<Boolean> {

        /* renamed from: h */
        private static final AbstractC11153k<Boolean> f41965h = new C11068a();
        public static final C11069b CREATOR = new C11069b();

        /* renamed from: org.parceler.NonParcelRepository$BooleanParcelable$a */
        static class C11068a extends AbstractC11153k<Boolean> {
            C11068a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Boolean mo39757c(Parcel parcel) {
                return Boolean.valueOf(parcel.createBooleanArray()[0]);
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Boolean bool, Parcel parcel) {
                parcel.writeBooleanArray(new boolean[]{bool.booleanValue()});
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$BooleanParcelable$b */
        private static final class C11069b implements Parcelable.Creator<BooleanParcelable> {
            private C11069b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public BooleanParcelable createFromParcel(Parcel parcel) {
                return new BooleanParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public BooleanParcelable[] newArray(int i2) {
                return new BooleanParcelable[i2];
            }
        }

        public BooleanParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41965h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public BooleanParcelable(boolean z) {
            super(Boolean.valueOf(z), f41965h);
        }
    }

    public static final class ByteArrayParcelable extends ConverterParcelable<byte[]> {

        /* renamed from: h */
        private static final AbstractC11153k<byte[]> f41966h = new C11070a();
        public static final C11071b CREATOR = new C11071b();

        /* renamed from: org.parceler.NonParcelRepository$ByteArrayParcelable$a */
        static class C11070a extends AbstractC11153k<byte[]> {
            C11070a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public byte[] mo39757c(Parcel parcel) {
                return parcel.createByteArray();
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(byte[] bArr, Parcel parcel) {
                parcel.writeByteArray(bArr);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ByteArrayParcelable$b */
        private static final class C11071b implements Parcelable.Creator<ByteArrayParcelable> {
            private C11071b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ByteArrayParcelable createFromParcel(Parcel parcel) {
                return new ByteArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteArrayParcelable[] newArray(int i2) {
                return new ByteArrayParcelable[i2];
            }
        }

        public ByteArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41966h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public ByteArrayParcelable(byte[] bArr) {
            super(bArr, f41966h);
        }
    }

    public static final class ByteParcelable extends ConverterParcelable<Byte> {

        /* renamed from: h */
        private static final AbstractC11153k<Byte> f41967h = new C11072a();
        public static final C11073b CREATOR = new C11073b();

        /* renamed from: org.parceler.NonParcelRepository$ByteParcelable$a */
        static class C11072a extends AbstractC11153k<Byte> {
            C11072a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Byte mo39757c(Parcel parcel) {
                return Byte.valueOf(parcel.readByte());
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Byte b2, Parcel parcel) {
                parcel.writeByte(b2.byteValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ByteParcelable$b */
        private static final class C11073b implements Parcelable.Creator<ByteParcelable> {
            private C11073b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ByteParcelable createFromParcel(Parcel parcel) {
                return new ByteParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ByteParcelable[] newArray(int i2) {
                return new ByteParcelable[i2];
            }
        }

        public ByteParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41967h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public ByteParcelable(Byte b2) {
            super(b2, f41967h);
        }
    }

    public static final class CharArrayParcelable extends ConverterParcelable<char[]> {

        /* renamed from: h */
        private static final C11145c f41968h = new C11145c();
        public static final C11074a CREATOR = new C11074a();

        /* renamed from: org.parceler.NonParcelRepository$CharArrayParcelable$a */
        private static final class C11074a implements Parcelable.Creator<CharArrayParcelable> {
            private C11074a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharArrayParcelable createFromParcel(Parcel parcel) {
                return new CharArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CharArrayParcelable[] newArray(int i2) {
                return new CharArrayParcelable[i2];
            }
        }

        public CharArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41968h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public CharArrayParcelable(char[] cArr) {
            super(cArr, f41968h);
        }
    }

    public static final class CharacterParcelable extends ConverterParcelable<Character> {

        /* renamed from: h */
        private static final AbstractC11153k<Character> f41969h = new C11075a();
        public static final C11076b CREATOR = new C11076b();

        /* renamed from: org.parceler.NonParcelRepository$CharacterParcelable$a */
        static class C11075a extends AbstractC11153k<Character> {
            C11075a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Character mo39757c(Parcel parcel) {
                return Character.valueOf(parcel.createCharArray()[0]);
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Character ch, Parcel parcel) {
                parcel.writeCharArray(new char[]{ch.charValue()});
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$CharacterParcelable$b */
        private static final class C11076b implements Parcelable.Creator<CharacterParcelable> {
            private C11076b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CharacterParcelable createFromParcel(Parcel parcel) {
                return new CharacterParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CharacterParcelable[] newArray(int i2) {
                return new CharacterParcelable[i2];
            }
        }

        public CharacterParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41969h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public CharacterParcelable(Character ch) {
            super(ch, f41969h);
        }
    }

    public static final class CollectionParcelable extends ConverterParcelable<Collection> {

        /* renamed from: h */
        private static final AbstractC11146d f41970h = new C11077a();
        public static final C11078b CREATOR = new C11078b();

        /* renamed from: org.parceler.NonParcelRepository$CollectionParcelable$a */
        static class C11077a extends AbstractC11143a {
            C11077a() {
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(CollectionParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$CollectionParcelable$b */
        private static final class C11078b implements Parcelable.Creator<CollectionParcelable> {
            private C11078b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CollectionParcelable createFromParcel(Parcel parcel) {
                return new CollectionParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CollectionParcelable[] newArray(int i2) {
                return new CollectionParcelable[i2];
            }
        }

        public CollectionParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41970h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public CollectionParcelable(Collection collection) {
            super(collection, f41970h);
        }
    }

    public static final class DoubleParcelable extends ConverterParcelable<Double> {

        /* renamed from: h */
        private static final AbstractC11153k<Double> f41973h = new C11079a();
        public static final C11080b CREATOR = new C11080b();

        /* renamed from: org.parceler.NonParcelRepository$DoubleParcelable$a */
        static class C11079a extends AbstractC11153k<Double> {
            C11079a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Double mo39757c(Parcel parcel) {
                return Double.valueOf(parcel.readDouble());
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Double d2, Parcel parcel) {
                parcel.writeDouble(d2.doubleValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$DoubleParcelable$b */
        private static final class C11080b implements Parcelable.Creator<DoubleParcelable> {
            private C11080b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public DoubleParcelable createFromParcel(Parcel parcel) {
                return new DoubleParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public DoubleParcelable[] newArray(int i2) {
                return new DoubleParcelable[i2];
            }
        }

        public DoubleParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41973h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public DoubleParcelable(Double d2) {
            super(d2, f41973h);
        }
    }

    public static final class FloatParcelable extends ConverterParcelable<Float> {

        /* renamed from: h */
        private static final AbstractC11153k<Float> f41974h = new C11081a();
        public static final C11082b CREATOR = new C11082b();

        /* renamed from: org.parceler.NonParcelRepository$FloatParcelable$a */
        static class C11081a extends AbstractC11153k<Float> {
            C11081a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Float mo39757c(Parcel parcel) {
                return Float.valueOf(parcel.readFloat());
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Float f2, Parcel parcel) {
                parcel.writeFloat(f2.floatValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$FloatParcelable$b */
        private static final class C11082b implements Parcelable.Creator<FloatParcelable> {
            private C11082b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public FloatParcelable createFromParcel(Parcel parcel) {
                return new FloatParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public FloatParcelable[] newArray(int i2) {
                return new FloatParcelable[i2];
            }
        }

        public FloatParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41974h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public FloatParcelable(Float f2) {
            super(f2, f41974h);
        }
    }

    public static final class IBinderParcelable extends ConverterParcelable<IBinder> {

        /* renamed from: h */
        private static final AbstractC11153k<IBinder> f41975h = new C11083a();
        public static final C11084b CREATOR = new C11084b();

        /* renamed from: org.parceler.NonParcelRepository$IBinderParcelable$a */
        static class C11083a extends AbstractC11153k<IBinder> {
            C11083a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public IBinder mo39757c(Parcel parcel) {
                return parcel.readStrongBinder();
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(IBinder iBinder, Parcel parcel) {
                parcel.writeStrongBinder(iBinder);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$IBinderParcelable$b */
        private static final class C11084b implements Parcelable.Creator<IBinderParcelable> {
            private C11084b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public IBinderParcelable createFromParcel(Parcel parcel) {
                return new IBinderParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public IBinderParcelable[] newArray(int i2) {
                return new IBinderParcelable[i2];
            }
        }

        public IBinderParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41975h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public IBinderParcelable(IBinder iBinder) {
            super(iBinder, f41975h);
        }
    }

    public static final class IntegerParcelable extends ConverterParcelable<Integer> {

        /* renamed from: h */
        private static final AbstractC11153k<Integer> f41976h = new C11085a();
        public static final C11086b CREATOR = new C11086b();

        /* renamed from: org.parceler.NonParcelRepository$IntegerParcelable$a */
        static class C11085a extends AbstractC11153k<Integer> {
            C11085a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Integer mo39757c(Parcel parcel) {
                return Integer.valueOf(parcel.readInt());
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Integer num, Parcel parcel) {
                parcel.writeInt(num.intValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$IntegerParcelable$b */
        private static final class C11086b implements Parcelable.Creator<IntegerParcelable> {
            private C11086b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public IntegerParcelable createFromParcel(Parcel parcel) {
                return new IntegerParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public IntegerParcelable[] newArray(int i2) {
                return new IntegerParcelable[i2];
            }
        }

        public IntegerParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41976h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public IntegerParcelable(Integer num) {
            super(num, f41976h);
        }
    }

    public static final class LinkedHashMapParcelable extends ConverterParcelable<LinkedHashMap> {

        /* renamed from: h */
        private static final AbstractC11149g f41977h = new C11087a();
        public static final C11088b CREATOR = new C11088b();

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashMapParcelable$a */
        static class C11087a extends AbstractC11149g {
            C11087a() {
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: e */
            public Object mo39797e(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: f */
            public void mo39798f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: g */
            public Object mo39799g(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: h */
            public void mo39800h(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashMapParcelable$b */
        private static final class C11088b implements Parcelable.Creator<LinkedHashMapParcelable> {
            private C11088b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LinkedHashMapParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashMapParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LinkedHashMapParcelable[] newArray(int i2) {
                return new LinkedHashMapParcelable[i2];
            }
        }

        public LinkedHashMapParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41977h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LinkedHashMapParcelable(LinkedHashMap linkedHashMap) {
            super(linkedHashMap, f41977h);
        }
    }

    public static final class LinkedHashSetParcelable extends ConverterParcelable<LinkedHashSet> {

        /* renamed from: h */
        private static final AbstractC11150h f41978h = new C11089a();
        public static final C11090b CREATOR = new C11090b();

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashSetParcelable$a */
        static class C11089a extends AbstractC11150h {
            C11089a() {
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(LinkedHashSetParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedHashSetParcelable$b */
        private static final class C11090b implements Parcelable.Creator<LinkedHashSetParcelable> {
            private C11090b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LinkedHashSetParcelable createFromParcel(Parcel parcel) {
                return new LinkedHashSetParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LinkedHashSetParcelable[] newArray(int i2) {
                return new LinkedHashSetParcelable[i2];
            }
        }

        public LinkedHashSetParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41978h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LinkedHashSetParcelable(LinkedHashSet linkedHashSet) {
            super(linkedHashSet, f41978h);
        }
    }

    public static final class LinkedListParcelable extends ConverterParcelable<LinkedList> {

        /* renamed from: h */
        private static final AbstractC11151i f41979h = new C11091a();
        public static final C11092b CREATOR = new C11092b();

        /* renamed from: org.parceler.NonParcelRepository$LinkedListParcelable$a */
        static class C11091a extends AbstractC11151i {
            C11091a() {
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(LinkedListParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LinkedListParcelable$b */
        private static final class C11092b implements Parcelable.Creator<LinkedListParcelable> {
            private C11092b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LinkedListParcelable createFromParcel(Parcel parcel) {
                return new LinkedListParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LinkedListParcelable[] newArray(int i2) {
                return new LinkedListParcelable[i2];
            }
        }

        public LinkedListParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41979h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LinkedListParcelable(LinkedList linkedList) {
            super(linkedList, f41979h);
        }
    }

    public static final class ListParcelable extends ConverterParcelable<List> {

        /* renamed from: h */
        private static final AbstractC11143a f41980h = new C11093a();
        public static final C11094b CREATOR = new C11094b();

        /* renamed from: org.parceler.NonParcelRepository$ListParcelable$a */
        static class C11093a extends AbstractC11143a {
            C11093a() {
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(ListParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$ListParcelable$b */
        private static final class C11094b implements Parcelable.Creator<ListParcelable> {
            private C11094b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ListParcelable createFromParcel(Parcel parcel) {
                return new ListParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ListParcelable[] newArray(int i2) {
                return new ListParcelable[i2];
            }
        }

        public ListParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41980h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public ListParcelable(List list) {
            super(list, f41980h);
        }
    }

    public static final class LongParcelable extends ConverterParcelable<Long> {

        /* renamed from: h */
        private static final AbstractC11153k<Long> f41981h = new C11095a();
        public static final C11096b CREATOR = new C11096b();

        /* renamed from: org.parceler.NonParcelRepository$LongParcelable$a */
        static class C11095a extends AbstractC11153k<Long> {
            C11095a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public Long mo39757c(Parcel parcel) {
                return Long.valueOf(parcel.readLong());
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(Long l, Parcel parcel) {
                parcel.writeLong(l.longValue());
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$LongParcelable$b */
        private static final class C11096b implements Parcelable.Creator<LongParcelable> {
            private C11096b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public LongParcelable createFromParcel(Parcel parcel) {
                return new LongParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public LongParcelable[] newArray(int i2) {
                return new LongParcelable[i2];
            }
        }

        public LongParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41981h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public LongParcelable(Long l) {
            super(l, f41981h);
        }
    }

    public static final class MapParcelable extends ConverterParcelable<Map> {

        /* renamed from: h */
        private static final AbstractC11147e f41982h = new C11097a();
        public static final C11098b CREATOR = new C11098b();

        /* renamed from: org.parceler.NonParcelRepository$MapParcelable$a */
        static class C11097a extends AbstractC11147e {
            C11097a() {
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: e */
            public Object mo39797e(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: f */
            public void mo39798f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: g */
            public Object mo39799g(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: h */
            public void mo39800h(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$MapParcelable$b */
        private static final class C11098b implements Parcelable.Creator<MapParcelable> {
            private C11098b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MapParcelable createFromParcel(Parcel parcel) {
                return new MapParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MapParcelable[] newArray(int i2) {
                return new MapParcelable[i2];
            }
        }

        public MapParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41982h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public MapParcelable(Map map) {
            super(map, f41982h);
        }
    }

    public static final class SetParcelable extends ConverterParcelable<Set> {

        /* renamed from: h */
        private static final AbstractC11148f f41984h = new C11100a();
        public static final C11101b CREATOR = new C11101b();

        /* renamed from: org.parceler.NonParcelRepository$SetParcelable$a */
        static class C11100a extends AbstractC11148f {
            C11100a() {
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(SetParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SetParcelable$b */
        private static final class C11101b implements Parcelable.Creator<SetParcelable> {
            private C11101b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SetParcelable createFromParcel(Parcel parcel) {
                return new SetParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SetParcelable[] newArray(int i2) {
                return new SetParcelable[i2];
            }
        }

        public SetParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41984h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public SetParcelable(Set set) {
            super(set, f41984h);
        }
    }

    public static final class SparseArrayParcelable extends ConverterParcelable<SparseArray> {

        /* renamed from: h */
        private static final AbstractC11154l f41985h = new C11102a();
        public static final C11103b CREATOR = new C11103b();

        /* renamed from: org.parceler.NonParcelRepository$SparseArrayParcelable$a */
        static class C11102a extends AbstractC11154l {
            C11102a() {
            }

            @Override // org.parceler.p455g.AbstractC11154l
            /* renamed from: d */
            public Object mo39820d(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(SparseArrayParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11154l
            /* renamed from: e */
            public void mo39821e(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SparseArrayParcelable$b */
        private static final class C11103b implements Parcelable.Creator<SparseArrayParcelable> {
            private C11103b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SparseArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SparseArrayParcelable[] newArray(int i2) {
                return new SparseArrayParcelable[i2];
            }
        }

        public SparseArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41985h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public SparseArrayParcelable(SparseArray sparseArray) {
            super(sparseArray, f41985h);
        }
    }

    public static final class SparseBooleanArrayParcelable extends ConverterParcelable<SparseBooleanArray> {

        /* renamed from: h */
        private static final AbstractC11153k<SparseBooleanArray> f41986h = new C11104a();
        public static final C11105b CREATOR = new C11105b();

        /* renamed from: org.parceler.NonParcelRepository$SparseBooleanArrayParcelable$a */
        static class C11104a extends AbstractC11153k<SparseBooleanArray> {
            C11104a() {
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public SparseBooleanArray mo39757c(Parcel parcel) {
                return parcel.readSparseBooleanArray();
            }

            @Override // org.parceler.p455g.AbstractC11153k
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public void mo39758d(SparseBooleanArray sparseBooleanArray, Parcel parcel) {
                parcel.writeSparseBooleanArray(sparseBooleanArray);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$SparseBooleanArrayParcelable$b */
        private static final class C11105b implements Parcelable.Creator<SparseBooleanArrayParcelable> {
            private C11105b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SparseBooleanArrayParcelable createFromParcel(Parcel parcel) {
                return new SparseBooleanArrayParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SparseBooleanArrayParcelable[] newArray(int i2) {
                return new SparseBooleanArrayParcelable[i2];
            }
        }

        public SparseBooleanArrayParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41986h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public SparseBooleanArrayParcelable(SparseBooleanArray sparseBooleanArray) {
            super(sparseBooleanArray, f41986h);
        }
    }

    public static final class TreeMapParcelable extends ConverterParcelable<Map> {

        /* renamed from: h */
        private static final AbstractC11155m f41988h = new C11107a();
        public static final C11108b CREATOR = new C11108b();

        /* renamed from: org.parceler.NonParcelRepository$TreeMapParcelable$a */
        static class C11107a extends AbstractC11155m {
            C11107a() {
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: e */
            public Object mo39797e(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: f */
            public void mo39798f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: g */
            public Object mo39799g(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(MapParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11152j
            /* renamed from: h */
            public void mo39800h(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$TreeMapParcelable$b */
        private static final class C11108b implements Parcelable.Creator<TreeMapParcelable> {
            private C11108b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TreeMapParcelable createFromParcel(Parcel parcel) {
                return new TreeMapParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public TreeMapParcelable[] newArray(int i2) {
                return new TreeMapParcelable[i2];
            }
        }

        public TreeMapParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41988h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public TreeMapParcelable(Map map) {
            super(map, f41988h);
        }
    }

    public static final class TreeSetParcelable extends ConverterParcelable<Set> {

        /* renamed from: h */
        private static final AbstractC11156n f41989h = new C11109a();
        public static final C11110b CREATOR = new C11110b();

        /* renamed from: org.parceler.NonParcelRepository$TreeSetParcelable$a */
        static class C11109a extends AbstractC11156n {
            C11109a() {
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: e */
            public Object mo39777e(Parcel parcel) {
                return C11140d.m39873a(parcel.readParcelable(TreeSetParcelable.class.getClassLoader()));
            }

            @Override // org.parceler.p455g.AbstractC11146d
            /* renamed from: f */
            public void mo39778f(Object obj, Parcel parcel) {
                parcel.writeParcelable(C11140d.m39875c(obj), 0);
            }
        }

        /* renamed from: org.parceler.NonParcelRepository$TreeSetParcelable$b */
        private static final class C11110b implements Parcelable.Creator<TreeSetParcelable> {
            private C11110b() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TreeSetParcelable createFromParcel(Parcel parcel) {
                return new TreeSetParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public TreeSetParcelable[] newArray(int i2) {
                return new TreeSetParcelable[i2];
            }
        }

        public TreeSetParcelable(Parcel parcel) {
            super(parcel, (InterfaceC11142f) f41989h);
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ int describeContents() {
            return super.describeContents();
        }

        @Override // org.parceler.NonParcelRepository.ConverterParcelable, android.os.Parcelable
        public /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
        }

        public TreeSetParcelable(Set set) {
            super(set, f41989h);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$b */
    private static class C11112b implements C11140d.c<boolean[]> {
        private C11112b() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(boolean[] zArr) {
            return new BooleanArrayParcelable(zArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$c */
    private static class C11113c implements C11140d.c<Boolean> {
        private C11113c() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Boolean bool) {
            return new BooleanParcelable(bool.booleanValue());
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$d */
    private static class C11114d implements C11140d.c<Bundle> {
        private C11114d() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Bundle bundle) {
            return bundle;
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$e */
    private static class C11115e implements C11140d.c<byte[]> {
        private C11115e() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(byte[] bArr) {
            return new ByteArrayParcelable(bArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$f */
    private static class C11116f implements C11140d.c<Byte> {
        private C11116f() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Byte b2) {
            return new ByteParcelable(b2);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$g */
    private static class C11117g implements C11140d.c<char[]> {
        private C11117g() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(char[] cArr) {
            return new CharArrayParcelable(cArr);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$h */
    private static class C11118h implements C11140d.c<Character> {
        private C11118h() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Character ch) {
            return new CharacterParcelable(ch);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$i */
    private static class C11119i implements C11140d.c<Collection> {
        private C11119i() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Collection collection) {
            return new CollectionParcelable(collection);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$j */
    private static class C11120j implements C11140d.c<Double> {
        private C11120j() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Double d2) {
            return new DoubleParcelable(d2);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$k */
    private static class C11121k implements C11140d.c<Float> {
        private C11121k() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Float f2) {
            return new FloatParcelable(f2);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$l */
    private static class C11122l implements C11140d.c<IBinder> {
        private C11122l() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(IBinder iBinder) {
            return new IBinderParcelable(iBinder);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$m */
    private static class C11123m implements C11140d.c<Integer> {
        private C11123m() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Integer num) {
            return new IntegerParcelable(num);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$n */
    private static class C11124n implements C11140d.c<LinkedHashMap> {
        private C11124n() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(LinkedHashMap linkedHashMap) {
            return new LinkedHashMapParcelable(linkedHashMap);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$o */
    private static class C11125o implements C11140d.c<LinkedHashSet> {
        private C11125o() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(LinkedHashSet linkedHashSet) {
            return new LinkedHashSetParcelable(linkedHashSet);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$p */
    private static class C11126p implements C11140d.c<LinkedList> {
        private C11126p() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(LinkedList linkedList) {
            return new LinkedListParcelable(linkedList);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$q */
    private static class C11127q implements C11140d.c<List> {
        private C11127q() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(List list) {
            return new ListParcelable(list);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$r */
    private static class C11128r implements C11140d.c<Long> {
        private C11128r() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Long l) {
            return new LongParcelable(l);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$s */
    private static class C11129s implements C11140d.c<Map> {
        private C11129s() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Map map) {
            return new MapParcelable(map);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$t */
    static class C11130t implements C11140d.c<Parcelable> {
        C11130t() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Parcelable parcelable) {
            return new ParcelableParcelable(parcelable);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$u */
    private static class C11131u implements C11140d.c<Set> {
        private C11131u() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Set set) {
            return new SetParcelable(set);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$v */
    private static class C11132v implements C11140d.c<SparseArray> {
        private C11132v() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(SparseArray sparseArray) {
            return new SparseArrayParcelable(sparseArray);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$w */
    private static class C11133w implements C11140d.c<SparseBooleanArray> {
        private C11133w() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(SparseBooleanArray sparseBooleanArray) {
            return new SparseBooleanArrayParcelable(sparseBooleanArray);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$x */
    private static class C11134x implements C11140d.c<String> {
        private C11134x() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(String str) {
            return new StringParcelable(str);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$y */
    private static class C11135y implements C11140d.c<Map> {
        private C11135y() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Map map) {
            return new TreeMapParcelable(map);
        }
    }

    /* renamed from: org.parceler.NonParcelRepository$z */
    private static class C11136z implements C11140d.c<Set> {
        private C11136z() {
        }

        @Override // org.parceler.C11140d.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Parcelable mo39835a(Set set) {
            return new TreeSetParcelable(set);
        }
    }

    private NonParcelRepository() {
        HashMap hashMap = new HashMap();
        this.f41963b = hashMap;
        hashMap.put(Collection.class, new C11119i());
        hashMap.put(List.class, new C11127q());
        hashMap.put(ArrayList.class, new C11127q());
        hashMap.put(Set.class, new C11131u());
        hashMap.put(HashSet.class, new C11131u());
        hashMap.put(TreeSet.class, new C11136z());
        hashMap.put(SparseArray.class, new C11132v());
        hashMap.put(Map.class, new C11129s());
        hashMap.put(HashMap.class, new C11129s());
        hashMap.put(TreeMap.class, new C11135y());
        hashMap.put(Integer.class, new C11123m());
        hashMap.put(Long.class, new C11128r());
        hashMap.put(Double.class, new C11120j());
        hashMap.put(Float.class, new C11121k());
        hashMap.put(Byte.class, new C11116f());
        hashMap.put(String.class, new C11134x());
        hashMap.put(Character.class, new C11118h());
        hashMap.put(Boolean.class, new C11113c());
        hashMap.put(byte[].class, new C11115e());
        hashMap.put(char[].class, new C11117g());
        hashMap.put(boolean[].class, new C11112b());
        hashMap.put(IBinder.class, new C11122l());
        hashMap.put(Bundle.class, new C11114d());
        hashMap.put(SparseBooleanArray.class, new C11133w());
        hashMap.put(LinkedList.class, new C11126p());
        hashMap.put(LinkedHashMap.class, new C11124n());
        hashMap.put(SortedMap.class, new C11135y());
        hashMap.put(SortedSet.class, new C11136z());
        hashMap.put(LinkedHashSet.class, new C11125o());
    }

    /* renamed from: a */
    public static NonParcelRepository m39754a() {
        return f41962a;
    }

    @Override // org.parceler.InterfaceC11141e
    public Map<Class, C11140d.c> get() {
        return this.f41963b;
    }

    private static class ConverterParcelable<T> implements Parcelable, InterfaceC11139c<T> {

        /* renamed from: f */
        private final T f41971f;

        /* renamed from: g */
        private final InterfaceC11142f<T, T> f41972g;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // org.parceler.InterfaceC11139c
        public T getParcel() {
            return this.f41971f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            this.f41972g.mo39881b(this.f41971f, parcel);
        }

        private ConverterParcelable(Parcel parcel, InterfaceC11142f<T, T> interfaceC11142f) {
            this(interfaceC11142f.mo39880a(parcel), interfaceC11142f);
        }

        private ConverterParcelable(T t, InterfaceC11142f<T, T> interfaceC11142f) {
            this.f41972g = interfaceC11142f;
            this.f41971f = t;
        }
    }

    public static final class ParcelableParcelable implements Parcelable, InterfaceC11139c<Parcelable> {
        public static final C11099a CREATOR = new C11099a();

        /* renamed from: f */
        private Parcelable f41983f;

        /* renamed from: org.parceler.NonParcelRepository$ParcelableParcelable$a */
        private static final class C11099a implements Parcelable.Creator<ParcelableParcelable> {
            private C11099a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ParcelableParcelable createFromParcel(Parcel parcel) {
                return new ParcelableParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ParcelableParcelable[] newArray(int i2) {
                return new ParcelableParcelable[i2];
            }
        }

        @Override // org.parceler.InterfaceC11139c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Parcelable getParcel() {
            return this.f41983f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f41983f, i2);
        }

        private ParcelableParcelable(Parcel parcel) {
            this.f41983f = parcel.readParcelable(ParcelableParcelable.class.getClassLoader());
        }

        private ParcelableParcelable(Parcelable parcelable) {
            this.f41983f = parcelable;
        }
    }

    public static final class StringParcelable implements Parcelable, InterfaceC11139c<String> {
        public static final C11106a CREATOR = new C11106a();

        /* renamed from: f */
        private String f41987f;

        /* renamed from: org.parceler.NonParcelRepository$StringParcelable$a */
        private static final class C11106a implements Parcelable.Creator<StringParcelable> {
            private C11106a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public StringParcelable createFromParcel(Parcel parcel) {
                return new StringParcelable(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public StringParcelable[] newArray(int i2) {
                return new StringParcelable[i2];
            }
        }

        @Override // org.parceler.InterfaceC11139c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getParcel() {
            return this.f41987f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f41987f);
        }

        private StringParcelable(Parcel parcel) {
            this.f41987f = parcel.readString();
        }

        private StringParcelable(String str) {
            this.f41987f = str;
        }
    }
}
