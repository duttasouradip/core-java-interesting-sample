package com.sd.basics.reference;

import java.lang.ref.SoftReference;

public class DemoSoftReference {

  public static void main(String[] args) {
    Employee emp = new Employee();
    emp.setId(101);
    emp.setName("Ram");
    System.out.println("Emp created:" + emp);

    SoftReference<Employee> softRef = new SoftReference<Employee>(emp);
    System.out.println("soft reference is created:" + softRef);

    emp = null;
    gc();

    emp = softRef.get();
    System.out.println("after seting null agin get back emp as :" + emp);
    softRef = null;
    emp = null;
    gc();
  }

  private static void gc() {
    System.out.println("before calling gc()");
    System.gc();
    System.out.println("after calling gc()");
  }
}
