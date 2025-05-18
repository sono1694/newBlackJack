package com.example.demo.t.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=true)
public class User extends ViewCommonData{
	
	// 山札
	private ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(52, 0));
	
	//プレイヤー
	private List<Integer> player = new ArrayList<>(); 
	
	//ディーラー
	private List<Integer> dealer = new ArrayList<>();
}
