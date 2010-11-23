/*
 * Copyright, Aspect Security, Inc.
 *
 * This file is part of JavaSnoop.
 *
 * JavaSnoop is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JavaSnoop is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with JavaSnoop.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.aspect.snoop.messages.agent;

import com.aspect.snoop.messages.AgentMessage;
import java.io.Serializable;
import java.util.List;

public class LoadClassesRequest extends AgentMessage implements Serializable {

    List<String> classesToLoad;

    public void setClassesToLoad(List<String> classesToLoad) {
        this.classesToLoad = classesToLoad;
    }

    public List<String> getClassesToLoad() {
        return classesToLoad;
    }

}
