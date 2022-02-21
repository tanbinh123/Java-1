package main.com.exceptions;

public class InvalidMonthException extends Exception {
    InvalidMonthException(String e) {
        super(e);
    }
}

/*
InvalidMonthException(String message) {
    super(message);
}

This is a message in the exception class.

*/