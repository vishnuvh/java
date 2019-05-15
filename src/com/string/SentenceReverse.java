package com.problems.strings;

import java.util.ArrayList;
import java.util.List;

public class SentenceReverse {


  public String reverseUsingSplit(String sentence) {
    if (null == sentence && sentence.isEmpty()) {
      return null;
    }

    if (sentence.contains(" ")) {
      String[] splitBySpace = sentence.split(" ");
      StringBuilder sb = new StringBuilder();
      for (int i = splitBySpace.length - 1; i >= 0; i--) {
        sb.append(splitBySpace[i] + " ");
      }
      return sb.toString();
    } else {
      return sentence;
    }
  }

  public String reverseWithoutSplit(String sentence) {
    if (null == sentence && sentence.isEmpty()) {
      return null;
    }

    if (sentence.contains(" ")) {
      List<String> reversed = new ArrayList<>();
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < sentence.length(); i++) {
        char c = sentence.charAt(i);

        if (c == ' ' || i == sentence.length()-1){
          if (i == sentence.length()-1){
            reversed.add(sb.append(c).toString() +" ");
          }
          else {
            reversed.add(sb.toString() + " ");
          }
          sb = new StringBuilder();
        }
        else {
          sb.append(c);
        }
      }
      StringBuilder reverseString = new StringBuilder();
      for (int i=reversed.size()-1;i>=0;i--){
        reverseString.append(reversed.get(i));
      }
      return reverseString.toString();
    } else {
      return sentence;
    }
  }



  public static void main(String[] args) {
    SentenceReverse s = new SentenceReverse();
    System.out.println(s.reverseUsingSplit("Reverse this sentence"));
    System.out.println(s.reverseUsingSplit("Reverse"));
    System.out.println(s.reverseWithoutSplit("Reverse this sentence"));
  }
}
