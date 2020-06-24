package me.leandrit0.ktk.utils;

public class EncoderDecoder {
    public static String decode(String encoded) {
        return encoded.replace("$|$", "");
    }
}
