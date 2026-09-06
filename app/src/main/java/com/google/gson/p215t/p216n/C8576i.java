package com.google.gson.p215t.p216n;

import com.google.gson.AbstractC8545q;
import com.google.gson.C8533e;
import com.google.gson.InterfaceC8532d;
import com.google.gson.InterfaceC8546r;
import com.google.gson.JsonSyntaxException;
import com.google.gson.p214s.InterfaceC8548b;
import com.google.gson.p214s.InterfaceC8549c;
import com.google.gson.p215t.C8556b;
import com.google.gson.p215t.C8557c;
import com.google.gson.p215t.C8558d;
import com.google.gson.p215t.C8565k;
import com.google.gson.p215t.InterfaceC8563i;
import com.google.gson.p215t.p218o.AbstractC8584b;
import com.google.gson.p219u.C8586a;
import com.google.gson.stream.C8552a;
import com.google.gson.stream.C8554c;
import com.google.gson.stream.EnumC8553b;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: ReflectiveTypeAdapterFactory.java */
/* renamed from: com.google.gson.t.n.i */
/* loaded from: classes2.dex */
public final class C8576i implements InterfaceC8546r {

    /* renamed from: f */
    private final C8557c f32606f;

    /* renamed from: g */
    private final InterfaceC8532d f32607g;

    /* renamed from: h */
    private final C8558d f32608h;

    /* renamed from: i */
    private final C8571d f32609i;

    /* renamed from: j */
    private final AbstractC8584b f32610j = AbstractC8584b.m27218a();

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.i$a */
    class a extends c {

        /* renamed from: d */
        final /* synthetic */ Field f32611d;

        /* renamed from: e */
        final /* synthetic */ boolean f32612e;

        /* renamed from: f */
        final /* synthetic */ AbstractC8545q f32613f;

        /* renamed from: g */
        final /* synthetic */ C8533e f32614g;

        /* renamed from: h */
        final /* synthetic */ C8586a f32615h;

        /* renamed from: i */
        final /* synthetic */ boolean f32616i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, boolean z2, Field field, boolean z3, AbstractC8545q abstractC8545q, C8533e c8533e, C8586a c8586a, boolean z4) {
            super(str, z, z2);
            this.f32611d = field;
            this.f32612e = z3;
            this.f32613f = abstractC8545q;
            this.f32614g = c8533e;
            this.f32615h = c8586a;
            this.f32616i = z4;
        }

        @Override // com.google.gson.p215t.p216n.C8576i.c
        /* renamed from: a */
        void mo27140a(C8552a c8552a, Object obj) throws IOException, IllegalAccessException {
            Object mo26938b = this.f32613f.mo26938b(c8552a);
            if (mo26938b == null && this.f32616i) {
                return;
            }
            this.f32611d.set(obj, mo26938b);
        }

        @Override // com.google.gson.p215t.p216n.C8576i.c
        /* renamed from: b */
        void mo27141b(C8554c c8554c, Object obj) throws IOException, IllegalAccessException {
            (this.f32612e ? this.f32613f : new C8580m(this.f32614g, this.f32613f, this.f32615h.getType())).mo26939d(c8554c, this.f32611d.get(obj));
        }

        @Override // com.google.gson.p215t.p216n.C8576i.c
        /* renamed from: c */
        public boolean mo27142c(Object obj) throws IOException, IllegalAccessException {
            return this.f32621b && this.f32611d.get(obj) != obj;
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.i$b */
    public static final class b<T> extends AbstractC8545q<T> {

        /* renamed from: a */
        private final InterfaceC8563i<T> f32618a;

        /* renamed from: b */
        private final Map<String, c> f32619b;

        b(InterfaceC8563i<T> interfaceC8563i, Map<String, c> map) {
            this.f32618a = interfaceC8563i;
            this.f32619b = map;
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: b */
        public T mo26938b(C8552a c8552a) throws IOException {
            if (c8552a.mo27001Q() == EnumC8553b.NULL) {
                c8552a.mo26999I();
                return null;
            }
            T mo27071a = this.f32618a.mo27071a();
            try {
                c8552a.mo27004b();
                while (c8552a.mo27009l()) {
                    c cVar = this.f32619b.get(c8552a.mo26998D());
                    if (cVar != null && cVar.f32622c) {
                        cVar.mo27140a(c8552a, mo27071a);
                    }
                    c8552a.mo27011n0();
                }
                c8552a.mo27008j();
                return mo27071a;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new JsonSyntaxException(e3);
            }
        }

        @Override // com.google.gson.AbstractC8545q
        /* renamed from: d */
        public void mo26939d(C8554c c8554c, T t) throws IOException {
            if (t == null) {
                c8554c.mo27043y();
                return;
            }
            c8554c.mo27036d();
            try {
                for (c cVar : this.f32619b.values()) {
                    if (cVar.mo27142c(t)) {
                        c8554c.mo27042p(cVar.f32620a);
                        cVar.mo27141b(c8554c, t);
                    }
                }
                c8554c.mo27038j();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* compiled from: ReflectiveTypeAdapterFactory.java */
    /* renamed from: com.google.gson.t.n.i$c */
    static abstract class c {

        /* renamed from: a */
        final String f32620a;

        /* renamed from: b */
        final boolean f32621b;

        /* renamed from: c */
        final boolean f32622c;

        protected c(String str, boolean z, boolean z2) {
            this.f32620a = str;
            this.f32621b = z;
            this.f32622c = z2;
        }

        /* renamed from: a */
        abstract void mo27140a(C8552a c8552a, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: b */
        abstract void mo27141b(C8554c c8554c, Object obj) throws IOException, IllegalAccessException;

        /* renamed from: c */
        abstract boolean mo27142c(Object obj) throws IOException, IllegalAccessException;
    }

    public C8576i(C8557c c8557c, InterfaceC8532d interfaceC8532d, C8558d c8558d, C8571d c8571d) {
        this.f32606f = c8557c;
        this.f32607g = interfaceC8532d;
        this.f32608h = c8558d;
        this.f32609i = c8571d;
    }

    /* renamed from: a */
    private c m27135a(C8533e c8533e, Field field, String str, C8586a<?> c8586a, boolean z, boolean z2) {
        boolean m27109b = C8565k.m27109b(c8586a.getRawType());
        InterfaceC8548b interfaceC8548b = (InterfaceC8548b) field.getAnnotation(InterfaceC8548b.class);
        AbstractC8545q<?> m27121a = interfaceC8548b != null ? this.f32609i.m27121a(this.f32606f, c8533e, c8586a, interfaceC8548b) : null;
        boolean z3 = m27121a != null;
        if (m27121a == null) {
            m27121a = c8533e.m26926j(c8586a);
        }
        return new a(str, z, z2, field, z3, m27121a, c8533e, c8586a, m27109b);
    }

    /* renamed from: d */
    static boolean m27136d(Field field, boolean z, C8558d c8558d) {
        return (c8558d.m27081e(field.getType(), z) || c8558d.m27082h(field, z)) ? false : true;
    }

    /* renamed from: e */
    private Map<String, c> m27137e(C8533e c8533e, C8586a<?> c8586a, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = c8586a.getType();
        C8586a<?> c8586a2 = c8586a;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                boolean m27139c = m27139c(field, true);
                boolean m27139c2 = m27139c(field, z);
                if (m27139c || m27139c2) {
                    this.f32610j.mo27217b(field);
                    Type m27061p = C8556b.m27061p(c8586a2.getType(), cls2, field.getGenericType());
                    List<String> m27138f = m27138f(field);
                    int size = m27138f.size();
                    c cVar = null;
                    int i3 = 0;
                    while (i3 < size) {
                        String str = m27138f.get(i3);
                        boolean z2 = i3 != 0 ? false : m27139c;
                        int i4 = i3;
                        c cVar2 = cVar;
                        int i5 = size;
                        List<String> list = m27138f;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, m27135a(c8533e, field, str, C8586a.get(m27061p), z2, m27139c2)) : cVar2;
                        i3 = i4 + 1;
                        m27139c = z2;
                        m27138f = list;
                        size = i5;
                        field = field2;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + cVar3.f32620a);
                    }
                }
                i2++;
                z = false;
            }
            c8586a2 = C8586a.get(C8556b.m27061p(c8586a2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = c8586a2.getRawType();
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    private List<String> m27138f(Field field) {
        InterfaceC8549c interfaceC8549c = (InterfaceC8549c) field.getAnnotation(InterfaceC8549c.class);
        if (interfaceC8549c == null) {
            return Collections.singletonList(this.f32607g.mo26915g(field));
        }
        String value = interfaceC8549c.value();
        String[] alternate = interfaceC8549c.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.InterfaceC8546r
    /* renamed from: b */
    public <T> AbstractC8545q<T> mo26979b(C8533e c8533e, C8586a<T> c8586a) {
        Class<? super T> rawType = c8586a.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new b(this.f32606f.m27070a(c8586a), m27137e(c8533e, c8586a, rawType));
        }
        return null;
    }

    /* renamed from: c */
    public boolean m27139c(Field field, boolean z) {
        return m27136d(field, z, this.f32608h);
    }
}
