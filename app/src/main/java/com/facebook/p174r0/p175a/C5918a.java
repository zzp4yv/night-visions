package com.facebook.p174r0.p175a;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.AccessToken;
import com.facebook.EnumC5622e0;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.internal.C5663p0;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.C9768m;

/* compiled from: ShareInternalUtility.kt */
/* renamed from: com.facebook.r0.a.a */
/* loaded from: classes2.dex */
public final class C5918a {

    /* renamed from: a */
    public static final C5918a f15564a = new C5918a();

    private C5918a() {
    }

    /* renamed from: a */
    public static final GraphRequest m12886a(AccessToken accessToken, Uri uri, GraphRequest.InterfaceC5598b interfaceC5598b) throws FileNotFoundException {
        C9768m.m32346f(uri, "imageUri");
        String path = uri.getPath();
        C5663p0 c5663p0 = C5663p0.f14478a;
        if (C5663p0.m11554Y(uri) && path != null) {
            return m12887b(accessToken, new File(path), interfaceC5598b);
        }
        if (!C5663p0.m11551V(uri)) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, EnumC5622e0.POST, interfaceC5598b, null, 32, null);
    }

    /* renamed from: b */
    public static final GraphRequest m12887b(AccessToken accessToken, File file, GraphRequest.InterfaceC5598b interfaceC5598b) throws FileNotFoundException {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, EnumC5622e0.POST, interfaceC5598b, null, 32, null);
    }
}
