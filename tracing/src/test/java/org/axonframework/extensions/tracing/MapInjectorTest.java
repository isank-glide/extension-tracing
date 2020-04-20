/*
 * Copyright (c) 2010-2020. Axon Framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.extensions.tracing;

import org.junit.jupiter.api.*;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapInjectorTest {

    @Test
    void testInject() {
        MapInjector injector = new MapInjector();
        injector.put("key", "value");
        Map<String, String> metaData = injector.getMetaData();
        assertEquals("value", metaData.get("key"));
    }

    @Test
    void testMapInjectorIterator_throwsUnsupportedOperationException() {
        MapInjector injector = new MapInjector();
        assertThrows(UnsupportedOperationException.class, injector::iterator);
    }
}