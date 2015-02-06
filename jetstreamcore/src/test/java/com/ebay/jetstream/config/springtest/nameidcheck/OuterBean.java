/*******************************************************************************
 *  Copyright © 2012-2015 eBay Software Foundation
 *  This program is dual licensed under the MIT and Apache 2.0 licenses.
 *  Please see LICENSE for more information.
 *******************************************************************************/
package com.ebay.jetstream.config.springtest.nameidcheck;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.NamedBean;


public class OuterBean implements BeanNameAware, NamedBean{
  private String name;
  private InnerBean inner;

  public void setBeanName(String name) {
    this.name = name;
  }

  public String getBeanName(){
    return name;
  }

  public InnerBean getInnerBean(){
    return inner;
  }

  public void setInnerBean(InnerBean inner){
    this.inner = inner;
  }
}
