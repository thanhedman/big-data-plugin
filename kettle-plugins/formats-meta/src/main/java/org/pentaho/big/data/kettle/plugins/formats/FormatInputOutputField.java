/*! ******************************************************************************
 *
 * Pentaho Data Integration
 *
 * Copyright (C) 2017 by Hitachi Vantara : http://www.pentaho.com
 *
 *******************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 ******************************************************************************/

package org.pentaho.big.data.kettle.plugins.formats;

import org.pentaho.di.core.injection.Injection;
import org.pentaho.di.trans.steps.file.BaseFileField;

/**
 * Base class for format's input/output field - path added.
 * 
 * @author <alexander_buloichik@epam.com>
 */
public class FormatInputOutputField extends BaseFileField {
  @Injection( name = "FIELD_PATH", group = "FIELDS" )
  protected String path;

  @Injection( name = "FIELD_NULLABLE", group = "FIELDS" )
  protected boolean nullable;

  public String getPath() {
    return path;
  }

  public void setPath( String path ) {
    this.path = path;
  }

  public boolean isNullable() {
    return nullable;
  }

  public void setNullable( boolean nullable ) {
    this.nullable = nullable;
  }
}
