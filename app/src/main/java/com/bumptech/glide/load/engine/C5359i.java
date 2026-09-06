package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C5393i;
import com.bumptech.glide.load.InterfaceC5394j;
import com.bumptech.glide.load.p127m.InterfaceC5401e;
import com.bumptech.glide.load.p131o.p137h.InterfaceC5496e;
import com.bumptech.glide.p145r.C5563j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: DecodePath.java */
/* renamed from: com.bumptech.glide.load.engine.i */
/* loaded from: classes.dex */
public class C5359i<DataType, ResourceType, Transcode> {

    /* renamed from: a */
    private final Class<DataType> f13389a;

    /* renamed from: b */
    private final List<? extends InterfaceC5394j<DataType, ResourceType>> f13390b;

    /* renamed from: c */
    private final InterfaceC5496e<ResourceType, Transcode> f13391c;

    /* renamed from: d */
    private final InterfaceC0956f<List<Throwable>> f13392d;

    /* renamed from: e */
    private final String f13393e;

    /* compiled from: DecodePath.java */
    /* renamed from: com.bumptech.glide.load.engine.i$a */
    interface a<ResourceType> {
        /* renamed from: a */
        InterfaceC5371u<ResourceType> mo10284a(InterfaceC5371u<ResourceType> interfaceC5371u);
    }

    public C5359i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends InterfaceC5394j<DataType, ResourceType>> list, InterfaceC5496e<ResourceType, Transcode> interfaceC5496e, InterfaceC0956f<List<Throwable>> interfaceC0956f) {
        this.f13389a = cls;
        this.f13390b = list;
        this.f13391c = interfaceC5496e;
        this.f13392d = interfaceC0956f;
        this.f13393e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* renamed from: b */
    private InterfaceC5371u<ResourceType> m10295b(InterfaceC5401e<DataType> interfaceC5401e, int i2, int i3, C5393i c5393i) throws GlideException {
        List<Throwable> list = (List) C5563j.m11042d(this.f13392d.mo6061b());
        try {
            return m10296c(interfaceC5401e, i2, i3, c5393i, list);
        } finally {
            this.f13392d.mo6060a(list);
        }
    }

    /* renamed from: c */
    private InterfaceC5371u<ResourceType> m10296c(InterfaceC5401e<DataType> interfaceC5401e, int i2, int i3, C5393i c5393i, List<Throwable> list) throws GlideException {
        int size = this.f13390b.size();
        InterfaceC5371u<ResourceType> interfaceC5371u = null;
        for (int i4 = 0; i4 < size; i4++) {
            InterfaceC5394j<DataType, ResourceType> interfaceC5394j = this.f13390b.get(i4);
            try {
                if (interfaceC5394j.mo10452a(interfaceC5401e.mo10468a(), c5393i)) {
                    interfaceC5371u = interfaceC5394j.mo10453b(interfaceC5401e.mo10468a(), i2, i3, c5393i);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + interfaceC5394j, e2);
                }
                list.add(e2);
            }
            if (interfaceC5371u != null) {
                break;
            }
        }
        if (interfaceC5371u != null) {
            return interfaceC5371u;
        }
        throw new GlideException(this.f13393e, new ArrayList(list));
    }

    /* renamed from: a */
    public InterfaceC5371u<Transcode> m10297a(InterfaceC5401e<DataType> interfaceC5401e, int i2, int i3, C5393i c5393i, a<ResourceType> aVar) throws GlideException {
        return this.f13391c.mo10776a(aVar.mo10284a(m10295b(interfaceC5401e, i2, i3, c5393i)), c5393i);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f13389a + ", decoders=" + this.f13390b + ", transcoder=" + this.f13391c + '}';
    }
}
