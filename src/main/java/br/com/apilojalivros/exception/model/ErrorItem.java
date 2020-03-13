package br.com.apilojalivros.exception.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ErrorItem {

    private String code;
    private String message;
    private String date;
}
