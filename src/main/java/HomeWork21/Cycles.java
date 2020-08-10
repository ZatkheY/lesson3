package HomeWork21;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.concurrent.Callable;

class Cycles implements Runnable {
    private String[] array = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    void reader() {
        System.out.println("enter hash: ");
    }

    @Override
    public void run() {
        double time = System.currentTimeMillis();
        //    private Scanner scanner = new Scanner(System.in);
        String input = "5ebe2294ecd0e0f08eab7690d2a6ee69";
        if (!(oneLetter(input).equals(""))) {
            System.out.println(oneLetter(input));
        } else if (!(twoLetters(input).equals(""))) {
            System.out.println(twoLetters(input));
        } else if (!(threeLetters(input).equals(""))) {
            System.out.println(threeLetters(input));
        } else if (!(fourLetters(input).equals(""))) {
            System.out.println(fourLetters(input));
        } else if (!(fifeLetters(input).equals(""))) {
            System.out.println(fifeLetters(input));
        } else if (!(sixLetters(input).equals(""))) {
            System.out.println(sixLetters(input));
        } else if (!(sevenLetters(input).equals(""))) {
            System.out.println(sevenLetters(input));
        } else {
            System.out.println("hash is not decrypted!");
        }
        double end = System.currentTimeMillis();
        System.out.println("Time: " + ((end - time) / 1000));
    }

    private String oneLetter(String str) {
        for (String s : array) {
            if (str.equals(generateMd5(s))) {
                return s;
            }
        }
        return "";
    }

    private String twoLetters(String str) {
        for (String value : array) {
            for (String s : array) {
                if (str.equals(generateMd5(value + s))) {
                    return value + s;
                }
            }
        }
        return "";
    }

    private String threeLetters(String str) {
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

    private String fourLetters(String str) {
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

    private String fifeLetters(String str) {
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

    private String sixLetters(String str) {
        for (String s : array) {
            for (String value : array) {
                for (String item : array) {
                    for (String element : array) {
                        for (String s1 : array) {
                            for (String s2 : array) {
                                if (str.equals(generateMd5(s + value + item + element + s1 + s2))) {
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

    private String sevenLetters(String str) {
        for (String s : array) {
            for (String value : array) {
                for (String item : array) {
                    for (String element : array) {
                        for (String s1 : array) {
                            for (String s2 : array) {
                                for (String s3 : array) {
                                    if (str.equals(generateMd5(s + value + item + element + s1 + s2 + s3))) {
                                        return s + value + item + element + s1 + s2 + s3;
                                    }
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

