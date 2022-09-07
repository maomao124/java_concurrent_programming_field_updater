package mao.t1;

import mao.Student;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/**
 * Project name(项目名称)：java并发编程_字段更新器
 * Package(包名): mao.t1
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/9/7
 * Time(创建时间)： 15:59
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setId(101L).setName("张三").setAge(18);

        AtomicIntegerFieldUpdater<Student> atomicIntegerFieldUpdater
                = AtomicIntegerFieldUpdater.newUpdater(Student.class, "age");

        System.out.println(atomicIntegerFieldUpdater.getAndSet(student, 21));
        int age = atomicIntegerFieldUpdater.get(student);
        System.out.println(age);
    }
}
