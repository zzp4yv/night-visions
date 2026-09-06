package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import p024c.p025a.p026k.p027a.C0833a;
import p241e.p254e.p256b.p271c.C8878e;
import p241e.p254e.p256b.p271c.C8883j;
import p241e.p254e.p256b.p271c.p273m.C8886a;

/* compiled from: ClearTextEndIconDelegate.java */
/* renamed from: com.google.android.material.textfield.a */
/* loaded from: classes2.dex */
class C8037a extends AbstractC8041e {

    /* renamed from: d */
    private final TextWatcher f30514d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f30515e;

    /* renamed from: f */
    private final TextInputLayout.InterfaceC8035f f30516f;

    /* renamed from: g */
    private final TextInputLayout.InterfaceC8036g f30517g;

    /* renamed from: h */
    private AnimatorSet f30518h;

    /* renamed from: i */
    private ValueAnimator f30519i;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$a */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (C8037a.this.f30559a.getSuffixText() != null) {
                return;
            }
            C8037a.this.m24802i(C8037a.m24805l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$b */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            C8037a.this.m24802i((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$c */
    class c implements TextInputLayout.InterfaceC8035f {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC8035f
        /* renamed from: a */
        public void mo24796a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C8037a.m24805l(editText.getText()));
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(C8037a.this.f30515e);
            editText.removeTextChangedListener(C8037a.this.f30514d);
            editText.addTextChangedListener(C8037a.this.f30514d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$d */
    class d implements TextInputLayout.InterfaceC8036g {
        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC8036g
        /* renamed from: a */
        public void mo24797a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText == null || i2 != 2) {
                return;
            }
            editText.removeTextChangedListener(C8037a.this.f30514d);
            if (editText.getOnFocusChangeListener() == C8037a.this.f30515e) {
                editText.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$e */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = C8037a.this.f30559a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$f */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C8037a.this.f30559a.setEndIconVisible(true);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$g */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C8037a.this.f30559a.setEndIconVisible(false);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$h */
    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C8037a.this.f30561c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$i */
    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C8037a.this.f30561c.setScaleX(floatValue);
            C8037a.this.f30561c.setScaleY(floatValue);
        }
    }

    C8037a(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f30514d = new a();
        this.f30515e = new b();
        this.f30516f = new c();
        this.f30517g = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m24802i(boolean z) {
        boolean z2 = this.f30559a.isEndIconVisible() == z;
        if (z) {
            this.f30519i.cancel();
            this.f30518h.start();
            if (z2) {
                this.f30518h.end();
                return;
            }
            return;
        }
        this.f30518h.cancel();
        this.f30519i.start();
        if (z2) {
            this.f30519i.end();
        }
    }

    /* renamed from: j */
    private ValueAnimator m24803j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C8886a.f34370a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    /* renamed from: k */
    private ValueAnimator m24804k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(C8886a.f34373d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static boolean m24805l(Editable editable) {
        return editable.length() > 0;
    }

    /* renamed from: m */
    private void m24806m() {
        ValueAnimator m24804k = m24804k();
        ValueAnimator m24803j = m24803j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f30518h = animatorSet;
        animatorSet.playTogether(m24804k, m24803j);
        this.f30518h.addListener(new f());
        ValueAnimator m24803j2 = m24803j(1.0f, 0.0f);
        this.f30519i = m24803j2;
        m24803j2.addListener(new g());
    }

    @Override // com.google.android.material.textfield.AbstractC8041e
    /* renamed from: a */
    void mo24807a() {
        this.f30559a.setEndIconDrawable(C0833a.m5262d(this.f30560b, C8878e.f33898g));
        TextInputLayout textInputLayout = this.f30559a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C8883j.f33960d));
        this.f30559a.setEndIconOnClickListener(new e());
        this.f30559a.addOnEditTextAttachedListener(this.f30516f);
        this.f30559a.addOnEndIconChangedListener(this.f30517g);
        m24806m();
    }

    @Override // com.google.android.material.textfield.AbstractC8041e
    /* renamed from: c */
    void mo24808c(boolean z) {
        if (this.f30559a.getSuffixText() == null) {
            return;
        }
        m24802i(z);
    }
}
