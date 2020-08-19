package com.homework.shipmentdiscountprovider.service;

import java.io.IOException;
import java.util.List;

import com.homework.shipmentdiscountprovider.model.MemberTransaction;
import com.homework.shipmentdiscountprovider.repository.MemberTransactionsRepository;
import org.springframework.stereotype.Service;

@Service
public class ShipmentDiscountService {

	private final MemberTransactionsRepository memberTransactionsRepository;

	public ShipmentDiscountService(MemberTransactionsRepository memberTransactionsRepository) {
		this.memberTransactionsRepository = memberTransactionsRepository;
	}

	public void getMemberTransactions() throws IOException {
		List<MemberTransaction> memberTransactions = memberTransactionsRepository.getMemberTransactions();
		System.out.println(memberTransactions.toString());
	}
}
