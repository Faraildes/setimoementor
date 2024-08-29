package model.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javafx.scene.control.cell.PropertyValueFactory;
import model.entities.Teacher;

public class TeacherService {
	
	public List<Teacher> findAll() {
		List<Teacher> list = new ArrayList<>();
		list.add(new Teacher(1, "Maria", new Date(), "12345678987", "987654321", 12000.00));
		list.add(new Teacher(2, "Marta", new Date(), "1234563487", "9873214321", 11000.00));
		list.add(new Teacher(3, "Mariana", new Date(), "12345634521", "987212121", 10000.00));
		return list;
	}
}
