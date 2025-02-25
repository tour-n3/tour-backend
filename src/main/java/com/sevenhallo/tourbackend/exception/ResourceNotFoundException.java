package com.sevenhallo.tourbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Ngoại lệ được sử dụng khi không tìm thấy tài nguyên trong dịch vụ.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND) // Mã trạng thái HTTP 404
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}