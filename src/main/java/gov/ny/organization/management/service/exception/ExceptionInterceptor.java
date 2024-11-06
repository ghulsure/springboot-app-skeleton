package gov.ny.organization.management.service.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionInterceptor extends ResponseEntityExceptionHandler {
    private static final Logger exceptionLogger = LoggerFactory.getLogger(ExceptionInterceptor.class);

    @ExceptionHandler(ServiceException.class)
    public final ResponseEntity handleAllExceptions(ServiceException ex) {
        ServiceExceptionSchema exceptionResponse =
                new ServiceExceptionSchema(
                        ex.getMessage(), ex.getStatusCode());
        exceptionLogger.info("{} | ********************************* END *********************************", ex.getUniqueIdentifier());
        return new ResponseEntity(exceptionResponse, HttpStatus.valueOf(ex.getStatusCode()));
    }


}