package com.clientui.clientui.execeptions;


import feign.Response;

public class ErrorDecoder implements feign.codec.ErrorDecoder {

    private final feign.codec.ErrorDecoder defaultDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {

        if(response.status()==404){
            return new FilmNotFoundException("Film non trouvé");
        }
        return defaultDecoder.decode(s, response);
    }
}
