/**
 * Copyright (C) 2013 Premium Minds.
 *
 * This file is part of billy platypus (PT Pack).
 *
 * billy platypus (PT Pack) is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * billy platypus (PT Pack) is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with billy platypus (PT Pack). If not, see <http://www.gnu.org/licenses/>.
 */
package com.premiumminds.billy.portugal.test.services.documents;

import com.premiumminds.billy.core.util.NotImplemented;
import com.premiumminds.billy.portugal.persistence.entities.PTGenericInvoiceEntity;
import com.premiumminds.billy.portugal.services.documents.PTManualInvoiceIssuingHandler;
import com.premiumminds.billy.portugal.services.entities.PTGenericInvoice.TYPE;

@Deprecated
@NotImplemented
public class TestPTManualInvoiceIssuingHandler extends PTDocumentAbstractTest {

	private static final TYPE DEFAULT_TYPE = TYPE.FT;
	private static final String SOURCE_BILLING = "M";

	private PTManualInvoiceIssuingHandler handler;

	//
	// @Override
	// protected PTManualInvoiceEntity newInvoice(String invoiceUID,
	// String productUID, TYPE type, String businessUID, String customerUID) {
	//
	// return new PTManualInvoiceTestUtil(injector).getSimpleInvoiceEntity(
	// type, ENTRY_UID, invoiceUID, businessUID, customerUID,
	// productUID);
	// }
	//
	// protected PTInvoiceEntity newNormalInvoice(String invoiceUID,
	// String productUID, TYPE type, String businessUID, String customerUID) {
	//
	// return new PTInvoiceTestUtil(injector).getSimpleInvoiceEntity(type,
	// ENTRY_UID, invoiceUID, businessUID, customerUID,
	// Arrays.asList(productUID));
	// }
	//
	// @Before
	// public void setUpNewManualInvoice() {
	// handler = getInstance(PTManualInvoiceIssuingHandler.class);
	//
	// try {
	// parameters.setManualInvoiceType(DEFAULT_TYPE);
	// PTManualInvoiceEntity invoice = newInvoice(INVOICE_UID,
	// PRODUCT_UID, DEFAULT_TYPE, BUSINESS_UID, CUSTOMER_UID);
	//
	// issueNewInvoice(handler, invoice, DEFAULT_SERIES);
	// } catch (DocumentIssuingException e) {
	// e.printStackTrace();
	// }
	// }
	//
	// @Test
	// public void testIssuedManualInvoiceSimple() throws
	// DocumentIssuingException {
	// PTManualInvoice issuedInvoice = (PTManualInvoice) getInstance(
	// DAOPTManualInvoice.class).get(new UID(INVOICE_UID));
	//
	// assertEquals(DEFAULT_SERIES, issuedInvoice.getSeries());
	// assertTrue(1 == issuedInvoice.getSeriesNumber());
	// String formatedNumber = DEFAULT_TYPE + " " + DEFAULT_SERIES + "/1";
	// assertEquals(formatedNumber, issuedInvoice.getNumber());
	// assertEquals(SOURCE_BILLING, issuedInvoice.getSourceBilling());
	// }
	//
	// @Test(expected = InvalidSourceBillingException.class)
	// public void testIssuedDifferentType() throws DocumentIssuingException {
	// PTInvoiceEntity invoice = newNormalInvoice("normal_inv", "normal_prod",
	// TYPE.FT, "busi_id", "cust_id");
	// PTInvoiceIssuingHandler newHandler =
	// getInstance(PTInvoiceIssuingHandler.class);
	// issueNewInvoice(newHandler, invoice, DEFAULT_SERIES);
	// }

	@Deprecated
	@Override
	protected <T extends PTGenericInvoiceEntity> T newInvoice(
			String invoiceUID, String productUID, TYPE type,
			String businessUID, String customerUID) {
		// TODO Auto-generated method stub
		return null;
	}
}
