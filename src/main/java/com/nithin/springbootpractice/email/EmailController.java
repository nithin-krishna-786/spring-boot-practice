package com.nithin.springbootpractice.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mail")
public class EmailController {

	@Autowired
	private EmailSenderService emailSenderService;

	@PostMapping
	public ResponseEntity<String> sendEmail(@RequestBody EmailDTO emailDTO)
	{
		try {
		emailSenderService.sendSimpleEmail(emailDTO.getToEmail(), emailDTO.getBody(), emailDTO.getSubject());
		return new ResponseEntity<>("Email Sent Successfully",HttpStatus.OK);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>("Mail not sent",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
