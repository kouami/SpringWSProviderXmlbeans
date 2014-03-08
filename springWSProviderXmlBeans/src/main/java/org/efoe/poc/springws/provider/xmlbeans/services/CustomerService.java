/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.efoe.poc.springws.provider.xmlbeans.services;

import org.efoe.poc.springws.provider.xmlbeans.domains.Customer;



/**
 *
 * @author Emmanuel
 */
public interface CustomerService {
    public Customer getCustomer(String ssn);
}
