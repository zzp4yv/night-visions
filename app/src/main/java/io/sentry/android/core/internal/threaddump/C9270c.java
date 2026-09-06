package io.sentry.android.core.internal.threaddump;

import io.sentry.C9561t4;
import io.sentry.C9647x4;
import io.sentry.C9659z4;
import io.sentry.EnumC9554s4;
import io.sentry.protocol.C9529u;
import io.sentry.protocol.C9530v;
import io.sentry.protocol.C9531w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;

/* compiled from: ThreadDumpParser.java */
/* renamed from: io.sentry.android.core.internal.threaddump.c */
/* loaded from: classes2.dex */
public class C9270c {

    /* renamed from: a */
    private static final Pattern f35965a = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* renamed from: b */
    private static final Pattern f35966b = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* renamed from: c */
    private static final Pattern f35967c = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*?)\\s+\\((.*)\\+(\\d+)\\)(?: \\(.*\\))?");

    /* renamed from: d */
    private static final Pattern f35968d = Pattern.compile(" *(?:native: )?#\\d+ \\S+ [0-9a-fA-F]+\\s+(.*)\\s*\\(?(.*)\\)?(?: \\(.*\\))?");

    /* renamed from: e */
    private static final Pattern f35969e = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* renamed from: f */
    private static final Pattern f35970f = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* renamed from: g */
    private static final Pattern f35971g = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: h */
    private static final Pattern f35972h = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: i */
    private static final Pattern f35973i = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: j */
    private static final Pattern f35974j = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* renamed from: k */
    private static final Pattern f35975k = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* renamed from: l */
    private static final Pattern f35976l = Pattern.compile(" *- waiting to lock an unknown object");

    /* renamed from: m */
    private static final Pattern f35977m = Pattern.compile("\\s+");

    /* renamed from: n */
    private final C9647x4 f35978n;

    /* renamed from: o */
    private final boolean f35979o;

    /* renamed from: p */
    private final C9659z4 f35980p;

    public C9270c(C9647x4 c9647x4, boolean z) {
        this.f35978n = c9647x4;
        this.f35979o = z;
        this.f35980p = new C9659z4(c9647x4);
    }

    /* renamed from: a */
    private void m30264a(C9531w c9531w, C9561t4 c9561t4) {
        Map<String, C9561t4> m31515k = c9531w.m31515k();
        if (m31515k == null) {
            m31515k = new HashMap<>();
        }
        C9561t4 c9561t42 = m31515k.get(c9561t4.m31641f());
        if (c9561t42 != null) {
            c9561t42.m31647l(Math.max(c9561t42.m31642g(), c9561t4.m31642g()));
        } else {
            m31515k.put(c9561t4.m31641f(), new C9561t4(c9561t4));
        }
        c9531w.m31524t(m31515k);
    }

    /* renamed from: b */
    private Integer m30265b(Matcher matcher, int i2, Integer num) {
        String group = matcher.group(i2);
        return (group == null || group.length() == 0) ? num : Integer.valueOf(Integer.parseInt(group));
    }

    /* renamed from: c */
    private Long m30266c(Matcher matcher, int i2, Long l) {
        String group = matcher.group(i2);
        return (group == null || group.length() == 0) ? l : Long.valueOf(Long.parseLong(group));
    }

    /* renamed from: d */
    private Integer m30267d(Matcher matcher, int i2, Integer num) {
        String group = matcher.group(i2);
        if (group == null || group.length() == 0) {
            return num;
        }
        Integer valueOf = Integer.valueOf(Integer.parseInt(group));
        return valueOf.intValue() >= 0 ? valueOf : num;
    }

    /* renamed from: e */
    private boolean m30268e(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* renamed from: g */
    private C9530v m30269g(C9269b c9269b, C9531w c9531w) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f35967c.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher3 = f35968d.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher4 = f35969e.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher5 = f35970f.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher6 = f35971g.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher7 = f35973i.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher8 = f35972h.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher9 = f35975k.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher10 = f35974j.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher11 = f35976l.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher12 = f35977m.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        C9529u c9529u = null;
        while (true) {
            if (!c9269b.m30261a()) {
                break;
            }
            C9268a m30262b = c9269b.m30262b();
            Matcher matcher13 = matcher12;
            if (m30262b == null) {
                this.f35978n.getLogger().mo30214c(EnumC9554s4.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = m30262b.f35960b;
            if (m30268e(matcher2, str)) {
                C9529u c9529u2 = new C9529u();
                c9529u2.m31494y(matcher2.group(1));
                c9529u2.m31488s(matcher2.group(2));
                c9529u2.m31490u(m30265b(matcher2, 3, null));
                arrayList.add(c9529u2);
            } else if (m30268e(matcher3, str)) {
                C9529u c9529u3 = new C9529u();
                c9529u3.m31494y(matcher3.group(1));
                c9529u3.m31488s(matcher3.group(2));
                arrayList.add(c9529u3);
            } else {
                matcher = matcher2;
                if (m30268e(matcher4, str)) {
                    c9529u = new C9529u();
                    String format = String.format("%s.%s", matcher4.group(1), matcher4.group(2));
                    c9529u.m31492w(format);
                    c9529u.m31488s(matcher4.group(3));
                    c9529u.m31487r(matcher4.group(4));
                    c9529u.m31490u(m30267d(matcher4, 5, null));
                    c9529u.m31489t(this.f35980p.m31961b(format));
                    arrayList.add(c9529u);
                } else if (m30268e(matcher5, str)) {
                    c9529u = new C9529u();
                    String format2 = String.format("%s.%s", matcher5.group(1), matcher5.group(2));
                    c9529u.m31492w(format2);
                    c9529u.m31488s(matcher5.group(3));
                    c9529u.m31489t(this.f35980p.m31961b(format2));
                    arrayList.add(c9529u);
                } else if (m30268e(matcher6, str)) {
                    if (c9529u != null) {
                        C9561t4 c9561t4 = new C9561t4();
                        c9561t4.m31647l(1);
                        c9561t4.m31643h(matcher6.group(1));
                        c9561t4.m31645j(matcher6.group(2));
                        c9561t4.m31644i(matcher6.group(3));
                        c9529u.m31491v(c9561t4);
                        m30264a(c9531w, c9561t4);
                    }
                } else if (m30268e(matcher7, str)) {
                    if (c9529u != null) {
                        C9561t4 c9561t42 = new C9561t4();
                        c9561t42.m31647l(2);
                        c9561t42.m31643h(matcher7.group(1));
                        c9561t42.m31645j(matcher7.group(2));
                        c9561t42.m31644i(matcher7.group(3));
                        c9529u.m31491v(c9561t42);
                        m30264a(c9531w, c9561t42);
                    }
                } else if (!m30268e(matcher8, str)) {
                    if (!m30268e(matcher9, str)) {
                        if (!m30268e(matcher10, str)) {
                            if (!m30268e(matcher11, str)) {
                                if (str.length() == 0) {
                                    break;
                                }
                                matcher12 = matcher13;
                                if (m30268e(matcher12, str)) {
                                    break;
                                }
                                matcher2 = matcher;
                            } else if (c9529u != null) {
                                C9561t4 c9561t43 = new C9561t4();
                                c9561t43.m31647l(8);
                                c9529u.m31491v(c9561t43);
                                m30264a(c9531w, c9561t43);
                            }
                        } else if (c9529u != null) {
                            C9561t4 c9561t44 = new C9561t4();
                            c9561t44.m31647l(8);
                            c9561t44.m31643h(matcher10.group(1));
                            c9561t44.m31645j(matcher10.group(2));
                            c9561t44.m31644i(matcher10.group(3));
                            c9529u.m31491v(c9561t44);
                            m30264a(c9531w, c9561t44);
                        }
                    } else if (c9529u != null) {
                        C9561t4 c9561t45 = new C9561t4();
                        c9561t45.m31647l(8);
                        c9561t45.m31643h(matcher9.group(1));
                        c9561t45.m31645j(matcher9.group(2));
                        c9561t45.m31644i(matcher9.group(3));
                        c9561t45.m31646k(m30266c(matcher9, 4, null));
                        c9529u.m31491v(c9561t45);
                        m30264a(c9531w, c9561t45);
                    }
                    matcher12 = matcher13;
                    matcher2 = matcher;
                } else if (c9529u != null) {
                    C9561t4 c9561t46 = new C9561t4();
                    c9561t46.m31647l(4);
                    c9561t46.m31643h(matcher8.group(1));
                    c9561t46.m31645j(matcher8.group(2));
                    c9561t46.m31644i(matcher8.group(3));
                    c9529u.m31491v(c9561t46);
                    m30264a(c9531w, c9561t46);
                }
                matcher12 = matcher13;
                matcher2 = matcher;
            }
            matcher = matcher2;
            matcher12 = matcher13;
            c9529u = null;
            matcher2 = matcher;
        }
        Collections.reverse(arrayList);
        C9530v c9530v = new C9530v(arrayList);
        c9530v.m31501e(Boolean.TRUE);
        return c9530v;
    }

    /* renamed from: h */
    private C9531w m30270h(C9269b c9269b) {
        C9531w c9531w = new C9531w();
        Matcher matcher = f35965a.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher2 = f35966b.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        if (!c9269b.m30261a()) {
            return null;
        }
        C9268a m30262b = c9269b.m30262b();
        boolean z = false;
        if (m30262b == null) {
            this.f35978n.getLogger().mo30214c(EnumC9554s4.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (m30268e(matcher, m30262b.f35960b)) {
            Long m30266c = m30266c(matcher, 4, null);
            if (m30266c == null) {
                this.f35978n.getLogger().mo30214c(EnumC9554s4.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            c9531w.m31525u(m30266c);
            c9531w.m31527w(matcher.group(1));
            String group = matcher.group(5);
            if (group != null) {
                if (group.contains(" ")) {
                    c9531w.m31530z(group.substring(0, group.indexOf(32)));
                } else {
                    c9531w.m31530z(group);
                }
            }
        } else if (m30268e(matcher2, m30262b.f35960b)) {
            Long m30266c2 = m30266c(matcher2, 3, null);
            if (m30266c2 == null) {
                this.f35978n.getLogger().mo30214c(EnumC9554s4.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            c9531w.m31525u(m30266c2);
            c9531w.m31527w(matcher2.group(1));
        }
        String m31517m = c9531w.m31517m();
        if (m31517m != null) {
            boolean equals = m31517m.equals("main");
            c9531w.m31526v(Boolean.valueOf(equals));
            c9531w.m31521q(Boolean.valueOf(equals));
            if (equals && !this.f35979o) {
                z = true;
            }
            c9531w.m31522r(Boolean.valueOf(z));
        }
        c9531w.m31529y(m30269g(c9269b, c9531w));
        return c9531w;
    }

    /* renamed from: f */
    public List<C9531w> m30271f(C9269b c9269b) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = f35965a.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        Matcher matcher2 = f35966b.matcher(HttpUrl.FRAGMENT_ENCODE_SET);
        while (c9269b.m30261a()) {
            C9268a m30262b = c9269b.m30262b();
            if (m30262b == null) {
                this.f35978n.getLogger().mo30214c(EnumC9554s4.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return arrayList;
            }
            String str = m30262b.f35960b;
            if (m30268e(matcher, str) || m30268e(matcher2, str)) {
                c9269b.m30263d();
                C9531w m30270h = m30270h(c9269b);
                if (m30270h != null) {
                    arrayList.add(m30270h);
                }
            }
        }
        return arrayList;
    }
}
