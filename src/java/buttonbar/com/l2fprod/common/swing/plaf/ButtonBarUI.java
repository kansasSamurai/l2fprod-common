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
package com.l2fprod.common.swing.plaf;

import javax.swing.AbstractButton;
import javax.swing.plaf.ComponentUI;

/**
 * Pluggable UI class for <code>ButtonBar</code>.
 */
public abstract class ButtonBarUI extends ComponentUI {

  /**
   * Called when an AbstractButton is added to a ButtonBarUI. It allows
   * pluggable UI to provide custom UI for the buttons added to the ButtonBar.
   * 
   * @param button
   */
  public void installButtonBarUI(AbstractButton button) {
  }

}
