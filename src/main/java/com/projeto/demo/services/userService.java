package com.projeto.demo.services;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import com.projeto.demo.entities.Order;
import com.projeto.demo.entities.User;
import com.projeto.demo.repositories.UserRepository;



@Service
public class userService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
	    Optional<User> obj = repository.findById(id);
	    return obj.orElse(null); // OU use orElseThrow para lançar exceção controlada
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	//função para atualizar um dado usuário
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		UpdateData(entity, obj);
		return repository.save(entity);
	}

	private void UpdateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
		
	}
	

	
	


}
