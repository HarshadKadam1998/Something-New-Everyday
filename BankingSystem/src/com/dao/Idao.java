package com.dao;
import packageBankSystem.*;
import java.util.ArrayList;

import packageBankSystem.Customer;
public interface Idao {
	void saveAllCustomers(ArrayList<Customer> customers);
	ArrayList<Customer> retrieveAllCustomers();
}
