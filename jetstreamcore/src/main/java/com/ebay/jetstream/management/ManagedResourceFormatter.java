/*******************************************************************************
 *  Copyright © 2012-2015 eBay Software Foundation
 *  This program is dual licensed under the MIT and Apache 2.0 licenses.
 *  Please see LICENSE for more information.
 *******************************************************************************/
/**
 *
 */
package com.ebay.jetstream.management;

import java.io.PrintWriter;
import java.util.Set;

/**
 * 
 */
public interface ManagedResourceFormatter {
	
  void format(String prefix, String path, Set<String> setFormatFields, PrintWriter writer) throws Exception;

  String getContentType();
}
