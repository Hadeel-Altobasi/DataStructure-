package jo.secondstep.data_structure;

class Node {
	int value;
	Node next;

}

public class SSLinkedList implements SSSList {

	private Node head;
	private Node tail;
	private int size;

	public SSLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
		tail = null;
		size = 0;
	}

	@Override
	public void print() throws Exception {
		// TODO Auto-generated method stub
		if (size != 0) {
			Node node = head;
			while (node.next != null) {
				System.out.print(node.value + " ");
				node = node.next;
			}
			System.out.println(node.value);
		} else
			throw new Exception("NOElementInList");
	}

	@Override
	public void add(int element) {
		// TODO Auto-generated method stub
		Node node = new Node();
		node.value = element;
		node.next = null;

		if (head == null) {
			head = node;
			tail = node;

		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	@Override
	public void add(int index, int element) throws Exception {
		// TODO Auto-generated method stub
		Node node = head;
		Node newNode = new Node();
		newNode.value = element;
		if (index > 0 && index < size()) {
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			newNode.next = node.next;
			node.next = newNode;
		} else if (index == 0) {
			newNode.next = node;
			head = newNode;

		} else if (index == size()) {
			tail.next = newNode;
			tail = newNode;
			newNode.next = null;

		} else
			throw new Exception("IndexOutOfBound");
		size++;

	}

	@Override
	public void addFirst(int element) throws Exception {
		// TODO Auto-generated method stub
		add(0, element);
	}

	@Override
	public void addLast(int element) throws Exception {
		// TODO Auto-generated method stub
		add(size(), element);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub

		return size;
	}

	@Override
	public boolean contains(int element) {
		// TODO Auto-generated method stub
		Node node = head;
		if (tail.value == element)
			return true;
		while (node.next != null) {
			if (node.value == element)
				return true;
			node = node.next;

		}
		return false;
	}

	@Override
	public int get(int index) throws Exception {
		// TODO Auto-generated method stub
		if (index == 0)
			return head.value;
		if (index == size - 1)
			return tail.value;
		Node node = head;
		if (index > 0 && index < size - 1) {
			for (int i = 0; i < index; i++) {
				node = node.next;
			}
			return node.value;

		} else
			throw new Exception("IndexOutOfBound");

	}

	@Override
	public void remove(int index) throws Exception {
		// TODO Auto-generated method stub
		Node node = head;
		if (index == 0)
			head = head.next;
		else if (index == size - 1) {
			while (node.next != tail)
				node = node.next;
			node.next = null;
			tail = node;

		} else if (index > 0 && index < size - 1) {
			for (int i = 0; i < index - 1; i++) {
				node = node.next;
			}
			Node nextNode = node.next;
			node.next = nextNode.next;

		} else
			throw new Exception("IndexOutOfBound");
		size--;

	}

	@Override
	public void removeFirst() throws Exception {
		// TODO Auto-generated method stub
		remove(0);
	}

	@Override
	public void removeLast() throws Exception {
		// TODO Auto-generated method stub
		remove(size - 1);
	}

	@Override
	public void addAll(SSSList list) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++)

			add(list.get(i));
	}

	@Override
	public void addAll(int index, SSSList list) throws Exception {
		// TODO Auto-generated method stub
		SSLinkedList copyLinked = new SSLinkedList();
		for (int i = 0; i < list.size(); i++) {
			add(index, list.get(i));
			index++;
		}
	}

	@Override
	public int indexOf(int element) throws Exception {
		// TODO Auto-generated method stub
		Node node = head;

		if (tail.value == element)
			return size - 1;
		for (int i = 0; i < size - 1; i++) {
			if (node.value == element)
				return i;
			node = node.next;

		}
		throw new Exception("NOSuchElement");
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		head = null;

	}

	@Override
	public void set(int index, int element) throws Exception {
		// TODO Auto-generated method stub
		if (index == 0)
			head.value = element;
		if (index == size - 1)
			tail.value = element;
		else if (index > 0 && index < size - 1) {
			int i = 1;
			Node node = head.next;
			while (node.next != null) {
				if (i == index) {
					node.value = element;
					break;
				}
				i++;

			}

		} else
			throw new Exception("IndexOutOfBound");

	}

}
