package Lession2;

public class ThemPtu {
    public static void main(String[] args)
    {
        //Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        int[] arr  = {1,2,3,4,5,6,7,8,9};
        //Nhập giá trị x,vị trí cần chèn
        int x = 10;
        int index = 4;
        int size = arr.length +1;
        int[] arr1  = new int[size];
        int i;
        int j;
        //Nếu index <=1 và index >= array.length -1 thì hiển thị không chèn được phần tử vào mảng
        if(index <=1 && index >= arr.length - 1){
            System.out.println("Không chèn được phần tử vào mảng");
        }
        //chèn X
        //1-index && index -n
        for(i = 0; i<arr.length; i++)
        {
            if( i<index)
            {
                j = i;
                arr1[j] = arr[i];
            }
            if(i == index)
            {
                arr1[index] = x;
                arr1[index+1] =arr[index];
            }
            if(i>index)
            {
                j = i+1;
                arr1[j] = arr[i];
            }
        }
        //In ra mảng
        for(j = 0;j<arr1.length;j++)
        {
            System.out.println(arr1[j]);
        }
    }
}
