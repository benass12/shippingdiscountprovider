package com.homework.shipmentdiscountprovider.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ShippingProvider {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String provider;
	private String packageSize;
	private double price;
}
