package com.homework.shipmentdiscountprovider.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class MemberTransaction {
	private final LocalDate transactionDate;
	private final String packageSize;
	private final String carrierCode;
}
