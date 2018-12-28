package com.kodilla.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.31), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 4", 21.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 5",  7.49), 2.0));
        //Then
        Assert.assertEquals(200.98, invoice.getValueToPay(), 0);
    }
}
