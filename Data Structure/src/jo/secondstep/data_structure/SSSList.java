package jo.secondstep.data_structure;

public interface SSSList {
	void add(int element);

    void add(int index, int element) throws Exception;

    void addFirst(int element) throws Exception;

    void addLast(int element) throws Exception;

    int size();

    boolean contains(int element);

    int get(int index) throws Exception;

    void remove(int index) throws Exception;

    void removeFirst() throws Exception;

    void removeLast() throws Exception;

    void addAll(SSSList list) throws Exception;

	void addAll(int index, SSSList list) throws Exception;

    int indexOf(int element) throws Exception ;

    void clear();

    void set(int index, int element) throws Exception;

    void print() throws Exception;


}
