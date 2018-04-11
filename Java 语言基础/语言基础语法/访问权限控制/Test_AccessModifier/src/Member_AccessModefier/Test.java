package Member_AccessModefier;

public class Test {
    public static void main(String[] args){
        PublicClass publicClass = new PublicClass();
        System.out.println(publicClass.name);
        System.out.println(publicClass.age);
        System.out.println(publicClass.sex);
        //编译器报错，不可访问的 tel 属性
        //System.out.println(publicClass.tel);
    }
}
