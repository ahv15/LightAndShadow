/*
 * Copyright 2017 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.las.bases;

import org.terasology.engine.world.block.BlockRegion;
import org.terasology.engine.world.generation.Border3D;
import org.terasology.engine.world.generation.facets.base.SparseObjectFacet3D;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BaseFacet extends SparseObjectFacet3D<Base> {
    private final Collection<Base> bases = new ArrayList<>();

    public BaseFacet(BlockRegion targetRegion, Border3D border) {
        super(targetRegion, border);
    }

    public void add(Base base) {
        bases.add(base);
    }

    public Collection<Base> getBases() {
        return Collections.unmodifiableCollection(bases);
    }
}
