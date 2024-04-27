package org.example.Class18_Super_Method_Overloading;
/*
    Write program: User that has a constructor that initializes
    instance variable name and mobile number. Create a
    subclass/child class  userInfo that will have user address
    variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails
    method.
    Test your code.
     */

public class User {

    private String name;
    private String mobileNumber;

    User(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
    public String getInfo(){
        return name + " "+mobileNumber;
    }
}

class UserInfo extends User {
    private String address;

    public UserInfo(String name, String mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    public void printUserDetails() {
        System.out.println(getInfo()+" " +address);
    }
}

class UserTester{
    public static void main(String[] args) {
        UserInfo info = new UserInfo("Mohammed","123-456-789","123 4 lane, AnyTown, Country");
        info.printUserDetails();
    }
}





