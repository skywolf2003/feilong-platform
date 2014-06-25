/*
 * Copyright (C) 2008 feilong (venusdrogon@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jdk.java.util;

import java.util.StringTokenizer;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Class StringTokenizerTest.
 * 
 * @author <a href="mailto:venusdrogon@163.com">金鑫</a>
 * @version 1.0 Feb 14, 2013 11:33:28 PM
 */
public class StringTokenizerTest{

	/** The Constant log. */
	private static final Logger	log	= LoggerFactory.getLogger(StringTokenizerTest.class);

	/**
	 * Test.
	 */
	@Test
	public final void test(){
		StringTokenizer stringTokenizer = new StringTokenizer("a b");

		while (stringTokenizer.hasMoreElements()){
			Object object = stringTokenizer.nextElement();
			log.info(object.toString());
		}
	}
}
