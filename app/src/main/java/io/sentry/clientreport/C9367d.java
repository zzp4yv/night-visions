package io.sentry.clientreport;

import io.sentry.C9211a1;
import io.sentry.C9416h4;
import io.sentry.C9459j4;
import io.sentry.C9647x4;
import io.sentry.EnumC9547r4;
import io.sentry.EnumC9554s4;
import io.sentry.EnumC9655z0;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: ClientReportRecorder.java */
@ApiStatus.Internal
/* renamed from: io.sentry.clientreport.d */
/* loaded from: classes2.dex */
public final class C9367d implements InterfaceC9370g {

    /* renamed from: a */
    private final InterfaceC9371h f36245a = new C9364a();

    /* renamed from: b */
    private final C9647x4 f36246b;

    public C9367d(C9647x4 c9647x4) {
        this.f36246b = c9647x4;
    }

    /* renamed from: e */
    private EnumC9655z0 m30687e(EnumC9547r4 enumC9547r4) {
        return EnumC9547r4.Event.equals(enumC9547r4) ? EnumC9655z0.Error : EnumC9547r4.Session.equals(enumC9547r4) ? EnumC9655z0.Session : EnumC9547r4.Transaction.equals(enumC9547r4) ? EnumC9655z0.Transaction : EnumC9547r4.UserFeedback.equals(enumC9547r4) ? EnumC9655z0.UserReport : EnumC9547r4.Profile.equals(enumC9547r4) ? EnumC9655z0.Profile : EnumC9547r4.Attachment.equals(enumC9547r4) ? EnumC9655z0.Attachment : EnumC9655z0.Default;
    }

    /* renamed from: f */
    private void m30688f(String str, String str2, Long l) {
        this.f36245a.mo30679b(new C9366c(str, str2), l);
    }

    /* renamed from: h */
    private void m30689h(C9365b c9365b) {
        if (c9365b == null) {
            return;
        }
        for (C9369f c9369f : c9365b.m30680a()) {
            m30688f(c9369f.m30697c(), c9369f.m30695a(), c9369f.m30696b());
        }
    }

    @Override // io.sentry.clientreport.InterfaceC9370g
    /* renamed from: a */
    public void mo30690a(EnumC9368e enumC9368e, EnumC9655z0 enumC9655z0) {
        try {
            m30688f(enumC9368e.getReason(), enumC9655z0.getCategory(), 1L);
        } catch (Throwable th) {
            this.f36246b.getLogger().mo30212a(EnumC9554s4.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC9370g
    /* renamed from: b */
    public void mo30691b(EnumC9368e enumC9368e, C9416h4 c9416h4) {
        if (c9416h4 == null) {
            return;
        }
        try {
            Iterator<C9459j4> it = c9416h4.m30832c().iterator();
            while (it.hasNext()) {
                mo30693d(enumC9368e, it.next());
            }
        } catch (Throwable th) {
            this.f36246b.getLogger().mo30212a(EnumC9554s4.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.InterfaceC9370g
    /* renamed from: c */
    public C9416h4 mo30692c(C9416h4 c9416h4) {
        C9365b m30694g = m30694g();
        if (m30694g == null) {
            return c9416h4;
        }
        try {
            this.f36246b.getLogger().mo30214c(EnumC9554s4.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList = new ArrayList();
            Iterator<C9459j4> it = c9416h4.m30832c().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            arrayList.add(C9459j4.m30889c(this.f36246b.getSerializer(), m30694g));
            return new C9416h4(c9416h4.m30831b(), arrayList);
        } catch (Throwable th) {
            this.f36246b.getLogger().mo30212a(EnumC9554s4.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return c9416h4;
        }
    }

    @Override // io.sentry.clientreport.InterfaceC9370g
    /* renamed from: d */
    public void mo30693d(EnumC9368e enumC9368e, C9459j4 c9459j4) {
        if (c9459j4 == null) {
            return;
        }
        try {
            EnumC9547r4 m30919b = c9459j4.m30910i().m30919b();
            if (EnumC9547r4.ClientReport.equals(m30919b)) {
                try {
                    m30689h(c9459j4.m30908g(this.f36246b.getSerializer()));
                } catch (Exception unused) {
                    this.f36246b.getLogger().mo30214c(EnumC9554s4.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                }
            } else {
                m30688f(enumC9368e.getReason(), m30687e(m30919b).getCategory(), 1L);
            }
        } catch (Throwable th) {
            this.f36246b.getLogger().mo30212a(EnumC9554s4.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    /* renamed from: g */
    C9365b m30694g() {
        Date m30008c = C9211a1.m30008c();
        List<C9369f> mo30678a = this.f36245a.mo30678a();
        if (mo30678a.isEmpty()) {
            return null;
        }
        return new C9365b(m30008c, mo30678a);
    }
}
