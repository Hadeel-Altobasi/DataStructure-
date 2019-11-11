package jo.secondstep.data_structure;

public class SSArrayList implements SSSList {
	private int[] array;
	private int size = 0, length;

	public SSArrayList() {
		// TODO Auto-generated constructor stub
		length = 3;
		array = new int[length];

	}

	@Override
	public void print() throws Exception {
		// TODO Auto-generated method stub
		if (size != 0) {
			for (int i = 0; i < size(); i++)
				System.out.print(get(i) + " ");
			System.out.print("\n");
		} else
			throw new Exception("NOElementInList");
	}

	@Override
	public void add(int element) {
		// TODO Auto-generated method stub
		if (size >= length) {
			extention();
		}
		array[size] = element;
		size++;

	}

	@Override
	public void add(int index, int element) throws Exception {
		// TODO Auto-generated method stub
		if (index >= 0 && index <= size) {
			if (size >= length)
				extention();
			for (int i = size - 1; i >= index; i--)
				array[i + 1] = array[i];
			array[index] = element;
			size++;

		} else
			throw new Exception("ArrayIndexOutOfBound");

	}

	@Override
	public void addFirst(int element) throws Exception {
		// TODO Auto-generated method stub
		add(0, element);
	}

	@Override
	public void addLast(int element) {
		// TODO Auto-generated method stub
		add(element);

	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean contains(int element) {
		// TODO Auto-generated method stub

		for (int i = 0; i < size; i++) {
			if (array[i] == element)
				return true;

		}
		return false;
	}

	@Override
	public int get(int index) throws Exception {
		// TODO Auto-generated method stub
		if (index >= 0 && index < size)
			return array[index];
		else
			throw new Exception("ArrayIndexOutOfBound");

	}

	@Override
	public void remove(int index) throws Exception {
		// TODO Auto-generated method stub

		if (index >= 0 && index < size) {
			for (int i = index; i < size - 1; i++)
				array[i] = array[i + 1];
			size--;

		} else
			throw new Exception("ArrayIndexOutOfBound");
	}

	@Override
	public void removeFirst() throws Exception {
		// TODO Auto-generated method stub
		remove(0);
	}

	@Override
	public void removeLast() throws Exception {
		// TODO Auto-generated method stub

		size--;
	}

	@Override
	public void addAll(SSSList list) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			add(list.get(i));

		}

	}

	@Override
	public void addAll(int index, SSSList list) throws Exception {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			add(index, list.get(i));
			index++;
		}

	}

	@Override
	public int indexOf(int element) throws Exception {
		// TODO Auto-generated method stub

		for (int i = 0; i < size; i++) {
			if (array[i] == element)
				return i;
		}
		throw new Exception("NoSuchElementException");

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		array = null;

	}

	@Override
	public void set(int index, int element) throws Exception {
		// TODO Auto-generated method stub

		if (index >= 0 && index < size)
			array[index] = element;
		else
			throw new Exception("ArrayIndexOutOfBound");

	}

	public void extention() {

		length = length + length /2;
		int[] newArray = new int[length];
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];

		}
		array = newArray;
	}
}
