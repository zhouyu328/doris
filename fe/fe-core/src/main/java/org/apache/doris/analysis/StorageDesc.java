// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.apache.doris.analysis;

import java.util.Map;


/**
 * Describe storage properties
 * The structure diagram is divided into three levels:
 *            StorageDesc
 *          /            \
 *    BrokerDesc        The other StorageBackend.StorageType desc
 *        |
 *  The broker's StorageBackend.StorageType desc
 */
public class StorageDesc {
    protected String name;
    protected StorageBackend.StorageType storageType;
    protected Map<String, String> properties;

    public StorageDesc() {}

    public StorageDesc(String name, StorageBackend.StorageType storageType, Map<String, String> properties) {
        this.name = name;
        this.storageType = storageType;
        this.properties = properties;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStorageType(StorageBackend.StorageType storageType) {
        this.storageType = storageType;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public StorageBackend.StorageType getStorageType() {
        return storageType;
    }

    public Map<String, String> getProperties() {
        return properties;
    }
}
