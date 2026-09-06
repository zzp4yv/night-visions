package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.C9756g;

/* compiled from: Modality.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d0 */
/* loaded from: classes2.dex */
public enum EnumC10550d0 {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;


    /* renamed from: f */
    public static final a f40738f = new a(null);

    /* compiled from: Modality.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.d0$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }

        /* renamed from: a */
        public final EnumC10550d0 m37676a(boolean z, boolean z2, boolean z3) {
            return z ? EnumC10550d0.SEALED : z2 ? EnumC10550d0.ABSTRACT : z3 ? EnumC10550d0.OPEN : EnumC10550d0.FINAL;
        }
    }
}
