package com.mma.exception;

public class ProfileNotFoundException extends Exception {

    private Integer id;
    public ProfileNotFoundException(Integer id) {
        super(String.format("Profile not found for id: '%s'", id));
    }

}
