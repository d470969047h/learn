package com.daihui.filter.code.step3;

import com.daihui.filter.code.step1.Person;
import com.daihui.filter.code.step2.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 单身
 * @Author: daihui
 * @Description: 步骤 3：创建实现了 Criteria 接口的实体类。
 * @Date: Created in 10:20 2019-02-20
 * @Modified By:
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("单身")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
