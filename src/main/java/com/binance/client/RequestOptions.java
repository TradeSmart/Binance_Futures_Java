package com.binance.client;

import com.binance.client.constant.BinanceApiConstants;
import com.binance.client.exception.BinanceApiException;
import java.net.URL;

/**
 * The configuration for the request APIs
 */
public class RequestOptions {

    private String url;

    public RequestOptions() {
    }

    public RequestOptions(String url) {
        this.url = url;
    }

    public RequestOptions(RequestOptions option) {
        this.url = option.url;
    }

    public void setUrl(String url) {
        try {
            URL u = new URL(url);
            this.url = u.toString();
        } catch (Exception e) {
            throw new BinanceApiException(BinanceApiException.RUNTIME_ERROR, "The URI is incorrect: " + e.getMessage());
        }
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
