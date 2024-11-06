package gov.ny.organization.management.service.exception;


public class ServiceExceptionSchema {

    private final int statusCode;
    private final String message;

    public ServiceExceptionSchema (String message, int statusCode) {
        this.message = message;
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }
}
