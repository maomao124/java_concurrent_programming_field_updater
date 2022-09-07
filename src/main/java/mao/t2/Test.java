package mao.t2;

import mao.Student;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/**
 * Project name(项目名称)：java并发编程_字段更新器
 * Package(包名): mao.t2
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/9/7
 * Time(创建时间)： 16:11
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Student student = new Student();
        student.setId(101L).setName("张三").setAge(18);

        AtomicLongFieldUpdater<Student> atomicLongFieldUpdater
                = AtomicLongFieldUpdater.newUpdater(Student.class, "id");

        long id = atomicLongFieldUpdater.getAndSet(student, 103);
        System.out.println(id);
        System.out.println(atomicLongFieldUpdater.get(student));
    }
}
