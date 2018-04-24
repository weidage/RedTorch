/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp;

public class CThostFtdcMdSpi {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMdSpi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMdSpi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcMdSpi(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_change_ownership(this, swigCPtr, true);
  }

  public void OnFrontConnected() {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnFrontConnected(swigCPtr, this); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnFrontConnectedSwigExplicitCThostFtdcMdSpi(swigCPtr, this);
  }

  public void OnFrontDisconnected(int nReason) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnFrontDisconnected(swigCPtr, this, nReason); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnFrontDisconnectedSwigExplicitCThostFtdcMdSpi(swigCPtr, this, nReason);
  }

  public void OnHeartBeatWarning(int nTimeLapse) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnHeartBeatWarning(swigCPtr, this, nTimeLapse); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnHeartBeatWarningSwigExplicitCThostFtdcMdSpi(swigCPtr, this, nTimeLapse);
  }

  public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspUserLogin(swigCPtr, this, CThostFtdcRspUserLoginField.getCPtr(pRspUserLogin), pRspUserLogin, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspUserLoginSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcRspUserLoginField.getCPtr(pRspUserLogin), pRspUserLogin, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspUserLogout(CThostFtdcUserLogoutField pUserLogout, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspUserLogoutSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspError(swigCPtr, this, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspErrorSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspSubMarketData(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspSubMarketDataSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspUnSubMarketData(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspUnSubMarketDataSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspSubForQuoteRsp(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspSubForQuoteRspSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRspUnSubForQuoteRsp(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspUnSubForQuoteRsp(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRspUnSubForQuoteRspSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcSpecificInstrumentField.getCPtr(pSpecificInstrument), pSpecificInstrument, CThostFtdcRspInfoField.getCPtr(pRspInfo), pRspInfo, nRequestID, bIsLast);
  }

  public void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRtnDepthMarketData(swigCPtr, this, CThostFtdcDepthMarketDataField.getCPtr(pDepthMarketData), pDepthMarketData); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRtnDepthMarketDataSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcDepthMarketDataField.getCPtr(pDepthMarketData), pDepthMarketData);
  }

  public void OnRtnForQuoteRsp(CThostFtdcForQuoteRspField pForQuoteRsp) {
    if (getClass() == CThostFtdcMdSpi.class) jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRtnForQuoteRsp(swigCPtr, this, CThostFtdcForQuoteRspField.getCPtr(pForQuoteRsp), pForQuoteRsp); else jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_OnRtnForQuoteRspSwigExplicitCThostFtdcMdSpi(swigCPtr, this, CThostFtdcForQuoteRspField.getCPtr(pForQuoteRsp), pForQuoteRsp);
  }

  public CThostFtdcMdSpi() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcMdSpi(), true);
    jctpmdapiv6v3v11x64JNI.CThostFtdcMdSpi_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}