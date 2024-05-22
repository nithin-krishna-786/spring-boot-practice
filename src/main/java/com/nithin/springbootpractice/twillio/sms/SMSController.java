package com.nithin.springbootpractice.twillio.sms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/sms")
public class SMSController {
	
	
	@Value("twillio.account-sid")
	private String accountSid;
	
	@Value("twillio.account.secret-key")
	private String authToken;
	
	@PostMapping("/send")
	public ResponseEntity<SMSMessage>sendSMS(@RequestBody SMSMessage smsReq){
		
        Twilio.init(accountSid, authToken);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(smsReq.getMobile()),
                new com.twilio.type.PhoneNumber("+91 7893913827"),
                smsReq.getMessage())
            .create();
        SMSMessage res=new SMSMessage();
        res.setMessage(message.getSid());
        res.setMobile(smsReq.getMobile());

        System.out.println(message.getSid());
        
        return  new ResponseEntity<SMSMessage>(res,HttpStatus.OK);
	}

}
