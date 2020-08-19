package com.homework.shipmentdiscountprovider.repository;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

import com.homework.shipmentdiscountprovider.model.MemberTransaction;
import org.springframework.stereotype.Repository;

@Repository
public class MemberTransactionsRepository {

	private static final String FILE_PATH = "src/main/resources/input.txt";


	public List<MemberTransaction> getMemberTransactions() throws IOException {
		List<String> transactions = Files.readAllLines(Paths.get(FILE_PATH));
		return transactions.stream()
				.map(s -> s.split(" "))
				.map(value -> new MemberTransaction(LocalDate.parse(value[0], DateTimeFormatter.ISO_DATE), value[1], value[2]))
				.collect(Collectors.toList());
	}
}
