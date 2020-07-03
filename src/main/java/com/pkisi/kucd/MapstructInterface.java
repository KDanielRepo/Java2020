package com.pkisi.kucd;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MapstructInterface {
    MapstructInterface INSTANCE = Mappers.getMapper(MapstructInterface.class);
    @Mappings({
            @Mapping(target = "userId",source = "entity.id"),
            @Mapping(target = "userLogin",source = "entity.login"),
            @Mapping(target = "userPassword",source = "entity.password"),
            @Mapping(target = "userNickname",source = "entity.nickname"),
            @Mapping(target = "userEnvironment",source = "entity.environment"),
            @Mapping(target = "userPrefs",source = "entity.prefs"),
    })
    UsersDTO usersToUsersDTO(Users entity);
    @Mappings({
            @Mapping(target = "id",source = "dto.userId"),
            @Mapping(target = "login",source = "dto.userLogin"),
            @Mapping(target = "password",source = "dto.userPassword"),
            @Mapping(target = "nickname",source = "dto.userNickname"),
            @Mapping(target = "environment",source = "dto.userEnvironment"),
            @Mapping(target = "prefs",source = "dto.userPrefs"),
    })
    Users usersDTOToUsers(UsersDTO dto);
}
