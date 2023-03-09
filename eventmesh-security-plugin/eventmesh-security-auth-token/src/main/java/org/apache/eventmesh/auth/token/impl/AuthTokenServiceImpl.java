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

package org.apache.eventmesh.auth.token.impl;

import org.apache.eventmesh.api.acl.AclProperties;
import org.apache.eventmesh.api.acl.AclService;
import org.apache.eventmesh.api.exception.AclException;
import org.apache.eventmesh.auth.token.impl.auth.AuthTokenUtils;

public class AuthTokenServiceImpl implements AclService {

    @Override
    public void init() throws AclException {
    }

    @Override
    public void start() throws AclException {

    }

    @Override
    public void shutdown() throws AclException {

    }

    @Override
    public void doAclCheckInConnect(AclProperties aclProperties) throws AclException {
        AuthTokenUtils.authTokenByPublicKey(aclProperties);
        AuthTokenUtils.helloTaskAuthTokenByPublicKey(aclProperties);
    }

    @Override
    public void doAclCheckInHeartbeat(AclProperties aclProperties) throws AclException {

    }

    @Override
    public void doAclCheckInSend(AclProperties aclProperties) throws AclException {
        AuthTokenUtils.authTokenByPublicKey(aclProperties);
    }

    @Override
    public void doAclCheckInReceive(AclProperties aclProperties) throws AclException {
        AuthTokenUtils.authTokenByPublicKey(aclProperties);
    }
}
