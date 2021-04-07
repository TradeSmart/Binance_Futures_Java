package com.binance.client.constant;

import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Constants used throughout Binance's API.
 */
public class BinanceApiConstants {

    public static final String FAPI_BASE_URL = "https://fapi.binance.com/fapi/v1";

    public static final String DAPI_BASE_URL = "https://dapi.binance.com/dapi/v1";

    public static final String TESTNET_DAPI_BASE_URL = "https://testnet.binancefuture.com/dapi/v1";

    public static final String WS_FAPI_BASE_URL = "wss://fstream.binance.com/ws";

    public static final String WS_DAPI_BASE_URL = "wss://dstream.binance.com/ws";

    public static final String TESTNET_WS_DAPI_BASE_URL = "wss://dstream.binancefuture.com/ws";

    /**
     * HTTP Header to be used for API-KEY authentication.
     */
    public static final String API_KEY_HEADER = "X-MBX-APIKEY";

    /**
     * Decorator to indicate that an endpoint requires an API key.
     */
    public static final String ENDPOINT_SECURITY_TYPE_APIKEY = "APIKEY";
    public static final String ENDPOINT_SECURITY_TYPE_APIKEY_HEADER = ENDPOINT_SECURITY_TYPE_APIKEY + ": #";

    /**
     * Decorator to indicate that an endpoint requires a signature.
     */
    public static final String ENDPOINT_SECURITY_TYPE_SIGNED = "SIGNED";
    public static final String ENDPOINT_SECURITY_TYPE_SIGNED_HEADER = ENDPOINT_SECURITY_TYPE_SIGNED + ": #";

    /**
     * Default receiving window.
     */
    public static final long DEFAULT_RECEIVING_WINDOW = 60_000L;

    /**
     * Default ToStringStyle used by toString methods. Override this to change the
     * output format of the overridden toString methods. - Example
     * ToStringStyle.JSON_STYLE
     */
    public static ToStringStyle TO_STRING_BUILDER_STYLE = ToStringStyle.SHORT_PREFIX_STYLE;
}
