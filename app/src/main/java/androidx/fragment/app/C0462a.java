package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.AbstractC0485u;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC0511g;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord.java */
/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
final class C0462a extends AbstractC0485u implements FragmentManager.InterfaceC0453k, FragmentManager.InterfaceC0457o {

    /* renamed from: t */
    final FragmentManager f3182t;

    /* renamed from: u */
    boolean f3183u;

    /* renamed from: v */
    int f3184v;

    C0462a(FragmentManager fragmentManager) {
        super(fragmentManager.m3506t0(), fragmentManager.m3512w0() != null ? fragmentManager.m3512w0().m3654f().getClassLoader() : null);
        this.f3184v = -1;
        this.f3182t = fragmentManager;
    }

    /* renamed from: E */
    private static boolean m3539E(AbstractC0485u.a aVar) {
        Fragment fragment = aVar.f3336b;
        return (fragment == null || !fragment.mAdded || fragment.mView == null || fragment.mDetached || fragment.mHidden || !fragment.isPostponed()) ? false : true;
    }

    /* renamed from: A */
    void m3540A(boolean z) {
        for (int size = this.f3318c.size() - 1; size >= 0; size--) {
            AbstractC0485u.a aVar = this.f3318c.get(size);
            Fragment fragment = aVar.f3336b;
            if (fragment != null) {
                fragment.setNextTransition(FragmentManager.m3412l1(this.f3323h));
                fragment.setSharedElementNames(this.f3332q, this.f3331p);
            }
            switch (aVar.f3335a) {
                case 1:
                    fragment.setNextAnim(aVar.f3340f);
                    this.f3182t.m3500p1(fragment, true);
                    this.f3182t.m3481g1(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3335a);
                case 3:
                    fragment.setNextAnim(aVar.f3339e);
                    this.f3182t.m3480g(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f3339e);
                    this.f3182t.m3507t1(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f3340f);
                    this.f3182t.m3500p1(fragment, true);
                    this.f3182t.m3437F0(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f3339e);
                    this.f3182t.m3492l(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f3340f);
                    this.f3182t.m3500p1(fragment, true);
                    this.f3182t.m3514y(fragment);
                    break;
                case 8:
                    this.f3182t.m3505r1(null);
                    break;
                case 9:
                    this.f3182t.m3505r1(fragment);
                    break;
                case 10:
                    this.f3182t.m3502q1(fragment, aVar.f3341g);
                    break;
            }
            if (!this.f3333r && aVar.f3335a != 3 && fragment != null && !FragmentManager.f3093b) {
                this.f3182t.m3457R0(fragment);
            }
        }
        if (this.f3333r || !z || FragmentManager.f3093b) {
            return;
        }
        FragmentManager fragmentManager = this.f3182t;
        fragmentManager.m3459S0(fragmentManager.f3126s, true);
    }

    /* renamed from: B */
    Fragment m3541B(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i2 = 0;
        while (i2 < this.f3318c.size()) {
            AbstractC0485u.a aVar = this.f3318c.get(i2);
            int i3 = aVar.f3335a;
            if (i3 != 1) {
                if (i3 == 2) {
                    Fragment fragment3 = aVar.f3336b;
                    int i4 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i4) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f3318c.add(i2, new AbstractC0485u.a(9, fragment4));
                                    i2++;
                                    fragment2 = null;
                                }
                                AbstractC0485u.a aVar2 = new AbstractC0485u.a(3, fragment4);
                                aVar2.f3337c = aVar.f3337c;
                                aVar2.f3339e = aVar.f3339e;
                                aVar2.f3338d = aVar.f3338d;
                                aVar2.f3340f = aVar.f3340f;
                                this.f3318c.add(i2, aVar2);
                                arrayList.remove(fragment4);
                                i2++;
                            }
                        }
                    }
                    if (z) {
                        this.f3318c.remove(i2);
                        i2--;
                    } else {
                        aVar.f3335a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i3 == 3 || i3 == 6) {
                    arrayList.remove(aVar.f3336b);
                    Fragment fragment5 = aVar.f3336b;
                    if (fragment5 == fragment2) {
                        this.f3318c.add(i2, new AbstractC0485u.a(9, fragment5));
                        i2++;
                        fragment2 = null;
                    }
                } else if (i3 != 7) {
                    if (i3 == 8) {
                        this.f3318c.add(i2, new AbstractC0485u.a(9, fragment2));
                        i2++;
                        fragment2 = aVar.f3336b;
                    }
                }
                i2++;
            }
            arrayList.add(aVar.f3336b);
            i2++;
        }
        return fragment2;
    }

    /* renamed from: C */
    boolean m3542C(int i2) {
        int size = this.f3318c.size();
        for (int i3 = 0; i3 < size; i3++) {
            Fragment fragment = this.f3318c.get(i3).f3336b;
            int i4 = fragment != null ? fragment.mContainerId : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    boolean m3543D(ArrayList<C0462a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f3318c.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            Fragment fragment = this.f3318c.get(i5).f3336b;
            int i6 = fragment != null ? fragment.mContainerId : 0;
            if (i6 != 0 && i6 != i4) {
                for (int i7 = i2; i7 < i3; i7++) {
                    C0462a c0462a = arrayList.get(i7);
                    int size2 = c0462a.f3318c.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        Fragment fragment2 = c0462a.f3318c.get(i8).f3336b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    /* renamed from: F */
    boolean m3544F() {
        for (int i2 = 0; i2 < this.f3318c.size(); i2++) {
            if (m3539E(this.f3318c.get(i2))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: G */
    public void m3545G() {
        if (this.f3334s != null) {
            for (int i2 = 0; i2 < this.f3334s.size(); i2++) {
                this.f3334s.get(i2).run();
            }
            this.f3334s = null;
        }
    }

    /* renamed from: H */
    void m3546H(Fragment.InterfaceC0440k interfaceC0440k) {
        for (int i2 = 0; i2 < this.f3318c.size(); i2++) {
            AbstractC0485u.a aVar = this.f3318c.get(i2);
            if (m3539E(aVar)) {
                aVar.f3336b.setOnStartEnterTransitionListener(interfaceC0440k);
            }
        }
    }

    /* renamed from: I */
    Fragment m3547I(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f3318c.size() - 1; size >= 0; size--) {
            AbstractC0485u.a aVar = this.f3318c.get(size);
            int i2 = aVar.f3335a;
            if (i2 != 1) {
                if (i2 != 3) {
                    switch (i2) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f3336b;
                            break;
                        case 10:
                            aVar.f3342h = aVar.f3341g;
                            break;
                    }
                }
                arrayList.add(aVar.f3336b);
            }
            arrayList.remove(aVar.f3336b);
        }
        return fragment;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0457o
    /* renamed from: a */
    public boolean mo3531a(ArrayList<C0462a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3324i) {
            return true;
        }
        this.f3182t.m3475e(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.InterfaceC0453k
    public String getName() {
        return this.f3326k;
    }

    @Override // androidx.fragment.app.AbstractC0485u
    /* renamed from: i */
    public int mo3548i() {
        return m3557w(false);
    }

    @Override // androidx.fragment.app.AbstractC0485u
    /* renamed from: j */
    public int mo3549j() {
        return m3557w(true);
    }

    @Override // androidx.fragment.app.AbstractC0485u
    /* renamed from: k */
    public void mo3550k() {
        m3741n();
        this.f3182t.m3473c0(this, false);
    }

    @Override // androidx.fragment.app.AbstractC0485u
    /* renamed from: l */
    public void mo3551l() {
        m3741n();
        this.f3182t.m3473c0(this, true);
    }

    @Override // androidx.fragment.app.AbstractC0485u
    /* renamed from: m */
    public AbstractC0485u mo3552m(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3182t) {
            return super.mo3552m(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC0485u
    /* renamed from: o */
    void mo3553o(int i2, Fragment fragment, String str, int i3) {
        super.mo3553o(i2, fragment, str, i3);
        fragment.mFragmentManager = this.f3182t;
    }

    @Override // androidx.fragment.app.AbstractC0485u
    /* renamed from: p */
    public AbstractC0485u mo3554p(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3182t) {
            return super.mo3554p(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.AbstractC0485u
    /* renamed from: t */
    public AbstractC0485u mo3555t(Fragment fragment, AbstractC0511g.c cVar) {
        if (fragment.mFragmentManager != this.f3182t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f3182t);
        }
        if (cVar == AbstractC0511g.c.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + " after the Fragment has been created");
        }
        if (cVar != AbstractC0511g.c.DESTROYED) {
            return super.mo3555t(fragment, cVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + cVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3184v >= 0) {
            sb.append(" #");
            sb.append(this.f3184v);
        }
        if (this.f3326k != null) {
            sb.append(" ");
            sb.append(this.f3326k);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: v */
    void m3556v(int i2) {
        if (this.f3324i) {
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f3318c.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC0485u.a aVar = this.f3318c.get(i3);
                Fragment fragment = aVar.f3336b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i2;
                    if (FragmentManager.m3392H0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f3336b + " to " + aVar.f3336b.mBackStackNesting);
                    }
                }
            }
        }
    }

    /* renamed from: w */
    int m3557w(boolean z) {
        if (this.f3183u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.m3392H0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0490z("FragmentManager"));
            m3558x("  ", printWriter);
            printWriter.close();
        }
        this.f3183u = true;
        if (this.f3324i) {
            this.f3184v = this.f3182t.m3487j();
        } else {
            this.f3184v = -1;
        }
        this.f3182t.m3469Z(this, z);
        return this.f3184v;
    }

    /* renamed from: x */
    public void m3558x(String str, PrintWriter printWriter) {
        m3559y(str, printWriter, true);
    }

    /* renamed from: y */
    public void m3559y(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3326k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3184v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3183u);
            if (this.f3323h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3323h));
            }
            if (this.f3319d != 0 || this.f3320e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3319d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3320e));
            }
            if (this.f3321f != 0 || this.f3322g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3321f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3322g));
            }
            if (this.f3327l != 0 || this.f3328m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3327l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3328m);
            }
            if (this.f3329n != 0 || this.f3330o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3329n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3330o);
            }
        }
        if (this.f3318c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f3318c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0485u.a aVar = this.f3318c.get(i2);
            switch (aVar.f3335a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f3335a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i2);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f3336b);
            if (z) {
                if (aVar.f3337c != 0 || aVar.f3338d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3337c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3338d));
                }
                if (aVar.f3339e != 0 || aVar.f3340f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f3339e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f3340f));
                }
            }
        }
    }

    /* renamed from: z */
    void m3560z() {
        int size = this.f3318c.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0485u.a aVar = this.f3318c.get(i2);
            Fragment fragment = aVar.f3336b;
            if (fragment != null) {
                fragment.setNextTransition(this.f3323h);
                fragment.setSharedElementNames(this.f3331p, this.f3332q);
            }
            switch (aVar.f3335a) {
                case 1:
                    fragment.setNextAnim(aVar.f3337c);
                    this.f3182t.m3500p1(fragment, false);
                    this.f3182t.m3480g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f3335a);
                case 3:
                    fragment.setNextAnim(aVar.f3338d);
                    this.f3182t.m3481g1(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.f3338d);
                    this.f3182t.m3437F0(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f3337c);
                    this.f3182t.m3500p1(fragment, false);
                    this.f3182t.m3507t1(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.f3338d);
                    this.f3182t.m3514y(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f3337c);
                    this.f3182t.m3500p1(fragment, false);
                    this.f3182t.m3492l(fragment);
                    break;
                case 8:
                    this.f3182t.m3505r1(fragment);
                    break;
                case 9:
                    this.f3182t.m3505r1(null);
                    break;
                case 10:
                    this.f3182t.m3502q1(fragment, aVar.f3342h);
                    break;
            }
            if (!this.f3333r && aVar.f3335a != 1 && fragment != null && !FragmentManager.f3093b) {
                this.f3182t.m3457R0(fragment);
            }
        }
        if (this.f3333r || FragmentManager.f3093b) {
            return;
        }
        FragmentManager fragmentManager = this.f3182t;
        fragmentManager.m3459S0(fragmentManager.f3126s, true);
    }
}
