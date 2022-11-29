package lk.ijse.dep9.dao;

import lk.ijse.dep9.entity.SuperEntity;
import lk.ijse.dep9.dao.exception.ConstrainViolationException;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public interface CrudDAO <T extends SuperEntity,ID extends Serializable>extends SuperDAO{

    long count();

    void deleteById(ID PK) throws ConstrainViolationException;

    boolean existsById(ID Pk);

    List<T> findAll();

    Optional<T> findById(ID PK);

    T save (T entity) throws ConstrainViolationException;

    T update (T entity) throws ConstrainViolationException;

}
