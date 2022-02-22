import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Integer[] data_list = new Integer[10];
        Integer[] data_list2 = {1, 2, 3, 4, 5};
        data_list[0] = 1;

        for (int i = 0; i < data_list.length; i++) {
            System.out.println(data_list[i]);
        }
        System.out.println("------------");

        System.out.println(Arrays.toString(data_list2));//배열의 내용을 출력하려면, Arrays.toString(배열변수) 메서드를 사용하면 됨

        System.out.println("------------");

        ArrayList<Integer> list1 = new ArrayList<Integer>();// int형 데이터를 담을 수 있는 가변 길이의 배열 선언
        list1.add(1);//
        list1.add(2);
        System.out.println(list1.get(0));

        list1.set(0, 6);//특정 인덱스에 해당하는 아이템 변경시.. 0번째에 6을 넣어라 라는 뜻
        System.out.println(list1.get(0));

        list1.remove(0);
        System.out.println(list1.get(0));//remove를 해서 1번쨰에있던 2가 앞으로 땡겨짐.
        System.out.println(list1.size());

        System.out.println("------------");

        //2차원배열
        Integer data_list3[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(data_list3[0][1]);
        System.out.println(data_list3[1][1]);

        //3차원배열
        Integer data_list4[][][] = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};
        System.out.println(data_list4[0][1][1]);//5를 출력
        System.out.println(data_list4[1][1][0]);//10을 출력




    }
}
