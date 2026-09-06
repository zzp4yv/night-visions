package com.flurry.sdk;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.flurry.sdk.b3 */
/* loaded from: classes2.dex */
final class C5972b3 extends AbstractC5981c3 {

    /* renamed from: s */
    protected static EnumC6128s6[] f15681s = {EnumC6128s6.SESSION_INFO, EnumC6128s6.APP_INFO, EnumC6128s6.REPORTED_ID, EnumC6128s6.DEVICE_PROPERTIES, EnumC6128s6.NOTIFICATION, EnumC6128s6.REFERRER, EnumC6128s6.LAUNCH_OPTIONS, EnumC6128s6.CONSENT, EnumC6128s6.APP_STATE, EnumC6128s6.NETWORK, EnumC6128s6.LOCALE, EnumC6128s6.TIMEZONE, EnumC6128s6.APP_ORIENTATION, EnumC6128s6.DYNAMIC_SESSION_INFO, EnumC6128s6.LOCATION, EnumC6128s6.USER_ID, EnumC6128s6.BIRTHDATE, EnumC6128s6.GENDER};

    /* renamed from: t */
    protected static EnumC6128s6[] f15682t = {EnumC6128s6.ORIGIN_ATTRIBUTE};

    /* renamed from: u */
    private EnumMap<EnumC6128s6, InterfaceC6144u6> f15683u;

    /* renamed from: v */
    private EnumMap<EnumC6128s6, List<InterfaceC6144u6>> f15684v;

    /* renamed from: com.flurry.sdk.b3$a */
    final class a extends AbstractRunnableC6008f2 {

        /* renamed from: h */
        final /* synthetic */ InterfaceC6144u6 f15685h;

        a(InterfaceC6144u6 interfaceC6144u6) {
            this.f15685h = interfaceC6144u6;
        }

        @Override // com.flurry.sdk.AbstractRunnableC6008f2
        /* renamed from: a */
        public final void mo12950a() {
            C5972b3.this.m13002w(this.f15685h);
            C5972b3.m12974y(C5972b3.this, this.f15685h);
            if (EnumC6128s6.FLUSH_FRAME.equals(this.f15685h.mo12961a())) {
                Iterator it = C5972b3.this.f15683u.entrySet().iterator();
                while (it.hasNext()) {
                    InterfaceC6144u6 interfaceC6144u6 = (InterfaceC6144u6) ((Map.Entry) it.next()).getValue();
                    if (interfaceC6144u6 != null) {
                        C5972b3.this.m13002w(interfaceC6144u6);
                    }
                }
                Iterator it2 = C5972b3.this.f15684v.entrySet().iterator();
                while (it2.hasNext()) {
                    List list = (List) ((Map.Entry) it2.next()).getValue();
                    if (list != null && list.size() != 0) {
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            C5972b3.this.m13002w((InterfaceC6144u6) list.get(i2));
                        }
                    }
                }
            }
        }
    }

    C5972b3(InterfaceC6164x2 interfaceC6164x2) {
        super("StickyModule", interfaceC6164x2);
        this.f15683u = new EnumMap<>(EnumC6128s6.class);
        this.f15684v = new EnumMap<>(EnumC6128s6.class);
        for (EnumC6128s6 enumC6128s6 : f15681s) {
            this.f15683u.put((EnumMap<EnumC6128s6, InterfaceC6144u6>) enumC6128s6, (EnumC6128s6) null);
        }
        for (EnumC6128s6 enumC6128s62 : f15682t) {
            this.f15684v.put((EnumMap<EnumC6128s6, List<InterfaceC6144u6>>) enumC6128s62, (EnumC6128s6) null);
        }
    }

    /* renamed from: y */
    static /* synthetic */ void m12974y(C5972b3 c5972b3, InterfaceC6144u6 interfaceC6144u6) {
        EnumC6128s6 mo12961a = interfaceC6144u6.mo12961a();
        List<InterfaceC6144u6> arrayList = new ArrayList<>();
        if (c5972b3.f15683u.containsKey(mo12961a)) {
            c5972b3.f15683u.put((EnumMap<EnumC6128s6, InterfaceC6144u6>) mo12961a, (EnumC6128s6) interfaceC6144u6);
        }
        if (c5972b3.f15684v.containsKey(mo12961a)) {
            if (c5972b3.f15684v.get(mo12961a) != null) {
                arrayList = c5972b3.f15684v.get(mo12961a);
            }
            arrayList.add(interfaceC6144u6);
            c5972b3.f15684v.put((EnumMap<EnumC6128s6, List<InterfaceC6144u6>>) mo12961a, (EnumC6128s6) arrayList);
        }
    }

    @Override // com.flurry.sdk.AbstractC5981c3
    /* renamed from: b */
    public final void mo12956b(InterfaceC6144u6 interfaceC6144u6) {
        mo13007m(new a(interfaceC6144u6));
    }
}
