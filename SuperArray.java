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
    for (int i = 0; i < data.length; i++) {
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

  public boolean add(int index, String element) {
    String[] newArray = new String[size + 1];
    for (int i = 0; i < size + 1; i++) {
        newArray[i] = data[i];
        if (i == index) {
          i += 1;
        }
    }
    newArray[index] = element;
    return true;
  }
}
