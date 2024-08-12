package com.mauricio.springboot.backend.backendproducts.repositories;

import com.mauricio.springboot.backend.backendproducts.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200") // se comunica por el servidor de angular
@RepositoryRestResource(path = "products")
public interface ProductRepository extends CrudRepository<Product, Long> {

}
