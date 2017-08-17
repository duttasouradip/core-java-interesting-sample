package com.sd.basics.object;

public class CreateObjectDemo implements Cloneable {

  public String namel;

  public CreateObjectDemo() {
    super();
  }

  public CreateObjectDemo(String namel) {
    super();
    this.namel = namel;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("CreateObjectDemo [namel=");
    builder.append(namel);
    builder.append("]");
    return builder.toString();
  }

  public void display() {
    System.out.println("Obj:---> " + this.toString());
  }

  public static void main(String[] args)
      throws InstantiationException, IllegalAccessException, ClassNotFoundException,
      CloneNotSupportedException {
    CreateObjectDemo o1 = new CreateObjectDemo("object using new");
    o1.display();

    CreateObjectDemo o2 =
        (CreateObjectDemo) Class.forName("com.sd.basics.object.CreateObjectDemo").newInstance();
    o2.display();

    CreateObjectDemo o3 = (CreateObjectDemo) o1.clone();
    o3.display();

    // ObjectInputStream input = new ObjectInputStream(in);

  }

}
