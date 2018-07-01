/**
 * @PROJECT.FULLNAME@ @VERSION@ License.
 *
 * Copyright @YEAR@ L2FProd.com
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
package com.l2fprod.common.application.core;

import com.l2fprod.common.application.selection.Selection;

import javax.swing.Action;

/**
 * DefaultActionUpdater.<br>
 *
 */
class DefaultActionUpdater implements ActionUpdater {

	private Class objectType;
	
	private String enableFor;
	
	public DefaultActionUpdater(String enableFor) {
	  this(Object.class, enableFor);
	}
	
	public DefaultActionUpdater(Class objectType, String enableFor) {
		this.objectType = objectType;
		this.enableFor = enableFor;
	}

	public static void validateEnableFor(String value) {	
		if (!"*".equals(value) &&
		    !"1".equals(value) &&
        !"2..*".equals(value)) {
      throw new IllegalArgumentException("Must be one of ");
    }
	}
	
	public void update(Action action, CommandContext context) {
		Object[] selected = Selection.Helper.
		  filter(context.getSelectionManager().getSelection(), objectType);
		if ("*".equals(enableFor) || null == enableFor) {
			action.setEnabled(selected.length > 0);
		} else if ("1".equals(enableFor)) {
			action.setEnabled(selected.length == 1);
		} else if ("2..*".equals(enableFor)) {
			action.setEnabled(selected.length >= 2);
		} else {
			action.setEnabled(false);
		}
	}

}
