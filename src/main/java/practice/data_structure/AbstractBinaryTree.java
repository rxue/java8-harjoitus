package practice.data_structure;

import java.util.function.Consumer;

public abstract class AbstractBinaryTree<E> {
	protected Node<E> rootNode;
	public enum TraversalType {PREFIX, IN_ORDER, POSTFIX};
	public abstract void insert(E element);
	public void traverse(TraversalType traversalType, Consumer<E> consumer) {
		traverseInOrder(this.rootNode, consumer);
	}
	
	private void traverseInOrder(Node<E> root, Consumer<E> consumer) {
		if (root.leftChild != null)
			traverseInOrder(root.leftChild, consumer);
		consumer.accept(root.item);//VISIT
		if (root.rightChild != null)
			traverseInOrder(root.rightChild, consumer);
	}
	
	protected static class Node<E> {
		E item;
		Node<E> leftChild;
		Node<E> rightChild;
		Node(Node<E> leftChild, E element, Node<E> rightChild) {
			this.item = element;
			this.leftChild = leftChild;
			this.rightChild = rightChild;
		}
	}
}
