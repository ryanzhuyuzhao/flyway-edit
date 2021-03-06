/*
 * Copyright 2010-2018 Boxfuse GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.license;

/**
 * The various editions of Flyway.
 */
public enum Edition {
    COMMUNITY("Community"),
//    PRO("Pro"),
//    ENTERPRISE("Enterprise")
    //修改伪装成社区版本
    PRO("Community"),
    ENTERPRISE("Community")



    ;

    private final String description;

    Edition(String name) {
        this.description = "Flyway " + name + " Edition";
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return description;
    }
}