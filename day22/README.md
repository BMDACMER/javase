### jdk9--11新特性

**jdk9主要变化：**

- 模块化系统
- jShell命令
- 更多点击[此处](./reference/尚硅谷_宋红康_Java 5-11各个版本新特性最全总结.pdf)

<br>

**jdk10主要变化：**

① 局部变量类型推断(主要)
var

② 集合中新增copyOf（），用于创建只读的集合
```$xslt
 @Test
    public void test5(){
        //示例1：
        var list1 = List.of("Java", "Python", "C");
        var copy1 = List.copyOf(list1);
        System.out.println(list1 == copy1); // true

        //示例2：
        var list2 = new ArrayList<String>();
        list2.add("aaa");
        var copy2 = List.copyOf(list2);
        System.out.println(list2 == copy2); // false

        //示例1和2代码基本一致，为什么一个为true,一个为false?
        //结论：copyOf(Xxx coll):如果参数coll本身就是一个只读集合，则copyOf()返回值即为当前的coll
        //如果参数coll不是一个只读集合，则copyOf()返回一个新的集合，这个集合是只读的。

    }
```


<br>

**jdk11主要变化：**

- 本地变量类型推断
- 字符串加强 
- 集合加强 
- Stream 加强 
- Optional 加强 
- InputStream 加强
- HTTP Client API
- 化繁为简，一个命令编译运行源代码

