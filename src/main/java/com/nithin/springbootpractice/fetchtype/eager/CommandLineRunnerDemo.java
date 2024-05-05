package com.nithin.springbootpractice.fetchtype.eager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerDemo implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User();
		user1.setName("Nithin");
		user1 = userRepository.save(user1);
		
		Todo t1 = new Todo("Go to Gym");
		t1.setUser(user1);
		
		Todo t2 = new Todo("Buy groceries");
		t2.setUser(user1);
		
		Todo t3 = new Todo("Visit temple");
		t3.setUser(user1);
		
		Todo t4 = new Todo("Visit laundry");
		t4.setUser(user1);
		
		List<Todo> todoList = List.of(t1,t2,t3,t4);
		user1.setTodos(todoList);
		
		user1 = userRepository.save(user1);
		
		User user2 = new User();
		user2.setName("Jonas");
		user2 = userRepository.save(user2);
		
		Todo t5 = new Todo("Go to Gym2");
		t5.setUser(user2);
		
		Todo t6 = new Todo("Buy groceries2");
		t6.setUser(user2);
		
		Todo t7 = new Todo("Visit temple2");
		t7.setUser(user2);
		
		Todo t8 = new Todo("Visit laundry2");
		t8.setUser(user2);
		
		List<Todo> todoList2 = List.of(t5,t6,t7,t8);
		user2.setTodos(todoList2);
		
		userRepository.save(user2);
		
		User userBySearch = userRepository.findById(2).orElseThrow(() -> new RuntimeException("No user with this id"));
		List<Todo> todoList3 = userBySearch.getTodos();
		System.out.println("Todolist size:"+todoList3.size());
		
	}

}
