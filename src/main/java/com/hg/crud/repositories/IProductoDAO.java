package com.hg.crud.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hg.crud.models.ProductoDTO;

@Repository
public interface IProductoDAO extends MongoRepository<ProductoDTO, String> {
	
	
}
