package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   //list cause many users could have same model of car
   List<User> getUsersByCar(Car car);
}
