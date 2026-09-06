package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8538j;
import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.C8541m;
import com.google.gson.InterfaceC8546r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p215t.AbstractC8560f;
import com.google.gson.p215t.C8556b;
import com.google.gson.p215t.C8557c;
import com.google.gson.p215t.C8566l;
import com.google.gson.p215t.InterfaceC8563i;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: MapTypeAdapterFactory.java */
/* renamed from: com.google.gson.t.n.g */
/* loaded from: classes2.dex */
public final class C8574g implements InterfaceC8546r {

    /* renamed from: f */
    private final C8557c f32597f;

    /* renamed from: g */
    final boolean f32598g;

    /* compiled from: MapTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.g$a */
    private final class a<K, V> extends AbstractC8545q<Map<K, V>> {

        /* renamed from: a */
        private final AbstractC8545q<K> f32599a;

        /* renamed from: b */
        private final AbstractC8545q<V> f32600b;

        /* renamed from: c */
        private final InterfaceC8563i<? extends Map<K, V>> f32601c;

        public a(C8533e c8533e, Type type, AbstractC8545q<K> abstractC8545q, Type type2, AbstractC8545q<V> abstractC8545q2, InterfaceC8563i<? extends Map<K, V>> interfaceC8563i) {
            this.f32599a = new C8580m(c8533e, abstractC8545q, type);
            this.f32600b = new C8580m(c8533e, abstractC8545q2, type2);
            this.f32601c = interfaceC8563i;
        }

        /* renamed from: e */
        private String m27132e(AbstractC8538j abstractC8538j) {
            if (!abstractC8538j.m26960o()) {
                if (abstractC8538j.m26958i()) {
                    return "null";
                }
                throw new AssertionError();
            }
            C8541m m26956g = abstractC8538j.m26956g();
            if (m26956g.m26975z()) {
                return String.valueOf(m26956g.m26972v());
            }
            if (m26956g.m26974x()) {
                return Boolean.toString(m26956g.m26967q());
            }
            if (m26956g.m26965C()) {
                return m26956g.m26973w();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<K, V> mo26938b(C8552a c8552a) throws IOException {
            EnumC8553b mo27001Q = c8552a.mo27001Q();
            if (mo27001Q == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            Map<K, V> mo27071a = this.f32601c.mo27071a();
            if (mo27001Q == EnumC8553b.BEGIN_ARRAY) {
                c8552a.mo27002a();
                while (c8552a.mo27009l()) {
                    c8552a.mo27002a();
                    K mo26938b = this.f32599a.mo26938b(c8552a);
                    if (mo27071a.put(mo26938b, this.f32600b.mo26938b(c8552a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + mo26938b);
                    }
                    c8552a.mo27006f();
                }
                c8552a.mo27006f();
            } else {
                c8552a.mo27004b();
                while (c8552a.mo27009l()) {
                    AbstractC8560f.f32541a.mo27015a(c8552a);
                    K mo26938b2 = this.f32599a.mo26938b(c8552a);
                    if (mo27071a.put(mo26938b2, this.f32600b.mo26938b(c8552a)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + mo26938b2);
                    }
                }
                c8552a.mo27008j();
            }
            return mo27071a;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void mo26939d(C8554c c8554c, Map<K, V> map) throws IOException {
            if (map == null) {
                c8554c.mo27043y();
                return;
            }
            if (!C8574g.this.f32598g) {
                c8554c.mo27036d();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    c8554c.mo27042p(String.valueOf(entry.getKey()));
                    this.f32600b.mo26939d(c8554c, entry.getValue());
                }
                c8554c.mo27038j();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i2 = 0;
            boolean z = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                AbstractC8538j m26978c = this.f32599a.m26978c(entry2.getKey());
                arrayList.add(m26978c);
                arrayList2.add(entry2.getValue());
                z |= m26978c.m26957h() || m26978c.m26959n();
            }
            if (!z) {
                c8554c.mo27036d();
                int size = arrayList.size();
                while (i2 < size) {
                    c8554c.mo27042p(m27132e((AbstractC8538j) arrayList.get(i2)));
                    this.f32600b.mo26939d(c8554c, arrayList2.get(i2));
                    i2++;
                }
                c8554c.mo27038j();
                return;
            }
            c8554c.mo27035c();
            int size2 = arrayList.size();
            while (i2 < size2) {
                c8554c.mo27035c();
                C8566l.m27111b((AbstractC8538j) arrayList.get(i2), c8554c);
                this.f32600b.mo26939d(c8554c, arrayList2.get(i2));
                c8554c.mo27037f();
                i2++;
            }
            c8554c.mo27037f();
        }
    }

    public C8574g(C8557c c8557c, boolean z) {
        this.f32597f = c8557c;
        this.f32598g = z;
    }

    /* renamed from: a */
    private AbstractC8545q<?> m27131a(C8533e c8533e, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? C8581n.f32669f : c8533e.m26926j(C8586a.get(type));
    }

    @Override // com.google.gson.InterfaceC8546r
    /* renamed from: b */
    public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
        Type type = c8586a.getType();
        if (!Map.class.isAssignableFrom(c8586a.getRawType())) {
            return null;
        }
        Type[] m27055j = C8556b.m27055j(type, C8556b.m27056k(type));
        return new a(c8533e, m27055j[0], m27131a(c8533e, m27055j[0]), m27055j[1], c8533e.m26926j(C8586a.get(m27055j[1])), this.f32597f.m27070a(c8586a));
    }
}
