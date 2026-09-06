package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* loaded from: classes2.dex */
final class C6339i extends AbstractRunnableC6353p {

    /* renamed from: g */
    private final Map<Api.Client, C6337h> f17416g;

    /* renamed from: h */
    final /* synthetic */ zaak f17417h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6339i(zaak zaakVar, Map<Api.Client, C6337h> map) {
        super(zaakVar, null);
        this.f17417h = zaakVar;
        this.f17416g = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC6353p
    /* renamed from: a */
    public final void mo14062a() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        boolean z;
        Context context2;
        zabe zabeVar;
        zad zadVar;
        zad zadVar2;
        zabe zabeVar2;
        Context context3;
        boolean z2;
        googleApiAvailabilityLight = this.f17417h.f17488d;
        GoogleApiAvailabilityCache googleApiAvailabilityCache = new GoogleApiAvailabilityCache(googleApiAvailabilityLight);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.f17416g.keySet()) {
            if (client.requiresGooglePlayServices()) {
                z2 = this.f17416g.get(client).f17413c;
                if (!z2) {
                    arrayList.add(client);
                }
            }
            arrayList2.add(client);
        }
        int i2 = -1;
        int i3 = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                context = this.f17417h.f17487c;
                i2 = googleApiAvailabilityCache.m14346b(context, (Api.Client) obj);
                if (i2 != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                context3 = this.f17417h.f17487c;
                i2 = googleApiAvailabilityCache.m14346b(context3, (Api.Client) obj2);
                if (i2 == 0) {
                    break;
                }
            }
        }
        if (i2 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i2, null);
            zabeVar2 = this.f17417h.f17485a;
            zabeVar2.m14177h(new C6341j(this, this.f17417h, connectionResult));
            return;
        }
        z = this.f17417h.f17497m;
        if (z) {
            zadVar = this.f17417h.f17495k;
            if (zadVar != null) {
                zadVar2 = this.f17417h.f17495k;
                zadVar2.mo23614a();
            }
        }
        for (Api.Client client2 : this.f17416g.keySet()) {
            C6337h c6337h = this.f17416g.get(client2);
            if (client2.requiresGooglePlayServices()) {
                context2 = this.f17417h.f17487c;
                if (googleApiAvailabilityCache.m14346b(context2, client2) != 0) {
                    zabeVar = this.f17417h.f17485a;
                    zabeVar.m14177h(new C6343k(this, this.f17417h, c6337h));
                }
            }
            client2.connect(c6337h);
        }
    }
}
