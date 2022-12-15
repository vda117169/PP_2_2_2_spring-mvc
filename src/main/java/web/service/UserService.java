package web.service;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.List;

@Component
public interface UserService {
    List<User> allUser();//показать юзеров

    void addUser(User user);//добавить юзеров

    void deleteUser(User user);//удалить юзеров

    void updateUser(User user);//изменить юзеров

    User getIdUser(int id);//получить по id юзеров
}
