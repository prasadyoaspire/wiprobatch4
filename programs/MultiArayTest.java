class MultiArayTest {

   public static void main(String[] args) {

    int[][] nums = new int[4][];

    nums[0] = new int[3];
    nums[1] = new int[4];
    nums[2] = new int[2];
    nums[3] = new int[2];

   nums[0][0] = 10;
   nums[0][1] = 20;
   nums[0][2] = 30;

   nums[1][0] = 40;
   nums[1][1] = 50;
   nums[1][2] = 60;
   nums[1][3] = 70;

  nums[2][0] = 80;
  nums[2][1] = 10;

  nums[3][0] = 60;
  nums[3][1] = 10;

   for(int i=0;i< nums.length;i++) {

     for(int j=0; j< nums[i].length; j++) {

        System.out.println(nums[i][j]);
     }
   }

 }

}


 
 

   
   