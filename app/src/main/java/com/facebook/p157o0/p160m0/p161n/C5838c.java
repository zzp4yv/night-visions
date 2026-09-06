package com.facebook.p157o0.p160m0.p161n;

import cm.aptoide.p092pt.DeepLinkIntentReceiver;
import cm.aptoide.p092pt.root.execution.Command;
import cm.aptoide.p092pt.store.view.StoreTabGridRecyclerFragment;
import java.util.Arrays;
import kotlin.jvm.internal.C9756g;
import kotlin.jvm.internal.C9768m;
import org.json.JSONObject;

/* compiled from: PathComponent.kt */
/* renamed from: com.facebook.o0.m0.n.c */
/* loaded from: classes.dex */
public final class C5838c {

    /* renamed from: a */
    public static final a f15237a = new a(null);

    /* renamed from: b */
    private final String f15238b;

    /* renamed from: c */
    private final int f15239c;

    /* renamed from: d */
    private final int f15240d;

    /* renamed from: e */
    private final String f15241e;

    /* renamed from: f */
    private final String f15242f;

    /* renamed from: g */
    private final String f15243g;

    /* renamed from: h */
    private final String f15244h;

    /* renamed from: i */
    private final int f15245i;

    /* compiled from: PathComponent.kt */
    /* renamed from: com.facebook.o0.m0.n.c$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9756g c9756g) {
            this();
        }
    }

    /* compiled from: PathComponent.kt */
    /* renamed from: com.facebook.o0.m0.n.c$b */
    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);


        /* renamed from: l */
        private final int f15252l;

        b(int i2) {
            this.f15252l = i2;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        /* renamed from: k */
        public final int m12456k() {
            return this.f15252l;
        }
    }

    public C5838c(JSONObject jSONObject) {
        C9768m.m32346f(jSONObject, "component");
        String string = jSONObject.getString("class_name");
        C9768m.m32345e(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f15238b = string;
        this.f15239c = jSONObject.optInt("index", -1);
        this.f15240d = jSONObject.optInt(DeepLinkIntentReceiver.DeepLinksKeys.f7163ID);
        String optString = jSONObject.optString(Command.CommandHandler.TEXT);
        C9768m.m32345e(optString, "component.optString(PATH_TEXT_KEY)");
        this.f15241e = optString;
        String optString2 = jSONObject.optString(StoreTabGridRecyclerFragment.BundleCons.TAG);
        C9768m.m32345e(optString2, "component.optString(PATH_TAG_KEY)");
        this.f15242f = optString2;
        String optString3 = jSONObject.optString("description");
        C9768m.m32345e(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f15243g = optString3;
        String optString4 = jSONObject.optString("hint");
        C9768m.m32345e(optString4, "component.optString(PATH_HINT_KEY)");
        this.f15244h = optString4;
        this.f15245i = jSONObject.optInt("match_bitmask");
    }

    /* renamed from: a */
    public final String m12447a() {
        return this.f15238b;
    }

    /* renamed from: b */
    public final String m12448b() {
        return this.f15243g;
    }

    /* renamed from: c */
    public final String m12449c() {
        return this.f15244h;
    }

    /* renamed from: d */
    public final int m12450d() {
        return this.f15240d;
    }

    /* renamed from: e */
    public final int m12451e() {
        return this.f15239c;
    }

    /* renamed from: f */
    public final int m12452f() {
        return this.f15245i;
    }

    /* renamed from: g */
    public final String m12453g() {
        return this.f15242f;
    }

    /* renamed from: h */
    public final String m12454h() {
        return this.f15241e;
    }
}
