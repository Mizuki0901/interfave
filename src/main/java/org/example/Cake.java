package org.example;

public class Cake implements Sweets {


  public String mix(String Material1, String Material2, String Material3) {
    return ":" + Material1 + "," + Material2 + "," + Material3;
  }


  @Override
  public String sweetsname(String name) {
    return name;
  }
}








