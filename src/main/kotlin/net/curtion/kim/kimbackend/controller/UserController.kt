package net.curtion.kim.kimbackend.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @PostMapping("/user/register")
    fun userRegister() = "123"
}