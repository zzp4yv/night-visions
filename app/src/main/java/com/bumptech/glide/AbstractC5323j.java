package com.bumptech.glide;

import com.bumptech.glide.AbstractC5323j;
import com.bumptech.glide.p141p.p143m.C5548c;
import com.bumptech.glide.p141p.p143m.InterfaceC5550e;
import com.bumptech.glide.p145r.C5563j;

/* compiled from: TransitionOptions.java */
/* renamed from: com.bumptech.glide.j */
/* loaded from: classes.dex */
public abstract class AbstractC5323j<CHILD extends AbstractC5323j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: f */
    private InterfaceC5550e<? super TranscodeType> f13125f = C5548c.m11008c();

    /* renamed from: e */
    private CHILD m10049e() {
        return this;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: d */
    final InterfaceC5550e<? super TranscodeType> m10051d() {
        return this.f13125f;
    }

    /* renamed from: f */
    public final CHILD m10052f(InterfaceC5550e<? super TranscodeType> interfaceC5550e) {
        this.f13125f = (InterfaceC5550e) C5563j.m11042d(interfaceC5550e);
        return m10049e();
    }
}
