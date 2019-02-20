package com.daihui.filter.code.step4;

import com.daihui.filter.code.step1.Person;
import com.daihui.filter.code.step2.Criteria;
import com.daihui.filter.code.step3.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: daihui
 * @Description: 步骤4: 使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表。
 * @Date: Created in 10:24 2019-02-20
 * @Modified By:
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("老李", "男", "单身"));
        persons.add(new Person("老张", "男", "已婚"));
        persons.add(new Person("小刘", "女", "已婚"));
        persons.add(new Person("小林", "女", "单身"));
        persons.add(new Person("小王", "男", "单身"));
        persons.add(new Person("张三", "男", "单身"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("男性: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\n女性: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\n单身 男性: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\n单身 Or 女性: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ 姓名 : " + person.getName()
                    + ", 性别 : " + person.getGender()
                    + ", 婚姻状态 : " + person.getMaritalStatus()
                    + " ]");
        }
    }
}
