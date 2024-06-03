package org.example;

public class Main {

  public static void main(String[] args) {
    Sweets sweets = new Cake();
    String messageA = sweets.sweetsname("ケーキ");

    Cake cake = new Cake();
    String messageA2 = cake.mix("卵", "小麦粉", "砂糖");

    Printer printer = new Printer();
    printer.print(messageA + messageA2);

    Sweets sweets2 = new Ganache();
    String messageB = sweets2.sweetsname("生チョコ");

    Ganache ganache = new Ganache();
    String messageB2 = ganache.melt("チョコレート", "生クリーム");

    Printer printer2 = new Printer();
    printer2.print(messageB + messageB2);

    Sweets sweets3 = new Cookie();
    String messageC = sweets3.sweetsname("クッキー");

    Cake cake2 = new Cake();
    String messageC2 = cake2.mix("卵", "小麦粉", "砂糖");

    Cookie cookie = new Cookie();
    String messageC3 = cookie.mix("バター");

    Printer printer3 = new Printer();
    printer3.print(messageC + messageC2 + messageC3);

  }

}
