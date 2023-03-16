package com.bridgelabz.user_registration;

public class UserRegistration {
    public static void main(String[] args) {
        ValidateUserInfo validateUserInfo = new ValidateUserInfo();
        validateUserInfo.firstName();
        validateUserInfo.lastName();
        validateUserInfo.email();
        validateUserInfo.mobileNumber();
        validateUserInfo.passwordWithEightChar();
        validateUserInfo.passwordWithOneUpperCase();
        validateUserInfo.passwordWithOneNumeric();
    }
}
