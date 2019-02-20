package com.daihui.filter.code.step3;

import com.daihui.filter.code.step1.Person;
import com.daihui.filter.code.step2.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 男性
 * @Author: daihui
 * @Description: 步骤 3：创建实现了 Criteria 接口的实体类。
 * @Date: Created in 17:51 2019-02-19
 * @Modified By:
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("男")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
