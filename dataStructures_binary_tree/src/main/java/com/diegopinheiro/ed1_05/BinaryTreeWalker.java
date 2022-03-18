package com.diegopinheiro.ed1_05;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeWalker<Key extends Comparable <Key>, Value> {
	
	private BinarySearchTree <Key, Value> bst;
	
	public BinaryTreeWalker (BinarySearchTree <Key, Value> bst) {
		this.bst = bst;
	}

	public List<Key> inOrder() {
		List<Key> visitedKeys = new ArrayList<>();
		inOrder(this.bst.getRoot(), visitedKeys);
		return visitedKeys;
	}
	
	private void inOrder(Node<Key, Value> x, List<Key> visitedKeys) {
		if(x == null) {
			return;
		}
		inOrder(x.getLeft(), visitedKeys);
		visitedKeys.add(x.getKey());
		inOrder(x.getRight(), visitedKeys);
	}

	public List<Key> breadthFirst() {
		List<Key> visitedKeys = new ArrayList<>();
		visitedKeys.add(bst.getRoot().getKey());
		breadthFirst(this.bst.getRoot(), visitedKeys);
		return visitedKeys;
	}

	private void breadthFirst(Node<Key, Value> x, List<Key> visitedKeys) {
		if(x == null) {
			return;
		}
		if (x.getLeft() != null) {
			visitedKeys.add(x.getLeft().getKey());
		}
		if (x.getRight() != null) {
			visitedKeys.add(x.getRight().getKey());
		}
		breadthFirst(x.getLeft(), visitedKeys);
		breadthFirst(x.getRight(), visitedKeys);
	}

	public List<Key> preorder() {
		List<Key> visitedKeys = new ArrayList<>();
		preorder(this.bst.getRoot(), visitedKeys);
		return visitedKeys;
	}
	
	private void preorder(Node<Key, Value> x, List<Key> visitedKeys) {
		if(x == null) {
			return;
		}
		visitedKeys.add(x.getKey());
		preorder(x.getLeft(), visitedKeys);
		preorder(x.getRight(), visitedKeys);
	}

	public List<Key> postorder() {
		List<Key> visitedKeys = new ArrayList<>();
		postorder(this.bst.getRoot(), visitedKeys);
		return visitedKeys;
	}

	private void postorder(Node<Key, Value> x, List<Key> visitedKeys) {
		if(x == null) {
			return;
		}
		if (x.getLeft() != null) {
			postorder(x.getLeft(), visitedKeys);
		}
		if (x.getRight() != null) {
		postorder(x.getRight(), visitedKeys);
		}
		visitedKeys.add(x.getKey());
	}
	
}
