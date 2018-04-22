/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcBrokerUserOTPParamField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcBrokerUserOTPParamField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerUserOTPParamField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcBrokerUserOTPParamField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_UserID_get(swigCPtr, this);
  }

  public void setOTPVendorsID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_OTPVendorsID_set(swigCPtr, this, value);
  }

  public String getOTPVendorsID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_OTPVendorsID_get(swigCPtr, this);
  }

  public void setSerialNumber(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_SerialNumber_set(swigCPtr, this, value);
  }

  public String getSerialNumber() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_SerialNumber_get(swigCPtr, this);
  }

  public void setAuthKey(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_AuthKey_set(swigCPtr, this, value);
  }

  public String getAuthKey() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_AuthKey_get(swigCPtr, this);
  }

  public void setLastDrift(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_LastDrift_set(swigCPtr, this, value);
  }

  public int getLastDrift() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_LastDrift_get(swigCPtr, this);
  }

  public void setLastSuccess(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_LastSuccess_set(swigCPtr, this, value);
  }

  public int getLastSuccess() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_LastSuccess_get(swigCPtr, this);
  }

  public void setOTPType(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_OTPType_set(swigCPtr, this, value);
  }

  public char getOTPType() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcBrokerUserOTPParamField_OTPType_get(swigCPtr, this);
  }

  public CThostFtdcBrokerUserOTPParamField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcBrokerUserOTPParamField(), true);
  }

}