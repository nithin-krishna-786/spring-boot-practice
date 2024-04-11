package com.nithin.springbootpractice.async2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.CompletableFuture;

@RestController
public class AsyncController {

	@Autowired
	private AsyncService asyncService;

	@GetMapping("/async")
	public CompletableFuture<String> executeAsync() {
		return asyncService.asyncMethodWithReturnType();
	}
}
