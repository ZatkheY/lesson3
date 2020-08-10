package HomeWork21;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

 class CalculationInLoop {
    private String[] array = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

     String oneLetter(String str) {
        for (String s : array) {
            if (str.equals(generateMd5(s))) {
                return s;
            }
        }
        return "";
    }

     String twoLetters(String str) {
        for (String value : array) {
            for (String s : array) {
                if (str.equals(generateMd5(value + s))) {
                    return value + s;
                }
            }
        }
        return "";
    }

     String threeLetters(String str) {
        for (String s : array) {
            for (String value : array) {
                for (String item : array) {
                    if (str.equals(generateMd5(s + value + item))) {
                        return s + value + item;
                    }
                }
            }
        }
        return "";
    }

     String fourLetters(String str) {
        for (String s : array) {
            for (String value : array) {
                for (String item : array) {
                    for (String element : array) {
                        if (str.equals(generateMd5(s + value + item + element))) {
                            return s + value + item + element;
                        }
                    }
                }
            }
        }
        return "";
    }

     String fifeLetters(String str) {
        for (String s : array) {
            for (String value : array) {
                for (String item : array) {
                    for (String element : array) {
                        for (String s1 : array) {
                            if (str.equals(generateMd5(s + value + item + element + s1))) {
                                return s + value + item + element + s1;
                            }
                        }
                    }
                }
            }
        }
        return "";
    }

     String sixLetters(String str) {
        for (String s : array) {
            for (String value : array) {
                for (String item : array) {
                    for (String element : array) {
                        for (String s1 : array) {
                            for (String s2 : array) {
                                if (str.equals(s + value + item + element + s1 + s2)) {
                                    return s + value + item + element + s1 + s2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return "";
    }

    private String generateMd5(String st) {
        MessageDigest messageDigest = null;
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

