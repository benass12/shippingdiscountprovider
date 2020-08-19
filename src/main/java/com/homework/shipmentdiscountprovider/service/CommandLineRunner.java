package com.homework.shipmentdiscountprovider.service;

import org.springframework.stereotype.Component;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	private final ShipmentDiscountService shipmentDiscountService;

	public CommandLineRunner(ShipmentDiscountService shipmentDiscountService) {
		this.shipmentDiscountService = shipmentDiscountService;
	}

	@Override
	public void run(String... args) throws Exception {
		shipmentDiscountService.getMemberTransactions();
	}
}
