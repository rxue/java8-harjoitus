package practice.data_structure;

import java.util.Comparator;

public class BinarySearchTree<E> extends AbstractBinaryTree<E> {
	private Comparator<E> comparator;
	public BinarySearchTree () {
	}
	public BinarySearchTree(Comparator<E> comparator) {
		this.comparator = comparator;
	}
	public BinarySearchTree (E rootElement) {
		super.rootNode = new Node<E>(null, rootElement, null);
	}
	public BinarySearchTree (E rootElement, Comparator<E> comparator) {
		super.rootNode = new Node<E>(null, rootElement, null);
		this.comparator = comparator;
	}
	@Override
	public void insert(E element) {
		Node<E> currentNode = super.rootNode;
		while (true) {
			if (comparator.compare(currentNode.item, element) < 0) {
				if (currentNode.leftChild != null)
					currentNode = currentNode.leftChild;
				else {
					currentNode.leftChild = new Node<E>(null, element, null);
					return;
				}
			}
			else {
				if (currentNode.rightChild != null)
					currentNode = currentNode.rightChild;
				else {
					currentNode.rightChild = new Node<E>(null, element, null);
					return;
				}
			}
		}	
	}

}