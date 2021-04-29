package com.ssafy.test.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.test.model.Board;
import com.ssafy.test.model.BoardRepository;

@RestController
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardRepository boardRepository;
	
	
//	@PostMapping(value ="/create")
//	private ResponseEntity create(@RequestBody Board board) {
//		ResponseEntity entity = null;
//		Map result = new HashMap();
//		
//		try {
//			if(boardRepository.insert(entities) == 1) {
//				result.put("success", "success");
//			} else {
//				result.put("success", "fail");
//			}
//			entity = new ResponseEntity(result, HttpStatus.OK);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//			result.put("success", "error");
//			entity = new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
//		}
//		return entity;
//		
//	}
	
}
