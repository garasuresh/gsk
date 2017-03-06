package com.app.servicesapi;

import java.util.List;
import com.app.entities.Users;
 
public interface UsersService {
    public boolean saveOrUpdate(Users users);
 
    public List<Users> list();
 
    public boolean delete(Users users);
}
