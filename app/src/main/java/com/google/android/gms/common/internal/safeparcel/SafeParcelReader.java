package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    private SafeParcelReader() {
    }

    /* renamed from: A */
    public static float m14423A(Parcel parcel, int i2) {
        m14436N(parcel, i2, 4);
        return parcel.readFloat();
    }

    /* renamed from: B */
    public static Float m14424B(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        if (m14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, m14432J, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: C */
    public static int m14425C(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: D */
    public static IBinder m14426D(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + m14432J);
        return readStrongBinder;
    }

    /* renamed from: E */
    public static int m14427E(Parcel parcel, int i2) {
        m14436N(parcel, i2, 4);
        return parcel.readInt();
    }

    /* renamed from: F */
    public static Integer m14428F(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        if (m14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, m14432J, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: G */
    public static long m14429G(Parcel parcel, int i2) {
        m14436N(parcel, i2, 8);
        return parcel.readLong();
    }

    /* renamed from: H */
    public static Long m14430H(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        if (m14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, m14432J, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: I */
    public static short m14431I(Parcel parcel, int i2) {
        m14436N(parcel, i2, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: J */
    public static int m14432J(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    /* renamed from: K */
    public static void m14433K(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + m14432J(parcel, i2));
    }

    /* renamed from: L */
    public static int m14434L(Parcel parcel) {
        int m14425C = m14425C(parcel);
        int m14432J = m14432J(parcel, m14425C);
        int dataPosition = parcel.dataPosition();
        if (m14458v(m14425C) != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(m14425C))), parcel);
        }
        int i2 = m14432J + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i2, parcel);
    }

    /* renamed from: M */
    private static void m14435M(Parcel parcel, int i2, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        throw new ParseException("Expected size " + i4 + " got " + i3 + " (0x" + Integer.toHexString(i3) + ")", parcel);
    }

    /* renamed from: N */
    private static void m14436N(Parcel parcel, int i2, int i3) {
        int m14432J = m14432J(parcel, i2);
        if (m14432J == i3) {
            return;
        }
        throw new ParseException("Expected size " + i3 + " got " + m14432J + " (0x" + Integer.toHexString(m14432J) + ")", parcel);
    }

    /* renamed from: a */
    public static BigDecimal m14437a(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + m14432J);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: b */
    public static BigDecimal[] m14438b(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i3] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + m14432J);
        return bigDecimalArr;
    }

    /* renamed from: c */
    public static BigInteger m14439c(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m14432J);
        return new BigInteger(createByteArray);
    }

    /* renamed from: d */
    public static BigInteger[] m14440d(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            bigIntegerArr[i3] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + m14432J);
        return bigIntegerArr;
    }

    /* renamed from: e */
    public static boolean[] m14441e(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + m14432J);
        return createBooleanArray;
    }

    /* renamed from: f */
    public static Bundle m14442f(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + m14432J);
        return readBundle;
    }

    /* renamed from: g */
    public static byte[] m14443g(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m14432J);
        return createByteArray;
    }

    /* renamed from: h */
    public static double[] m14444h(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + m14432J);
        return createDoubleArray;
    }

    /* renamed from: i */
    public static float[] m14445i(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + m14432J);
        return createFloatArray;
    }

    /* renamed from: j */
    public static int[] m14446j(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + m14432J);
        return createIntArray;
    }

    /* renamed from: k */
    public static ArrayList<Integer> m14447k(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + m14432J);
        return arrayList;
    }

    /* renamed from: l */
    public static long[] m14448l(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + m14432J);
        return createLongArray;
    }

    /* renamed from: m */
    public static Parcel m14449m(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, m14432J);
        parcel.setDataPosition(dataPosition + m14432J);
        return obtain;
    }

    /* renamed from: n */
    public static Parcel[] m14450n(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i3 = 0; i3 < readInt; i3++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i3] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i3] = null;
            }
        }
        parcel.setDataPosition(dataPosition + m14432J);
        return parcelArr;
    }

    /* renamed from: o */
    public static <T extends Parcelable> T m14451o(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m14432J);
        return createFromParcel;
    }

    /* renamed from: p */
    public static String m14452p(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m14432J);
        return readString;
    }

    /* renamed from: q */
    public static String[] m14453q(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m14432J);
        return createStringArray;
    }

    /* renamed from: r */
    public static ArrayList<String> m14454r(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + m14432J);
        return createStringArrayList;
    }

    /* renamed from: s */
    public static <T> T[] m14455s(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m14432J);
        return tArr;
    }

    /* renamed from: t */
    public static <T> ArrayList<T> m14456t(Parcel parcel, int i2, Parcelable.Creator<T> creator) {
        int m14432J = m14432J(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (m14432J == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m14432J);
        return createTypedArrayList;
    }

    /* renamed from: u */
    public static void m14457u(Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        throw new ParseException("Overread allowed size end=" + i2, parcel);
    }

    /* renamed from: v */
    public static int m14458v(int i2) {
        return (char) i2;
    }

    /* renamed from: w */
    public static boolean m14459w(Parcel parcel, int i2) {
        m14436N(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: x */
    public static Boolean m14460x(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        if (m14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, m14432J, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: y */
    public static double m14461y(Parcel parcel, int i2) {
        m14436N(parcel, i2, 8);
        return parcel.readDouble();
    }

    /* renamed from: z */
    public static Double m14462z(Parcel parcel, int i2) {
        int m14432J = m14432J(parcel, i2);
        if (m14432J == 0) {
            return null;
        }
        m14435M(parcel, i2, m14432J, 8);
        return Double.valueOf(parcel.readDouble());
    }
}
