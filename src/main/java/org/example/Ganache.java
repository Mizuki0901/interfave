package org.example;

public class Ganache implements Sweets {

  public String melt(String Material, String Material2) {
    return ":" + Material + "," + Material2;
  }

  @Override
  public String sweetsname(String name) {
    return name;
  }
}
