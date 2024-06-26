package com.nithin.springbootpractice.onetomany.unidirectional.mapping;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OneToManyUnidirectionalMappingTest {

	@Autowired
	private OrderRepository orderRepository;

	@Test
	void saveOrderMethod() {
		Order order = new Order();
		order.setOrderTrackingNumber("100ABC");
		order.setStatus("In progress");

		// create order item 1
		OrderItem orderItem1 = new OrderItem();
		orderItem1.setQuantity(2);
		orderItem1.setPrice(BigDecimal.valueOf(1000));
		orderItem1.setImageUrl("image1.png");
		order.getOrderItems().add(orderItem1);

		// create order item 2
		OrderItem orderItem2 = new OrderItem();
		orderItem2.setQuantity(3);
		orderItem2.setPrice(BigDecimal.valueOf(2000));
		orderItem2.setImageUrl("image2.png");
		order.getOrderItems().add(orderItem2);

		order.setTotalPrice(order.getTotalAmount());
		order.setTotalQuantity(2);

		orderRepository.save(order);
	}

	@Test
	void saveOrderMethod2() {
		Order order = new Order();
		order.setOrderTrackingNumber("100ABC");
		order.setStatus("In progress");

		// create order item 1
		OrderItem orderItem1 = new OrderItem();
		orderItem1.setQuantity(2);
		orderItem1.setPrice(BigDecimal.valueOf(1000));
		orderItem1.setImageUrl("image1.png");
		order.getOrderItems().add(orderItem1);

		// create order item 2
		OrderItem orderItem2 = new OrderItem();
		orderItem2.setQuantity(3);
		orderItem2.setPrice(BigDecimal.valueOf(2000));
		orderItem2.setImageUrl("image2.png");
		order.getOrderItems().add(orderItem2);

		order = orderRepository.save(order);

		System.out.println(order);
	}

	@Test
    void testFindMethod(){
    	Order order = orderRepository.findById(1L).orElseThrow(()-> new RuntimeException("No order found"));
    	System.out.println(order);
    }

	@Test
	void deleteOrderMethod() {
		orderRepository.deleteById(1L);
	}
}
