package com.lambton.util;

import java.security.SecureRandom;
import java.util.Random;

/**
 * This class is to encrypt and validate the password
 */
public class PasswordUtil {
    private static final Random RANDOM = new SecureRandom();
    private static final String ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final int ITERATIONS = 10000;
    private static final int KEY_LENGTH = 256;

}
