package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public interface IFragmentWrapper extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @Override // com.google.android.gms.internal.common.zzb
        /* renamed from: H */
        protected final boolean mo14348H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
            switch (i2) {
                case 2:
                    IObjectWrapper mo14700s = mo14700s();
                    parcel2.writeNoException();
                    zzc.m20926f(parcel2, mo14700s);
                    return true;
                case 3:
                    Bundle mo14691d = mo14691d();
                    parcel2.writeNoException();
                    zzc.m20925e(parcel2, mo14691d);
                    return true;
                case 4:
                    int mo14688b = mo14688b();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo14688b);
                    return true;
                case 5:
                    IFragmentWrapper mo14692e = mo14692e();
                    parcel2.writeNoException();
                    zzc.m20926f(parcel2, mo14692e);
                    return true;
                case 6:
                    IObjectWrapper mo14697m = mo14697m();
                    parcel2.writeNoException();
                    zzc.m20926f(parcel2, mo14697m);
                    return true;
                case 7:
                    boolean mo14705x = mo14705x();
                    parcel2.writeNoException();
                    zzc.m20923c(parcel2, mo14705x);
                    return true;
                case 8:
                    String mo14702v = mo14702v();
                    parcel2.writeNoException();
                    parcel2.writeString(mo14702v);
                    return true;
                case 9:
                    IFragmentWrapper mo14698q = mo14698q();
                    parcel2.writeNoException();
                    zzc.m20926f(parcel2, mo14698q);
                    return true;
                case 10:
                    int mo14690c = mo14690c();
                    parcel2.writeNoException();
                    parcel2.writeInt(mo14690c);
                    return true;
                case 11:
                    boolean mo14706y = mo14706y();
                    parcel2.writeNoException();
                    zzc.m20923c(parcel2, mo14706y);
                    return true;
                case 12:
                    IObjectWrapper mo14695l = mo14695l();
                    parcel2.writeNoException();
                    zzc.m20926f(parcel2, mo14695l);
                    return true;
                case 13:
                    boolean mo14683G = mo14683G();
                    parcel2.writeNoException();
                    zzc.m20923c(parcel2, mo14683G);
                    return true;
                case 14:
                    boolean mo14681A0 = mo14681A0();
                    parcel2.writeNoException();
                    zzc.m20923c(parcel2, mo14681A0);
                    return true;
                case 15:
                    boolean mo14693f0 = mo14693f0();
                    parcel2.writeNoException();
                    zzc.m20923c(parcel2, mo14693f0);
                    return true;
                case 16:
                    boolean mo14696l0 = mo14696l0();
                    parcel2.writeNoException();
                    zzc.m20923c(parcel2, mo14696l0);
                    return true;
                case 17:
                    boolean mo14685U = mo14685U();
                    parcel2.writeNoException();
                    zzc.m20923c(parcel2, mo14685U);
                    return true;
                case 18:
                    boolean mo14686X = mo14686X();
                    parcel2.writeNoException();
                    zzc.m20923c(parcel2, mo14686X);
                    return true;
                case 19:
                    boolean mo14687Z6 = mo14687Z6();
                    parcel2.writeNoException();
                    zzc.m20923c(parcel2, mo14687Z6);
                    return true;
                case 20:
                    IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    zzc.m20922b(parcel);
                    mo14701s0(m14707P);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean m20927g = zzc.m20927g(parcel);
                    zzc.m20922b(parcel);
                    mo14684P0(m20927g);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean m20927g2 = zzc.m20927g(parcel);
                    zzc.m20922b(parcel);
                    mo14699r1(m20927g2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean m20927g3 = zzc.m20927g(parcel);
                    zzc.m20922b(parcel);
                    mo14689b2(m20927g3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean m20927g4 = zzc.m20927g(parcel);
                    zzc.m20922b(parcel);
                    mo14694h6(m20927g4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) zzc.m20921a(parcel, Intent.CREATOR);
                    zzc.m20922b(parcel);
                    mo14704w2(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) zzc.m20921a(parcel, Intent.CREATOR);
                    int readInt = parcel.readInt();
                    zzc.m20922b(parcel);
                    mo14682D2(intent2, readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper m14707P2 = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                    zzc.m20922b(parcel);
                    mo14703w0(m14707P2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    /* renamed from: A0 */
    boolean mo14681A0() throws RemoteException;

    /* renamed from: D2 */
    void mo14682D2(Intent intent, int i2) throws RemoteException;

    /* renamed from: G */
    boolean mo14683G() throws RemoteException;

    /* renamed from: P0 */
    void mo14684P0(boolean z) throws RemoteException;

    /* renamed from: U */
    boolean mo14685U() throws RemoteException;

    /* renamed from: X */
    boolean mo14686X() throws RemoteException;

    /* renamed from: Z6 */
    boolean mo14687Z6() throws RemoteException;

    /* renamed from: b */
    int mo14688b() throws RemoteException;

    /* renamed from: b2 */
    void mo14689b2(boolean z) throws RemoteException;

    /* renamed from: c */
    int mo14690c() throws RemoteException;

    /* renamed from: d */
    Bundle mo14691d() throws RemoteException;

    /* renamed from: e */
    IFragmentWrapper mo14692e() throws RemoteException;

    /* renamed from: f0 */
    boolean mo14693f0() throws RemoteException;

    /* renamed from: h6 */
    void mo14694h6(boolean z) throws RemoteException;

    /* renamed from: l */
    IObjectWrapper mo14695l() throws RemoteException;

    /* renamed from: l0 */
    boolean mo14696l0() throws RemoteException;

    /* renamed from: m */
    IObjectWrapper mo14697m() throws RemoteException;

    /* renamed from: q */
    IFragmentWrapper mo14698q() throws RemoteException;

    /* renamed from: r1 */
    void mo14699r1(boolean z) throws RemoteException;

    /* renamed from: s */
    IObjectWrapper mo14700s() throws RemoteException;

    /* renamed from: s0 */
    void mo14701s0(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: v */
    String mo14702v() throws RemoteException;

    /* renamed from: w0 */
    void mo14703w0(IObjectWrapper iObjectWrapper) throws RemoteException;

    /* renamed from: w2 */
    void mo14704w2(Intent intent) throws RemoteException;

    /* renamed from: x */
    boolean mo14705x() throws RemoteException;

    /* renamed from: y */
    boolean mo14706y() throws RemoteException;
}
