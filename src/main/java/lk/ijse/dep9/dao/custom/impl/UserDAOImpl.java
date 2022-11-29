package lk.ijse.dep9.dao.custom.impl;

import lk.ijse.dep9.dao.custom.UserDAO;
import lk.ijse.dep9.dao.exception.ConstrainViolationException;
import lk.ijse.dep9.entity.SuperEntity;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

public class UserDAOImpl implements UserDAO {
    private Connection connection;

    public UserDAOImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public long count() {
//        Statement statement = connection.createStatement();
//        statement.executeQuery("")
        Statement stm = null;
        try {
            stm = connection.prepareStatement("SELECT COUNT(`user_name`) FROM `user` ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        ResultSet rst = stm.executeQuery();
        rst.next();
        return rst.
    }

    @Override
    public void deleteById(Serializable PK) throws ConstrainViolationException {

    }

    @Override
    public boolean existsById(Serializable Pk) {
        return false;
    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Optional findById(Serializable PK) {
        return Optional.empty();
    }

    @Override
    public SuperEntity save(SuperEntity entity) throws ConstrainViolationException {
        return null;
    }

    @Override
    public SuperEntity update(SuperEntity entity) throws ConstrainViolationException {
        return null;
    }
}
