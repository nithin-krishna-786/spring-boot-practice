package com.nithin.springbootpractice.jsonignore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {
	
	@Autowired
	private NotificationRepository notificationRepository;
	
	@PostMapping
	public ResponseEntity<Notification> createNotification(NotificationDTO notificationDTO)
	{
		Notification notification = new Notification();
		notification.setHeader("Header1");
		notification.setMessage("Message1");
		notification.setOtp("123654");
		notification = notificationRepository.save(notification);
		
		return ResponseEntity.ok(notification);
	}

}
