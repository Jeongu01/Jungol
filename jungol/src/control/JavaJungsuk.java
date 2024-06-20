package control;

import java.io.IOException;
import java.util.Scanner;

class Ex4_1 {

  static void ex4_1Answers() {
    Scanner scanner = new Scanner(System.in);
    boolean[] answers = new boolean[8];
    // 4 - 1. 1
    System.out.print("4-1.1 번 답(int 형)을 입력하세요 : ");
    int x = scanner.nextInt();
    answers[0] = (10 < x && x < 20);
    // 4 - 1. 2
    scanner.nextLine();
    System.out.print("4-1.2 번 답(char 형)을 입력하세요 : ");
    String s = scanner.nextLine();
    answers[1] = !s.isEmpty();
    // 4 - 1. 3
    System.out.print("4-1.3 번 답(char 형)을 입력하세요 : ");
    char ch = scanner.next().charAt(0);
    answers[2] = (ch == 'x' || ch == 'X');
    // 4 - 1. 4
    System.out.print("4-1.4 번 답(char 형)을 입력하세요 : ");
    ch = scanner.next().charAt(0);
    answers[3] = ('0' <= ch && ch <= '9');
    // 4 - 1. 5
    System.out.print("4-1.5 번 답(char 형)을 입력하세요 : ");
    ch = scanner.next().charAt(0);
    answers[4] = ('A' <= ch && ch <= 'Z') || ('a' <= ch && ch <= 'z');
    // 4 - 1. 6
    System.out.print("4-1.6 번 답(int 형)을 입력하세요 : ");
    int year = scanner.nextInt();
    answers[5] = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    // 4 - 1. 7
    System.out.print("4-1.7 번 답(boolean 형)을 입력하세요 : ");
    boolean powerOn = scanner.nextBoolean();
    answers[6] = !powerOn;
    // 4 - 1. 8
    System.out.print("4-1.8 번 답(String 형)을 입력하세요 : ");
    String str = scanner.next();
    answers[7] = str.equals("yes");

    for (int i = 0; i < 8; i++) {
      System.out.println("4-1." + (i + 1) + "번 답 : " + answers[i]);
    }
  }
}

class Ex4_2 {

  static void ex4_2Answer() {
    int sum = 0;
    for (int i = 1; i <= 20; i++) {
      if (!(i % 2 == 0 || i % 3 == 0)) {
        sum += i;
      }
    }
    System.out.println("4-2 번 답 : " + sum);
  }
}

class Ex4_3 {

  static void ex4_3Answer() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      for (int j = i; j > 0; j--) {
        sum += j;
      }
    }
    System.out.println("4-3 번 답 : " + sum);
  }
}

class Ex4_4 {

  static void ex4_4Answer() {
    int sum = 0, start = 1, sign = 1;
    while (true) {
      sum += start;
      if (sum >= 100) {
        System.out.println("4-4 번 답 : " + start);
        break;
      }
      sign *= -1;
      start = sign * (Math.abs(start) + 1);

    }
  }
}

class Ex4_5 {

  static void ex4_5Answer() {
    int i = 0;
    System.out.println("4-5 번 답");
    while (i <= 10) {
      int j = 0;
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i++;
    }
  }
}

class Ex4_6 {

  static void ex4_6Answer() {
    System.out.println("4-6 번 답");
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        if (i + j == 6) {
          System.out.println(i + " " + j);
        }
      }
    }
  }
}

class Ex4_7 {

  static void ex4_7Answer() {
    String str = "12345";
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      sum += str.charAt(i) - '0';
    }

    System.out.println("4-7 번 답 : " + sum);
  }
}

class Ex4_8 {

  static void ex4_8Answer() {
    int value = (int) (Math.random() * 6) + 1;
    System.out.println("4-8 번 답 : " + value);
  }
}

class Ex4_9 {

  static void ex4_9Answer() {
    int num = 12345;
    int sum = 0;
    while (true) {
      if (num > 0) {
        sum += num % 10;
        num /= 10;
      } else {
        break;
      }
    }
    System.out.println("4-9 번 답 : " + sum);
  }
}

class Ex4_10 {

  static void ex4_10Answer() {
    int answer = (int) (Math.random() * 100) + 1;
    int input = 0;
    int count = 0;

    java.util.Scanner s = new java.util.Scanner(System.in);

    do {
      count++;
      System.out.print("1과 100사이의 값을 입력하세요 :");
      input = s.nextInt();
      if (input == answer) {
        System.out.println("맞혔습니다.");
        System.out.println("시도횟수는 " + count + "번입니다.");
        break;
      }
    } while (true);
  }
}

public class JavaJungsuk {

  public static void main(String[] args) throws IOException {

    Scanner s = new Scanner(System.in);
    boolean quit = false;
    while (!quit) {
      System.out.print("확인할 문제 번호(1 ~ 10)를 입력해주세요. 다른 값을 입력하면 멈춥니다. : ");
      int num = s.nextInt();
      switch (num) {
        case 1:
          Ex4_1.ex4_1Answers();
          break;
        case 2:
          Ex4_2.ex4_2Answer();
          break;
        case 3:
          Ex4_3.ex4_3Answer();
          break;
        case 4:
          Ex4_4.ex4_4Answer();
          break;
        case 5:
          Ex4_5.ex4_5Answer();
          break;
        case 6:
          Ex4_6.ex4_6Answer();
          break;
        case 7:
          Ex4_7.ex4_7Answer();
          break;
        case 8:
          Ex4_8.ex4_8Answer();
          break;
        case 9:
          Ex4_9.ex4_9Answer();
          break;
        case 10:
          Ex4_10.ex4_10Answer();
          break;
        default:
          quit = true;
          break;
      }
    }

  }

}
