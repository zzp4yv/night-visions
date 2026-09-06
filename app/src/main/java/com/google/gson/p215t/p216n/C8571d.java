package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.InterfaceC8537i;
import com.google.gson.InterfaceC8543o;
import com.google.gson.InterfaceC8546r;
import com.google.gson.p214s.InterfaceC8548b;
import com.google.gson.p215t.C8557c;
import com.google.gson.p219u.C8586a;

/* compiled from: JsonAdapterAnnotationTypeAdapterFactory.java */
/* renamed from: com.google.gson.t.n.d */
/* loaded from: classes2.dex */
public final class C8571d implements InterfaceC8546r {

    /* renamed from: f */
    private final C8557c f32585f;

    public C8571d(C8557c c8557c) {
        this.f32585f = c8557c;
    }

    /* renamed from: a */
    AbstractC8545q<?> m27121a(C8557c c8557c, C8533e c8533e, C8586a<?> c8586a, InterfaceC8548b interfaceC8548b) {
        AbstractC8545q<?> c8579l;
        Object mo27071a = c8557c.m27070a(C8586a.get((Class) interfaceC8548b.value())).mo27071a();
        if (mo27071a instanceof AbstractC8545q) {
            c8579l = (AbstractC8545q) mo27071a;
        } else if (mo27071a instanceof InterfaceC8546r) {
            c8579l = ((InterfaceC8546r) mo27071a).mo26979b(c8533e, c8586a);
        } else {
            boolean z = mo27071a instanceof InterfaceC8543o;
            if (!z && !(mo27071a instanceof InterfaceC8537i)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo27071a.getClass().getName() + " as a @JsonAdapter for " + c8586a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            c8579l = new C8579l<>(z ? (InterfaceC8543o) mo27071a : null, mo27071a instanceof InterfaceC8537i ? (InterfaceC8537i) mo27071a : null, c8533e, c8586a, null);
        }
        return (c8579l == null || !interfaceC8548b.nullSafe()) ? c8579l : c8579l.m26977a();
    }

    @Override // com.google.gson.InterfaceC8546r
    /* renamed from: b */
    public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
        InterfaceC8548b interfaceC8548b = (InterfaceC8548b) c8586a.getRawType().getAnnotation(InterfaceC8548b.class);
        if (interfaceC8548b == null) {
            return null;
        }
        return (AbstractC8545q<T>) m27121a(this.f32585f, c8533e, c8586a, interfaceC8548b);
    }
}
