package com.example.ProjectMicroservice.ProjectMicroservice;

import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepository extends
JpaRespositpory<ExchangeValueEntity, Long>{
	ExchangeValueEntity findByFromAndTo
	(String from, String to);
}