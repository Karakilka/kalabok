import java.util.Scanner;
import java.util.Arrays;
public class Main
{
    //43424234234234
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер программы\n 1)Вывод всеx элементов массива\n 2)Вывод всеx элементов массива в обратном порядке\n 3)Вывод четные элементы массива\n 4)Вывод всех элементов массива через 1\n 5)Вывод всех элементов массива до тех пор, пока не встретится -1\n 6)В массив добавляется элемент в конец\n 7)В массив добавляется элемент в начале\n 8)Добавить элемент в массив в позицию\n 9)Из массива удаляется элемент с конца\n 10)Из массива удаляется элемент с начала\n 11)Из массива удаляется элемент с позиции\n 12)Создание массива из двух массивов");
        int proga = scan.nextInt();
        if(proga==1)
        {one();}
        else if(proga==2)
        {two();}
        else if(proga==3)
        { three();}
        else if(proga==4)
        {four();}
        else if(proga==5)
        {five();}
        else if(proga==6)
        {six();}
        else if(proga==7)
        {seven();}
        else if(proga==8)
        {eight();}
        else if(proga==9)
        {nine();}
        else if(proga==10)
        {ten();}
        else if(proga==11)
        {eleven();}
        else if(proga==12)
        {twelve();}
        else
        {System.out.println("Неправильно выбран номер программы");}
    }
    static void one()
    {
        int [] arr1 = {-1,0,1,2,3,4,5,6,7,8};
        System.out.println("Вывод всех элементов массива:");
        for(int i = 0; i< arr1.length;i++)
        {System.out.println(arr1[i]);}
    }
    static void two()
    {
        int [] arr1 = {-1,0,1,2,3,4,5,6,7,8};
        System.out.println("Вывод всех элементов массива в обратном порядке:");
        for(int i = arr1.length-1; i >= 0;i--)
        {System.out.println(arr1[i]);}
    }
    static void three()
    {
        int [] arr1 = {-1,0,1,2,3,4,5,6,7,8};
        for(int i = 0; i < arr1.length;i++)
        {if(i % 2 == 0)
        {
            System.out.println("Индекс элемента массива:" + i + ")");
            System.out.println(arr1[i]);
        }
        }

    }
    static void four()
    {
        int [] arr1 = {-1,0,1,2,3,4,5,6,7,8};
        for(int i = 0; i < arr1.length;i++)
        {if(i % 2 != 0)
        {
            System.out.println("Индекс элемента массива:" + i + ")");
            System.out.println(arr1[i]);
        }
        }
    }
    static void five()
    {
        int [] arr1 = {0,1,2,3,4,-1,5,6,7,8,9,10};
        for(int i = 0; arr1[i] != -1;i++)
        {System.out.println(arr1[i]);}
    }
    static void six()
    {
        double [] arr1 = {7.85,86,650.5,61.2,68.789};
        Scanner scann = new Scanner(System.in);
        System.out.println("Число для введения в конец массива");
        double chislo = scann.nextDouble();
        arr1 = Arrays.copyOf(arr1,arr1.length + 1);
        arr1[arr1.length-1] = chislo;
        System.out.println("Новый массив:");
        for(int i = 0;i< arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
    }
    static void seven()
    {
        double [] arr2;
        double [] arr1 = {29,31,82,94,56,49};
        Scanner scann = new Scanner(System.in);
        System.out.println("Введите число для добавления в начало массива");
        double chislo = scann.nextDouble();
        arr1 = Arrays.copyOf(arr1,arr1.length + 1);
        arr2 = Arrays.copyOf(arr1,arr1.length);
        for (int i = 1;i < arr1.length;i++)
        {arr2[arr2.length-i] = arr1[arr1.length-i-1];}
        arr2[0] = chislo;
        for(int j = 0; j< arr2.length;j++)
        {System.out.println(arr2[j]);}
    }
    static void eight()
    {
        double [] arr2;
        double [] arr1 = {29,31,82,94,56,49};
        Scanner scanne = new Scanner(System.in);
        System.out.println("В какой место массива вы хотите добавить число?");
        int index = scanne.nextInt();
        System.out.println("Какое число вы хотите добавить в массив?");
        double chislo = scanne.nextDouble();
        arr1 = Arrays.copyOf(arr1,arr1.length + 1);
        arr2 = Arrays.copyOf(arr1,arr1.length);
        for(int i = arr1.length-1;i > index;i--)
        {arr2[i]=arr1[i-1];}
        arr2[index] = chislo;
        for(int j = 0; j< arr2.length;j++)
        {System.out.println(arr2[j]);}
    }
    static void nine()
    {
        double [] arr1 = {29,31,82,94,56,49};
        arr1 = Arrays.copyOf(arr1,arr1.length - 1);
        System.out.println("Ваш новый массив:");
        for(int i = 0;i< arr1.length;i++)
        {System.out.println(arr1[i]);}
    }
    static void ten()
    {
        double [] arr2;
        double [] arr1 = {29,31,82,94,56,49};
        arr2 = Arrays.copyOf(arr1,arr1.length-1);
        for (int i = arr1.length-1;i >=1;i--)
        {arr2[arr2.length-i] = arr1[arr1.length-i];}
        for(int j = 0; j< arr2.length;j++)
        {System.out.println(arr2[j]);}
    }
    static void eleven()
    {
        double [] arr2;
        double [] arr1 = {29,31,82,94,56,49};
        Scanner scanne = new Scanner(System.in);
        System.out.println("Какой элемент массива вы хотите удалить?");
        int index = scanne.nextInt();
        arr2 = Arrays.copyOf(arr1,arr1.length-1);
        for(int i = 0;i < arr1.length;i++)
        {
            if (i < index+1)
            {arr2[i] = arr1[i];}
            else
            {arr2[i-1] = arr1[i];}
        }
        for(int j = 0; j < arr2.length;j++)
        {System.out.println(arr2[j]);}
    }
    static void twelve()
    {
        double [] arr2 = {12,42,329,16,94,33};
        double [] arr1 = {29,31,82,94,56,49};
        double[] n;
        n = new double[arr1.length + arr2.length];
        int index = 0;
        int[] result = new int[arr1.length + arr2.length];

        System.arraycopy(arr1, 0, n, 0, arr2.length);
        System.arraycopy(arr2, 0, n, arr1.length, arr2.length);

        for(int j = 0; j < n.length;j++)
        {System.out.println(n[j]);}
    }
}