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
package org.openuap.cms.user.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openuap.base.dao.hibernate.BaseObject;

/**
 * <p>
 * 带有扩展用户权限属性的对象
 * </p>
 * 
 * <p>
 * $Id: UserPermissionWithFieldsObject.java 3939 2010-10-27 08:41:36Z orangeforjava $
 * </p>
 * 
 * @author Joseph
 * @version 1.0
 */
public abstract class UserPermissionWithFieldsObject extends BaseObject{
	/** */
	protected Set <AbstractUserPermField>permissionFields;

	protected Map <String,AbstractUserPermField>permissionFieldMap;
	
	public Set<AbstractUserPermField> getPermissionFields() {
		return permissionFields;
	}

	public void setPermissionFields(Set<AbstractUserPermField> permissionFields) {
		this.permissionFields = permissionFields;
		initFieldsMap();
	}
	////
	protected void initFieldsMap(){
		if(permissionFields!=null){
			permissionFieldMap=Collections.synchronizedMap(new HashMap<String,AbstractUserPermField>());
			Iterator <AbstractUserPermField> fieldIterator= permissionFields.iterator();
			while(fieldIterator.hasNext()){
				AbstractUserPermField permField=fieldIterator.next();
				String fieldName=permField.getFieldName();
				permissionFieldMap.put(fieldName, permField);
			}
		}
	}
	public AbstractUserPermField getField(String name){
		if(permissionFieldMap!=null){
			return permissionFieldMap.get(name);
		}
		return null;
	}
}
