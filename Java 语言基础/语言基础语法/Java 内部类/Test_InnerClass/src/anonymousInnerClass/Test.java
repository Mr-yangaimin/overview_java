package anonymousInnerClass;

import java.util.Date;

public class Test {
    public static void main(String[] args){
//        Object obj = new Object(){
//            @Override
//            public String toString(){
//                return "hello world";
//            }
//        };

        Date date = new Date(123313){
            @Override
            public String toString(){
                return "hello";
            }
        };
    }
}
