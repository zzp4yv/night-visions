package p024c.p088x;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p024c.p088x.AbstractC1047m;
import p024c.p088x.C1023a;

/* compiled from: Visibility.java */
/* renamed from: c.x.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC1042j0 extends AbstractC1047m {

    /* renamed from: P */
    private static final String[] f6848P = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: Q */
    private int f6849Q = 3;

    /* compiled from: Visibility.java */
    /* renamed from: c.x.j0$a */
    class a extends C1049n {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f6850a;

        /* renamed from: b */
        final /* synthetic */ View f6851b;

        /* renamed from: c */
        final /* synthetic */ View f6852c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f6850a = viewGroup;
            this.f6851b = view;
            this.f6852c = view2;
        }

        @Override // p024c.p088x.C1049n, p024c.p088x.AbstractC1047m.f
        /* renamed from: b */
        public void mo6554b(AbstractC1047m abstractC1047m) {
            C1059x.m6679a(this.f6850a).mo6678d(this.f6851b);
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: c */
        public void mo6555c(AbstractC1047m abstractC1047m) {
            this.f6852c.setTag(C1041j.f6845b, null);
            C1059x.m6679a(this.f6850a).mo6678d(this.f6851b);
            abstractC1047m.mo6628T(this);
        }

        @Override // p024c.p088x.C1049n, p024c.p088x.AbstractC1047m.f
        /* renamed from: e */
        public void mo6557e(AbstractC1047m abstractC1047m) {
            if (this.f6851b.getParent() == null) {
                C1059x.m6679a(this.f6850a).mo6677c(this.f6851b);
            } else {
                AbstractC1042j0.this.cancel();
            }
        }
    }

    /* compiled from: Visibility.java */
    /* renamed from: c.x.j0$b */
    private static class b extends AnimatorListenerAdapter implements AbstractC1047m.f, C1023a.a {

        /* renamed from: a */
        private final View f6854a;

        /* renamed from: b */
        private final int f6855b;

        /* renamed from: c */
        private final ViewGroup f6856c;

        /* renamed from: d */
        private final boolean f6857d;

        /* renamed from: e */
        private boolean f6858e;

        /* renamed from: f */
        boolean f6859f = false;

        b(View view, int i2, boolean z) {
            this.f6854a = view;
            this.f6855b = i2;
            this.f6856c = (ViewGroup) view.getParent();
            this.f6857d = z;
            m6602g(true);
        }

        /* renamed from: f */
        private void m6601f() {
            if (!this.f6859f) {
                C1028c0.m6568h(this.f6854a, this.f6855b);
                ViewGroup viewGroup = this.f6856c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m6602g(false);
        }

        /* renamed from: g */
        private void m6602g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f6857d || this.f6858e == z || (viewGroup = this.f6856c) == null) {
                return;
            }
            this.f6858e = z;
            C1059x.m6681c(viewGroup, z);
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: a */
        public void mo6584a(AbstractC1047m abstractC1047m) {
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: b */
        public void mo6554b(AbstractC1047m abstractC1047m) {
            m6602g(false);
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: c */
        public void mo6555c(AbstractC1047m abstractC1047m) {
            m6601f();
            abstractC1047m.mo6628T(this);
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: d */
        public void mo6556d(AbstractC1047m abstractC1047m) {
        }

        @Override // p024c.p088x.AbstractC1047m.f
        /* renamed from: e */
        public void mo6557e(AbstractC1047m abstractC1047m) {
            m6602g(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6859f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m6601f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p024c.p088x.C1023a.a
        public void onAnimationPause(Animator animator) {
            if (this.f6859f) {
                return;
            }
            C1028c0.m6568h(this.f6854a, this.f6855b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, p024c.p088x.C1023a.a
        public void onAnimationResume(Animator animator) {
            if (this.f6859f) {
                return;
            }
            C1028c0.m6568h(this.f6854a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility.java */
    /* renamed from: c.x.j0$c */
    private static class c {

        /* renamed from: a */
        boolean f6860a;

        /* renamed from: b */
        boolean f6861b;

        /* renamed from: c */
        int f6862c;

        /* renamed from: d */
        int f6863d;

        /* renamed from: e */
        ViewGroup f6864e;

        /* renamed from: f */
        ViewGroup f6865f;

        c() {
        }
    }

    /* renamed from: k0 */
    private void m6595k0(C1054s c1054s) {
        c1054s.f6933a.put("android:visibility:visibility", Integer.valueOf(c1054s.f6934b.getVisibility()));
        c1054s.f6933a.put("android:visibility:parent", c1054s.f6934b.getParent());
        int[] iArr = new int[2];
        c1054s.f6934b.getLocationOnScreen(iArr);
        c1054s.f6933a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: l0 */
    private c m6596l0(C1054s c1054s, C1054s c1054s2) {
        c cVar = new c();
        cVar.f6860a = false;
        cVar.f6861b = false;
        if (c1054s == null || !c1054s.f6933a.containsKey("android:visibility:visibility")) {
            cVar.f6862c = -1;
            cVar.f6864e = null;
        } else {
            cVar.f6862c = ((Integer) c1054s.f6933a.get("android:visibility:visibility")).intValue();
            cVar.f6864e = (ViewGroup) c1054s.f6933a.get("android:visibility:parent");
        }
        if (c1054s2 == null || !c1054s2.f6933a.containsKey("android:visibility:visibility")) {
            cVar.f6863d = -1;
            cVar.f6865f = null;
        } else {
            cVar.f6863d = ((Integer) c1054s2.f6933a.get("android:visibility:visibility")).intValue();
            cVar.f6865f = (ViewGroup) c1054s2.f6933a.get("android:visibility:parent");
        }
        if (c1054s != null && c1054s2 != null) {
            int i2 = cVar.f6862c;
            int i3 = cVar.f6863d;
            if (i2 == i3 && cVar.f6864e == cVar.f6865f) {
                return cVar;
            }
            if (i2 != i3) {
                if (i2 == 0) {
                    cVar.f6861b = false;
                    cVar.f6860a = true;
                } else if (i3 == 0) {
                    cVar.f6861b = true;
                    cVar.f6860a = true;
                }
            } else if (cVar.f6865f == null) {
                cVar.f6861b = false;
                cVar.f6860a = true;
            } else if (cVar.f6864e == null) {
                cVar.f6861b = true;
                cVar.f6860a = true;
            }
        } else if (c1054s == null && cVar.f6863d == 0) {
            cVar.f6861b = true;
            cVar.f6860a = true;
        } else if (c1054s2 == null && cVar.f6862c == 0) {
            cVar.f6861b = false;
            cVar.f6860a = true;
        }
        return cVar;
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: H */
    public String[] mo6538H() {
        return f6848P;
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: J */
    public boolean mo6597J(C1054s c1054s, C1054s c1054s2) {
        if (c1054s == null && c1054s2 == null) {
            return false;
        }
        if (c1054s != null && c1054s2 != null && c1054s2.f6933a.containsKey("android:visibility:visibility") != c1054s.f6933a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c m6596l0 = m6596l0(c1054s, c1054s2);
        if (m6596l0.f6860a) {
            return m6596l0.f6862c == 0 || m6596l0.f6863d == 0;
        }
        return false;
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: h */
    public void mo6539h(C1054s c1054s) {
        m6595k0(c1054s);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: k */
    public void mo6540k(C1054s c1054s) {
        m6595k0(c1054s);
    }

    /* renamed from: m0 */
    public abstract Animator mo6577m0(ViewGroup viewGroup, View view, C1054s c1054s, C1054s c1054s2);

    /* renamed from: n0 */
    public Animator m6598n0(ViewGroup viewGroup, C1054s c1054s, int i2, C1054s c1054s2, int i3) {
        if ((this.f6849Q & 1) != 1 || c1054s2 == null) {
            return null;
        }
        if (c1054s == null) {
            View view = (View) c1054s2.f6934b.getParent();
            if (m6596l0(m6652u(view, false), m6624I(view, false)).f6860a) {
                return null;
            }
        }
        return mo6577m0(viewGroup, c1054s2.f6934b, c1054s, c1054s2);
    }

    @Override // p024c.p088x.AbstractC1047m
    /* renamed from: o */
    public Animator mo6541o(ViewGroup viewGroup, C1054s c1054s, C1054s c1054s2) {
        c m6596l0 = m6596l0(c1054s, c1054s2);
        if (!m6596l0.f6860a) {
            return null;
        }
        if (m6596l0.f6864e == null && m6596l0.f6865f == null) {
            return null;
        }
        return m6596l0.f6861b ? m6598n0(viewGroup, c1054s, m6596l0.f6862c, c1054s2, m6596l0.f6863d) : m6599q0(viewGroup, c1054s, m6596l0.f6862c, c1054s2, m6596l0.f6863d);
    }

    /* renamed from: o0 */
    public abstract Animator mo6578o0(ViewGroup viewGroup, View view, C1054s c1054s, C1054s c1054s2);

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0089, code lost:
    
        if (r17.f6878E != false) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator m6599q0(android.view.ViewGroup r18, p024c.p088x.C1054s r19, int r20, p024c.p088x.C1054s r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p024c.p088x.AbstractC1042j0.m6599q0(android.view.ViewGroup, c.x.s, int, c.x.s, int):android.animation.Animator");
    }

    /* renamed from: r0 */
    public void m6600r0(int i2) {
        if ((i2 & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f6849Q = i2;
    }
}
