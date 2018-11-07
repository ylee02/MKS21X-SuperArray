public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
	getSize();
  }
  
  public SuperArray(int startingCapacity) {
	if (startingCapacity < 0) {
		throw new IllegalArgumentException("Size cannot be" + size);
	}
	size = startingCapacity;
	data = new String[startingCapacity];
  }

  public void clear() {
    size = 0;
	String[] temp = new String[10];
	data = temp;
  }

  public int size() {
	  getSize();
    return size;
  }
  
  private void getSize(){
	  int ans = 0;
	  for (int i = 0; i < data.length; i++) {
		  if (this.data[i] != null) {
			  ans++;
		  }
	  }
	  size = ans;
  }

  public boolean add(String element) {
    getSize();
	if (size == data.length) {
		resize();
	}
	data[size] = element;
	getSize();
	return true;
  }
  
  public String get(int index) {
	  if (index < 0 ||index >= size) {
		  throw new IndexOutOfBoundsException();
	  }
	  else {
		  return data[index];
	  }
  }
  
  public String set(int index, String str) {
	  if (index < 0 ||index >= size) {
		  throw new IndexOutOfBoundsException();	
	  }
	  else {
		  String tempo = data[index];
		  data[index] = str;
		  return tempo;
	  }
  }
  private void resize() {
	  String[] newArray = new String[size * 2 + 1];
	  
	  for (int i = 0; i < size; i++){
		  newArray[i] = data[i];
	  }
	  data = newArray;
  }

  public String toString() {
    String temp = "[";
    for (int i = 0; i < size; i++) {
      if (data[i] != null) {
		if (i == size - 1) {
			temp += data[i];
			break;
		}
		else if (data[i + 1] == null) {
			temp += data[i];
			break;
		}
		temp += data[i] + ", ";
	  }
    }
    temp += "]";
    return temp;
  }
  
  public String toStringDebug() {
	if (data.length < 1) {
		return "[]";
	}
	if (data.length < 2) {
		return "[" + data[0] + "]";
	}		
    String temp = "[";
    for (int i = 0; i < data.length - 1; i++) {
		temp += data[i] + ", ";
	}
    temp += data[data.length - 1] + "]";
    return temp;
  }
  
  public boolean isEmpty() {
	  for (int i = 0; i < data.length; i++) {
		  if (data[i] != null) {
			  return false;
		  }
	  }
	  return true;
  }
  
  public boolean contains(String element) {
	for (int i = 0; i < size; i++) {
		if (data[i].equals(element)) {
			return true;
		}
	}
	return false;
  }

  public void add(int index, String element) {
	getSize();
	if (index < 0 || index > size) {
		throw new IndexOutOfBoundsException();
	}
    String[] newArray = new String[size + 3];
	int counter = 0;
    for (int i = 0; i < size + 1; i++) {
		if (i == index) {
          i += 1;
        }
        newArray[i] = data[counter];
        counter += 1;
		if (data[i] == null) {
			break;
		}
    }
    newArray[index] = element;
	data = newArray;
	getSize();
  }
  
  public int indexOf(String element) {
	for (int i = 0; i < size; i++) {
		if (data[i].equals(element)) {
			return i;
		}
	}
	return -1;
  }
  
  public int lastIndexOf(String element) {
	 int counter = -1;
	 for (int i = 0; i < size; i++) {
		if (data[i].equals(element)) {
			counter = i;
		}
	 }
	 return counter;
  }
  
  public String remove(int index) {
	  getSize();
	  if (index < 0 || index >= size) {
		  throw new IndexOutOfBoundsException();
	  }
	  String[] newArray = new String[size + 1];
	  int counter = 0;
	  String counter2 = "";
	  for (int i = 0; i < size; i++){ 
		if (i == index){ 
			counter2 = data[i];
			i += 1;
		}
		newArray[counter] = data[i];
		counter += 1;
	  }
	  data = newArray;
	  getSize();
	  return counter2;
  }
  
  public boolean remove(String element) {
	  if (!(this.contains(element))) {
		  return false;
	  }
	  String[] newArray = new String[size - 1];
	  size -= 1;
	  int counter = 0;
	  boolean done = false;
	  for (int i = 0; i < size + 1; i++) {
		if (data[i].equals(element) && !(done)) {
			i += 1;
			done = true;
		}
		newArray[counter] = data[i];
		counter += 1;
	  }
	  data = newArray;
	  return true;
  }

  
}
