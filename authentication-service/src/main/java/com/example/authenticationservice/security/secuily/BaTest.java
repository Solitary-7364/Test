package com.example.authenticationservice.security.secuily;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BaTest {
    public static void main(String[] args) {
        //算密码
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encode = bCryptPasswordEncoder.encode("password1") ;
        System.out.println(encode);
    /*
    \
$2a$10$rL5P9rgfzXs/hubfSPBXNe6UJDAERfk4O/Tr3vzepI9kqg.ZVffo2
$2a$10$8Vbm6Ko3.RiiXeXc5IdM5OCxJWbzYAO.s3bS6QA3v9T5fL0hJL3qe

     */
        encode = bCryptPasswordEncoder.encode("thisissecret");
        System.out.println(encode);

    }

}
