package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;

/* compiled from: CallableMemberDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b */
/* loaded from: classes2.dex */
public interface InterfaceC10543b extends InterfaceC10540a, InterfaceC10547c0 {

    /* compiled from: CallableMemberDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        /* renamed from: g */
        public boolean m37667g() {
            return this != FAKE_OVERRIDE;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10576m
    /* renamed from: a */
    InterfaceC10543b mo37019a();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC10540a
    /* renamed from: e */
    Collection<? extends InterfaceC10543b> mo37027e();

    /* renamed from: i */
    a mo37030i();

    /* renamed from: k0 */
    InterfaceC10543b mo36990k0(InterfaceC10576m interfaceC10576m, EnumC10550d0 enumC10550d0, AbstractC10697u abstractC10697u, a aVar, boolean z);

    /* renamed from: x0 */
    void mo36993x0(Collection<? extends InterfaceC10543b> collection);
}
