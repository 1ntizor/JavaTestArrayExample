package Array;

public class ArrayApp {
    public static void main(String[] args) {
        long[] arr = new long[10];
        int nElems = 0;
        int j;
        long searchKey;

        arr[0]= 77;
        arr[1]= 23;
        arr[2]= 12;
        arr[3]= 66;
        arr[4]= 44;

        for (j=0; j < nElems; j++)
            System.out.print(arr[j]+" ");
        System.out.println();
        searchKey = 12;
        for (j=0; j< nElems; j++)
            if (arr[j] == searchKey)
                break;
        if (j == nElems)
            System.out.print("Cant' find " + searchKey);
        else
            System.out.print("Found" + searchKey);
        searchKey = 66;
        for (j = 0; j < nElems; j++)
            if (arr[j]==searchKey)
                break;
        for (int k = j; k < nElems-1; k++)
            arr[k] = arr[k+1];
        nElems--;

        for (j=0; j<nElems; j++)
            System.out.print(arr[j] + " ");
        System.out.println(" ");

    }
}
