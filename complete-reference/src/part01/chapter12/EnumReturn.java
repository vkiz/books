package part01.chapter12;

import java.util.Random;

enum Answers {
    NO, YES, MAYBE, LATER, SOON, NEVER
}

class Question {
    Random rand = new Random();
    Answers ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 15) {
            return Answers.MAYBE;   // 15%
        } else if (prob < 30) {
            return Answers.NO;      // 15%
        } else if (prob < 60) {
            return Answers.YES;     // 30%
        } else if (prob < 75) {
            return Answers.LATER;   // 15%
        } else if (prob < 98) {
            return Answers.SOON;    // 13%
        } else {
            return Answers.NEVER;   // 2%
        }
    }
}

class EnumReturn {
    static void answer(Answers ans) {
        switch (ans) {
            case NO:
                System.out.println("Нет");
                break;
            case YES:
                System.out.println("Да");
                break;
            case MAYBE:
                System.out.println("Возможно");
                break;
            case LATER:
                System.out.println("Позже");
                break;
            case SOON:
                System.out.println("Скоро");
                break;
            case NEVER:
                System.out.println("Никогда");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
