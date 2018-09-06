/*
 * Copyright (c) 2016-2018. https://github.com/lqqqqf. All rights reserved.
 */

package io.github.lqqqqf.builder;


import java.util.HashMap;
import java.util.Map;

public class UrlBuilder {
    private String protocol;
    private String host;
    private String port;
    private String path;
    private Map<String, String> params;

    public UrlBuilder() {
        this.params = new HashMap<>();
    }

    public UrlBuilder protocol(Protocol protocol) {
        this.protocol = protocol.toString();
        return this;
    }

    public UrlBuilder host(String host) {
        this.host = host;
        return this;
    }

    public UrlBuilder port(String port) {
        this.port = port;
        return this;
    }

    public UrlBuilder path(String path) {
        this.path = path;
        return this;
    }

    public UrlBuilder param(String key, String value) {
        params.put(key, value);
        return this;
    }

    public String build() throws BuildException {
        if (this.protocol == null) {
            throw new BuildException("protocol为空");
        }
        if (this.host == null) {
            throw new BuildException("host为空");
        }
        StringBuilder url = new StringBuilder();
        url.append(protocol).append("://").append(host);
        if (port != null) {
            url.append(":").append(port);
        }
        if (path != null) {
            url.append(path);
        }
        if (!params.isEmpty()) {
            url.append("?");
            for (String key: params.keySet()) {
                url.append(key).append("=").append(params.get(key)).append("&");
            }
            url.deleteCharAt(url.length() - 1);
        }
        return url.toString();
    }

    static enum Protocol {
        http,https
    }
}
