package com.projectsem4.be_project_sem4;

import com.projectsem4.be_project_sem4.dto.Response;
import com.projectsem4.be_project_sem4.service.impl.RoomService;
import com.projectsem4.be_project_sem4.service.interfac.IRoomService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class BeProjectSem4Application {

	public static void main(String[] args) {SpringApplication.run(BeProjectSem4Application.class, args);}

}
