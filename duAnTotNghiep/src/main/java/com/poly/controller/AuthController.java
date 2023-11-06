package com.poly.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.entity.Account;
import com.poly.entity.Authority;
import com.poly.entity.Role;
import com.poly.service.AccountService;
import com.poly.service.RoleService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    private AccountService accountService;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    
    @Autowired 
    RoleService roleService;

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Login Pages");
        return "login";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("title", "Home Pages");
        return "index";
    }
 


    @RequestMapping("/register")
    public String register(@ModelAttribute Account account) {
        // Lấy vai trò mặc định "User"
        Role defaultRole = roleService.findByName("User");

        // Tạo một đối tượng Authority để ánh xạ tài khoản và vai trò
        Authority authority = new Authority();
        authority.setAccount(account);
        authority.setRole(defaultRole);

        // Lưu Authority vào cơ sở dữ liệu
        // Nếu bạn đã cài đặt phương thức create trong AuthorityService
        // thì bạn có thể sử dụng authorityService.create(authority);

        // Lưu tài khoản vào cơ sở dữ liệu
        accountService.create(account);

        // Redirect hoặc thực hiện các hành động khác sau khi đăng ký

        return "redirect:/login"; // Ví dụ: Redirect đến trang đăng nhập
    }

    

}
