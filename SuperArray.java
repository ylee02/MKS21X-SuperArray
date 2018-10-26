public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[1];
    size = 1;
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }
  
  

  public boolean add(String element) {
	
    for (int i = 0; i < size; i++) {
      if (data[i] == null) {
        data[i] = element;
        break;
      }
	  else if (data[i] != null && i == size - 1) {
		  resize();
		  data[i + 1] = element;
	  }
    }
	return true;
  }
  
  public String get(int index) {
	  if (index < 0 ||index >= size) {
		  return null;
	  }
	  else {
		  return data[index];
	  }
  }
  
  public String set(int index, String str) {
	  if (index < 0 ||index >= size) {
		  return null;
	  }
	  else {
		  data[index] = str;
		  return str;
	  }
  }
  private void resize() {
	  String[] newArray = new String[size + 1];
	  
	  for (int i = 0; i < size; i++){
		  newArray[i] = data[i];
	  }
	  newArray = data;
	  size += 1;
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
    String temp = "[";
    for (int i = 0; i < data.length - 1; i++) {
		temp += data[i] + ", ";
	}
    temp += data[size - 1] + "]";
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

  public boolean add(int index, String element) {
    String[] newArray = new String[size + 1];
	size += 1;
	int counter = 0;
    for (int i = 0; i < size + 1; i++) {
		if (i == index) {
          i += 1;
        }
        newArray[i] = data[counter];
        counter += 1;
    }
    newArray[index] = element;
	data = newArray;
    return true;
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
	  String[] newArray = new String[size - 1];
	  size -= 1;
	  int counter = 0;
	  String counter2 = "";
	  for (int i = 0; i < size - 1; i++){ 
		if (i == index){ 
			counter2 = data[i];
			i += 1;
		}
		newArray[counter] = data[i];
		counter += 1;
	  }
	  data = newArray;
	  return counter2;
  }
  
  public boolean remove(String element) {
	  String[] newArray = new String[size - 1];
	  size -= 1;
	  int counter = 0;
	  for (int i = 0; i < size - 1; i++) {
		if (data[i].equals(element)) {
			i += 1;
		}
		newArray[counter] = data[i];
		counter += 1;
	  }
	  return true;
  }
  
  
}
