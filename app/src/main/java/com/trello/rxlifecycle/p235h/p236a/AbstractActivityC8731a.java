package com.trello.rxlifecycle.p235h.p236a;

import android.os.Bundle;
import androidx.appcompat.app.ActivityC0067d;
import com.trello.rxlifecycle.C8724c;
import com.trello.rxlifecycle.InterfaceC8723b;
import com.trello.rxlifecycle.p234g.C8730c;
import com.trello.rxlifecycle.p234g.EnumC8728a;
import p456rx.C11186e;
import p456rx.p473s.C11369a;

/* compiled from: RxAppCompatActivity.java */
/* renamed from: com.trello.rxlifecycle.h.a.a */
/* loaded from: classes.dex */
public abstract class AbstractActivityC8731a extends ActivityC0067d {
    private final C11369a<EnumC8728a> lifecycleSubject = C11369a.m40634g1();

    public final <T> InterfaceC8723b<T> bindToLifecycle() {
        return C8730c.m27905a(this.lifecycleSubject);
    }

    public final C11186e<EnumC8728a> lifecycle() {
        return this.lifecycleSubject.m40086a();
    }

    @Override // androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0242f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.lifecycleSubject.onNext(EnumC8728a.CREATE);
    }

    @Override // androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onDestroy() {
        this.lifecycleSubject.onNext(EnumC8728a.DESTROY);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onPause() {
        this.lifecycleSubject.onNext(EnumC8728a.PAUSE);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.lifecycleSubject.onNext(EnumC8728a.RESUME);
    }

    @Override // androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.lifecycleSubject.onNext(EnumC8728a.START);
    }

    @Override // androidx.appcompat.app.ActivityC0067d, androidx.fragment.app.ActivityC0468d, android.app.Activity
    protected void onStop() {
        this.lifecycleSubject.onNext(EnumC8728a.STOP);
        super.onStop();
    }

    public final <T> InterfaceC8723b<T> bindUntilEvent(EnumC8728a enumC8728a) {
        return C8724c.m27898b(this.lifecycleSubject, enumC8728a);
    }
}
