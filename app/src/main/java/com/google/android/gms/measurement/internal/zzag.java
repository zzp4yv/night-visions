package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
/* loaded from: classes2.dex */
public final class zzag {
    /* renamed from: a */
    private static Set<String> m22947a(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 22);
        sb.append("SELECT * FROM ");
        sb.append(str);
        sb.append(" LIMIT 0");
        Cursor rawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* renamed from: b */
    static void m22948b(zzet zzetVar, SQLiteDatabase sQLiteDatabase) {
        if (zzetVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzetVar.m23140K().m23147a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzetVar.m23140K().m23147a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzetVar.m23140K().m23147a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzetVar.m23140K().m23147a("Failed to turn on database write permission for owner");
    }

    /* renamed from: c */
    static void m22949c(zzet zzetVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        if (zzetVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        if (!m22950d(zzetVar, sQLiteDatabase, str)) {
            sQLiteDatabase.execSQL(str2);
        }
        try {
            Set<String> m22947a = m22947a(sQLiteDatabase, str);
            for (String str4 : str3.split(",")) {
                if (!m22947a.remove(str4)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(str4).length());
                    sb.append("Table ");
                    sb.append(str);
                    sb.append(" is missing required column: ");
                    sb.append(str4);
                    throw new SQLiteException(sb.toString());
                }
            }
            if (strArr != null) {
                for (int i2 = 0; i2 < strArr.length; i2 += 2) {
                    if (!m22947a.remove(strArr[i2])) {
                        sQLiteDatabase.execSQL(strArr[i2 + 1]);
                    }
                }
            }
            if (m22947a.isEmpty()) {
                return;
            }
            zzetVar.m23140K().m23149c("Table has extra columns. table, columns", str, TextUtils.join(", ", m22947a));
        } catch (SQLiteException e2) {
            zzetVar.m23137H().m23148b("Failed to verify columns on table that was just created", str);
            throw e2;
        }
    }

    /* renamed from: d */
    private static boolean m22950d(zzet zzetVar, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzetVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        Cursor cursor = null;
        try {
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                boolean moveToFirst = cursor.moveToFirst();
                cursor.close();
                return moveToFirst;
            } catch (SQLiteException e2) {
                zzetVar.m23140K().m23149c("Error querying for table", str, e2);
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }
}
