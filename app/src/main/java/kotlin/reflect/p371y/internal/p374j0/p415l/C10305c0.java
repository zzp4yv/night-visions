package kotlin.reflect.p371y.internal.p374j0.p415l;

import cm.aptoide.p092pt.database.room.RoomNotification;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10561h;

/* compiled from: TypeSubstitution.kt */
/* renamed from: kotlin.f0.y.e.j0.l.c0 */
/* loaded from: classes3.dex */
public final class C10305c0 extends AbstractC10327j1 {

    /* renamed from: c */
    private final InterfaceC10554e1[] f40044c;

    /* renamed from: d */
    private final InterfaceC10318g1[] f40045d;

    /* renamed from: e */
    private final boolean f40046e;

    public /* synthetic */ C10305c0(InterfaceC10554e1[] interfaceC10554e1Arr, InterfaceC10318g1[] interfaceC10318g1Arr, boolean z, int i2, C9756g c9756g) {
        this(interfaceC10554e1Arr, interfaceC10318g1Arr, (i2 & 4) != 0 ? false : z);
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: b */
    public boolean mo36012b() {
        return this.f40046e;
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: e */
    public InterfaceC10318g1 mo33536e(AbstractC10311e0 abstractC10311e0) {
        C9768m.m32346f(abstractC10311e0, RoomNotification.KEY);
        InterfaceC10561h mo32887c = abstractC10311e0.mo35993O0().mo32887c();
        InterfaceC10554e1 interfaceC10554e1 = mo32887c instanceof InterfaceC10554e1 ? (InterfaceC10554e1) mo32887c : null;
        if (interfaceC10554e1 == null) {
            return null;
        }
        int mo37670g = interfaceC10554e1.mo37670g();
        InterfaceC10554e1[] interfaceC10554e1Arr = this.f40044c;
        if (mo37670g >= interfaceC10554e1Arr.length || !C9768m.m32341a(interfaceC10554e1Arr[mo37670g].mo32877h(), interfaceC10554e1.mo32877h())) {
            return null;
        }
        return this.f40045d[mo37670g];
    }

    @Override // kotlin.reflect.p371y.internal.p374j0.p415l.AbstractC10327j1
    /* renamed from: f */
    public boolean mo33537f() {
        return this.f40045d.length == 0;
    }

    /* renamed from: i */
    public final InterfaceC10318g1[] m36593i() {
        return this.f40045d;
    }

    /* renamed from: j */
    public final InterfaceC10554e1[] m36594j() {
        return this.f40044c;
    }

    public C10305c0(InterfaceC10554e1[] interfaceC10554e1Arr, InterfaceC10318g1[] interfaceC10318g1Arr, boolean z) {
        C9768m.m32346f(interfaceC10554e1Arr, "parameters");
        C9768m.m32346f(interfaceC10318g1Arr, "arguments");
        this.f40044c = interfaceC10554e1Arr;
        this.f40045d = interfaceC10318g1Arr;
        this.f40046e = z;
        int length = interfaceC10554e1Arr.length;
        int length2 = interfaceC10318g1Arr.length;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C10305c0(java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1> r9, java.util.List<? extends kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1> r10) {
        /*
            r8 = this;
            java.lang.String r0 = "parameters"
            kotlin.jvm.internal.C9768m.m32346f(r9, r0)
            java.lang.String r0 = "argumentsList"
            kotlin.jvm.internal.C9768m.m32346f(r10, r0)
            r0 = 0
            kotlin.reflect.jvm.internal.impl.descriptors.e1[] r1 = new kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1[r0]
            java.lang.Object[] r9 = r9.toArray(r1)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            kotlin.jvm.internal.C9768m.m32344d(r9, r1)
            r3 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.e1[] r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10554e1[]) r3
            kotlin.f0.y.e.j0.l.g1[] r9 = new kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1[r0]
            java.lang.Object[] r9 = r10.toArray(r9)
            kotlin.jvm.internal.C9768m.m32344d(r9, r1)
            r4 = r9
            kotlin.f0.y.e.j0.l.g1[] r4 = (kotlin.reflect.p371y.internal.p374j0.p415l.InterfaceC10318g1[]) r4
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p415l.C10305c0.<init>(java.util.List, java.util.List):void");
    }
}
