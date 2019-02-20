package com.daihui.filter.code.step3;

import com.daihui.filter.code.step1.Person;
import com.daihui.filter.code.step2.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 女性
 * @Author: daihui
 * @Description: 步骤 3：创建实现了 Criteria 接口的实体类。
 * @Date: Created in 10:19 2019-02-20
 * @Modified By:
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("女")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }

}
