package com.trello.rxlifecycle.p234g;

import com.trello.rxlifecycle.C8724c;
import com.trello.rxlifecycle.InterfaceC8723b;
import com.trello.rxlifecycle.OutsideLifecycleException;
import p456rx.C11186e;
import p456rx.p460m.InterfaceC11208e;

/* compiled from: RxLifecycleAndroid.java */
/* renamed from: com.trello.rxlifecycle.g.c */
/* loaded from: classes2.dex */
public class C8730c {

    /* renamed from: a */
    private static final InterfaceC11208e<EnumC8728a, EnumC8728a> f33277a = new a();

    /* renamed from: b */
    private static final InterfaceC11208e<EnumC8729b, EnumC8729b> f33278b = new b();

    /* compiled from: RxLifecycleAndroid.java */
    /* renamed from: com.trello.rxlifecycle.g.c$a */
    static class a implements InterfaceC11208e<EnumC8728a, EnumC8728a> {
        a() {
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC8728a call(EnumC8728a enumC8728a) {
            switch (c.f33279a[enumC8728a.ordinal()]) {
                case 1:
                    return EnumC8728a.DESTROY;
                case 2:
                    return EnumC8728a.STOP;
                case 3:
                    return EnumC8728a.PAUSE;
                case 4:
                    return EnumC8728a.STOP;
                case 5:
                    return EnumC8728a.DESTROY;
                case 6:
                    throw new OutsideLifecycleException("Cannot bind to Activity lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + enumC8728a + " not yet implemented");
            }
        }
    }

    /* compiled from: RxLifecycleAndroid.java */
    /* renamed from: com.trello.rxlifecycle.g.c$b */
    static class b implements InterfaceC11208e<EnumC8729b, EnumC8729b> {
        b() {
        }

        @Override // p456rx.p460m.InterfaceC11208e
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public EnumC8729b call(EnumC8729b enumC8729b) {
            switch (c.f33280b[enumC8729b.ordinal()]) {
                case 1:
                    return EnumC8729b.DETACH;
                case 2:
                    return EnumC8729b.DESTROY;
                case 3:
                    return EnumC8729b.DESTROY_VIEW;
                case 4:
                    return EnumC8729b.STOP;
                case 5:
                    return EnumC8729b.PAUSE;
                case 6:
                    return EnumC8729b.STOP;
                case 7:
                    return EnumC8729b.DESTROY_VIEW;
                case 8:
                    return EnumC8729b.DESTROY;
                case 9:
                    return EnumC8729b.DETACH;
                case 10:
                    throw new OutsideLifecycleException("Cannot bind to Fragment lifecycle when outside of it.");
                default:
                    throw new UnsupportedOperationException("Binding to " + enumC8729b + " not yet implemented");
            }
        }
    }

    /* compiled from: RxLifecycleAndroid.java */
    /* renamed from: com.trello.rxlifecycle.g.c$c */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f33279a;

        /* renamed from: b */
        static final /* synthetic */ int[] f33280b;

        static {
            int[] iArr = new int[EnumC8729b.values().length];
            f33280b = iArr;
            try {
                iArr[EnumC8729b.ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33280b[EnumC8729b.CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f33280b[EnumC8729b.CREATE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f33280b[EnumC8729b.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f33280b[EnumC8729b.RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f33280b[EnumC8729b.PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f33280b[EnumC8729b.STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f33280b[EnumC8729b.DESTROY_VIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f33280b[EnumC8729b.DESTROY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f33280b[EnumC8729b.DETACH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            int[] iArr2 = new int[EnumC8728a.values().length];
            f33279a = iArr2;
            try {
                iArr2[EnumC8728a.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f33279a[EnumC8728a.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f33279a[EnumC8728a.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f33279a[EnumC8728a.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f33279a[EnumC8728a.STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f33279a[EnumC8728a.DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    /* renamed from: a */
    public static <T> InterfaceC8723b<T> m27905a(C11186e<EnumC8728a> c11186e) {
        return C8724c.m27897a(c11186e, f33277a);
    }

    /* renamed from: b */
    public static <T> InterfaceC8723b<T> m27906b(C11186e<EnumC8729b> c11186e) {
        return C8724c.m27897a(c11186e, f33278b);
    }
}
