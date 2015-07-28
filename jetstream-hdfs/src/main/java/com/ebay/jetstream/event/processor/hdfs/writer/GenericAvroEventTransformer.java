/*******************************************************************************
 *  Copyright © 2012-2015 eBay Software Foundation
 *  This program is dual licensed under the MIT and Apache 2.0 licenses.
 *  Please see LICENSE for more information.
 *******************************************************************************/
package com.ebay.jetstream.event.processor.hdfs.writer;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericRecord;

import com.ebay.jetstream.event.processor.hdfs.EventTransformer;

/**
 * @author weifang
 *
 */
public abstract class GenericAvroEventTransformer implements
		EventTransformer<GenericRecord> {
	private Schema schema;

	public Schema getSchema() {
		return schema;
	}

	public void setSchema(Schema schema) {
		this.schema = schema;
	}

}
