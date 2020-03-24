package com.binance.client.exception;

public class BinanceApiException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = 4360108982268949009L;
    public static final Integer RUNTIME_ERROR = 0;
    private final Integer errorCode;

    public BinanceApiException(Integer errorCode, String errMsg) {
        super(errMsg);
        this.errorCode = errorCode;
    }

    public BinanceApiException(Integer errorCode, String errMsg, Throwable e) {
        super(errMsg, e);
        this.errorCode = errorCode;
    }

    public Integer getErrorCode() {
        return this.errorCode;
    }
}
