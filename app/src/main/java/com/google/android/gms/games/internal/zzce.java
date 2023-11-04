package com.google.android.gms.games.internal;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GamesStatusCodes;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;

/* compiled from: com.google.android.gms:play-services-games@@23.1.0 */
/* loaded from: classes.dex */
public final class zzce extends com.google.android.gms.internal.games.zza implements IInterface {
    public zzce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.games.internal.IGamesService");
    }

    public final void zzA(zzcb zzcbVar, String str, String str2, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeInt(i);
        zza.writeInt(i2);
        zzc(GamesStatusCodes.STATUS_MILESTONE_CLAIM_FAILED, zza);
    }

    public final void zzB(zzcb zzcbVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zzc(21007, zza);
    }

    public final void zzC(zzcb zzcbVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zzd(zza, bundle);
        zzc(5025, zza);
    }

    public final void zzD(String str, int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zzc(12017, zza);
    }

    public final void zzE(zzcb zzcbVar, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeInt(i);
        zzc(22016, zza);
    }

    public final void zzF(zzcb zzcbVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(6001, zza);
    }

    public final void zzG(zzcb zzcbVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(8027, zza);
    }

    public final void zzH(zzcb zzcbVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(12016, zza);
    }

    public final void zzI(zzcb zzcbVar, boolean z, String[] strArr) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zza.writeStringArray(strArr);
        zzc(12031, zza);
    }

    public final void zzJ(zzcb zzcbVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zzc(5026, zza);
    }

    public final void zzK(zzcb zzcbVar, int i, boolean z, boolean z2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeInt(i);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        com.google.android.gms.internal.games.zzc.zzc(zza, z2);
        zzc(5015, zza);
    }

    public final void zzL(zzcb zzcbVar, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(GamesStatusCodes.STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS, zza);
    }

    public final void zzM(zzcb zzcbVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(GamesStatusCodes.STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION, zza);
    }

    public final void zzN(zzcb zzcbVar, Bundle bundle, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        com.google.android.gms.internal.games.zzc.zzd(zza, bundle);
        zza.writeInt(i);
        zza.writeInt(i2);
        zzc(5021, zza);
    }

    public final void zzO(zzcb zzcbVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(5020, zza);
    }

    public final void zzP(zzcb zzcbVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(17001, zza);
    }

    public final void zzQ(zzcb zzcbVar, String str, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(13006, zza);
    }

    public final void zzR(zzcb zzcbVar, String str, int i, boolean z, boolean z2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        com.google.android.gms.internal.games.zzc.zzc(zza, z2);
        zzc(9020, zza);
    }

    public final void zzS(zzcb zzcbVar, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(12002, zza);
    }

    public final void zzT(zzcb zzcbVar, String str, int i, int i2, int i3, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zzc(5019, zza);
    }

    public final void zzU(zzcb zzcbVar, String str, boolean z, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        zza.writeInt(i);
        zzc(15001, zza);
    }

    public final void zzV(zzcb zzcbVar, long j) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeLong(j);
        zzc(22026, zza);
    }

    public final void zzW(zzcd zzcdVar, long j) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcdVar);
        zza.writeLong(j);
        zzc(15501, zza);
    }

    public final void zzX(zzcb zzcbVar, String str, String str2, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zza.writeString(str2);
        com.google.android.gms.internal.games.zzc.zzd(zza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games.zzc.zzd(zza, contents);
        zzc(12033, zza);
    }

    public final void zzY(zzcb zzcbVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zzd(zza, bundle);
        zzc(5023, zza);
    }

    public final void zzZ(zzcb zzcbVar, String str, int i, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zzd(zza, bundle);
        zzc(7003, zza);
    }

    public final void zzaa(IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zzd(zza, bundle);
        zzc(5005, zza);
    }

    public final void zzab(zzcb zzcbVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zzc(5002, zza);
    }

    public final void zzac(zzcb zzcbVar, String str, long j, String str2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zza.writeLong(j);
        zza.writeString(str2);
        zzc(7002, zza);
    }

    public final void zzad(zzcb zzcbVar, String str, IBinder iBinder, Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zza.writeStrongBinder(iBinder);
        com.google.android.gms.internal.games.zzc.zzd(zza, bundle);
        zzc(5024, zza);
    }

    public final void zzae(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzc(22027, zza);
    }

    public final boolean zzaf() throws RemoteException {
        Parcel zzb = zzb(22030, zza());
        boolean zzg = com.google.android.gms.internal.games.zzc.zzg(zzb);
        zzb.recycle();
        return zzg;
    }

    public final int zzd() throws RemoteException {
        Parcel zzb = zzb(12036, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    public final int zze() throws RemoteException {
        Parcel zzb = zzb(12035, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    public final PendingIntent zzf() throws RemoteException {
        Parcel zzb = zzb(25015, zza());
        PendingIntent pendingIntent = (PendingIntent) com.google.android.gms.internal.games.zzc.zza(zzb, PendingIntent.CREATOR);
        zzb.recycle();
        return pendingIntent;
    }

    public final Intent zzg() throws RemoteException {
        Parcel zzb = zzb(9005, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final Intent zzh() throws RemoteException {
        Parcel zzb = zzb(GamesStatusCodes.STATUS_VIDEO_STORAGE_ERROR, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final Intent zzi(PlayerEntity playerEntity) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzd(zza, playerEntity);
        Parcel zzb = zzb(15503, zza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final Intent zzj(String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(25016, zza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final Intent zzk(String str, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        zza.writeInt(i2);
        Parcel zzb = zzb(18001, zza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final Intent zzl() throws RemoteException {
        Parcel zzb = zzb(9010, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final Intent zzm(String str, boolean z, boolean z2, int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        com.google.android.gms.internal.games.zzc.zzc(zza, z);
        com.google.android.gms.internal.games.zzc.zzc(zza, z2);
        zza.writeInt(i);
        Parcel zzb = zzb(12001, zza);
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final Intent zzn() throws RemoteException {
        Parcel zzb = zzb(9012, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final Intent zzo() throws RemoteException {
        Parcel zzb = zzb(19002, zza());
        Intent intent = (Intent) com.google.android.gms.internal.games.zzc.zza(zzb, Intent.CREATOR);
        zzb.recycle();
        return intent;
    }

    public final DataHolder zzp() throws RemoteException {
        Parcel zzb = zzb(5502, zza());
        DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games.zzc.zza(zzb, DataHolder.CREATOR);
        zzb.recycle();
        return dataHolder;
    }

    public final DataHolder zzq() throws RemoteException {
        Parcel zzb = zzb(5013, zza());
        DataHolder dataHolder = (DataHolder) com.google.android.gms.internal.games.zzc.zza(zzb, DataHolder.CREATOR);
        zzb.recycle();
        return dataHolder;
    }

    public final String zzr() throws RemoteException {
        Parcel zzb = zzb(5003, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        Parcel zzb = zzb(5007, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final String zzt() throws RemoteException {
        Parcel zzb = zzb(5012, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    public final void zzu() throws RemoteException {
        zzc(5006, zza());
    }

    public final void zzv(long j) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zzc(5001, zza);
    }

    public final void zzw(zzcb zzcbVar, String str, SnapshotMetadataChangeEntity snapshotMetadataChangeEntity, Contents contents) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        com.google.android.gms.internal.games.zzc.zzd(zza, snapshotMetadataChangeEntity);
        com.google.android.gms.internal.games.zzc.zzd(zza, contents);
        zzc(12007, zza);
    }

    public final void zzx(zzcb zzcbVar, String str) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zza.writeString(str);
        zzc(12020, zza);
    }

    public final void zzy(Contents contents) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzd(zza, contents);
        zzc(12019, zza);
    }

    public final void zzz(zzcb zzcbVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.games.zzc.zzf(zza, zzcbVar);
        zzc(22028, zza);
    }
}
