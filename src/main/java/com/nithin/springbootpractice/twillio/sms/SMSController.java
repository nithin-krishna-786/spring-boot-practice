package com.nithin.springbootpractice.twillio.sms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;


@RestController
@RequestMapping("/api/sms")
public class SMSController {
	
	private String ACCOUNT_SID="ACf3ece0d2d2c0a6a63b073cab689fe995";
	private String AUTH_TOKEN="8b7269fad243cb90b4b39cf64565b193";
	
	@PostMapping("/send")
	public ResponseEntity<SMSMessage>sendSMS(@RequestBody SMSMessage smsReq){
		
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
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
