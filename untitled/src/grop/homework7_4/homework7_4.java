package grop.homework7_4;

public class homework7_4 {

    private int[] array = new int[0];

    public int[] add(int newnumber) {
      int[] NewArray= new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            NewArray[i]=array[i];}
        NewArray[NewArray.length-1]=newnumber;
            array=NewArray;
        return array;
    }
    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public int[] swap(int number1, int number2){
        int[] newarray =new int [array.length];
        int number3;
        number3=number1;
        number1=number2;
        number2=number3;
        return newarray;
    }
    public  homework7_4 indexOf(int number){
        homework7_4  indexs =new homework7_4();
        for (int i = 0; i < array.length; i++) {
            if (array[i]==number){
                indexs.add(i);
            }

        }return indexs;
    }
    public int[] sort (){
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }

            }
        }return array;
    }public void copi(int[]newarray){
        for (int i = 0; i < array.length; i++) {
            newarray[i]=array[i];
        }
    }
    public void addAll(int[]newArray){
        for (int i = 0; i < array.length; i++) {
            int number= array.length+ newArray.length;
            array[i]=array[number];
            array[number]= array[i]+newArray[i];
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array);
        }
    }

}
