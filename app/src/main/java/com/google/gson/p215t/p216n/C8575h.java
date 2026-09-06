package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.InterfaceC8546r;
import com.google.gson.p215t.C8562h;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ObjectTypeAdapter.java */
/* renamed from: com.google.gson.t.n.h */
/* loaded from: classes2.dex */
public final class C8575h extends AbstractC8545q<Object> {

    /* renamed from: a */
    public static final InterfaceC8546r f32603a = new a();

    /* renamed from: b */
    private final C8533e f32604b;

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.h$a */
    static class a implements InterfaceC8546r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            if (c8586a.getRawType() == Object.class) {
                return new C8575h(c8533e);
            }
            return null;
        }
    }

    /* compiled from: ObjectTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.h$b */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f32605a;

        static {
            int[] iArr = new int[EnumC8553b.values().length];
            f32605a = iArr;
            try {
                iArr[EnumC8553b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32605a[EnumC8553b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32605a[EnumC8553b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32605a[EnumC8553b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32605a[EnumC8553b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32605a[EnumC8553b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    C8575h(C8533e c8533e) {
        this.f32604b = c8533e;
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: b */
    public Object mo26938b(C8552a c8552a) throws IOException {
        switch (b.f32605a[c8552a.mo27001Q().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                c8552a.mo27002a();
                while (c8552a.mo27009l()) {
                    arrayList.add(mo26938b(c8552a));
                }
                c8552a.mo27006f();
                return arrayList;
            case 2:
                C8562h c8562h = new C8562h();
                c8552a.mo27004b();
                while (c8552a.mo27009l()) {
                    c8562h.put(c8552a.mo26998D(), mo26938b(c8552a));
                }
                c8552a.mo27008j();
                return c8562h;
            case 3:
                return c8552a.mo27000K();
            case 4:
                return Double.valueOf(c8552a.mo27014z());
            case 5:
                return Boolean.valueOf(c8552a.mo27013y());
            case 6:
                c8552a.mo26999I();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: d */
    public void mo26939d(C8554c c8554c, Object obj) throws IOException {
        if (obj == null) {
            c8554c.mo27043y();
            return;
        }
        AbstractC8545q m26927k = this.f32604b.m26927k(obj.getClass());
        if (!(m26927k instanceof C8575h)) {
            m26927k.mo26939d(c8554c, obj);
        } else {
            c8554c.mo27036d();
            c8554c.mo27038j();
        }
    }
}
