package com.example.attendance_management_system.Attendance.Management.System.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllersAll {
    @GetMapping("/")
    public String getText(){
        return "index";
    }
}
