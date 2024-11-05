package com.edge51.notesite;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.edge51.notesite.dao.UserMapper;
import com.edge51.pojo.User;

@SpringBootTest
public class NoteDbTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method start -----"));
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(userList.size() == 2, "");
        userList.forEach(System.out::println);
    }
}
