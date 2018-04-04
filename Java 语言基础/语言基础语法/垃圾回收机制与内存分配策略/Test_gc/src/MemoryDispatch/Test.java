package MemoryDispatch;

public class Test {
    public static void main(String[] args){
        /*内存优先分配的 Eden 区域
        VM:-XX:+PrintGCDetails -Xms10M -Xmx10M -Xmn5M
        byte[] buffer = new byte[2 * 1024 * 1024];
        byte[] buffer1 = new byte[1 * 1024 * 1024];*/

        //VM：-XX:+PrintGCDetails -Xms10M -Xmx10M -Xmn5M
        //系统对象占用大约 2M 堆空间
        byte[] buffer = new byte[1 * 1024 * 1024];
        byte[] buffer1 = new byte[1 * 1024 * 1024];
        //此时新生代所剩下的空间大约 512K
        byte[] buffer2 = new byte[1 * 1024 * 1024];
    }
}
