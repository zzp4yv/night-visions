package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.2.0 */
/* loaded from: classes2.dex */
public abstract class zzl extends zzc implements zzm {
    public zzl() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzm asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof zzm ? (zzm) queryLocalInterface : new zzo(iBinder);
    }

    @Override // com.google.android.gms.internal.measurement.zzc
    /* renamed from: H */
    protected final boolean mo22099H(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzn zzpVar;
        zzn zznVar = null;
        zzn zznVar2 = null;
        zzn zznVar3 = null;
        zzs zzsVar = null;
        zzs zzsVar2 = null;
        zzs zzsVar3 = null;
        zzn zznVar4 = null;
        zzn zznVar5 = null;
        zzn zznVar6 = null;
        zzn zznVar7 = null;
        zzn zznVar8 = null;
        zzn zznVar9 = null;
        zzt zztVar = null;
        zzn zznVar10 = null;
        zzn zznVar11 = null;
        zzn zznVar12 = null;
        zzn zznVar13 = null;
        switch (i2) {
            case 1:
                initialize(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (zzv) zzb.m21491a(parcel, zzv.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) zzb.m21491a(parcel, Bundle.CREATOR), zzb.m21495e(parcel), zzb.m21495e(parcel), parcel.readLong());
                break;
            case 3:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) zzb.m21491a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzpVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zzpVar = queryLocalInterface instanceof zzn ? (zzn) queryLocalInterface : new zzp(readStrongBinder);
                }
                logEventAndBundle(readString, readString2, bundle, zzpVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), zzb.m21495e(parcel), parcel.readLong());
                break;
            case 5:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                boolean m21495e = zzb.m21495e(parcel);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar = queryLocalInterface2 instanceof zzn ? (zzn) queryLocalInterface2 : new zzp(readStrongBinder2);
                }
                getUserProperties(readString3, readString4, m21495e, zznVar);
                break;
            case 6:
                String readString5 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar13 = queryLocalInterface3 instanceof zzn ? (zzn) queryLocalInterface3 : new zzp(readStrongBinder3);
                }
                getMaxUserProperties(readString5, zznVar13);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) zzb.m21491a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) zzb.m21491a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar12 = queryLocalInterface4 instanceof zzn ? (zzn) queryLocalInterface4 : new zzp(readStrongBinder4);
                }
                getConditionalUserProperties(readString6, readString7, zznVar12);
                break;
            case 11:
                setMeasurementEnabled(zzb.m21495e(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar11 = queryLocalInterface5 instanceof zzn ? (zzn) queryLocalInterface5 : new zzp(readStrongBinder5);
                }
                getCurrentScreenName(zznVar11);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar10 = queryLocalInterface6 instanceof zzn ? (zzn) queryLocalInterface6 : new zzp(readStrongBinder6);
                }
                getCurrentScreenClass(zznVar10);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    zztVar = queryLocalInterface7 instanceof zzt ? (zzt) queryLocalInterface7 : new zzw(readStrongBinder7);
                }
                setInstanceIdProvider(zztVar);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar9 = queryLocalInterface8 instanceof zzn ? (zzn) queryLocalInterface8 : new zzp(readStrongBinder8);
                }
                getCachedAppInstanceId(zznVar9);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar8 = queryLocalInterface9 instanceof zzn ? (zzn) queryLocalInterface9 : new zzp(readStrongBinder9);
                }
                getAppInstanceId(zznVar8);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar7 = queryLocalInterface10 instanceof zzn ? (zzn) queryLocalInterface10 : new zzp(readStrongBinder10);
                }
                getGmpAppId(zznVar7);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar6 = queryLocalInterface11 instanceof zzn ? (zzn) queryLocalInterface11 : new zzp(readStrongBinder11);
                }
                generateEventId(zznVar6);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), (Bundle) zzb.m21491a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                IObjectWrapper m14707P = IObjectWrapper.Stub.m14707P(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar5 = queryLocalInterface12 instanceof zzn ? (zzn) queryLocalInterface12 : new zzp(readStrongBinder12);
                }
                onActivitySaveInstanceState(m14707P, zznVar5, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) zzb.m21491a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar4 = queryLocalInterface13 instanceof zzn ? (zzn) queryLocalInterface13 : new zzp(readStrongBinder13);
                }
                performAction(bundle2, zznVar4, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()), IObjectWrapper.Stub.m14707P(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzsVar3 = queryLocalInterface14 instanceof zzs ? (zzs) queryLocalInterface14 : new zzu(readStrongBinder14);
                }
                setEventInterceptor(zzsVar3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzsVar2 = queryLocalInterface15 instanceof zzs ? (zzs) queryLocalInterface15 : new zzu(readStrongBinder15);
                }
                registerOnMeasurementEventListener(zzsVar2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    zzsVar = queryLocalInterface16 instanceof zzs ? (zzs) queryLocalInterface16 : new zzu(readStrongBinder16);
                }
                unregisterOnMeasurementEventListener(zzsVar);
                break;
            case 37:
                initForTests(zzb.m21496f(parcel));
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar3 = queryLocalInterface17 instanceof zzn ? (zzn) queryLocalInterface17 : new zzp(readStrongBinder17);
                }
                getTestFlag(zznVar3, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(zzb.m21495e(parcel));
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    zznVar2 = queryLocalInterface18 instanceof zzn ? (zzn) queryLocalInterface18 : new zzp(readStrongBinder18);
                }
                isDataCollectionEnabled(zznVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
