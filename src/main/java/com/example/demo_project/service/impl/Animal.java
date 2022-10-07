package com.example.demo_project.service.impl;

import com.example.demo_project.entity.Bird;
import com.example.demo_project.service.ifs.Active;

public class Animal implements Active {

	@Override
	public Bird fly(String name, int age) {
		Bird bird = new Bird();
		bird.setName("Kevin");
		bird.setAge(100);
		return bird;
	}

	public void printBird(Bird bird) {
//		System.out.println(bird.getName());
//		System.out.println(bird.getAge());
		System.out.println("我的名字是" + bird.getName() + "，今年" + bird.getAge() + "歲！");
	}
}
