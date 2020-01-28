package hu.flowacademy.musicstore.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ValidationException  extends RuntimeException {


    public ValidationException(String s) {
        super(s);

    }
}
