package com.example.demo.Controller;

import com.example.demo.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//Controller styrer afviklingen af modellen
@Controller
public class HomeController {
    @Autowired
    RestaurantService restaurantService;

    //Alle Get- og PostMapping lægges ind her

}
