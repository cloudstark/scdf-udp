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

package org.springframework.cloud.stream.app.udp;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Base class for UDP connection properties.
 *
 * @author Lars Martin
 */
@ConfigurationProperties("udp")
public class UdpConnectionProperties {

    /**
     * The port on which to listen; 0 for the OS to choose a port.
     */
    private int port = 1234;

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

}
