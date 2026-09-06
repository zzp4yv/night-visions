package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.C0168i;
import com.google.android.material.internal.C7994e;
import com.google.android.material.internal.C7999j;
import com.google.android.material.theme.p178a.C8046a;
import okhttp3.HttpUrl;
import p241e.p254e.p256b.p271c.C8875b;
import p241e.p254e.p256b.p271c.C8877d;
import p241e.p254e.p256b.p271c.C8884k;
import p241e.p254e.p256b.p271c.C8885l;

/* loaded from: classes2.dex */
public class TextInputEditText extends C0168i {

    /* renamed from: i */
    private final Rect f30505i;

    /* renamed from: j */
    private boolean f30506j;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C8875b.f33826p);
    }

    /* renamed from: a */
    private String m24792a(TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence hint = textInputLayout.getHint();
        CharSequence helperText = textInputLayout.getHelperText();
        CharSequence error = textInputLayout.getError();
        boolean z = !TextUtils.isEmpty(text);
        boolean z2 = !TextUtils.isEmpty(hint);
        boolean z3 = !TextUtils.isEmpty(helperText);
        boolean z4 = !TextUtils.isEmpty(error);
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String charSequence = z2 ? hint.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence);
        sb.append(((z4 || z3) && !TextUtils.isEmpty(charSequence)) ? ", " : HttpUrl.FRAGMENT_ENCODE_SET);
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        if (z4) {
            helperText = error;
        } else if (!z3) {
            helperText = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb3.append((Object) helperText);
        String sb4 = sb3.toString();
        if (!z) {
            return !TextUtils.isEmpty(sb4) ? sb4 : HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append((Object) text);
        if (!TextUtils.isEmpty(sb4)) {
            str = ", " + sb4;
        }
        sb5.append(str);
        return sb5.toString();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null || !this.f30506j || rect == null) {
            return;
        }
        textInputLayout.getFocusedRect(this.f30505i);
        rect.bottom = this.f30505i.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f30506j && rect != null) {
            textInputLayout.getGlobalVisibleRect(this.f30505i, point);
            rect.bottom = this.f30505i.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        return (textInputLayout == null || !textInputLayout.isProvidingHint()) ? super.getHint() : textInputLayout.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.isProvidingHint() && super.getHint() == null && C7994e.m24662a()) {
            setHint(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    @Override // androidx.appcompat.widget.C0168i, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT >= 23 || textInputLayout == null) {
            return;
        }
        accessibilityNodeInfo.setText(m24792a(textInputLayout));
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f30506j) {
            this.f30505i.set(0, textInputLayout.getHeight() - getResources().getDimensionPixelOffset(C8877d.f33856J), textInputLayout.getWidth(), textInputLayout.getHeight());
            textInputLayout.requestRectangleOnScreen(this.f30505i, true);
        }
        return requestRectangleOnScreen;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.f30506j = z;
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i2) {
        super(C8046a.m24906c(context, attributeSet, i2, 0), attributeSet, i2);
        this.f30505i = new Rect();
        TypedArray m24694h = C7999j.m24694h(context, attributeSet, C8885l.f34082L4, i2, C8884k.f33987l, new int[0]);
        setTextInputLayoutFocusedRectEnabled(m24694h.getBoolean(C8885l.f34089M4, false));
        m24694h.recycle();
    }
}
