public class random {
    public static void main(String[] args) {
       int[] array = { 1, 1, 2, 2, 4, 6, 6, 4, 4 ,8, 8};
       int maxValue = Integer.MIN_VALUE;
       for(int i = 0;i <array.length;i++){
           maxValue = Math.max(maxValue,array[i]);
       }
       int[] freq = new int[maxValue + 1];
        for (int i = 0; i < array.length; i++) {
            freq[array[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] % 2 != 0){
                System.out.println(freq);
            }
        }
    }
}
