package com.example.crudHpy;

import com.example.crudHpy.model.Employee;
import com.example.crudHpy.repository.EmployeeRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudHpyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudHpyApplication.class, args);
	}

	@Autowired
	private EmployeeRespository employeeRespository;

    @Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Benezeth");
		employee.setLastName("Petro");
		employee.setEmailId("benezethpetrus@gmail.com");
		employeeRespository.save(employee);

		Employee employee1 = new Employee();
		employee.setFirstName("Kasimu");
		employee.setLastName("Yusuph");
		employee.setEmailId("khasimu@gmail.com");
		employeeRespository.save(employee1);

		Employee employee2 = new Employee();
		employee.setFirstName("Happy");
		employee.setLastName("Jonh");
		employee.setEmailId("happy@gmail.com");
		employeeRespository.save(employee2);
	}


}
