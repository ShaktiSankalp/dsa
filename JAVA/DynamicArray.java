public class DynamicArray {
    int size;
    int capacity  = 8;
    Object[] array;


    public DynamicArray(){
        this.array = new Object[capacity];
    };

    public DynamicArray(int cap){
        this.capacity = cap;
        this.array = new Object[capacity];
    };

    public void add(Object data){
        if(size>=capacity){
            grow();
        }else{
            array[size] = data;
            size++;
        }
    };

    public void insert(Object data, int index){
        if(size>=capacity){
            grow();
        }
            for(int i = size;i>index;i--){
                array[i] = array[i-1];
            }
            array[index] = data;
            size++;
        
    }

    public Object get(int index){
        return array[index];
    }

    public void delete(Object data){
        for(int i = 0;i<size-1;i++){
            if(array[i]==data){
                for(int j = i;j<size;j++){
                    array[j] = array[j+1];
                }
                array[size - 1] = null;
                size--;
                break;
            }
        }
    }

    public int search(Object data){
        for(int i = 0;i<size;i++){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }

    private void grow(){
        // int cap = (int) capacity*2;
        // capacity = cap;
        this.capacity *= 2;
        Object[] newArray = new Object[capacity];
        for(int i = 0;i<size;i++){
            newArray[i] = array[i];
        }
        array = newArray;

    };

    private void shrink(){
        int cap = (int) capacity/2;
        capacity = cap;
        //this.capacity = cap;
        Object[] newArray = new Object[capacity];
        for(int i = 0;i<size;i++){
            newArray[i] = array[i];
        }
        array = newArray;

    }

    public boolean isEmpty(){
        return size==0;
    }

    public String toString(){
        // String str = "";

        // for(int i = 0;i<size;i++){
        //     str += array[i] + ", ";
        // }
        // if(!str.isEmpty()){
        //     str = "[" + str.substring(0,str.length()-2) + "]";
        // }else{
        //     str = "[]";
        // }
        // return str;


        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
        }




        public static void main(String[] args){
            System.out.println("khikhi");
        }

}


