package com.facebook.p157o0.p160m0.p161n;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.C10495c;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* compiled from: SensitiveUserDataUtils.kt */
/* renamed from: com.facebook.o0.m0.n.d */
/* loaded from: classes.dex */
public final class C5839d {

    /* renamed from: a */
    public static final C5839d f15253a = new C5839d();

    private C5839d() {
    }

    /* renamed from: a */
    private final boolean m12457a(TextView textView) {
        int i2;
        int m37414d;
        C5841f c5841f = C5841f.f15257a;
        String m37439c = new Regex("\\s").m37439c(C5841f.m12478k(textView), HttpUrl.FRAGMENT_ENCODE_SET);
        int length = m37439c.length();
        if (length < 12 || length > 19) {
            return false;
        }
        int i3 = length - 1;
        if (i3 >= 0) {
            boolean z = false;
            i2 = 0;
            while (true) {
                int i4 = i3 - 1;
                char charAt = m37439c.charAt(i3);
                if (!Character.isDigit(charAt)) {
                    return false;
                }
                m37414d = C10495c.m37414d(charAt);
                if (z && (m37414d = m37414d * 2) > 9) {
                    m37414d = (m37414d % 10) + 1;
                }
                i2 += m37414d;
                z = !z;
                if (i4 < 0) {
                    break;
                }
                i3 = i4;
            }
        } else {
            i2 = 0;
        }
        return i2 % 10 == 0;
    }

    /* renamed from: b */
    private final boolean m12458b(TextView textView) {
        if (textView.getInputType() == 32) {
            return true;
        }
        C5841f c5841f = C5841f.f15257a;
        String m12478k = C5841f.m12478k(textView);
        if (m12478k == null) {
            return false;
        }
        if (m12478k.length() == 0) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(m12478k).matches();
    }

    /* renamed from: c */
    private final boolean m12459c(TextView textView) {
        if (textView.getInputType() == 128) {
            return true;
        }
        return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    /* renamed from: d */
    private final boolean m12460d(TextView textView) {
        return textView.getInputType() == 96;
    }

    /* renamed from: e */
    private final boolean m12461e(TextView textView) {
        return textView.getInputType() == 3;
    }

    /* renamed from: f */
    private final boolean m12462f(TextView textView) {
        return textView.getInputType() == 112;
    }

    /* renamed from: g */
    public static final boolean m12463g(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        C5839d c5839d = f15253a;
        TextView textView = (TextView) view;
        return c5839d.m12459c(textView) || c5839d.m12457a(textView) || c5839d.m12460d(textView) || c5839d.m12462f(textView) || c5839d.m12461e(textView) || c5839d.m12458b(textView);
    }
}
