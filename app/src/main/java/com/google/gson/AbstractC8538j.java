package com.google.gson;

import com.google.gson.p215t.C8566l;
import com.google.gson.stream.C8554c;
import java.io.IOException;
import java.io.StringWriter;

/* compiled from: JsonElement.java */
/* renamed from: com.google.gson.j */
/* loaded from: classes2.dex */
public abstract class AbstractC8538j {
    /* renamed from: c */
    public C8535g m26954c() {
        if (m26957h()) {
            return (C8535g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: f */
    public C8540l m26955f() {
        if (m26959n()) {
            return (C8540l) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: g */
    public C8541m m26956g() {
        if (m26960o()) {
            return (C8541m) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    /* renamed from: h */
    public boolean m26957h() {
        return this instanceof C8535g;
    }

    /* renamed from: i */
    public boolean m26958i() {
        return this instanceof C8539k;
    }

    /* renamed from: n */
    public boolean m26959n() {
        return this instanceof C8540l;
    }

    /* renamed from: o */
    public boolean m26960o() {
        return this instanceof C8541m;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C8554c c8554c = new C8554c(stringWriter);
            c8554c.m27028J(true);
            C8566l.m27111b(this, c8554c);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
