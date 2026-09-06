package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.p394b;

import java.util.Arrays;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.p371y.internal.p374j0.p392e.p396z.AbstractC10116a;

/* compiled from: JvmMetadataVersion.kt */
/* renamed from: kotlin.f0.y.e.j0.e.a0.b.e */
/* loaded from: classes3.dex */
public final class C10084e extends AbstractC10116a {

    /* renamed from: g */
    public static final a f38594g = new a(null);

    /* renamed from: h */
    public static final C10084e f38595h = new C10084e(1, 7, 1);

    /* renamed from: i */
    public static final C10084e f38596i = new C10084e(new int[0]);

    /* renamed from: j */
    private final boolean f38597j;

    /* compiled from: JvmMetadataVersion.kt */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.b.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10084e(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        C9768m.m32346f(iArr, "versionArray");
        this.f38597j = z;
    }

    /* renamed from: h */
    public boolean m34252h() {
        boolean z;
        if (m35358a() == 1 && m35359b() == 0) {
            return false;
        }
        if (this.f38597j) {
            z = m35363f(f38595h);
        } else {
            int m35358a = m35358a();
            C10084e c10084e = f38595h;
            z = m35358a == c10084e.m35358a() && m35359b() <= c10084e.m35359b() + 1;
        }
        return z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10084e(int... iArr) {
        this(iArr, false);
        C9768m.m32346f(iArr, "numbers");
    }
}
