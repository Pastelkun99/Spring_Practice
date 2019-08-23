package com.sts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PageNotFoundException extends RuntimeException {
	// 웹페이지에서는 따로 구현할 필요가 없다. 다만 상속은 받아야 한다.
	
}
