package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: f */
    private final EnumC8343a f31773f;

    /* renamed from: com.google.firebase.installations.FirebaseInstallationsException$a */
    public enum EnumC8343a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(EnumC8343a enumC8343a) {
        this.f31773f = enumC8343a;
    }

    public FirebaseInstallationsException(String str, EnumC8343a enumC8343a) {
        super(str);
        this.f31773f = enumC8343a;
    }
}
