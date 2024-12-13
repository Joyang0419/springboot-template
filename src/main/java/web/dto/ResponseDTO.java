package web.dto;

import lombok.Data;

@Data
public class ResponseDTO<T> {
    private int code;
    private String message;
    private T data;
}
