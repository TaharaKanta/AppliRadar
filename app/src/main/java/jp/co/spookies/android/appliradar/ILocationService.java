/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: C:\\Users\\fujita\\eclipse_android\\workspace\\AppliRadar\\src\\jp\\co\\spookies\\android\\appliradar\\ILocationService.aidl
 */
package jp.co.spookies.android.appliradar;
public interface ILocationService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements jp.co.spookies.android.appliradar.ILocationService
{
private static final java.lang.String DESCRIPTOR = "jp.co.spookies.android.appliradar.ILocationService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an jp.co.spookies.android.appliradar.ILocationService interface,
 * generating a proxy if needed.
 */
public static jp.co.spookies.android.appliradar.ILocationService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof jp.co.spookies.android.appliradar.ILocationService))) {
return ((jp.co.spookies.android.appliradar.ILocationService)iin);
}
return new jp.co.spookies.android.appliradar.ILocationService.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getRecentLocation:
{
data.enforceInterface(DESCRIPTOR);
android.location.Location _result = this.getRecentLocation();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements jp.co.spookies.android.appliradar.ILocationService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public android.location.Location getRecentLocation() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.location.Location _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getRecentLocation, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.location.Location.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getRecentLocation = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public android.location.Location getRecentLocation() throws android.os.RemoteException;
}
