

 class ArrayDemo {

  public static void main(String[] args) {

     int[] nums = new int[5]; // array object creation

     nums[0] = 10;
     nums[1] = 20;
     nums[2] = 30;
     nums[3] = 40;
     nums[4] = 50;

    for(int i=0;i< nums.length;i++) {
     System.out.println(nums[i]);
    }

    char[] chs = new char[4];
 
    chs[0] = 'a';
    chs[1] = 'e';
    chs[2] = 'i';
    chs[3] = 'o';

   for(int i=0;i< chs.length; i++) {
	System.out.println(chs[i]);
   }

   String[] names = new String[4];

    names[0] = "sql";
    names[1] = "c++";
    names[2] = "maven";
    names[3] = "git";

   for(int i=0;i<names.length;i++) {
     System.out.println(names[i]);
   }

 }

}