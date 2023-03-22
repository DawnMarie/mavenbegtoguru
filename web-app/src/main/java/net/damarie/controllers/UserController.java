package net.damarie.controllers;

import net.damarie.domain.*;
import net.damarie.entities.User;
import net.damarie.mappers.UserMapper;

public class UserController {

    User saveUser(UserCommand command) {

        return UserMapper.INSTANCE.userCommandToUser(command);

    }
}
