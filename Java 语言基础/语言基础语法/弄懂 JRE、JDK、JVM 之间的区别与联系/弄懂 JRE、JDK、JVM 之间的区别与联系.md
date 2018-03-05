
其实很多 Java 程序员在写了很多代码后，你问他 jre 和 jdk 之间有什么关系，jvm 又是什么东西，很多人不知所云。本篇不会讲述 jvm 底层是如何与不同的系统进行交互的，而主要理清楚三者之间的区别，搞清楚我们写的 xxx.java 文件是被谁编译，又被谁执行，为什么能够跨平台运行。

首先，我们分别对这三者进行阐述。

**JVM** ：英文名称（Java Virtual Machine），就是我们耳熟能详的 Java 虚拟机。它只认识 xxx.class 这种类型的文件，它能够将 class 文件中的字节码指令进行识别并调用操作系统向上的 API 完成动作。所以说，jvm 是 Java 能够跨平台的核心，具体的下文会详细说明。

**JRE** ：英文名称（Java Runtime Environment），我们叫它：Java 运行时环境。它主要包含两个部分，jvm 的标准实现和 Java 的一些基本类库。它相对于 jvm 来说，多出来的是一部分的 Java 类库。

**JDK** ：英文名称（Java Development Kit），Java 开发工具包。jdk 是整个 Java 开发的核心，它集成了 jre 和一些好用的小工具。例如：javac.exe，java.exe，jar.exe 等。

显然，这三者的关系是：一层层的嵌套关系。**JDK>JRE>JVM**。

接着，提出一个问题：**为什么我们的电脑在装完 jdk 后会有两个版本的 jre**？

留心的同学可能会发现，我们的 jdk 安装成功后，在 C:\Program Files\Java 目录会是这样的（这里，我是装的 jdk1.8 的版本）

![image](http://img.blog.csdn.net/20180304203124914?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzUzMjY3MTg=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

而 jdk 的子目录下也存在一个 jre。

![image](http://img.blog.csdn.net/20180304203133423?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzUzMjY3MTg=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

这两个不同版本的 jre 相互之间有什么联系吗？

答案是：没有联系。甚至准确的来说，它俩是一样的，无论是用哪一个都是可以的。只是很多人习惯将会单独安装另一个 jre，虽然单独安装的 jre 也并没有被使用，原因可能就是刚开始大家都不清楚 jdk 和 jre 之间的关系，所以就默认的都安装上了。

在 jdk 的 bin 目录下，基本上都是一些可执行文件，并且它们还不大。其实这些可执行文件只是外层的一层封装而已，这样的目的是避免输入的命令过长。例如 javac.exe 内部调用的其实是 JDK 中 lib 目录中的 tools.jar 中 com.sun.tools.javac.Main 类，也就是说这些工具只是入口而已。而实际上它们本身又都是由 Java 编写的，所以在 jdk 目录下的 jre 既提供了这些工具的运行时环境，也提供了我们编写完成的 Java 程序的运行时环境。

所以，很明显，jdk 是我们的开发工具包，它集成了 jre ，因此我们在安装 jdk 的时候可以选择不再安装 jre 而直接使用 jdk 中的 jre 运行我们的 Java 程序。（但是大部分人都默认将两个都装上了）。但是如果你的电脑不是用来开发 Java 程序的，而仅仅是用来部署和运行 Java 程序的，那么完全可以不用安装 jdk，只需要安装 jre 即可。

下一个问题，**Java 为什么能跨平台，实现一次编写，多处运行？**

Java 能够跨平台运行的核心在于 JVM 。不是 Java 能够跨平台，而是它的 jvm 能够跨平台。我们知道，不同的操作系统向上的 API 肯定是不同的，那么如果我们想要写一段代码调用系统的声音设备，就需要针对不同系统的 API 写出不同的代码来完成动作。

而 Java 引入了字节码的概念，jvm 只能认识字节码，并将它们解释到系统的 API 调用。针对不同的系统有不同的 jvm 实现，有 Linux 版本的 jvm 实现，也有 Windows 版本的 jvm 实现，但是同一段代码在编译后的字节码是一样的。引用上面的例子，在 Java API 层面，我们调用系统声音设备的代码是唯一的，和系统无关，编译生成的字节码也是唯一的。但是同一段字节码，在不同的 jvm 实现上会映射到不同系统的 API 调用，从而实现代码的不加修改即可跨平台运行。

本篇文章主要描述了 Java 相关的最基本的概念，理解了这几个基本的概念后，后续的学习才会有根有据，不会稀里糊涂的。


文章中的所有代码、图片、文件都云存储在我的 GitHub 上：

(https://github.com/SingleYam/overview_java)

欢迎关注微信公众号：扑在代码上的高尔基，所有文章都将同步在公众号上。

![image](http://img.blog.csdn.net/20180305113628126?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvcXFfMzUzMjY3MTg=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)