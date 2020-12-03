package songjilong;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

class Student {
    
    String name;							
    int  code;						    	
    String sexy;							
    int age;								
    String grade;							
    String major;							


    public void toshows() {
        this.name = name;
        this.code = code;
        this.sexy=sexy;
        this.age=  age;
        this.grade=grade;
        this.major=major;
        Scanner sc=new Scanner(System.in);
        System.out.println("姓名");
        name =sc.next();
        System.out.println("学号");
        code=sc.nextInt();
        System.out.println("性别");
        sexy = sc.next();
        System.out.println("年龄");
        age =sc.nextInt();
        System.out.println("班级");
        grade= sc.next();
        System.out.println("专业");
        major =sc.next();
        System.out.println("你输入的姓名"+name+"学号："+code+"性别:"+sexy+"年龄"+age+"班级："+grade+"专业"+major);

    }

}
