package com.diegopinheiro.ed1_05;

import org.junit.Assert;
import org.junit.Test;

public class TestBinaryPutGet {

	@Test
	public void testGetEmpty() {
		BinarySearchTree<Integer, String> myBinarySearchTree = new BinarySearchTree<>();
		Integer key; 
		
		key = 5;
		
		String actual = myBinarySearchTree.get(key);
		String expected = null;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPutGetOneNode() {
		BinarySearchTree<Integer, String> myBinarySearchTree = new BinarySearchTree<>();
		Integer key; 
		String value; 
		
		key = 5;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		
		String actual = myBinarySearchTree.get(key);
		String expected = value;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPutGetTwoNodes() {
		BinarySearchTree<Integer, String> myBinarySearchTree = new BinarySearchTree<>();
		Integer key; 
		String value; 
		
		key = 5;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 3;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		
		
		String actual = myBinarySearchTree.get(key);
		String expected = value;
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testPutGetThreeNodesHeightOne() {
		BinarySearchTree<Integer, String> myBinarySearchTree = new BinarySearchTree<>();
		Integer key; 
		String value; 
		
		key = 5;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 3;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 8;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		String actual = myBinarySearchTree.get(key);
		String expected = value;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPutGetFourNodesHeightTwo() {
		BinarySearchTree<Integer, String> myBinarySearchTree = new BinarySearchTree<>();
		Integer key; 
		String value; 
		
		key = 5;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 3;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 8;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 2;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		String actual = myBinarySearchTree.get(key);
		String expected = value;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPutGetFiveNodesHeightTwo() {
		BinarySearchTree<Integer, String> myBinarySearchTree = new BinarySearchTree<>();
		Integer key; 
		String value; 
		
		key = 5;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 3;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 8;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 2;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		key = 7;
		value = "Valor" + String.valueOf(key);
		myBinarySearchTree.put(key, value);
		
		String actual = myBinarySearchTree.get(key);
		String expected = value;
		Assert.assertEquals(expected, actual);
	}
	
	

}
