package lk.ijse.dep9.dao;

public class DAOFactory {

    private static DAOFactory daoFactory;

    public DAOFactory() {

    }

    public static DAOFactory getInstance(){

        return (daoFactory==null) ? daoFactory = new DAOFactory():daoFactory;


    }
}
