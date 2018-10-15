package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {

    @Select("select * from account where id = #{aid}")
    Account findAccountById(Integer id);

    List<Account> findAll();
}
