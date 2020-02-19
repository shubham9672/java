class array{
public static void main(String[] a1){
  int[] a2= new int[4];
  //a2={10,20,30,0};array.java:4: error: illegal start of expression
  a2[0]=10;
  a2[1]=20;
  a2[2]=30;
  a2[3]=0;
  System.out.println(a2);
  for(int i : a2){
    System.out.println(i);
  }

}
