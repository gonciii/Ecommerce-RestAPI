package dev.patika.ecommerce.core.result;


// veri bilgilendirme mesaj alanı !

import lombok.Getter;

@Getter
public class Result {
    private boolean status;
    private String message;
    private String code;

    public Result(boolean status, String message, String code) {
        this.status = status;
        this.message = message;
        this.code = code;
    }
}
