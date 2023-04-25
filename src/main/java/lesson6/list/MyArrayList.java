package lesson6.list;

public class MyArrayList implements MyList{

    private static final int INITIAL_SIZE = 8; // начальная емкость контейнера
    private int size = 0; // длинна контейнера
    private int [] data;  // именно тут будут храниться элементы



    public MyArrayList() {
        data = new int[INITIAL_SIZE];
    }





    @Override
    public int size() { //количество элементов в списке
        return size;
    }

    @Override
    public int get(int index) {
        if(index < 0 || index>= size)
            throw new IndexOutOfBoundsException();

        return data[index];
    }

    @Override
    public boolean contains(int value) {
        for(int i = 0; i<size; i++){
            if(value ==data[i]){
                return true;
            }

        }

        return false;
    }

    @Override
    public void set(int index, int value) {
        if(index < 0 || index>= size)
            throw new IndexOutOfBoundsException();
        data[index]=value;

    }

    @Override
    public void add(int value) {
     if(size == data.length){
         increaseCapacity();

     }
    data[size]=value;
     size++;
    }

    private void increaseCapacity(){
        int [] newData = new int[size*2];
        for(int i =0; i<size; i++){
            newData[i] = data[i];
        }
        data=newData;
    }

    @Override
    public void add(int index, int value) {
        if(index < 0 || index>= size)
            throw new IndexOutOfBoundsException();

        if(size == data.length){
            increaseCapacity();
        }

        for( int i = index; size>i; size--){

            data[size]=data[size-1];
        }
        data[index]=value;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index>= size)
            throw new IndexOutOfBoundsException();
        for(int i = index + 1; i < size; i++){
            data[i-1]=data[i];
        }
        size--;
    }
}
