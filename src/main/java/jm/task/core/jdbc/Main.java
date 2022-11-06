package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    private static final UserService user = new UserServiceImpl();
    public static void main(String[] args) throws ClassNotFoundException {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoJDBCImpl();
    }
}
