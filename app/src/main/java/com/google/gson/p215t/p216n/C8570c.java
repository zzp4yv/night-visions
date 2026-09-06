package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.InterfaceC8546r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p215t.C8559e;
import com.google.gson.p215t.C8564j;
import com.google.gson.p215t.p216n.p217o.C8582a;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: DateTypeAdapter.java */
/* renamed from: com.google.gson.t.n.c */
/* loaded from: classes2.dex */
public final class C8570c extends AbstractC8545q<Date> {

    /* renamed from: a */
    public static final InterfaceC8546r f32583a = new a();

    /* renamed from: b */
    private final List<DateFormat> f32584b;

    /* compiled from: DateTypeAdapter.java */
    /* renamed from: com.google.gson.t.n.c$a */
    static class a implements InterfaceC8546r {
        a() {
        }

        @Override // com.google.gson.InterfaceC8546r
        /* renamed from: b */
        public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
            if (c8586a.getRawType() == Date.class) {
                return new C8570c();
            }
            return null;
        }
    }

    public C8570c() {
        ArrayList arrayList = new ArrayList();
        this.f32584b = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C8559e.m27088e()) {
            arrayList.add(C8564j.m27107c(2, 2));
        }
    }

    /* renamed from: e */
    private synchronized Date m27118e(String str) {
        Iterator<DateFormat> it = this.f32584b.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C8582a.m27215c(str, new ParsePosition(0));
        } catch (ParseException e2) {
            throw new JsonSyntaxException(str, e2);
        }
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date mo26938b(C8552a c8552a) throws IOException {
        if (c8552a.mo27001Q() != EnumC8553b.NULL) {
            return m27118e(c8552a.mo27000K());
        }
        c8552a.mo26999I();
        return null;
    }

    @Override // com.google.gson.AbstractC8545q
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized void mo26939d(C8554c c8554c, Date date) throws IOException {
        if (date == null) {
            c8554c.mo27043y();
        } else {
            c8554c.mo27033Y(this.f32584b.get(0).format(date));
        }
    }
}
