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
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* compiled from: SqlDateTypeAdapter.java */
/* renamed from: com.google.gson.t.n.j */
/* loaded from: classes2.dex */
public final class C8577j extends AbstractC8545q<Date> {

    /* renamed from: a */
    public static final InterfaceC8546r f32623a = new a();

    /* renamed from: b */
    private final DateFormat f32624b = new SimpleDateFormat("MMM d, yyyy");

    /* compiled from: SqlDateTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.j$a */
    static class a implements InterfaceC8546r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            if (c8586a.getRawType() == Date.class) {
                return new C8577j();
            }
            return null;
        }
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Date mo26938b(C8552a c8552a) throws IOException {
        if (c8552a.mo27001Q() == EnumC8553b.NULL) {
            c8552a.mo26999I();
            return null;
        }
        try {
            return new Date(this.f32624b.parse(c8552a.mo27000K()).getTime());
        } catch (ParseException e2) {
            throw new JsonSyntaxException(e2);
        }
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void mo26939d(C8554c c8554c, Date date) throws IOException {
        c8554c.mo27033Y(date == null ? null : this.f32624b.format((java.util.Date) date));
    }
}
