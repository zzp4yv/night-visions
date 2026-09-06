package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10709a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10715g;
import kotlin.reflect.jvm.internal.impl.protobuf.C10717i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10731w;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o;

/* compiled from: GeneratedMessageLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h */
/* loaded from: classes3.dex */
public abstract class AbstractC10716h extends AbstractC10709a implements Serializable {

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f41294a;

        static {
            int[] iArr = new int[C10731w.c.values().length];
            f41294a = iArr;
            try {
                iArr[C10731w.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41294a[C10731w.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$b */
    public static abstract class b<MessageType extends AbstractC10716h, BuilderType extends b> extends AbstractC10709a.a<BuilderType> {

        /* renamed from: f */
        private AbstractC10712d f41295f = AbstractC10712d.f41263f;

        protected b() {
        }

        @Override // 
        /* renamed from: k */
        public BuilderType mo34095k() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: l */
        public final AbstractC10712d m38391l() {
            return this.f41295f;
        }

        /* renamed from: m */
        public abstract BuilderType mo34096m(MessageType messagetype);

        /* renamed from: n */
        public final BuilderType m38392n(AbstractC10712d abstractC10712d) {
            this.f41295f = abstractC10712d;
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$c */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements InterfaceC10724p {

        /* renamed from: g */
        private C10715g<e> f41296g = C10715g.m38355g();

        /* renamed from: h */
        private boolean f41297h;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public C10715g<e> m38394p() {
            this.f41296g.m38374q();
            this.f41297h = false;
            return this.f41296g;
        }

        /* renamed from: q */
        private void m38395q() {
            if (this.f41297h) {
                return;
            }
            this.f41296g = this.f41296g.clone();
            this.f41297h = true;
        }

        /* renamed from: r */
        protected final void m38396r(MessageType messagetype) {
            m38395q();
            this.f41296g.m38375r(((d) messagetype).f41298g);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$e */
    static final class e implements C10715g.b<e> {

        /* renamed from: f */
        final C10717i.b<?> f41303f;

        /* renamed from: g */
        final int f41304g;

        /* renamed from: h */
        final C10731w.b f41305h;

        /* renamed from: i */
        final boolean f41306i;

        /* renamed from: j */
        final boolean f41307j;

        e(C10717i.b<?> bVar, int i2, C10731w.b bVar2, boolean z, boolean z2) {
            this.f41303f = bVar;
            this.f41304g = i2;
            this.f41305h = bVar2;
            this.f41306i = z;
            this.f41307j = z2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10715g.b
        /* renamed from: f */
        public int mo38377f() {
            return this.f41304g;
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f41304g - eVar.f41304g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10715g.b
        /* renamed from: h */
        public boolean mo38378h() {
            return this.f41306i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10715g.b
        /* renamed from: j */
        public C10731w.b mo38379j() {
            return this.f41305h;
        }

        /* renamed from: k */
        public C10717i.b<?> m38408k() {
            return this.f41303f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10715g.b
        /* renamed from: l */
        public C10731w.c mo38380l() {
            return this.f41305h.m38497g();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10715g.b
        /* renamed from: m */
        public boolean mo38381m() {
            return this.f41307j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10715g.b
        /* renamed from: n */
        public InterfaceC10723o.a mo38382n(InterfaceC10723o.a aVar, InterfaceC10723o interfaceC10723o) {
            return ((b) aVar).mo34096m((AbstractC10716h) interfaceC10723o);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$f */
    public static class f<ContainingType extends InterfaceC10723o, Type> {

        /* renamed from: a */
        final ContainingType f41308a;

        /* renamed from: b */
        final Type f41309b;

        /* renamed from: c */
        final InterfaceC10723o f41310c;

        /* renamed from: d */
        final e f41311d;

        /* renamed from: e */
        final Class f41312e;

        /* renamed from: f */
        final Method f41313f;

        f(ContainingType containingtype, Type type, InterfaceC10723o interfaceC10723o, e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.mo38379j() == C10731w.b.f41386p && interfaceC10723o == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f41308a = containingtype;
            this.f41309b = type;
            this.f41310c = interfaceC10723o;
            this.f41311d = eVar;
            this.f41312e = cls;
            if (C10717i.a.class.isAssignableFrom(cls)) {
                this.f41313f = AbstractC10716h.m38384k(cls, "valueOf", Integer.TYPE);
            } else {
                this.f41313f = null;
            }
        }

        /* renamed from: a */
        Object m38409a(Object obj) {
            if (!this.f41311d.mo38378h()) {
                return m38413e(obj);
            }
            if (this.f41311d.mo38380l() != C10731w.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m38413e(it.next()));
            }
            return arrayList;
        }

        /* renamed from: b */
        public ContainingType m38410b() {
            return this.f41308a;
        }

        /* renamed from: c */
        public InterfaceC10723o m38411c() {
            return this.f41310c;
        }

        /* renamed from: d */
        public int m38412d() {
            return this.f41311d.mo38377f();
        }

        /* renamed from: e */
        Object m38413e(Object obj) {
            return this.f41311d.mo38380l() == C10731w.c.ENUM ? AbstractC10716h.m38385l(this.f41313f, null, (Integer) obj) : obj;
        }

        /* renamed from: f */
        Object m38414f(Object obj) {
            return this.f41311d.mo38380l() == C10731w.c.ENUM ? Integer.valueOf(((C10717i.a) obj).mo34235f()) : obj;
        }
    }

    protected AbstractC10716h() {
    }

    /* renamed from: k */
    static Method m38384k(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + valueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(valueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* renamed from: l */
    static Object m38385l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: n */
    public static <ContainingType extends InterfaceC10723o, Type> f<ContainingType, Type> m38386n(ContainingType containingtype, InterfaceC10723o interfaceC10723o, C10717i.b<?> bVar, int i2, C10731w.b bVar2, boolean z, Class cls) {
        return new f<>(containingtype, Collections.emptyList(), interfaceC10723o, new e(bVar, i2, bVar2, true, z), cls);
    }

    /* renamed from: o */
    public static <ContainingType extends InterfaceC10723o, Type> f<ContainingType, Type> m38387o(ContainingType containingtype, Type type, InterfaceC10723o interfaceC10723o, C10717i.b<?> bVar, int i2, C10731w.b bVar2, Class cls) {
        return new f<>(containingtype, type, interfaceC10723o, new e(bVar, i2, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o> boolean m38388q(kotlin.reflect.jvm.internal.impl.protobuf.C10715g<kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.e> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.C10713e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.C10714f r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h.m38388q(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10723o
    /* renamed from: g */
    public InterfaceC10725q<? extends InterfaceC10723o> mo34080g() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* renamed from: m */
    protected void mo38389m() {
    }

    /* renamed from: p */
    protected boolean mo38390p(C10713e c10713e, CodedOutputStream codedOutputStream, C10714f c10714f, int i2) throws IOException {
        return c10713e.m38323P(i2, codedOutputStream);
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d */
    public static abstract class d<MessageType extends d<MessageType>> extends AbstractC10716h implements InterfaceC10724p {

        /* renamed from: g */
        private final C10715g<e> f41298g;

        /* compiled from: GeneratedMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d$a */
        protected class a {

            /* renamed from: a */
            private final Iterator<Map.Entry<e, Object>> f41299a;

            /* renamed from: b */
            private Map.Entry<e, Object> f41300b;

            /* renamed from: c */
            private final boolean f41301c;

            /* synthetic */ a(d dVar, boolean z, a aVar) {
                this(z);
            }

            /* renamed from: a */
            public void m38406a(int i2, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<e, Object> entry = this.f41300b;
                    if (entry == null || entry.getKey().mo38377f() >= i2) {
                        return;
                    }
                    e key = this.f41300b.getKey();
                    if (this.f41301c && key.mo38380l() == C10731w.c.MESSAGE && !key.mo38378h()) {
                        codedOutputStream.m38222f0(key.mo38377f(), (InterfaceC10723o) this.f41300b.getValue());
                    } else {
                        C10715g.m38364z(key, this.f41300b.getValue(), codedOutputStream);
                    }
                    if (this.f41299a.hasNext()) {
                        this.f41300b = this.f41299a.next();
                    } else {
                        this.f41300b = null;
                    }
                }
            }

            private a(boolean z) {
                Iterator<Map.Entry<e, Object>> m38373p = d.this.f41298g.m38373p();
                this.f41299a = m38373p;
                if (m38373p.hasNext()) {
                    this.f41300b = m38373p.next();
                }
                this.f41301c = z;
            }
        }

        protected d() {
            this.f41298g = C10715g.m38359t();
        }

        /* renamed from: z */
        private void m38398z(f<MessageType, ?> fVar) {
            if (fVar.m38410b() != mo34461b()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h
        /* renamed from: m */
        protected void mo38389m() {
            this.f41298g.m38374q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10716h
        /* renamed from: p */
        protected boolean mo38390p(C10713e c10713e, CodedOutputStream codedOutputStream, C10714f c10714f, int i2) throws IOException {
            return AbstractC10716h.m38388q(this.f41298g, mo34461b(), c10713e, codedOutputStream, c10714f, i2);
        }

        /* renamed from: s */
        protected boolean m38399s() {
            return this.f41298g.m38372n();
        }

        /* renamed from: t */
        protected int m38400t() {
            return this.f41298g.m38370k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: u */
        public final <Type> Type m38401u(f<MessageType, Type> fVar) {
            m38398z(fVar);
            Object m38367h = this.f41298g.m38367h(fVar.f41311d);
            return m38367h == null ? fVar.f41309b : (Type) fVar.m38409a(m38367h);
        }

        /* renamed from: v */
        public final <Type> Type m38402v(f<MessageType, List<Type>> fVar, int i2) {
            m38398z(fVar);
            return (Type) fVar.m38413e(this.f41298g.m38368i(fVar.f41311d, i2));
        }

        /* renamed from: w */
        public final <Type> int m38403w(f<MessageType, List<Type>> fVar) {
            m38398z(fVar);
            return this.f41298g.m38369j(fVar.f41311d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: x */
        public final <Type> boolean m38404x(f<MessageType, Type> fVar) {
            m38398z(fVar);
            return this.f41298g.m38371m(fVar.f41311d);
        }

        /* renamed from: y */
        protected d<MessageType>.a m38405y() {
            return new a(this, false, null);
        }

        protected d(c<MessageType, ?> cVar) {
            this.f41298g = cVar.m38394p();
        }
    }

    protected AbstractC10716h(b bVar) {
    }
}
