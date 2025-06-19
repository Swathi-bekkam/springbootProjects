package com.property1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.propert1.model.Property1;

@Service
public class Property1service {
	
	private List<Property1> ls=new ArrayList<>();
	private int cnt=1;
	
	public Property1 create(Property1 property) {
		property.setId(cnt++);
		ls.add(property);
		return property;
	}
	public List<Property1> get() {
		return ls;
		
	}
	
	public Property1 getbyid(int id) {
		
		for(Property1 p:ls) {
			if(p.getId()==id) {
				return p;
			}
			
		}
		return null;
	}
	
	public boolean deletebyid(int id) {
		return ls.removeIf(p->p.getId()==id);
	}
	public void deleteall() {
		ls.clear();
	}
	
	public Property1 update(int id,Property1 updateproperty) {
		for(Property1 p:ls) {
			if(p.getId()==id) {
				p.setDescription(updateproperty.getDescription());
				p.setAddress(updateproperty.getAddress());
				return p;
			}
		}
		return null;
	}

}
