package cn.funnyhuang.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

public class HomeControllerTest {
    private HomeController homeController;

    private MockMvc mockMvc;
    @Before
    public void setUp() throws Exception {
        homeController = new HomeController();
        mockMvc = standaloneSetup(homeController).build();
    }

    @Test
    public void home() throws Exception  {
        /**
         * RequestMapping的路径不要和jsp文件名称相同
         * value = "/home" jsp文件名称home，便会报错
         */
        mockMvc.perform(get("/getHome")).andExpect(view().name("home"));
    }
}