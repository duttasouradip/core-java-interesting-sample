package com.sd.basics.reference;

public class Employee {

  private String name;

  private Integer id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Employee [name=");
    builder.append(name);
    builder.append(", id=");
    builder.append(id);
    builder.append("]");
    return builder.toString();
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("employee finalize is called");
    super.finalize();
  }

}
