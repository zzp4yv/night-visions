package com.google.android.gms.common.server.response;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Stack;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes2.dex */
public class FastParser<T extends FastJsonResponse> {

    /* renamed from: a */
    private static final char[] f17919a = {'u', 'l', 'l'};

    /* renamed from: b */
    private static final char[] f17920b = {'r', 'u', 'e'};

    /* renamed from: c */
    private static final char[] f17921c = {'r', 'u', 'e', '\"'};

    /* renamed from: d */
    private static final char[] f17922d = {'a', 'l', 's', 'e'};

    /* renamed from: e */
    private static final char[] f17923e = {'a', 'l', 's', 'e', '\"'};

    /* renamed from: f */
    private static final char[] f17924f = {'\n'};

    /* renamed from: g */
    private static final InterfaceC6412a<Integer> f17925g = new C6413a();

    /* renamed from: h */
    private static final InterfaceC6412a<Long> f17926h = new C6414b();

    /* renamed from: i */
    private static final InterfaceC6412a<Float> f17927i = new C6415c();

    /* renamed from: j */
    private static final InterfaceC6412a<Double> f17928j = new C6416d();

    /* renamed from: k */
    private static final InterfaceC6412a<Boolean> f17929k = new C6417e();

    /* renamed from: l */
    private static final InterfaceC6412a<String> f17930l = new C6418f();

    /* renamed from: m */
    private static final InterfaceC6412a<BigInteger> f17931m = new C6419g();

    /* renamed from: n */
    private static final InterfaceC6412a<BigDecimal> f17932n = new C6420h();

    /* renamed from: o */
    private final char[] f17933o = new char[1];

    /* renamed from: p */
    private final char[] f17934p = new char[32];

    /* renamed from: q */
    private final char[] f17935q = new char[1024];

    /* renamed from: r */
    private final StringBuilder f17936r = new StringBuilder(32);

    /* renamed from: s */
    private final StringBuilder f17937s = new StringBuilder(1024);

    /* renamed from: t */
    private final Stack<Integer> f17938t = new Stack<>();

    @ShowFirstParty
    @KeepForSdk
    public static class ParseException extends Exception {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.common.server.response.FastParser$a */
    interface InterfaceC6412a<O> {
    }
}
