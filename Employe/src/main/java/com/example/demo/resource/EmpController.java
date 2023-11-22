package com.example.demo.resource;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Emp;
import com.example.demo.repository.EmpRepository;


@RestController
public class EmpController {
	
	@Autowired
	private EmpRepository repository;
	
	@PostMapping("/addEmp")
	public String saveEmp(@RequestBody Emp emp) {
		repository.save(emp);
		return "Employe added :";
	}
	@GetMapping("/findAllBooks")
	public List<Emp> getEmp(){
		return repository.findAll();
	}
	@GetMapping("/findAllEmp/{id}")
	public Optional<Emp> getEmp(@PathVariable int empId){
        return repository.findById(empId);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int empId) {
		repository.deleteById(empId);
		return "Emp deleted with id : "+empId;
	}
}
