package Others;

import Member_AccessModefier.PublicClass;

public class Test {
    public static void main(String[] args){
        //PublicClass publicClass = new PublicClass();
        //编译器找不到该类
        //DefaultClass defaultClass = new DefaultClass();

        PublicClass publicClass = new PublicClass();
        //System.out.println(publicClass.name);
        //编译器报错，不可访问的 age 属性
        //System.out.println(publicClass.age);
        //编译器报错，不可访问的 sex 属性
        //System.out.println(publicClass.sex);
        //编译器报错，不可访问的 tel 属性
        //System.out.println(publicClass.tel);
    }
}
