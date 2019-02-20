package com.daihui.filter.code.step3;

import com.daihui.filter.code.step1.Person;
import com.daihui.filter.code.step2.Criteria;

import java.util.List;

/**
 * 交集
 * @Author: daihui
 * @Description:  步骤 3：创建实现了 Criteria 接口的实体类。
 * @Date: Created in 10:21 2019-02-20
 * @Modified By:
 */
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
