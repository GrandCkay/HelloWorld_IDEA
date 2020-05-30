package ua.gfg.helloworldidea;

public class NewArray {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++){
            nums[i] = i * 10;
        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }

        for (int i: nums) {    //for each - (для каждого) в данном цикле нельзя изменять массив(присваивать новые знаичение его елементам
            System.out.println(i);
        }

    }
}
