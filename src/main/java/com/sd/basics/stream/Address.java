package com.sd.basics.stream;

public class Address {

  private String streeatName;

  private String state;

  private String country;

  public Address(String streeatName, String state, String country) {
    super();
    this.streeatName = streeatName;
    this.state = state;
    this.country = country;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Address [streeatName=");
    builder.append(streeatName);
    builder.append(", state=");
    builder.append(state);
    builder.append(", country=");
    builder.append(country);
    builder.append("]");
    return builder.toString();
  }

  public String getStreeatName() {
    return streeatName;
  }

  public void setStreeatName(String streeatName) {
    this.streeatName = streeatName;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

}
