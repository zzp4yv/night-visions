package kotlin.reflect.p371y.internal.p374j0.p380d.p381a;

import java.util.List;
import java.util.Map;
import kotlin.C10517i;
import kotlin.Lazy;
import kotlin.collections.C10777q0;
import kotlin.collections.C10782t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10127c;

/* compiled from: Jsr305Settings.kt */
/* renamed from: kotlin.f0.y.e.j0.d.a.y */
/* loaded from: classes2.dex */
public final class C10046y {

    /* renamed from: a */
    private final EnumC9922f0 f38323a;

    /* renamed from: b */
    private final EnumC9922f0 f38324b;

    /* renamed from: c */
    private final Map<C10127c, EnumC9922f0> f38325c;

    /* renamed from: d */
    private final Lazy f38326d;

    /* renamed from: e */
    private final boolean f38327e;

    /* compiled from: Jsr305Settings.kt */
    /* renamed from: kotlin.f0.y.e.j0.d.a.y$a */
    static final class a extends Lambda implements Function0<String[]> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            List m38881c;
            List m38879a;
            C10046y c10046y = C10046y.this;
            m38881c = C10782t.m38881c();
            m38881c.add(c10046y.m33824a().m33093k());
            EnumC9922f0 m33825b = c10046y.m33825b();
            if (m33825b != null) {
                m38881c.add("under-migration:" + m33825b.m33093k());
            }
            for (Map.Entry<C10127c, EnumC9922f0> entry : c10046y.m33826c().entrySet()) {
                m38881c.add('@' + entry.getKey() + ':' + entry.getValue().m33093k());
            }
            m38879a = C10782t.m38879a(m38881c);
            Object[] array = m38879a.toArray(new String[0]);
            C9768m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (String[]) array;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10046y(EnumC9922f0 enumC9922f0, EnumC9922f0 enumC9922f02, Map<C10127c, ? extends EnumC9922f0> map) {
        Lazy m37594b;
        C9768m.m32346f(enumC9922f0, "globalLevel");
        C9768m.m32346f(map, "userDefinedLevelForSpecificAnnotation");
        this.f38323a = enumC9922f0;
        this.f38324b = enumC9922f02;
        this.f38325c = map;
        m37594b = C10517i.m37594b(new a());
        this.f38326d = m37594b;
        EnumC9922f0 enumC9922f03 = EnumC9922f0.IGNORE;
        this.f38327e = enumC9922f0 == enumC9922f03 && enumC9922f02 == enumC9922f03 && map.isEmpty();
    }

    /* renamed from: a */
    public final EnumC9922f0 m33824a() {
        return this.f38323a;
    }

    /* renamed from: b */
    public final EnumC9922f0 m33825b() {
        return this.f38324b;
    }

    /* renamed from: c */
    public final Map<C10127c, EnumC9922f0> m33826c() {
        return this.f38325c;
    }

    /* renamed from: d */
    public final boolean m33827d() {
        return this.f38327e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10046y)) {
            return false;
        }
        C10046y c10046y = (C10046y) obj;
        return this.f38323a == c10046y.f38323a && this.f38324b == c10046y.f38324b && C9768m.m32341a(this.f38325c, c10046y.f38325c);
    }

    public int hashCode() {
        int hashCode = this.f38323a.hashCode() * 31;
        EnumC9922f0 enumC9922f0 = this.f38324b;
        return ((hashCode + (enumC9922f0 == null ? 0 : enumC9922f0.hashCode())) * 31) + this.f38325c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f38323a + ", migrationLevel=" + this.f38324b + ", userDefinedLevelForSpecificAnnotation=" + this.f38325c + ')';
    }

    public /* synthetic */ C10046y(EnumC9922f0 enumC9922f0, EnumC9922f0 enumC9922f02, Map map, int i2, C9756g c9756g) {
        this(enumC9922f0, (i2 & 2) != 0 ? null : enumC9922f02, (i2 & 4) != 0 ? C10777q0.m38797i() : map);
    }
}
