package References;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class Test {
    public static void main(String[] args){
        /*软引用测试代码
        VM 运行时参数 -XX:+PrintGCDetails -Xms10M -Xmx10M -Xmn5M
        SoftReference softReference = new SoftReference(new byte[2 * 1024 * 1024]);
        byte[] buffer = new byte[1 * 1024 *1024];
        byte[] buffer1 = new byte[1 * 1024 *1024];
        byte[] buffer2 = new byte[1 * 1024 *1024];
        byte[] buffer3 = new byte[1 * 1024 *1024];
        byte[] buffer4 = new byte[1 * 1024 *1024];
        //此时即便 GC 后，内存空间也不足以分配一兆的连续空间
        byte[] buffer5 = new byte[1 * 1024 *1024];
        System.out.println(softReference.get());*/

        /*弱引用测试代码
        WeakReference weakReference = new WeakReference(new byte[2 * 1024 * 1024]);
        System.gc();
        System.out.println(weakReference.get());*/

        //虚引用的测试代码
        PhantomReference phantomReference = new PhantomReference(new byte[2 * 1024 * 1024],new ReferenceQueue());
        System.out.println(phantomReference.get());
    }
}
