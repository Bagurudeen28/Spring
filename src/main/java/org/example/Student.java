package org.example;

public class Student extends Pen {

    private String name;

    private int age;

    private Pen pen;

    private Writer writer;

    public Student() {
    }

    public Student(String name, int age) {
        System.out.println("Only two arg called");
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Pen pen, Writer writer) {
        System.out.println("All the arg filled");
        this.name = name;
        this.age = age;
        this.pen = pen;
        this.writer = writer;
    }

    public Student(String name, int age, Pen pen) {
        this.name = name;
        this.age = age;
        this.pen = pen;
    }


    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public Writer getWriter() {
        return writer;
    }

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }







    public void show(){

        //System.out.println("I am a Student");

        System.out.println("Name : " +name+ " Age : "+age);
        writer.writing();
        pen.writing();

    }


}