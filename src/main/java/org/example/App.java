package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Springconfig.xml");

        // System.out.println( "Hello World!" );

//        Student student= (Student) context.getBean("std1");
//        student.show();

//        Student student1= (Student) context.getBean("std2");
//        student1.show();


        //System.out.println("Name : " +student.getName()+ " Age : "+student.getAge());


//        Pen pen= (Pen) context.getBean("pen1");


//        System.out.println(pen.getColor());
//        pen.setColor("Yellow");
//        System.out.println(pen.getColor());


//        Student student= (Student) context.getBean("std1");
//        System.out.println(student.getPen().getColor());
//        student.getPen().setColor("Yellow");
//        System.out.println(student.getPen().getColor());


        // Writer writer= (Writer) new Pen();
        //writer.Writer();

//        Student student= (Student) context.getBean("std2");
//        student.show();

        Student student= (Student) context.getBean("std3");
        student.show();



    }
}
