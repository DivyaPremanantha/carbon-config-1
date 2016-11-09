/*
 *  Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.kernel.config.model;

import org.wso2.carbon.configuration.annotations.Configuration;
import org.wso2.carbon.configuration.annotations.Element;
import org.wso2.carbon.configuration.annotations.Ignore;
import org.wso2.carbon.kernel.Constants;
import org.wso2.carbon.kernel.internal.config.JMXConfiguration;

/**
 * CarbonConfiguration class holds static configuration parameters specified in the carbon.yaml file.
 *
 * @since 5.0.0
 */
@Configuration(namespace = "wso2.carbon", description = "Carbon Configuration Parameters")
public class CarbonConfiguration {

    @Element(description = "value to uniquely identify a server", required = true, defaultValue = "carbon-kernel")
    private String id;

    @Element(description = "server name", defaultValue = "WSO2 Carbon Kernel")
    private String name;

    @Element(description = "server version", defaultValue = "5.2.0-SNAPSHOT")
    private String version;

    @Ignore
    private String tenant = Constants.DEFAULT_TENANT;

    @Element(description = "ports used by this server")
    private PortsConfig ports = new PortsConfig();

    @Element(description = "deployment engine related configurations")
    private DeploymentConfig deployment = new DeploymentConfig();

    @Element(description = "StartupOrderResolver related configurations")
    private StartupResolverConfig startupResolver = new StartupResolverConfig();

    @Element(description = "JMX Configuration")
    private JMXConfiguration jmx = new JMXConfiguration();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getTenant() {
        return tenant;
    }

    public PortsConfig getPortsConfig() {
        return ports;
    }

    public DeploymentConfig getDeploymentConfig() {
        return deployment;
    }

    public StartupResolverConfig getStartupResolverConfig() {
        return startupResolver;
    }

    public JMXConfiguration getJmxConfiguration() {
        return jmx;
    }
}
