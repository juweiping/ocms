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

/**
 * <p>
 * Title:WorkerHelper
 * </p>
 * 
 * <p>
 * Description:工作线程帮助者
 * </p>
 * 
 * <p>
 * Copyright: Copyright (c) 2006
 * </p>
 * 
 * <p>
 * Company: http://www.openuap.org
 * </p>
 * $Id: WorkerHelper.java 3921 2010-10-26 11:43:49Z orangeforjava $
 * 
 * @author Weiping Ju
 * @version 1.0
 */
public class WorkerHelper {
	public WorkerHelper() {
	}

	public static void startTask(JobEntry je) {
		WorkerThread wt = new WorkerThread(je);
		Thread helper = new Thread(wt, "workHelper");
		helper.setDaemon(true);
		helper.start();
	}
}
