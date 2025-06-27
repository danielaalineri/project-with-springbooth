package com.projeto.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projeto.demo.entities.Order;
import com.projeto.demo.entities.Product;
import com.projeto.demo.entities.User;
import com.projeto.demo.repositories.ProductRepository;
import com.projeto.demo.repositories.UserRepository;



@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
	    Optional<Product> obj = repository.findById(id);
	    return obj.orElse(null); // OU use orElseThrow para lançar exceção controlada
	}
	


}
