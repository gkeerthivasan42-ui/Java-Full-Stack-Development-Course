package com.keerthivasanspring.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test")
	public String test() {
		return "<h1>Hellow World</h1>";
	}
	@GetMapping("/keerthi")
	public String add() {
		int a=100;
		int b=100;
		return"<h1>Total of "+a+" and "+b+" =<br> "+(a+b)+"</h1>";
	}
	public int myfunction(int a, int b) {
		return a+b;
	}
	@GetMapping("/args")
	public String myAdd() {
		return"<h1>Result:"+myfunction(100,200)+"</h1>";
	}
	
	int sarr(int[] myarr)
	{
		int len=myarr.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+myarr[i];
		}
		return sum;
	}
	
	@GetMapping("/arrsum")
	public String funArrSum()
	{
		int arr[]= {11,22,33,44,55,99};
		int arrtot=sarr(arr);
		return "Length of array:"+arr.length+"<h2>Sum of Array:"+arrtot+"</h2>";
	}
	
	//runtime data from url with parameters
	
	@GetMapping("/app/v1/{id}")
	public String showArgs(@PathVariable Long id)
	{
		Long data=id;
		return "<h1>Your URL runtime data:"+data+"<h1>";
	}
}
