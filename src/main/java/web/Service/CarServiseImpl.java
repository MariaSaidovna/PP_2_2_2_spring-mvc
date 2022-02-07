package web.Service;

import web.DAO.CarDao;
import web.DAO.CarDaoImpl;
import web.Model.Car;

import java.util.List;

public class CarServiseImpl implements CarServise {

    private CarDao dao = new CarDaoImpl();

    @Override
    public List<Car> getCars(int count) {
        return dao.getCars(count);
    }
}
