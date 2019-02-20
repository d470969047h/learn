package com.daihui.filter.code.step3;

import com.daihui.filter.code.step1.Person;
import com.daihui.filter.code.step2.Criteria;

import java.util.List;

/**
 * 并集
 * @Author: daihui
 * @Description: 步骤 3：创建实现了 Criteria 接口的实体类。
 * @Date: Created in 10:22 2019-02-20
 * @Modified By:
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
