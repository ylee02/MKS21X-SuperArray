public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
    size = 10;
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals("")) {
        data[i] = element;
        return true;
      }
    }
  }

  public String toString() {
    String temp = "[";
    for (int i = 0; i < data.length; i++) {
      temp += data[i] + ", ";
    }
    temp += "]";
    return temp;
  }
  
  public boolean contains(String element) {
	for (int i = 0; i < size; i++) {
		if (data[i].equals(element) {
			return true;
		}
	}
	return false;
  }

  public boolean add(int index, String element) {
    String[] newArray = new String[size + 1];
	size += 1;
    for (int i = 0; i < size + 1; i++) {
		if (i == index) {
          i += 1;
        }
        newArray[i] = data[i];
        
    }
    newArray[index] = element;
	data = newArray;
    return true;
  }
  
  public int indexOf(String element) {
	for (int i = 0; i < size; i++) {
		if (data[i].equals(element) {
			return i;
		}
	}
	return -1;
  }
  
  public int lastIndexOf(String element) {
	 int counter = -1;
	 for (int i = 0; i < size; i++) {
		if (data[i].equals(element) {
			counter = i;
		}
	 }
	 return counter;
  }
  
  public String remove(int index) {
	  String[] newArray = new String[size - 1];
	  size -= 1;
	  int counter = 0;
	  String counter2 = "";
	  for (int i = 0; i < size - 1; i++){ 
		if (i == index){ 
			counter2 = data[i]
			i += 1;
		}
		newArray[counter] = data[i];
		counter += 1;
	  }
	  data = newArray;
	  return counter2;
  }
}
