package com.mycompany.final2;

public class Customer {

    private int id;
    private String name;
    private int age;

    public Customer() {
    }

    public Customer(int id, String name, int age) {
        setAge(age);
        setId(id);
        setName(name);
    }

    public String getCustomerInfo() {
        return id + "#####" + name + "#####" + age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        String idst = Integer.toString(id);
        if (id != 0 && idst.startsWith("9")) {
            this.id = id;

        } else {
            System.out.println("Invaild id, it must start with 9");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() <= 12 && name.startsWith("S")) {
            this.name = name;
        } else {
            System.out.println("Invalid name it  must start with S");
            
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 75) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }

    }
}
