package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* renamed from: com.google.android.gms.internal.measurement.d4 */
/* loaded from: classes2.dex */
final class C7463d4 {
    /* renamed from: a */
    static String m21043a(zzdu zzduVar) {
        C7481g4 c7481g4 = new C7481g4(zzduVar);
        StringBuilder sb = new StringBuilder(c7481g4.mo21055a());
        for (int i2 = 0; i2 < c7481g4.mo21055a(); i2++) {
            byte mo21056d = c7481g4.mo21056d(i2);
            if (mo21056d == 34) {
                sb.append("\\\"");
            } else if (mo21056d == 39) {
                sb.append("\\'");
            } else if (mo21056d != 92) {
                switch (mo21056d) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (mo21056d < 32 || mo21056d > 126) {
                            sb.append('\\');
                            sb.append((char) (((mo21056d >>> 6) & 3) + 48));
                            sb.append((char) (((mo21056d >>> 3) & 7) + 48));
                            sb.append((char) ((mo21056d & 7) + 48));
                            break;
                        } else {
                            sb.append((char) mo21056d);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
