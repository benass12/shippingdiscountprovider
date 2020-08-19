package com.homework.shipmentdiscountprovider.repository;

import com.homework.shipmentdiscountprovider.model.ShippingProvider;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingProviderRepository extends CrudRepository<ShippingProvider, Long> {
}
