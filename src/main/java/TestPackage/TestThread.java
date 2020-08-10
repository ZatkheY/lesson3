package TestPackage;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

class TestThread implements Callable<String> {
    private String[] array = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private String hash = "f016441d00c16c9b912d05e9d81d894d";

    void action() {
        if (!(call().equals(""))) {
            System.out.println(call());
        } else {
            System.out.println("hash is not decrypted!");
        }
    }

    @Override
    public String call() {
        for (String s : array) {
            for (String value : array) {
                for (String item : array) {
                    for (String element : array) {
                        if (hash.equals(generateMd5(s + value + item + element))) {
                            return s + value + item + element;
                        }
                    }
                }
            }
        }
        return "";
    }

    private String generateMd5(String st) {
        MessageDigest messageDigest;
        byte[] bytes = new byte[0];

        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(st.getBytes());
            bytes = messageDigest.digest();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        BigInteger bigInt = new BigInteger(1, bytes);
        String md5 = bigInt.toString(16);

        while (md5.length() < 32) {
            md5 = "0" + md5;
        }

        return md5;
    }
}
