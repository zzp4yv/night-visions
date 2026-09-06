package com.bumptech.glide.p138m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.ActivityC0468d;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C5322i;
import com.bumptech.glide.ComponentCallbacks2C5316c;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment.java */
/* renamed from: com.bumptech.glide.m.o */
/* loaded from: classes.dex */
public class C5513o extends Fragment {

    /* renamed from: f */
    private final C5499a f13883f;

    /* renamed from: g */
    private final InterfaceC5511m f13884g;

    /* renamed from: h */
    private final Set<C5513o> f13885h;

    /* renamed from: i */
    private C5513o f13886i;

    /* renamed from: j */
    private C5322i f13887j;

    /* renamed from: k */
    private Fragment f13888k;

    /* compiled from: SupportRequestManagerFragment.java */
    /* renamed from: com.bumptech.glide.m.o$a */
    private class a implements InterfaceC5511m {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + C5513o.this + "}";
        }
    }

    public C5513o() {
        this(new C5499a());
    }

    /* renamed from: d */
    private void m10823d(C5513o c5513o) {
        this.f13885h.add(c5513o);
    }

    /* renamed from: f */
    private Fragment m10824f() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f13888k;
    }

    /* renamed from: i */
    private void m10825i(ActivityC0468d activityC0468d) {
        m10827m();
        C5513o m10814j = ComponentCallbacks2C5316c.m9972c(activityC0468d).m9987k().m10814j(activityC0468d);
        this.f13886i = m10814j;
        if (equals(m10814j)) {
            return;
        }
        this.f13886i.m10823d(this);
    }

    /* renamed from: j */
    private void m10826j(C5513o c5513o) {
        this.f13885h.remove(c5513o);
    }

    /* renamed from: m */
    private void m10827m() {
        C5513o c5513o = this.f13886i;
        if (c5513o != null) {
            c5513o.m10826j(this);
            this.f13886i = null;
        }
    }

    /* renamed from: e */
    C5499a m10828e() {
        return this.f13883f;
    }

    /* renamed from: g */
    public C5322i m10829g() {
        return this.f13887j;
    }

    /* renamed from: h */
    public InterfaceC5511m m10830h() {
        return this.f13884g;
    }

    /* renamed from: k */
    void m10831k(Fragment fragment) {
        this.f13888k = fragment;
        if (fragment == null || fragment.getActivity() == null) {
            return;
        }
        m10825i(fragment.getActivity());
    }

    /* renamed from: l */
    public void m10832l(C5322i c5322i) {
        this.f13887j = c5322i;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            m10825i(getActivity());
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f13883f.m10785c();
        m10827m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f13888k = null;
        m10827m();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.f13883f.m10786d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f13883f.m10787e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + m10824f() + "}";
    }

    @SuppressLint({"ValidFragment"})
    public C5513o(C5499a c5499a) {
        this.f13884g = new a();
        this.f13885h = new HashSet();
        this.f13883f = c5499a;
    }
}
