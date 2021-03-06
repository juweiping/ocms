/*
 * Copyright 2002-2006 the original author or authors.
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
package org.openuap.cms.schedule;

import org.openuap.runtime.setup.hibernate.PluginLocalSessionFactoryBean;

/**
 * <p>计划任务本地</p>
 * $Id: ScheduleLocalSessionFactoryBean.java 3921 2010-10-26 11:43:49Z orangeforjava $
 * @author Weiping Ju
 * 
 */
public class ScheduleLocalSessionFactoryBean 
extends PluginLocalSessionFactoryBean {
	@Override
	protected String getDomain() {
		return "base";
	}

	@Override
	protected String getPluginId() {
		return SchedulePlugin.PLUGIN_ID;
	}
}
