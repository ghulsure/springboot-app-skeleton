package gov.ny.organization.management.service.exception;




public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = -7661881974219233311L;

    private final int statusCode;
    private final String message;
    private final String uniqueIdentifier;

    public ServiceException (String message, int statusCode, String uniqueIdentifier) {
        this.message = message;
        this.statusCode = statusCode;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public String getUniqueIdentifier() {
        return uniqueIdentifier;
    }
}