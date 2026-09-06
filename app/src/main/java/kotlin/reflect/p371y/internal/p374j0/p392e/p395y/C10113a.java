package kotlin.reflect.p371y.internal.p374j0.p392e.p395y;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.collections.C10749c0;
import kotlin.collections.C10786v;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.ranges.IntRange;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10116a;

/* compiled from: BuiltInsBinaryVersion.kt */
/* renamed from: kotlin.f0.y.e.j0.e.y.a */
/* loaded from: classes3.dex */
public final class C10113a extends AbstractC10116a {

    /* renamed from: g */
    public static final a f39168g = new a(null);

    /* renamed from: h */
    public static final C10113a f39169h = new C10113a(1, 0, 7);

    /* renamed from: i */
    public static final C10113a f39170i = new C10113a(new int[0]);

    /* compiled from: BuiltInsBinaryVersion.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.y.a$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final C10113a m35355a(InputStream inputStream) {
            int[] m38568D0;
            C9768m.m32346f(inputStream, "stream");
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(C10786v.m38911u(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                ((IntIterator) it).mo32397b();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            m38568D0 = C10749c0.m38568D0(arrayList);
            return new C10113a(Arrays.copyOf(m38568D0, m38568D0.length));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10113a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        C9768m.m32346f(iArr, "numbers");
    }

    /* renamed from: h */
    public boolean m35354h() {
        return m35363f(f39169h);
    }
}
