package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.UserEntity;
import com.demo.repository.UserRepository;

@RestController
@RequestMapping ("/models")

public class UserController {
	@Autowired
	private UserRepository UserRepo;
	@GetMapping("/user")
    public List<UserEntity> getAlldemo()
    {
        List<UserEntity> demo=UserRepo.findAll();
        return demo ;

    }
//  @GetMapping("/getdata/{id}")
//  public Optional<User> getUserById(@PathVariable int id)
//  {
//      Optional<User> u = Repo.findById(id);
//      return u;
//  }

  @PostMapping("/data")
  public String saveStudents(@RequestBody UserEntity user)
  {
  UserEntity save = UserRepo.save(user);
  if(save!=null)
  {
  return "your login was success";
  }
  else
  {

  return "your login was un success";
  }
  }


  @PostMapping("/login/{email}/{password}")
  public String verifylogin(@PathVariable String email,@PathVariable String password)
  {
  System.out.println(email);
  UserEntity user=UserRepo.findByEmail(email);
  if(user!=null)
  {
  if(user.getEmail().equals (email)&& user.getPassword().equals(password))
  {
  return "Successfully login";
  }
  else
  {
  return "login was unsuccessfull! failed please enter valid username and password";
  }
  }
  else
  {
  return "login was failed enter valid user name:";


  }
  }

  @PutMapping("/update")
  public void updatedemos(@RequestBody UserEntity demos)
  {
      UserRepo.save(demos);
  }

  @DeleteMapping("/del/{id}")
  public void deletedemos(@PathVariable int id)
  {
      UserRepo.deleteById(id);
  }


}




