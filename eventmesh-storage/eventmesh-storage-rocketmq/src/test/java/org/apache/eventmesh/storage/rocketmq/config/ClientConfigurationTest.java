/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.eventmesh.storage.rocketmq.config;

import org.apache.eventmesh.api.factory.StoragePluginFactory;
import org.apache.eventmesh.storage.rocketmq.consumer.RocketMQConsumerImpl;
import org.apache.eventmesh.storage.rocketmq.producer.RocketMQProducerImpl;

import org.junit.Assert;
import org.junit.Test;

public class ClientConfigurationTest {

    @Test
    public void getConfigWhenRocketMQConsumerInit() {
        RocketMQConsumerImpl consumer = (RocketMQConsumerImpl) StoragePluginFactory.getMeshMQPushConsumer("rocketmq");

        ClientConfiguration config = consumer.getClientConfiguration();
        assertConfig(config);
    }

    @Test
    public void getConfigWhenRocketMQProducerInit() {
        RocketMQProducerImpl producer = (RocketMQProducerImpl) StoragePluginFactory.getMeshMQProducer("rocketmq");

        ClientConfiguration config = producer.getClientConfiguration();
        assertConfig(config);
    }

    private void assertConfig(ClientConfiguration config) {
        Assert.assertEquals(config.getNamesrvAddr(), "127.0.0.1:9876;127.0.0.1:9876");
        Assert.assertEquals(config.getClientUserName(), "username-succeed!!!");
        Assert.assertEquals(config.getClientPass(), "password-succeed!!!");
        Assert.assertEquals(config.getConsumeThreadMin(), Integer.valueOf(1816));
        Assert.assertEquals(config.getConsumeThreadMax(), Integer.valueOf(2816));
        Assert.assertEquals(config.getConsumeQueueSize(), Integer.valueOf(3816));
        Assert.assertEquals(config.getPullBatchSize(), Integer.valueOf(4816));
        Assert.assertEquals(config.getAckWindow(), Integer.valueOf(5816));
        Assert.assertEquals(config.getPubWindow(), Integer.valueOf(6816));
        Assert.assertEquals(config.getConsumeTimeout(), 7816);
        Assert.assertEquals(config.getPollNameServerInterval(), Integer.valueOf(8816));
        Assert.assertEquals(config.getHeartbeatBrokerInterval(), Integer.valueOf(9816));
        Assert.assertEquals(config.getRebalanceInterval(), Integer.valueOf(11816));
        Assert.assertEquals(config.getClusterName(), "cluster-succeed!!!");
        Assert.assertEquals(config.getAccessKey(), "accessKey-succeed!!!");
        Assert.assertEquals(config.getSecretKey(), "secretKey-succeed!!!");
    }
}
