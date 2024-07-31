package org.example.level02.normal;

public class RandomMaker {
    public int randomNumber(int min, int max) {
        return (int)(Math.random() * (max - min)) + min;
    }

    public String randomUpperAlpabet(int length) {
        String string1 = "";
        for (int i = 0; i < length; i++) {
            char ch = (char)(Math.random() * 26 + 65);
            string1 += ch;
        }
        return string1;
    }

    public String rockPaperScissors() {
        int num = (int)(Math.random() * 3);
        if (num == 0) {
            return "가위";
        }
        else if (num == 1) {
            return "바위";
        }
        else {
            return "보";
        }
    }

    public String tossCoin() {
        int coin = (int)(Math.random() * 2);
        if (coin == 0) {
            return "앞면";
        }
        else {
            return "뒷면";
        }
    }
}
