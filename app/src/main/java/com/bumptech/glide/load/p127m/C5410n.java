package com.bumptech.glide.load.p127m;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamLocalUriFetcher.java */
/* renamed from: com.bumptech.glide.load.m.n */
/* loaded from: classes.dex */
public class C5410n extends AbstractC5408l<InputStream> {

    /* renamed from: i */
    private static final UriMatcher f13590i;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f13590i = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C5410n(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: i */
    private InputStream m10487i(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f13590i.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m10488j(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m10488j(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* renamed from: j */
    private InputStream m10488j(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.bumptech.glide.load.p127m.InterfaceC5400d
    /* renamed from: a */
    public Class<InputStream> mo10455a() {
        return InputStream.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5408l
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo10456c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.load.p127m.AbstractC5408l
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public InputStream mo10457f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream m10487i = m10487i(uri, contentResolver);
        if (m10487i != null) {
            return m10487i;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }
}
