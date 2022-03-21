package dev.doha.mission3basic.service;

import dev.doha.mission3basic.dao.PostDao;
import dev.doha.mission3basic.dao.UserDao;
import dev.doha.mission3basic.dto.PostDto;
import dev.doha.mission3basic.dto.UserDto;
import dev.doha.mission3basic.entity.PostEntity;
import dev.doha.mission3basic.entity.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class UserService {
    private static final Logger logger = LoggerFactory.getLogger(PostService.class);
    private final UserDao userDao;

    public UserService(
            @Autowired UserDao userDao
    ){
        this.userDao = userDao;
    }

    public  void createUser(UserDto userDto){
        this.userDao.createUser(userDto);
    }

    public UserDto readUser(int id){
        UserEntity userEntity = this.userDao.readUser(id);
        UserDto userDto = new UserDto(
                Math.toIntExact(userEntity.getId()),
                userEntity.getUsername()
        );
        return userDto;
    }

    public List<UserDto> readUserAll(){
        Iterator<UserEntity> iterator = this.userDao.readUserAll();
        List<UserDto> userDtoList = new ArrayList<>();

        while (iterator.hasNext()){
            UserEntity userEntity = iterator.next();
            userDtoList.add(new UserDto(
                    Math.toIntExact(userEntity.getId()),
                    userEntity.getUsername()
            ));
        }
        return userDtoList;
    }

    public void updateUser(int id, UserDto userDto){
        this.userDao.updateUser(id, userDto);
    }

    public void deleteUser(int id){
        this.userDao.deleteUser(id);
    }
}
