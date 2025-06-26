package com.projeto.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.projeto.demo.entities.Category;
import com.projeto.demo.entities.Order;
import com.projeto.demo.entities.User;
import com.projeto.demo.repositories.CategoryRepository;



@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
	    Optional<Category> obj = repository.findById(id);
	    return obj.orElse(null); // OU use orElseThrow para lançar exceção controlada
	}
	


}
