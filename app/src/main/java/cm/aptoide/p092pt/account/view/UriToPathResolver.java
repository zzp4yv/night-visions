package cm.aptoide.p092pt.account.view;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes.dex */
public class UriToPathResolver {
    private static final String TAG = "cm.aptoide.pt.account.view.UriToPathResolver";
    private final ContentResolver contentResolver;

    public UriToPathResolver(ContentResolver contentResolver) {
        this.contentResolver = contentResolver;
    }

    public String getCameraStoragePath(Uri uri) {
        Cursor query = this.contentResolver.query(uri, null, null, null, null);
        if (query == null) {
            return uri.toString();
        }
        query.moveToFirst();
        return query.getString(query.getColumnIndex("_data"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r1.isClosed() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0047, code lost:
    
        if (r1.isClosed() == false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getMediaStoragePath(android.net.Uri r10) {
        /*
            r9 = this;
            java.lang.String r0 = "_data"
            if (r10 == 0) goto L5d
            r1 = 0
            r2 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r2 = 0
            r5[r2] = r0     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            android.content.ContentResolver r3 = r9.contentResolver     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r6 = 0
            r7 = 0
            r8 = 0
            r4 = r10
            android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            if (r1 == 0) goto L2c
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            java.lang.String r10 = r1.getString(r0)     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L2b
            r1.close()
        L2b:
            return r10
        L2c:
            if (r1 == 0) goto L4c
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L4c
            goto L49
        L35:
            r10 = move-exception
            goto L51
        L37:
            r0 = move-exception
            cm.aptoide.pt.logger.Logger r2 = cm.aptoide.p092pt.logger.Logger.getInstance()     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = cm.aptoide.p092pt.account.view.UriToPathResolver.TAG     // Catch: java.lang.Throwable -> L35
            r2.m8279e(r3, r0)     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L4c
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L4c
        L49:
            r1.close()
        L4c:
            java.lang.String r10 = r10.toString()
            return r10
        L51:
            if (r1 == 0) goto L5c
            boolean r0 = r1.isClosed()
            if (r0 != 0) goto L5c
            r1.close()
        L5c:
            throw r10
        L5d:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "content Uri is null"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: cm.aptoide.p092pt.account.view.UriToPathResolver.getMediaStoragePath(android.net.Uri):java.lang.String");
    }
}
