/**
 * Copyright 2015 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package wherehows.common.schemas;

import java.util.List;


public class DatasetLocaleRecord extends AbstractRecord {

  String language;
  String country;
  String variant;

  @Override
  public String[] getDbColumnNames() {
    return new String[]{"language", "country", "variant"};
  }

  @Override
  public List<Object> fillAllFields() {
    return null;
  }

  public DatasetLocaleRecord() {
  }

  @Override
  public String toString() {
    try {
      return this.getFieldValueMap().toString();
    } catch (IllegalAccessException ex) {
      return null;
    }
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }
}
