package p345i.p346a.p347g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p345i.p346a.p347g.p348s.EnumC9176d;
import p345i.p346a.p347g.p348s.EnumC9177e;

/* compiled from: DNSCache.java */
/* renamed from: i.a.g.a */
/* loaded from: classes2.dex */
public class C9155a extends ConcurrentHashMap<String, List<AbstractC9156b>> {
    public C9155a(C9155a c9155a) {
        this(c9155a != null ? c9155a.size() : 1024);
        if (c9155a != null) {
            putAll(c9155a);
        }
    }

    /* renamed from: a */
    private Collection<? extends AbstractC9156b> m29436a(String str) {
        return get(str != null ? str.toLowerCase() : null);
    }

    /* renamed from: b */
    public boolean m29437b(AbstractC9156b abstractC9156b) {
        if (abstractC9156b == null) {
            return false;
        }
        List<AbstractC9156b> list = get(abstractC9156b.m29446b());
        if (list == null) {
            putIfAbsent(abstractC9156b.m29446b(), new ArrayList());
            list = get(abstractC9156b.m29446b());
        }
        synchronized (list) {
            list.add(abstractC9156b);
        }
        return true;
    }

    /* renamed from: c */
    public Collection<AbstractC9156b> m29438c() {
        ArrayList arrayList = new ArrayList();
        for (List<AbstractC9156b> list : values()) {
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        return arrayList;
    }

    @Override // java.util.AbstractMap
    protected Object clone() throws CloneNotSupportedException {
        return new C9155a(this);
    }

    /* renamed from: d */
    public AbstractC9156b m29439d(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d) {
        Collection<? extends AbstractC9156b> m29436a = m29436a(str);
        AbstractC9156b abstractC9156b = null;
        if (m29436a != null) {
            synchronized (m29436a) {
                Iterator<? extends AbstractC9156b> it = m29436a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC9156b next = it.next();
                    if (next.m29464t(enumC9177e) && next.m29463s(enumC9176d)) {
                        abstractC9156b = next;
                        break;
                    }
                }
            }
        }
        return abstractC9156b;
    }

    /* renamed from: e */
    public AbstractC9156b m29440e(AbstractC9156b abstractC9156b) {
        Collection<? extends AbstractC9156b> m29436a;
        AbstractC9156b abstractC9156b2 = null;
        if (abstractC9156b != null && (m29436a = m29436a(abstractC9156b.m29446b())) != null) {
            synchronized (m29436a) {
                Iterator<? extends AbstractC9156b> it = m29436a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC9156b next = it.next();
                    if (next.mo29456l(abstractC9156b)) {
                        abstractC9156b2 = next;
                        break;
                    }
                }
            }
        }
        return abstractC9156b2;
    }

    /* renamed from: f */
    public Collection<? extends AbstractC9156b> m29441f(String str) {
        ArrayList arrayList;
        Collection<? extends AbstractC9156b> m29436a = m29436a(str);
        if (m29436a == null) {
            return Collections.emptyList();
        }
        synchronized (m29436a) {
            arrayList = new ArrayList(m29436a);
        }
        return arrayList;
    }

    /* renamed from: h */
    public Collection<? extends AbstractC9156b> m29442h(String str, EnumC9177e enumC9177e, EnumC9176d enumC9176d) {
        ArrayList arrayList;
        Collection<? extends AbstractC9156b> m29436a = m29436a(str);
        if (m29436a == null) {
            return Collections.emptyList();
        }
        synchronized (m29436a) {
            arrayList = new ArrayList(m29436a);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC9156b abstractC9156b = (AbstractC9156b) it.next();
                if (!abstractC9156b.m29464t(enumC9177e) || !abstractC9156b.m29463s(enumC9176d)) {
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public boolean m29443i(AbstractC9156b abstractC9156b) {
        List<AbstractC9156b> list;
        if (abstractC9156b == null || (list = get(abstractC9156b.m29446b())) == null) {
            return false;
        }
        synchronized (list) {
            list.remove(abstractC9156b);
        }
        return false;
    }

    /* renamed from: j */
    public boolean m29444j(AbstractC9156b abstractC9156b, AbstractC9156b abstractC9156b2) {
        if (abstractC9156b == null || abstractC9156b2 == null || !abstractC9156b.m29446b().equals(abstractC9156b2.m29446b())) {
            return false;
        }
        List<AbstractC9156b> list = get(abstractC9156b.m29446b());
        if (list == null) {
            putIfAbsent(abstractC9156b.m29446b(), new ArrayList());
            list = get(abstractC9156b.m29446b());
        }
        synchronized (list) {
            list.remove(abstractC9156b2);
            list.add(abstractC9156b);
        }
        return true;
    }

    @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap
    public synchronized String toString() {
        StringBuffer stringBuffer;
        stringBuffer = new StringBuffer(2000);
        stringBuffer.append("\t---- cache ----");
        Enumeration keys = keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            stringBuffer.append("\n\t\t");
            stringBuffer.append("\n\t\tname '");
            stringBuffer.append(str);
            stringBuffer.append("' ");
            List<AbstractC9156b> list = (List) get(str);
            if (list == null || list.isEmpty()) {
                stringBuffer.append(" no entries");
            } else {
                synchronized (list) {
                    for (AbstractC9156b abstractC9156b : list) {
                        stringBuffer.append("\n\t\t\t");
                        stringBuffer.append(abstractC9156b.toString());
                    }
                }
            }
        }
        return stringBuffer.toString();
    }

    public C9155a(int i2) {
        super(i2);
    }
}
