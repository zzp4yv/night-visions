package com.facebook.p157o0.p169u0;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import cm.aptoide.p092pt.networking.BodyInterceptorV3;
import cm.aptoide.p092pt.root.execution.Command;
import com.facebook.p157o0.p160m0.p161n.C5841f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10784u;
import kotlin.jvm.internal.C9768m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SuggestedEventViewHierarchy.kt */
/* renamed from: com.facebook.o0.u0.g */
/* loaded from: classes2.dex */
public final class C5904g {

    /* renamed from: a */
    public static final C5904g f15511a = new C5904g();

    /* renamed from: b */
    private static final List<Class<? extends View>> f15512b;

    static {
        List<Class<? extends View>> m38891m;
        m38891m = C10784u.m38891m(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);
        f15512b = m38891m;
    }

    private C5904g() {
    }

    /* renamed from: a */
    public static final List<View> m12796a(View view) {
        C9768m.m32346f(view, "view");
        ArrayList arrayList = new ArrayList();
        Iterator<Class<? extends View>> it = f15512b.iterator();
        while (it.hasNext()) {
            if (it.next().isInstance(view)) {
                return arrayList;
            }
        }
        if (view.isClickable()) {
            arrayList.add(view);
        }
        C5841f c5841f = C5841f.f15257a;
        Iterator<View> it2 = C5841f.m12469b(view).iterator();
        while (it2.hasNext()) {
            arrayList.addAll(m12796a(it2.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final JSONObject m12797b(View view, View view2) {
        C9768m.m32346f(view, "view");
        C9768m.m32346f(view2, "clickedView");
        JSONObject jSONObject = new JSONObject();
        if (view == view2) {
            try {
                jSONObject.put("is_interacted", true);
            } catch (JSONException unused) {
            }
        }
        m12800e(view, jSONObject);
        JSONArray jSONArray = new JSONArray();
        C5841f c5841f = C5841f.f15257a;
        Iterator<View> it = C5841f.m12469b(view).iterator();
        while (it.hasNext()) {
            jSONArray.put(m12797b(it.next(), view2));
        }
        jSONObject.put("childviews", jSONArray);
        return jSONObject;
    }

    /* renamed from: c */
    private final List<String> m12798c(View view) {
        ArrayList arrayList = new ArrayList();
        C5841f c5841f = C5841f.f15257a;
        for (View view2 : C5841f.m12469b(view)) {
            C5841f c5841f2 = C5841f.f15257a;
            String m12478k = C5841f.m12478k(view2);
            if (m12478k.length() > 0) {
                arrayList.add(m12478k);
            }
            arrayList.addAll(m12798c(view2));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static final String m12799d(View view) {
        C9768m.m32346f(view, "hostView");
        C5841f c5841f = C5841f.f15257a;
        String m12478k = C5841f.m12478k(view);
        if (m12478k.length() > 0) {
            return m12478k;
        }
        String join = TextUtils.join(" ", f15511a.m12798c(view));
        C9768m.m32345e(join, "join(\" \", childrenText)");
        return join;
    }

    /* renamed from: e */
    public static final void m12800e(View view, JSONObject jSONObject) {
        C9768m.m32346f(view, "view");
        C9768m.m32346f(jSONObject, BodyInterceptorV3.RESPONSE_MODE_JSON);
        try {
            C5841f c5841f = C5841f.f15257a;
            String m12478k = C5841f.m12478k(view);
            String m12476i = C5841f.m12476i(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", C5841f.m12470c(view));
            boolean z = true;
            if (m12478k.length() > 0) {
                jSONObject.put(Command.CommandHandler.TEXT, m12478k);
            }
            if (m12476i.length() <= 0) {
                z = false;
            }
            if (z) {
                jSONObject.put("hint", m12476i);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        }
    }
}
