package chap2_1.exception;

// 에러 만들기
public class LoginInvalidException extends Exception {

    public LoginInvalidException(String message) {
        super(message);
    }
}
