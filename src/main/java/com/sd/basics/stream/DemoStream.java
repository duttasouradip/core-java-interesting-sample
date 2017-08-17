package com.sd.basics.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {

  public static void main(String[] args) {
    Address address1 = new Address("Niladri", "Karnataka", "India");
    Address address2 = new Address("Lr KAport", "Gaziabaad", "Eng");
    Address address3 = new Address("Bosch", "Berlin", "Aus");

    Student student1 = new Student("Nilmani", 101, address1);
    Student student2 = new Student("Zoro", 102, address2);
    Student student3 = new Student("Boxi", 103, address3);

    List<Student> students = Arrays.asList(student1, student2, student3);

    students.stream().forEach((s) -> s.setName(s.getName().concat("-X")));

    List<Student> names = students.stream()
        .filter(s -> s.getAddress().getCountry().equals("Eng")).collect(Collectors.toList());

    System.out.println("after stream:" + names);
    // students.parallelStream().

  }

}
