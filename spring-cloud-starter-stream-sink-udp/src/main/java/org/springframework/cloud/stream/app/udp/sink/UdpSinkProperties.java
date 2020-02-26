/*
 * Copyright 2015-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.stream.app.udp.sink;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

/**
 * Properties for the UDP Sink.
 *
 * @author Lars Martin
 */
@ConfigurationProperties("udp")
@Validated
public class UdpSinkProperties {

    /**
     * The host to which this sink will connect.
     */
    private String host;

    @NotNull
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

}
