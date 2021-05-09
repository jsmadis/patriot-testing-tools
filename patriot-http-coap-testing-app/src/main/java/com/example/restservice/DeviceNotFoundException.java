package com.example.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Device not found")
public class DeviceNotFoundException extends RuntimeException{
}
