package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.C0245i;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024c.p041e.C0868b;

/* compiled from: NotificationCompatBuilder.java */
/* renamed from: androidx.core.app.j */
/* loaded from: classes.dex */
class C0246j implements InterfaceC0244h {

    /* renamed from: a */
    private final Context f2140a;

    /* renamed from: b */
    private final Notification.Builder f2141b;

    /* renamed from: c */
    private final C0245i.e f2142c;

    /* renamed from: d */
    private RemoteViews f2143d;

    /* renamed from: e */
    private RemoteViews f2144e;

    /* renamed from: f */
    private final List<Bundle> f2145f = new ArrayList();

    /* renamed from: g */
    private final Bundle f2146g = new Bundle();

    /* renamed from: h */
    private int f2147h;

    /* renamed from: i */
    private RemoteViews f2148i;

    C0246j(C0245i.e eVar) {
        Icon icon;
        List<String> m1616e;
        this.f2142c = eVar;
        this.f2140a = eVar.f2110a;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.f2141b = new Notification.Builder(eVar.f2110a, eVar.f2098K);
        } else {
            this.f2141b = new Notification.Builder(eVar.f2110a);
        }
        Notification notification = eVar.f2106S;
        this.f2141b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2118i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f2114e).setContentText(eVar.f2115f).setContentInfo(eVar.f2120k).setContentIntent(eVar.f2116g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f2117h, (notification.flags & 128) != 0).setLargeIcon(eVar.f2119j).setNumber(eVar.f2121l).setProgress(eVar.f2129t, eVar.f2130u, eVar.f2131v);
        if (i2 < 21) {
            this.f2141b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.f2141b.setSubText(eVar.f2126q).setUsesChronometer(eVar.f2124o).setPriority(eVar.f2122m);
            Iterator<C0245i.a> it = eVar.f2111b.iterator();
            while (it.hasNext()) {
                m1615b(it.next());
            }
            Bundle bundle = eVar.f2091D;
            if (bundle != null) {
                this.f2146g.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (eVar.f2135z) {
                    this.f2146g.putBoolean("android.support.localOnly", true);
                }
                String str = eVar.f2132w;
                if (str != null) {
                    this.f2146g.putString("android.support.groupKey", str);
                    if (eVar.f2133x) {
                        this.f2146g.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f2146g.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = eVar.f2134y;
                if (str2 != null) {
                    this.f2146g.putString("android.support.sortKey", str2);
                }
            }
            this.f2143d = eVar.f2095H;
            this.f2144e = eVar.f2096I;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 17) {
            this.f2141b.setShowWhen(eVar.f2123n);
        }
        if (i3 >= 19 && i3 < 21 && (m1616e = m1616e(m1617g(eVar.f2112c), eVar.f2109V)) != null && !m1616e.isEmpty()) {
            this.f2146g.putStringArray("android.people", (String[]) m1616e.toArray(new String[m1616e.size()]));
        }
        if (i3 >= 20) {
            this.f2141b.setLocalOnly(eVar.f2135z).setGroup(eVar.f2132w).setGroupSummary(eVar.f2133x).setSortKey(eVar.f2134y);
            this.f2147h = eVar.f2103P;
        }
        if (i3 >= 21) {
            this.f2141b.setCategory(eVar.f2090C).setColor(eVar.f2092E).setVisibility(eVar.f2093F).setPublicVersion(eVar.f2094G).setSound(notification.sound, notification.audioAttributes);
            List m1616e2 = i3 < 28 ? m1616e(m1617g(eVar.f2112c), eVar.f2109V) : eVar.f2109V;
            if (m1616e2 != null && !m1616e2.isEmpty()) {
                Iterator it2 = m1616e2.iterator();
                while (it2.hasNext()) {
                    this.f2141b.addPerson((String) it2.next());
                }
            }
            this.f2148i = eVar.f2097J;
            if (eVar.f2113d.size() > 0) {
                Bundle bundle2 = eVar.m1591d().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle(bundle2);
                Bundle bundle4 = new Bundle();
                for (int i4 = 0; i4 < eVar.f2113d.size(); i4++) {
                    bundle4.putBundle(Integer.toString(i4), C0247k.m1623b(eVar.f2113d.get(i4)));
                }
                bundle2.putBundle("invisible_actions", bundle4);
                bundle3.putBundle("invisible_actions", bundle4);
                eVar.m1591d().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2146g.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 23 && (icon = eVar.f2108U) != null) {
            this.f2141b.setSmallIcon(icon);
        }
        if (i5 >= 24) {
            this.f2141b.setExtras(eVar.f2091D).setRemoteInputHistory(eVar.f2128s);
            RemoteViews remoteViews = eVar.f2095H;
            if (remoteViews != null) {
                this.f2141b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.f2096I;
            if (remoteViews2 != null) {
                this.f2141b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.f2097J;
            if (remoteViews3 != null) {
                this.f2141b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.f2141b.setBadgeIconType(eVar.f2099L).setSettingsText(eVar.f2127r).setShortcutId(eVar.f2100M).setTimeoutAfter(eVar.f2102O).setGroupAlertBehavior(eVar.f2103P);
            if (eVar.f2089B) {
                this.f2141b.setColorized(eVar.f2088A);
            }
            if (!TextUtils.isEmpty(eVar.f2098K)) {
                this.f2141b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator<C0249m> it3 = eVar.f2112c.iterator();
            while (it3.hasNext()) {
                this.f2141b.addPerson(it3.next().m1653h());
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            this.f2141b.setAllowSystemGeneratedContextualActions(eVar.f2104Q);
            this.f2141b.setBubbleMetadata(C0245i.d.m1577a(eVar.f2105R));
            if (eVar.f2101N != null) {
                throw null;
            }
        }
        if (eVar.f2107T) {
            if (this.f2142c.f2133x) {
                this.f2147h = 2;
            } else {
                this.f2147h = 1;
            }
            this.f2141b.setVibrate(null);
            this.f2141b.setSound(null);
            int i7 = notification.defaults & (-2);
            notification.defaults = i7;
            int i8 = i7 & (-3);
            notification.defaults = i8;
            this.f2141b.setDefaults(i8);
            if (i6 >= 26) {
                if (TextUtils.isEmpty(this.f2142c.f2132w)) {
                    this.f2141b.setGroup("silent");
                }
                this.f2141b.setGroupAlertBehavior(this.f2147h);
            }
        }
    }

    /* renamed from: b */
    private void m1615b(C0245i.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 20) {
            if (i2 >= 16) {
                this.f2145f.add(C0247k.m1627f(this.f2141b, aVar));
                return;
            }
            return;
        }
        IconCompat m1562e = aVar.m1562e();
        Notification.Action.Builder builder = i2 >= 23 ? new Notification.Action.Builder(m1562e != null ? m1562e.m1802p() : null, aVar.m1566i(), aVar.m1558a()) : new Notification.Action.Builder(m1562e != null ? m1562e.m1795e() : 0, aVar.m1566i(), aVar.m1558a());
        if (aVar.m1563f() != null) {
            for (RemoteInput remoteInput : C0250n.m1655b(aVar.m1563f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.m1561d() != null ? new Bundle(aVar.m1561d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m1559b());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            builder.setAllowGeneratedReplies(aVar.m1559b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.m1564g());
        if (i3 >= 28) {
            builder.setSemanticAction(aVar.m1564g());
        }
        if (i3 >= 29) {
            builder.setContextual(aVar.m1567j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.m1565h());
        builder.addExtras(bundle);
        this.f2141b.addAction(builder.build());
    }

    /* renamed from: e */
    private static List<String> m1616e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C0868b c0868b = new C0868b(list.size() + list2.size());
        c0868b.addAll(list);
        c0868b.addAll(list2);
        return new ArrayList(c0868b);
    }

    /* renamed from: g */
    private static List<String> m1617g(List<C0249m> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<C0249m> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m1652g());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m1618h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & (-2);
        notification.defaults = i2;
        notification.defaults = i2 & (-3);
    }

    @Override // androidx.core.app.InterfaceC0244h
    /* renamed from: a */
    public Notification.Builder mo1556a() {
        return this.f2141b;
    }

    /* renamed from: c */
    public Notification m1619c() {
        Bundle m1557a;
        RemoteViews m1613f;
        RemoteViews m1611d;
        C0245i.f fVar = this.f2142c.f2125p;
        if (fVar != null) {
            fVar.mo1568b(this);
        }
        RemoteViews m1612e = fVar != null ? fVar.m1612e(this) : null;
        Notification m1620d = m1620d();
        if (m1612e != null) {
            m1620d.contentView = m1612e;
        } else {
            RemoteViews remoteViews = this.f2142c.f2095H;
            if (remoteViews != null) {
                m1620d.contentView = remoteViews;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16 && fVar != null && (m1611d = fVar.m1611d(this)) != null) {
            m1620d.bigContentView = m1611d;
        }
        if (i2 >= 21 && fVar != null && (m1613f = this.f2142c.f2125p.m1613f(this)) != null) {
            m1620d.headsUpContentView = m1613f;
        }
        if (i2 >= 16 && fVar != null && (m1557a = C0245i.m1557a(m1620d)) != null) {
            fVar.mo1575a(m1557a);
        }
        return m1620d;
    }

    /* renamed from: d */
    protected Notification m1620d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return this.f2141b.build();
        }
        if (i2 >= 24) {
            Notification build = this.f2141b.build();
            if (this.f2147h != 0) {
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f2147h == 2) {
                    m1618h(build);
                }
                if (build.getGroup() != null && (build.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f2147h == 1) {
                    m1618h(build);
                }
            }
            return build;
        }
        if (i2 >= 21) {
            this.f2141b.setExtras(this.f2146g);
            Notification build2 = this.f2141b.build();
            RemoteViews remoteViews = this.f2143d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f2144e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f2148i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f2147h != 0) {
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f2147h == 2) {
                    m1618h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f2147h == 1) {
                    m1618h(build2);
                }
            }
            return build2;
        }
        if (i2 >= 20) {
            this.f2141b.setExtras(this.f2146g);
            Notification build3 = this.f2141b.build();
            RemoteViews remoteViews4 = this.f2143d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f2144e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f2147h != 0) {
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f2147h == 2) {
                    m1618h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f2147h == 1) {
                    m1618h(build3);
                }
            }
            return build3;
        }
        if (i2 >= 19) {
            SparseArray<Bundle> m1622a = C0247k.m1622a(this.f2145f);
            if (m1622a != null) {
                this.f2146g.putSparseParcelableArray("android.support.actionExtras", m1622a);
            }
            this.f2141b.setExtras(this.f2146g);
            Notification build4 = this.f2141b.build();
            RemoteViews remoteViews6 = this.f2143d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f2144e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        }
        if (i2 < 16) {
            return this.f2141b.getNotification();
        }
        Notification build5 = this.f2141b.build();
        Bundle m1557a = C0245i.m1557a(build5);
        Bundle bundle = new Bundle(this.f2146g);
        for (String str : this.f2146g.keySet()) {
            if (m1557a.containsKey(str)) {
                bundle.remove(str);
            }
        }
        m1557a.putAll(bundle);
        SparseArray<Bundle> m1622a2 = C0247k.m1622a(this.f2145f);
        if (m1622a2 != null) {
            C0245i.m1557a(build5).putSparseParcelableArray("android.support.actionExtras", m1622a2);
        }
        RemoteViews remoteViews8 = this.f2143d;
        if (remoteViews8 != null) {
            build5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.f2144e;
        if (remoteViews9 != null) {
            build5.bigContentView = remoteViews9;
        }
        return build5;
    }

    /* renamed from: f */
    Context m1621f() {
        return this.f2140a;
    }
}
