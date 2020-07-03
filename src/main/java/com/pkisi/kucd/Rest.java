package com.pkisi.kucd;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Rest {
    @Autowired
    DBrepo dBrepo;

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Users> getUsers(){
        List<Users> users = Lists.newArrayList(dBrepo.findAll());
        List<UsersDTO> dtos = new ArrayList<>();
        for(Users u : users){
            UsersDTO dto = MapstructInterface.INSTANCE.usersToUsersDTO(u);
            dtos.add(dto);
        }
        for(UsersDTO dto : dtos){
            System.out.println(dto.getUserNickname());
        }
        return dBrepo.findAll();
    }

    @GetMapping("/proj")
    public ResponseEntity findAllBy(){
        List<Custom> customs = dBrepo.findAllBy();
        List<String> nameList = new ArrayList<>();
        for(Custom c : customs){
            nameList.add(c.getLogin());
        }
        return new ResponseEntity(nameList,HttpStatus.I_AM_A_TEAPOT);
    }

    @PostMapping("/add")
    public ResponseEntity<Users> addUsersTest(@RequestBody Users user){
        if(dBrepo.findByLogin(user.getLogin())!=null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Taki user już istnieje");
        }
        return new ResponseEntity<>(dBrepo.save(user),HttpStatus.OK);
    }

    @GetMapping("/get")
    public @ResponseBody
    String getSomething(){
        return "something";
    }

    @PostMapping("/post")
    public String postSometing(@RequestParam String echo){
        return echo;
    }
    @GetMapping("/pesel")
    public ResponseEntity checkPesel(@RequestBody Person person){
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("");
    }
}
