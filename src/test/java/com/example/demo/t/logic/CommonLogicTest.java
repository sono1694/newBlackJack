package com.example.demo.t.logic;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CommonLogicTest {

	@Test
	public void cardConverterTest001() {
		CommonLogic target = new CommonLogic();
		
		String result = target.cardConverter(1);
		assertThat(result).isEqualTo("♣");
	}
	
	@Test
	public void cardConverterTest002() {
		CommonLogic target = new CommonLogic();
		
		String result = target.cardConverter(14);
		assertThat(result).isEqualTo("♦");
	}
	
	@Test
	public void cardConverterTest003() {
		CommonLogic target = new CommonLogic();
		
		String result = target.cardConverter(27);
		assertThat(result).isEqualTo("♥");
	}
	
	@Test
	public void cardConverterTest004() {
		CommonLogic target = new CommonLogic();
		
		String result = target.cardConverter(40);
		assertThat(result).isEqualTo("♠");
	}
}
