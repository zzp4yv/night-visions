package com.facebook.p157o0.p158k0;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import cm.aptoide.p092pt.root.execution.Command;
import com.facebook.p157o0.p160m0.p161n.C5841f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9768m;
import kotlin.text.C10514v;
import kotlin.text.Regex;

/* compiled from: MetadataMatcher.kt */
/* renamed from: com.facebook.o0.k0.d */
/* loaded from: classes.dex */
public final class C5803d {

    /* renamed from: a */
    public static final C5803d f14981a = new C5803d();

    private C5803d() {
    }

    /* renamed from: a */
    public static final List<String> m12276a(View view) {
        C9768m.m32346f(view, "view");
        ArrayList arrayList = new ArrayList();
        C5841f c5841f = C5841f.f15257a;
        ViewGroup m12477j = C5841f.m12477j(view);
        if (m12477j != null) {
            for (View view2 : C5841f.m12469b(m12477j)) {
                if (view != view2) {
                    arrayList.addAll(f14981a.m12278c(view2));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final List<String> m12277b(View view) {
        C9768m.m32346f(view, "view");
        ArrayList<String> arrayList = new ArrayList();
        C5841f c5841f = C5841f.f15257a;
        arrayList.add(C5841f.m12476i(view));
        Object tag = view.getTag();
        if (tag != null) {
            arrayList.add(tag.toString());
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null) {
            arrayList.add(contentDescription.toString());
        }
        try {
            if (view.getId() != -1) {
                String resourceName = view.getResources().getResourceName(view.getId());
                C9768m.m32345e(resourceName, "resourceName");
                Object[] array = new Regex("/").m37440d(resourceName, 0).toArray(new String[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                if (strArr.length == 2) {
                    arrayList.add(strArr[1]);
                }
            }
        } catch (Resources.NotFoundException unused) {
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if ((str.length() > 0) && str.length() <= 100) {
                String lowerCase = str.toLowerCase();
                C9768m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
                arrayList2.add(lowerCase);
            }
        }
        return arrayList2;
    }

    /* renamed from: c */
    private final List<String> m12278c(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof EditText) {
            return arrayList;
        }
        if (!(view instanceof TextView)) {
            C5841f c5841f = C5841f.f15257a;
            Iterator<View> it = C5841f.m12469b(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(m12278c(it.next()));
            }
            return arrayList;
        }
        String obj = ((TextView) view).getText().toString();
        if ((obj.length() > 0) && obj.length() < 100) {
            String lowerCase = obj.toLowerCase();
            C9768m.m32345e(lowerCase, "(this as java.lang.String).toLowerCase()");
            arrayList.add(lowerCase);
        }
        return arrayList;
    }

    /* renamed from: d */
    private final boolean m12279d(String str, List<String> list) {
        boolean m37538J;
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            m37538J = C10514v.m37538J(str, it.next(), false, 2, null);
            if (m37538J) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m12280e(List<String> list, List<String> list2) {
        C9768m.m32346f(list, "indicators");
        C9768m.m32346f(list2, "keys");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (f14981a.m12279d(it.next(), list2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final boolean m12281f(String str, String str2) {
        C9768m.m32346f(str, Command.CommandHandler.TEXT);
        C9768m.m32346f(str2, "rule");
        return new Regex(str2).m37438b(str);
    }
}
