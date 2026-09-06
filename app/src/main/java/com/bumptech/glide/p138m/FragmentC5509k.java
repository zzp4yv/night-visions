package com.bumptech.glide.p138m;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C5322i;
import com.bumptech.glide.ComponentCallbacks2C5316c;
import java.util.HashSet;
import java.util.Set;

/* compiled from: RequestManagerFragment.java */
@Deprecated
/* renamed from: com.bumptech.glide.m.k */
/* loaded from: classes.dex */
public class FragmentC5509k extends Fragment {

    /* renamed from: f */
    private final C5499a f13864f;

    /* renamed from: g */
    private final InterfaceC5511m f13865g;

    /* renamed from: h */
    private final Set<FragmentC5509k> f13866h;

    /* renamed from: i */
    private C5322i f13867i;

    /* renamed from: j */
    private FragmentC5509k f13868j;

    /* renamed from: k */
    private Fragment f13869k;

    /* compiled from: RequestManagerFragment.java */
    /* renamed from: com.bumptech.glide.m.k$a */
    private class a implements InterfaceC5511m {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + FragmentC5509k.this + "}";
        }
    }

    public FragmentC5509k() {
        this(new C5499a());
    }

    /* renamed from: a */
    private void m10792a(FragmentC5509k fragmentC5509k) {
        this.f13866h.add(fragmentC5509k);
    }

    @TargetApi(17)
    /* renamed from: c */
    private Fragment m10793c() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f13869k;
    }

    /* renamed from: f */
    private void m10794f(Activity activity) {
        m10796j();
        FragmentC5509k m10813h = ComponentCallbacks2C5316c.m9972c(activity).m9987k().m10813h(activity);
        this.f13868j = m10813h;
        if (equals(m10813h)) {
            return;
        }
        this.f13868j.m10792a(this);
    }

    /* renamed from: g */
    private void m10795g(FragmentC5509k fragmentC5509k) {
        this.f13866h.remove(fragmentC5509k);
    }

    /* renamed from: j */
    private void m10796j() {
        FragmentC5509k fragmentC5509k = this.f13868j;
        if (fragmentC5509k != null) {
            fragmentC5509k.m10795g(this);
            this.f13868j = null;
        }
    }

    /* renamed from: b */
    C5499a m10797b() {
        return this.f13864f;
    }

    /* renamed from: d */
    public C5322i m10798d() {
        return this.f13867i;
    }

    /* renamed from: e */
    public InterfaceC5511m m10799e() {
        return this.f13865g;
    }

    /* renamed from: h */
    void m10800h(Fragment fragment) {
        this.f13869k = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m10794f(fragment.getActivity());
    }

    /* renamed from: i */
    public void m10801i(C5322i c5322i) {
        this.f13867i = c5322i;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m10794f(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f13864f.m10785c();
        m10796j();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        m10796j();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f13864f.m10786d();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f13864f.m10787e();
    }

    @Override // android.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m10793c() + "}";
    }

    @SuppressLint({"ValidFragment"})
    FragmentC5509k(C5499a c5499a) {
        this.f13865g = new a();
        this.f13866h = new HashSet();
        this.f13864f = c5499a;
    }
}
