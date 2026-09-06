package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: classes2.dex */
final class C6345l extends AbstractRunnableC6353p {

    /* renamed from: g */
    private final ArrayList<Api.Client> f17425g;

    /* renamed from: h */
    private final /* synthetic */ zaak f17426h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6345l(zaak zaakVar, ArrayList<Api.Client> arrayList) {
        super(zaakVar, null);
        this.f17426h = zaakVar;
        this.f17425g = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC6353p
    /* renamed from: a */
    public final void mo14062a() {
        zabe zabeVar;
        Set<Scope> m14144n;
        IAccountAccessor iAccountAccessor;
        zabe zabeVar2;
        zabeVar = this.f17426h.f17485a;
        zaaw zaawVar = zabeVar.f17546s;
        m14144n = this.f17426h.m14144n();
        zaawVar.f17522q = m14144n;
        ArrayList<Api.Client> arrayList = this.f17425g;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Api.Client client = arrayList.get(i2);
            i2++;
            iAccountAccessor = this.f17426h.f17499o;
            zabeVar2 = this.f17426h.f17485a;
            client.getRemoteService(iAccountAccessor, zabeVar2.f17546s.f17522q);
        }
    }
}
