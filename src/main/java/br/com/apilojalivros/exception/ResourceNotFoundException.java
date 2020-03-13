package br.com.apilojalivros.exception;

public class ResourceNotFoundException extends Exception {

    private static final long serialVersionUID = 1149243485394061914L;

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
