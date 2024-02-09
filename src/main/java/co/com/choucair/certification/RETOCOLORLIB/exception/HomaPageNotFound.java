package co.com.choucair.certification.RETOCOLORLIB.exception;

public class HomaPageNotFound extends AssertionError {

    public static final String PRODUCT_NOT_FOUND = "The product found does not correspond to the search";

    public HomaPageNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}

