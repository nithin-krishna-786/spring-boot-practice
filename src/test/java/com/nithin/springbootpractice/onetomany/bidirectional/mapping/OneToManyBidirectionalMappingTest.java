package com.nithin.springbootpractice.onetomany.bidirectional.mapping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.math.BigDecimal;

@SpringBootTest
public class OneToManyBidirectionalMappingTest {

	@Autowired
	private OrderRepository orderRepository;

	@Autowired
	private OrderItemRepository orderItemRepository;

	@Test
	void saveAddressMethod() {

		Order order = new Order();
		order.setOrderTrackingNumber("1000ABC");
		order.setTotalQuantity(5);
		order.setStatus("IN PROGRESS");
		order.setTotalPrice(new BigDecimal(1000));

		OrderItem orderItem1 = new OrderItem();
		orderItem1.setImageUrl("img1Link");
		orderItem1.setOrder(order);
		orderItem1.setPrice(BigDecimal.valueOf(1000));
		orderItem1.setQuantity(2);
		orderItem1.setOrder(order);
//      orderItemRepository.save(orderItem1);

		OrderItem orderItem2 = new OrderItem();
		orderItem2.setImageUrl("img2Link");
		orderItem2.setOrder(order);
		orderItem2.setPrice(BigDecimal.valueOf(2000));
		orderItem2.setQuantity(3);
		orderItem2.setOrder(order);
//       orderItemRepository.save(orderItem2);

		order.getOrderItems().add(orderItem1);
		order.getOrderItems().add(orderItem2);

		orderRepository.save(order);

	}

}
