package com.diegopinheiro.ed1_05;

public class Node <Key extends Comparable <Key>, Value> {
	
	private Key key;
	private Value value;
	private Node <Key, Value> left;
	private Node <Key, Value> right;
	private int size;
	
	public Node(Key key, Value value, int size) {
		this.key = key;
		this.value = value;
		this.size = size;
	}
	
	public Key getKey() {
		return this.key;
	}
	public void setKey(Key key) {
		this.key = key;
	}
	public Value getValue() {
		return this.value;
	}
	public void setValue(Value value) {
		this.value = value;
	}
	public Node<Key, Value> getLeft() {
		return this.left;
	}
	public void setLeft(Node<Key, Value> left) {
		this.left = left;
	}
	public Node<Key, Value> getRight() {
		return this.right;
	}
	public void setRight(Node<Key, Value> right) {
		this.right = right;
	}
	public int getSize() {
		return this.size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj instanceof Node<?,?>) {
//			Node<?,?> other = (Node<?,?>) obj;
//			return this.key.equals(other.key);
//		}
//		return false;
//	}
//
//	@Override
//	public String toString() {
//		return String.valueOf(this.key);
//	}
	
}
