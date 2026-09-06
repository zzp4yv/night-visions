package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.InterfaceC8546r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: TimeTypeAdapter.java */
/* renamed from: com.google.gson.t.n.k */
/* loaded from: classes2.dex */
public final class C8578k extends AbstractC8545q<Time> {

    /* renamed from: a */
    public static final InterfaceC8546r f32625a = new a();

    /* renamed from: b */
    private final DateFormat f32626b = new SimpleDateFormat("hh:mm:ss a");

    /* compiled from: TimeTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.k$a */
    static class a implements InterfaceC8546r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            if (c8586a.getRawType() == Time.class) {
                return new C8578k();
            }
            return null;
        }
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Time mo26938b(C8552a c8552a) throws IOException {
        if (c8552a.mo27001Q() == EnumC8553b.NULL) {
            c8552a.mo26999I();
            return null;
        }
        try {
            return new Time(this.f32626b.parse(c8552a.mo27000K()).getTime());
        } catch (ParseException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void mo26939d(C8554c c8554c, Time time) throws IOException {
        c8554c.mo27033Y(time == null ? null : this.f32626b.format((Date) time));
    }
}
