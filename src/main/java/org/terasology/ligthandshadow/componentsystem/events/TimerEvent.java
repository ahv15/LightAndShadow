// Copyright 2021 The Terasology Foundation
// SPDX-License-Identifier: Apache-2.0
package org.terasology.ligthandshadow.componentsystem.events;

import org.terasology.engine.entitySystem.event.Event;
import org.terasology.engine.network.OwnerEvent;

/**
 * Trigger Event that starts and displays the timer for the actual game to begin.
 */
@OwnerEvent
public class TimerEvent implements Event {
}
