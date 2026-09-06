package com.trello.rxlifecycle.p235h.p236a;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c;
import com.trello.rxlifecycle.C8724c;
import com.trello.rxlifecycle.InterfaceC8723b;
import com.trello.rxlifecycle.p234g.C8730c;
import com.trello.rxlifecycle.p234g.EnumC8729b;
import p456rx.C11186e;
import p456rx.p473s.C11369a;

/* compiled from: RxDialogFragment.java */
/* renamed from: com.trello.rxlifecycle.h.a.c */
/* loaded from: classes2.dex */
public abstract class AbstractC8733c extends DialogInterfaceOnCancelListenerC0466c {
    private final C11369a<EnumC8729b> lifecycleSubject = C11369a.m40634g1();

    public final <T> InterfaceC8723b<T> bindToLifecycle() {
        return C8730c.m27906b(this.lifecycleSubject);
    }

    public final C11186e<EnumC8729b> lifecycle() {
        return this.lifecycleSubject.m40086a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.lifecycleSubject.onNext(EnumC8729b.ATTACH);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.lifecycleSubject.onNext(EnumC8729b.CREATE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.lifecycleSubject.onNext(EnumC8729b.DESTROY);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.lifecycleSubject.onNext(EnumC8729b.DESTROY_VIEW);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onDetach() {
        this.lifecycleSubject.onNext(EnumC8729b.DETACH);
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        this.lifecycleSubject.onNext(EnumC8729b.PAUSE);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.lifecycleSubject.onNext(EnumC8729b.RESUME);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.lifecycleSubject.onNext(EnumC8729b.START);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0466c, androidx.fragment.app.Fragment
    public void onStop() {
        this.lifecycleSubject.onNext(EnumC8729b.STOP);
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.lifecycleSubject.onNext(EnumC8729b.CREATE_VIEW);
    }

    public final <T> InterfaceC8723b<T> bindUntilEvent(EnumC8729b enumC8729b) {
        return C8724c.m27898b(this.lifecycleSubject, enumC8729b);
    }
}
