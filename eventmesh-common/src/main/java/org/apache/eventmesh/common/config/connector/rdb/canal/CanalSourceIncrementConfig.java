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

package org.apache.eventmesh.common.config.connector.rdb.canal;

import org.apache.eventmesh.common.remote.job.SyncConsistency;
import org.apache.eventmesh.common.remote.job.SyncMode;
import org.apache.eventmesh.common.remote.offset.RecordPosition;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CanalSourceIncrementConfig extends CanalSourceConfig {

    private String destination;

    private Long canalInstanceId;

    private String desc;

    private boolean ddlSync = true;

    private boolean filterTableError = false;

    private Long slaveId;

    private Short clientId;

    private String serverUUID;

    private boolean isMariaDB = true;

    private boolean isGTIDMode = true;

    private Integer batchSize = 10000;

    private Long batchTimeout = -1L;

    private String tableFilter;

    private String fieldFilter;

    private List<RecordPosition> recordPositions;

    // ================================= channel parameter
    // ================================

    // enable remedy
    private Boolean enableRemedy = false;

    // sync mode: field/row
    private SyncMode syncMode;

    // sync consistency
    private SyncConsistency syncConsistency;

    // ================================= system parameter
    // ================================

    // Column name of the bidirectional synchronization mark
    private String needSyncMarkTableColumnName = "needSync";

    // Column value of the bidirectional synchronization mark
    private String needSyncMarkTableColumnValue = "needSync";

    private SourceConnectorConfig sourceConnectorConfig;

}
