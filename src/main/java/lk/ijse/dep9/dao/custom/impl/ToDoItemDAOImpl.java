package lk.ijse.dep9.dao.custom.impl;

import lk.ijse.dep9.dao.custom.ToDoItemDAO;
import lk.ijse.dep9.dao.exception.ConstrainViolationException;
import lk.ijse.dep9.entity.SuperEntity;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public class ToDoItemDAOImpl implements ToDoItemDAO {

    @Override
    public long count() {
        return 0;
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
