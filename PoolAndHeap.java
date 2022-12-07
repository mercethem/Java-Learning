public class PoolAndHeap {
    public static void main(String[] args) {
        String str1 = "Java"; //1 slot use in pool
        String str2 = "Java"; //Do not use any slot in the pool because uses same slot mentioned above
        String str3 = new String ("Java"); //   This is different from the mentioned above situations because
                                                    //  this is new object and uses HEAP not POOL!!!
        char c[] ={'H','E','L','L','O'};
        String str4 = new String(c);

        byte b[] = {65,66,67,68,69};
        String str5 = new String(b);
        String str6 = new String(b,2,3); //do not use 1st and 2nd but this array have 3 valuable

        System.out.println(str1 + "\n" +str2 + "\n" +str3 + "\n"+ str4 + "\n"+ str5 +"\n" +str6);

        String Str1 = "Hello";
        String Str2 = "Hello";
        String Str3 = new String("Hello");
        System.out.println(Str1==Str2); //True, because that is in the same pool
        System.out.println(Str1==Str3); //False, because Str1 is in pool but Str3 in Heap because that is new object.


    }
}
