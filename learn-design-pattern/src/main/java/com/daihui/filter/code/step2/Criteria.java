package com.daihui.filter.code.step2;

import com.daihui.filter.code.step1.Person;

import java.util.List;

/**
 * @Author: daihui
 * @Description:为标准（Criteria）创建一个接口。
 * @Date: Created in 17:51 2019-02-19
 * @Modified By:
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
