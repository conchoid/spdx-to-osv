/**
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (c) 2021 Source Auditor Inc.
 */
package org.spdx.spdx_to_osv;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author gary
 *
 */
public class SwhApiTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.spdx.spdx_to_osv.SwhApi#getSwhRelease(java.lang.String)}.
	 * @throws SwhException 
	 * @throws IOException 
	 */
	@Test
	public void testGetSwhRelease() throws IOException, SwhException {
		SwhRelease result = SwhApi.getInstance().getSwhRelease("22ece559cc7cc2364edc5e5593d63ae8bd229f9f");
		assertEquals("release-2.3.0", result.getName());
		assertTrue(result.getDate().startsWith("2016-12-24"));
	}

}
