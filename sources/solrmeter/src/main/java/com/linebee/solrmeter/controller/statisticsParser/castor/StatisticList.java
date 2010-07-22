/**
 * Copyright Linebee LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.linebee.solrmeter.controller.statisticsParser.castor;

import java.util.List;

import com.linebee.solrmeter.controller.StatisticDescriptor;

/**
 * Utility Class to be used by Castor for marshall/unmarshall statistic descriptors
 * @author tflobbe
 *
 */
public class StatisticList {
	
	private List<StatisticDescriptor> descriptors;

	public List<StatisticDescriptor> getDescriptors() {
		return descriptors;
	}

	public void setDescriptors(List<StatisticDescriptor> descriptors) {
		this.descriptors = descriptors;
	}

}