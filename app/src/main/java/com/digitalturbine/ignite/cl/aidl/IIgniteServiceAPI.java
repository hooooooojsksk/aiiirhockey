package com.digitalturbine.ignite.cl.aidl;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IIgniteServiceAPI extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IIgniteServiceAPI {

        /* loaded from: classes.dex */
        public static class Proxy implements IIgniteServiceAPI {
            public IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI
            public void authenticate(String str, String str2, Bundle bundle, IIgniteServiceCallback iIgniteServiceCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongInterface(iIgniteServiceCallback);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI
            public void cancel(String str, Bundle bundle, IIgniteServiceCallback iIgniteServiceCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    obtain.writeStrongInterface(iIgniteServiceCallback);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI
            public void install(String str, Bundle bundle, Bundle bundle2, IIgniteServiceCallback iIgniteServiceCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
                    obtain.writeString(str);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    _Parcel.writeTypedObject(obtain, bundle2, 0);
                    obtain.writeStrongInterface(iIgniteServiceCallback);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI
            public String version() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static IIgniteServiceAPI asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IIgniteServiceAPI)) {
                return (IIgniteServiceAPI) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }
    }

    /* loaded from: classes.dex */
    public static class _Parcel {
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void authenticate(String str, String str2, Bundle bundle, IIgniteServiceCallback iIgniteServiceCallback) throws RemoteException;

    void cancel(String str, Bundle bundle, IIgniteServiceCallback iIgniteServiceCallback) throws RemoteException;

    void install(String str, Bundle bundle, Bundle bundle2, IIgniteServiceCallback iIgniteServiceCallback) throws RemoteException;

    String version() throws RemoteException;
}
