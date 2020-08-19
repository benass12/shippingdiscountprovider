package com.homework.shipmentdiscountprovider;

import com.homework.shipmentdiscountprovider.repository.ShippingProviderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShipmentDiscountProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShipmentDiscountProviderApplication.class, args);
	}

	@Bean
	CommandLineRunner shippingProviderDemo(ShippingProviderRepository shippingProviderRepository) {
		return (args ->
				shippingProviderRepository.findAll()
						.forEach(shippingProvider -> System.out.println(shippingProvider.toString())));
	}
}
